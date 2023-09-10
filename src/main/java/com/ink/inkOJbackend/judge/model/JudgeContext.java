package com.ink.inkOJbackend.judge.model;

import com.ink.inkOJbackend.model.dto.question.JudgeCase;
import com.ink.inkOJbackend.model.entity.Question;
import com.ink.inkOJbackend.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 用于定义在策略中传递的参数
 */
@Data
public class JudgeContext {

     private JudgeInfo judgeInfo;

     private List<String> inputList;

     private List<String> outputList;

     private Question question;

     private List<JudgeCase> judgeCases;

     private QuestionSubmit questionSubmit;

}