package org.jllinares.microservice;

import org.springframework.stereotype.Service;

/**
 * The Class CalculadoraService.
 */
@Service
public class CalculadoraService {
  
  /**
   * Sum.
   *
   * @param ope1 the ope 1
   * @param ope2 the ope 2
   * @return the integer
   */
  public Integer sum(Integer ope1, Integer ope2) {
    return ope1 + ope2;
  }

  /**
   * Subs.
   *
   * @param ope1 the ope 1
   * @param ope2 the ope 2
   * @return the integer
   */
  public Integer subs(Integer ope1, Integer ope2) {
    return ope2 - ope1;
  }
}