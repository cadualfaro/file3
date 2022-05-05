/*
Atividade 3

Vamos praticar!!
▪ Faça uma função que recebe 2 parâmetros
▪ um path de um arquivo de texto e uma String a ser concatenada no arquivo
▪ A função deve concatenar (adicionar no final do arquivo) a String passada
▪ Dica: você terá que usar FileWriter(filename,true)
 */
package file3;

import java.io.*;
import java.util.Scanner;
        
public class File3 {
    public static void main(String[] args) throws IOException {
        Scanner my_scan = new Scanner(System.in);
            File arquivo = new File("C:\\Users\\Public\\Documents\\file3.txt");
        
        System.out.println("Digite a frase/palavra a ser concatenada ao texto do arquivo: ");
            String word = my_scan.nextLine();
            
            try {
                FileWriter wf = new FileWriter(arquivo,true);
                    PrintWriter wp = new PrintWriter (wf);
                        wp.println("Hoje eu vou "+word);
                            wf.close();
            
            FileReader lerarquivo = new FileReader(arquivo);
                BufferedReader ler = new BufferedReader(lerarquivo);
                    String linha = ler.readLine();
            
            while(linha != null){
                System.out.println(""+linha);
                    linha = ler.readLine();
        }
            lerarquivo.close();
        }
            catch (FileNotFoundException ex) {
                System.out.println("Arquivo Inexistente");
        }
    }
}
