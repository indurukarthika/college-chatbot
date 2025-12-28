package com.college.chatbot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "chatbot_qa")
public class ChatbotQA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String keyword;
    private String answer;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
