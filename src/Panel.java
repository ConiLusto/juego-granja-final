

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel {
    private JButton btn1;
    private JButton btn2;
    private JLabel imagen;
    private JPanel panelBotones;

    public Panel(String nombreImagen, String accion) {
        this.imagen = new JLabel(new ImageIcon(nombreImagen));
        this.add(this.imagen, "Center");
        this.btn1 = new JButton(accion);
        this.btn2 = new JButton("Vender");
        this.panelBotones = new JPanel();
        this.panelBotones.add(this.btn1);
        this.panelBotones.add(this.btn2);
        this.add(this.panelBotones, "South");
    }

    public JButton getBtn1() {
        return this.btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        return this.btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JLabel getImagen() {
        return this.imagen;
    }

    public void setImagen(JLabel imagen) {
        this.imagen = imagen;
    }

    public JPanel getPanelBotones() {
        return this.panelBotones;
    }

    public void setPanelBotones(JPanel panelBotones) {
        this.panelBotones = panelBotones;
    }
}
