package org.example.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int matricula, periodo;
    private String nome,telefone, curso, email, obs;

    // Construtor vazio — obrigatório para o JPA
    public Aluno() {}

    public Aluno(
            int matricula,
            String telefone,
            String nome,
            String curso,
            int periodo,
            String email,
            String obs
    ){

        this.matricula = matricula;
        this.telefone = telefone;
        this.nome = nome;
        this.curso = curso;
        this.periodo = periodo;
        this.email = email;
        this.obs = obs;
    }

    public int getId() { return id; }

    public int getMatricula() {

        return matricula;

    }

    public void setMatricula(int matricula) {

        this.matricula = matricula;

    }

    public String getTelefone() {

        return telefone;

    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getCurso() {

        return curso;

    }

    public void setCurso(String curso) {

        this.curso = curso;

    }

    public int getPeriodo() {

        return periodo;

    }

    public void setPeriodo(int periodo) {

        this.periodo = periodo;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getObs() {

        return obs;

    }

    public void setObs(String obs) {

        this.obs = obs;

    }
}