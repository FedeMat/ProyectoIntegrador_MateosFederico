
package com.federicomateos.fmp.Security.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author fmateos
 */
public class LoginUsuario {
    @NotBlank
    private String nombreusuario;
    @NotBlank
    private String password;

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}


