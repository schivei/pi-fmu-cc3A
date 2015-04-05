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
public class Endereco {

  private char[] nr_cep = new char[8];

  private String end_rua;

  private short nr_end;

  private String complemento;

  private String bairro;

  private String cidade;

  private String desc_observacoes;

  /**
   * @return the nr_cep
   */
  public char[] getNrCep() {
    return nr_cep;
  }

  /**
   * @param nr_cep the nr_cep to set
   */
  public void setNrCep(char[] nr_cep) {
    this.nr_cep = nr_cep;
  }

  /**
   * @return the end_rua
   */
  public String getEndRua() {
    return end_rua;
  }

  /**
   * @param end_rua the end_rua to set
   */
  public void setEndRua(String end_rua) {
    this.end_rua = end_rua;
  }

  /**
   * @return the nr_end
   */
  public short getNrEnd() {
    return nr_end;
  }

  /**
   * @param nr_end the nr_end to set
   */
  public void setNrEnd(short nr_end) {
    this.nr_end = nr_end;
  }

  /**
   * @return the complemento
   */
  public String getComplemento() {
    return complemento;
  }

  /**
   * @param complemento the complemento to set
   */
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  /**
   * @return the bairro
   */
  public String getBairro() {
    return bairro;
  }

  /**
   * @param bairro the bairro to set
   */
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  /**
   * @return the cidade
   */
  public String getCidade() {
    return cidade;
  }

  /**
   * @param cidade the cidade to set
   */
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  /**
   * @return the desc_observacoes
   */
  public String getDescObservacoes() {
    return desc_observacoes;
  }

  /**
   * @param desc_observacoes the desc_observacoes to set
   */
  public void setDescObservacoes(String desc_observacoes) {
    this.desc_observacoes = desc_observacoes;
  }
}
