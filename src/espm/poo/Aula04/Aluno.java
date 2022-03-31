package espm.poo.Aula04;

public class Aluno {

    Integer ra = null;
    String nome = null;

    public Aluno(Integer ra, String nome){
        this.ra = ra;
        this.nome = nome;
    }

    public double media(double... notas){
        double soma = 0;
        for (double n: notas){
            soma += n;
        }
        return soma / notas.length;

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{ra :" + ra + ", nome: " + nome + "}";
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null 
          && obj instanceof Aluno
          && ra == ((Aluno) obj).ra;
    }
    
}
