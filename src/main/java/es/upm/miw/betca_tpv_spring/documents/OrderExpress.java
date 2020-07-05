package es.upm.miw.betca_tpv_spring.documents;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Date;

@Entity
public class OrderExpress {
    @Id
    @GeneratedValue
    private Long id;

    private Long order_id;
    private Long shipper_id;
    private String shipper_name;
    private String shipper_code;
    private String logistic_code;
    private String trace;
    private Integer is_finish;
    private Integer request_count;
    private Date request_time;
    private Date add_time;
    private Date update_time;
    private Integer express_type;
    private Integer region_code;

    public OrderExpress(Long order_id, Long shipper_id, String shipper_name, String shipper_code, String logistic_code,
                        String trace, Integer is_finish, Integer request_count, Date request_time, Date add_time,
                        Date update_time, Integer express_type, Integer region_code) {
        this.order_id = order_id;
        this.shipper_id = shipper_id;
        this.shipper_name = shipper_name;
        this.shipper_code = shipper_code;
        this.logistic_code = logistic_code;
        this.trace = trace;
        this.is_finish = is_finish;
        this.request_count = request_count;
        this.request_time = request_time;
        this.add_time = add_time;
        this.update_time = update_time;
        this.express_type = express_type;
        this.region_code = region_code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getShipper_id() {
        return shipper_id;
    }

    public void setShipper_id(Long shipper_id) {
        this.shipper_id = shipper_id;
    }

    public String getShipper_name() {
        return shipper_name;
    }

    public void setShipper_name(String shipper_name) {
        this.shipper_name = shipper_name;
    }

    public String getShipper_code() {
        return shipper_code;
    }

    public void setShipper_code(String shipper_code) {
        this.shipper_code = shipper_code;
    }

    public String getLogistic_code() {
        return logistic_code;
    }

    public void setLogistic_code(String logistic_code) {
        this.logistic_code = logistic_code;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    public Integer getIs_finish() {
        return is_finish;
    }

    public void setIs_finish(Integer is_finish) {
        this.is_finish = is_finish;
    }

    public Integer getRequest_count() {
        return request_count;
    }

    public void setRequest_count(Integer request_count) {
        this.request_count = request_count;
    }

    public Date getRequest_time() {
        return request_time;
    }

    public void setRequest_time(Date request_time) {
        this.request_time = request_time;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Integer getExpress_type() {
        return express_type;
    }

    public void setExpress_type(Integer express_type) {
        this.express_type = express_type;
    }

    public Integer getRegion_code() {
        return region_code;
    }

    public void setRegion_code(Integer region_code) {
        this.region_code = region_code;
    }
}
