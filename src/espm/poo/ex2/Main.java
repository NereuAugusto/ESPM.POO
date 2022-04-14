package espm.poo.ex2;

import java.util.Scanner;


public class Main {

    private static Banco banco = null;
    public static void main(String[] args){
        banco = new Banco("ESPM Bank");
        Scanner scan = new Scanner(System.in);

        Boolean exit = false;
        while(!exit){
            try{
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
                }else if("find".equals(input)){
                    throw new UnsupportedOperationException();
                }else{
                    System.err.println("Comando invalido"); 
                }
                
            } catch(UnsupportedOperationException e){
                e.printStackTrace();
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
      
       banco.getClientes().forEach(c ->{
           String tp = c instanceof PessoaFisica ? "f" : "j";
        System.out.println(tp + " " + c);

       });
    }
    
    private static void addCustomer(Banco banco){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scan.nextLine();

        TipoPessoa tipoPessoa = inputTipoCliente();
       
        Cliente c = null;

        switch(tipoPessoa){
            case Fisica:

            System.out.println("Cpf: ");
            String cpf = scan.nextLine();
 
            PessoaFisica pf = new PessoaFisica();
            pf.setCpf(cpf);
            c = pf;
            break;
        
            case Juridica:

            System.out.println("CNPJ: ");
            String cnpj = scan.nextLine();

            PessoaJuridica pj = new PessoaJuridica();
            pj.setCnpj(cnpj);
            c = pj;
            break;

        }
        c.setNome(nome);

        banco.addCliente(c);

    }
    private static TipoPessoa inputTipoCliente() {
        Scanner scan = new Scanner(System.in);
        String tp = "";
        while(!tp.equals("j") && !tp.equals("f")) {
            System.out.print("Tipo do Cliente? [F/J] ");
            tp = scan.nextLine().toLowerCase();
            if(!tp.equals("j") && !tp.equals("f")) {
                System.err.println("F: Física | J: Jurídica");
            }
        }
        return tp.equals("f") ? TipoPessoa.Fisica: TipoPessoa.Juridica;
    }
}
