/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travis;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DCM
 */
public class MainTest {
    
    public MainTest() {
    }


    @Test
    public void testSuma() {
        Main m = new Main();
        assertEquals(2+3, m.suma(2, 3));
    }
    
}
