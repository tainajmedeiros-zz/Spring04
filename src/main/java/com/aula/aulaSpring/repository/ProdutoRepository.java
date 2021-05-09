package com.aula.aulaSpring.repository;

import com.aula.aulaSpring.entity.Cliente;
import com.aula.aulaSpring.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findById(long id);

}
