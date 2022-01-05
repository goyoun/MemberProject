package com.icia.member.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @GetMapping
    public String save(){
        System.out.println("회원가입 화면 요청");
        return "/member/save";
    }

    @GetMapping
    public String login(){
        System.out.println("로그인 화면 요청");
        return "/member/login";
    }

    @PostMapping
    public String save(@ModelAttribute MemberSaveDTO member){
        MemberSaveDTO member = result;
        return result;
    }
}
