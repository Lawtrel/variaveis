public class Condicional2 {
    public static void main(String[] args) {
        System.out.println("Condicionais");
        int id = 18;
        int auth1 = 3;
        boolean auth = auth1 >= 3;
        if (id >= 18 || auth) {
            System.out.println("Logando....");
            System.out.println("Login Feito com sucesso!");
            System.out.println("Voce tem o codigo de acesso nivel 3, logando... \n" +
                    "!!!Logado com Sucesso!!!!");
        } else {
                System.out.println("Login Invalido!");
            }
    }
}
