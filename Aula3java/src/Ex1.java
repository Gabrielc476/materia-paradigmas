import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    Scanner sc = new Scanner(System.in);
    public void Achar(){
        ArrayList<Integer> valores = new ArrayList<Integer>();

        for (int i = 0; i <= 8; i++){
            valores.add(i);
        }
        System.out.print("digite a posicao de x: ");
        int x = sc.nextInt();
        System.out.print("digite a posicao de y: ");
        int y = sc.nextInt();
        int resultado = valores.get(x) + valores.get(y);
        System.out.println("O valor na posicao x é igual a " + valores.get(x) + " O valor na posicao y é igual a " + valores.get(y) + " e a soma dos dois é igual a " + resultado );


    }
}
