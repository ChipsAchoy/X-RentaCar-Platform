
package xrentcar.sharecarsystem.Facades;

import xrentcar.sharecarsystem.Singleton.AccessPoint;

/**
 *
 * Facade de validación para el propietario del vehículo
 * Coordina clases de fondo que se necesitan para validar los datos de un vehiculo
 */
public class ValidationLender implements Validation{
    private int placa;
    private String propietario;
    public ValidationLender(int placa, String proper){
        this.placa = placa;
        this.propietario = proper;
    }

    @Override
    public boolean validated() {
        //Obtiene los datos accesando al Singleton
        boolean registroPropiedad = AccessPoint.getInstance().checkProperty(this.placa);
        return registroPropiedad;
    }
    
}
