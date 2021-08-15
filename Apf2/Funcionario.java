package Apf2;

import java.util.Scanner;

public class Funcionario{
    //criando os atributos da classe
    private static int cadastro;
    private String nome, funcao, CPF, turno;

    //criando o contrutor principal
    public Funcionario(String nom, String fun, String cpf, String tur){
    cadastro=cadastro+1;
    nome= nom;
    funcao= fun;
    CPF= cpf;
    turno= tur;
       
    }
    
    public void Exibe(){
        System.out.println("Cadastro: "+getCadastro());
        System.out.println("Nome: "+getNome());
        System.out.println("Funçao: "+getFuncao());
        System.out.println("CPF: "+getCPF());
        System.out.println("Turno: "
          +getTurno());
   
    }
    
    public int getCadastro(){
        return cadastro;
    }
   
    //retorno do nome
    public String getNome(){
        return nome;

    }
    //retorno da função
    public String getFuncao(){
        return funcao;
    }
    //retorno do valor CPF
    public String getCPF(){
        return CPF;
    }
    
    public String getTurno(){
        return turno;
    }
  public static void main (String Args[])
    {
        //criando o objeto para leitura
        Scanner ler = new Scanner(System.in);
        
        //variaveis
        String nome, funcao, CPF, turno;
        //criando um contador para o while para entrar ou
        //sair do cadastro
        int contador =1;   
       
       
        while (contador > 0 ) {
            //leitura do cadastro do Funcionario
            //-----------
            System.out.println("digite o nome do funcionario: ");
            //leitura do nome do funcionario que digitado pelo usuario
            nome= ler.next();
            System.out.println("digite a função do funcionario: ");

            //leitura da função do funcionario que foi digitado pelo usuario
            funcao= ler.next();
            System.out.println("digite o CPF: ");

            //Leitura do CPF do funcioanrio
            CPF= ler.next();
            System.out.println("digite o turno: ");
            
            turno= ler.next();
            //criando objeto do tipo Funcionario
            //para adicionar o cadastro do funcionario
            Funcionario Cad= new Funcionario(nome, funcao, CPF, turno);
           
            //chama o metodo que exibe todos get do objeto Cad da classe
            //Funcionario
            System.out.println(" _____________________________________ ");
            Cad.Exibe();
            System.out.println(" _____________________________________ ");
            //pergunta se o usuario quer adiocionar um novo funcionario
            System.out.println("para cadastrar um novo Funcionario digite 1, para sair do sistema digite 0: ");
            contador= ler.nextInt();
           
        }//fim do while
       
        
   }//fim do metodo



}//fim da classe funcionario
