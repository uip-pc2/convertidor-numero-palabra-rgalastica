package convertidor;



    public class convertir {
        private int flag;
        public int numero;
        public String importe_parcial;
        public String num;
        public String num_letra;
        public String num_letras;
        public String num_letram;
        public String num_letradm;

        public convertir(){
            numero = 0;
            flag=0;
        }
        public convertir(int n){
            numero = n;
            flag=0;
        }
        private String unidad(int numero){
            switch (numero){
                case 9:
                    num = "NUEVE";
                    break;
                case 8:
                    num = "OCHO";
                    break;
                case 7:
                    num = "SIETE";
                    break;
                case 6:
                    num = "SEIS";
                    break;
                case 5:
                    num = "CINCO";
                    break;
                case 4:
                    num = "CUATRO";
                    break;
                case 3:
                    num = "TRES";
                    break;
                case 2:
                    num = "DOS";
                    break;
                case 1:
                    if (flag == 0)
                        num = "UNO";
                    else
                        num = "UN";
                    break;
                case 0:
                    num = "";
                    break;
            }
            return num;
        }

        private String decena(int numero){

            if (numero >= 90 && numero <= 99)
            {
                num_letra = "NOVENTA ";
                if (numero > 90)
                    num_letra = num_letra.concat("y ").concat(unidad(numero - 90));
            }
            else if (numero >= 80 && numero <= 89)
            {
                num_letra = "OCHENTA ";
                if (numero > 80)
                    num_letra = num_letra.concat("y ").concat(unidad(numero - 80));
            }
            else if (numero >= 70 && numero <= 79)
            {
                num_letra = "SETENTA ";
                if (numero > 70)
                    num_letra = num_letra.concat("y ").concat(unidad(numero - 70));
            }
            else if (numero >=60 && numero <= 69)
            {
                num_letra = "SESENTA ";
                if (numero > 60)
                    num_letra = num_letra.concat("y ").concat(unidad(numero - 60));
            }
            else if (numero >= 50 && numero <= 59)
            {
                num_letra = "CINCUENTA ";
                if (numero > 50)
                    num_letra = num_letra.concat("y ").concat(unidad(numero - 50));
            }
            else if (numero >= 40 && numero <= 49)
            {
                num_letra = "CUARENTA ";
                if (numero > 40)
                    num_letra = num_letra.concat("y ").concat(unidad(numero - 40));
            }
            else if (numero >= 30 && numero <= 39)
            {
                num_letra = "TREINTA ";
                if (numero > 30)
                    num_letra = num_letra.concat("y ").concat(unidad(numero - 30));
            }
            else if (numero >= 20 && numero <= 29)
            {
                if (numero == 20)
                    num_letra = "VEINTE ";
                else
                    num_letra = "VEINTI".concat(unidad(numero - 20));
            }
            else if (numero >= 10 && numero <= 19)
            {
                switch (numero){
                    case 10:

                        num_letra = "DIEZ ";
                        break;

                    case 11:

                        num_letra = "ONCE ";
                        break;

                    case 12:

                        num_letra = "DOCE ";
                        break;

                    case 13:

                        num_letra = "TRECE ";
                        break;

                    case 14:

                        num_letra = "CATORCE ";
                        break;

                    case 15:

                        num_letra = "QUINCE ";
                        break;

                    case 16:

                        num_letra = "DIECISEIS ";
                        break;

                    case 17:

                        num_letra = "DIECISIETE ";
                        break;

                    case 18:

                        num_letra = "DIESIOCHO ";
                        break;

                    case 19:

                        num_letra = "DIECINUEVE ";
                        break;

                }
            }
            else
                num_letra = unidad(numero);

            return num_letra;
        }

        private String centena(int numero){
            if (numero >= 100)
            {
                if (numero >= 900 && numero <= 999)
                {
                    num_letra = "NOVESIENTOS ";
                    if (numero > 900)
                        num_letra = num_letra.concat(decena(numero - 900));
                }
                else if (numero >= 800 && numero <= 899)
                {
                    num_letra = "OCHOCIENTOS ";
                    if (numero > 800)
                        num_letra = num_letra.concat(decena(numero - 800));
                }
                else if (numero >= 700 && numero <= 799)
                {
                    num_letra = "SETECIENTOS ";
                    if (numero > 700)
                        num_letra = num_letra.concat(decena(numero - 700));
                }
                else if (numero >= 600 && numero <= 699)
                {
                    num_letra = "SEISIENTO ";
                    if (numero > 600)
                        num_letra = num_letra.concat(decena(numero - 600));
                }
                else if (numero >= 500 && numero <= 599)
                {
                    num_letra = "QUINIENTOS ";
                    if (numero > 500)
                        num_letra = num_letra.concat(decena(numero - 500));
                }
                else if (numero >= 400 && numero <= 499)
                {
                    num_letra = "CUATROCIENTOS ";
                    if (numero > 400)
                        num_letra = num_letra.concat(decena(numero - 400));
                }
                else if (numero >= 300 && numero <= 399)
                {
                    num_letra = "TRECIENTOS ";
                    if (numero > 300)
                        num_letra = num_letra.concat(decena(numero - 300));
                }
                else if (numero >= 200 && numero <= 299)
                {
                    num_letra = "DOSCIENTOS ";
                    if (numero > 200)
                        num_letra = num_letra + (decena(numero - 200));
                }
                else if (numero >= 100 && numero <= 199)
                {
                    if (numero == 100)
                        num_letra = "CIEN ";
                    else
                        num_letra = "CIENTO ".concat(decena(numero - 100));
                }
            }
            else
                num_letra = decena(numero);

            return num_letra;
        }

        private String miles(int numero){
            if (numero >= 1000 && numero <2000){
                num_letram = ("MIL ").concat(centena(numero%1000));
            }
            if (numero >= 2000 && numero <10000){
                flag=1;
                num_letram = unidad(numero/1000).concat(" MIL ").concat(centena(numero%1000));
            }
            if (numero < 1000)
                num_letram = centena(numero);

            return num_letram;
        }

        private String decmiles(int numero){
            if (numero == 9999)
                num_letradm = "NUEVE MIL NOVESIENTO NOVENTA Y NUEVE";
            if (numero >= 9000 && numero <10000){
                flag=1;
                num_letradm = decena(numero/1000).concat("MIL ").concat(centena(numero%1000));
            }
            if (numero < 10000)
                num_letradm = miles(numero);

            return num_letradm;
        }

        public String convertirLetras(int numero){
            num_letras = decmiles(numero);
            return num_letras;
        }
    }



