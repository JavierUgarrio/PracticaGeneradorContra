package generadorcontrasenas;

/**
 *
 * @author User
 */
public class GeneradorContrasenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(genaradorContrasena());
        
    }
    static String genaradorContrasena(){
        char[] mayusculas ={'A','B','C','D','E','F','G','H','I','J'};
        char[] minusculas ={'a','b','c','d','e','f','g','h','i','j'};
        char[] numeros ={'0','1','2','3','4','5','6','7','8','9','0'};
        StringBuilder  caracteres = new StringBuilder();
        caracteres.append(mayusculas);
        caracteres.append(minusculas);
        caracteres.append(numeros);
        
        StringBuilder contrasena = new StringBuilder();
        
        for(int i =0; i<=15; i++){
            int cantidadCaracteres = caracteres.length();
            int numeroRandom = (int)(Math.random()*cantidadCaracteres);
            contrasena.append((caracteres.toString()).charAt(numeroRandom));
        }
        return contrasena.toString();
    }
    
}
