
package br.ufs.model;

import br.ufs.dao.ConsultaDAO;
import javax.swing.JOptionPane;

public class Consulta {
    private String dataModelConsulta;
    private String horaModelConsulta;
    private boolean situacaoModelConsulta;
    private String descricaoModelConsulta;
    private String diagnosticoModelConsulta;

    public String getDataModelConsulta() {
        return dataModelConsulta;
    }

    public void setDataModelConsulta(String dataModelConsulta) {
        this.dataModelConsulta = dataModelConsulta;
    }

    public String getHoraModelConsulta() {
        return horaModelConsulta;
    }

    public void setHoraModelConsulta(String horaModelConsulta) {
        this.horaModelConsulta = horaModelConsulta;
    }

    public boolean isSituacaoModelConsulta() {
        return situacaoModelConsulta;
    }

    public void setSituacaoModelConsulta(boolean situacaoModelConsulta) {
        this.situacaoModelConsulta = situacaoModelConsulta;
    }

    public String getDescricaoModelConsulta() {
        return descricaoModelConsulta;
    }

    public void setDescricaoModelConsulta(String descricaoModelConsulta) {
        this.descricaoModelConsulta = descricaoModelConsulta;
    }

    public String getDiagnosticoModelConsulta() {
        return diagnosticoModelConsulta;
    }

    public void setDiagnosticoModelConsulta(String diagnosticoModelConsulta) {
        this.diagnosticoModelConsulta = diagnosticoModelConsulta;
    }
    
    public void salvar(Consulta consulta){
        try{
            ConsultaDAO conDAO = new ConsultaDAO();
            conDAO.add(consulta);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    
    
}
