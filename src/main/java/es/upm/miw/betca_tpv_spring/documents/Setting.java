package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Setting {
    @Id
    @GeneratedValue
    private Long id;

    private Integer autoDelivery;
    private String name;
    private String tel;
    private String provinceName;
    private String cityName;
    private String expAreaName;
    private String address;
    private String discovery_img_height;
    private String discovery_img;
    private Long goods_id;
    private Integer city_id;
    private Integer province_id;
    private Integer district_id;
    private Integer countdown;
    private Integer reset;

    public Setting(Integer autoDelivery, String name, String tel, String provinceName, String cityName, String expAreaName,
                   String address, String discovery_img_height, String discovery_img, Long goods_id, Integer city_id,
                   Integer province_id, Integer district_id, Integer countdown, Integer reset) {
        this.autoDelivery = autoDelivery;
        this.name = name;
        this.tel = tel;
        this.provinceName = provinceName;
        this.cityName = cityName;
        this.expAreaName = expAreaName;
        this.address = address;
        this.discovery_img_height = discovery_img_height;
        this.discovery_img = discovery_img;
        this.goods_id = goods_id;
        this.city_id = city_id;
        this.province_id = province_id;
        this.district_id = district_id;
        this.countdown = countdown;
        this.reset = reset;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAutoDelivery() {
        return autoDelivery;
    }

    public void setAutoDelivery(Integer autoDelivery) {
        this.autoDelivery = autoDelivery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getExpAreaName() {
        return expAreaName;
    }

    public void setExpAreaName(String expAreaName) {
        this.expAreaName = expAreaName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDiscovery_img_height() {
        return discovery_img_height;
    }

    public void setDiscovery_img_height(String discovery_img_height) {
        this.discovery_img_height = discovery_img_height;
    }

    public String getDiscovery_img() {
        return discovery_img;
    }

    public void setDiscovery_img(String discovery_img) {
        this.discovery_img = discovery_img;
    }

    public Long getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public Integer getProvince_id() {
        return province_id;
    }

    public void setProvince_id(Integer province_id) {
        this.province_id = province_id;
    }

    public Integer getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(Integer district_id) {
        this.district_id = district_id;
    }

    public Integer getCountdown() {
        return countdown;
    }

    public void setCountdown(Integer countdown) {
        this.countdown = countdown;
    }

    public Integer getReset() {
        return reset;
    }

    public void setReset(Integer reset) {
        this.reset = reset;
    }
}
