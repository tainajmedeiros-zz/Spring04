package com.aula.aulaSpring.service;

import com.aula.aulaSpring.entity.Venda;
import com.aula.aulaSpring.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    //Adicionar Venda
    public Venda add(Object object) {
        return vendaRepository.save((Venda) object);
    }
    //Mostrar uma Venda
    public Venda get(long id) {
        return vendaRepository.findById(id);
    }
    //Atualiza dados da Venda
    public Venda update(Object object) {
        return vendaRepository.save((Venda) object);
    }
    public Optional<Venda> findById(Long id) {
        return vendaRepository.findById(id);
    }

}
