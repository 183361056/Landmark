package com.ga.landmark.controller.admin;

import com.ga.landmark.service.HousetypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class HousetypeController {

    @Autowired
    private HousetypeService housetypeService;


   /* @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public  List<Housetype> GetList()
    {

    }*/

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("hello","Hello, Spring Boot!");
        return "/admin/list";
    }



}
