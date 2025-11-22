package com.kumarmanglam.portfolio.repository;

import com.kumarmanglam.portfolio.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
