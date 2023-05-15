//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.util.ArrayList;
import java.util.Iterator;

public class Granja {
    private ArrayList<Vaca> vacas = new ArrayList();
    private ArrayList<Cerdo> cerdos = new ArrayList();
    private ArrayList<Trigo> trigos = new ArrayList();
    private ArrayList<Choclo> choclos = new ArrayList();

    public Granja() {
        this.vacas.add(new Vaca());
        this.vacas.add(new Vaca());
        this.vacas.add(new Vaca());
        this.vacas.add(new Vaca());
        this.vacas.add(new Vaca());
        this.cerdos.add(new Cerdo());
        this.cerdos.add(new Cerdo());
        this.cerdos.add(new Cerdo());
        this.cerdos.add(new Cerdo());
        this.cerdos.add(new Cerdo());
        this.trigos.add(new Trigo());
        this.trigos.add(new Trigo());
        this.trigos.add(new Trigo());
        this.trigos.add(new Trigo());
        this.trigos.add(new Trigo());
        this.trigos.add(new Trigo());
        this.trigos.add(new Trigo());
        this.trigos.add(new Trigo());
        this.trigos.add(new Trigo());
        this.trigos.add(new Trigo());
        this.choclos.add(new Choclo());
        this.choclos.add(new Choclo());
        this.choclos.add(new Choclo());
        this.choclos.add(new Choclo());
        this.choclos.add(new Choclo());
        this.choclos.add(new Choclo());
        this.choclos.add(new Choclo());
        this.choclos.add(new Choclo());
        this.choclos.add(new Choclo());
        this.choclos.add(new Choclo());
    }

    public ArrayList<Vaca> getVacas() {
        return this.vacas;
    }

    public ArrayList<Cerdo> getCerdos() {
        return this.cerdos;
    }

    public ArrayList<Trigo> getTrigos() {
        return this.trigos;
    }

    public ArrayList<Choclo> getChoclos() {
        return this.choclos;
    }

    public void alimentarVaca(Vaca v) {
        v.comer();
    }

    public void alimentarTodasLasVacas() {
        Iterator var2 = this.getVacas().iterator();

        while(var2.hasNext()) {
            Vaca v = (Vaca)var2.next();
            this.alimentarVaca(v);
        }

    }

    public boolean venderVaca() {
        boolean resultado = false;
        if (this.getVacas().size() != 0 && ((Vaca)this.getVacas().get(0)).esVendible()) {
            Billetera.getInstance().calcularIngresos(((Vaca)this.getVacas().get(0)).getPrecio());
            this.getVacas().remove(0);
            resultado = true;
        }

        return resultado;
    }

    public boolean estanTodasLasVacasAlimentadas() {
        boolean vacasAlimentadas = true;

        Vaca v;
        for(Iterator var3 = this.getVacas().iterator(); var3.hasNext(); vacasAlimentadas = v.estaAlimentado()) {
            v = (Vaca)var3.next();
        }

        return vacasAlimentadas;
    }

    public void alimentarCerdo(Cerdo c) {
        c.comer();
    }

    public void alimentarTodosLosCerdos() {
        Iterator var2 = this.getCerdos().iterator();

        while(var2.hasNext()) {
            Cerdo c = (Cerdo)var2.next();
            this.alimentarCerdo(c);
        }

    }

    public boolean estanTodosLosCerdosAlimentados() {
        boolean cerdosAlimentados = true;

        Cerdo c;
        for(Iterator var3 = this.getCerdos().iterator(); var3.hasNext(); cerdosAlimentados = c.estaAlimentado()) {
            c = (Cerdo)var3.next();
        }

        return cerdosAlimentados;
    }

    public boolean venderCerdo() {
        boolean resultado = false;
        if (this.getCerdos().size() != 0 && ((Cerdo)this.getCerdos().get(0)).esVendible()) {
            Billetera.getInstance().calcularIngresos(((Cerdo)this.getCerdos().get(0)).getPrecio());
            this.getCerdos().remove(0);
            resultado = true;
        }

        return resultado;
    }

    public void regarTrigo(Trigo t) {
        t.absorberAgua();
    }

    public void regarTodoElTrigo() {
        Iterator var2 = this.getTrigos().iterator();

        while(var2.hasNext()) {
            Trigo t = (Trigo)var2.next();
            this.regarTrigo(t);
        }

    }

    public boolean estanTodosLosTrigosRegados() {
        boolean trigosRegados = true;

        Trigo t;
        for(Iterator var3 = this.getTrigos().iterator(); var3.hasNext(); trigosRegados = t.estaRegado()) {
            t = (Trigo)var3.next();
        }

        return trigosRegados;
    }

    public boolean venderTrigo() {
        boolean resultado = false;
        if (this.getTrigos().size() != 0 && ((Trigo)this.getTrigos().get(0)).esVendible()) {
            Billetera.getInstance().calcularIngresos(((Trigo)this.getTrigos().get(0)).getPrecio());
            this.getTrigos().remove(0);
            resultado = true;
        }

        return resultado;
    }

    public void regarChoclo(Choclo ch) {
        ch.absorberAgua();
    }

    public void regarTodoElChoclo() {
        Iterator var2 = this.getChoclos().iterator();

        while(var2.hasNext()) {
            Choclo ch = (Choclo)var2.next();
            this.regarChoclo(ch);
        }

    }

    public boolean estanTodosLosChoclosRegados() {
        boolean choclosRegados = true;

        Choclo ch;
        for(Iterator var3 = this.getChoclos().iterator(); var3.hasNext(); choclosRegados = ch.estaRegado()) {
            ch = (Choclo)var3.next();
        }

        return choclosRegados;
    }

    public boolean venderChoclo() {
        boolean resultado = false;
        if (this.getChoclos().size() != 0 && ((Choclo)this.getChoclos().get(0)).esVendible()) {
            Billetera.getInstance().calcularIngresos(((Choclo)this.getChoclos().get(0)).getPrecio());
            this.getChoclos().remove(0);
            resultado = true;
        }

        return resultado;
    }
}
