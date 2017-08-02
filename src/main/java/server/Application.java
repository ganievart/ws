package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by sbt-ganiev-ar on 02.08.2017.
 */

@EnableAutoConfiguration
@ComponentScan(basePackages = "server")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
