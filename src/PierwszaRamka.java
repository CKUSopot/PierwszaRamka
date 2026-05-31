import javax.swing.*;
import java.awt.*;

public class PierwszaRamka {
    public static void main(String[] args) {
        JFrame ramka = new JFrame("Tytuł okna");// 1. Tworzenie obiektu ramki (kontenera najwyższego poziomu)
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 2. Ustawienie operacji zamykania ramki (ważne!)
        // EXIT_ON_CLOSE: kończy działanie programu po zamknięciu okna
        ramka.setSize(400, 300);// 3. Ustawienie rozmiaru okna, szerokość, wysokość w pikselach
        //ramka.pack();//Ustawia minimalny rozmiar okna potrzebny do wyświetlenia wszystkich komponentów (wymaga Layout Managera)
        ramka.setVisible(true);// 4. Ustawienie widoczności ramki
        ramka.setTitle("Moja pierwsza aplikacja desktopowa");//tytuł okna
        //ramka.setLocation(500, 500);
        ramka.setLocationRelativeTo(null);//na środku ekranu
        //ramka.setResizable(false);
        //ramka.getContentPane().setBackground(Color.CYAN);//ustawia kolor tła głównego kontenera
        Color color = new Color(200, 200, 200);
        ramka.getContentPane().setBackground(color);//ustawia kolor tła głównego kontenera
    }
}
