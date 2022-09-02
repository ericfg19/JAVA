package br.edu.infnet.springmvc.model.service;

import br.edu.infnet.springmvc.model.domain.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    private Connection conn;
    
    public AlunoService() {
        conn = ConexaoBD.abrirConexao();
    }
    
    public List<Aluno> consultarAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        String comando = "SELECT * FROM alunos";
        
        try {
            PreparedStatement ps = conn.prepareStatement(comando);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                alunos.add(new Aluno(id, nome, telefone));
            }
            rs.close();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }        
        return alunos;
    }
}
