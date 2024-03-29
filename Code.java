import java.util.Scanner;

public class Code{
    public static void SomatorioDiagonais(int tamanho_vetor){
        Scanner ler = new Scanner(System.in);
        int sumLeftToRight = 0;
        int sumRightToLeft = 0;
        int arm = tamanho_vetor * tamanho_vetor;
        int[]vet = new int[arm];
        for(int i = 0; i < arm; i++){
            System.out.print("\ninforme o " +(i+1)+ "º valor: ");
            vet[i] = ler.nextInt();
        }
        
        for(int i = 0; i < arm; i += (tamanho_vetor + 1)){
            sumLeftToRight += vet[i];
        }
        System.out.print("\nsum left to right: " +sumLeftToRight);
	    for(int i = (tamanho_vetor - 1); i < (arm - 1); i += (tamanho_vetor - 1)){
	        sumRightToLeft += vet[i];
	    }
	    System.out.print("\nsum right to left: " +sumRightToLeft);
	    
	    if(sumLeftToRight >= sumRightToLeft){
	        System.out.println("\nA diferença é: " +(sumLeftToRight - sumRightToLeft));
	    }
	    else if(sumRightToLeft >= sumLeftToRight){
	        System.out.println("\na diferença é: " +(sumRightToLeft - sumLeftToRight));
	    }
    }
	public static void main(String[] args) {
	    SomatorioDiagonais(3);
	}
}