package com.ll.gramgram.boundedContext.likeablePersone.controller;

import com.ll.gramgram.base.rq.Rq;
import com.ll.gramgram.base.rsData.RsData;
import com.ll.gramgram.boundedContext.likeablePersone.entity.LikeablePerson;
import com.ll.gramgram.boundedContext.likeablePersone.service.LikeablePersonService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/likeablePerson")
@RequiredArgsConstructor
public class LikeablePersonController {
    private final Rq rq;
    private final LikeablePersonService likeablePersonService;

    @GetMapping("/add")
    public String showAdd() {
        return "usr/likeablePerson/add";
    }

    @PostMapping("add")
    public String add(@Valid AddForm addForm) {
        String username = addForm.getUsername();

        RsData<LikeablePerson> createRsData = likeablePersonService.create(rq.getMember(), addForm.getUsername(), addForm.getAttractiveTypeCode());
        if (createRsData.isFail()) {
            return rq.historyBack(createRsData);
        }
        return rq.redirectWithMsg("/likeablePerson/list", "입력하신 인스타 사용자(%s)를 호감상대로 등록했습니다.");
    }

    @AllArgsConstructor
    @Getter
    public static class AddForm {
        private final String username;
        private final int attractiveTypeCode;
    }
}
