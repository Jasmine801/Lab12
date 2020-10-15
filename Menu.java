
package Lab12;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Menu extends JFrame {

    JRadioButton jRadioButton1;
    JRadioButton jRadioButton2;
    JRadioButton jRadioButton3;
    JRadioButton jRadioButton4;
    JRadioButton jRadioButton5;
    JRadioButton jRadioButton6;
    JRadioButton jRadioButton7;
    JRadioButton jRadioButton8;
    JButton jButton;

    ButtonGroup G1;

    JLabel L1;

    public Menu()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jRadioButton5 = new JRadioButton();
        jRadioButton6 = new JRadioButton();
        jRadioButton7 = new JRadioButton();
        jRadioButton8 = new JRadioButton();
        jButton = new JButton("Инфо");

        G1 = new ButtonGroup();

        L1 = new JLabel("Планеты");


        jRadioButton1.setText("МЕРКУРИЙ");
        jRadioButton2.setText("ВЕНЕРА");
        jRadioButton3.setText("ЗЕМЛЯ");
        jRadioButton4.setText("МАРС");
        jRadioButton5.setText("ЮПИТЕР");
        jRadioButton6.setText("САТУРН");
        jRadioButton7.setText("УРАН");
        jRadioButton8.setText("НЕПТУН");

        jRadioButton1.setBounds(80, 20, 120, 20);
        jRadioButton2.setBounds(80, 40, 80, 20);
        jRadioButton3.setBounds(80, 60, 80, 20);
        jRadioButton4.setBounds(80, 80, 80, 20);
        jRadioButton5.setBounds(80, 100, 120, 20);
        jRadioButton6.setBounds(80, 120, 120, 20);
        jRadioButton7.setBounds(80, 140, 120, 20);
        jRadioButton8.setBounds(80, 160, 120, 20);


        jButton.setBounds(270, 150, 80, 30);

        L1.setBounds(20, -160, 400, 350);


        this.add(jRadioButton1);
        this.add(jRadioButton2);
        this.add(jRadioButton3);
        this.add(jRadioButton4);
        this.add(jRadioButton5);
        this.add(jRadioButton6);
        this.add(jRadioButton7);
        this.add(jRadioButton8);
        this.add(jButton);
        this.add(L1);

        G1.add(jRadioButton1);
        G1.add(jRadioButton2);
        G1.add(jRadioButton3);
        G1.add(jRadioButton4);
        G1.add(jRadioButton5);
        G1.add(jRadioButton6);
        G1.add(jRadioButton7);
        G1.add(jRadioButton8);

        jButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if (jRadioButton1.isSelected()) {
                    Planet ch1 = Planet.MERCURY;
                    JOptionPane.showMessageDialog(Menu.this, "Масса(КГ) " + ch1.getMass() +"\nРадиус(КМ): " + ch1.getRad() +"\nГравитация(М/С^2) "+ ch1.getGravity());
                }
                else if (jRadioButton2.isSelected()) {

                    Planet ch1 = Planet.VENUS;
                    JOptionPane.showMessageDialog(Menu.this, "Масса(КГ) " + ch1.getMass() +"\nРадиус(КМ): " + ch1.getRad() +"\nГравитация(М/С^2) "+ ch1.getGravity());
                }
                else if (jRadioButton3.isSelected()) {
                    Planet ch1 = Planet.EARTH;
                    JOptionPane.showMessageDialog(Menu.this, "Масса(КГ) " + ch1.getMass() +"\nРадиус(КМ): " + ch1.getRad() +"\nГравитация(М/С^2) "+ ch1.getGravity());
                }
                else if (jRadioButton4.isSelected()) {
                    Planet ch1 = Planet.MARS;
                    JOptionPane.showMessageDialog(Menu.this, "Масса(КГ) " + ch1.getMass() +"\nРадиус(КМ): " + ch1.getRad() +"\nГравитация(М/С^2) "+ ch1.getGravity());
                }
                else if (jRadioButton5.isSelected()) {
                    Planet ch1 = Planet.JUPITER;
                    JOptionPane.showMessageDialog(Menu.this, "Масса(КГ) " + ch1.getMass() +"\nРадиус(КМ): " + ch1.getRad() +"\nГравитация(М/С^2) "+ ch1.getGravity());
                }
                else if (jRadioButton6.isSelected()) {
                    Planet ch1 = Planet.SATURN;
                    JOptionPane.showMessageDialog(Menu.this, "Масса(КГ) " + ch1.getMass() +"\nРадиус(КМ): " + ch1.getRad() +"\nГравитация(М/С^2) "+ ch1.getGravity());
                }
                else if (jRadioButton7.isSelected()) {
                    Planet ch1 = Planet.URANUS;
                    JOptionPane.showMessageDialog(Menu.this, "Масса(КГ) " + ch1.getMass() +"\nРадиус(КМ): " + ch1.getRad() +"\nГравитация(М/С^2) "+ ch1.getGravity());
                }
                else if (jRadioButton8.isSelected()){
                    Planet ch1 = Planet.NEPTUNE;
                    JOptionPane.showMessageDialog(Menu.this, "Масса(КГ) " + ch1.getMass() +"\nРадиус(КМ): " + ch1.getRad() +"\nГравитация(М/С^2) "+ ch1.getGravity());
                }
                else {
                    JOptionPane.showMessageDialog(Menu.this,"ПЛАНЕТА НЕ ВЫБРАНА", "Ошшибка", JOptionPane.ERROR_MESSAGE );
                }
            }
        });
    }
    public static void main(String args[])
    {
        Menu ch2 = new Menu();

        ch2.setBounds(100, 100, 420, 270);

        ch2.setTitle("Солнечная система");
        ch2.setVisible(true);
    }

}

