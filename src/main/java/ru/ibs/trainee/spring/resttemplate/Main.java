package ru.ibs.trainee.spring.resttemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);

        final RestTemplate restTemplate = applicationContext.getBean(RestTemplate.class);

//        URI uri = new URI("http://localhost:8080/spring/mvc/show");
        URI uri = new URI("http://localhost:8080/spring/rest/postbody");


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String postBody = "{\"input\":1}";


        HttpEntity<String> request = new HttpEntity<>(postBody, headers);


//        final ResponseEntity<String> getEntity = restTemplate.getForEntity(uri, String.class);
//        getEntity.getBody();
        final ResponseEntity<String> responseEntity = restTemplate.postForEntity(uri, request, String.class);
        final String body = responseEntity.getBody();
    }
}
