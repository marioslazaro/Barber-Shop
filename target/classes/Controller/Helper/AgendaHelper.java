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
 * @author xbaco
 */
public class AgendaHelper implements IHelper {
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
       
       DefaultTableModel tableModel =  (DefaultTableModel) view.getTableAgendamentos().getModel();
       tableModel.setNumRows(0);
       
       
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObersavacao()    
        });
            
        }
    }
    
     public Cliente obterCliente() {
        return (Cliente)view.getJComboBoxCliente().getSelectedItem();
        
    }

     public void preencherClientes(ArrayList<Cliente> clientes) {

          DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJComboBoxCliente().getModel();

        for (Cliente cliente : clientes) {

            comboBoxModel.addElement(cliente);

        }

     }

    public void preencherServicos(ArrayList<Servico> servicos) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
        
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
            
        }
               
    }

     
   
    public Servico obterServico() {
        return (Servico)view.getjComboBoxServico().getSelectedItem();
        
    }

    public void setarValor(float valor) {
        
        view.getTxtValor().setText(valor+"");
    }

    @Override
    public Agendamento obterModelo() {
        String idString = view.getTxtBoxId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getTxtValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getTextFormatedData().getText();
        String hora = view.getTextFormatedHora().getText();   
        String dataHora = data + " " + hora;
        String observacao = view.getTextObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        
        return agendamento;
    }

    @Override
    public void limparTela() {
        view.getTxtBoxId().setText("0");
        view.getTextFormatedHora().setText("");
        view.getTextFormatedData().setText("");
        view.getTextObservacao().setText("");
        
    }
    

    
}
    

