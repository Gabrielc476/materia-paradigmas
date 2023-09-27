package main

import "fmt"

func main() {
	var arr1 = [8]int{0, 1, 2, 3, 4, 5, 6, 7}
	var x = 0
	var y = 0

	fmt.Print("Digite a posição de x: ")
	fmt.Scan(&x)
	fmt.Print("digite a posição de y: ")
	fmt.Scan(&y)

	var resultado = arr1[x] + arr1[y]

	fmt.Println("a soma dos dois é igual a: ", resultado)
}
