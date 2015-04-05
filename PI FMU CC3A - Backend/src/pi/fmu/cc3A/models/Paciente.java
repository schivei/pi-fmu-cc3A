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
public class Paciente extends Pessoa {

  public Paciente(String nome, String cpfCnpj, Genero sexo) {
    super(nome, cpfCnpj, sexo, TipoPessoa.Fisica);
  }

}
