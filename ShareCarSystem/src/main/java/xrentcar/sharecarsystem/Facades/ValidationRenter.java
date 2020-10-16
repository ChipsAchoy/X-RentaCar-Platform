package xrentcar.sharecarsystem.Facades;

import xrentcar.sharecarsystem.Singleton.AccessPoint;

/**
 *
 * Facade de validación para un cliente que rentará vehículos
 * Coordina algunas clases de fondo para validar que la información de un cliente sea correcta
 */
public class ValidationRenter implements Validation{
    private int cedula;
    private String nombre;
    public ValidationRenter(int cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
        
    }

    @Override
    public boolean validated() {
        //Obtiene los datos accesando al Singleton
        boolean fb = AccessPoint.getInstance().checkFacebook(this.nombre);
        boolean registroCivil = AccessPoint.getInstance().checkRegister(this.cedula);
        
        return fb&&registroCivil;
    }
}
