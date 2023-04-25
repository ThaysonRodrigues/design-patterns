package br.com.exemplo.design.pattern.adapter.pack;

public class PessoaJuridica implements PessoaAdapter {

    private String documento;

    private PessoaJuridica() {}

    public PessoaJuridica(String documento) {
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    @Override
    public String getRegister() {
        return getDocumento();
    }
}
