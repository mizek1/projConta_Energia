import com.mycompany.teste1.Residencial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Danilo Alves
 */
public class classeDeTesteResidencial {
    private Residencial conta = new Residencial();

    @BeforeAll
    static void inicializando() {
        System.out.println("Inicializando recursos...");
    }
    
    @BeforeEach
    void inicializandoObjetos() {
        System.out.println("Inicializando objetos...");
    }
     
    @Test
    @DisplayName("Teste de multa conta residencial = zero")
    void testeMultaResidencial() {
       Assertions.assertEquals(0, conta.calcularMulta(200), "Passou no teste Multa");
    }
    
    @Test
    @DisplayName("Teste de conta residencial = sem multa")
    void testeContaResidSemMulta() {
       Assertions.assertEquals(50, conta.calcularConta(200), "Passou no teste Conta sem multa");
    }
    
    @Test
    @DisplayName("Teste de conta residencial = com multa")
    void testeContaResidComMulta() {
       Assertions.assertEquals(226, conta.calcularConta(1000), "Passou no teste Conta com multa");
    }
}
