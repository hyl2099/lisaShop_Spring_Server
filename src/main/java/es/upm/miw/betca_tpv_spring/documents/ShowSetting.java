package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class ShowSetting {
    @Id
    @GeneratedValue
    private Long id;

    private Integer banner;
    private Integer channel;
    private Integer index_banner_img;
    private Integer notice;

    public ShowSetting(Integer banner, Integer channel, Integer index_banner_img, Integer notice) {
        this.banner = banner;
        this.channel = channel;
        this.index_banner_img = index_banner_img;
        this.notice = notice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBanner() {
        return banner;
    }

    public void setBanner(Integer banner) {
        this.banner = banner;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getIndex_banner_img() {
        return index_banner_img;
    }

    public void setIndex_banner_img(Integer index_banner_img) {
        this.index_banner_img = index_banner_img;
    }

    public Integer getNotice() {
        return notice;
    }

    public void setNotice(Integer notice) {
        this.notice = notice;
    }
}
