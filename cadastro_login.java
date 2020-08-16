import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class cadastro_login {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        String sobrenome;
        String senha = null;
        String username;
        String login;
        String senhalogin;
        boolean validacao = false;
        boolean validlogin = false;


        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite o Sobrenome: ");
        sobrenome = entrada.nextLine();

        while (validacao == false){

            System.out.println("Digite a senha");
            senha = entrada.nextLine();

            if(senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() > 7) {

                System.out.println("Cadastrado com sucesso!");

                validacao = true;
            }
            else{

                System.out.println("Requer 1 letra maiuscula, 1 numero, e 1 desses caracteres - ! @, e ter mais que 7 caracteres!");
            }
        }
        username = nome.charAt(0) + "_" + sobrenome;
        System.out.println("username: " + username);

        System.out.println("Senha: " + senha);

        while(validlogin == false){

            System.out.println("Insira seu login: ");
            login = entrada.nextLine();

            System.out.println("Insira a senha: ");
            senhalogin = entrada.nextLine();

            if(senhalogin.equals(senha) && username.equals(login)){

                System.out.println("Logado com sucesso!");
                validlogin = true;
            }
            else {

                System.out.println("Usuario e/ou senha incorreta!");
            }


        }











    }










}
