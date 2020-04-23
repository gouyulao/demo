package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/home")
    public String home(Model model){
        model.addAttribute("userList",userService.findAll());
        return "home";
    }

    @RequestMapping(value = "/add_user")
    public String addUser(){
        return "addUser";
    }

    @RequestMapping(value = "/add_user_do")
    public String addUserDo(User user){
        int count=userService.addUser(user);
        if(count>0){
            return "redirect:/user/home";
        }else{
            return "redirect:/user/add_user";
        }
    }

    @RequestMapping(value = "/upd_user")
    public String updUser(String id, HttpSession session){
        session.removeAttribute("id");
        session.setAttribute("id",id);
        return "updUser";
    }

    @RequestMapping(value = "/upd_user_do")
    public String updUserDo(String name,String sex,String age,HttpSession session){
         User user=new User();
         if(age==null || age=="" || Integer.parseInt(age)<0  || Integer.parseInt(age)>130){
             user.setAge(0);
         }else{
             user.setAge(Integer.parseInt(age));
         }
         user.setSex(sex);
         user.setName(name);
         user.setId(Integer.parseInt((String) session.getAttribute("id")));
         int count=userService.updUser(user);
        if(count>0){
            return "redirect:/user/home";
        }else{
            return "redirect:/user/upd_user";
        }
    }

    @RequestMapping(value = "/del_user_do")
    public String delUser(String id){
        userService.delUser(Integer.parseInt(id));
        return "redirect:/user/home";
    }


}
