

public class Trigo extends juegoFinal.Cultivo implements Vendible {
    public Trigo() {
        super.precio = 25.5F;
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
        if (super.contadorAgua >= 0.75F) {
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
