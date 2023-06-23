package com.borad.board.response;
import lombok.Getter;

@Getter
public class Star {
    String title;
    String name;
    String PW;
    String content;

    public Star(String title, String name,String PW, String content) {
        this.title = title;
        this.PW = PW;
        this.name = name;
        this.content = content;
    }

    public Star() {}
}