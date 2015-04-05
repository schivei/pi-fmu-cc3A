/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.fmu.cc3A.models;

import java.util.*;
import pi.fmu.cc3A.utils.CpfCnpj;

/**
 *
 * @author Elton Schivei Costa
 */
public class Pessoa extends Usuario {

  private String cpf_cnpj;

  private TipoPessoa tp_pessoa;

  private Genero sexo;

  private final Set<Endereco> enderecos = new HashSet<>();

  public Pessoa(String nome, String cpfCnpj, Genero sexo, TipoPessoa tipoPessoa) {
    super(nome, TipoUsuario.getPorTipoPessoa(tipoPessoa));
    this.tp_pessoa = tipoPessoa;
    validarCpfCnpj(cpfCnpj);
    this.cpf_cnpj = cpfCnpj;
    this.sexo = sexo;
  }

  private void validarCpfCnpj(String cpfCnpj) {
    switch (tp_pessoa) {
      case Fisica:
        if (!CpfCnpj.cpfValido(cpfCnpj)) {
          throw new NumberFormatException("CPF inválido.");
        }
        break;
      case Juridica:
        if (!CpfCnpj.cnpjValido(cpfCnpj)) {
          throw new NumberFormatException("CNPJ inválido.");
        }
        break;
      default:
        if (!CpfCnpj.validarCPF_CNPJ(cpfCnpj)) {
          throw new NumberFormatException("CPF/CNPJ inválido.");
        }
        break;
    }
  }

  public String getCpfCnpj() {
    return cpf_cnpj;
  }

  public void setCpfCnpj(String cpfCnpj) {
    validarCpfCnpj(cpfCnpj);
    cpf_cnpj = cpfCnpj;
  }

  public TipoPessoa getTpPessoa() {
    return tp_pessoa;
  }

  public void setTpPessoa(TipoPessoa tipoPessoa) {
    tp_pessoa = tipoPessoa;
  }

  public Genero getSexo() {
    return sexo;
  }

  public void setSexo(Genero sexo) {
    this.sexo = sexo;
  }

  public Set<Endereco> getEnderecos() {
    return enderecos;
  }
}
