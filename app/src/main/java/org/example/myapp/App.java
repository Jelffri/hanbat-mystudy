package org.example.myapp;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // 스프링부트 컨피그, 오토컨피그레이션, 컴포넌트스캔, 이 세게 가져오기

public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class , args);
        System.out.println("스프링부트 서버 시작");
    }
}

//@EnableAutoConfiguration //스프링부트를 실행할 수 있도록 기본 정보를 자동 생성
//@ComponentScan //현재 클래스와 같은 패키지 밎 하위 패키지를 다 뒤져서 컴포넌트를 찾아서 자동 생성하라는 설정
//@Component
//@Service
//@Repository
//@Controller
//@RestController
//@Configuration => 이런것들을 찾음

