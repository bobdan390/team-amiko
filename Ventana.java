package vista;

import controlador.Control;
import javax.swing.*;

public class Ventana extends JFrame{
    
public JPanel pnl1;
public  JButton btn1;
public JTextField txt1;
//constructor
public Ventana(){
    //Agregando y creando Panel
    getContentPane().add(pnl1=new JPanel());
    pnl1.add(txt1=new JTextField(20));
    pnl1.add(btn1=new JButton("Mostrar"));
    
    Control c = new Control(this);
    btn1.addActionListener(c);
    
    
    setSize(300, 100);
    setDefaultCloseOperation(3);
    setVisible(true);
}
    
}
