package com.tesis.tienda.usuario.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nombre")
    private String Nombre;

    @Column(name = "apellido")
    private String Apellido;

    @Column(name = "ci")
    private String CI;

    @Column(name = "telefono")
    private String Telefono;

    @Column(name = "correo")
    private String Correo;

    @Column(name = "Cuenta_usuario")
    private String CuentaUsuario;

}
