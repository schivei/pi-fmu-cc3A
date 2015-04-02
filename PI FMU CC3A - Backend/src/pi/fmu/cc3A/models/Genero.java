/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.fmu.cc3A.models;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Elton Schivei Costa
 */
public enum Genero
{
  Masculino (1),
  Feminino (2);
  
  private final String txt_genero;
  private final int num_genero;
  
  Genero(int codigo)
  {
    num_genero = codigo;
    if (codigo == 1)
      txt_genero = "Masculino";
    else
      txt_genero = "Feminino";
  }
  
  public int getCodigo()
  {
    return num_genero;
  }
  
  @Override
  public final String toString()
  {
    return txt_genero;
  }
}
