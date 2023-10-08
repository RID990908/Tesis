package com.tesis.tienda.usuario.service;

import com.tesis.tienda.usuario.entity.Usuario;
import com.tesis.tienda.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    //getall
    public List<Usuario> getall() {
        return repository.findAll();
    }

    //getbyid
    public Usuario getbyid(Integer id) {
        return repository.getById(id);
    }

    //create
    public Usuario create(Integer id,String Nombre,String Apellido,String CI,String Telefono,String Correo,String CuentaUsuario) {
        return repository.save(Usuario.builder().id(id).Nombre(Nombre)
                .Apellido(Apellido).CI(CI).Telefono(Telefono).Correo(Correo).CuentaUsuario(CuentaUsuario).build());
    }

    //update
    public Usuario update(Integer id,String Nombre,String Apellido,String CI,String Telefono,String Correo,String CuentaUsuario) {
        Usuario obj = Usuario.builder().id(id).Nombre(Nombre)
                .Apellido(Apellido).CI(CI).Telefono(Telefono).Correo(Correo).CuentaUsuario(CuentaUsuario).build();
        return repository.save(obj);
    }

    //delete
    public boolean delete(Integer id) {
        repository.deleteById(id);
        return true;
    }

    //deleteall
    public boolean deleteAll() {
        repository.deleteAll();
        return true;
    }
}


