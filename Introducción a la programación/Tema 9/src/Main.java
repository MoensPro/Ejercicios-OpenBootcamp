public class Main {
    public static void main(String[] args) {
        Cliente cliente1=new Cliente();
        cliente1.setNombre("Marco");
        cliente1.setEdad(31);
        cliente1.setTelefono(611519793);
        cliente1.setCredito("Si");

        System.out.println("Nombre del cliente: " + cliente1.getNombre());
        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Telefono: " + cliente1.getTelefono());
        System.out.println("El cliente tiene credito: "+cliente1.getCredito());


        Trabajador trabajador1=new Trabajador();
        trabajador1.setNombre("Marco");
        trabajador1.setEdad(31);
        trabajador1.setTelefono(611519793);
        trabajador1.setSalario(1005);

        System.out.println("Nombre del trabajador: " + trabajador1.getNombre());
        System.out.println("Edad: " + trabajador1.getEdad());
        System.out.println("Telefono: " + trabajador1.getTelefono());
        System.out.println("El trabajador tiene un salario de: "+trabajador1.getSalario() + " euros");

    }
}
class Persona{
   private String nombre;
   private int edad;
   private int telefono;

   public void setNombre(String nombre){
       this.nombre=nombre;
   }
   public String getNombre(){
       return this.nombre;
   }
   public void setEdad(int edad){
       this.edad=edad;
   }
   public int getEdad(){
       return this.edad;
   }
   public void setTelefono(int telefono){
       this.telefono=telefono;
   }
   public int getTelefono(){
       return this.telefono;
   }

}
class Trabajador extends Persona{
    private int salario;

    public void setSalario(int salario){
        this.salario=salario;
    }
    public int getSalario(){
        return this.salario;
    }
}
class Cliente extends Persona{
    private String credito;

    public void setCredito(String credito){
        this.credito=credito;
    }
    public String getCredito(){
        return this.credito;
    }
}