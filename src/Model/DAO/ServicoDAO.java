/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Servico;
import com.mysql.cj.util.DnsSrv;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.ConnectionFactory;

/**
 *
 * @author Felipe Santana
 */
public class ServicoDAO {
    
    
    
    public void insert(Servico servico){
        
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            String sql = "INSERT INTO servico(id, descricao, valor) VALUES ( ?, ?, ?)";
            
            
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, servico.getId());
            stmt.setString(2, servico.getDescricao());
            stmt.setFloat(3, servico.getValor());
            
            stmt.execute();
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar o serviço", ex);
            
        } finally {
            try {
                if(stmt != null){
                    stmt.close();                    
                }
                if(conn != null){
                    conn.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar conexão", ex);
            }
        }
        
        
    }
    
    public List<Servico> read() throws SQLException{
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet  rs = null;
        
        List<Servico> servicos = new ArrayList<>();
        
        String sql = "SELECT id, descricao, valor from servico";
        
        
        
        
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Servico  servico = new Servico();
                
                servico.setId(rs.getInt("id"));
                servico.setDescricao(rs.getString("descricao"));
                servico.setValor(rs.getFloat("valor"));
                servicos.add(servico);
                
            }
            
        } catch (SQLException e) {
            
        }finally{
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
        
        return servicos;
    
    
    
    }
    
    
   public void update(Servico servico){
        
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            String sql = ("UPDATE servico SET descricao = ?, valor = ? WHERE id = ?");
            
            
            stmt = conn.prepareStatement(sql);
            
             stmt.setString(1, servico.getDescricao());
            stmt.setFloat(2, servico.getValor());
            stmt.setInt(3, servico.getId());
            
            
            stmt.execute();
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar o serviço", ex);
            
        } finally {
            try {
                if(stmt != null){
                    stmt.close();                    
                }
                if(conn != null){
                    conn.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar conexão", ex);
            }
        }
        
        
    }
    public void delete(Servico servico){
        
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            String sql = ("DELETE FROM servico WHERE id = ?");
            
            
            stmt = conn.prepareStatement(sql);
            
            
            stmt.setInt(1, servico.getId());
            
            
            stmt.execute();
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao excluido o serviço", ex);
            
        } finally {
            try {
                if(stmt != null){
                    stmt.close();                    
                }
                if(conn != null){
                    conn.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar conexão", ex);
            }
        }
        
        
    }
    
    
   
    
    
    public ArrayList<Servico> selectAll(){
        return Banco.servico;
    }
    
    
    private boolean idSaoIguais(Servico servico, Servico servicoAComparar) {
        return servico.getId() ==  servicoAComparar.getId();
    }
    
}
