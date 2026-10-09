public class exe45 {
    interface Desconto { double aplicar(double valor); }
    static class SemDesconto implements Desconto {
        public double aplicar(double v) { return v; }
    }
    static class Desconto10 implements Desconto {
        public double aplicar(double v) { return v * 0.90; }
    }
    static class Desconto20 implements Desconto {
        public double aplicar(double v) { return v * 0.80; }
    }
    static double calcular(double valor, Desconto estrategia) {
        return estrategia.aplicar(valor);
    }
    public static void main(String[] args) {
        System.out.println(calcular(100, new SemDesconto()));
        System.out.println(calcular(100, new Desconto10()));
        System.out.println(calcular(100, new Desconto20()));
    }
}
