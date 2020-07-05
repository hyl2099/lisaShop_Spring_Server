package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Date;

@Entity
public class Ad {
    @Id
    @GeneratedValue
    private Long id;

    private Integer link_type;
    private String link;
    private Long goods_id;
    private String image_url;
    private Date end_time;
    private Integer enabled;
    private Integer sort_order;
    private Integer is_delete;

    public Ad() {
    }

    public Ad(Ad ad) {
        this.link_type = ad.link_type;
        this.link = ad.link;
        this.goods_id = ad.goods_id;
        this.image_url = ad.image_url;
        this.end_time = ad.end_time;
        this.enabled = ad.enabled;
        this.sort_order = ad.sort_order;
        this.is_delete = ad.is_delete;
    }

    public Ad(Integer link_type, String link, Long goods_id, String image_url, Date end_time, Integer enabled, Integer sort_order, Integer is_delete) {
        this.link_type = link_type;
        this.link = link;
        this.goods_id = goods_id;
        this.image_url = image_url;
        this.end_time = end_time;
        this.enabled = enabled;
        this.sort_order = sort_order;
        this.is_delete = is_delete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLink_type() {
        return link_type;
    }

    public void setLink_type(Integer link_type) {
        this.link_type = link_type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Long getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
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
