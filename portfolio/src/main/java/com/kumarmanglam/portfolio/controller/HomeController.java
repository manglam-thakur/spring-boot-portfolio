package com.kumarmanglam.portfolio.controller;

import com.kumarmanglam.portfolio.model.Message;
import com.kumarmanglam.portfolio.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final MessageService messageService;

    public HomeController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/projects")
    public String projects() {
        return "projects";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("messageForm", new Message());
        return "contact";
    }

    @PostMapping("/sendMessage")
    public String sendMessage(@ModelAttribute("messageForm") Message message, Model model) {
        messageService.save(message);
        model.addAttribute("status", "Message sent. Thanks!");
        model.addAttribute("messageForm", new Message());
        return "contact";
    }
}
