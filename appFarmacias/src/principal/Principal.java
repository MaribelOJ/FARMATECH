package principal;
import utils.BaseDatos;
import utils.BaseDatosMiguel;

public class Principal {

    public static void main(String[] args) {
        BaseDatos bd = new BaseDatos();
        BaseDatosMiguel bdmiguel = new BaseDatosMiguel();
        
        InicioSesion login = new InicioSesion(bd);
        
    }
    
}
