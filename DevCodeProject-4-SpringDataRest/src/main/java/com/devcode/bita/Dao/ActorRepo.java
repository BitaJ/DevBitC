package com.devcode.bita.Dao;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.devcode.bita.model.Actor;

@Transactional
@RepositoryRestResource(collectionResourceRel="actors", path="actors")
public interface ActorRepo extends JpaRepository<Actor, Integer>{
	

}
