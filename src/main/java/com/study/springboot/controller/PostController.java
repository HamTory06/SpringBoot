package com.study.springboot.controller;

import com.study.springboot.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {
    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postExample(){
        return "Hello Post API";
    }

    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData){
        StringBuilder sb = new StringBuilder();

        postData.forEach((key, value) -> sb.append(key + " : " + value + "\n"));

        return sb.toString();
    }

    @PostMapping(value = "/member2")
    public String postMemberDto(
            @RequestParam MemberDto memberDto
    ){
        return memberDto.toString();
    }

}
