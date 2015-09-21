package com.liulishuo.test.Model;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by Arthur on 2015/9/21.
 */
public class Coins extends JdbcDaoSupport {
    /**
     * 添加用户
     * @param userId
     * @param coins
     * @return success
     */
    public int addUser(int userId,int coins){
        String sql = "insert into coins (user_id,coins) values(?,?)";
        return this.getJdbcTemplate().update(sql,userId,coins);
    }
    /**
     * 获取用户的coins
     * @param userId
     * @return
     */
    public int getCoins(int userId){
        String sql = "select coins from coins where user_id="+userId;
        return (Integer)this.getJdbcTemplate().queryForObject(sql,java.lang.Integer.class);
    }
    /**
     * 减钱
     * @param userId
     * @param coins
     */
    public int outCoins(int userId,int coins){
        String sql = "update coins set coins=coins-? where user_id=?";
        return this.getJdbcTemplate().update(sql,coins,userId);
    }

    /**
     * 加钱
     * @param userId
     * @param coins
     */
    public int inCoins(int userId,int coins){
        String sql = "update coins set coins=coins+? where user_id=?";
        return this.getJdbcTemplate().update(sql,coins,userId);
    }
}
