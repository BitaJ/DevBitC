package com.devcode.bita.Dao;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.devcode.bita.model.Movie;

	@Transactional
	@RepositoryRestResource(collectionResourceRel="movies", path="movies")
	public interface MovieRepro extends JpaRepository<Movie, Integer>{
				

	}

