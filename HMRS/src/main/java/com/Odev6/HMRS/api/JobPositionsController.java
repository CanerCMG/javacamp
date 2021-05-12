package com.Odev6.HMRS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Odev6.HMRS.business.Abstract.JobPositionsService;
import com.Odev6.HMRS.entities.JobPositions;

@RestController
@RequestMapping("api/jobs")

public class JobPositionsController {

	private JobPositionsService jobPositionsService;
		
	
	@Autowired
	public JobPositionsController(JobPositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}
	@GetMapping("/getAll")
	public List<JobPositions> getAll(){
		
		return this.jobPositionsService.getAll();
	};
	
	
	
}
