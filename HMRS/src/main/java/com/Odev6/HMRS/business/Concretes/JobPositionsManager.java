package com.Odev6.HMRS.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Odev6.HMRS.business.Abstract.JobPositionsService;
import com.Odev6.HMRS.dataAccess.JobPositionsDao;
import com.Odev6.HMRS.entities.JobPositions;

public class JobPositionsManager implements JobPositionsService {
		
	private JobPositionsDao jobPositionsDao;
	
	
	@Autowired
	public JobPositionsManager(JobPositionsDao jobPositionsDao) {
		super();
		this.jobPositionsDao = jobPositionsDao;
	}



	@Override
	public List<JobPositions> getAll() {
		
		return this.jobPositionsDao.findAll();
	}

}
