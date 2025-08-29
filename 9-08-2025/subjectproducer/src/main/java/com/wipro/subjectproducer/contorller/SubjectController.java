package com.wipro.subjectproducer.contorller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.subjectproducer.dto.Subject;
import com.wipro.subjectproducer.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	SubjectService stockService;
	
//	@PostMapping
//	void sendStockData(@RequestParam String sub)
//	{
//		stockService.sendStockData(sub);
//	}
	@PostMapping
	void sendStockData(@RequestBody Subject sub)
	{
		stockService.sendStockData(sub);
	}

}