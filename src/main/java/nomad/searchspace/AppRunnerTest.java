package nomad.searchspace;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunnerTest implements ApplicationRunner {

    private final Environment environment;

    public AppRunnerTest(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===================프로파일 테스트===================");
        System.out.println("Active profiles : "+ Arrays.toString(environment.getActiveProfiles()));
        System.out.println("Datasource driver : " + environment.getProperty("spring.datasource.driver-class-name"));
        System.out.println("Datasource url : " + environment.getProperty("spring.datasource.url"));
        System.out.println("Datasource username : " + environment.getProperty("spring.datasource.username"));
        System.out.println("Server Port : " + environment.getProperty("server.port"));
        System.out.println("Default Property : " + environment.getProperty("default.string"));
        System.out.println("Common Property : " + environment.getProperty("common.string"));
        System.out.println("redis port : " + environment.getProperty("spring.data.redis.port"));
        System.out.println("====================================================");
    }
}
