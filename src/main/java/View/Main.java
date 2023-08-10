/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author xbaco
 */
public class Main {
    
    public static void main(String[]args){
     String nome = "Thiago";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "Barba", 30);
        
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1, "Mario", 'M', "993151515", "Rua BMW X6");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "barbeiro", "senha");
        System.out.println(usuario);
   
    }
    
}
