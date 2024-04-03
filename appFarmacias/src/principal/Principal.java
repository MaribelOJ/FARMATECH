package principal;
import utils.BaseDatos;

public class Principal {

    public static void main(String[] args) {
        BaseDatos bd = new BaseDatos();
        
        InicioSesion login = new InicioSesion(bd);
        
    }
    
}
