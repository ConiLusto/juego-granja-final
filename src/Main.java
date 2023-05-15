//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.awt.Component;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Granja granja = new Granja();
        Scanner teclado = new Scanner(System.in);
        System.out.println("1-jugar por interfaz gráfica");
        System.out.println("2-jugar por consola");
        String decision = teclado.next();
        if (decision.equals("1")) {
            PantallaGrafica p1 = new PantallaGrafica(granja);
            p1.setSize(500, 600);
            p1.setLocationRelativeTo((Component)null);
            p1.setVisible(true);
            p1.setDefaultCloseOperation(3);
            p1.setTitle("Granja gráfica");
        }

        if (decision.equals("2")) {
            new GranjaConsola(granja);
        }

    }
}
