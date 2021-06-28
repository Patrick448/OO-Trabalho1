import java.util.List;

public class Restaurante {
    private float caixa;
    private float valorFolhaPagamento;

    public Restaurante() {
        this.caixa = 0;
        this.valorFolhaPagamento =0;
    }

    public float getCaixa() {
        return caixa;
    }

    public void setCaixa(float caixa) {
        this.caixa = caixa;
    }

    public void fazerPedido(Garcom garcom, Cliente cliente, Comanda comanda){
        float comissao = comanda.calcularComissao();
        float valorComanda = comanda.calcularValorTotal();
        garcom.adicionarComissao(comissao);
        cliente.adicionarValorPedido(valorComanda);

        caixa+= valorComanda;
    }

    public float calcularFolhaPagamento(List<Funcionario> funcionarios){
        float valorTotal=0;
        for(Funcionario funcionario: funcionarios){
            valorTotal+= funcionario.calcularSalario();
        }
        this.valorFolhaPagamento = valorTotal;
        return valorTotal;
    }

    public float calcularBalancoFinanceiro(){
        return caixa - valorFolhaPagamento;
    }
}
