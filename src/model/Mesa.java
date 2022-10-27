import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Mesa {
    public static void main(String[] args) throws FileNotFoundException {


        //CRIAR BARALHO
        FileInputStream arquivoDeOrigem = new FileInputStream("cartas.txt");
        Scanner lerArquivo = new Scanner(arquivoDeOrigem, "UTF-8");

        List<CartaDeCarro> baralho = new ArrayList<CartaDeCarro>();

        while (lerArquivo.hasNext()) {

            String linha = lerArquivo.nextLine();
            
            if (linha != null && !linha.isEmpty()){
                
                String[] dados = linha.split("\\;");
                
                CartaDeCarro carro = new CartaDeCarro(
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
                baralho.add(carro);
            }
        }
        lerArquivo.close();
        

        //EMBARALHAR E DIVIDIR O BARALHO
        Collections.shuffle(baralho);
        int tamanho = baralho.size();

        List<CartaDeCarro> maoA =  new ArrayList<>(baralho.subList(0, (tamanho+1)/2));
        List<CartaDeCarro> maoB =  new ArrayList<>(baralho.subList((tamanho+1)/2, tamanho));
        


        //MENU DE APRESENTAÇÃO
        System.out.println("\n");
        System.out.print("Qual é o nome do jogador? ");
        Scanner lerNome = new Scanner(System.in);
        String nome = lerNome.nextLine();
        lerNome.close();

        Jogador jogadorA = new Jogador(nome, maoA);
        Jogador jogadorB = new Jogador(maoB);

        System.out.println(" ");
        System.out.println("Bem-vindo ao super trundo, " + jogadorA.getNome());
        System.out.println(" ");
        System.out.println("Este jogo está no modo jogador vs computador");
        System.out.println("Escolha um atributo sempre da sua primeira carta para comparar com o oponenete!");

        //LOAD
        System.out.println("\n");
        System.out.println("Caregando");
        System.out.print( "\u001B[42m" + ". ");
        try { 
            Thread.sleep (2000);
        }catch (InterruptedException ex){
        }
        System.out.print(". ");
        try { 
            Thread.sleep (2000);
        }catch (InterruptedException ex){
        }
        System.out.print(". ");
        try { 
            Thread.sleep (2000);
        }catch (InterruptedException ex){
        }
        System.out.print(". ");
        try { 
            Thread.sleep (2000);
        }catch (InterruptedException ex){
        }
        System.out.println("." + "\u001B[0m");
        System.out.println("\n");

        System.out.println(jogadorA.getNome() + ", estas são suas cartas\n");
        for(CartaDeCarro c : jogadorA.getMao()){
            System.out.println(c);
        }

        System.out.println("########################");
        System.out.println("\u001B[47m" + "Sua pontuação atual é: " + jogadorA.getPontos() + "\u001B[0m");
        System.out.println("########################");
        System.out.println("\n");

        //LOAD
        System.out.println("\n");
        System.out.println("Caregando");
        System.out.print( "\u001B[42m" + ". ");
        try { 
            Thread.sleep (2000);
        }catch (InterruptedException ex){
        }
        System.out.print(". ");
        try { 
            Thread.sleep (2000);
        }catch (InterruptedException ex){
        }
        System.out.print(". ");
        try { 
            Thread.sleep (2000);
        }catch (InterruptedException ex){
        }
        System.out.print(". ");
        try { 
            Thread.sleep (2000);
        }catch (InterruptedException ex){
        }
        System.out.println("." + "\u001B[0m");
        System.out.println("\n");

        //TURNO//

        //MENU DE TURNO
        System.out.println(jogadorA.getMao().get(0));
        System.out.println("\n");
        System.out.println(jogadorA.getNome() + ", ESCOLHA QUAL ATRIBUTO VOCÊ IRÁ COMPARAR!");
        System.out.println("1. Velocidade");
        System.out.println("2. Hp");
        System.out.println("3. Aceleração");
        System.out.println("4. Cilindrada");
        System.out.println("5. Kg");
        System.out.println("\n");

        System.out.print("Digite aqui sua opção: ");
        Scanner lerOpcao = new Scanner(System.in);
        int opcao = lerOpcao.nextInt();
        System.out.println(opcao);
        lerOpcao.close();
        

        do{
        
            
            switch(opcao){
            case 1:
                if(jogadorA.getMao().get(0).getVelocidade() > jogadorB.getMao().get(0).getVelocidade()){
                    jogadorA.setPontos(1);
                }else{
                    jogadorB.setPontos(1);
                }
                break;
                
            case 2:
                if(jogadorA.getMao().get(0).getHp() > jogadorB.getMao().get(0).getHp()){
                    jogadorA.setPontos(1);
                }else{
                    jogadorB.setPontos(1);
                }
                break;
                
            case 3:
                if(jogadorA.getMao().get(0).getAceleracao() > jogadorB.getMao().get(0).getAceleracao()){
                    jogadorA.setPontos(1);
                }else{
                    jogadorB.setPontos(1);
                }
                break;
                
            case 4:
                if(jogadorA.getMao().get(0).getCilindrada() > jogadorB.getMao().get(0).getVelocidade()){
                    jogadorA.setPontos(1);
                }else{
                    jogadorB.setPontos(1);
                }
                break;
            
            case 5:
                if(jogadorA.getMao().get(0).getKg() > jogadorB.getMao().get(0).getVelocidade()){
                    jogadorA.setPontos(1);
                }else{
                    jogadorB.setPontos(1);
                }
                break;
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
        lerOpcao.close();
        

    }
}