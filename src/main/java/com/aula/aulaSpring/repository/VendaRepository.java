package com.aula.aulaSpring.repository;

import com.aula.aulaSpring.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

    Venda findById(long id);
}
