package br.com.devph.crudaluno.dao;

import br.com.devph.crudaluno.model.Aluno;
import br.com.devph.crudaluno.util.conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    public void adicionar(Aluno aluno){
        String sql = "INSERT INTO aluno(nome, idade, email) VALUES(?, ?, ?)";

        try(Connection conn = conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, aluno.getEmail());
            stmt.execute();
            System.out.println("Aluno adicionado com sucesso!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
