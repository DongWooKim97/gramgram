//package com.ll.gramgram.base.initData;
//
//import com.ll.gramgram.boundedContext.instaMember.service.InstaMemberService;
//import com.ll.gramgram.boundedContext.member.service.MemberService;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Profile;
//import org.springframework.stereotype.Component;
//
//@Component
//@Profile({"dev", "test"})
//public class NotProd2 implements CommandLineRunner {
//
//    private final boolean initDataDone2 = false;
//
//    private final InstaMemberService instaMemberService;
//
//    public NotProd2(InstaMemberService instaMemberService) {
//        this.instaMemberService = instaMemberService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        instaMemberService.create("insta1", "1234");
//        instaMemberService.create("insta2", "1234");
//        instaMemberService.create("insta3", "1234");
//        instaMemberService.create("insta4", "1234");
//    }
//
//    @Bean
//    CommandLineRunner initData(MemberService memberService) {
//        return args -> {
//            memberService.join("admin", "1234");
//            memberService.join("user1", "1234");
//            memberService.join("user2", "1234");
//            memberService.join("user3", "1234");
//            memberService.join("user4", "1234");
//        };
//    }
//}
