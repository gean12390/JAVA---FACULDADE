import java.util.Random;
import java.util.Scanner;

public class Batalha {
  int vidaP1 = 20;
  int vidaCpu = 20;
  Random random = new Random();
  Scanner scanner = new Scanner(System.in);
  public String RESET = "\033[0m";
  public String RED = "\033[31m";
  public String GREEN = "\033[32m";

  public void luta() {
    while (vidaP1 > 0 || vidaCpu > 0) {
      System.out.println("Turno do Jogado:");
      System.out.print("Pressione Enter para atacar...");
      scanner.nextLine();

      int ataqueP1 = random.nextInt(6);
      vidaCpu -= ataqueP1;
      System.out
          .println(GREEN + "Jogador atacou a CPU e causou " + ataqueP1 + " de dano. Vida da CPU: " + vidaCpu + RESET);

      if (vidaCpu <= 0) {
        System.out.println("A CPU foi derrotada! \n");
        break;
      }

      System.out.println("Turno da CPU:");
      int ataqueCpu = random.nextInt(6);
      vidaP1 -= ataqueCpu;
      System.out.println(RED + "A CPU atacou o Jogador e causou " + ataqueCpu + " de dano. Vida do Jogador 1: " + vidaP1 + RESET);

      if (vidaP1 <= 0) {
        System.out.println("O Jogador morreu. \n");
        break;
      }
    }
  }
}
