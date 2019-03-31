package com.social.pet.socialPet.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Dono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dono_id")
    private Long id;
    private String nome;
   @OneToOne(mappedBy="dono",cascade= CascadeType.ALL, fetch=FetchType.EAGER)
    private Endereco endereco;
    private String email;
    private String celular;
    @OneToMany(mappedBy="dono",cascade= CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Pet> pets;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
