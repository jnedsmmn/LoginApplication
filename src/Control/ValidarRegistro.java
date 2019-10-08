/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.Sistema;
import Entidad.Usuario;
import Frontera.FramePrincipal;

/**
 *
 * @author Estudiante
 */
public class ValidarRegistro {
private Sistema sistema= FramePrincipal.sistema;

    public ValidarRegistro() {
    }
        public String VerificarRegistro(Usuario usuario) {
        
        if(!VerificarLongitudNombre(usuario.getNombre())){

            return ("Longitud nombre incorrecta");
        
        }
        if(!verificarLongitudPassword(usuario.getPassword())){

        return ("Longitud contraseña incorrecta");
        }
        for (Usuario u: sistema.getUsuarios()) {
            if(!u.getNombre().equals(usuario.getNombre())){

                return ("Usuario valido");
            }
            
        }
        return ("Usuario ya registrado");
    }

    public boolean VerificarLongitudNombre(String nombre) {
        
        return (nombre.length() >1 && nombre.length()<=6);
    }

    public boolean verificarLongitudPassword(String password) {
        return (password.length()>=3 && password.length() <6);
    }
}
