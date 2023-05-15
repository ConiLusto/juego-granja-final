//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.util.Scanner;

public class GranjaConsola {
    private Granja granjaConsola;

    public GranjaConsola(Granja granja) {
        this.granjaConsola = granja;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sea bienvenido a su granja por consola");
        System.out.println("Usted inicia con:  \nCorral con 5 vacas \nCorral con 5 cerdos \n10 parcelas de trigo \n10 parcelas de maíz \n$" + Billetera.getInstance().getDineroTotal() + " en su billetera virtual");
        System.out.println("Seleccione 1 para ver animales, 2 para ver cultivos o 3 para salir");
        String eleccion = teclado.next();

        while(true) {
            String eleccionCultivo;
            do {
                if (eleccion.equals("3")) {
                    System.out.println("El juego ha finalizado con éxito");
                    return;
                }

                if (eleccion.equals("1")) {
                    System.out.println("Seleccione 1 para ver a sus vacas, 2 para ver a sus cerdos o 3 para volver al inicio");

                    for(eleccionCultivo = teclado.next(); !eleccionCultivo.equals("3"); eleccionCultivo = teclado.next()) {
                        if (eleccionCultivo.equals("1")) {
                            this.interactuarConVacas();
                        }

                        if (eleccionCultivo.equals("2")) {
                            this.interactuarConCerdos();
                        }

                        System.out.println("Seleccione 1 para ver a sus vacas, 2 para ver a sus cerdos o 3 para volver al inicio");
                    }

                    System.out.println("Seleccione 1 para ver animales, 2 para ver cultivos o 3 para salir");
                    eleccion = teclado.next();
                }
            } while(!eleccion.equals("2"));

            System.out.println("Seleccione 1 para ver el trigo, 2 para ver el choclo o 3 para volver al inicio");

            for(eleccionCultivo = teclado.next(); !eleccionCultivo.equals("3"); eleccionCultivo = teclado.next()) {
                if (eleccionCultivo.equals("1")) {
                    this.interactuarConTrigo();
                }

                if (eleccionCultivo.equals("2")) {
                    this.interactuarConChoclo();
                }

                System.out.println("Seleccione 1 para ver el trigo, 2 para ver el choclo o 3 para volver al inicio");
            }

            System.out.println("Seleccione 1 para ver animales, 2 para ver cultivos o 3 para salir");
            eleccion = teclado.next();
        }
    }

    public void alimentarVacas() {
        if (!this.granjaConsola.estanTodasLasVacasAlimentadas()) {
            this.granjaConsola.alimentarTodasLasVacas();
            System.out.println("Todas las vacas han sido alimentadas 1 vez");
        } else {
            System.out.println("Las vacas ya están alimentadas");
        }

    }

    public void alimentarCerdos() {
        if (!this.granjaConsola.estanTodosLosCerdosAlimentados()) {
            this.granjaConsola.alimentarTodosLosCerdos();
            System.out.println("Todos los cerdos han sido alimentados 1 vez");
        } else {
            System.out.println("Los cerdos ya están alimentados");
        }

    }

    public void regarTrigo() {
        if (!this.granjaConsola.estanTodosLosTrigosRegados()) {
            this.granjaConsola.regarTodoElTrigo();
            System.out.println("+0.25 ml de agua por trigo. Se llenan con 0.75 ml");
        } else {
            System.out.println("El trigo ya está regado lo suficiente: apto para vender");
        }

    }

    public void regarChoclo() {
        if (!this.granjaConsola.estanTodosLosChoclosRegados()) {
            this.granjaConsola.regarTodoElChoclo();
            System.out.println("+0.25 ml de agua por choclo. Se llenan con 1 L");
        } else {
            System.out.println("El choclo ya está regado lo suficiente: apto para vender");
        }

    }

    public void venderVaca() {
        if (this.granjaConsola.venderVaca()) {
            System.out.println("Vaca vendida con éxito, quedan: " + this.granjaConsola.getVacas().size());
        } else {
            System.out.println("No se puede vender vaca");
        }

    }

    public void venderCerdo() {
        if (this.granjaConsola.venderCerdo()) {
            System.out.println("Cerdo vendido con éxito quedan: " + this.granjaConsola.getCerdos().size());
        } else {
            System.out.println("No se puede vender cerdo");
        }

    }

