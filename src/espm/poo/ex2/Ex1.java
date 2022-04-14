package espm.poo.ex2;

public class Ex1 {

    public static void main(String[] args){
        PessoaJuridica pj1 = new PessoaJuridica();

        Cliente pj2 = new PessoaJuridica();
        pj1.setNome("Rodrigo ME");
        pj1.setCnpj("123.231.123/009-21");

        Banco marybank = new Banco("maryane bank");
        marybank.addCliente(pj1);
        marybank.addCliente(pj2);

        Cliente rodrigo = pj1;


    }
    
}
