package desafioacl;


import io.swagger.models.Swagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

@Service
@SpringBootApplication
@Import({Swagger.class})

public class ChallengeAclApp {
    public static void main(String[] args) {
        SpringApplication.run(ChallengeAclApp.class, args);
    }
}

