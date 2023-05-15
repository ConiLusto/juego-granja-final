//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



public class Cerdo extends Animal implements Vendible {
    public Cerdo() {
        super.precio = 250.0F;
        super.contadorComida = 0;
        super.alimentado = false;
    }

    public int getContadorComida() {
        return super.contadorComida;
    }

    public float getPrecio() {
        return super.precio;
    }

    public boolean estaAlimentado() {
        if (super.contadorComida >= 5) {
            super.alimentado = true;
        } else {
            super.alimentado = false;
        }

        return super.alimentado;
    }

    public void comer() {
        if (!this.estaAlimentado()) {
            ++super.contadorComida;
        }

    }

    public boolean esVendible() {
        return this.estaAlimentado();
    }
}
