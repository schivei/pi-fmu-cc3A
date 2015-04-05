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
public enum TipoUsuario {

  /**
   * Usuário Paciente
   */
  Paciente("Paciente"),
  /**
   * Usuário Credenciado
   */
  Credenciado("Credenciado");

  private final String tipo;

  TipoUsuario(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public final String toString() {
    return tipo;
  }

  /**
   * Retorna o Tipo de Usuário de acordo com o Tipo de Pessoa
   * @param tipoPessoa
   * @return
   */
  public static final TipoUsuario getPorTipoPessoa(TipoPessoa tipoPessoa) {
    switch (tipoPessoa) {
      case Fisica:
        return Paciente;
      case Juridica:
        return Credenciado;
      default:
        throw new AssertionError(tipoPessoa.name());
    }
  }
}
