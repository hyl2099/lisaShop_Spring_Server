package es.upm.miw.betca_tpv_spring.documents;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class GoodsGallery {

    @Id
    @GeneratedValue
    private Long id;

    private Long goods_id;
    private String img_url;
    private String img_desc;
    private Integer sort_order;
    private Integer is_delete;

    public GoodsGallery() {
    }

    public GoodsGallery(GoodsGallery g) {
        this.goods_id = g.goods_id;
        this.img_url = g.img_url;
        this.img_desc = g.img_desc;
        this.sort_order = g.sort_order;
        this.is_delete = g.is_delete;
    }

    public GoodsGallery(Long goods_id, String img_url, String img_desc, Integer sort_order, Integer is_delete) {
        this.goods_id = goods_id;
        this.img_url = img_url;
        this.img_desc = img_desc;
        this.sort_order = sort_order;
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

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getImg_desc() {
        return img_desc;
    }

    public void setImg_desc(String img_desc) {
        this.img_desc = img_desc;
    }

    public Integer getSort_order() {
        return sort_order;
    }

    public void setSort_order(Integer sort_order) {
        this.sort_order = sort_order;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
