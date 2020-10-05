
package registrarpontuacao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PontuacaoTest {
    
    private Pontuacao n;
    
    public PontuacaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        n = new Pontuacao();
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testValoresDasListas() {
        
    }

    
    @Test
    public void testTabelaResultados() {
        Object[] test = new Object[4];
        Assert.assertArrayEquals(test, n.linha);
        
        Assert.assertNotNull(n.linha);
    }

   
    @Test
    public void testMain() {

    }

    private static class Pontuacao {

        private Object[] linha;

        public Pontuacao() {
        }
    }    
}
