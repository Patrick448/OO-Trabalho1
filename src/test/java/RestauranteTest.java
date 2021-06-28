import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RestauranteTest {
    Restaurante restaurante;
    Garcom garcom1;
    Garcom garcom2;
    Garcom garcom3;

    @BeforeEach
    void setup(){
        restaurante = new Restaurante();
        garcom1 = new Garcom();
        garcom2 = new Garcom();
        garcom3 = new Garcom();

        garcom1.setSalarioBase(100.0f);
        garcom2.setSalarioBase(100.0f);
        garcom3.setSalarioBase(100.0f);
    }

    @Test
    void deveRetornarCaixa() {
        Cliente cliente = new Cliente("Joao da Silva Pereira", 1);
        Comanda comanda = new Comanda(10.0f);
        restaurante.fazerPedido(garcom1, cliente, comanda);

        assertEquals(10.0f, restaurante.getCaixa());
    }

    @Test
    void deveRetornarFolhaPagamento(){
        Cliente cliente = new Cliente("Joao da Silva Pereira", 1);
        Comanda comanda = new Comanda(10.0f);
        restaurante.fazerPedido(garcom1, cliente, comanda);
        restaurante.fazerPedido(garcom2, cliente, comanda);
        restaurante.fazerPedido(garcom3, cliente, comanda);

        List<Funcionario> garcons= new ArrayList<>();
        garcons.add(garcom1);
        garcons.add(garcom2);
        garcons.add(garcom3);

        assertEquals(306.0f, restaurante.calcularFolhaPagamento(garcons));

    }

    @Test
    void deveRetornarBalancoFinanceiro(){
        Cliente cliente = new Cliente("Joao da Silva Pereira", 1);
        Comanda comanda = new Comanda(10.0f);
        restaurante.fazerPedido(garcom1, cliente, comanda);
        restaurante.fazerPedido(garcom2, cliente, comanda);
        restaurante.fazerPedido(garcom3, cliente, comanda);

        List<Funcionario> garcons= new ArrayList<>();
        garcons.add(garcom1);
        garcons.add(garcom2);
        garcons.add(garcom3);
        restaurante.calcularFolhaPagamento(garcons);
        assertEquals(-276.0f, restaurante.calcularBalancoFinanceiro());

    }
}