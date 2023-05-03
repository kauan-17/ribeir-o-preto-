public class Sequencias {

    public static void main(String[] args) {
        // Sequência a)
        int a = 7;
        int prox_a = a + 2;
        System.out.println(prox_a); // imprime 9

        // Sequência b)
        int b = 64;
        int prox_b = b * 2;
        System.out.println(prox_b); // imprime 128

        // Sequência c)
        int c = 36;
        int prox_c = (int) Math.pow(Math.sqrt(c) + 1, 2);
        System.out.println(prox_c); // imprime 49

        // Sequência d)
        int d = 64;
        int prox_d = d + 12;
        System.out.println(prox_d); // imprime 100

        // Sequência e)
        int e1 = 8;
        int e2 = 5;
        int prox_e = e1 + e2;
        System.out.println(prox_e); // imprime 13
    }
}