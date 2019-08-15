
package br.ufs.model;

import br.ufs.dao.AgendaDAO;
import javax.swing.JOptionPane;

public class Agenda {
    private String dataModelAgenda;
    private String horaModelAgenda;
    
    public Agenda(){
    }

    public String getDataModelAgenda() {
        return dataModelAgenda;
    }

    public void setDataModelAgenda(String dataModelAgenda) {
        this.dataModelAgenda = dataModelAgenda;
    }

    public String getHoraModelAgenda() {
        return horaModelAgenda;
    }

    public void setHoraModelAgenda(String horaModelAgenda) {
        this.horaModelAgenda = horaModelAgenda;
    }
    
    public void salvar(Agenda agenda){
        try{
            AgendaDAO agDAO = new AgendaDAO();
            agDAO.add(agenda);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }


}
