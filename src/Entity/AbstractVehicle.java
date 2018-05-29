package Entity;

abstract public class AbstractVehicle {
    protected Integer roues;
    protected TypeRoue typeRoue;
    protected String cylindre;
    protected TypeCarrosserie carrosserie;
    protected Integer reservoir;

    public Integer getRoues() {
        return roues;
    }

    public void setRoues(Integer roues) {
        this.roues = roues;
    }

    public TypeRoue getTypeRoue() {
        return typeRoue;
    }

    public void setTypeRoue(TypeRoue typeRoue) {
        this.typeRoue = typeRoue;
    }

    public String getCylindre() {
        return cylindre;
    }

    public void setCylindre(String cylindre) {
        this.cylindre = cylindre;
    }

    public TypeCarrosserie getCarrosserie() {
        return carrosserie;
    }

    public void setCarrosserie(TypeCarrosserie carrosserie) {
        this.carrosserie = carrosserie;
    }

    public Integer getReservoir() {
        return reservoir;
    }

    public void setReservoir(Integer reservoir) {
        this.reservoir = reservoir;
    }
}
