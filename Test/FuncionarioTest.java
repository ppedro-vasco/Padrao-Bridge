package Bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {
    @Test
    void deveRetornarSegurancaFuncionarioComAutenticacaoSenha(){
        Autenticador autenticador = new Senha();
        Cliente cliente = new Cliente (1.0f);
        cliente.setAutenticacao(autenticador);
        assertEquals(2.0f, cliente.calcularNivelSeguranca());
    }

    @Test
    void deveRetornarSegurancaFuncionarioComAutenticacaoDoisFatores(){
        Autenticador autenticador = new DoisFatores();
        Cliente cliente = new Cliente (4.0f);
        cliente.setAutenticacao(autenticador);
        assertEquals(20.0f, cliente.calcularNivelSeguranca());
    }

    @Test
    void deveRetornarSegurancaFuncionarioComAutenticacaoBiometria(){
        Autenticador autenticador = new Biometria();
        Cliente cliente = new Cliente (6.0f);
        cliente.setAutenticacao(autenticador);
        assertEquals(42.0f, cliente.calcularNivelSeguranca());
    }

    @Test
    void deveRetornarSegurancaFuncionarioComAutenticacaoFacial(){
        Autenticador autenticador = new Facial();
        Cliente cliente = new Cliente (10.0f);
        cliente.setAutenticacao(autenticador);
        assertEquals(90.0f, cliente.calcularNivelSeguranca());
    }
}
