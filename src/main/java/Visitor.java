public interface Visitor {
    String exibirSeguroPredial(SeguroPredial predial);
    String exibirSeguroComercial(SeguroComercio comercio);
    String exibirSeguroResidencial(SeguroResidencial residencia);
}
