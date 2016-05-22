/**
 * 
 */
package com.framework.ssm.service;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:mybatis/spring-mybatis.xml"})
public class TestServiceTest {

	private static Logger logger = Logger.getLogger(TestServiceTest.class);
	
	@Resource
	private TestService testService;
	
	/**
	 * Test method for {@link com.framework.ssm.service.TestService#getTestById(int)}.
	 */
	@Test
	public void testGetTestById() {
		com.framework.ssm.model.entity.Test test = testService.getTestById(1);
		System.out.println(">>>>" + test.getName());
//		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.framework.ssm.service.TestService#saveTest(com.framework.ssm.model.entity.Test)}.
	 */
	@Test
	public void testSaveTest() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.framework.ssm.service.TestService#removeTestById(int)}.
	 */
	@Test
	public void testRemoveTestById() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.framework.ssm.service.TestService#editTestById(com.framework.ssm.model.entity.Test)}.
	 */
	@Test
	public void testEditTestById() {
		fail("Not yet implemented");
	}

}
