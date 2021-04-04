package uz.pdp.pc_market_uz_with_security_first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double sum;

    @OneToOne
    private User user;

    @OneToMany
    private List<OutputProduct> outputProductList;
}
