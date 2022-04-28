package espm.poo.aula07;

public class Ex1 {

    public static void main(String[] args){
        Livro l1 = new Livro("Mais experto que o diabo", "Mariana", "São Paulo");
        l1.a = new Autor("Vinicius", "CG");
        System.out.print(l1.a.nome);
    }
    
}
