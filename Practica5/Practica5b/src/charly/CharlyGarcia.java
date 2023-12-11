package charly;

public class CharlyGarcia {
    private static CharlyGarcia INSTANCE;

    private CharlyGarcia() {

    };

    public static CharlyGarcia getInstance() {
        if (INSTANCE == null) {
            return new CharlyGarcia();
        }
        return INSTANCE;
    }

    public void cantar() {
        System.out.println("Cantando");
    }
}
