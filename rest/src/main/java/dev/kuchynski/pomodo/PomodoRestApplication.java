package dev.kuchynski.pomodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application entry point.
 *
 * @author <a href="mailto:o.kuchynski@gmail.com">Aleh Kuchynski</a>
 * @since 1.0
 */
@SpringBootApplication
public class PomodoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PomodoRestApplication.class, args);
	}

}
