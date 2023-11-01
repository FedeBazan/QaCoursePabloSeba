package parabank.parasoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.Random;

public class Helper {
    private WebDriver driver;
    private final int LONGREGISTERARRAY=10;
    public Helper (WebDriver driver){
        this.driver=driver;
    }


    public String[] createRegisterForm(){
        String[] register = new String[LONGREGISTERARRAY];
        for (int i=0;i<LONGREGISTERARRAY;i++){
            register[i]=generateRandomString();
        }
        return register;
    }

    public String generateRandomString(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder cadenaAleatoria = new StringBuilder();

        Random rand = new Random();
        for (int i = 0; i < LONGREGISTERARRAY; i++) {
            int indice = rand.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            cadenaAleatoria.append(caracterAleatorio);
        }

        return cadenaAleatoria.toString();
    }
}
