import java.util.Scanner;

public class calculoDeSegundosEmHorasMinutosSegundos {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.print("Informe os segundos: ");
        int segundos = prompt.nextInt();
        int horas = segundos/60/60;
        segundos= segundos - (horas*60*60);
        int minutos= segundos/60;
        segundos= segundos - (minutos*60);
        System.out.println("Horas: "+horas+" Minutos: "+minutos+" Segundos: "+segundos);
    }
}
