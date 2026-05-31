import javax.swing.*;
import java.awt.*;

public class PierwszaRamka {
    public static void main(String[] args) {
        JFrame ramka = new JFrame("Tytuł okna");
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setSize(400, 300);
        //ramka.pack();//Ustawia minimalny
        //rozmiar okna potrzebny
        //do wyświetlenia
        //wszystkich komponentów
        //(wymaga Layout
        //Managera)
        ramka.setVisible(true);
        ramka.setTitle("Moja pierwsza aplikacja desktopowa");
        //ramka.setLocation(500, 500);
        ramka.setLocationRelativeTo(null);//na środku ekranu
        //ramka.setResizable(false);
        //ramka.getContentPane().setBackground(Color.CYAN);//ustawia kolor tła głównego kontenera
        Color color = new Color(200, 200, 200);
        ramka.getContentPane().setBackground(color);//ustawia kolor tła głównego kontenera
    }
}
