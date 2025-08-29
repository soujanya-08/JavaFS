package com.wipro.subjectproducer.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.subjectproducer.dto.Subject;
import com.wipro.subjectproducer.service.SubjectService;

@Service
public class SubjectImpl implements SubjectService{
	
	@Autowired
	KafkaTemplate<String,Subject> kafkTemplate;

	@Override
	public void sendStockData(Subject sub) {
		kafkTemplate.send("learn-subject",sub);
		
	}

}