package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Question;
import com.briup.apps.poll.bean.extend.QuestionVM;
import com.briup.apps.poll.service.IQuestionService;
import com.briup.apps.poll.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "题目模块相关接口")
@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private IQuestionService questionService;

	
	@ApiOperation("更新和修改问题信息")
	@PostMapping("saveOrUpdate")
	public MsgResponse saveOrUpdate(QuestionVM questionVM){
		try {
			questionService.saveOrUpdateVM(questionVM);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	
	@ApiOperation("查询所有的题目信息")
	@GetMapping("findAllQuestionVM")
	public MsgResponse findAllQuestionVM() {
		try {
			List<QuestionVM> list = questionService.findAllQuestionVM();
			return MsgResponse.success("seccess", list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation("查询所有的题目信息")
	@GetMapping("findAllQuestion")
	public MsgResponse findAllQuestion() {
		try {
			List<Question> list = questionService.findAll();
			return MsgResponse.success("seccess", list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
