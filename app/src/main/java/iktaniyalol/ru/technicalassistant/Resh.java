package iktaniyalol.ru.technicalassistant;

public class Resh {
    public double stepen(double number, double i) {
        double itog = Math.pow(number, i);
        return itog;
    }

    public double koren(double number, double i) {
        if (i <= 0) {
            return 0;
        }
        double itog = Math.pow(number, 1.0 / i);
        return itog;
    }

    public double uravkv(double a, double b, double c) {
        double D = Math.pow(b, 2) - (4 * a * c);
        double x1 = (-b + Math.sqrt(D)) / (2 * a);
        double x2 = (-b - Math.sqrt(D)) / (2 * a);
        return
    }
}
