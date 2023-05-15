//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


public class Choclo extends juegoFinal.Cultivo implements Vendible {
    public Choclo() {
        super.precio = 105.99F;
        super.contadorAgua = 0.0F;
        super.regado = false;
    }

    public float getContadorAgua() {
        return super.contadorAgua;
    }

    public float getPrecio() {
        return super.precio;
    }

    protected boolean estaRegado() {
        if (super.contadorAgua >= 1.0F) {
            super.regado = true;
        } else {
            super.regado = false;
        }

        return super.regado;
    }

    protected void absorberAgua() {
        if (!this.estaRegado()) {
            super.contadorAgua += 0.25F;
        }

    }

    public boolean esVendible() {
        return this.estaRegado();
    }
}
