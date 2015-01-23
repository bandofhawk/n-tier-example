package org.bandofhawk.ntier.sample.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloWorldControllerRequestEntity
{
    @JsonProperty("name")
    private String name;

    public String getName()
    {
	return name;
    }

    public void setName(String name)
    {
	this.name = name;
    }
}
