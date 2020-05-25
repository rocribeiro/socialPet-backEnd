package com.social.pet.socialPet.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
public class Dono implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String email;
    private String nome;
    private String celular;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
