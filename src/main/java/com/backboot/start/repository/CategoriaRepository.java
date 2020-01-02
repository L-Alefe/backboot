package com.backboot.start.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backboot.start.models.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{}
