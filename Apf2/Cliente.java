package Apf2;

import java.util.Scanner;

public class Cliente{
    
    private static int cadastro;
    private String Nome, Datanasc, CPF, Email, Telefone, Rua, Bairro, CEP, Numero, Complemento;

   
    public Cliente(String nom, String nasc, String cpf, String email,  String fone, String rua, String bairro, String cep, String num, String compl){
    cadastro=cadastro+1;
    Nome= nom;
    Datanasc= nasc;
    CPF= cpf;
    Email= email;
    Telefone= fone;
    Rua= rua;
    Bairro= bairro;
    CEP= cep;
    Numero= num;
    Complemento= compl;


     
    }
    
    public void Exibe(){
        System.out.println("Cadastro: "+getCadastro());
        System.out.println("Nome: "+getNome());
        System.out.println("datanasc: "+getDatanasc());
        System.out.println("CPF: "+getCPF());
        System.out.println("Email: "+getEmail());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Rua: "+getRua());
        System.out.println("Bairro: "+getBairro());
        System.out.println("CEP: "+getCEP());
        System.out.println("Numero: "+getNumero());
        System.out.println("Complemento: "+getComplemento());
   
    }
    
    public int getCadastro(){
        return cadastro;
    }
    
    public void setCadastro(int Cadastro){
        this.cadastro = cadastro;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
   
    public String getDatanasc(){
        return Datanasc;
    }

    public void setDatanasc(String Datanasc){
        this.Datanasc = Datanasc;
    }
    

    public String getCPF(){
        return CPF;
    }
    
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    
    public String getEmail(){
        return Email;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public String getTelefone(){
        return Telefone;
    }

    public void setTelefone(String Telefone){
        this.Telefone = Telefone;
    }
    
    public String getRua(){
        return Rua;
    }
    
    public void setRua(String Rua){
        this.Rua = Rua;
    }
    
    public String getBairro(){
        return Bairro;
    }
    
    public void setBairro(String Bairro){
        this.Bairro = Bairro;
    }
    
    public String getCEP(){
        return CEP;
    }

     public void setCEP(String CEP){
        this.CEP = CEP;
    }
    
    public String getNumero(){
        return Numero;
    }
    
    public void setNumero(String Numero){
        this.Numero = Numero;
    }
    
    public String getComplemento(){
        return Complemento;
    }
    
    public void setComplemento(String Complemento){
        this.Complemento = Complemento;
    }
    
  public static void main (String Args[])
    {
        //criando o objeto para leitura
        Scanner ler = new Scanner(System.in);
        
         //variaveis
        String Nome, Datanasc, CPF, Email, Telefone, Rua, Bairro, CEP, Numero, Complemento;
        //criando um contador para o while para entrar ou
        //sair do cadastro
        int contador =1;   
       
       
        while (contador > 0 ) {
            
            System.out.println("Nome do cliente: ");
            Nome= ler.next();

            System.out.println("Data de Nascimento: ");
            Datanasc= ler.next();

            System.out.println("CPF: ");
            CPF= ler.next();

            System.out.println("Email: ");
            Email= ler.next();

            System.out.println("Telefone: ");
            Telefone= ler.next();

          System.out.println("Rua: ");
            Rua= ler.next();

            System.out.println("Bairro: ");
            Bairro= ler.next();

            System.out.println("CEP: ");
            CEP= ler.next();

            System.out.println("Numero: ");
            Numero= ler.next();

            System.out.println("Complemento: ");
            Complemento= ler.next();


            
            Cliente Cad= new Cliente( Nome, Datanasc, CPF, Email, Telefone, Rua, Bairro, CEP, Numero, Complemento);
           
           
            System.out.println(" _____________ ");
            Cad.Exibe();
            System.out.println(" _____________ ");
            
            System.out.println("para cadastrar um novo Cliente digite 1, para sair do sistema digite 0: ");
            contador= ler.nextInt();
        }//fim do while
}//fim do metodo

}