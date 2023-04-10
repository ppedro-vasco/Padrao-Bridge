package Bridge;

public class Cliente extends Usuario{
    public Cliente(float nivelSeguranca){
        super(nivelSeguranca);
    }
    public float calcularNivelSeguranca(){
        return this.nivelSeguranca * (1 + this.autenticador.percentualSeguranca());
    }
}