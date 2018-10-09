package com.qf.springbootdemo.service;

import com.qf.springbootdemo.pojo.TbItem;

import java.util.List;

/**
 * Create by it_mck 2018/9/5 10:25
 *
 * @Description:
 * @Version: 1.0
 */
public interface TbItemService {
    //获取所有
    List<TbItem> getAll();

    //根据id获取数据
    TbItem getItemById(Long id);
}
