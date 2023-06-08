public class While {
    public static void main(String[] args) {
        int contador = 2;
        int total = 2;
        while(contador <=10) {
            System.out.println(contador);
            total += contador;
            contador++;
        }
        System.out.println(total);
    }
}
