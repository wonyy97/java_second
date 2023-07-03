package com.green.java.dao;

import com.green.java.dao.model.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MyConnTest {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();

//        BoardEntity entity = new BoardEntity();
//        BoardUpdDto dto = new BoardUpdDto();
        BoardSelDto dto = new BoardSelDto();

        dto.setPage(5);
        dto.setRowLen(30);
        dto.setStartIdx((dto.getPage()-1) * dto.getRowLen());

        List<BoardVo> list = dao.selBoard(dto);
        for(BoardVo vo  :list) {
            System.out.println(vo);
        }
    }
}
