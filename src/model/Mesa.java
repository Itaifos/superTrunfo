import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Mesa {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream arquivoDeOrigem = new FileInputStream("cartas.txt");
        Scanner lerArquivo = new Scanner(arquivoDeOrigem, "UTF-8");

        List<Carro> carros = new ArrayList<Carro>();

        while (lerArquivo.hasNext()) {

            String linha = lerArquivo.nextLine();
            
            if (linha != null && !linha.isEmpty()){
                
                String[] dados = linha.split("\\;");
                
                Carro carro = new Carro(
                    dados[0], 
                    Boolean.parseBoolean(dados[1]), 
                    dados[2], 
                    dados[3], 
                    dados[4], 
                    Integer.parseInt(dados[5]), 
                    Integer.parseInt(dados[6]), 
                    Integer.parseInt(dados[7]), 
                    Integer.parseInt(dados[8]), 
                    Integer.parseInt(dados[9])
                );
                carros.add(carro);

            }
        }
        lerArquivo.close();
        //Collections.shuffle(carros);
        
    }
}