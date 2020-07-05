package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    private String category_id;
    private Integer is_on_sale;
    private String name;
    private Integer goods_number;
    private Integer sell_volume;
    private String keywordes;
    private Float retail_price;
    private Float min_retail_price;
    private Float cost_price;
    private Float min_cost_price;
    private String goods_brief;
    private String goods_desc;
    private Integer sort_order;
    private Integer is_index;
    private Integer is_new;
    private String goods_unit;
    private String http_pic_url;
    private String list_pic_url;
    private Long freight_template_id;
    private Integer freight_type;
    private Integer is_delete;

    public Article() {
    }

    public Article(Article a) {
        this.category_id = a.category_id;
        this.is_on_sale = a.is_on_sale;
        this.name = a.name;
        this.goods_number = a.goods_number;
        this.sell_volume = a.sell_volume;
        this.keywordes = a.keywordes;
        this.retail_price = a.retail_price;
        this.min_retail_price = a.min_retail_price;
        this.cost_price = a.cost_price;
        this.min_cost_price = a.min_cost_price;
        this.goods_brief = a.goods_brief;
        this.goods_desc = a.goods_desc;
        this.sort_order = a.sort_order;
        this.is_index = a.is_index;
        this.is_new = a.is_new;
        this.goods_unit = a.goods_unit;
        this.http_pic_url = a.http_pic_url;
        this.list_pic_url = a.list_pic_url;
        this.freight_template_id = a.freight_template_id;
        this.freight_type = a.freight_type;
        this.is_delete = a.is_delete;
    }

    public Article(String category_id, Integer is_on_sale, String name, Integer goods_number, Integer sell_volume,
                   String keywordes, Float retail_price, Float min_retail_price, Float cost_price, Float min_cost_price,
                   String goods_brief, String goods_desc, Integer sort_order, Integer is_index, Integer is_new,
                   String goods_unit, String http_pic_url, String list_pic_url, Long freight_template_id,
                   Integer freight_type, Integer is_delete) {
        this.category_id = category_id;
        this.is_on_sale = is_on_sale;
        this.name = name;
        this.goods_number = goods_number;
        this.sell_volume = sell_volume;
        this.keywordes = keywordes;
        this.retail_price = retail_price;
        this.min_retail_price = min_retail_price;
        this.cost_price = cost_price;
        this.min_cost_price = min_cost_price;
        this.goods_brief = goods_brief;
        this.goods_desc = goods_desc;
        this.sort_order = sort_order;
        this.is_index = is_index;
        this.is_new = is_new;
        this.goods_unit = goods_unit;
        this.http_pic_url = http_pic_url;
        this.list_pic_url = list_pic_url;
        this.freight_template_id = freight_template_id;
        this.freight_type = freight_type;
        this.is_delete = is_delete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public Integer getIs_on_sale() {
        return is_on_sale;
    }

    public void setIs_on_sale(Integer is_on_sale) {
        this.is_on_sale = is_on_sale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGoods_number() {
        return goods_number;
    }

    public void setGoods_number(Integer goods_number) {
        this.goods_number = goods_number;
    }

    public Integer getSell_volume() {
        return sell_volume;
    }

    public void setSell_volume(Integer sell_volume) {
        this.sell_volume = sell_volume;
    }

    public String getKeywordes() {
        return keywordes;
    }

    public void setKeywordes(String keywordes) {
        this.keywordes = keywordes;
    }

    public Float getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(Float retail_price) {
        this.retail_price = retail_price;
    }

    public Float getMin_retail_price() {
        return min_retail_price;
    }

    public void setMin_retail_price(Float min_retail_price) {
        this.min_retail_price = min_retail_price;
    }

    public Float getCost_price() {
        return cost_price;
    }

    public void setCost_price(Float cost_price) {
        this.cost_price = cost_price;
    }

    public Float getMin_cost_price() {
        return min_cost_price;
    }

    public void setMin_cost_price(Float min_cost_price) {
        this.min_cost_price = min_cost_price;
    }

    public String getGoods_brief() {
        return goods_brief;
    }

    public void setGoods_brief(String goods_brief) {
        this.goods_brief = goods_brief;
    }

    public String getGoods_desc() {
        return goods_desc;
    }

    public void setGoods_desc(String goods_desc) {
        this.goods_desc = goods_desc;
    }

    public Integer getSort_order() {
        return sort_order;
    }

    public void setSort_order(Integer sort_order) {
        this.sort_order = sort_order;
    }

    public Integer getIs_index() {
        return is_index;
    }

    public void setIs_index(Integer is_index) {
        this.is_index = is_index;
    }

    public Integer getIs_new() {
        return is_new;
    }

    public void setIs_new(Integer is_new) {
        this.is_new = is_new;
    }

    public String getGoods_unit() {
        return goods_unit;
    }

    public void setGoods_unit(String goods_unit) {
        this.goods_unit = goods_unit;
    }

    public String getHttp_pic_url() {
        return http_pic_url;
    }

    public void setHttp_pic_url(String http_pic_url) {
        this.http_pic_url = http_pic_url;
    }

    public String getList_pic_url() {
        return list_pic_url;
    }

    public void setList_pic_url(String list_pic_url) {
        this.list_pic_url = list_pic_url;
    }

    public Long getFreight_template_id() {
        return freight_template_id;
    }

    public void setFreight_template_id(Long freight_template_id) {
        this.freight_template_id = freight_template_id;
    }

    public Integer getFreight_type() {
        return freight_type;
    }

    public void setFreight_type(Integer freight_type) {
        this.freight_type = freight_type;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
