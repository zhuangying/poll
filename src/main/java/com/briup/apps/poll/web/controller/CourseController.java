package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.service.ICourseService;
import com.briup.apps.poll.util.MsgResponse;

import io.swagger.annotations.ApiOperation;

//直接对接前端用户
@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private ICourseService courseService;

	@PostMapping("batchDelete") // 运用到多个值时要用post
	public MsgResponse batchDelete(long[] ids) {// long id接受单个参数 接收多个参数用数组接收
		try {
			List<Long> idList = new ArrayList<>();
			for (long id : ids) {
				idList.add(id);
			}
			courseService.batchDelete(idList);
			return MsgResponse.success("批量删除成功", null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();// 提交给后台工程师查看错误信息
			return MsgResponse.error(e.getMessage());// 提交给前段工程师查看错误信息
		}
	}

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

	@PostMapping("saveOrUpdate")
	@ApiOperation(value = "保存或更新课程信息", notes = "如果参数包含了id，说明这是一个更新操作。如果参数中没有包含说明这是一个保存操作")
	public MsgResponse saveOrUpdateCourse(Course course) {
		try {
			if (course != null && course.getId() != null) {
				courseService.update(course);
				return MsgResponse.success("更新成功", null);
			} else {
				courseService.save(course);
				return MsgResponse.success("保存成功", null);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
