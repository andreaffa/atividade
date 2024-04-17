package tabuleiro;

import java.util.Scanner;

public class Tabuleiro {

    

    static void tabu(int x, int y, Personagem personagem){
        int i, j;
        for(i = 1; i <= x; i++){
            for(j = 1; j <= y; j++){
                if(i == personagem.getLinha() && j == personagem.getColuna()){
                    System.out.print("["+ConsoleColors.RED + personagem.getFormato() + ConsoleColors.RESET+"]");
                } else {
                    System.out.print("[.]");
                }
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {

        boolean parar = false;


        Scanner leitor = new Scanner(System.in);
    
        System.out.print("informe a largura: ");
        int x = leitor.nextInt();
    
        System.out.print("informe a altura: ");
        int y = leitor.nextInt();
    
        System.out.print("informe a linha do personagem: ");
        int linha = leitor.nextInt();
    
        System.out.print("informe a coluna do personagem: ");
        int coluna = leitor.nextInt();
    
        System.out.print("informe o formato: ");
        String formato = leitor.next();
    
        Personagem personagem = new Personagem(linha, coluna, formato);
    
        tabu(x, y, personagem);
            

        while(parar != true){
            System.out.println("escolha a operacao:");
            System.out.println("[1] subir");
            System.out.println("[2] descer");
            System.out.println("[3] direita");
            System.out.println("[4] esquerda");
            System.out.println("[5] sair");
        
            int opcao = leitor.nextInt();
        
            switch (opcao) {
                case 1:
                if(personagem.getLinha() >= x){
                    System.out.println("n e possivel subir!");
                } else {
                    personagem.moverParaCima();
                }
                break;
                
                case 2:
                    personagem.moverParaBaixo();
                    break;
                case 3:
                    personagem.moverParaEsquerda();
                    break;
                case 4:
                    personagem.moverParaDireita();
                    break;

                    default:
                    System.out.println("saindo...");
            }
            tabu(x, y, personagem);
        }

    }  
}     

    



