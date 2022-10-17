public class Main {
    public static void main(String[] args) {

        int numeroif=1;
        int numeroWhile=1;
        int numeroDowhile=2;
        String estacion="verano";

        //if
        if (numeroif > 0) {
            System.out.println("El número " + numeroif + " es positivo");
        } else if (numeroif < 0) {
            System.out.println("El número " + numeroif + " es negativo");
        } else {
            System.out.println("El númeroif es igual a cero");

        }
        //while
        while(numeroWhile<3){
            System.out.println("Valor numeroWhile: "+numeroWhile);
            numeroWhile=numeroWhile+1;
        }

        //do while
        do{
            System.out.println("Valor numeroDoWhile: "+numeroDowhile);
            numeroDowhile=numeroDowhile+1;
        }while(numeroDowhile<2);

        //for
        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("Valor numeroFor: "+numeroFor);
        }

        //Switch
        switch(estacion){
            case"verano":
                System.out.println("Es verano");
                break;
            case"invierno":
                System.out.println("Es invierno");
                break;
            case"otono":
                System.out.println("Es otono");
                break;
            case"primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("La variable no es una estacion");
        }

    }


}