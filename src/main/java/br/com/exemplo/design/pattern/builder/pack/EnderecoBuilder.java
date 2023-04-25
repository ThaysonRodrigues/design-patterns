package br.com.exemplo.design.pattern.builder.pack;

public class EnderecoBuilder {

    private Endereco endereco;

    private EnderecoBuilder () {
        this.endereco = new Endereco();
    }

    public static EnderecoBuilder builder() {
        return new EnderecoBuilder();
    }

    public EnderecoBuilder cidade(String cidade) {
        this.endereco.setCidade(cidade);
        return this;
    }

    public EnderecoBuilder rua(String rua) {
        this.endereco.setRua(rua);
        return this;
    }

    public EnderecoBuilder bairro(String bairro) {
        this.endereco.setBairro(bairro);
        return this;
    }

    public EnderecoBuilder numero(Integer numero) {
        this.endereco.setNumero(numero);
        return this;
    }

    public EnderecoBuilder complemento(String complemento) {
        this.endereco.setComplemento(complemento);
        return this;
    }

    public Endereco build () {
        return this.endereco;
    }
}