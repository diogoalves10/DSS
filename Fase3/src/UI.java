import java.util.HashMap;
import java.util.Map;

public class UI {

    private Map <String,Utilizador> utilizadores;

    public int IniciarSessao (String email, String password){
        Map <String,Utilizador> utilizadores = new HashMap<String, Utilizador>();
        Utilizador u;

        if (utilizadores.containsKey(email)) {
            u = utilizadores.get(email);

            if (u.getPassword().equals(password)){
                return 0;
            }


        }
        return 1;

    }
    public static void main(String args[]){

    }
}
