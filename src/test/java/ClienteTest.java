import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarTotalPagamento() {
        Cliente cliente = new Cliente("Juliana", 1);
        cliente.adicionarValorPedido(15);
        cliente.adicionarValorPedido(5.5f);

        assertEquals(20.5f, cliente.getTotalPagamento());
    }

    @Test
    void deveRetornarMesa() {
        Cliente cliente = new Cliente("Juliana", 1);
        assertEquals(1, cliente.getMesa());

        cliente.setMesa(2);
        assertEquals(2, cliente.getMesa());
    }


}