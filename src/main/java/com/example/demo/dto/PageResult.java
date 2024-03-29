package com.example.demo.dto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author yangjinping
 * @createDate 2024/3/21
 **/

public class PageResult<T> {

    public PageResult() {
    }

    public PageResultDto<T> getPageResult(Page<T> page, Pageable pageable) {
        return this.getPageResult(page, page.getContent(), pageable);
    }

    public PageResultDto<T> getPageResult(Page<T> page, List<T> list, Pageable pageable) {
        return this.getPageResult(page.getTotalElements(), list, pageable);
    }

    public PageResultDto<T> getPageResult(Long total, List<T> list, Pageable pageable) {
        PageResultDto<T> pageResultDto = new PageResultDto();
        pageResultDto.setTotalCount(total);
        pageResultDto.setPageData(list);
        pageResultDto.setPageSize(pageable.getPageSize());
        pageResultDto.setPageIndex(pageable.getPageNumber());
        Integer pageCount = Math.toIntExact(total / (long)pageable.getPageSize() + 1L);
        pageResultDto.setTotalPage(pageCount);
        return pageResultDto;
    }

}
