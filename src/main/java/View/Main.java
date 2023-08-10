/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author xbaco
 */
public class Main {
    
    public static void main(String[]args){
     String nome = "Mario";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "Barba", 30);
        
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1, "Mario", "Rua Teste", "12122-12");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "barbeiro", "senha");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "13/08/2023 09:30");
        System.out.println(agendamento.getCliente().getNome());
    }
    
}
