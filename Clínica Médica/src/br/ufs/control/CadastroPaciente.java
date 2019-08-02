package control;

import br.ufs.model.Agenda;
import br.ufs.model.Especialidade;
import br.ufs.model.Medico;
import br.ufs.model.Paciente;

public class CadastrarConsulta {

    public CadastrarConsulta(){
    }

    public void cadastrarCon(){
        System.out.println("Buscar Especialidade: "+Especialidade.getNome());
        /**
         * comparar a especialidadpe digitada para ver se existe, se sim, segue
         * adiante, else, informa erro
        */
        //Visualizar Agenda, para ver horários disponíveis
        System.out.println("Dia da Consulta: "+Agenda.getData());
        System.out.println("Hora da Consulta: "+Agenda.getHora());
        /*Verificar dia e hora de Consulta para ver se tem médico disponível
        Achar alguma forma de ligar agenda a médico, pq ainda ñ tem.
        **/
        System.out.println("Medico: "+Medico.getNome());
        System.out.println("----Consulta cadastrada com sucesso!------");
        /*poderia ter um outro atributo em consulta, como tem no banco de dados
        na tabela de consulta. Existe um ID_consulta lá, isso pode ser transformado
        em um atributo chamado protocolo da classe consulta
        */
    }

    public void visualizarCon(){
        System.out.println("Digite CPF do Paciente: "+Paciente.getNome());
        /**
         *
         */
    }

    public void apagarCon(){
        System.out.println("Digite CPF do Paciente: "+Paciente.getCpf());
        //mostrar classe consulta
        //apagar a consulta
    }

    public void atualizarCon(){
        System.out.println("Digite CPF do Paciente: "+Paciente.getCpf());
        //mostrar classe consulta
        //atualizar
    }

    public void verifSituacaoCon(){
        System.out.println("Digite CPF do Paciente: "+Paciente.getCpf());
        //

    }
}
