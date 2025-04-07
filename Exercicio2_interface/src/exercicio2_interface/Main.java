
    package exercicio2_interface;


    public class Main {


        public static void main(String[] args) {

            Normal n1 = new Normal("Mario", 65, "49991509935", "masculino", "normal");
            Vip v1 = new Vip (7, "Bartolomeu", 45, "4999112354", "masculino", "Vip");

            n1.imprimir();
            v1.imprimir();
            v1.enviarMsg();

        }

    }
