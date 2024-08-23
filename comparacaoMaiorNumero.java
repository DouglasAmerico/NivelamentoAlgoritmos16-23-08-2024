import java.util.Scanner;
//1.	Escreva um programa para ler 2 valores (valide para não aparecer
//      valores iguais) e escrever o maior deles.
public class comparacaoMaiorNumero {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        Integer numero1 = prompt.nextInt();
        System.out.print("Informe o segundo valor: ");
        Integer numero2 = prompt.nextInt();

        if(numero1 > numero2){
            System.out.println("O numero 1: "+numero1+" é maior que o numero 2: "+numero2);
        }else if(numero1 < numero2){
            System.out.println("O numero 1: "+numero1+" é menor que o numero 2: "+numero2);
        }else{
            System.out.println("O numero 1: "+numero1+" é igual ao numero 2: "+numero2);
        }
    }
}
