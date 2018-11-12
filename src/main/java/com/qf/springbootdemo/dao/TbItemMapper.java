package com.qf.springbootdemo.dao;

import com.qf.springbootdemo.pojo.TbItem;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Create by it_mck 2018/9/5 10:29
 *
 * @Description:
 * @Version: 1.0
 */
@Mapper
public interface TbItemMapper {

    @Select(value = "select * from tb_item")
    @Results(value = {@Result(column = "sell_point",property = "sellPoint")})
    List<TbItem> getAll();

    @SelectProvider(type =DynamicProvider.class,method = "selectByCondition")
    //@Results(value = {@Result(column = "sell_point",property = "sellPoint")})//可以使用这种方式,也可以在DynamicProvider中配别名
    TbItem getItemById(Long id);
}
