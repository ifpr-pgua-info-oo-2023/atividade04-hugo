import java.util.Scanner;

//1- ler a quantidade de numeros
//2- alocar o vetor
//3- ler os numeros e colocar no vetor
//4- verificar se os números estão em ordem crescente

public class Exer01{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidadeNumeros = 0;
        int numeroDigitado;
        int[] numeros;
        boolean estaOrdenado;

        System.out.println("Digite uma quantidade de números:");
        quantidadeNumeros = teclado.nextInt();

        numeros = new int[quantidadeNumeros];

        for(int i=0;i<quantidadeNumeros;i++){
            System.out.println("Digite um número:");
            numeroDigitado = teclado.nextInt();
            numeros[i] = numeroDigitado;
        }

        System.out.println("####Digitados####");
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }


        estaOrdenado = true;
        for(int i=0;i<numeros.length-1;i++){
            if(numeros[i]>numeros[i+1]){
                estaOrdenado = false;
            }
        }

        if(estaOrdenado){
            System.out.println("Está ordenado...");
        }else{
            System.out.println("Não está ordenado...");
        }


    }
}