package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Long user_id;
    private Long country_id;
    private Long province_id;
    private Long city_id;
    private Long district_id;
    private String address;
    private String mobile;
    private Integer is_default;
    private Integer is_delete;

    public Address() {
    }

    public Address(Address a) {
        this.name = a.name;
        this.user_id = a.user_id;
        this.country_id = a.country_id;
        this.province_id = a.province_id;
        this.city_id = a.city_id;
        this.district_id = a.district_id;
        this.address = a.address;
        this.mobile = a.mobile;
        this.is_default = a.is_default;
        this.is_delete = a.is_delete;
    }

    public Address(String name, Long user_id, Long country_id, Long province_id, Long city_id, Long district_id,
                   String address, String mobile, Integer is_default, Integer is_delete) {
        this.name = name;
        this.user_id = user_id;
        this.country_id = country_id;
        this.province_id = province_id;
        this.city_id = city_id;
        this.district_id = district_id;
        this.address = address;
        this.mobile = mobile;
        this.is_default = is_default;
        this.is_delete = is_delete;
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

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Long country_id) {
        this.country_id = country_id;
    }

    public Long getProvince_id() {
        return province_id;
    }

    public void setProvince_id(Long province_id) {
        this.province_id = province_id;
    }

    public Long getCity_id() {
        return city_id;
    }

    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }

    public Long getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(Long district_id) {
        this.district_id = district_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getIs_default() {
        return is_default;
    }

    public void setIs_default(Integer is_default) {
        this.is_default = is_default;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
