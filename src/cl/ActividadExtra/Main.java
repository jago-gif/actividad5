package cl.ActividadExtra;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sistema para Gestion de Arriendo de Automoviles");

        int opcion;
        Scanner input = new Scanner(System.in);


        ArrayList<Camioneta> camionetaList = new ArrayList<Camioneta>();
        ArrayList<Suv> suvList = new ArrayList<Suv>();
        ArrayList<Sedan> sedanList = new ArrayList<Sedan>();
        ArrayList<Coupe> coupeList = new ArrayList<Coupe>();

        //(String patente, double valor, boolean arrendado, String Color, boolean DobleTraccion
        //camionetas
        camionetaList.add(new Camioneta(1,"XXYY92",70000,false,"Verde",true));
        camionetaList.add(new Camioneta(2,"TTUU15",70000,true,"Roja",true));
        camionetaList.add(new Camioneta(3,"QQWW77",70000,false,"Blanco",false));
        //SUV
        suvList.add(new Suv(4,"WRTA99",50000,false,"Roja",true));
        suvList.add(new Suv(5,"PLSD15",50000,false,"Blanco",true));
        suvList.add(new Suv(6,"YSMJ55",50000,true,"Verde",true));
        suvList.add(new Suv(7,"TSDC70",50000,false,"Blanco",false));
        suvList.add(new Suv(8,"ODHF50",50000,false,"Roja",true));
        suvList.add(new Suv(9,"TWBE41",50000,false,"Blanco",false));
        suvList.add(new Suv(10,"YDFC00",50000,false,"Verde",true));

        //Sedan

        sedanList.add(new Sedan(11,"EWES95",30000,false,"Blanco"));
        sedanList.add(new Sedan(12,"TPSJ66",30000,false,"Roja"));
        sedanList.add(new Sedan(13,"TDFC41",30000,false,"Blanco"));
        sedanList.add(new Sedan(14,"TWBT64",30000,false,"Roja"));

        //coupe
        coupeList.add(new Coupe(15,"POIU65",100000,false,"Blanco"));




        do {
            System.out.println("[1] Arrendar ");
            System.out.println("[2] Devolver.");
            System.out.println("[3] Monto Total");
            String opcionS= input.nextLine();

            try {
                opcion = Integer.parseInt(opcionS);
            } catch (NumberFormatException ex) {
                System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                opcion = 100;
            }
            if (opcion == 1) {
                System.out.println("Escriba el numero del vehiculo que desea arrendar");
                System.out.println("Camioneta");
                for (int i = 0; i<camionetaList.size(); i++){
                    if (!camionetaList.get(i).isArrendado()){

                        System.out.println(camionetaList.get(i).getNumAuto()+"          "+camionetaList.get(i).getPatente());
                    }
                }
                System.out.println("SUV");
                for (int i = 0; i<suvList.size(); i++){
                    if (!suvList.get(i).isArrendado()){
                        System.out.println(suvList.get(i).getNumAuto()+"          "+suvList.get(i).getPatente());
                    }
                }
                System.out.println("SEDAN");
                for (int i = 0; i<sedanList.size(); i++){
                    if (!sedanList.get(i).isArrendado()){
                        System.out.println(sedanList.get(i).getNumAuto()+"          "+sedanList.get(i).getPatente());
                    }
                }
                System.out.println("coupe");
                for (int i = 0; i<coupeList.size(); i++){
                    if (!coupeList.get(i).isArrendado()){
                        System.out.println(coupeList.get(i).getNumAuto()+"          "+coupeList.get(i).getPatente());
                    }
                }
                 opcionS= input.nextLine();

                try {
                    opcion = Integer.parseInt(opcionS);
                } catch (NumberFormatException ex) {
                    System.out.println("Error !"+ ex.getMessage()+" No es un numero");
                    opcion = 100;
                }

                for (int i = 0; i<camionetaList.size(); i++ ){
                    if (!camionetaList.get(i).isArrendado()&&camionetaList.get(i).getNumAuto()==opcion){
                        System.out.println("Acaba de arrendar su camioneta");
                        camionetaList.get(i).setArrendado(true);
                    }
                }
                for (int i = 0; i<suvList.size(); i++ ){
                    if (!suvList.get(i).isArrendado()&&suvList.get(i).getNumAuto()==opcion){
                        System.out.println("Acaba de arrendar su camioneta");
                        suvList.get(i).setArrendado(true);
                    }
                }
                for (int i = 0; i<sedanList.size(); i++ ){
                    if (!sedanList.get(i).isArrendado()&&sedanList.get(i).getNumAuto()==opcion){
                        System.out.println("Acaba de arrendar su camioneta");
                        sedanList.get(i).setArrendado(true);
                    }
                }
                for (int i = 0; i<coupeList.size(); i++ ){
                    if (!coupeList.get(i).isArrendado()&&coupeList.get(i).getNumAuto()==opcion){
                        System.out.println("Acaba de arrendar su camioneta");
                        coupeList.get(i).setArrendado(true);
                    }else {
                        System.out.println("solo puede seleccionar un vehiculo de la lista");
                    }
                }




            } else if (opcion == 2) {
                System.out.println("Opcion 2");
                System.out.println("Escriba el numero del vehiculo que desea arrendar");
                System.out.println("Camioneta");
                for (int i = 0; i<camionetaList.size(); i++){
                    if (camionetaList.get(i).isArrendado()){

                        System.out.println(camionetaList.get(i).getNumAuto()+"          "+camionetaList.get(i).getPatente());
                    }
                }
                System.out.println("SUV");
                for (int i = 0; i<suvList.size(); i++){
                    if (suvList.get(i).isArrendado()){
                        System.out.println(suvList.get(i).getNumAuto()+"          "+suvList.get(i).getPatente());
                    }
                }
                System.out.println("SEDAN");
                for (int i = 0; i<sedanList.size(); i++){
                    if (sedanList.get(i).isArrendado()){
                        System.out.println(sedanList.get(i).getNumAuto()+"          "+sedanList.get(i).getPatente());
                    }
                }
                System.out.println("coupe");
                for (int i = 0; i<coupeList.size(); i++){
                    if (coupeList.get(i).isArrendado()){
                        System.out.println(coupeList.get(i).getNumAuto()+"          "+coupeList.get(i).getPatente());
                    }
                }
                opcion = input.nextInt();
                for (int i = 0; i<camionetaList.size(); i++ ){
                    if (camionetaList.get(i).isArrendado()&&camionetaList.get(i).getNumAuto()==opcion){
                        System.out.println("Acaba de arrendar su camioneta");
                        camionetaList.get(i).setArrendado(false);
                    }
                }
                for (int i = 0; i<suvList.size(); i++ ){
                    if (suvList.get(i).isArrendado()&&suvList.get(i).getNumAuto()==opcion){
                        System.out.println("Acaba de arrendar su camioneta");
                        suvList.get(i).setArrendado(false);
                    }
                }
                for (int i = 0; i<sedanList.size(); i++ ){
                    if (sedanList.get(i).isArrendado()&&sedanList.get(i).getNumAuto()==opcion){
                        System.out.println("Acaba de arrendar su camioneta");
                        sedanList.get(i).setArrendado(false);
                    }
                }
                for (int i = 0; i<coupeList.size(); i++ ){
                    if (coupeList.get(i).isArrendado()&&coupeList.get(i).getNumAuto()==opcion){
                        System.out.println("Acaba de arrendar su camioneta");
                        coupeList.get(i).setArrendado(false);
                    }
                }
            } else if (opcion == 3) {
                int sumar = 0;
                int sumarcamioneta = 0;
                int camioneta = 0;
                int sumarSuv = 0;
                int suv = 0;
                int sumarSedan = 0;
                int sedan = 0;
                int sumarCoupe = 0;
                int coupe = 0;
                System.out.println("Opcion 3");
                System.out.println("Camionetas");
                for (int i = 0; i<camionetaList.size(); i++){
                    if (camionetaList.get(i).isArrendado()){
                            sumarcamioneta += camionetaList.get(i).getValor();
                            camioneta+=1;
                    }
                }
                System.out.println("Cantidad arrendadas "+camioneta+" y se a recaudado "+sumarcamioneta);
                System.out.println("SUV");
                for (int i = 0; i<suvList.size(); i++){
                    if (suvList.get(i).isArrendado()){
                        sumarSuv += suvList.get(i).getValor();
                        suv+=1;
                    }
                }
                System.out.println("Cantidad arrendadas "+suv+" y se a recaudado "+sumarSuv);
                System.out.println("SEDAN");
                for (int i = 0; i<sedanList.size(); i++){
                    if (sedanList.get(i).isArrendado()){
                        sumarSedan += sedanList.get(i).getValor();
                        sedan+=1;
                    }
                }
                System.out.println("Cantidad arrendadas "+sedan+" y se a recaudado "+sumarSedan);
                System.out.println("coupe");
                for (int i = 0; i<coupeList.size(); i++){
                    if (coupeList.get(i).isArrendado()){
                        sumarCoupe += coupeList.get(i).getValor();
                        coupe+=1;
                    }
                }
                System.out.println("Cantidad arrendadas "+coupe+" y se a recaudado "+sumarCoupe);
                sumar = sumarCoupe+sumarcamioneta+sumarSuv+sumarSedan;
                System.out.println("Se a recaudado un total de "+ sumar);

            }
            else if (opcion == 4) {
                System.out.println("Opcion 4");
            } else {
                System.out.println("Opcion Invalida");

            }


        } while (opcion != 0);

    }
}

