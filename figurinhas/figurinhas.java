import java.util.Scanner;

class Figurinhas {
  public static void main(String[] args) {
    // N = numero de figurinhas e espaços do album, C = numero de figurinhas
    // carimbadas do album, M = número de figurinhas já compradas.
    // X = carimbadas, y = figurinhas que possui
    int N, C, M, x, y, i = 0, resposta = 0;
    int carimbadas[] = new int[105];
    int album[] = new int[105];
    Scanner in = new Scanner(System.in);
    System.out.println("Insira o número de espaços no album: ");
    N = in.nextInt();
    System.out.println("Insira o número de figurinhas carimbadas no album: ");
    C = in.nextInt();
    System.out.println("Insira o número de figurinhas já compradas: ");
    M = in.nextInt();
    for (i = 1; i <= N; i++) {
      carimbadas[i] = album[i] = 0;
    }
    for (i = 0; i < C; i++) {
      System.out.println("Insira as figurinhas que são carimbadas: ");
      x = in.nextInt();
      carimbadas[x] = 1;
    }
    for (i = 0; i < M; i++) {
      System.out.println("Insira as figurinhas carimbadas que você possui: ");
      y = in.nextInt();
      album[y] = 1;
    }
    for (i = 1; i <= N; i++) {
      if (album[i] == 0 && carimbadas[i] == 1) {
        resposta++;
      }
    }
    System.out.println("A resposta é: " + resposta);
  }
}