/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Agenda;
import View.Cliente;
import View.MenuPrincipal;
import View.TelaServico;
import View.Usuario;
import java.sql.SQLException;

/**
 *
 * @author Felipe Santana
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
    public void navegarParaServico() throws SQLException{
        TelaServico servico = new TelaServico();
        servico.setVisible(true);
    }
    public void navegarParaUsuario(){
        Usuario usuario = new Usuario();
        usuario.setVisible(true);
        
    }
    public void navegarParaCliente(){
        Cliente cliente = new Cliente();
        cliente.setVisible(true);
    }
}
