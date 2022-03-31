package espm.poo.aula3;

import espm.poo.aula02.Pessoa;

public class Main {

    public static void main(String[] args){
        
        int N = 1000000;
        long t = System.currentTimeMillis();
        Pessoa[] ps = new Pessoa[N];
        for (int i = 0; i < 1000000; i++){
            ps[0] = new Pessoa(i+"berto");

        }

        Pessoa p2 = new Pessoa("Selmini");
        Pessoa p1 = p2;

        p2.imprimir();

        System.gc(); //invoca o gabage collector

    }

    public static boolean decriptar(String senha){
        //verificar se a senha é valida 
        // forte candidato a chamar um gc
        return true;
    }
    
}
