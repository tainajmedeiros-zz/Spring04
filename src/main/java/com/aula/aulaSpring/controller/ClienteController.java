package com.aula.aulaSpring.controller;

import com.aula.aulaSpring.entity.Cliente;
import com.aula.aulaSpring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping( "api")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/cliente")
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente pessoa){
        try{
            return new ResponseEntity<>((Cliente) clienteService.add(pessoa), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable(value = "id") long id) {
        try{
            return new ResponseEntity<>((Cliente) clienteService.get(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/cliente/{id}")
    public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente pessoa, @PathVariable(value = "id") long id) {
        try{
            Optional<Cliente> cliente = clienteService.findById(id);
            if(cliente.isPresent()){
                pessoa.setID(cliente.get().getID());
                return new ResponseEntity<>((Cliente) clienteService.update(pessoa), HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/quantidadeClientes")
    public long qtdeCliente() {
        return clienteService.quantidaClientes();
    }
}
