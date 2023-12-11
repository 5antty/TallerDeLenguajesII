package ejercicio1;

public class test {
    public static void main(String[] args) {
        DiccionarioDeSinonimos dic = new DiccionarioDeSinonimos();
        dic.getSinonimos("Sillon");
        dic.getSinonimos("Casa");
        dic.getSinonimos("Libro");
        dic.getSinonimos("Computador");
        dic.imprimirClaves();
    }
}
