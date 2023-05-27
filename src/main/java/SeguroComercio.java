public class SeguroComercio implements Seguro {
    private int codigo;
    private String nomeComercio ;
    private String cnpj ;
    private float valorSeguro;

    public SeguroComercio(int codigo, String nomeComercio, String cnpj, float valorSeguro) {
        this.codigo = codigo;
        this.nomeComercio = nomeComercio;
        this.cnpj = cnpj;
        this.valorSeguro = valorSeguro;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeComercio() {
        return nomeComercio;
    }

    public String getCnpj() {
        return cnpj;
    }

    public float getValorSeguro() {
        return valorSeguro;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirSeguroComercial(this);
    }
}
