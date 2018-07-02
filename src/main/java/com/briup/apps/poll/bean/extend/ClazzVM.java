package com.briup.apps.poll.bean.extend;

import com.briup.apps.poll.bean.Grade;
import com.briup.apps.poll.bean.User;

//关系类型对象新建一个id，不对clazz.java进行更改
public class ClazzVM {
	private Long id;
	private String name;
	private String description;
	private Grade grade;// 班级所属的年级信息
	private User charge;// 班级的班主任老师 信息

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public User getCharge() {
		return charge;
	}

	public void setCharge(User charge) {
		this.charge = charge;
	}

}
