package com.qf.springbootdemo.web;

import com.qf.springbootdemo.pojo.TbItem;
import com.qf.springbootdemo.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by it_mck 2018/8/27 20:23
 *
 * @Description:
 * @Version: 1.0
 */
@RestController
@RequestMapping("/spb")
public class ActionController {

    @Autowired
    private TbItemService tbItemService;

    @RequestMapping("/getAll")
    public Map<String,Object> getAll(){

        Map<String,Object> map = new HashMap<>();

        try {
            List<TbItem> i=tbItemService.getAll();
            map.put("list",i);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("failed","failed");
        }
        return map;
    }
}
