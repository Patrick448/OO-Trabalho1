import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarcomTest {

    Garcom garcom;

    @BeforeEach
    void setup(){
        garcom = new Garcom();
    }

    @Test
    void deveRetornarNome(){
        garcom.setNome("João da Silva");
        assertEquals("João da Silva", garcom.getNome());

    }

    @Test
    void deveRetornarSalarioBase(){
        garcom.setSalarioBase(500.0f);
        assertEquals(500.0f, garcom.getSalarioBase());

    }

    @Test
    void deveRetornarComissao(){
        garcom.adicionarComissao(50);
        garcom.adicionarComissao(20);
        assertEquals(70, garcom.getTotalComissao());

    }

    @Test
    void deveRetornarSalario(){
        garcom.setSalarioBase(100);
        garcom.adicionarComissao(50);

        assertEquals(150, garcom.calcularSalario());

    }

}