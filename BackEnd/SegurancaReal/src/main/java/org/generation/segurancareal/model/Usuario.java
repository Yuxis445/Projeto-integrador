package org.generation.segurancareal.model;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    @NotBlank (message = "Por favor insira o Nome")
    @Size(min = 2, max = 100)
    private String nome;

    @NotBlank (message = "Por favor insira o e-mal")
<<<<<<< HEAD
    @Email
=======
    @Email(message = "O atributo Usuário deve ser um email válido!")
    @Size(min = 2)
>>>>>>> 585ca2f0f3cfe00d8794006f64d16737b9a749ed
    private String email;

    @NotBlank (message = "Por favor insira a senha de no minimo 6 caracteres")
    @Size(min = 6,  message = "A Senha deve ter no mínimo 6 caracteres")
    private String senha;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("usuario")
    private List<Postagem> postagem;
    
<<<<<<< HEAD
=======

>>>>>>> 585ca2f0f3cfe00d8794006f64d16737b9a749ed
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Postagem> getPostagem() {
        return postagem;
    }

    public void setPostagem(List<Postagem> postagem) {
        this.postagem = postagem;
    }
    
    
}