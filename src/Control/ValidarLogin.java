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
public class ValidarLogin {
    private Sistema sistema= FramePrincipal.sistema;
    
    public ValidarLogin() {
    }

    public String VerificarLogin(Usuario usuario) {
        if(!VerificarLongitudNombre(usuario.getNombre())){
        return ("Longitud nombre incorrecta");
        }
        if(!verificarLongitudPassword(usuario.getPassword())){
        return ("Longitud contraseña incorrecta");
        }
        for (Usuario u: sistema.getUsuarios()) {
            if(u.getNombre().equals(usuario.getNombre()) && u.getPassword().equals(usuario.getPassword())){
            return ("Bienvenido");
            }
            
        }
        return ("Datos incorrctos");
    }

    public boolean VerificarLongitudNombre(String nombre) {
        
        return (nombre.length() >1 && nombre.length()<=6);
    }

    public boolean verificarLongitudPassword(String password) {
        return (password.length()>=3 && password.length() <6);
    }
}
