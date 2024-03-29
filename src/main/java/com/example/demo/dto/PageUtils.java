package com.example.demo.dto;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * @author yangjinping
 * @createDate 2024/3/21
 **/

public class PageUtils {

    private static final int QUERY_PAGE_START = 1;
    private static final int QUERY_ROW = 10;
    private static final int QUERY_ROW_MIN = 1;
    private static final int QUERY_ROW_MAX = 1000;

    public PageUtils() {
    }

    public static PageRequest initPageRequest(Integer pageIndex, Integer pageRows, Boolean sortStatus, String sortKey, String defaultKey) {
        int index;
        if (pageIndex != null && pageIndex >= 1) {
            index = pageIndex - 1;
        } else {
            index = 0;
        }

        int rows;
        if (null != pageRows && pageRows >= 1 && pageRows <= 1000) {
            rows = pageRows;
        } else {
            rows = 10;
        }

        if (sortStatus == null && defaultKey == null) {
            return PageRequest.of(index, rows);
        } else if (sortStatus != null && sortKey != null) {
            Sort.Direction direction = sortStatus ? Sort.Direction.ASC : Sort.Direction.DESC;
            return PageRequest.of(index, rows, direction, new String[]{sortKey});
        } else {
            return PageRequest.of(index, rows, Sort.Direction.ASC, new String[]{defaultKey});
        }
    }

    public static PageRequest initPageRequest(Integer pageIndex, Integer pageRows, List<Sort.Order> orders) {
        int index;
        if (pageIndex != null && pageIndex >= 1) {
            index = pageIndex - 1;
        } else {
            index = 0;
        }

        int rows;
        if (null != pageRows && pageRows >= 1 && pageRows <= 1000) {
            rows = pageRows;
        } else {
            rows = 10;
        }

        return PageRequest.of(index, rows, Sort.by(orders));
    }
}
