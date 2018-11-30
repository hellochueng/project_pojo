package org.projectshop.pojo;


import java.io.Serializable;

public class BasePojo implements Serializable{

    //实体id
    private String id;

    //实体创建时间
    private String createDate;

    //实体修改啊时间
    private String modifiedDate;

    private boolean valid = true;

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatetime() {
        return createDate;
    }

    public void setCreatetime(String createtime) {
        this.createDate = createtime;
    }

    public String getModifiedTime() {
        return modifiedDate;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedDate = modifiedTime;
    }
}
