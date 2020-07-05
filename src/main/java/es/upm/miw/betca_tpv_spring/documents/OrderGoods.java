package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class OrderGoods {
    @Id
    @GeneratedValue
    private Long id;

    private Long order_id;
    private Long goods_id;
    private String goods_name;
    private String goods_aka;
    private Long product_id;
    private Integer number;
    private Float retail_price;
    private String goods_specifition_name_value;
    private Long goods_specifition_ids;
    private String list_pic_url;
    private Long user_id;
    private Integer is_delete;

    public OrderGoods(Long order_id, Long goods_id, String goods_name, String goods_aka, Long product_id, Integer number,
                      Float retail_price, String goods_specifition_name_value, Long goods_specifition_ids,
                      String list_pic_url, Long user_id, Integer is_delete) {
        this.order_id = order_id;
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_aka = goods_aka;
        this.product_id = product_id;
        this.number = number;
        this.retail_price = retail_price;
        this.goods_specifition_name_value = goods_specifition_name_value;
        this.goods_specifition_ids = goods_specifition_ids;
        this.list_pic_url = list_pic_url;
        this.user_id = user_id;
        this.is_delete = is_delete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_aka() {
        return goods_aka;
    }

    public void setGoods_aka(String goods_aka) {
        this.goods_aka = goods_aka;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(Float retail_price) {
        this.retail_price = retail_price;
    }

    public String getGoods_specifition_name_value() {
        return goods_specifition_name_value;
    }

    public void setGoods_specifition_name_value(String goods_specifition_name_value) {
        this.goods_specifition_name_value = goods_specifition_name_value;
    }

    public Long getGoods_specifition_ids() {
        return goods_specifition_ids;
    }

    public void setGoods_specifition_ids(Long goods_specifition_ids) {
        this.goods_specifition_ids = goods_specifition_ids;
    }

    public String getList_pic_url() {
        return list_pic_url;
    }

    public void setList_pic_url(String list_pic_url) {
        this.list_pic_url = list_pic_url;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
