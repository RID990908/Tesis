package com.tesis.tienda.producto.controller;

import com.tesis.tienda.producto.entity.Producto;
import com.tesis.tienda.producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/Tienda/Almacen", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductoController {
    @Autowired
    private ProductoService service;

    @GetMapping(value = "/")
    public ResponseEntity root() {
        return ResponseEntity.ok(service.getall());
    }

    @PutMapping(value = "/Update")
    public ResponseEntity Update(@PathVariable Integer id, @RequestBody Producto producto) {
        Producto obj = service.getbyid(id);
        return ResponseEntity.ok(service.update(obj.getNombre(), obj.getImage(), obj.getCodigo(), obj.getDescripcion()
                , obj.getCantidad(), obj.getPrecio()));
    }

    @PutMapping(value = "/Create")
    public ResponseEntity Create(@RequestBody Producto producto) {
        return ResponseEntity.ok(service.create(producto.getNombre(), producto.getImage(),
                producto.getCodigo(), producto.getDescripcion()
                , producto.getCantidad(), producto.getPrecio()));
    }

    @DeleteMapping(value = "/Delete")
    public ResponseEntity Delete(@PathVariable Integer id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
