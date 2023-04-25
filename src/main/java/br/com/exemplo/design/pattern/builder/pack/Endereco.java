package br.com.exemplo.design.pattern.builder.pack;

public class Endereco {

    private String cidade;
    private String rua;
    private String bairro;
    private Integer numero;
    private String complemento;

    protected Endereco() {}

    public static Endereco builder() {
        return new Endereco();
    }

    public Endereco cidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public Endereco rua(String rua) {
        this.rua = rua;
        return this;
    }

    public Endereco bairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public Endereco numero(Integer numero) {
        this.numero = numero;
        return this;
    }

    public Endereco complemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade='" + cidade + '\'' +
                ", rua='" + rua + '\'' +
                ", Bairro='" + bairro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                '}';
    }

}