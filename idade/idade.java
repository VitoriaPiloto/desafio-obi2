import java.util.Scanner;

class Idade {
  public static void main(String[] args) {
    int idadeMaria = 0, idadeFilho1 = 0, idadeFilho2 = 0, idadeFilho3 = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Insira a idade de Dona Maria: ");
    idadeMaria = in.nextInt();
    System.out.println("Insira a idade do primeiro filho: ");
    idadeFilho1 = in.nextInt();
    System.out.println("Insira a idade do segundo filho: ");
    idadeFilho2 = in.nextInt();
    idadeFilho3 = idadeMaria - (idadeFilho1 + idadeFilho2);
    System.out.println("A idade do terceiro filho é: " + idadeFilho3);
  }
}