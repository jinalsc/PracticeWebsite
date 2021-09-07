package com.demo.Service;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.demo.Model.User;
import com.demo.Repository.MyApplicationRepository;

@Service
@Transactional
public class MyApplicationService {

	private final MyApplicationRepository repo;
	
	public MyApplicationService(MyApplicationRepository repo) {
		this.repo = repo;
	}

	public void saveUser(User user) {
		repo.save(user);
	}

}
