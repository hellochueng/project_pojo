package org.projectshop.pojo;

import com.sun.tools.javac.util.List;
import org.projectshop.pojo.BasePojo;

public class Role extends BasePojo {

    //角色编码
    private String code;

    //角色名字
    private String name;

    //角色说明
    private String remark;

    private List<Permission> permissions;

    @Override
    public String toString() {
        return "Role{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", permissions=" + permissions +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
