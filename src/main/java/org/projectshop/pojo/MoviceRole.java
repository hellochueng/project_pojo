package org.projectshop.pojo;

import org.projectshop.pojo.BasePojo;

import java.util.Date;

public class MoviceRole extends BasePojo {
    private String name;

    private String profession;

    private String enname;

    private Integer sex;

    private Date bornDate;

    private String bornState;

    private String otherEnName;

    private String family;

    private String summary;

    private String otherChName;

    private String zodiac;

    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getBornState() {
        return bornState;
    }

    public void setBornState(String bornState) {
        this.bornState = bornState;
    }

    public String getOtherEnName() {
        return otherEnName;
    }

    public void setOtherEnName(String otherEnName) {
        this.otherEnName = otherEnName;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getOtherChName() {
        return otherChName;
    }

    public void setOtherChName(String otherChName) {
        this.otherChName = otherChName;
    }

    public String getZodiac() {
        return zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}