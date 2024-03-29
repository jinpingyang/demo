package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author yangjinping
 * @createDate 2024/3/27
 **/
@Entity
@Table(name = "tb_menu")
@Data
public class Menu extends BaseModel {

    @Column
    private Integer parentId;
    @Column
    private String text;
    @Column
    private String url;
    @Column
    private Integer seq;

}
