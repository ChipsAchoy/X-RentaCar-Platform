package xrentcar.sharecarsystem.FactoryMethod;

import xrentcar.sharecarsystem.Facades.ValidationRenter;

/**
 *
 * Define los atributos y las funciones de los métodos que un usuario asociado a un cliente puede realizar
 */
public class RenterUser implements User{
    
    private int cedula;
    private String nombre;
    
    @Override
    public void create(int id, String name) {
        System.out.println("Se agrego un nuevo cliente");
        this.cedula = id;
        this.nombre = name;
    }

    @Override
    public void edit(int id) {
        System.out.println("Se cambio la cedula");
        this.cedula = id;
    }

    @Override
    public void edit(String name) {
        System.out.println("Se cambio la nombre");
        this.nombre = name;
    }

    @Override
    public int getId() {
        return this.cedula;

    }

    @Override
    public boolean checkData() {
        return new ValidationRenter(this.cedula, this.nombre).validated(); //Llamada al facade de validación
    }
    
    
}
