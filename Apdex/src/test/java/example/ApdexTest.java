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
        Assertions.assertEquals(1, score, 0.01);
    }

    @Test
    public void validarApdexBom(){
        //arrange
        Apdex apdex = new Apdex();
        //act
        double score = apdex.calculaApdex(870, 40, 1000);
        //assert
        Assertions.assertEquals(0.89, score,0.01);
    }

    @Test
    public void validarApdexRazoavel(){
        //arrange
        Apdex apdex = new Apdex();
        //act
        double score = apdex.calculaApdex(770, 60, 1000);
        //assert
        Assertions.assertEquals(0.80, score,0.01);
    }

    @Test
    public void validarApdexRuim(){
        //arrange
        Apdex apdex = new Apdex();
        //act
        double score = apdex.calculaApdex(590, 0, 1000);
        //assert
        Assertions.assertEquals(0.59, score,0.01);
    }

    @Test
    public void validarApdexInaceitavel(){
        //arrange
        Apdex apdex = new Apdex();
        //act
        double score = apdex.calculaApdex(230, 460, 1000);
        //assert
        Assertions.assertEquals(0.46, score,0.01);
    }
}