package Bridge;

public class Administrador extends Usuario{
    public Administrador(float nivelSeguranca){
        super(nivelSeguranca);
    }
    public float calcularNivelSeguranca(){
        return this.nivelSeguranca * (1 + this.autenticador.percentualSeguranca());
    }
}
