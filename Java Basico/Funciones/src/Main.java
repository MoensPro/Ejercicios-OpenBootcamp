public class Main {

    public static void main(String[] args) {
     //double precio = 10;
     String total = Precio(10);
     System.out.println(total);

    }
static String Precio(double precio){
        double precioIva = precio*1.21;
        return "El precio es: " + precio + ", y el precio con IVA es: " + precioIva;
}

}
