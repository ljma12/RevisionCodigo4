import java.util.Scanner;

public class Codigo4 {

	 public static void main(String[] args) {
	
    Scanner s = new Scanner(System.in); // colocar un input
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine().toLowerCase();;
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //corregir a jugador 2
    Scanner s2 = new Scanner(System.in);//colocar un input
    String j2 = s.nextLine().toLowerCase();;
    
    if (j1.equals(j2)) { //equals
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {
            g = 1;
          } else if (j2.equals("papel")) { 
              g = 2; // Gana el jugador 2
          }
          break;//falta el break

        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
          } else if (j2.equals("tijeras")) { 
              g = 2; // Gana el jugador 2
          }
            break;//falta el break
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          } else if (j2.equals("piedra")) { 
              g = 2; // Gana el jugador 2
          }
          break;
        default:
        	System.out.println("gana jugador 1"); //si entra comando no valido
        	return;
      }
      System.out.println("Gana el jugador " + g);
    }
    s.close();
    }
}
