package xrentcar.sharecarsystem.FactoryMethod;

import xrentcar.sharecarsystem.Facades.ValidationLender;

/**
 *
 * Define los atributos y las funciones de los métodos que un usuario asociado a un propietario puede realizar
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
        return new ValidationLender(this.placa, this.propietario).validated(); //Llamada al facade de validación
    }
    
    
}
