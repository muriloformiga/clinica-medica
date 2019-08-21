
package br.ufs.model;

import br.ufs.dao.EnderecoDAO;


public class Endereco {
    private String logradouroModelEndereco;
    private int numeroModelEndereco;
    private String bairroModelEndereco;
    private String cidadeModelEndereco;
    private String estadoModelEndereco;
    private String cepModelEndereco;   

    public String getLogradouroModelEndereco() {
        return logradouroModelEndereco;
    }

    public void setLogradouroModelEndereco(String logradouroModelEndereco) {
        this.logradouroModelEndereco = logradouroModelEndereco;
    }

    public int getNumeroModelEndereco() {
        return numeroModelEndereco;
    }

    public void setNumeroModelEndereco(int numeroModelEndereco) {
        this.numeroModelEndereco = numeroModelEndereco;
    }

    public String getBairroModelEndereco() {
        return bairroModelEndereco;
    }

    public void setBairroModelEndereco(String bairroModelEndereco) {
        this.bairroModelEndereco = bairroModelEndereco;
    }

    public String getCidadeModelEndereco() {
        return cidadeModelEndereco;
    }

    public void setCidadeModelEndereco(String cidadeModelEndereco) {
        this.cidadeModelEndereco = cidadeModelEndereco;
    }

    public String getEstadoModelEndereco() {
        return estadoModelEndereco;
    }

    public void setEstadoModelEndereco(String estadoModelEndereco) {
        this.estadoModelEndereco = estadoModelEndereco;
    }

    public String getCepModelEndereco() {
        return cepModelEndereco;
    }
   
    public String tratandoDados(String str){
        String tratado = str;
        String let = tratado.replaceAll("\\D","");
        System.out.println(str+"<<str\n"+tratado+"<<tratado\n"+let+"<<let");
        if(let.equals("")){
        }
        else{
            return str;
        }
        return let;
    }
    public void setCepModelEndereco(String cepModelEndereco) {
        this.cepModelEndereco = cepModelEndereco;
    }
    public void salvar(Endereco endereco){
            try {
                EnderecoDAO endDAO = new EnderecoDAO();
                endDAO.add(endereco);

            } catch (Exception e) {
                System.out.println("ERRO Endereco \n "+ e);
            }
    }
 
    
}
