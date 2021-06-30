import java.util.List;

public class Pedido {
    private float valor;

    public Pedido(float valor) {
        this.valor = valor;
    }

    public float getValor(){
        return this.valor;
    }
    public float calcularComissao(){
        return this.valor*0.20f;
    }
}
