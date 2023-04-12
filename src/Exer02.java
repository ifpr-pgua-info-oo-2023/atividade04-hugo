import java.util.Random;
import java.util.Scanner;

//1- ler 6 numeros únicos entre 1 e 60 e armazenar no vetor
//2- sortear 6 numeros unicos entre 1 e 60
//3- comparar os numeros e contar quantos são iguais

public class Exer02 {
    

    static boolean jahDigitou(int numero, int[] vetor){
        
        for(int i=0;i<vetor.length;i++){
            if(vetor[i] == numero){
                return true;
            }
        }

        return false;
    }

    static void imprimeVetor(int[] vetor){
        System.out.println("####Digitados####");
        System.out.print("[");
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]);
            if(i<vetor.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random(System.currentTimeMillis());
        
        int numero;
        int[] numerosDigitados, numerosSorteados;
        int numeroAcertos=0;

        numerosDigitados = new int[6];
        numerosSorteados = new int[6];

        for(int i=0;i<numerosDigitados.length;i++){
            do{
                System.out.println("Digite um número entre 1 e 60:");
                numero = teclado.nextInt();
            }while(numero < 1 || numero > 60 || jahDigitou(numero, numerosDigitados));
            
            numerosDigitados[i] = numero;
        }

        imprimeVetor(numerosDigitados);


        for(int i=0;i<numerosSorteados.length;i++){
            do{
                numero = rand.nextInt(60)+1;
            }while(jahDigitou(numero, numerosSorteados));
            
            numerosSorteados[i] = numero;
        }

        imprimeVetor(numerosSorteados);

        for(int i=0;i<numerosDigitados.length;i++){
            for(int j=0;j<numerosSorteados.length;j++){
                if(numerosDigitados[i] == numerosSorteados[j]){
                    numeroAcertos += 1;
                }
            }
        }

        if(numeroAcertos == 6){
            System.out.println("Ficou rico!!!");
        }else if(numeroAcertos == 5){
            System.out.println("Quase lá...");
        }else{
            System.out.println("Não foi dessa vez...");
        }

    }
}
