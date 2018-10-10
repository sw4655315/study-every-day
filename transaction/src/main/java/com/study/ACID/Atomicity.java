package com.study.ACID;

import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.sql.*;

/**
 * 事务 - 原子性
 * 一个事务（transaction）中的所有操作，要么全部完成，要么全部不完成，不会结束在中间某个环节。
 *
 * 事务在执行过程中发生错误，会被恢复（Rollback）到事务开始前的状态，就像这个事务从来没有执行过一样。
 * @author jisong.sun on 2018/10/9.
 */
public class Atomicity {

    public Connection getConn() throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8","root","root");

    }

    @Test
    public void normal() throws Exception {
        Connection conn = getConn();
        PreparedStatement ps = conn.prepareStatement("select * from a");
        ResultSet resultSet = ps.executeQuery();
        Array array = resultSet.getArray(0);
        ResultSet resultSet1 = array.getResultSet();
        String string = resultSet1.getString(0);
        System.out.println(string);
    }
}
