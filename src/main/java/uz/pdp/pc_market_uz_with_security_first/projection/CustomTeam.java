package uz.pdp.pc_market_uz_with_security_first.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pc_market_uz_with_security_first.entity.Attachment;
import uz.pdp.pc_market_uz_with_security_first.entity.Team;

@Projection(types = Team.class)
public interface CustomTeam {

    Integer getId();

    String getName();

    String getOccupation();

    Attachment getAttachment();
}
