public class Garcom extends Funcionario{
    float totalComissao;

    public Garcom() {
        this.totalComissao = 0;
    }
    public void adicionarComissao(float valor){
        this.totalComissao+=valor;
    }

    public float getTotalComissao() {
        return totalComissao;
    }


    @Override
    public float calcularSalario() {
       return this.getSalarioBase() + totalComissao;
    }
}
