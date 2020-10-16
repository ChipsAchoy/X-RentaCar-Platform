package xrentcar.sharecarsystem.Singleton;

/**
 *
 * AccessPoint implementa el patrón de Singleton para simular una conexión a internet para obtener datos de varias páginas web
 */
public class AccessPoint {
    private static AccessPoint instance = null;
    //Simula el acceso a las bases de datos de las distintas plataformas
    private String[] fbusers = {"Tobias", "Raul", "Luis", "Juana"};
    private int[] placas = {124555, 888999, 774666, 254178};
    private int[] cedulas = {110250347, 120100345, 457850214, 721023645};
    private AccessPoint(){
        
        System.out.println("Connecting to internet");
        System.out.println("Accessing Facebook");
        System.out.println("Accesing Civil Register");
        
    }
    
    public boolean checkFacebook(String nombre){
        boolean check = false;
        for (int i=0; i<fbusers.length; i++){
            if (fbusers[i].equals(nombre)){
                check = true;
                break;
            }
        }
        return check;
    }
    public boolean checkRegister(int ced){
        boolean check = false;
        for (int i=0; i<cedulas.length; i++){
            if (cedulas[i] == ced){
                check = true;
                break;
            }
        }
        return check;
    }
    
    public boolean checkProperty(int placa){
        boolean check = false;
        for (int i=0; i<placas.length; i++){
            if (placas[i] == placa){
            } else {
                check = true;
                break;
            }
        }
        return check;
    }
    
    public synchronized static AccessPoint getInstance(){
        if (instance == null){
            instance = new AccessPoint();
        }
        return instance;
    }
    
}
