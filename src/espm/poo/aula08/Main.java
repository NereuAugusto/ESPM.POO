package espm.poo.aula08;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Pagamento> pagamentos = new ArrayList<>();
        Pagamento pag1 = new PagamentoCartao(400, 20);
        Pagamento pag2 = new PagamentoDolar(400,5.8, 20);

        pagamentos.add(pag1);
        pagamentos.add(pag2);

        pagamentos.forEach(p -> {
            System.out.println(p.efetivar());
        });

    }
    
}
