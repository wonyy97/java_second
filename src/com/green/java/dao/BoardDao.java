package com.green.java.dao;

import com.green.java.dao.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private MyConnection mc;

    public BoardDao() {
        mc = new MyConnection();
    }

    public int insBoard(BoardEntity entity) {

        String sql =" INSERT INTO t_board\n" +
                    " SET title = ?" +
                    " , ctnt = ?" +
                    " , iuser = ?";

        System.out.println(sql);
        int result = 0;
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnt());
            ps.setInt(3, entity.getIuser());
            result = ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if(ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if(con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return result;
    }

    public List<BoardVo> selBoard(BoardSelDto dto) {
        List<BoardVo> list = new ArrayList<>();

        String sql ="SELECT a.iboard, a.title, a.created_at createdAt, b.nm writer, b.main_pic writerMainPic\n" +
                "        FROM t_board a\n" +
                "        INNER JOIN t_user b\n" +
                "        ON a.iuser = b.iuser\n" +
                "        ORDER BY iboard DESC\n" +
                "        LIMIT ?,?";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dto.getStartIdx());
            ps.setInt(2, dto.getRowLen());
            rs = ps.executeQuery();

            while (rs.next()) {
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String createdAt = rs.getString("createdAt");
                String writer = rs.getString("writer");
                String writerMainPic = rs.getString("writerMainPic");

                BoardVo vo = new BoardVo(iboard, title, createdAt, writer, writerMainPic);
                list.add(vo);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return list;
    }


    public BoardDetailVo selBoardById(BoardSelDto dto){


        String sql =" SELECT a.iboard, a.title, a.ctnt, a.created_at createdAt\n" +
                "              , b.nm writer, b.main_pic writerMainPic\n" +
                "        FROM t_board a\n" +
                "        INNER JOIN t_user b\n" +
                "        ON a.iuser = b.iuser\n" +
                "        WHERE a.iboard = ?";

        BoardDetailVo vo = null;
        int result = 0;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dto.getIboard());
            rs = ps.executeQuery();

            if(rs.next()) {
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String ctnt = rs.getString("ctnt");
                String createdAt = rs.getString("createdAt");
                String writer = rs.getString("writer");
                String writerMainPic = rs.getString("writerMainPic");
                vo = new BoardDetailVo(iboard, title, ctnt, createdAt, writer, writerMainPic);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return vo;
    }

    public int updBoard(BoardUpdDto dto) {


        String sql =" UPDATE t_board\n" +
                " SET title = ?" +
                " , ctnt = ?" +
                " , updated_at = current_timestamp" +
                " WHERE iboard = ?" +
                " AND iuser = ?";

        System.out.println(sql);
        int result = 0;
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, dto.getTitle());
            ps.setString(2, dto.getCtnt());
            ps.setInt(3, dto.getIboard());
            ps.setInt(4, dto.getIuser());

            result = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        } finally {
            if(ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if(con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return result;

    }
}
