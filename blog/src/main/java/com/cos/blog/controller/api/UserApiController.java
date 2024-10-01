package com.cos.blog.controller.api;

import com.cos.blog.dto.ResponseDto;
import com.cos.blog.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/blog")
public class UserApiController {

    @PostMapping("/api/auth/sign-up")
    public ResponseDto<Integer> save(@RequestBody User user, BindingResult bindingResult){
        System.out.println("ok");
        return new ResponseDto<Integer>(200,1);

    }

    @PostMapping("a")
    public int save(){
        System.out.println("ok");
        return 1;

    }
}
