public class smartWatch extends smartDevice {

    String esfera;

    public smartWatch() {
    }

    public smartWatch(String marca, String modelo, String color, String sistemaOperativo, String esfera) {
        super(marca, modelo, color, sistemaOperativo);
        this.esfera = esfera;
    }

    public String toString() {
        return "marca=" + marca +
                ", modelo=" + modelo +
                ", color=" + color +
                ", sistemaOperativo=" + sistemaOperativo +
                ", esfera=" + esfera;
    }
}
