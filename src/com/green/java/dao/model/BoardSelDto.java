package com.green.java.dao.model;

public class BoardSelDto {
    private int iboard;
    private int startIdx;
    private int page;
    private int rowLen;

    public int getIboard() {
        return iboard;
    }

    public void setIboard(int iboard) {
        this.iboard = iboard;
    }

    public int getStartIdx() {
        return startIdx;
    }

    public void setStartIdx(int startIdx) {
        this.startIdx = startIdx;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRowLen() {
        return rowLen;
    }

    public void setRowLen(int rowLen) {
        this.rowLen = rowLen;
    }
}
