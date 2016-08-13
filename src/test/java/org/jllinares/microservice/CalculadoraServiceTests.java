package org.jllinares.microservice;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * The Class CalculadoraServiceTests.
 */
public class CalculadoraServiceTests {
  
  /**
   * Test sum.
   */
  @Test
  public void test_sum() {
    CalculadoraService service = new CalculadoraService();
    assertEquals("La suma de 1 y 3 debe ser 3", Integer.valueOf(3), service.sum(1, 2));
  }
  
  /**
   * Test subs.
   */
  @Test
  public void test_subs() {
    CalculadoraService service = new CalculadoraService();

    assertEquals("La resta de 2 con 1 debe ser 1", Integer.valueOf(1), service.subs(1, 2));
  }
}