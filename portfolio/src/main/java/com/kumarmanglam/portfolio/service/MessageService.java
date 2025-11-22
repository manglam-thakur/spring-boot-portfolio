package com.kumarmanglam.portfolio.service;

import com.kumarmanglam.portfolio.model.Message;
import com.kumarmanglam.portfolio.repository.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final MessageRepository repo;

    public MessageService(MessageRepository repo) {
        this.repo = repo;
    }

    public Message save(Message m) {
        return repo.save(m);
    }
}
