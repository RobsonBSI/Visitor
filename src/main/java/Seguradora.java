public class Seguradora implements Visitor {
    public String exibir(Seguro seguro) {
        return seguro.aceitar(this);
    }
    @Override
    public String exibirSeguroPredial(SeguroPredial predial) {
        return "Seguro Predial{" +
                "contrato=" + predial.getCodigo() +
                ", Nome do predio=" + predial.getNomePredio() +
                ", Numero de Apartamentos=" + predial.getNumeroApartamento() +
                ", valor=" + predial.getValorSeguro() +
                '}';
    }

    @Override
    public String exibirSeguroComercial(SeguroComecial comercio) {
        return "Seguro Comercial{" +
                "contrato=" + comercio.getCodigo() +
                ", Comercio=" +comercio.getNomeComercio() +
                ", CNPJ='" +comercio.getCnpj()+ '\'' +
                ", valor=" + comercio.getValorSeguro() +
                '}';
    }

    @Override
    public String exibirSeguroResidencial(SeguroResidencial residencia) {
        return "Seguro Residencial{" +
                "contrato=" + residencia.getCodigo() +
                ", Nome=" +residencia.getNome() +
                ", CPF='" +residencia.getCpf()+ '\'' +
                ", valor=" + residencia.getValorSeguro() +
                '}';
    }
}
