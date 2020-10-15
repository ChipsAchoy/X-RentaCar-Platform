/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xrentcar.sharecarsystem.FactoryMethod;

import xrentcar.sharecarsystem.FactoryMethod.Account;

/**
 *
 * @author A
 */
public class Renter implements Account{

    @Override
    public User defineUser() {
        return new RenterUser();
    }
    
}
