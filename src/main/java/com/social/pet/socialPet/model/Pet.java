package com.social.pet.socialPet.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Pet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipo;
    private String raca;
    private Boolean perdido;
    private String descricao;
    private String latitudePerdido;
    private String longitudePerdido;
    private String latitudeEncontrado;
    private String longitudeEncontrado;
    @ManyToOne
    private Dono dono;

    private String foto;

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getPerdido() {
        return perdido;
    }

    public void setPerdido(Boolean perdido) {
        this.perdido = perdido;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public String getLatitudePerdido() {
        return latitudePerdido;
    }

    public void setLatitudePerdido(String latitudePerdido) {
        this.latitudePerdido = latitudePerdido;
    }

    public String getLongitudePerdido() {
        return longitudePerdido;
    }

    public void setLongitudePerdido(String longitudePerdido) {
        this.longitudePerdido = longitudePerdido;
    }

    public String getLongitudeEncontrado() {
        return longitudeEncontrado;
    }

    public void setLongitudeEncontrado(String longitudeEncontrado) {
        this.longitudeEncontrado = longitudeEncontrado;
    }

    public String getLatitudeEncontrado() {
        return latitudeEncontrado;
    }

    public void setLatitudeEncontrado(String latitudeEncontrado) {
        this.latitudeEncontrado = latitudeEncontrado;
    }
}
