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

import com.farmacia.Meg.Model.Produto;
import com.farmacia.Meg.Repository.ProdRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdController 
{
	@Autowired
	private ProdRepository produtoRepository;

	@GetMapping
	public ResponseEntity<List<Produto>> getAll() {

		return ResponseEntity.ok(produtoRepository.findAll());

	};

	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable Long id) {

		return produtoRepository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());

	};
	
	@GetMapping("descricao/{descricao}")
	public ResponseEntity<List<Produto>> getByDescricao(@PathVariable String descricao) {

		return ResponseEntity.ok(produtoRepository
				.findAllByDescricaoContainingIgnoreCase(descricao));
		
	};

	@PostMapping
	public ResponseEntity<Produto> postCategoria(@RequestBody Produto produto) {

		return ResponseEntity.ok(produtoRepository.save(produto));

	};

	@PutMapping
	public ResponseEntity<Produto> putCategoria(@RequestBody Produto produto) {

		return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produto));

	};
	
	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable Long id) {
		
		produtoRepository.deleteById(id);
		
	};
}
