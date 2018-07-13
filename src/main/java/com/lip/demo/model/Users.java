package com.lip.demo.model;
// Generated 2016-8-9 3:46:05 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Created with IntelliJ IDEA.不单是hibernate的注解，很多其他的注解，需要获取属性或者对象的，都是在get方法上声明的。
 * 因为get方法显然的就是外部获取类内属性的方法，例如我要在数据库里面生成这个entity类对应的表，接口类要知道你有什么属性，这就是从get方法获取的，所以我们可以注解在get方法上，告诉他这个属性是唯一的，长度是多少等等。
 * 再者可以扯扯Spring的依赖注入，也会从get方法去注入，因为我们要用一个Dao，获取他理想接口就是get方法。当然当然，我们也可以直接在定义对象的时候，直接注入，但这在安全性上面是有问题的，Spring不推荐这么做
 *
 * @author: 徐立
 * @Date: 2018-07-13
 * @Time: 10:14
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "users")
public class Users implements java.io.Serializable {
    private static final long serialVersionUID = 8685135709993762620L;
    private int id;
    private String phoneNumber;
    private String name;
    private String email;
    private Date createTime;

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Column(name = "name", length = 25)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "email", length = 25)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time", length = 19)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", phoneNumber='" + phoneNumber + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + ", createTime=" + createTime + '}';
    }
}
