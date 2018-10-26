package pojo;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BasePojo {

    //实体id
    private String id;
    //实体创建时间
    private String createtime;
    //实体修改啊时间
    private String modifiedTime;

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
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
