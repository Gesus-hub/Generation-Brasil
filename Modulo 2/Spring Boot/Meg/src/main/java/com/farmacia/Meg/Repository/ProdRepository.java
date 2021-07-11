package com.farmacia.Meg.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.Meg.Model.Produto;

@Repository
public class ProdRepository extends JpaRepository<Produto, Long> 
{
	public List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);
}
