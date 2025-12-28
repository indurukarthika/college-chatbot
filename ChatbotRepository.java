package com.college.chatbot.repository;

import com.college.chatbot.model.ChatbotQA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatbotRepository extends JpaRepository<ChatbotQA, Integer> {
}
