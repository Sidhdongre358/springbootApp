package com.ct.firstapp.controller;

import com.ct.firstapp.dto.AdditionRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @PostMapping("/add")
    public int addNumbers(@RequestBody AdditionRequest request) {
        System.out.println(request.toString());
        return request.getNum1() + request.getNum2();
    }
}