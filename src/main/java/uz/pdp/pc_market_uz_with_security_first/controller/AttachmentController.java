package uz.pdp.pc_market_uz_with_security_first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.pc_market_uz_with_security_first.entity.Attachment;
import uz.pdp.pc_market_uz_with_security_first.entity.AttachmentContent;
import uz.pdp.pc_market_uz_with_security_first.repository.AttachmentContentRepository;
import uz.pdp.pc_market_uz_with_security_first.repository.AttachmentRepository;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;

//@EnableGlobalMethodSecurity(prePostEnabled = true)
@RestController
@RequestMapping("/api/attachment")
public class AttachmentController {

    @Autowired
    AttachmentRepository attachmentRepository;

    @Autowired
    AttachmentContentRepository attachmentContentRepository;

//    @PreAuthorize("hasRole('admin')")
    @PostMapping
    public ResponseEntity<?> uploadToDb(MultipartHttpServletRequest request) throws IOException {
        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());
        if (file != null) {
            String originalFilename = file.getOriginalFilename();
            long size = file.getSize();
            String contentType = file.getContentType();

            Attachment attachment = new Attachment();
            attachment.setContentType(contentType);
            attachment.setFileOriginalName(originalFilename);
            attachment.setSize(size);
            Attachment savedAttachment = attachmentRepository.save(attachment);

            AttachmentContent attachmentContent = new AttachmentContent();
            attachmentContent.setMainContent(file.getBytes());
            attachmentContent.setAttachment(savedAttachment);
            attachmentContentRepository.save(attachmentContent);
            return ResponseEntity.status(201).body(savedAttachment.getId() + "-id lik fayl muvaffaqqiyatli saqlandi !");
        }
        return ResponseEntity.status(409).body("Error while adding !");
    }

//    @PreAuthorize("hasRole('admin')")
    @GetMapping("/{id}")
    public void get(@PathVariable Integer id, HttpServletResponse response) throws IOException {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (optionalAttachment.isPresent()) {
            Attachment attachment = optionalAttachment.get();


            Optional<AttachmentContent> optionalContent = attachmentContentRepository.findByAttachmentId(id);
            if (optionalContent.isPresent()) {
                AttachmentContent attachmentContent = optionalContent.get();

                response.setHeader("Content-Disposition",
                        "attachment; filename=\"" + attachment.getFileOriginalName() + "\"");
                response.setContentType(attachment.getContentType());
                FileCopyUtils.copy(attachmentContent.getMainContent(), response.getOutputStream());
            }
        }
    }
}
