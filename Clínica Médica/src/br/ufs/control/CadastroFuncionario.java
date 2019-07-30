package control;

import br.ufs.model.Endereco;
import br.ufs.model.Funcionario;

public class CadastroFuncionario {

    public void cadastrarFunc(){
        System.out.println("--------Clinica Medica--------");
        System.out.println("Nome: "+Funcionario.getNome());
        //Condição para verificar se nome digitado do funcionario já existe
        System.out.println("CPF: "+Funcionario.getCpf());
        System.out.println("Matricula: "+Funcionario.getMatricula());
        System.out.println("Telefone: "+Funcionario.getTelefone());
        System.out.println("Data de Nascimento: "+Funcionario.getDt_nasc());
        System.out.println("Logradouro: "+Endereco.getLogradouro());
        System.out.println("Numero: "+Endereco.getNumero());
        System.out.println("Bairro: "+Endereco.getBairro());
        System.out.println("Cidade: "+Endereco.getCidade());
        System.out.println("Estado: "+Endereco.getEstado());
        System.out.println("CEP: "+Endereco.getCep());
        System.out.println("-----------------------------");

    }

    public void atualizarFunc(){
        System.out.println("Digite o nome do funcionario: "+Funcionario.getNome());
        /**comparar o nome para verificar se existe no cadastro ou não, se sim,
         * chama função cadastrarFunc() do funcionario digitado, else, informa
         * o erro
        */

    }

    public void consultarFunc(){
        /**comparar o nome para verificar se existe no cadastro ou não, se sim,
         * chama função cadastrarFunc(), else, informa o erro
        */
    }

    public void apagarFunc(){
        /**comparar o nome para verificar se existe no cadastro ou não, se sim,
         * chama função cadastrarPaciente() para o processo de apagar cadastro,
         * else, informa o erro
        */
    }

}
