package convertidor;


import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.io.*;

    public class Main {
        public static void main(String Arg[]) throws IOException {
            convertir numero;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int num;
            String res;
            System.out.print(" QUE NUMERO DESEAS CONVERTIR EN LETRA PERO QUE SEA INFERIOR A 10MIL : ");
            num = Integer.parseInt(in.readLine());
            numero = new convertir(num);
            res = numero.convertirLetras(num);
            System.out.print(res);
            System.out.println("\n ");
            if (num >= 10000) {
                System.out.print(" VALLA PROFE USTED DIJO QUE EL NUMERO ERA INFERIOR A 10MIL");
            }
        }

    }