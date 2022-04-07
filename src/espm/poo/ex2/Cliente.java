package espm.poo.ex2;

public class Cliente {
    private String nome;
    private String cpf;
    private Conta conta;

    public Cliente(){
        this.conta = new Conta(this);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
    

    
}
