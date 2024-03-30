package com.zg.wechatbot.lingji.controller;

import com.alibaba.dashscope.aigc.imagesynthesis.ImageSynthesisResult;
import com.alibaba.dashscope.exception.NoApiKeyException;
import com.zg.wechatbot.lingji.wanx.entity.RequestParam;
import com.zg.wechatbot.lingji.wanx.service.WanxService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/lingji")
public class LingJiController {

    @Autowired
    private WanxService wanxService;

    @GetMapping("/wanxV1")
    public ImageSynthesisResult wanxV1(RequestParam requestParam) {
        try {
            return wanxService.wanxV1(requestParam);
        } catch (NoApiKeyException e) {
            log.error("NoApiKeyException: {}", e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }
}
