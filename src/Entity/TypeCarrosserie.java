package Entity;

public class TypeCarrosserie {

    private String couleur;
    private String forme;

    @Override
    public String toString() {
        return "TypeCarrosserie{" +
                "couleur='" + couleur + '\'' +
                ", forme='" + forme + '\'' +
                '}';
    }

    public TypeCarrosserie(String couleur, String forme) {
        this.couleur = couleur;
        this.forme = forme;
    }
}
