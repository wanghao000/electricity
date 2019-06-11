package cn.hz.fcloud.entity;

import java.util.Date;

/**
 * @ClassName Alarm
 * @Description {TODO}
 * @Author wh
 * #Date 2019-06-10 13:52
 */
public class Alarm {

    private Long id;
    private String code;
    private String info;
    private Integer type;
    private Date createTime;
    private String name;
    private Integer isOnline;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", info='" + info + '\'' +
                ", type=" + type +
                ", createTime=" + createTime +
                ", name='" + name + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }
}
