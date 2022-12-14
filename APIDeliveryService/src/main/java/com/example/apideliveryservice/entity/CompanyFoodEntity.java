package com.example.apideliveryservice.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Getter
@Setter
@ToString(exclude = "CompanyFoodHistoryEntityList")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "company_food")
public class CompanyFoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "company_member_id")
    private CompanyMemberEntity companyMemberEntity;
    private String name;
    @Column(nullable = false)
    private BigDecimal price;
    @CreatedDate
    private Timestamp registrationDate;
    @OneToMany(mappedBy = "companyFoodEntity")
    private List<CompanyFoodHistoryEntity> CompanyFoodHistoryEntityList = new ArrayList<>();


    public CompanyFoodEntity(CompanyMemberEntity companyMemberEntity, String name,
        BigDecimal price) {
        this.companyMemberEntity = companyMemberEntity;
        this.name = name;
        this.price = price;
    }
}
