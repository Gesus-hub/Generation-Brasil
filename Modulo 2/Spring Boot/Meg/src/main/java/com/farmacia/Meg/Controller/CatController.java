package com.farmacia.Meg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.Meg.Model.Categoria;
import com.farmacia.Meg.Repository.CatRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CatController 
{
	@Autowired
	private CatRepository repositoryCategoria;

	@GetMapping
	public ResponseEntity<List<Categoria>> getAll() {

		return ResponseEntity.ok(repositoryCategoria.findAll());

	};

	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getById(@PathVariable Long id) {

		return repositoryCategoria.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());

	};

	@PostMapping
	public ResponseEntity<Categoria> postCategoria(@RequestBody Categoria categoria) {

		return ResponseEntity.ok(repositoryCategoria.save(Categoria));

	};

	@PutMapping
	public ResponseEntity<Categoria> putCategoria(@RequestBody Categoria Categoria) {

		return ResponseEntity.status(HttpStatus.OK).body(repositoryCategoria.save(Categoria));

	};
	
	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable Long id) {
		
		repositoryCategoria.deleteById(id);
		
	};
}
