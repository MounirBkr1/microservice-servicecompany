package com.mnr.servicecompagnie;

import com.mnr.servicecompagnie.dao.CompanyRepository;
import com.mnr.servicecompagnie.entities.Company;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceCompagnieApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCompagnieApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompanyRepository companyRepository){
        return args->{
            Stream.of("a","b","c").forEach(cn -> {
                companyRepository.save(new Company(null,cn,100+Math.random()*900));
            });
            
            companyRepository.findAll().forEach(System.out::println);
        };
    }

}
