package service.gman;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceUploadApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ServiceUploadApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
