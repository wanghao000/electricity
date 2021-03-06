package cn.hz.fcloud.entity;

import java.util.Date;

public class CompanyInfos {
    private Long id;

    private String name;

    private Integer province;

    private String pName;

    private Integer city;

    private String cName;

    private Integer district;

    private String dName;

    private Long providerId;

    private String proName;

    private String picture;

    private String address;

    private String remark;

    private Integer createUser;

    private Date createTime;

    private Integer isDelete;

    private Integer eqsCount;

    private String code;

    private String contact;

    private String contactPhone;

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

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getEqsCount() {
        return eqsCount;
    }

    public void setEqsCount(Integer eqsCount) {
        this.eqsCount = eqsCount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @Override
    public String toString() {
        return "CompanyInfos{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", province=" + province +
                ", pName='" + pName + '\'' +
                ", city=" + city +
                ", cName='" + cName + '\'' +
                ", district=" + district +
                ", dName='" + dName + '\'' +
                ", providerId=" + providerId +
                ", proName='" + proName + '\'' +
                ", picture='" + picture + '\'' +
                ", address='" + address + '\'' +
                ", remark='" + remark + '\'' +
                ", createUser=" + createUser +
                ", createTime=" + createTime +
                ", isDelete=" + isDelete +
                ", eqsCount=" + eqsCount +
                ", code='" + code + '\'' +
                ", contact='" + contact + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                '}';
    }
}
