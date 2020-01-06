package com.backboot.start.repository;
import com.backboot.start.models.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<CategoriaModel, Long> {
}
