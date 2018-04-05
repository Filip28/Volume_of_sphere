public class Kula {
    static long x = 10000000;
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            double x = oblicz(i);
            System.out.println(x);
        }
    }
    private static double oblicz(int n) {
        double sum;
        double promien = 0.5;
        double licznik = 0;
        for (int i = 0; i < x; i++) {
            sum = 0;
            for (int j = 0; j < n; j++)
                sum += Math.pow(Math.random() - promien, 2.0);
            sum = Math.sqrt(sum);
            if (sum <= promien)
                licznik++;
        }
        return licznik / x;
    }
}
