package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
@Entity
public class Shipper {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String code;
    private Integer sort_order;
    private String monthCode;
    private String costomerName;
    private Integer enabled;

    public Shipper(String name, String code, Integer sort_order, String monthCode, String costomerName, Integer enabled) {
        this.name = name;
        this.code = code;
        this.sort_order = sort_order;
        this.monthCode = monthCode;
        this.costomerName = costomerName;
        this.enabled = enabled;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getSort_order() {
        return sort_order;
    }

    public void setSort_order(Integer sort_order) {
        this.sort_order = sort_order;
    }

    public String getMonthCode() {
        return monthCode;
    }

    public void setMonthCode(String monthCode) {
        this.monthCode = monthCode;
    }

    public String getCostomerName() {
        return costomerName;
    }

    public void setCostomerName(String costomerName) {
        this.costomerName = costomerName;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
