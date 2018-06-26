package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Course;

public interface ICourseService {
	List<Course> findAll() throws Exception;

	List<Course> query(String keywords) throws Exception;
	// 关键字查询

	void save(Course course) throws Exception;

	void update(Course course) throws Exception;

	void deleteById(long id) throws Exception;

	void batchDelete(List<Long> ids) throws Exception;
	// “批量删除”(Long[] ids)放long类型的数组和放集合类型的Long都一样，ids是一个变量

}
