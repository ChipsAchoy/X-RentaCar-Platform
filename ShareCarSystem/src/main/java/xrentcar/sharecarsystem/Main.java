
package xrentcar.sharecarsystem;

import xrentcar.sharecarsystem.FactoryMethod.Account;
import xrentcar.sharecarsystem.FactoryMethod.Lender;
import xrentcar.sharecarsystem.FactoryMethod.Renter;
import xrentcar.sharecarsystem.FactoryMethod.User;


/**
 *
 * @author Anthony Chaves, Christopher Castro y Jan Marschatz
 * Simulación de una aplicación para el sistema ShareCarSystem
 * Este Main selecciona si la cuenta del usuario es de propietario de un vehículo o cliente que rentará uno
 */
public class Main {
    //Para crear una cuenta de cliente
    /*
    static String selectedFunction = "Renter";
    static String name = "Tobias";
    static int id = 110250478;
    */
    
    //Para crear una cuenta de propietario/vehiculo
    static String selectedFunction = "Lender"; //selectedFunction simula la selección que se realizaría en la interfaz gráfica, por ejemplo
    static String name = "Raul";
    static int id = 124555;
    
    static Account currentAcc;
    static User usr;
    
    static void initialize(){ //inicializa el programa segun la necesidad del usuario
        if (selectedFunction.equals("Renter")){
            currentAcc = new Renter();
        }
        else if (selectedFunction.equals("Lender")){
            currentAcc = new Lender();
        }
    }
    public static void main(String[] args){
        initialize();
        usr = currentAcc.defineUser();
        if (usr.checkData()){
            usr.create(id, name);
            System.out.println("User created");
        }
        else{
            System.out.println("Error validando");
        }
    }
}
