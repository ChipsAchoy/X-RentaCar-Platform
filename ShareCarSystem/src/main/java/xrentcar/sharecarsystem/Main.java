
package xrentcar.sharecarsystem;

import xrentcar.sharecarsystem.FactoryMethod.Account;
import xrentcar.sharecarsystem.FactoryMethod.Lender;
import xrentcar.sharecarsystem.FactoryMethod.Renter;
import xrentcar.sharecarsystem.FactoryMethod.User;


/**
 *
 * @author A
 */
public class Main {
    //To create a Renter account
    /*
    static String selectedFunction = "Renter";
    static String name = "Tobias";
    static int id = 110250478;
    */
    
    //To create a Lender account
    static String selectedFunction = "Lender";
    static String name = "Raul";
    static int id = 124555;
    
    static Account currentAcc;
    static User usr;
    
    static void initialize(){
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
