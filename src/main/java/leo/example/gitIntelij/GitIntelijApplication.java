package leo.example.gitIntelij;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitIntelijApplication {
	public static final String DEVELOPMENT_VERSION = "0.1.12";
	public static final long APPLICATION_START_TIME = System.currentTimeMillis();
	public static void main(String[] args) {
		SpringApplication.run(GitIntelijApplication.class, args);
	}
}
