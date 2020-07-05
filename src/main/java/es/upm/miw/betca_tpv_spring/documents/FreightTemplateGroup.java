package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class FreightTemplateGroup {
    @Id
    @GeneratedValue
    private Long id;

    private Long template_id;
    private Integer is_default;
    private Integer area;
    private Integer start;
    private Float start_fee;
    private Integer add;
    private Float add_fee;
    private Float free_by_number;
    private Float free_by_money;
    private Integer is_delete;

    public FreightTemplateGroup(Long template_id, Integer is_default, Integer area, Integer start, Float start_fee,
                                Integer add, Float add_fee, Float free_by_number, Float free_by_money, Integer is_delete) {
        this.template_id = template_id;
        this.is_default = is_default;
        this.area = area;
        this.start = start;
        this.start_fee = start_fee;
        this.add = add;
        this.add_fee = add_fee;
        this.free_by_number = free_by_number;
        this.free_by_money = free_by_money;
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

    public Integer getIs_default() {
        return is_default;
    }

    public void setIs_default(Integer is_default) {
        this.is_default = is_default;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Float getStart_fee() {
        return start_fee;
    }

    public void setStart_fee(Float start_fee) {
        this.start_fee = start_fee;
    }

    public Integer getAdd() {
        return add;
    }

    public void setAdd(Integer add) {
        this.add = add;
    }

    public Float getAdd_fee() {
        return add_fee;
    }

    public void setAdd_fee(Float add_fee) {
        this.add_fee = add_fee;
    }

    public Float getFree_by_number() {
        return free_by_number;
    }

    public void setFree_by_number(Float free_by_number) {
        this.free_by_number = free_by_number;
    }

    public Float getFree_by_money() {
        return free_by_money;
    }

    public void setFree_by_money(Float free_by_money) {
        this.free_by_money = free_by_money;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
