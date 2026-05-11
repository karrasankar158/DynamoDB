package com.fsd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fsd.entity.Summary;
import com.fsd.repository.SummaryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SummaryServiceImpl implements SummaryService {

    private final SummaryRepository summaryRepository;

    @Override
    public List<Summary> getSummaryList() {
        return (List<Summary>) summaryRepository.findAll();
    }

    @Override
    public Summary saveSummary(Summary summary) {
        return summaryRepository.save(summary);
    }

    @Override
    public Summary getSummary(String id) {

        return summaryRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Summary Not Found : " + id));
    }
}
