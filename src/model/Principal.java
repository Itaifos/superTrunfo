import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//import javax.swing.JOptionPane;



public class Principal{
    public static void main(String[] args) {
        
        Path arquivoDeOrigem = Paths.get("cartas.txt");
        try {
            byte[] texto = Files.readAllBytes(arquivoDeOrigem);
            String leitura = new String(texto);
    
            //JOptionPane.showMessageDialog(null, leitura);
        } catch (Exception erro) {
            
        } 

        

        
    }

    
}