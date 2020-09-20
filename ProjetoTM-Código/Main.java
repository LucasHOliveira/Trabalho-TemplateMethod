import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("=========Elfo=========");
    PersonagemTemplate p1 = new Elfo();
    p1.criarPersonagem();
    
    System.out.println("======Humano=======");
    PersonagemTemplate p2 = new Humano();
    p2.criarPersonagem();

    System.out.println("======Orc=======");
    PersonagemTemplate p3 = new Orc();
    p3.criarPersonagem();
  }
}