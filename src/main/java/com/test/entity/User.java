package com.test.entity;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName User
 * @Description TODO
 * @Author zjr
 * @Date 2018/6/8 15:57
 * @Version
 **/
@Entity
@Table(name="t_user")
public class User {

    private Integer id;
    @NotEmpty(message="用户名不能为空")
    private String username;
    @NotEmpty(message="密码不能为空")
    private String password;
    private List<Role> roleList;//一个用户具有多个角色

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @ManyToMany
    @JoinTable(name="t_user_role",joinColumns={@JoinColumn(name="user_id")},inverseJoinColumns={@JoinColumn(name="role_id")})
    public List<Role> getRoleList() {
        return roleList;
    }
    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    @Transient
    public Set<String> getRolesName(){
        List<Role> roles=getRoleList();
        Set<String> set=new HashSet<String>();
        for (Role role : roles) {
            set.add(role.getRolename());
        }
        return set;
    }

}