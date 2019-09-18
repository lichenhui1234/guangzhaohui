package com.guangzhaohui.lrps;

import com.guangzhaohui.lrps.service.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lichenhui
 */
@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication {
    private final DemoService demoService;

    public DemoApplication(DemoService demoService) {
        this.demoService = demoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
