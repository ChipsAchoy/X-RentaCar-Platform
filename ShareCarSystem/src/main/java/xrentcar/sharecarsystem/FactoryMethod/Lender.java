package xrentcar.sharecarsystem.FactoryMethod;

import xrentcar.sharecarsystem.FactoryMethod.Account;

/**
 *
 * Fábrica concreta de cuentas para un propietario de vehículo
 */
public class Lender implements Account{

    @Override
    public User defineUser() {
        return new LenderUser();
    }
    
}
