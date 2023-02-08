import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
    }

    public boolean esPar(int number) {
        return number % 2 == 0;
    }

    public void imprimeNumero(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(number);
        }
    }

    public void imprimeMayor() {
        Scanner scanner = new Scanner(System.in);
        int entrada = 0;
        int mayor = 0;

        while (entrada == 0) {
            System.out.println("Introduzca un numero");
            entrada = scanner.nextInt();
            mayor = Math.max(mayor, entrada);
        }

        System.out.println(mayor);
    }


    public boolean estaOrdenado(int primero, int segundo, int tercero){
        return isMayor(primero,segundo) && isMayor(segundo,tercero);
    }

    private boolean isMayor(int primero, int segundo){
        return primero<segundo;
    }

    public boolean estaOrdenado(double primero, double segundo, double tercero){
        return isMayor(primero,segundo) && isMayor(segundo,tercero);
    }

    private boolean isMayor(double primero, double segundo){
        return primero<segundo;
    }

}