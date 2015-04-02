/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.fmu.cc3A.models;

/**
 *
 * @author Elton Schivei Costa
 */
public enum TipoPessoa {

  /**
   * Pessoa Física
   */
  Fisica('F'),
  /**
   * Pessoa Jurídica
   */
  Juridica('J');

  private final char codigo;

  TipoPessoa(char codigo) {
    this.codigo = codigo;
  }

  public char getCodigo() {
    return this.codigo;
  }
}
