import java.util.ArrayList;
import java.util.List;

public class Chef extends Funcionario{

    private static float NOTA_MAXIMA = 10.0f;
    private static float NOTA_MINIMA = 0.0f;

    private float coeficienteBonus;
    private List<Float> notas;
    private float bonusMaximo;

    public Chef(){
        this.coeficienteBonus =0;
        this.notas = new ArrayList<>();
    }

    public List<Float> getNotas() {
        return notas;
    }

    public float getBonusMaximo() {
        return bonusMaximo;
    }

    public void setBonusMaximo(float bonusMaximo) {
        this.bonusMaximo = bonusMaximo;
    }


    public void adicionarNota(float nota){
        if(nota >= NOTA_MINIMA && nota<= NOTA_MAXIMA){
            notas.add(nota);
        }
    }

    public float calcularBonus(){
        float coeficienteBonus = calcularNotaMedia()/10;
        return bonusMaximo*coeficienteBonus;
    }

    public float calcularNotaMedia(){
        float somatorio =0;
        float contador =0;

        for(Float nota: notas){
            somatorio+=nota;
            contador++;
        }

        return somatorio/contador;
    }

    @Override
    public float calcularSalario() {
        return this.getSalarioBase() + calcularBonus();
    }
}
