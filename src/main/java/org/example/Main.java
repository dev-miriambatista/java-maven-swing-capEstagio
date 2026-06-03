package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Model.Aluno;
import org.example.Model.Empresa;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CapEStoque");
        EntityManager em = emf.createEntityManager();

        // --- Salvar Aluno ---
        Aluno aluno = new Aluno();
        aluno.setMatricula(123456);
        aluno.setTelefone("41984539456");// String, sem código de país
        aluno.setNome("meu nome");
        aluno.setCurso("nome do curso");
        aluno.setPeriodo(1);
        aluno.setEmail("meunome@senac.com");
        aluno.setObs("observações");

        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();

        System.out.println("Aluno salvo com ID: " + aluno.getId());

        // --- Salvar Empresa ---
        Empresa empresa = new Empresa();
        empresa.setCNPJ("12.345.678/0001-99");
        empresa.setrSocial("Razão Social Ltda");
        empresa.setNFantasia("Nome Fantasia");
        empresa.setEndereco("Rua Exemplo, 100 - Curitiba/PR");
        empresa.setTel("4130000000");
        empresa.setContato("João Santos");

        em.getTransaction().begin();
        em.persist(empresa);
        em.getTransaction().commit();

        System.out.println("Empresa salva com ID: " + empresa.getId());

        em.close();
        emf.close();
    }
}