package org.andgomes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import org.andgomes.util.WelcomeMessage;

@Configuration
public class WelcomeMessageConfig {

	@Bean
	@Profile("en-gb")
	public WelcomeMessage welcomeMessageEnGB() {
		return () -> "Welcome to the best RPG of the world";
	}

	@Bean
	@Profile("pt-br")
	public WelcomeMessage welcomeMessagePtBR() {
		return () -> "Bem-vindo ao melhor RPG do mundo";
	}

}