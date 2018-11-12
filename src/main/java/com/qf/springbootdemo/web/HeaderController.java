package com.qf.springbootdemo.web;

import com.qf.springbootdemo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Create by it_mck 2018/11/10 14:51
 *
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("h")
public class HeaderController {

    @Autowired//根据类型进行装配
    private Student student;

    /**
     *
     * @param request 封装浏览器的请求信息,通过request对象的各种方法可以获取客户端以及用户提交的各项请求信息
     *                javax.servlet.http.HttpServletRequest;
     * @return
     */
    @RequestMapping("j")
    @ResponseBody
    public Map<String,Object> getHeader(HttpServletRequest request){

        Map<String, Object> map = new HashMap<>();
        Enumeration<String> headerNames = request.getHeaderNames();//获取所有头部信息的名称
        while (headerNames.hasMoreElements()){

            String headerName = headerNames.nextElement();//单个头部名
            String headerValue = request.getHeader(headerName);//根据头部信息名获取对应的字符串类型的信息值
            map.put(headerName,headerValue);
        }
        return  map;
    }

    @RequestMapping("k")
    @ResponseBody
    public Map<String,Object> getStudent(){

        Map<String,Object> map = new HashMap<>();
        String name = student.getName();
        int age = student.getAge();
        map.put("name",name);
        map.put("age",age);
        return map;
    }

}
