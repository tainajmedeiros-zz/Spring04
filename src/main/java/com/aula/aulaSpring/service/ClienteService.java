package com.aula.aulaSpring.service;

import com.aula.aulaSpring.entity.Cliente;
import com.aula.aulaSpring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //Adicionar Cliente
    public Cliente add(Object object) {
        return clienteRepository.save((Cliente) object);
    }
    //Pesquisar um Cliente
    public Cliente get(long id) {
        return clienteRepository.findById(id);
    }
    //Atualiza dados do Cliente
    public Cliente update(Object object) {
        return clienteRepository.save((Cliente) object);
    }
    //Conta quando clientes foram inseridos no banco
    public long quantidaClientes() {
        return clienteRepository.count();
    }
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }
}
