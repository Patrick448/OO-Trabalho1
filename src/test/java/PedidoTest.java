import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarValorTotal() {
        Pedido pedido = new Pedido(100);
        assertEquals(100, pedido.getValor());
    }

    @Test
    void deveRetornarComissao() {
        Pedido pedido = new Pedido(100);
        assertEquals(20, pedido.calcularComissao());
    }
}