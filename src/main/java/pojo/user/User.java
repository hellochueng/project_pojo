package pojo.user;

import com.sun.tools.javac.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.crypto.hash.Sha512Hash;
import pojo.BasePojo;

import java.util.Date;

public class User extends BasePojo {

    private static final int PASSWORD_HASH_ITERATIONS = 1024;

    //用户名
    private String userName;

    //用户密码
    private String password;

    //密码盐值
    private String passwordSalt;

    //用户昵称
    private String name;

    //手机
    private String moblie;

    //邮箱
    private String email;

    //注册时间
    private Date registerTime;

    //锁定时间
    private Date lockTime;

    //最后登陆时间
    private Date lastLoginTime;

    //登陆错误次数
    private Integer errorCount;

    private List<loginIP> ipList;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public List<loginIP> getIpList() {
        return ipList;
    }

    public void setIpList(List<loginIP> ipList) {
        this.ipList = ipList;
    }

    /**
     * 刷新密码并加盐
     */
    public void flushPassword(String newPassword) {
        this.setPasswordSalt(RandomStringUtils.random(32, true, true));
        String hexPassword = new Sha512Hash(newPassword, this.getPasswordSalt(), PASSWORD_HASH_ITERATIONS).toHex();
        this.setPassword(hexPassword);
    }

    /**
     * 验证密码
     */
    public boolean validatePassword(String password) {
        String hexPassword = new Sha512Hash(password, this.getPasswordSalt(), PASSWORD_HASH_ITERATIONS).toHex();
        return StringUtils.equals(hexPassword, this.getPassword());
    }
}
