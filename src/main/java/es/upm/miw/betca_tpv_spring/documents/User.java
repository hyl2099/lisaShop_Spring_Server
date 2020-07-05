package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String nickname;
    private String name;
    private String username;
    private String password;
    private Integer gender;
    private Date birthday;
    private Date register_time;
    private Date last_login_time;
    private String last_login_ip;
    private String mobile;
    private String register_ip;
    private String avatar;
    private String wexin_openid;
    private String name_mobile;
    private String country;
    private String province;
    private String city;
    private String email;
    private String address;
    private Role[] roles;

    public User(String nickname, String name, String username, String password, Integer gender, Date birthday,
                Date register_time, Date last_login_time, String last_login_ip, String mobile, String register_ip,
                String avatar, String wexin_openid, String name_mobile, String country, String province, String city,
                String email, String address, Role[] roles) {
        this.nickname = nickname;
        this.name = name;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.birthday = birthday;
        this.register_time = register_time;
        this.last_login_time = last_login_time;
        this.last_login_ip = last_login_ip;
        this.mobile = mobile;
        this.register_ip = register_ip;
        this.avatar = avatar;
        this.wexin_openid = wexin_openid;
        this.name_mobile = name_mobile;
        this.country = country;
        this.province = province;
        this.city = city;
        this.email = email;
        this.address = address;
        this.roles = roles;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getRegister_time() {
        return register_time;
    }

    public void setRegister_time(Date register_time) {
        this.register_time = register_time;
    }

    public Date getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    public String getLast_login_ip() {
        return last_login_ip;
    }

    public void setLast_login_ip(String last_login_ip) {
        this.last_login_ip = last_login_ip;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRegister_ip() {
        return register_ip;
    }

    public void setRegister_ip(String register_ip) {
        this.register_ip = register_ip;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getWexin_openid() {
        return wexin_openid;
    }

    public void setWexin_openid(String wexin_openid) {
        this.wexin_openid = wexin_openid;
    }

    public String getName_mobile() {
        return name_mobile;
    }

    public void setName_mobile(String name_mobile) {
        this.name_mobile = name_mobile;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }
}
