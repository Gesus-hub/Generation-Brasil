package com.farmacia.Meg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.Meg.Model.Categoria;

@Repository
public class CatRepository extends JpaRepository<Categoria, Long>
{
	
}
