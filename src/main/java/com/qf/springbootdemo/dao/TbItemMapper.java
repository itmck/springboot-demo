package com.qf.springbootdemo.dao;

import com.qf.springbootdemo.pojo.TbItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create by it_mck 2018/9/5 10:29
 *
 * @Description:
 * @Version: 1.0
 */
@Mapper
@Repository
public interface TbItemMapper {

    @Select(value = "select * from tb_item")
    @Results(value = {@Result(column = "sell_point",property = "sellPoint")})
    List<TbItem> getAll();
}
