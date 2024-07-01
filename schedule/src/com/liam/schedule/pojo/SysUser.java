package com.liam.schedule.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

/*
实体类
1、实体类的类名和表格名应该对应（对应不是一致）
2、实体类名的属性名和表格名应该对应
3、每个属性都必须是私有的
4、每个属性都应该具备getter、setter
5、必须具备无参构造器（显式出来）
6、应该实现序列化接口（缓存、分布式项目数据传递等，可能会将对象序列化）
7、应该重写hashcode和equals方法，toString可写可不写（集合用）

ps:使用lombok帮助生成 getter、setter、全参构造、无参构造、equals、hashcode
使用步骤：
    1、检查是否饭庄lombok插件
    2、检查是否勾选了 enable annotation processing
    3、在实体类中添加注解(需要导入Lombok依赖)
 */
@AllArgsConstructor //添加全参构造
@NoArgsConstructor //添加无参构造
//下面四种方法可以用 @Data方法代替
@Getter //添加get方法
@Setter //添加set方法
@EqualsAndHashCode //重写Equals方法
@ToString //重写ToString方法
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;

   /* @Override
    public String toString() {
        return "SysUser{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }

    public SysUser() {
    }

    public SysUser(Integer uid, String username, String userPwd) {
        this.uid = uid;
        this.username = username;
        this.userPwd = userPwd;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUser sysUser = (SysUser) o;
        return Objects.equals(uid, sysUser.uid) &&
                Objects.equals(username, sysUser.username) &&
                Objects.equals(userPwd, sysUser.userPwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, username, userPwd);
    }*/
}
