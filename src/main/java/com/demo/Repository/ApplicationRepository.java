package com.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.Model.PatientInfo;

public interface ApplicationRepository extends CrudRepository<PatientInfo, Integer>{

}
