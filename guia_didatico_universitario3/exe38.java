public class exe38 {
    // A unidade de destino está no nome do método; as sobrecargas variam na origem.
    static double paraMetros(double metros) { return metros; }
    static double paraMetros(int quilometros) { return quilometros * 1000.0; }
    static double paraMetros(float milhas) { return milhas * 1609.344; }

    public static void main(String[] args) {
        System.out.println("2 metros = " + paraMetros(2.0) + " m");
        System.out.println("2 km = " + paraMetros(2) + " m");
        System.out.println("2 milhas = " + paraMetros(2.0f) + " m");
    }
}
