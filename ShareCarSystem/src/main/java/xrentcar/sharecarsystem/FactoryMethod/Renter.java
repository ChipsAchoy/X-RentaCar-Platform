package xrentcar.sharecarsystem.FactoryMethod;

import xrentcar.sharecarsystem.FactoryMethod.Account;

/**
 *
 * Fábrica concreta de cuentas de clientes
 */
public class Renter implements Account{

    @Override
    public User defineUser() {
        return new RenterUser();
    }
    
}
