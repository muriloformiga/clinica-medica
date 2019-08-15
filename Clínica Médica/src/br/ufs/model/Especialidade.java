
package br.ufs.model;

import br.ufs.dao.EspecialidadeDAO;
import javax.swing.JOptionPane;


public class Especialidade {
    private String nomeModelEspecialidade;

    public String getNomeModelEspecialidade() {
        return nomeModelEspecialidade;
    }

    public void setNomeModelEspecialidade(String nomeModelEspecialidade) {
        this.nomeModelEspecialidade = nomeModelEspecialidade;
    }

    public void salvar(Especialidade especialidade){
        try{
            EspecialidadeDAO espDAO = new EspecialidadeDAO();
            espDAO.add(especialidade);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
