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
public class ValidationRenter implements Validation{
    private int cedula;
    private String nombre;
    public ValidationRenter(int cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
        
    }

    @Override
    public boolean validated() {
        
        boolean fb = AccessPoint.getInstance().checkFacebook(this.nombre);
        boolean registroCivil = AccessPoint.getInstance().checkRegister(this.cedula);
        
        return fb&&registroCivil;
    }
}
