package com.qf.springbootdemo.dao;

import org.apache.ibatis.jdbc.SQL;

/**
 * Create by it_mck 2018/10/8 18:39
 *
 * @Description:
 * @Version: 1.0
 */
public class DynamicProvider {

    public String selectByCondition(Long id){

        SQL sql = new SQL();

        //在此可以配置别名
        sql.SELECT("title","sell_point as sellPoint").FROM("tb_item");
        if(id!=null){
            sql.WHERE("id=#{id}");
        }
        return sql.toString();
    }
}
