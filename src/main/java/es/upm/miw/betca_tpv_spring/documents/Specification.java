package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Specification {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Integer sort_order;
    private String memo;

    public Specification(String name, Integer sort_order, String memo) {
        this.name = name;
        this.sort_order = sort_order;
        this.memo = memo;
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

    public Integer getSort_order() {
        return sort_order;
    }

    public void setSort_order(Integer sort_order) {
        this.sort_order = sort_order;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
