package main

import "fmt"

func main() {

	var codigo int
	var quantidade int

	fmt.Println("digite o codigo do produto: ")
	fmt.Scan(&codigo)
	fmt.Println("digite a quantidade que você vai levar desse produto")
	fmt.Scan(&quantidade)

	calcular(codigo, quantidade)

}

func calcular(codigo int, quantidade int) {
	preco := 0

	for codigo != 0 {
		if codigo == 1 {

			var centavos float64 = 0.50

			preco += int(centavos) * quantidade
		}
		if codigo == 2 {

			preco += 1 * quantidade
		}
		if codigo == 3 {

			preco += 4 * quantidade
		}
		if codigo == 5 {

			preco += 7 * quantidade
		}
		if codigo == 9 {

			preco += 8 * quantidade
		} else {

			fmt.Println("codigo invalido")
		}

		fmt.Println("digite o codigo do produto: ")
		fmt.Scan(&codigo)
		fmt.Println("digite a quantidade que você vai levar desse produto")
		fmt.Scan(&quantidade)
	}

	fmt.Println(preco)

}
