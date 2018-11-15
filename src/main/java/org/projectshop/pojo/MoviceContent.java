package org.projectshop.pojo;

import org.projectshop.pojo.BasePojo;

public class MoviceContent extends BasePojo {

    private String moviceId;

    private String userId;

    private String title;

    private String content;

    private Integer good;

    private Integer useless;

    private String url;

    public String getMoviceId() {
        return moviceId;
    }

    public void setMoviceId(String moviceId) {
        this.moviceId = moviceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getGood() {
        return good;
    }

    public void setGood(Integer good) {
        this.good = good;
    }

    public Integer getUseless() {
        return useless;
    }

    public void setUseless(Integer useless) {
        this.useless = useless;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}