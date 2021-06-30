//Patrick Canto de Carvalho

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RestauranteTest {
    Restaurante restaurante;
    Garcom garcom1, garcom2, garcom3;
    Chef chef;

    @BeforeEach
    void setup(){
        restaurante = new Restaurante();
        garcom1 = new Garcom();
        garcom2 = new Garcom();
        garcom3 = new Garcom();
        chef = new Chef();


        garcom1.setSalarioBase(100.0f);
        garcom2.setSalarioBase(100.0f);
        garcom3.setSalarioBase(100.0f);

        chef.setSalarioBase(1000);
        chef.setBonusMaximo(1000);
        chef.adicionarNota(7.0f);
        chef.adicionarNota(8.0f);
        chef.adicionarNota(9.0f);
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

        List<Funcionario> funcionarios= new ArrayList<>();
        funcionarios.add(garcom1);
        funcionarios.add(garcom2);
        funcionarios.add(garcom3);
        funcionarios.add(chef);

        assertEquals(1800.0f + 306.0f, restaurante.calcularFolhaPagamento(funcionarios));

    }

    @Test
    void deveRetornarBalancoFinanceiro(){
        Cliente cliente = new Cliente("Joao da Silva Pereira", 1);
        Comanda comanda = new Comanda(10.0f);
        restaurante.fazerPedido(garcom1, cliente, comanda);
        restaurante.fazerPedido(garcom2, cliente, comanda);
        restaurante.fazerPedido(garcom3, cliente, comanda);

        List<Funcionario> funcionarios= new ArrayList<>();
        funcionarios.add(garcom1);
        funcionarios.add(garcom2);
        funcionarios.add(garcom3);
        funcionarios.add(chef);
        restaurante.calcularFolhaPagamento(funcionarios);

        assertEquals(30.0f -306.0f - 1800.0f, restaurante.calcularBalancoFinanceiro());

    }
}