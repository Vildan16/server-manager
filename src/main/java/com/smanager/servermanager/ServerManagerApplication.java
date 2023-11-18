package com.smanager.servermanager;

import com.smanager.servermanager.enumeration.Status;
import com.smanager.servermanager.model.Server;
import com.smanager.servermanager.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerManagerApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ServerRepo serverRepo) {
        return args -> {
            serverRepo.save(
                    new Server(
                            null,
                            "192.168.1.160",
                            "Ubuntu Linux",
                            "16 GB",
                            "PC1",
                    "http://localhost:8080/server/image/server1.png",
                            Status.SERVER_UP));

            serverRepo.save(
                    new Server(
                            null,
                            "192.168.2.160",
                            "Ubuntu Linux",
                            "17 GB",
                            "PC2",
                            "http://localhost:8080/server/image/server2.png",
                            Status.SERVER_UP));

            serverRepo.save(
                    new Server(
                            null,
                            "192.168.3.160",
                            "Ubuntu Linux",
                            "18 GB",
                            "PC3",
                            "http://localhost:8080/server/image/server3.png",
                            Status.SERVER_UP));
        };
    }
}
