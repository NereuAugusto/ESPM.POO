package espm.poo.aula02;

public class Pessoa {
   String nome;
   int idade;
   double salario;
   
   public Pessoa() {

   }

   public Pessoa(String nome) {
       this.nome = nome;
   }

   public void imprimir() {
       System.out.println("Nome: " + nome);
       System.out.println("Idade: " + idade);
       System.out.println("Salario: " + salario);

   }
}