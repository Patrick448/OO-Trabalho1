import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ChefTest {

    Chef chef;

    @BeforeEach
    void setup(){
        chef = new Chef();
        chef.setSalarioBase(1000);
        chef.setBonusMaximo(1000);
    }

    @Test
    void deveRetornarBonusMaximo() {
        assertEquals(1000.0f, chef.getBonusMaximo());
    }

    @Test
    void deveRetornarNotas() {
        chef.adicionarNota(7.0f);
        chef.adicionarNota(8.0f);
        chef.adicionarNota(9.0f);
        chef.adicionarNota(-0.1f);
        chef.adicionarNota(10.1f);

        assertEquals(Arrays.asList(7.0f, 8.0f, 9.0f), chef.getNotas());
    }

    @Test
    void deveRetornarMedia() {
        chef.adicionarNota(7.0f);
        chef.adicionarNota(8.0f);
        chef.adicionarNota(9.0f);

        assertEquals(8.0f, chef.calcularNotaMedia());
    }

    @Test
    void deveRetornarBonusCalculado() {
        chef.adicionarNota(7.0f);
        chef.adicionarNota(8.0f);
        chef.adicionarNota(9.0f);

        assertEquals(800.0f, chef.calcularBonus());
    }

    @Test
    void deveRetornarSalarioCalculado() {
        chef.adicionarNota(7.0f);
        chef.adicionarNota(8.0f);
        chef.adicionarNota(9.0f);

        assertEquals(1800.0f, chef.calcularSalario());
    }
}