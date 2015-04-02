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
public class Usuario {

  private String nm_usuario;
  private TipoUsuario tp_usuario;

  public Usuario(String nm_usuario, TipoUsuario tp_usuario) {
    this.nm_usuario = nm_usuario;
    this.tp_usuario = tp_usuario;
  }

  /**
   * @return the nm_usuario
   */
  public String getNmUsuario() {
    return nm_usuario;
  }

  /**
   * @param nm_usuario the nm_usuario to set
   */
  public void setNmUsuario(String nm_usuario) {
    this.nm_usuario = nm_usuario;
  }

  /**
   * @return the tp_usuario
   */
  public TipoUsuario getTpUsuario() {
    return tp_usuario;
  }

  /**
   * @param tp_usuario the tp_usuario to set
   */
  public void setTpUsuario(TipoUsuario tp_usuario) {
    this.tp_usuario = tp_usuario;
  }
}
