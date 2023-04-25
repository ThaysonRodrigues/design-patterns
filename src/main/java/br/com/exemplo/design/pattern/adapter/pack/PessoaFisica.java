package br.com.exemplo.design.pattern.adapter.pack;

public class PessoaFisica implements PessoaAdapter {

    private String documento;

    private PessoaFisica() {}

    public PessoaFisica(String documento) {
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
