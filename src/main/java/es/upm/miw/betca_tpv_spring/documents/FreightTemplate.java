package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class FreightTemplate {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private float package_price;
    private Integer freight_type;
    private Integer is_delete;

    public FreightTemplate(String name, float package_price, Integer freight_type, Integer is_delete) {
        this.name = name;
        this.package_price = package_price;
        this.freight_type = freight_type;
        this.is_delete = is_delete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPackage_price() {
        return package_price;
    }

    public void setPackage_price(float package_price) {
        this.package_price = package_price;
    }

    public Integer getFreight_type() {
        return freight_type;
    }

    public void setFreight_type(Integer freight_type) {
        this.freight_type = freight_type;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
