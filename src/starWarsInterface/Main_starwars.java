package starWarsInterface;

import java.util.Arrays;

/**
 *
 * @author Administrador
 */
public class Main_starwars {
    
    public static void main(String[] args) {
        Jedi padmeAmidala =  new Jedi("Padme Amidala",8, Estado.VIVO, 12000);
        Jedi obiWan = new Jedi("Obi-Wan Kenobi", 8, Estado.VIVO, 15000);
        obiWan.presentarse(); // Imprime información sobre Obi-Wan
        

        obiWan.enamorarse(padmeAmidala); // Obi-Wan se enamora de Padmé

        Jedi anakin = new Jedi("Anakin Skywalker", 9, Estado.VIVO, 18000);
        anakin.presentarse(); // Imprime información sobre Anakin

        anakin.bloquear(obiWan); // Anakin bloquea a Obi-Wan
        
        
        System.out.println(Arrays.toString(anakin.bloqueados));
        System.out.println(obiWan);
        
        anakin.enviar(obiWan, "¿Estás enfadado?");
        obiWan.enviar(anakin, "Ya te he desbloqueado");
        
        
    }
    
}
