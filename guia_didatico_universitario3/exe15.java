public class exe15 {

    public static void main(String[] args) {
        calcularIMC(69, 1.71);
    }

    public static void calcularIMC(double peso, double altura) {
        double conta = peso / (altura * 2);
        System.out.println("IMC - " + conta);
        
        if (conta < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (conta > 18.5 && conta < 24.9) {
            System.out.println("Peso normal");
        } else if (conta > 25 && conta < 29.9) {
            System.out.println("Peso normal");
        } else if (conta > 30 && conta < 34.9) {
            System.out.println("Peso normal");
        } else if (conta > 35 && conta < 39.9) {
            System.out.println("Peso normal");
        } else if (conta > 40) {
            System.out.println("Peso normal");
        }
    }


}