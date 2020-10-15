/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xrentcar.sharecarsystem.FactoryMethod;

/**
 *
 * @author A
 */
public interface User {
    void create(int id, String name);
    void edit(int id);
    void edit(String name);
    int getId();
    boolean checkData();
}
