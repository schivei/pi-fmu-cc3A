/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.fmu.cc3A.models.views;

/**
 *
 * @author Elton Schivei Costa
 */
public class ProbabilidadeEstatistica {

  private String cid;
  private String desc_cid;
  private String sintomas;

  /**
   * @return the cid
   */
  public String getCid() {
    return cid;
  }

  /**
   * @param cid the cid to set
   */
  public void setCid(String cid) {
    this.cid = cid;
  }

  /**
   * @return the desc_cid
   */
  public String getDescCid() {
    return desc_cid;
  }

  /**
   * @param desc_cid the desc_cid to set
   */
  public void setDescCid(String desc_cid) {
    this.desc_cid = desc_cid;
  }

  /**
   * @return the sintomas
   */
  public String getSintomas() {
    return sintomas;
  }

  /**
   * @param sintomas the sintomas to set
   */
  public void setSintomas(String sintomas) {
    this.sintomas = sintomas;
  }
}
