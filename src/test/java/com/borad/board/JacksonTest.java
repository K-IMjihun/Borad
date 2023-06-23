package com.borad.board;

import com.borad.board.response.Star;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JacksonTest {

    @Test
    @DisplayName("Object To JSON : get Method 필요")
    void test1() throws JsonProcessingException {
        Star star = new Star("ㅇㅇ", "ㅇㅇ", "Robbie", "ㅇㅇ4");


        ObjectMapper objectMapper = new ObjectMapper(); // Jackson 라이브러리의 ObjectMapper
        String json = objectMapper.writeValueAsString(star); //  star 객체를 JSON 문자열로 변환

        System.out.println("json = " + json);
    }
    @Test
    @DisplayName("JSON To Object : 기본 생성자 & (get OR set) Method 필요")
    void test2() throws JsonProcessingException {
        String json = "{\"title\":\"ㅇㅇ\",\"PW\":\"123\",\"name\":\"Robbie\",\"content\":ㅇㅇㅇ}"; // JSON 타입의 String

        ObjectMapper objectMapper = new ObjectMapper(); // Jackson 라이브러리의 ObjectMapper

        Star star = objectMapper.readValue(json, Star.class);
        System.out.println("star.getName() = " + star.getName());
    }
}
