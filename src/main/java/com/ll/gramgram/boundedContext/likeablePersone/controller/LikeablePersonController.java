package com.ll.gramgram.boundedContext.likeablePersone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/likablePerson")
public class LikeablePersonController {

    @GetMapping("/add")
    public String showAdd() {
        return "usr/likablePerson/add";
    }


}
