package com.demo.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.Model.PatientInfo;

@Repository
public class PatientInfoDaoImpl implements PatientInfoDao{
 
    @Autowired
    private SessionFactory sessionFactory;

    Session session;
    Transaction tx;
 
    public List<PatientInfo> getAllPatientInfo() {
    	session = this.sessionFactory.openSession();
        List<PatientInfo>  customerList = session.createQuery("from Customer").list();
        tx.commit();
        session.close();
        return customerList;
    }
 
    public PatientInfo getPatientInfo(int id) {
    	session = this.sessionFactory.openSession();
        PatientInfo customer = (PatientInfo) session.get(PatientInfo.class, id);
        tx.commit();
        session.close();
        return customer;
    }
 
    public PatientInfo addPatientInfo(PatientInfo customer) {
    	session = this.sessionFactory.openSession();
    	tx = session.beginTransaction();
        session.save(customer);
        tx.commit();
        session.close();
        return customer;
    }
 
    public PatientInfo updatePatientInfo(PatientInfo customer, int id){
    	session = this.sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	customer.setId(id);
        session.update(customer);
        tx.commit();
        session.close();
        return customer;
    }
 
    public void deletePatientInfo(int id) {
    	session = this.sessionFactory.openSession();
        PatientInfo p = (PatientInfo) session.load(PatientInfo.class, new Integer(id));
        if (null != p) {
            session.delete(p);
        }
        tx.commit();
        session.close();
    }

}
