package xrentcar.sharecarsystem.FactoryMethod;

/**
 *
 * Interfaz que define los métodos que cada usuario debe de tener
 */
public interface User {
    void create(int id, String name);
    void edit(int id);
    void edit(String name);
    int getId();
    boolean checkData();
}
