package com.Customer.ParcticeProjet1.Repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.Customer.ParcticeProjet1.Bean.*;
@Repository
@Configuration
public interface UserRespossitory extends CrudRepository<Users, Integer> {

public Users findByName(String name);
}