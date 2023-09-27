import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    ArrayList<Integer> valores = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);

    int maior = 0;
    int menor = Integer.MAX_VALUE;
    int soma = 0;
    int media = 0;
    int maiores = 0;

    public void Vetor(){

        for (int i = 0; i <= 10; i++){
            System.out.print("Digite um valor para adicionar ao vetor: ");
            int x = sc.nextInt();
            System.out.println("");
            valores.add(x);
        }

    }

    public void Consulta(){
        for(int valor : valores ){
            soma += valor;
            if (valor > maior){
                maior = valor;
            }
            if (valor < menor){
                menor = valor;
            }
            if (valor >= 5){
                maiores++;
            }
        }
        media = soma / valores.size();
    }

    public void Mostrar(){
        Vetor();
        Consulta();
        System.out.println("O maior valor é igual a: " + maior + ". O menor valor é igual a: " + menor + ". A soma de todos os valores é igual a: " + soma + " e a media é igual a: " + media + ". o numero de valores maiores ou iguais a 5 é igual a: " + maiores);
    }
}
