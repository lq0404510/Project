package com.abcedu.ssm.base.service.bo;

import java.util.List;

/**
 * @program: Test01
 * @description:
 * @author: Every
 * @create: 2019-11-16 19:58
 **/
public class Page {
    // 当前页数
    private int pageNum;

    // 页大小 rows：返回的最大记录数
    private int pageSize;

    // 偏移量
    private int offset;

    // 总记录数
    private int count;

    // 总页数
    private int coungPage;

    // 分页查询的结果集数据信息(未知类型)
    private List<?> list;


    public Page() {
    }

    public Page(int pageNum, int pageSize, int count) {
        // 当前页数做的判断操作
        if (pageNum < 1) {
            this.pageNum = 1;
        } else {
            this.pageNum = pageNum;
        }
        // 页大小做的判断操作
        if (pageSize < 1) {
            this.pageSize = 5;
        } else {
            this.pageSize = pageSize;
        }
        // 偏移量offset
        this.offset = (this.pageNum - 1) * this.pageSize;
        // 总记录数
        this.count = count;
        //总页数
        this.coungPage = this.count % this.pageSize == 0?
                this.count / this.pageSize : count / this.pageSize + 1;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCoungPage() {
        return coungPage;
    }

    public void setCoungPage(int coungPage) {
        this.coungPage = coungPage;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
