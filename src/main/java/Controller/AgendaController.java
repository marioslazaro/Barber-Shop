
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author xbaco
 */
public class AgendaController {
    
   private final Agenda view;
   
   private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
   
    /**
     *
     */
    public void atualizaTabela(){
       AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
       ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
       
       helper.preencherTabela(agendamentos);
       
       
   }

    //public void atualizaTabela() {
        
    }
    

