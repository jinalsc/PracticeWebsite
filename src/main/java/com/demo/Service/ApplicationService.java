package com.demo.Service;


import java.util.Optional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Service;

import com.demo.Model.PatientInfo;
import com.demo.Repository.ApplicationRepository;
import com.demo.Repository.PatientInfoDao;

@Service
public class ApplicationService {

	@Autowired
	private ApplicationRepository repo;
	
	@Autowired
	private PatientInfoDao dao;

	public void createUser(PatientInfo info) {
		//SessionFactory sessionFactory1 = HibernateUtil.getSessionFactory();
		//repo.save(info);
		dao.addPatientInfo(info);
	}

	public Optional<PatientInfo> getUserInfo(int id) {
		return repo.findById(id);
	}

	public PatientInfo updateInfo(PatientInfo info, int id) {
		return dao.updatePatientInfo(info, id);
	}
}
