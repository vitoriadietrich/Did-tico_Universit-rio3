public class exe40 {
    static class Animal {
        void falar() { System.out.println("Som de animal"); }
    }
    static class Gato extends Animal {
        @Override
        void falar() { System.out.println("Miau"); }
    }

    public static void main(String[] args) {
        Animal animal = new Gato();
        animal.falar(); // Executa Gato.falar(), mesmo com a referência Animal.
    }
}
