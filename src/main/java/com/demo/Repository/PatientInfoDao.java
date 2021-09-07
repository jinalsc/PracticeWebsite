package com.demo.Repository;

import java.util.List;

import com.demo.Model.PatientInfo;


public interface PatientInfoDao {

	 public List<PatientInfo> getAllPatientInfo() ;
	 
	    public PatientInfo getPatientInfo(int id) ;
	 
	    public PatientInfo addPatientInfo(PatientInfo patientInfo);
	 
	    public PatientInfo updatePatientInfo(PatientInfo patientInfo, int id) ;
	 
	    public void deletePatientInfo(int id) ;
}
