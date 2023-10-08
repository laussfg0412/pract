package Pract;

import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        float hs;

        HaM hobj = new HaM();
        System.out.println("Ingrese las horas: ");
        hs = Float.parseFloat(br.readLine());
        hobj.AsignarDatos(hs);
        System.out.println("Lass horas ingresadas fueron: " + hobj.DevolverHoras());
        System.out.println("Las horas en minutos son: " + hobj.CalcularMinutos());
    }
}