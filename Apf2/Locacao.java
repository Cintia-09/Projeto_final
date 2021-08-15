package Apf2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Locacao {

    
        private int idLocacao;
        private String data_retirada;
        private String data_devolucao;
        private String cpf;
        private int agencia_id;
        private int pagamento_id;
        private String status;
        
        public Locacao(int idLocacao, String data_retirada, String data_devolucao, String cpf, int agencia_id , int pagamento_id, String status){
            this.idLocacao = idLocacao;
            this.data_retirada = data_retirada;
            this.data_devolucao = data_devolucao;
            this.cpf = cpf;
            this.agencia_id = agencia_id;
            this.pagamento_id = pagamento_id;
            this.status = status;
        }
    

    
    public int getIdLocacao() {
        return idLocacao;
    }
    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }
    public String getData_retirada() {
        return data_retirada;
    }
    public void setData_retirada(String data_retirada) {
        this.data_retirada = data_retirada;
    }
    public String getData_devolucao() {
        return data_devolucao;
    }
    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getAgencia_id() {
        return agencia_id;
    }
    public void setAgencia_id(int agencia_id) {
        this.agencia_id = agencia_id;
    }
    public int getPagamento_id() {
        return pagamento_id;
    }
    public void setPagamento_id(int pagamento_id) {
        this.pagamento_id = pagamento_id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    

   
public static void main (String Args[])
   {
       
        Cliente c = new Cliente("12233441","12233441","12233441","12233441","12233441","12233441","12233441","12233441","12233441","12233441");
        //Cliente c1 = new Cliente("2223332");
        //Carro v1 = new Carro ("Gol", 2010,"Branco","NLT 6666",100.00f,true, "s");
        Carro v2 = new Carro ("Gol", 2010,"Branco","NLT 6666",100.00f,true, "s");
        
        //Carro v2 = new Carro ("Celta","Preto","NNN 4458",false);
        Carro v3 = new Carro ("Pálio", 2010,"Vermelho","NPT 6652",200.00f,true, "s");
        //Carro v4 = new Carro ("Palio","Prata","OOO 0101",true);
        
        c.setNome("Renato");
        c.setTelefone("6284306136");
        System.out.println("============Dados Cliente==============");
        System.out.println("Nome: " + c.getNome() + "\n"
                          + "Telefone: " + c.getTelefone() + "\n"
                          + "CPF: " + c.getCPF());
                          
        Locacao l1= new Locacao(100, "", "", c.getCPF(), 100, 100, "");
        
        System.out.println("=============Dados Carro===============");
        v2.setModelo("Modelo: " + v2.getModelo());
       
 {      
         Carro c1 = new Carro("Gol", 2010,"Branco","NLT 6666",100.00f,true, "s"); 
        if(c1.isAlugado() == false)
        {
            System.out.println("Modelo: " + c1.getModelo());
            System.out.println("Cor: " + c1.getCor());
            System.out.println("Placa: " + c1.getPlaca());
            System.out.println("O carro alugado com sucesso!");
        }else
        {
            System.out.println("O carro ja esta alugado! ");
            System.out.println("Modelo: " + c1.getModelo());
            System.out.println("Cor: " + c1.getCor());
            System.out.println("Placa: " + c1.getPlaca());
            
        }
}
    }


    
}