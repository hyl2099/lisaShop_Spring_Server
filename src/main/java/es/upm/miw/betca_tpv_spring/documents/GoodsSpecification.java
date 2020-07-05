package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class GoodsSpecification {
    @Id
    @GeneratedValue
    private Long id;

    private Long goods_id;
    private Long specification_id;
    private String value;
    private String pic_url;
    private Integer is_delete;

    public GoodsSpecification(Long goods_id, Long specification_id, String value, String pic_url, Integer is_delete) {
        this.goods_id = goods_id;
        this.specification_id = specification_id;
        this.value = value;
        this.pic_url = pic_url;
        this.is_delete = is_delete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    public Long getSpecification_id() {
        return specification_id;
    }

    public void setSpecification_id(Long specification_id) {
        this.specification_id = specification_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
