package com.study.spring.Bbs.controller;

import com.study.spring.Bbs.dto.PopularPostClassDto;
import com.study.spring.Bbs.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BbsController {
    @Autowired
    BbsService bbsService;

    // [실시간 인기글]
    @GetMapping("/api/bbs_popularPostRealtimeList")
    public List<PopularPostClassDto> getRealtimePopularPosts (@RequestParam("period") String period){
        return bbsService.findRealtimePopularPosts(period);
    }

    // [주간 인기글]
    @GetMapping("/api/bbs_popularPostWeeklyList")
    public List<PopularPostClassDto> getWeeklyPopularPosts (@RequestParam("period") String period){
        return bbsService.findWeeklyPopularPosts(period);
    }

    // [월간 인기글]
    @GetMapping("/api/bbs_popularPostMonthlyList")
    public List<PopularPostClassDto> getMonthlyPopularPosts (@RequestParam("period") String period){
        return bbsService.findMonthlyPopularPosts(period);
    }
}
