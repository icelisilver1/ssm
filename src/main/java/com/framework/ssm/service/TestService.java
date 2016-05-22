/**
 * 
 */
package com.framework.ssm.service;

import org.springframework.stereotype.Service;

import com.framework.ssm.model.entity.Test;

/**
 * @author Administrator
 *
 */
public interface TestService {

	/**
	 * @param id
	 * @return
	 */
	public Test getTestById(int id);
	
	/**
	 * @param test
	 */
	public void saveTest(Test test);
	
	/**
	 * @param id
	 */
	public void removeTestById(int id);
	
	/**
	 * @param test
	 */
	public void editTestById(Test test);
	
	
}
