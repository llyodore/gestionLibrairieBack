package com.inti.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.library.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{
	Genre findById(String idGenre);
}
