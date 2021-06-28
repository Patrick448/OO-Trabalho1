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