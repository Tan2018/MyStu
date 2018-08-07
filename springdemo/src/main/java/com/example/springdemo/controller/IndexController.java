package com.example.springdemo.controller;

import com.example.springdemo.domain.Girl;
import com.example.springdemo.domain.GirlProperties;
import com.example.springdemo.repository.GirlRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/index")
public class IndexController {
    protected  static  final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Value("${say}")
    private String  say;
    @Value("${content}")
    private String content;
    @Autowired
    private GirlProperties girlProperties;
    @Autowired
    private GirlRepository girlRepository;

    @RequestMapping(value = {"/demo","/hi"} , method = RequestMethod.GET)
    public String demo(){
        logger.info(girlProperties.getCupSize());
        return say+"--"+ content;
    }

    @RequestMapping(value = "/getDemo/{age}",name = "aa")
    public Integer getDemo(@PathVariable("age") Integer age ){
        return age;
    }

    @GetMapping("/getDemo2")
    public Integer getDemo2(@RequestParam(value = "age",required = false,defaultValue = "19") Integer age ){
		return age;
    }

    @GetMapping("/getAllGirl")
    public List<Girl> getAllGirl(){
        List<Girl> list = girlRepository.findAll();
        return list;

    }



}
