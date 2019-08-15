
package br.ufs.model;
import br.ufs.dao.MedicoDAO;
import javax.swing.JOptionPane;

public class Medico extends Funcionario {
    private int crmModelMedico;

    public int getCrmModelMedico() {
        return crmModelMedico;
    }

    public void setCrmModelMedico(int crmModelMedico) {
        this.crmModelMedico = crmModelMedico;
    }
    
    public void salvar(Medico medico){
        try{
            MedicoDAO medDAO = new MedicoDAO();
            medDAO.add(medico);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
