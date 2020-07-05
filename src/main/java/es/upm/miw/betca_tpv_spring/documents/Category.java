package es.upm.miw.betca_tpv_spring.documents;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String keyWords;
    private String front_desc;
    private Long parent_id;
    private Integer sort_order;
    private Integer show_index;
    private Integer is_show;
    private String icon_url;
    private String image_url;
    private String level;
    private String front_name;
    private Integer p_height;
    private Integer is_category;
    private Integer is_channel;

    public Category() {
    }

    public Category(Category c) {
        this.name = c.name;
        this.keyWords = c.keyWords;
        this.front_desc = c.front_desc;
        this.parent_id = c.parent_id;
        this.sort_order = c.sort_order;
        this.show_index = c.show_index;
        this.is_show = c.is_show;
        this.icon_url = c.icon_url;
        this.image_url = c.image_url;
        this.level = c.level;
        this.front_name = c.front_name;
        this.p_height = c.p_height;
        this.is_category = c.is_category;
        this.is_channel = c.is_channel;
    }

    public Category(String name, String keyWords, String front_desc, Long parent_id, Integer sort_order,
                    Integer show_index, Integer is_show, String icon_url, String image_url, String level,
                    String front_name, Integer p_height, Integer is_category, Integer is_channel) {
        this.name = name;
        this.keyWords = keyWords;
        this.front_desc = front_desc;
        this.parent_id = parent_id;
        this.sort_order = sort_order;
        this.show_index = show_index;
        this.is_show = is_show;
        this.icon_url = icon_url;
        this.image_url = image_url;
        this.level = level;
        this.front_name = front_name;
        this.p_height = p_height;
        this.is_category = is_category;
        this.is_channel = is_channel;
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

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getFront_desc() {
        return front_desc;
    }

    public void setFront_desc(String front_desc) {
        this.front_desc = front_desc;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public Integer getSort_order() {
        return sort_order;
    }

    public void setSort_order(Integer sort_order) {
        this.sort_order = sort_order;
    }

    public Integer getShow_index() {
        return show_index;
    }

    public void setShow_index(Integer show_index) {
        this.show_index = show_index;
    }

    public Integer getIs_show() {
        return is_show;
    }

    public void setIs_show(Integer is_show) {
        this.is_show = is_show;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getFront_name() {
        return front_name;
    }

    public void setFront_name(String front_name) {
        this.front_name = front_name;
    }

    public Integer getP_height() {
        return p_height;
    }

    public void setP_height(Integer p_height) {
        this.p_height = p_height;
    }

    public Integer getIs_category() {
        return is_category;
    }

    public void setIs_category(Integer is_category) {
        this.is_category = is_category;
    }

    public Integer getIs_channel() {
        return is_channel;
    }

    public void setIs_channel(Integer is_channel) {
        this.is_channel = is_channel;
    }
}