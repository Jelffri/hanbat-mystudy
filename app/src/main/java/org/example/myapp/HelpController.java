package org.example.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Request handler의 리턴값은 실행 할 view
public class HelpController {
    @GetMapping(path="/help") // "/help" URL 요청을 help.html 템플릿으로 매핑
    public String help() {
        return "help"; // 리턴 값은 클라이언트에게 보낼 콘텐트가 아니라 타임리프엔진에게 알려줄 템플릿 파일 이름이다.
    }
}

