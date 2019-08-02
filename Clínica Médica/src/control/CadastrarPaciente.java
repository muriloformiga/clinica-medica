/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import br.ufs.model.Endereco;
import br.ufs.model.Paciente;
import br.ufs.model.Prontuario;

public class CadastrarPaciente {
    public CadastrarPaciente(){
    }
    
    public void cadastrarPac(){
        System.out.println("--------Clinica Medica--------");
        System.out.println("Nome: "+Paciente.getNome());
        System.out.println("CPF: "+Paciente.getCpf());
        System.out.println("Código do Paciente: "+Paciente.getCod_pac());
        System.out.println("Telefone: "+Paciente.getFone());
        System.out.println("Data de Nascimento: "+Paciente.getDt_nasc());
        System.out.println("Logradouro: "+Endereco.getLogradouro());
        System.out.println("Numero: "+Endereco.getNumero());
        System.out.println("Bairro: "+Endereco.getBairro());
        System.out.println("Cidade: "+Endereco.getCidade());
        System.out.println("Estado: "+Endereco.getEstado());
        System.out.println("CEP: "+Endereco.getCep());
        System.out.println("Exames feitos: "+Prontuario.getListExamesFeitos());
        System.out.println("Prescrição de Remédios: "+Prontuario.getPrescricaoRemedios());
        System.out.println("Observações Médicas: "+Prontuario.getObservacoesMedicas());
        System.out.println("-----------------------------");
    }
    
    public void atualizarPac(){
        System.out.println("Digite o nome do paciente: "+Paciente.getNome());
        /**comparar o nome para verificar se existe no cadastro ou não, se sim, 
         * chama função cadastrarPaciente() do paciente digitado, else, informa 
         * o erro
        */
 
    }
    
    public void visualizarPac(){
        System.out.println("Digite o nome do paciente: "+Paciente.getNome());
        /**comparar o nome para verificar se existe no cadastro ou não, se sim, 
         * chama função cadastrarPaciente(), else, informa o erro
        */
    }
    
    public void apagarPac(){
        System.out.println("Digite o nome do paciente: "+Paciente.getNome());
        /**comparar o nome para verificar se existe no cadastro ou não, se sim, 
         * chama função cadastrarPaciente() para o processo de apagar cadastro,
         * else, informa o erro
        */
    }
    
}
