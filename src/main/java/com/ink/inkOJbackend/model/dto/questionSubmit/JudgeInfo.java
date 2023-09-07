package com.ink.inkOJbackend.model.dto.questionSubmit;

import lombok.Data;

@Data
public class JudgeInfo {
    /**
     * 题目信息
     */
    private String message;
    /**
     * 消耗时间
     */
    private Long time;
    /**
     * 消耗内存
     */
    private Long memory;
}
