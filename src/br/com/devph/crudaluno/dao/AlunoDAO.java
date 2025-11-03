package br.com.devph.crudaluno.dao;

import br.com.devph.crudaluno.model.Aluno;
import br.com.devph.crudaluno.util.conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    public void adicionar(Aluno aluno) {
        String sql = "INSERT INTO aluno(nome, idade, email) VALUES(?, ?, ?)";

        try (Connection conn = conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, aluno.getEmail());
            stmt.execute();
            System.out.println("Aluno adicionado com sucesso!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }



    public List<Aluno> listagemAlunos(){
        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM aluno";

        try(Connection conn = conexao.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while(rs.next()){
                Aluno a = new Aluno();
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setIdade(rs.getInt("idade"));
                a.setEmail(rs.getString("email"));
                lista.add(a);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
            return lista;
        }


    }
}
