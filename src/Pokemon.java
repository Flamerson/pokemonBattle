import javax.swing.JOptionPane;

public class Pokemon {
    String nome;
    int forca;
    int vida;

    void mostrarStatus() {
        JOptionPane.showMessageDialog(null, "Você escolheu o " + nome + " ele tem " + vida + "Hp de vida e " + forca + " de força");
    }

    void inimigoMessage() {
        JOptionPane.showMessageDialog(null, "Seu oponente escolheu o " + nome + " ele tem " + vida + "Hp de vida e " + forca + " de força");
    }

    void vidaStatus() {  
        JOptionPane.showMessageDialog(null,nome + " Está com " + vida + "Hp de vida");   
    }

    void atacar(String inimigo) {
        JOptionPane.showMessageDialog(null,nome + " atacou " + inimigo + " ele tomou "+ forca +" de dano");
    }

    void desviar(String inimigo) {
        JOptionPane.showMessageDialog(null,nome + " desviou de " + inimigo + " ele não tomou dano");
    }

}
