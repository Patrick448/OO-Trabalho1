import java.util.List;

public class Comanda {
    private float valor;

    public Comanda(float valor) {
        this.valor = valor;
    }

    public float calcularValorTotal(){
        return this.valor;
    }
    public float calcularComissao(){
        return this.valor*0.20f;
    }
}
