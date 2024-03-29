package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author yangjinping
 * @createDate 2024/3/27
 **/
@Entity
@Table(name = "tb_role_menu")
@Data
public class RoleMenu extends BaseModel{

    @Column
    private Integer menuId;
    @Column
    private Integer roleId;

}
