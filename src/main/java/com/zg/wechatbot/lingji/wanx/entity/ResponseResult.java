package com.zg.wechatbot.lingji.wanx.entity;

import lombok.Data;

import java.util.List;

@Data
public class ResponseResult {

    /**
     * 200（HTTPStatus.OK）表示请求成功，否则表示请求失败，可以通过code获取错误码，通过message字段获取错误详细信息。
     */
    private Integer status_code;

    /**
     * 系统生成的标志本次调用的id。
     */
    private String request_id;

    /**
     * 表示请求失败，表示错误码，成功忽略。
     */
    private String code;

    /**
     * 失败，表示失败详细信息，成功忽略。
     */
    private String message;

    /**
     * 调用结果信息，对于千问模型，包含输出text。
     */
    private Output output;

    /**
     * 统计
     */
    private Usage usage;

    @Data
    public class Results {

        /**
         * 生成的图片url
         */
        private String url;

    }

    @Data
    public class Task_metrics {

        /**
         * ，TOTAL期望生成数量
         */
        private Integer TOTAL;

        /**
         * SUCCEEDED成功生成数量
         */
        private Integer SUCCEEDED;

        /**
         * FAILED失败数量
         */
        private Integer FAILED;
    }

    @Data
    public class Output {

        /**
         * 异步任务id。
         */
        private String task_id;

        /**
         * 任务状态(SUCCEEDED,FAILED,CANCELED,PENDING,SUSPENDED,RUNNING)
         * SUCCESSED: 任务执行成功
         * FAILED: 任务执行失败
         * CANCELED： 任务被取消
         * PENDING：任务排队中
         * RUNNING：任务处理中
         */
        private String task_status;

        /**
         * 生成结果，每个元素为生成图片的url
         */
        private List<Results> results;

        /**
         * 任务结果信息
         */
        private Task_metrics task_metrics;
    }

    @Data
    public class Usage {

        /**
         * 计量的图片个数
         */
        private Integer image_count;
    }
}
