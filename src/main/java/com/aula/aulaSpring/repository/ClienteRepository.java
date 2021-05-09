package com.aula.aulaSpring.repository;

import com.aula.aulaSpring.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Long> {

    Cliente findById(long id);
}
