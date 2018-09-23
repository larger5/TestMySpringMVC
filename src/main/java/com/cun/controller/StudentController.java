package com.cun.controller;

import annotation.CunAutowired;
import annotation.CunController;
import annotation.CunRequestMapping;
import com.cun.service.StudentService;

@CunController
@CunRequestMapping("/student")
public class StudentController {

    @CunAutowired
    private StudentService studentService;

    @CunRequestMapping("/index")
    public void index() {
        System.out.println("调用类 " + this.getClass().getSimpleName() + " 的一个方法");
    }

}
