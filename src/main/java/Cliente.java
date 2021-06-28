public class Cliente extends Pessoa{
    private int mesa;
    private float totalPagamento;

    public float getTotalPagamento() {
        return totalPagamento;
    }

    public Cliente(String nome, int mesa){
        this.mesa = mesa;
        this.nome = nome;
    }

    public void adicionarValorPedido(float valor){
        totalPagamento+=valor;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
}
