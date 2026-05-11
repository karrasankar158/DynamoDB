package com.fsd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.entity.Summary;
import com.fsd.service.SummaryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SummaryController {

    private final SummaryService summaryService;

    @PostMapping("/summary")
    public ResponseEntity<Summary> saveSummary(@RequestBody Summary summary) {
        return ResponseEntity.ok(summaryService.saveSummary(summary));
    }

    @GetMapping("/summary/{id}")
    public ResponseEntity<Summary> getSummary(@PathVariable String id) {
        return ResponseEntity.ok(summaryService.getSummary(id));
    }
}

