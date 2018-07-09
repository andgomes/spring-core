package org.andgomes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import org.andgomes.rpg.Knight;
import org.andgomes.rpg.annotation.Dragon;
import org.andgomes.rpg.annotation.HolyGraal;
import org.andgomes.util.WelcomeMessage;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLine(@Dragon Knight knight,
			WelcomeMessage welcomeMessage) {
		
		return arg -> {
			
			System.out.println("=================");
			System.out.println(welcomeMessage.getMessage());
			System.out.println("=================");

			if (knight.isInAQuest()) {
				System.out.println("Quest: " +
						knight.getQuest().getDescription());
			}

			System.out.println("==================================");
		
		};
	
	}

}