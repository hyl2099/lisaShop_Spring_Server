package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private Long goods_id;
    private Long goods_specification_ids;
    private String goods_sn;
    private Integer goods_number;
    private Float retail_price;
    private Float cost;
    private Float goods_weight;
    private Integer has_change;
    private String goods_name;
    private Integer is_on_sale;
    private Integer is_delete;

    public Product(Long goods_id, Long goods_specification_ids, String goods_sn, Integer goods_number, Float retail_price,
                   Float cost, Float goods_weight, Integer has_change, String goods_name, Integer is_on_sale, Integer is_delete) {
        this.goods_id = goods_id;
        this.goods_specification_ids = goods_specification_ids;
        this.goods_sn = goods_sn;
        this.goods_number = goods_number;
        this.retail_price = retail_price;
        this.cost = cost;
        this.goods_weight = goods_weight;
        this.has_change = has_change;
        this.goods_name = goods_name;
        this.is_on_sale = is_on_sale;
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

    public Long getGoods_specification_ids() {
        return goods_specification_ids;
    }

    public void setGoods_specification_ids(Long goods_specification_ids) {
        this.goods_specification_ids = goods_specification_ids;
    }

    public String getGoods_sn() {
        return goods_sn;
    }

    public void setGoods_sn(String goods_sn) {
        this.goods_sn = goods_sn;
    }

    public Integer getGoods_number() {
        return goods_number;
    }

    public void setGoods_number(Integer goods_number) {
        this.goods_number = goods_number;
    }

    public Float getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(Float retail_price) {
        this.retail_price = retail_price;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Float getGoods_weight() {
        return goods_weight;
    }

    public void setGoods_weight(Float goods_weight) {
        this.goods_weight = goods_weight;
    }

    public Integer getHas_change() {
        return has_change;
    }

    public void setHas_change(Integer has_change) {
        this.has_change = has_change;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public Integer getIs_on_sale() {
        return is_on_sale;
    }

    public void setIs_on_sale(Integer is_on_sale) {
        this.is_on_sale = is_on_sale;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
