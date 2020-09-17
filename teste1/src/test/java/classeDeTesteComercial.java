import com.mycompany.teste1.Comercial;
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
public class classeDeTesteComercial {
    private Comercial conta = new Comercial();

    @BeforeAll
    static void inicializando() {
        System.out.println("Inicializando recursos...");
    }
    
    @BeforeEach
    void inicializandoObjetos() {
        System.out.println("Inicializando objetos...");
    }
     
    @Test
    @DisplayName("Teste de multa conta comercial = zero")
    void testeMultaComercial() {
       Assertions.assertEquals(0, conta.calcularMulta(500), "Passou no teste Multa");
    }
    
    @Test
    @DisplayName("Teste de conta comercial = sem multa")
    void testeContaComercSemMulta() {
       Assertions.assertEquals(130, conta.calcularConta(500), "Passou no teste Conta sem multa");
    }
    
    @Test
    @DisplayName("Teste de conta comercial = com multa")
    void testeContaComercComMulta() {
       Assertions.assertEquals(355, conta.calcularConta(1000), "Passou no teste Conta com multa");
    }
}
