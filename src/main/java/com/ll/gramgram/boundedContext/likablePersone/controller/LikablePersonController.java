package com.ll.gramgram.boundedContext.likablePersone.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/likablePerson")
public class LikablePersonController {

    @GetMapping("/add")
    public String showAdd() {
        return "usr/likablePerson/add";
    }


}
