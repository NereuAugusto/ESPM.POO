package espm.poo.ex2;

public class PessoaJuridica extends Cliente{

    private String cnpj;

    public String getCnpj(){
        return cnpj;

    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    @Override
    public String toString(){
        return "{nome:" + getNome() + ", Cnpj:" + getCnpj() + "}";
    }
}
