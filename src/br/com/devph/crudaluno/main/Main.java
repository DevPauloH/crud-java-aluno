package br.com.devph.crudaluno.main;

import br.com.devph.crudaluno.dao.AlunoDAO;
import br.com.devph.crudaluno.model.Aluno;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlunoDAO alunoDAO = new AlunoDAO();

       Aluno primario = new Aluno("Paulo Henrique Borges", 20, "henriquedsg15@gmail.com");
        alunoDAO.adicionar(primario);

        Aluno secundario = new Aluno("Vanessa Santana Dos Santos", 18, "vasantos18@gmail.com");
        alunoDAO.adicionar(secundario);


        List<Aluno> alunoList = alunoDAO.listagemAlunos();
        for (Aluno a : alunoList) {
            System.out.println(a.getId() + " - " + a.getNome());
        }


      /* primario.setId(1);
        primario.setNome("Paulo Henrique Borges Rosa");
        alunoDAO.atualizar(primario);

        alunoDAO.excluir(2); */

    }
}