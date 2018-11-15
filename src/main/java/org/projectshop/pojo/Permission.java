package org.projectshop.pojo;

import org.projectshop.pojo.BasePojo;

public class Permission extends BasePojo {

    //名字
    private String name;

    //编码
    private String code;

    //说明
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Permission{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
