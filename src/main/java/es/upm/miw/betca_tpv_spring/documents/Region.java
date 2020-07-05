package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;

    private Integer parent_id;
    private String Name;
    private Integer type;
    private Integer agency_id;
    private Integer area;
    private Integer area_code;
    private Integer far_area;

    public Region(Integer parent_id, String name, Integer type, Integer agency_id, Integer area, Integer area_code, Integer far_area) {
        this.parent_id = parent_id;
        Name = name;
        this.type = type;
        this.agency_id = agency_id;
        this.area = area;
        this.area_code = area_code;
        this.far_area = far_area;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(Integer agency_id) {
        this.agency_id = agency_id;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getArea_code() {
        return area_code;
    }

    public void setArea_code(Integer area_code) {
        this.area_code = area_code;
    }

    public Integer getFar_area() {
        return far_area;
    }

    public void setFar_area(Integer far_area) {
        this.far_area = far_area;
    }
}
