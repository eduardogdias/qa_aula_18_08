package example;

import org.example.Apdex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ApdexTest {

    @Test
    public void validarApdexExcelente(){
        //arrange
        Apdex apdex = new Apdex();
        //act
        double score = apdex.calculaApdex(1000, 0, 1000);
        //assert
        Assertions.assertEquals(1, score);
    }


    @Test
    public void validarApdexRazoavel(){
        //arrange
        Apdex apdex = new Apdex();
        //act
        double score = apdex.calculaApdex(270, 70, 400);
        //assert
        Assertions.assertEquals(0.76, score,0.01);
    }

}