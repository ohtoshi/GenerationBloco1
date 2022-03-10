/*1. Crie uma um programa para trabalhar com estoque de uma loja,
 * o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque,
 * o programa deverá atender as seguintes funcionalidades:
 * - Armazenar dados da List
 * - Remover dados da list;
 * - Atualizar dados da list.
 * - Apresentar todos os dados da list.
*/

package Collections;

import java.util.ArrayList;
import java.util.List;

public class Exercício1 {
	public static void main (String [] args) {
		
		String item1 = "Caderno 100 fls pautado - Tilibra"; // item da lista
		String item2 = "Post it 50 fls - amarelo"; // item da lista
		String item3 = "Caneta Pentel 0.7mm - verde"; // item da lista
		String item4 = "Marca texto Pucca - amarelo"; // item da lista
		String item5 = "Lapiseira Faber Castel 0.7mm - verde"; // item da lista
		
		List <String> materiais = new ArrayList<>(); //criação da lista
		
		materiais.add(item1); // adicionando itens na lista
		materiais.add(item2);
		materiais.add(item3);
		materiais.add(item4);
		materiais.add(item5);
		
		materiais.remove(1); // removi o item da lista - lembrando que a contagem se inicia em 0
		materiais.add(1, "Caneta Gel Pentel 0.7mm - azul"); // substituição do item na posição 1
		
		System.out.println("Os itens da sua compra foram: " + materiais);
		
	}
}
