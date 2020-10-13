package edu.sicau.shopping.controller;

import edu.sicau.shopping.domain.Tbclass;
import edu.sicau.shopping.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @Autowired
    private TestService testService;

    @RequestMapping(value = "getClassById", method = {RequestMethod.GET})
    @ResponseBody
    public Tbclass getClass(int id) {
        return testService.getById(id);
    }
}