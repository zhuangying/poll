package com.briup.apps.poll.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Options;
import com.briup.apps.poll.bean.Question;
import com.briup.apps.poll.bean.QuestionExample;
import com.briup.apps.poll.bean.extend.QuestionVM;
import com.briup.apps.poll.dao.OptionsMapper;
import com.briup.apps.poll.dao.QuestionMapper;
import com.briup.apps.poll.dao.extend.QuestionVMMapper;
import com.briup.apps.poll.service.IQuestionService;
import com.briup.apps.poll.util.MsgResponse;

@Service
public class QuestionServiceImpl implements IQuestionService {

	@Autowired
	private QuestionVMMapper questionVMMapper;
	@Autowired
	
	private QuestionMapper questionMapper;
	@Autowired
	private OptionsMapper optionsMapper;  

	public void saveOrUpdateVM(QuestionVM questionVM) throws Exception {
		//从questionVM中查分出来question options
		Question question=new Question();
		question.setId(questionVM.getId());
		question.setName(questionVM.getName());
		question.setQuestiontype(questionVM.getQuestionType());
		List<Options> options=questionVM.getOptions();
		if (question.getId() != null) {
				questionVMMapper.update(questionVM);
			} else {
				questionMapper.insert(question);
				Long id=question.getId();
				for(Options option:options){
					option.setQuestionId(id);
					optionsMapper.insert(option);
				}
				
			}
	}
	@Override
	public List<Question> findAll() throws Exception {
		// TODO Auto-generated method stub
		QuestionExample example = new QuestionExample();
		return questionMapper.selectByExample(example);
	}

	@Override
	public List<QuestionVM> findAllQuestionVM() throws Exception {
		// TODO Auto-generated method stub
		return questionVMMapper.findAll();
	}

}
