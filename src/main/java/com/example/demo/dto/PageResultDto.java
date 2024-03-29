package com.example.demo.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author yangjinping
 * @createDate 2024/3/21
 **/
@Data
public class PageResultDto <T> implements Serializable {

    private Long totalCount;
    private Integer totalPage;
    private Integer pageIndex;
    private Integer pageSize;
    private List<T> pageData;

}
