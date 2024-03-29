package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author yangjinping
 * @createDate 2024/3/27
 **/
@Entity
@Table(name = "tb_role_menu")
@Data
public class RoleUser extends BaseModel{

    private Integer userId;
    private Integer roleId;
}
