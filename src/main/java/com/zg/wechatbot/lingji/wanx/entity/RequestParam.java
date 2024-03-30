package com.zg.wechatbot.lingji.wanx.entity;

import lombok.Data;

@Data
public class RequestParam {

    /**
     * 用户当前输入的期望模型执行指令。
     */
    private String prompt;

    /**
     * 期望生成的图片数量,目前限制最多生成4张
     */
    private Integer n;

    /**
     * 生成的图片的规格
     * 默认 1024*1024
     */
    private String size = "1024*1024";
}
