package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class FreightTemplateDetail {
    @Id
    @GeneratedValue
    private Long id;

    private Long template_id;
    private Long group_id;
    private Integer area;
    private Integer is_delete;

    public FreightTemplateDetail(Long template_id, Long group_id, Integer area, Integer is_delete) {
        this.template_id = template_id;
        this.group_id = group_id;
        this.area = area;
        this.is_delete = is_delete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(Long template_id) {
        this.template_id = template_id;
    }

    public Long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Long group_id) {
        this.group_id = group_id;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
