package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Keywords {
    @Id
    @GeneratedValue
    private Long id;

    private String keyword;
    private Integer is_hot;
    private Integer is_default;
    private Integer is_show;
    private Integer sort_order;
    private String scheme_url;
    private String type;

    public Keywords(String keyword, Integer is_hot, Integer is_default, Integer is_show, Integer sort_order, String scheme_url, String type) {
        this.keyword = keyword;
        this.is_hot = is_hot;
        this.is_default = is_default;
        this.is_show = is_show;
        this.sort_order = sort_order;
        this.scheme_url = scheme_url;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getIs_hot() {
        return is_hot;
    }

    public void setIs_hot(Integer is_hot) {
        this.is_hot = is_hot;
    }

    public Integer getIs_default() {
        return is_default;
    }

    public void setIs_default(Integer is_default) {
        this.is_default = is_default;
    }

    public Integer getIs_show() {
        return is_show;
    }

    public void setIs_show(Integer is_show) {
        this.is_show = is_show;
    }

    public Integer getSort_order() {
        return sort_order;
    }

    public void setSort_order(Integer sort_order) {
        this.sort_order = sort_order;
    }

    public String getScheme_url() {
        return scheme_url;
    }

    public void setScheme_url(String scheme_url) {
        this.scheme_url = scheme_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
