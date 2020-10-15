/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xrentcar.sharecarsystem.Facades;

import xrentcar.sharecarsystem.Singleton.AccessPoint;

/**
 *
 * @author A
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
        boolean registroPropiedad = AccessPoint.getInstance().checkProperty(this.placa);
        return registroPropiedad;
    }
    
}