    public void venderTrigo() {
        if (this.granjaConsola.venderTrigo()) {
            System.out.println("Trigo vendido con éxito, quedan: " + this.granjaConsola.getTrigos().size());
        } else {
            System.out.println("No se puede vender trigo");
        }

    }

    public void venderChoclo() {
        if (this.granjaConsola.venderChoclo()) {
            System.out.println("Choclo vendido con éxito,quedan: " + this.granjaConsola.getChoclos().size());
        } else {
            System.out.println("No se puede vender choclo");
        }

    }

    public void abrirBilletera() {
        System.out.println("Su dinero actual es: " + Billetera.getInstance().getDineroTotal());
    }

    public void mostrarTextoIngresoVaca() {
        System.out.println("Seleccione 1 para alimentar a las vacas(se llenan con 3), 2 para vender una vaca, 3 para abrir billetera y 4 para volver atrás");
    }

    public void mostrarTextoIngresoCerdo() {
        System.out.println("Seleccione 1 para alimentar a los cerdos (se llenan con 5), 2 para vender un cerdo, 3 para abrir billetera y 4 para volver atrás");
    }

    public void mostrarTextoIngresoTrigo() {
        System.out.println("Seleccione 1 para regar (se llenan con 0.75 ml), 2 para vender, 3 para abrir billetera y 4 para volver atrás");
    }

    public void mostrarTextoIngresoChoclo() {
        System.out.println("Seleccione 1 para regar (se llenan con 1 L), 2 para vender, 3 para abrir billetera y 4 para volver atrás");
    }

    public void interactuarConVacas() {
        Scanner teclado = new Scanner(System.in);
        this.mostrarTextoIngresoVaca();
        String eleccion = teclado.next();

        while(!eleccion.equals("4")) {
            while(eleccion.equals("1")) {
                this.alimentarVacas();
                this.mostrarTextoIngresoVaca();
                eleccion = teclado.next();
            }

            while(eleccion.equals("2")) {
                this.venderVaca();
                this.mostrarTextoIngresoVaca();
                eleccion = teclado.next();
            }

            while(eleccion.equals("3")) {
                this.abrirBilletera();
                this.mostrarTextoIngresoVaca();
                eleccion = teclado.next();
            }
        }

    }

    public void interactuarConCerdos() {
        Scanner teclado = new Scanner(System.in);
        this.mostrarTextoIngresoCerdo();
        String eleccion = teclado.next();

        while(!eleccion.equals("4")) {
            while(eleccion.equals("1")) {
                this.alimentarCerdos();
                this.mostrarTextoIngresoCerdo();
                eleccion = teclado.next();
            }

            while(eleccion.equals("2")) {
                this.venderCerdo();
                this.mostrarTextoIngresoCerdo();
                eleccion = teclado.next();
            }

            while(eleccion.equals("3")) {
                this.abrirBilletera();
                this.mostrarTextoIngresoCerdo();
                eleccion = teclado.next();
            }
        }

    }

    public void interactuarConTrigo() {
        Scanner teclado = new Scanner(System.in);
        this.mostrarTextoIngresoTrigo();
        String eleccion = teclado.next();

        while(!eleccion.equals("4")) {
            while(eleccion.equals("1")) {
                this.regarTrigo();
                this.mostrarTextoIngresoTrigo();
                eleccion = teclado.next();
            }

            while(eleccion.equals("2")) {
                this.venderTrigo();
                this.mostrarTextoIngresoTrigo();
                eleccion = teclado.next();
            }

            while(eleccion.equals("3")) {
                this.abrirBilletera();
                this.mostrarTextoIngresoTrigo();
                eleccion = teclado.next();
            }
        }

    }

    public void interactuarConChoclo() {
        Scanner teclado = new Scanner(System.in);
        this.mostrarTextoIngresoChoclo();
        String eleccion = teclado.next();

        while(!eleccion.equals("4")) {
            while(eleccion.equals("1")) {
                this.regarChoclo();
                this.mostrarTextoIngresoChoclo();
                eleccion = teclado.next();
            }

            while(eleccion.equals("2")) {
                this.venderChoclo();
                this.mostrarTextoIngresoChoclo();
                eleccion = teclado.next();
            }

            while(eleccion.equals("3")) {
                this.abrirBilletera();
                this.mostrarTextoIngresoChoclo();
                eleccion = teclado.next();
            }
        }

    }
}
