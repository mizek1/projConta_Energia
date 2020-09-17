import com.mycompany.teste1.Industrial;
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
public class classeDeTesteIndustrial {
    private Industrial conta = new Industrial();

    @BeforeAll
    static void inicializando() {
        System.out.println("Inicializando recursos...");
    }
    
    @BeforeEach
    void inicializandoObjetos() {
        System.out.println("Inicializando objetos...");
    }
     
    @Test
    @DisplayName("Teste de multa conta industrial = zero")
    void testeMultaIndustrial() {
       Assertions.assertEquals(0, conta.calcularMulta(1000), "Passou no teste Multa");
    }
    
    @Test
    @DisplayName("Teste de conta industrial = sem multa")
    void testeContaIndustSemMulta() {
       Assertions.assertEquals(60, conta.calcularConta(1000), "Passou no teste Conta sem multa");
    }
    
    @Test
    @DisplayName("Teste de conta industrial = com multa")
    void testeContaIndustComMulta() {
       Assertions.assertEquals(490, conta.calcularConta(2000), "Passou no teste Conta com multa");
    }
}
