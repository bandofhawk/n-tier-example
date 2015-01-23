package org.bandofhawk.ntier.sample.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloWorldControllerResponseEntity
{
    @JsonProperty("welcome-message")
    private String welcomeMessage;

    public String getWelcomeMessage()
    {
	return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage)
    {
	this.welcomeMessage = welcomeMessage;
    }
}
