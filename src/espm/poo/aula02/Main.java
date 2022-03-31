package espm.poo.aula02;

public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.nome = "Humberto";
        p1.idade = 15;
        p1.salario = 800;

        Pessoa p2 = new Pessoa();
        p2.nome = "Sandra";
        p2.idade = 22;
        p2.salario = 400;

        Pessoa p3 = p1; //Aqui definimos que o p3 e o p1 apontam para a mesma posição de memória 
        p3.nome = "Sandra";
        p3.idade = 22;
        p3.salario = 400;

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);

        String nome = "Humberto";
        if (nome.equals("Humberto")){
            System.out.println("");
        }

    }

    
}
