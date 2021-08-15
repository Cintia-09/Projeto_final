package Apf2;
import java.util.Scanner;

//Eliane Nunes Martins 
//Emanuele Cristina Silva Matias 
//Francisca Cíntia de Sousa Barros 
//Rebeca da Silva Sousa
public class Main{

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





    public void Cliente ()
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



   
public void Locacao()
   {
       
        Cliente c = new Cliente("12233441","12233441","12233441","12233441","12233441","12233441","12233441","12233441","12233441","12233441");
        //Cliente c1 = new Cliente("2223332");
        //Carro v1 = new Carro ("Gol", 2010,"Branco","NLT 6666",100.00f,true, "s");
        Carro v2 = new Carro ("Gol", 2010,"Branco","NLT 6666",100.00f,true, "s");
        
        //Carro v2 = new Carro ("Celta","Preto","NNN 4458",false);
        Carro v3 = new Carro ("Gol", 2010,"Branco","NLT 6666",100.00f,true, "s");
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
