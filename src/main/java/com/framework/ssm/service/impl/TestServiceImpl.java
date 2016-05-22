/**
 * 
 */
package com.framework.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.framework.ssm.model.entity.Test;
import com.framework.ssm.model.mapper.TestMapper;
import com.framework.ssm.service.TestService;

/**
 * @author Administrator
 *
 */
@Service("testService")
public class TestServiceImpl implements TestService {

	/** testMapper **/
	@Resource
	private TestMapper testMapper;
	
	/* (non-Javadoc)
	 * @see com.framework.ssm.service.TestService#getTestById(int)
	 */
	@Override
	public Test getTestById(int id) {
		return this.testMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.framework.ssm.service.TestService#saveTest(com.framework.ssm.model.entity.Test)
	 */
	@Override
	public void saveTest(Test test) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.framework.ssm.service.TestService#removeTestById(int)
	 */
	@Override
	public void removeTestById(int id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.framework.ssm.service.TestService#editTestById(com.framework.ssm.model.entity.Test)
	 */
	@Override
	public void editTestById(Test test) {
		// TODO Auto-generated method stub

	}

}
