/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recursividade.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n Menu opcoes");
            System.out.println("\n 1.Somar numeros pares");
            System.out.println("\n 2.Somar elementos");
            System.out.println("\n 3. Contar quantos elementos");
            System.out.println("\n 4. Encerrar");
            opcao = leitor.nextInt();
            
            switch(opcao) {
                case 1: System.out.println("Informe o limite");
                int limite = leitor.nextInt();
                System.out.println("Resultado: " + somaPares(limite));
                
                case 2: System.out.println("Informe o tamanho do vetor");
                int tamanhoVetor = leitor.nextInt();
                double vetor[] = new double[tamanhoVetor];
                for(int j = 0; j < tamanhoVetor; j++){
                    vetor[j] = leitor.nextDouble();
                }
                System.out.println("Resultado: " + somarElementos(vetor, 0));
                
                
            }
        }while(opcao == 4);
        leitor.close();
    }
    
    public static int somaPares(int lim){
        if(lim == 0) {
            return 0;
        }
        else if (lim % 2 == 0) {
            return lim+somaPares(lim-1);
        } 
        else {
        return 0 + somaPares(lim-1);
        }
    }
    
    public static double somarElementos(double[]v, int i) {
        if(i == v.length) {
            return 0;
        }
        else {
            return v[i] + somarElementos(v, i+1);
        }
    }
    
 
}

