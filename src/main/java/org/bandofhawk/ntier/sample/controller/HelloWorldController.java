package org.bandofhawk.ntier.sample.controller;

import org.bandofhawk.ntier.sample.controller.model.HelloWorldControllerResponseEntity;
import org.bandofhawk.ntier.sample.service.HelloWorldService;
import org.bandofhawk.ntier.sample.service.model.HelloWorldServiceResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public HelloWorldControllerResponseEntity helloWorld()
    {

	HelloWorldServiceResponseEntity helloWorldServiceResponseEntity = helloWorldService.hello();

	HelloWorldControllerResponseEntity helloWorldControllerResponseEntity = new HelloWorldControllerResponseEntity();
	helloWorldControllerResponseEntity.setWelcomeMessage(helloWorldServiceResponseEntity.getWelcomeMessage());

	return helloWorldControllerResponseEntity;
    }
}
