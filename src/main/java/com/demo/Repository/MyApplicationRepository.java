package com.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import com.demo.Model.User;

public interface MyApplicationRepository extends CrudRepository<User, Integer>{

}
