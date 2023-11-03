package demoblaze.training;

import org.openqa.selenium.WebDriver;

import java.util.Random;

public class Helper {
    WebDriver driver;

    public Helper(WebDriver driver){
        this.driver=driver;
    }

    public String generateRandomString(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder cadenaAleatoria = new StringBuilder();

        Random rand = new Random();
        for (int i = 0; i < 7; i++) {
            int indice = rand.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            cadenaAleatoria.append(caracterAleatorio);
        }

        return cadenaAleatoria.toString();
    }
}
