import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PantallaGrafica extends JFrame {
    public PantallaGrafica(final Granja granja) {
        JLabel titulo = new JLabel("Granja La vaca Lola");
        titulo.setHorizontalAlignment(0);
        titulo.setFont(new Font("Cambria", 2, 30));
        titulo.setForeground(Color.MAGENTA);
        this.add(titulo, "North");
        JPanel grilla = new JPanel();
        grilla.setLayout(new GridLayout(2, 2));
        Panel panelVaca = new Panel("vaquita.png", "Alimentar");
        Panel panelCerdo = new Panel("piggy.png", "Alimentar");
        Panel panelTrigo = new Panel("trigo.png", "Regar");
        Panel panelChoclo = new Panel("corn.png", "Regar");
        grilla.add(panelVaca);
        grilla.add(panelCerdo);
        grilla.add(panelTrigo);
        grilla.add(panelChoclo);
        this.add(grilla, "Center");
        final JLabel etiqueta = new JLabel("Sea bienvenido a su granja gráfica");
        final JLabel lblBilletera = new JLabel("Billetera: " + Billetera.getInstance().getDineroTotal());
        etiqueta.setFont(new Font("Cambria", 2, 20));
        lblBilletera.setFont(new Font("Cambria", 0, 20));
        JPanel panelFinal = new JPanel();
        panelFinal.setLayout(new GridLayout(2, 1));
        panelFinal.add(etiqueta);
        panelFinal.add(lblBilletera);
        this.add(panelFinal, "South");
        panelVaca.getBtn1().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!granja.estanTodasLasVacasAlimentadas()) {
                    granja.alimentarTodasLasVacas();
                    etiqueta.setText("+1 alimento para todas las vacas. Se llenan con 3");
                } else {
                    etiqueta.setText("Las vacas ya están alimentadas: aptas para la venta");
                }

            }
        });
        panelVaca.getBtn2().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (granja.venderVaca()) {
                    etiqueta.setText("Vaca vendida con éxito, quedan " + granja.getVacas().size());
                    lblBilletera.setText("Billetera: " + Billetera.getInstance().getDineroTotal());
                } else {
                    etiqueta.setText("No se puede vender vaca");
                }

            }
        });
        panelCerdo.getBtn1().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!granja.estanTodosLosCerdosAlimentados()) {
                    granja.alimentarTodosLosCerdos();
                    etiqueta.setText("+1 alimento para todos los cerdos. Se llenan con 5");
                } else {
                    etiqueta.setText("Los cerdos ya están alimentados: aptos para la venta");
                }

            }
        });
        panelCerdo.getBtn2().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (granja.venderCerdo()) {
                    etiqueta.setText("Cerdo vendido con éxito, quedan " + granja.getCerdos().size());
                    lblBilletera.setText("Billetera: " + Billetera.getInstance().getDineroTotal());
                } else {
                    etiqueta.setText("No se puede vender cerdo");
                }

            }
        });
        panelTrigo.getBtn1().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!granja.estanTodosLosTrigosRegados()) {
                    granja.regarTodoElTrigo();
                    etiqueta.setText("+0.25 ml de agua por trigo. Se llenan con 0.75 ml");
                } else {
                    etiqueta.setText("El trigo ya está regado lo suficiente: apto para vender");
                }

            }
        });
        panelTrigo.getBtn2().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (granja.venderTrigo()) {
                    etiqueta.setText("Trigo vendido con éxito, quedan " + granja.getTrigos().size());
                    lblBilletera.setText("Billetera: " + Billetera.getInstance().getDineroTotal());
                } else {
                    etiqueta.setText("No se puede vender trigo");
                }

            }
        });
        panelChoclo.getBtn1().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!granja.estanTodosLosChoclosRegados()) {
                    granja.regarTodoElChoclo();
                    etiqueta.setText("+0.25 ml de agua por choclo. Se llenan con 1 L");
                } else {
                    etiqueta.setText("El choclo ya está regado lo suficiente: apto para vender");
                }

            }
        });
        panelChoclo.getBtn2().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (granja.venderChoclo()) {
                    etiqueta.setText("Choclo vendido con éxito, quedan " + granja.getChoclos().size());
                    lblBilletera.setText("Billetera: " + Billetera.getInstance().getDineroTotal());
                } else {
                    etiqueta.setText("No se puede vender choclo");
                }

            }
        });
    }
}
