import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeguradoraTest {
    @Test
    void deveExibirSegurosResidencial() {
        SeguroResidencial residencia = new SeguroResidencial(1, "Jose","999.999.99-99",250.0f);

        Seguradora visitor = new Seguradora();
        assertEquals("Seguro Residencial{contrato=1, Nome=Jose, CPF='999.999.99-99', valor=250.0}", visitor.exibir(residencia));
    }

    @Test
    void deveExibirSegurosComercia() {
        SeguroComercio comercio = new SeguroComercio(1, "da Carne","99.999.999/0001-02",2000.0f);

        Seguradora visitor = new Seguradora();
        assertEquals("Seguro Comercial{contrato=1, Comercio=da Carne, CNPJ='99.999.999/0001-02', valor=2000.0}", visitor.exibir(comercio));
    }

    @Test
    void deveExibirSegurosPredial() {
        SeguroPredial comercio = new SeguroPredial(1, "Estrela Sul",10,2500.0f);

        Seguradora visitor = new Seguradora();
        assertEquals("Seguro Predial{contrato=1, Nome do predio=Estrela Sul, Numero de Apartamentos=10, valor=2500.0}", visitor.exibir(comercio));
    }
}