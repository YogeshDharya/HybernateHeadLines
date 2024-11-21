package main.com.controllers;

import main.com.entities.*;
import main.com.re
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/history")
public class HistoryController {

    @Autowired
    private HistoryRepository historyRepository;

    @PostMapping("/add")
    public String addHistory(@RequestParam Long userId, @RequestParam String newsId) {
        History history = new History(userId, newsId, LocalDateTime.now().toString());
        historyRepository.save(history);
        return "History recorded successfully!";
    }
}
