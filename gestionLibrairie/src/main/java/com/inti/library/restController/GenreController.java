package com.inti.library.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.library.entities.Genre;
import com.inti.library.services.interfaces.IGenreService;

@RestController
@CrossOrigin
public class GenreController {
	@Autowired
	IGenreService genreService;
	
	@GetMapping("/genres")
	public List<Genre> findAll() {
		return genreService.findAll();
	}
	@GetMapping("/genres/{idGenre}")
	public Genre findOne(@PathVariable("idGenre") Long id) {
		return genreService.findOne(id);
	}
	@PostMapping("/genres")
	public Genre saveGenre(@RequestBody Genre genre) {
		return genreService.save(genre);
	}
	@DeleteMapping("/genres/{idGenre}")
	public void deleteGenre(@PathVariable("idGenre") Long id) {
		genreService.delete(id);
	}
	@PutMapping("/genres/{idGenre}")
	public Genre updateGenre(@PathVariable("idGenre") Long id, @RequestBody Genre genre) {
		Genre currentGenre = genreService.findOne(id);
		currentGenre.setType(genre.getType());
		return genreService.save(currentGenre);
	}
}
