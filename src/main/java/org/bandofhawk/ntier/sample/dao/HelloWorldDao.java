package org.bandofhawk.ntier.sample.dao;

import org.bandofhawk.ntier.sample.dao.model.HelloWorldDaoResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldDao
{
    public HelloWorldDaoResponseEntity send()
    {
	HelloWorldDaoResponseEntity helloWorldDaoResponseEntity = new HelloWorldDaoResponseEntity();
	helloWorldDaoResponseEntity.setWelcomeMessage("Welcome to N Tier");
	
	return helloWorldDaoResponseEntity;
    }
}
