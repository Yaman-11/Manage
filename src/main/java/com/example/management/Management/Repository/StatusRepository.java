package com.example.management.Management.Repository;

import com.example.management.Management.Entity.Status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends CrudRepository<Status,Integer> {

}
