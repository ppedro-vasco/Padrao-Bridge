package Bridge;

public class Funcionario extends Usuario{
    public Funcionario(float nivelSeguranca){
        super(nivelSeguranca);
    }
    public float calcularNivelSeguranca(){
        return this.nivelSeguranca * (1 + this.autenticador.percentualSeguranca());
    }
}