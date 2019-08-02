
package control;
import br.ufs.model.TipoExame;
import br.ufs.model.Exame;
import br.ufs.model.Paciente;

public class CadastrarExame {
    
    public void cadastrarExa(){
        System.out.println("--------Clinica Medica--------");
        System.out.println("Nome: "+Paciente.getNome());
        //System.out.println("Tipo do exame: "+TipoExame);
        System.out.println("Data: "+Exame.getHora());
        System.out.println("Hora: "+Exame.getHora());
        System.out.println("Diagnostico: "+Exame.getDiagnostico());
        
        
    }
    
    public void atualizarExa(){
    }
    
    public void visualizarExa(){
    }
    
    public void apagarExa(){
    }
    
    
    
}
