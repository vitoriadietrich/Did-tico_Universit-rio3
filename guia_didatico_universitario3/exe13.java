public class exe13 {

    public static void main(String[] args) {
        converterCelsius(32);
    }

    public static void converterCelsius(double celsius) {
        double conta = (celsius * 1.8) + 32;
        System.out.println(conta + " Fahrenheit");
    }

}