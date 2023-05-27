public class SeguroResidencial implements Seguro{
    private int codigo;
    private String nome ;
    private String cpf ;
    private float valorSeguro;

    public SeguroResidencial(int codigo, String nome, String cpf, float valorSeguro) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.valorSeguro = valorSeguro;
    }

    public String getCpf() {
        return cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getValorSeguro() {
        return valorSeguro;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirSeguroResidencial(this);
    }
}
