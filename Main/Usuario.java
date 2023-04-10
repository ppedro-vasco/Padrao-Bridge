package Bridge;

public abstract class Usuario {

    protected Autenticador autenticador;
    protected float nivelSeguranca;

    public Usuario(float nivelSeguranca){
        this.nivelSeguranca = nivelSeguranca;
    }
    public void setAutenticacao(Autenticador autenticador){
        this.autenticador = autenticador;
    }
    public void setNivelSeguranca(float nivelSeguranca){
        this.nivelSeguranca = nivelSeguranca;
    }
    public abstract float calcularNivelSeguranca();

}
