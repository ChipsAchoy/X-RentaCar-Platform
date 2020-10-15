/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xrentcar.sharecarsystem.FactoryMethod;

import xrentcar.sharecarsystem.Facades.ValidationLender;

/**
 *
 * @author A
 */
public class LenderUser implements User{
    
    private int placa;
    private String propietario;
    
    
    @Override
    public void create(int id, String name) {
        System.out.println("Se agrego un nuevo vehiculo");
        this.placa = id;
        this.propietario = name;
    }

    @Override
    public void edit(int id) {
        System.out.println("Se cambio la placa del vehiculo");
        this.placa = id;
    }

    @Override
    public void edit(String name) {
        System.out.println("Propietario cambiado");
    }

    @Override
    public int getId() {
        return this.placa;
    }

    @Override
    public boolean checkData() {
        return new ValidationLender(this.placa, this.propietario).validated();
    }
    
    
}
