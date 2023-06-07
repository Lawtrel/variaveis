public class Escopo {
        public static void main(String[] args) {
            System.out.println("Condicionais");
            int id = 18;
            int auth1 = 3;
            boolean auth;

            if (auth1 >= 2) {
                auth = true;
            } else {
                auth = false;
            }
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