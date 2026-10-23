package view;
import model.*;

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        c.somar(1,2);
        c.somar(1, 2, 3);
        c.somar(2.5,2.5);
    }
}
