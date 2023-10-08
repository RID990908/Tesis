package com.tesis.tienda.usuario.controller;

import com.tesis.tienda.usuario.entity.Usuario;
import com.tesis.tienda.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/Tienda/Usuario",produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @GetMapping(value = "/")
    public ResponseEntity root() {
        return ResponseEntity.ok(service.getall());
    }

    @PutMapping(value = "/Update")
    public ResponseEntity Update(@RequestBody Usuario usuario) {
        Usuario obj = service.getbyid(usuario.getId());
        return ResponseEntity.ok(service.update(obj.getId(), obj.getNombre(), obj.getApellido()
                , obj.getCI(), obj.getTelefono(), obj.getCorreo(), obj.getCuentaUsuario()));
    }

    @PutMapping(value = "/Create")
    public ResponseEntity Create(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(service.create(usuario.getId(), usuario.getNombre(), usuario.getApellido()
                , usuario.getCI(), usuario.getTelefono(), usuario.getCorreo(), usuario.getCuentaUsuario()));
    }

    @DeleteMapping(value = "/Delete")
    public ResponseEntity Delete(@PathVariable Integer id){
        return ResponseEntity.ok(service.delete(id));
    }
}


