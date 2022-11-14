public class smartPhone extends smartDevice{
    int camaras;
    int red;

    public smartPhone(){
    }


    public smartPhone(String marca, String modelo, String color, String sistemaOperativo, int camaras, int red) {
        super(marca, modelo, color, sistemaOperativo);
        this.camaras = camaras;
        this.red = red;

    }
    public String toString() {
        return "marca=" + marca +
                ", modelo=" + modelo +
                ", color=" + color +
                ", sistemaOperativo=" + sistemaOperativo +
                ", camaras=" + camaras +
                ", red=" + red;
    }
}
