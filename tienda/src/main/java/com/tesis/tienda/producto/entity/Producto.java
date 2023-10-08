package com.tesis.tienda.producto.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "nombre")
    private String Nombre;

    @Column(name = "imagen")
    private Image Image;

    @Column(name = "codigo")
    private Long Codigo;

    @Column(name = "descripcion")
    private String Descripcion;

    @Column(name = "cantidad")
    private Integer Cantidad;

    @Column(name = "precio")
    private double Precio;


}
