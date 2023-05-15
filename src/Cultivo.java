//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package juegoFinal;

public abstract class Cultivo {
    protected float precio;
    protected float contadorAgua;
    protected boolean regado;

    public Cultivo() {
    }

    public abstract float getContadorAgua();

    public abstract float getPrecio();

    protected abstract boolean estaRegado();

    protected abstract void absorberAgua();
}
