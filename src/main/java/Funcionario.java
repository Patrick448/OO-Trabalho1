public abstract class Funcionario extends Pessoa{
    private float salarioBase;

    public abstract float calcularSalario();

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
}
