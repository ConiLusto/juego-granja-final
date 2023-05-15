//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



public class Billetera {
    private static Billetera instance;
    private float dineroTotal = 100.0F;

    private Billetera() {
    }

    public static Billetera getInstance() {
        if (instance == null) {
            instance = new Billetera();
        }

        return instance;
    }

    public void calcularIngresos(float ingreso) {
        this.dineroTotal += ingreso;
    }

    public float getDineroTotal() {
        return this.dineroTotal;
    }
}
