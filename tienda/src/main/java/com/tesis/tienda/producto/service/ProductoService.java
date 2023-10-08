package com.tesis.tienda.producto.service;

import com.tesis.tienda.producto.entity.Producto;
import com.tesis.tienda.producto.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repository;

    //getall
    public List<Producto> getall() {
        return repository.findAll();
    }

    //getbyid
    public Producto getbyid(Integer id) {
        return repository.getById(id);
    }

    //create
    public Producto create(String Nombre,  Image Image,Long Codigo,String Descripcion, Integer Cantidad, double Precio) {
        return repository.save(Producto.builder().Nombre(Nombre).Image(Image).Codigo(Codigo)
                .Descripcion(Descripcion).Cantidad(Cantidad)
                .Precio(Precio).build());
    }

    //update
    public Producto update( String Nombre,  Image Image,Long Codigo,String Descripcion, Integer Cantidad, double Precio) {
        Producto obj = Producto.builder().Nombre(Nombre).Image(Image).Codigo(Codigo)
                .Descripcion(Descripcion).Cantidad(Cantidad)
                .Precio(Precio).build();
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
