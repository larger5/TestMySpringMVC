package com.cun.service.impl;

import annotation.CunService;
import com.cun.service.StudentService;

@CunService
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello() {
        return "Hello";
    }
}
