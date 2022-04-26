/*Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um programa que permita a entrada das seguintes informações:
    a) o nome da mercadoria para o estoque;
    b) a quantidade mínima dessa mercadoria;
    c) a quantidade atual;
    d) a quantidade máxima;
    e) o valor unitário;
O funcionamento deverá ser da seguinte forma: 
1 - Receber as informações da mercadoria
    1.1 - Não pode receber uma quantidade maior que a capacidade máxima de mercadorias;
    1.2 - Não pode receber valores negativos ou zero;
2 - Perguntar  ‘MAIS MERCADORIAS (S/N)?’. 

3 - Ao final da execução, imprimir o valor total em estoque(calculando o valor de cada mercadoria a partir do valor unitário e quantidade e o valor total do estoque ) e quais as mercadorias que precisam ser repostas em formato de tabela (prettytable ou outro módulo que você prefira).

Recomendação 1: Recomendo fortemente o uso de módulos (criados por vocês) para que o desenvolvimento da aplicação fique mais segmentado. Isso vai permitir que vocês pensem em soluções específicas para as funcionalidades do programa.
Recomendação 2: Caso tenham dificuldade, procurem resolver primeiro as funcionalidades mais simples e depois incrementem. Assim vocês irão exercitar seus cérebros em desenvolver aplicações por etapas. Aos poucos as coisas vão ficando mais fáceis e vocês vão desenvolver cada vez mais rápido. 
Recomendação 3: Coloquem o código no git e façam exercícios de criação de branches(para cada funcionalidade adicionada). Não subestimem o poder e o leque de possibilidades dado por um sistema de versionamento bem organizado.*/
//import functions
import java.util.Scanner;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

  
class Main {

  public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {

    char maisMerc = 'S';
    double valorTotal = 0;
    List<Produto> ListaProdutos=new ArrayList<Produto>(); 
    Produto aux = new Produto();
      
    while(maisMerc != 'N'){
      System.out.println("Insira o nome da mercadoria: ");
      aux.defineRotulo(sc.nextLine());
      System.out.println("Insira a quantidade máxima em estoque dessa mercadoria: ");
      aux.defineQteMax(sc.nextInt());
      while(aux.obtemQteMax() <= 0){
        System.out.println("A quantidade máxima não pode ser menor ou igual a 0. Insira outro valor: ");
        aux.defineQteMax(sc.nextInt());
        }
      System.out.println("Insira a quantidade mínima: ");
      aux.defineQteMin(sc.nextInt()); 
      while(aux.obtemQteMin() <= 0){
        System.out.println("A quantidade mínima não pode ser menor ou igual a 0. Insira outro valor: ");
        aux.defineQteMin(sc.nextInt());
      }
      System.out.println("Insira a quantidade em estoque: ");
      aux.defineQteAtual(sc.nextInt());
      System.out.println("Insira o valor unitário do item: ");
      aux.defineValorUnit(sc.nextDouble());
      while (aux.obtemValorUnit() <= 0){
        System.out.println("O valor unitário não pode ser menor ou igual a 0. Insira outro valor: ");
        aux.defineValorUnit(sc.nextDouble());
      }
      System.out.println("MAIS MERCADORIAS? S/N");
      ListaProdutos.add(aux);
      if(sc.next().charAt(0) == 'S') aux = new Produto();
      else maisMerc = 'N';
    }
    for(int i = 0; i < ListaProdutos.size(); i++){
    valorTotal += (ListaProdutos.get(i).obtemValorUnit() * ListaProdutos.get(i).obtemQteAtual());
    }

    System.out.println("Valor total das mercadorias: R$" + valorTotal + ".");
    System.out.println(aux.str());
  }
/*
  printTabelaProdutos(Produtos)
  printTabelaReposicao(Produtos)
  print(Produtos)
  print("Valor total das mercadorias em estoque: " + str(valorTotal))
  print("Programa encerrado.")
  */
}