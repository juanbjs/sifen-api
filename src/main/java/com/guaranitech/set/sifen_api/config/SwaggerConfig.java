package com.guaranitech.set.sifen_api.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI springOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("SIFEN API")
						.description("APIs para enviar documentos electronicos a la SIFEN.")
						.version("v1.0")
						.contact(new Contact()
								.name("Juan Zarate")
								.email("juan.zarate@guaranitech.com")
								.url("http://guaranitech.com")));
	}

	@Bean
	public GroupedOpenApi appOpenApi() {

		var packagesToScan = new String[] { "com.guaranitech.set.sifen_api.controller" };
		var pathsToMatch = new String[] { "/api/**" };
		var pathsToExclude = new String[] { "/v3/**" };
		return GroupedOpenApi
				.builder()
				.group("app")
				.packagesToScan(packagesToScan)
				.pathsToMatch(pathsToMatch)
				.pathsToExclude(pathsToExclude)
				.build();

	}

}
