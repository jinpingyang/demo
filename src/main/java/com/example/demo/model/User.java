package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yangjinping
 * @createDate 2024/3/21
 **/
@Entity
@Table(name = "tb_user")
@Data
public class User extends BaseModel {

    private String no;
    @Column
    private String name;
    @Column
    private String passWord;
    @Column
    private Long status;
    @Column
    private String email;
    @Column
    private Date lastTime;


}
