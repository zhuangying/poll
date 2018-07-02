package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.bean.extend.ClazzVM;
import com.briup.apps.poll.service.IClazzService;
import com.briup.apps.poll.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "班级相关接口")
@RestController
@RequestMapping("/clazz")
public class ClazzController {

	@Autowired
	private IClazzService clazzService;

	@ApiOperation("查询所有的班级信息")
	@GetMapping("findAllClazz")
	public MsgResponse findAllClazz() {
		try {
			List<Clazz> list = clazzService.findAllClazz();
			return MsgResponse.success("seccess", list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "查询所有的班级信息", notes = "每个班级信息中包含班级的所有年级和班主任的信息")
	@GetMapping("findAllClazzVM")
	public MsgResponse findAllClazzVM() {
		try {
			List<ClazzVM> list = clazzService.findAllClazzVM();
			return MsgResponse.success("seccess", list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
