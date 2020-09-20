/**
 * Base class of social network.
 */
public abstract class PersonagemTemplate {
    
    PersonagemTemplate() {}      

    // template method
    public void criarPersonagem() {
      corpo();
      bracos();
      pernas();
    }

    protected void corpo() {
      System.out.println("Criação do corpo default");
    }
    
    protected void bracos() {
      System.out.println("Criação dos braços");
    }
    
    protected void pernas() {
      System.out.println("Criação de duas pernas");
    }
}