import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int precopagar = 0;
        System.out.println("digite o codigo do produto");
        int codigo = sc.nextInt();
        System.out.println("digite a quantidade do produto");
        int quantidade = sc.nextInt();

        while (codigo != 0) {
            switch(codigo) {
                case 1:
                    precopagar += 0.5 * quantidade;
                    break;
                case 2:
                    precopagar += 1 * quantidade;
                    break;
                case 3:
                    precopagar += 4 * quantidade;
                    break;
                case 5:
                    precopagar += 7 * quantidade;
                    break;
                case 9:
                    precopagar += 9 * quantidade;
                    break;
                default:
                    System.out.println("codigo invalido");

            }
            System.out.println("digite o codigo do produto");
            codigo = sc.nextInt();
            System.out.println("digite a quantidade do produto");
            quantidade = sc.nextInt();
        }
        System.out.println("preco a pagar: R$ " + precopagar);
    }
}
