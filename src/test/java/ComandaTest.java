import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComandaTest {

    @Test
    void deveRetornarValorTotal() {
        Comanda comanda = new Comanda(100);
        assertEquals(100, comanda.calcularValorTotal());
    }

    @Test
    void deveRetornarComissao() {
        Comanda comanda = new Comanda(100);
        assertEquals(20, comanda.calcularComissao());
    }
}