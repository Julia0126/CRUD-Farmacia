package com.generation.crud_farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.crud_farmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
