/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe Santana
 */
public class AgendaHelper implements IHelper{
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        
      DefaultTableModel tableModel  =  (DefaultTableModel) view.getjTableConsulta().getModel();
      tableModel.setNumRows(0);
      //Percorrer a lista preenchendo o table Model
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(
                    new Object[]{
                     agendamento.getId(),
                     agendamento.getCliente().getNome(),
                     agendamento.getServico().getDescricao(),
                     agendamento.getValor(),
                     agendamento.getDataFormatada(),
                     agendamento.getHoraFormatada(),
                     agendamento.getObservacao()
                    
            });
            
        }
        
        
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente); //aqui esta o truque
            
            
        }
        
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
            
        }
    }
    
    public Cliente obterCliente() {
        return (Cliente) view.getjComboBoxCliente().getSelectedItem();
        
    }
    
    public Servico obterServico() {
        return (Servico) view.getjComboBoxServico().getSelectedItem();
        
    }

    public void setarValor(float valor) {
        view.getjTextFieldValor().setText(valor+"");
    }

    @Override
    public Agendamento obterModelo() {
        
        String idString = view.getjTextId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getjTextFieldValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getjFormattedTextFieldData().getText();
        String hora = view.getjFormattedTextFieldHora().getText();
        String dataHora = data + " "+ hora;
        String observacao = view.getjTextAreaObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        return agendamento;
        
        
    }

    @Override
    public void limparTela() {
        view.getjTextId().setText("0");
        view.getjFormattedTextFieldData().setText("");
        view.getjFormattedTextFieldHora().setText("");
        view.getjTextAreaObservacao().setText("");
        
        
    }
    
     
    
    
    
   
}
