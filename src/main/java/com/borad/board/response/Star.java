package com.borad.board.response;
import lombok.Getter;

@Getter
public class Star {
    String id;
    String pw;
    String name;
    int age;

    public Star(String id, String pw, String name, int age) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
    }

    public Star() {}
}