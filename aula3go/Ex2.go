package main

import "fmt"

func main() {
	var arr1 = [10]int{}
	var maior = 0
	var menor = 999999
	var soma = 0
	var media = 0
	var maiores = 0
	var x = 0

	for i := 0; i < 10; i++ {
		fmt.Print("digite o valor para colocar no vetor: ")
		fmt.Scan(&x)

		if x > maior {
			maior = x
		}
		if x < menor {
			menor = x
		}
		if x >= 5 {
			maiores++
		}
		soma += x

		arr1[i] = x
	}

	media = soma / len(arr1)

	fmt.Println("O maior valor é igual a: ", maior)
	fmt.Println("O menor valor é igual a: ", menor)
	fmt.Println("A soma dos valores é igual a: ", soma)
	fmt.Println("A media dos valores é igual a: ", media)
	fmt.Println("O numero de valores maior ou igual a 5 é igual a: ", maiores)

}
