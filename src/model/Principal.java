import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Principal{
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream arquivoDeOrigem = new FileInputStream("cartas.txt");
        Scanner lerArquivo = new Scanner(arquivoDeOrigem, "UTF-8");

        while (lerArquivo.hasNext()) {

            String linha = lerArquivo.nextLine();
            if (linha != null && linha.isEmpty()) {
                System.out.println(linha);
            }
        }
        
    }

    
}