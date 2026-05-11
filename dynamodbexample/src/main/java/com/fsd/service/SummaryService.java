package com.fsd.service;

import java.util.List;

import com.fsd.entity.Summary;

public interface SummaryService {
	Summary saveSummary(Summary summary);
	Summary getSummary(String id);
	List<Summary> getSummaryList();
}
