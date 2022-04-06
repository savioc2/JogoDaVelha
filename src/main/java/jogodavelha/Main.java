/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package jogodavelha;

/**
 * Autor Sávio Cunha 
 * 
 */

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		String[][] matriz; 
        matriz = new String[4][4];
		int indice = 0;
                int aux;        
                        
		matriz[1][1]="7"; 
		matriz[1][2]="8";
		matriz[1][3]="9";
		matriz[2][1]="4"; 
		matriz[2][2]="5";
		matriz[2][3]="6";
		matriz[3][1]="1";
		matriz[3][2]="2";
		matriz[3][3]="3";
		
		System.out.print("Insira o nome do jogador 1: "); 
		String play1 = s.nextLine(); 
		System.out.println("Simbolo para jogador 1 - 'X' ");
		System.out.print("Insira o nome do jogador 2: "); 
		String play2 = s.nextLine(); 
		System.out.println("Simbolo para jogador 1 - 'O' ");
		
		boolean loop =true;
		while(loop) {
                        indice++;
			
			System.out.println("      +---+---+---+");
			System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
			System.out.println("      +---+---+---+");
			System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
			System.out.println("      +---+---+---+");
			System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
			System.out.println("      +---+---+---+");
			
			System.out.print("Jogador 1:"); 
			int play = s.nextInt();
			
	
			switch(play){
				case 1:
				if (("O".equals(matriz[3][1])) || ("X".equals(matriz[3][1]))) {
					System.out.println("Quadrante repetido, perdeu a vez"); 
					}else{
					matriz[3][1]="X";
					break;
				}
				case 2:
				if (("O".equals(matriz[3][2])) || ("X".equals(matriz[3][2]))) {
					System.out.println("Quadrante repetido, perdeu a vez");
					break;
					}else{
					matriz[3][2]="X";
					break;
				}
				case 3:
				if (("O".equals(matriz[3][3])) || ("X".equals(matriz[3][3]))) {
					System.out.println("Quadrante repetido");
					break;
					}else{
					matriz[3][3]="X";
					break;
				}
				case 4:
				if (("O".equals(matriz[2][1])) || ("X".equals(matriz[2][1]))) {
					System.out.println("Quadrante repetido, perdeu a vez");
					break;
					}else{
					matriz[2][1]="X";
					break;
				}
				case 5:
				if (("O".equals(matriz[2][2])) || ("X".equals(matriz[2][2]))) {
					System.out.println("Quadrante repetido, perdeu a vez");
					break;
					}else{
					matriz[2][2]="X";
					break;
				}
				case 6:
				if (("O".equals(matriz[2][3])) || ("X".equals(matriz[2][3]))) {
					System.out.println("Quadrante repetido, perdeu a vez");
					break;
					}else{
					matriz[2][3]="X";
					break;
				}
				case 7:
				if (("O".equals(matriz[1][1])) || ("X".equals(matriz[1][1]))) {
					System.out.println("Quadrante repetido, perdeu a vez");
					break;
					}else{
					matriz[1][1]="X"; 
					break;
				}
				case 8:
				if (("O".equals(matriz[1][2])) || ("X".equals(matriz[1][2]))) {
					System.out.println("Quadrante repetido, perdeu a vez");
					break;
					}else{
					matriz[1][2]="X";
					break;
				}
				case 9:
				if (("O".equals(matriz[1][3])) || ("X".equals(matriz[1][3]))) {
					System.out.println("Quadrante repetido, perdeu a vez");
					break;
					}else{
					matriz[1][3]="X";
					break;
				}
				default:
				
				System.out.println("Quadrante invalido, perdeu a vez, digite valores que 1 - 9"); 
				break;
			}
		
		 aux = 0;
			for (int linha = 0; linha < 4; linha++) {
				for (int coluna = 0; coluna < 4; coluna++) {
					if ("X".equals(matriz[linha][coluna]) || "O".equals(matriz[linha][coluna])) {
						aux = aux+1;
					}
				}
			}
			if(aux==9){
				System.out.println("Empate!"); 
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			
			if ("X".equals(matriz[3][1]) && "X".equals(matriz[3][2]) && "X".equals(matriz[3][3])) {
				System.out.println("Parabéns" + play1 + " você ganhou!"); 
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			if ("X".equals(matriz[2][1]) && "X".equals(matriz[2][2]) && "X".equals(matriz[2][3])) {
				System.out.println("Parabéns" + play1 + " você ganhou!");
				System.exit(0);
			}
			if ("X".equals(matriz[1][1]) && "X".equals(matriz[1][2]) && "X".equals(matriz[1][3])) {
				System.out.println("Jogador 1," + play1 + " ganhou!");
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			if ("X".equals(matriz[1][1]) && "X".equals(matriz[2][1]) && "X".equals(matriz [3][1])) { 
				System.out.println("Parabéns" + play1 + " você ganhou!");
				System.out.println();
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			if ("X".equals(matriz[1][2]) && "X".equals(matriz[2][2]) && "X".equals(matriz[3][2])) {
				System.out.println("Parabéns" + play1 + " você ganhou!");
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			if ("X".equals(matriz[1][3]) && "X".equals(matriz[2][3]) && "X".equals(matriz[3][3])) {
				System.out.println("Parabéns" + play1 + " você ganhou!");
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			if ("X".equals(matriz[1][1]) && "X".equals(matriz[2][2]) && "X".equals(matriz[3][3])) {
				System.out.println("Parabéns," + play1 + " você ganhou!");
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			if ("X".equals(matriz[1][3]) && "X".equals(matriz[2][2]) && "X".equals(matriz[3][1])) {
				System.out.println("Parabéns" + play1 +" você ganhou!" );
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			
			
			if (indice != 5) {
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
				System.out.println("      +---+---+---+");
				
				System.out.print("Jogador 2: "); 
				play = s.nextInt();
				switch(play){
					case 1:
				if (("O".equals(matriz[3][1])) || ("X".equals(matriz[3][1]))) {
					System.out.println("Quadrante repetido, perdeu a vez"); 
					}else{
					matriz[3][1]="O";
					break;
				}
				case 2:
				if (("O".equals(matriz[3][2])) || ("X".equals(matriz[3][2]))) {
					System.out.println("Quadrante repetido, perdeu a vez");
					break;
					}else{
					matriz[3][2]="O";
					break;
				}
				case 3:
				if (("O".equals(matriz[3][3])) || ("X".equals(matriz[3][3]))) {
					System.out.println("Quadrante repetido");
					break;
					}else{
					matriz[3][3]="O";
					break;
				}
				case 4:
				if (("O".equals(matriz[2][1])) || ("X".equals(matriz[2][1]))) {
					System.out.println("Quadrante repetido, perdeu a vez");
					break;
					}else{
					matriz[2][1]="O";
					break;
				}
				case 5:
				if (("O".equals(matriz[2][2])) || ("X".equals(matriz[2][2]))) {
					System.out.println("Quadrante repetido, perdeu a vez");
					break;
					}else{
					matriz[2][2]="O";
					break;
				}
				case 6:
				if (("O".equals(matriz[2][3])) || ("X".equals(matriz[2][3]))) {
					System.out.println("Quadrante repetido, perdeu a vez");
					break;
					}else{
					matriz[2][3]="O";
					break;
				}
				case 7:
				if (("O".equals(matriz[1][1])) || ("X".equals(matriz[1][1]))) {
					System.out.println("Quadrante repetido, perdeu a vez");
					break;
					}else{
					matriz[1][1]="O"; 
					break;
				}
				case 8:
				if (("O".equals(matriz[1][2])) || ("X".equals(matriz[1][2]))) {
					System.out.println("Quadrante repetido, perdeu a vez");
					break;
					}else{
					matriz[1][2]="O";
					break;
				}
				case 9:
				if (("O".equals(matriz[1][3])) || ("X".equals(matriz[1][3]))) {
					System.out.println("Quadrante repetido, perdeu a vez");
					break;
					}else{
					matriz[1][3]="O";
					break;
				}
					default:
					
					System.out.println("Quadrante invalido, perdeu a vez, digite valores que 1 - 9"); 
                                        break;
				}
			aux = 0;
                            for (int linha = 0; linha < 4; linha++) {
				for (int coluna = 0; coluna < 4; coluna++) {
                                    if ("X".equals(matriz[linha][coluna]) || "O".equals(matriz[linha][coluna])) {
						aux++;
						}
					}
				}
				if(aux == 9){
					System.out.println("Empate!"); 
					
					System.exit(0);
				}
				if ("O".equals(matriz[3][1]) && "O".equals(matriz[3][2]) && "O".equals(matriz[3][3])) {
					System.out.println("Parabéns, " + play2 + " você ganhou!"); 
					System.exit(0);
				}
				if ("O".equals(matriz[2][1]) && "O".equals(matriz[2][2]) && "O".equals(matriz[2][3])) {
					System.out.println("Parabéns," + play2 +" você ganhou!" );
                                        System.out.println();
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
                                        System.out.println("      +---+---+---+");
					System.exit(0);
				}
				if ("O".equals(matriz[1][1]) && "O".equals(matriz[1][2]) && "O".equals(matriz[1][3])) {
					System.out.println("Parabéns," + play2 +" você ganhou!" );
                                        System.out.println();
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
                                        System.out.println("      +---+---+---+");
					System.exit(0);
				}
				if ("O".equals(matriz[1][1]) && "O".equals(matriz[2][1]) && "O".equals(matriz[3][1])) { 
					System.out.println("Parabéns," + play2 +" você ganhou!" );
                                        System.out.println();
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
                                        System.out.println("      +---+---+---+");
					System.exit(0);
				if ("O".equals(matriz[1][2]) && "O".equals(matriz[2][2]) && "O".equals(matriz[3][2])) {
					System.out.println("Parabéns," + play2 +" você ganhou!" );
                                        System.out.println();
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
                                        System.out.println("      +---+---+---+");
					System.exit(0);
				}
				if ("O".equals(matriz[1][3]) && "O".equals(matriz[2][3]) && "0".equals(matriz[3][3])) {
					System.out.println("Parabéns," + play1 +" você ganhou!" );
                                        System.out.println();
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
                                        System.out.println("      +---+---+---+");
					System.exit(0);
				}
				if ("O".equals(matriz[1][1]) && "O".equals(matriz[2][2]) && "o".equals(matriz[3][3])) {
                                        System.out.println("Parabéns," + play1 +" você ganhou!" );
                                        System.out.println();
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
                                        System.out.println("      +---+---+---+");
					System.exit(0);
				}
				if ("O".equals(matriz[1][3]) && "O".equals(matriz[2][2]) && "O".equals(matriz[3][1])) {
					System.out.println("Parabéns," + play1 +" você ganhou!" );
                                        System.out.println();
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " |");
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " |");
                                        System.out.println("      +---+---+---+");
                                        System.out.println("      | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " |");
                                        System.out.println("      +---+---+---+");
					System.exit(0);
				}
			}
		}
	}
    }
}
