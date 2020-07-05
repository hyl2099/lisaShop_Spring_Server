package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Date;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private Long id;

    private Long user_id;
    private Long goods_id;
    private Long goods_sn;
    private Long product_id;
    private String goods_name;
    private String goods_aka;
    private Float goods_weight;
    private Float add_price;
    private Float retail_price;
    private Integer number;
    private String goods_specifition_name_value;
    private Long goods_specifition_ids;
    private String checked;
    private String list_pic_url;
    private Long freight_template_id;
    private Integer is_on_sale;
    private Date add_time;
    private Integer is_fast;
    private Integer is_delete;

    public Cart() {
    }

    public Cart(Cart c) {
        this.user_id = c.user_id;
        this.goods_id = c.goods_id;
        this.goods_sn = c.goods_sn;
        this.product_id = c.product_id;
        this.goods_name = c.goods_name;
        this.goods_aka = c.goods_aka;
        this.goods_weight = c.goods_weight;
        this.add_price = c.add_price;
        this.retail_price = c.retail_price;
        this.number = c.number;
        this.goods_specifition_name_value = c.goods_specifition_name_value;
        this.goods_specifition_ids = c.goods_specifition_ids;
        this.checked = c.checked;
        this.list_pic_url = c.list_pic_url;
        this.freight_template_id = c.freight_template_id;
        this.is_on_sale = c.is_on_sale;
        this.add_time = c.add_time;
        this.is_fast = c.is_fast;
        this.is_delete = c.is_delete;
    }

    public Cart(Long user_id, Long goods_id, Long goods_sn, Long product_id, String goods_name, String goods_aka,
                Float goods_weight, Float add_price, Float retail_price, Integer number,
                String goods_specifition_name_value, Long goods_specifition_ids, String checked, String list_pic_url,
                Long freight_template_id, Integer is_on_sale, Date add_time, Integer is_fast, Integer is_delete) {
        this.user_id = user_id;
        this.goods_id = goods_id;
        this.goods_sn = goods_sn;
        this.product_id = product_id;
        this.goods_name = goods_name;
        this.goods_aka = goods_aka;
        this.goods_weight = goods_weight;
        this.add_price = add_price;
        this.retail_price = retail_price;
        this.number = number;
        this.goods_specifition_name_value = goods_specifition_name_value;
        this.goods_specifition_ids = goods_specifition_ids;
        this.checked = checked;
        this.list_pic_url = list_pic_url;
        this.freight_template_id = freight_template_id;
        this.is_on_sale = is_on_sale;
        this.add_time = add_time;
        this.is_fast = is_fast;
        this.is_delete = is_delete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    public Long getGoods_sn() {
        return goods_sn;
    }

    public void setGoods_sn(Long goods_sn) {
        this.goods_sn = goods_sn;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
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

    public Float getGoods_weight() {
        return goods_weight;
    }

    public void setGoods_weight(Float goods_weight) {
        this.goods_weight = goods_weight;
    }

    public Float getAdd_price() {
        return add_price;
    }

    public void setAdd_price(Float add_price) {
        this.add_price = add_price;
    }

    public Float getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(Float retail_price) {
        this.retail_price = retail_price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
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

    public Integer getIs_on_sale() {
        return is_on_sale;
    }

    public void setIs_on_sale(Integer is_on_sale) {
        this.is_on_sale = is_on_sale;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public Integer getIs_fast() {
        return is_fast;
    }

    public void setIs_fast(Integer is_fast) {
        this.is_fast = is_fast;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
