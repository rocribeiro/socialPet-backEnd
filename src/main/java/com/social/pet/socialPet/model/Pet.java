package com.social.pet.socialPet.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
    private Double latitudePerdido;
    private Double longitudePerdido;
    private Double latitudeEncontrado;
    private Double longitudeEncontrado;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dono_id")
    private Dono dono;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] foto;

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
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

    public Double getLatitudePerdido() {
        return latitudePerdido;
    }

    public void setLatitudePerdido(Double latitudePerdido) {
        this.latitudePerdido = latitudePerdido;
    }

    public Double getLongitudePerdido() {
        return longitudePerdido;
    }

    public void setLongitudePerdido(Double longitudePerdido) {
        this.longitudePerdido = longitudePerdido;
    }

    public Double getLongitudeEncontrado() {
        return longitudeEncontrado;
    }

    public void setLongitudeEncontrado(Double longitudeEncontrado) {
        this.longitudeEncontrado = longitudeEncontrado;
    }

    public Double getLatitudeEncontrado() {
        return latitudeEncontrado;
    }

    public void setLatitudeEncontrado(Double latitudeEncontrado) {
        this.latitudeEncontrado = latitudeEncontrado;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
}
