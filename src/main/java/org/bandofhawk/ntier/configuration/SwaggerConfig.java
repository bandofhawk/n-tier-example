package org.bandofhawk.ntier.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

@Configuration
@EnableSwagger
public class SwaggerConfig
{
    @Autowired
    private SpringSwaggerConfig springSwaggerConfig;

    @Value("${apiVersion}")
    private String apiVersion;

    @Bean
    public SwaggerSpringMvcPlugin customImplementation()
    {
	return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(apiInfo()).apiVersion(apiVersion)
		.includePatterns(".*/.*");
    }

    private ApiInfo apiInfo()
    {
	ApiInfo apiInfo = new ApiInfo("NTier", "NTier API", null, null, null, null);
	return apiInfo;
    }

}
