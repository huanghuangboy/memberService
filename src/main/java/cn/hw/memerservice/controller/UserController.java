package cn.hw.memerservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @Value("${data.env}")
    private    String  env1;

    @GetMapping("/GetMember")
    public ResponseEntity GetMember(){
        return  ResponseEntity.status(HttpStatus.OK).body(this.env1);
    }
}
