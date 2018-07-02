package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Question;
import com.briup.apps.poll.bean.extend.QuestionVM;

public interface IQuestionService {

	List<Question> findAll() throws Exception;

	void saveOrUpdateVM(QuestionVM questionVM) throws Exception;
	
	List<QuestionVM> findAllQuestionVM() throws Exception;
}
