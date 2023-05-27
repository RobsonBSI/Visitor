public class SeguroPredial implements Seguro {

    private int codigo;
    private String nomePredio;
    private int numeroApartamento;
    private float valorSeguro;

    public SeguroPredial(int codigo, String nomePredio, int numeroApartamento, float valorSeguro) {
        this.codigo = codigo;
        this.nomePredio = nomePredio;
        this.numeroApartamento = numeroApartamento;
        this.valorSeguro = valorSeguro;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomePredio() {
        return nomePredio;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public float getValorSeguro() {
        return valorSeguro;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirSeguroPredial(this);
    }
}
