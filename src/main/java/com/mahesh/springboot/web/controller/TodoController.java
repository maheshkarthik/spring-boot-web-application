package com.mahesh.springboot.web.controller;

import com.mahesh.springboot.web.service.LoginService;
import com.mahesh.springboot.web.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

    @Autowired
    TodoService service;

    @RequestMapping(value="/list-todos",method=RequestMethod.GET)
    public String showTodosList(ModelMap model)
    {
        model.put("todos",service.retrieveTodos("mahesh"));
        return "list-todos" ;
    }



}
