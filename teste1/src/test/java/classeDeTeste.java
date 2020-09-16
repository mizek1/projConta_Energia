
import com.mycompany.teste1.Conta;
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
public class classeDeTeste {
    @BeforeAll
    static void inicializando() {
        System.out.println("Inicializando recursos...");
    }
    
    @BeforeEach
    void inicializandoObjetos() {
        System.out.println("Inicializando objetos...");
    }
     
    @Test
    @DisplayName("Teste de conta residencial")
    void testResidencial() {
       Residencial conta = new Residencial();
       Assertions.assertEquals(0, conta.calcularMulta(199.0), "Passou no teste");
    }
}
