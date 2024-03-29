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
@Table(name = "tb_role")
@Data
public class Role extends BaseModel {

    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String status;



}
