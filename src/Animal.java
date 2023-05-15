//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


public abstract class Animal {
    protected float precio;
    protected int contadorComida;
    protected boolean alimentado;

    public Animal() {
    }

    public abstract int getContadorComida();

    public abstract float getPrecio();

    public abstract boolean estaAlimentado();

    public abstract void comer();
}
