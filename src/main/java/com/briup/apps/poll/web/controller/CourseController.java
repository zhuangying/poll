package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.service.ICourseService;
import com.briup.apps.poll.util.MsgResponse;

//直接对接前端用户
@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private ICourseService courseService;

	@GetMapping("findAllCourse")
	// 该方法要求的返回值为List，不可以传回一个值
	public MsgResponse findAllCourse() {
		try {
			List<Course> list = courseService.findAll();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// 该错误信息应该从catch中获取
			return MsgResponse.error(e.getMessage());
		}
	}

}
