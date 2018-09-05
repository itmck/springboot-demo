package com.qf.springbootdemo.service.impl;

import com.qf.springbootdemo.dao.TbItemMapper;
import com.qf.springbootdemo.pojo.TbItem;
import com.qf.springbootdemo.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by it_mck 2018/9/5 10:28
 *
 * @Description:
 * @Version: 1.0
 */
@Service
public class TbItemServiceImpl implements TbItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public List<TbItem> getAll() {
        return tbItemMapper.getAll();
    }
}
