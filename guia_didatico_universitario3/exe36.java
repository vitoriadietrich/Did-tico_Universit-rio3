public class exe36 {
    public void publico() { System.out.println("Público"); }
    protected void protegido() { System.out.println("Protegido"); }
    void pacote() { System.out.println("Pacote"); }
    private void privado() { System.out.println("Privado"); }

    public static void main(String[] args) {
        exe36 exemplo = new exe36();
        exemplo.publico();
        exemplo.protegido();
        exemplo.pacote();
        exemplo.privado();
    }
}
// public: qualquer classe; protected: mesmo pacote e subclasses de outros pacotes.
// sem modificador: apenas mesmo pacote; private: apenas a própria classe.
