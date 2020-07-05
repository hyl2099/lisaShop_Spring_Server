package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Date;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private String order_sn;
    private Long user_id;
    private Integer order_status;
    private Integer offline_pay;
    private Integer shipping_status;
    private Integer print_status;
    private Integer pay_status;
    private String consignee;
    private Integer country;
    private Integer province;
    private Integer city;
    private Integer district;
    private String address;
    private String print_info;
    private String mobile;
    private String postscript;
    private String admin_memo;
    private Float shipping_fee;
    private String pay_name;
    private String change_price;
    private String actual_price;
    private String order_price;
    private Date add_time;
    private Date pay_time;
    private Date shipping_time;
    private Date comfirm_time;
    private Date dealdone_time;
    private Float freight_price;
    private Float express_value;
    private String remark;
    private Integer order_type;
    private Integer is_delete;

    public Order(String order_sn, Long user_id, Integer order_status, Integer offline_pay, Integer shipping_status,
                 Integer print_status, Integer pay_status, String consignee, Integer country, Integer province,
                 Integer city, Integer district, String address, String print_info, String mobile, String postscript,
                 String admin_memo, Float shipping_fee, String pay_name, String change_price, String actual_price,
                 String order_price, Date add_time, Date pay_time, Date shipping_time, Date comfirm_time,
                 Date dealdone_time, Float freight_price, Float express_value, String remark, Integer order_type,
                 Integer is_delete) {
        this.order_sn = order_sn;
        this.user_id = user_id;
        this.order_status = order_status;
        this.offline_pay = offline_pay;
        this.shipping_status = shipping_status;
        this.print_status = print_status;
        this.pay_status = pay_status;
        this.consignee = consignee;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.address = address;
        this.print_info = print_info;
        this.mobile = mobile;
        this.postscript = postscript;
        this.admin_memo = admin_memo;
        this.shipping_fee = shipping_fee;
        this.pay_name = pay_name;
        this.change_price = change_price;
        this.actual_price = actual_price;
        this.order_price = order_price;
        this.add_time = add_time;
        this.pay_time = pay_time;
        this.shipping_time = shipping_time;
        this.comfirm_time = comfirm_time;
        this.dealdone_time = dealdone_time;
        this.freight_price = freight_price;
        this.express_value = express_value;
        this.remark = remark;
        this.order_type = order_type;
        this.is_delete = is_delete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public Integer getOffline_pay() {
        return offline_pay;
    }

    public void setOffline_pay(Integer offline_pay) {
        this.offline_pay = offline_pay;
    }

    public Integer getShipping_status() {
        return shipping_status;
    }

    public void setShipping_status(Integer shipping_status) {
        this.shipping_status = shipping_status;
    }

    public Integer getPrint_status() {
        return print_status;
    }

    public void setPrint_status(Integer print_status) {
        this.print_status = print_status;
    }

    public Integer getPay_status() {
        return pay_status;
    }

    public void setPay_status(Integer pay_status) {
        this.pay_status = pay_status;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrint_info() {
        return print_info;
    }

    public void setPrint_info(String print_info) {
        this.print_info = print_info;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript;
    }

    public String getAdmin_memo() {
        return admin_memo;
    }

    public void setAdmin_memo(String admin_memo) {
        this.admin_memo = admin_memo;
    }

    public Float getShipping_fee() {
        return shipping_fee;
    }

    public void setShipping_fee(Float shipping_fee) {
        this.shipping_fee = shipping_fee;
    }

    public String getPay_name() {
        return pay_name;
    }

    public void setPay_name(String pay_name) {
        this.pay_name = pay_name;
    }

    public String getChange_price() {
        return change_price;
    }

    public void setChange_price(String change_price) {
        this.change_price = change_price;
    }

    public String getActual_price() {
        return actual_price;
    }

    public void setActual_price(String actual_price) {
        this.actual_price = actual_price;
    }

    public String getOrder_price() {
        return order_price;
    }

    public void setOrder_price(String order_price) {
        this.order_price = order_price;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public Date getPay_time() {
        return pay_time;
    }

    public void setPay_time(Date pay_time) {
        this.pay_time = pay_time;
    }

    public Date getShipping_time() {
        return shipping_time;
    }

    public void setShipping_time(Date shipping_time) {
        this.shipping_time = shipping_time;
    }

    public Date getComfirm_time() {
        return comfirm_time;
    }

    public void setComfirm_time(Date comfirm_time) {
        this.comfirm_time = comfirm_time;
    }

    public Date getDealdone_time() {
        return dealdone_time;
    }

    public void setDealdone_time(Date dealdone_time) {
        this.dealdone_time = dealdone_time;
    }

    public Float getFreight_price() {
        return freight_price;
    }

    public void setFreight_price(Float freight_price) {
        this.freight_price = freight_price;
    }

    public Float getExpress_value() {
        return express_value;
    }

    public void setExpress_value(Float express_value) {
        this.express_value = express_value;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getOrder_type() {
        return order_type;
    }

    public void setOrder_type(Integer order_type) {
        this.order_type = order_type;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
