package org.bandofhawk.ntier.sample.service;

import org.bandofhawk.ntier.sample.dao.HelloWorldDao;
import org.bandofhawk.ntier.sample.dao.model.HelloWorldDaoResponseEntity;
import org.bandofhawk.ntier.sample.service.model.HelloWorldServiceResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService
{
    @Autowired
    private HelloWorldDao helloWorldDao;

    public HelloWorldServiceResponseEntity hello()
    {

	HelloWorldDaoResponseEntity helloWorldDaoResponseEntity = helloWorldDao.send();

	HelloWorldServiceResponseEntity helloWorldServiceResponseEntity = new HelloWorldServiceResponseEntity();
	helloWorldServiceResponseEntity.setWelcomeMessage(helloWorldDaoResponseEntity.getWelcomeMessage());

	return helloWorldServiceResponseEntity;
    }
}
