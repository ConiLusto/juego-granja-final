

public class Vaca extends Animal implements Vendible {
    public Vaca() {
        super.precio = 500.0F;
        super.contadorComida = 0;
        super.alimentado = false;
    }

    public int getContadorComida() {
        return super.contadorComida;
    }

    public float getPrecio() {
        return super.precio;
    }

    public void comer() {
        if (!this.estaAlimentado()) {
            ++super.contadorComida;
        }

    }

    public boolean estaAlimentado() {
        if (super.contadorComida >= 3) {
            super.alimentado = true;
        } else {
            super.alimentado = false;
        }

        return super.alimentado;
    }

    public boolean esVendible() {
        return this.estaAlimentado();
    }
}
