package espm.poo.ex2;

import java.util.Scanner;

public class Main {

    private static Banco banco = null;
    public static void main(String[] args){
        banco = new Banco("ESPM Bank");

        Scanner scan = new Scanner(System.in);
        Boolean exit = false;
        while(!exit){
            System.out.print("ESPM> ");
             String input = scan.nextLine().trim().toLowerCase();

            if("".equals(input)){ //trim é para limpar espaços a direita e esquerda das entradas de dados feitas pelo usuário
        
            }else if("exit".equals(input)){
                exit = true;
            }else if("help".equals(input)){
                 help();

            }else if("list".equals(input)){
                listCustomers(banco);
                
            }else if("add".equals(input)){
                addCustomer(banco);

            }else{
                System.err.println("Comando invalido"); 
            }

        }
        System.out.println("Bye bye!");

    }

    private static void help(){
        System.out.println("ESPM Sistema de Clientes");
        System.out.println("add -> Cadastra Cliente");
        System.out.println("lista -> Lista Clientes");
        System.out.println("del -> Apaga Cliente");
        System.out.println("find -> Localiza Cliente");
        System.out.println();
        System.out.println("exit -> Sair do Sistema");
    }

    private static void listCustomers(Banco banco){
      
       banco.getClientes().forEach(c -> System.out.println(c.getNome()));
        
    }
    
    private static void addCustomer(Banco banco){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scan.nextLine();
        System.out.println("Cpf: ");
        String cpf = scan.nextLine();

        Cliente c = new Cliente();
        c.setCpf(cpf);
        c.setNome(nome);

        banco.addCliente(c);

    }
}
