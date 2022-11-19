import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pokemon pokemon1 = new Pokemon();
        Pokemon pokemon2 = new Pokemon();
        Pokemon pokemon3 = new Pokemon();
        Pokemon inimigo = new Pokemon();

        int opcao;
        int movimento;

        inimigo.nome = "pikachu"; // os pokemons que escolhi
        inimigo.forca = 2;
        inimigo.vida = 7;

        pokemon1.nome = "squirtle";
        pokemon1.forca = 3;
        pokemon1.vida = 7;

        pokemon2.nome = "charmander";
        pokemon2.forca = 3;
        pokemon2.vida = 7;

        pokemon3.nome = "bulbasauro";
        pokemon3.forca = 3;
        pokemon3.vida = 7;

        opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção de pokemon \n 1: squirtle \n 2: charmander \n 3: bulbasauro")); // a forma mais fácil de criar o app, não a mais inteligente kkk...

        switch(opcao) { // rodar ela em loop até acabar, dentro de cada caso.
            case 1:
                pokemon1.mostrarStatus();
                inimigo.inimigoMessage();
                while(pokemon1.vida > 0 || inimigo.vida > 0){
                    movimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ação do pokemon \n 1: atacar \n 2: desviar"));
                    if(movimento == 1) {
                        Random ini = new Random();
                        if(ini.nextInt(2) == 1){
                            pokemon1.atacar(inimigo.nome);
                            inimigo.atacar(pokemon1.nome);
                            inimigo.vida = inimigo.vida - pokemon1.forca;
                            pokemon1.vida = pokemon1.vida - inimigo.forca;
                            if(pokemon1.vida <= 0){
                                JOptionPane.showMessageDialog(null,pokemon1.nome + " Perdeu a batalha fim de jogo.");
                                break;
                            }else if(inimigo.vida <= 0){
                                JOptionPane.showMessageDialog(null,inimigo.nome + " Perdeu a batalha fim de jogo.");
                                break;
                            }else{
                                inimigo.vidaStatus();
                                pokemon1.vidaStatus();
                            }
                            
                        }else{
                            inimigo.desviar(pokemon1.nome);
                        }
                    }else {
                        Random ini = new Random();
                        if(ini.nextInt(2) == 1){
                            inimigo.atacar(pokemon1.nome);
                            pokemon1.desviar(inimigo.nome);
                        }else{
                            JOptionPane.showMessageDialog(null, "Ambos desviaram nessa rodada");
                        }
                    }
                }
                
                break;
            case 2:
                pokemon2.mostrarStatus();
                    inimigo.inimigoMessage();
                    while(pokemon2.vida > 0 || inimigo.vida > 0){
                        movimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ação do pokemon \n 1: atacar \n 2: desviar"));
                        if(movimento == 1) {
                            Random ini = new Random();
                            if(ini.nextInt(2) == 1){
                                pokemon2.atacar(inimigo.nome);
                                inimigo.atacar(pokemon2.nome);
                                inimigo.vida = inimigo.vida - pokemon2.forca;
                                pokemon2.vida = pokemon2.vida - inimigo.forca;
                                if(pokemon2.vida <= 0){
                                    JOptionPane.showMessageDialog(null,pokemon2.nome + " Perdeu a batalha fim de jogo.");
                                    break;
                                }else if(inimigo.vida <= 0){
                                    JOptionPane.showMessageDialog(null,inimigo.nome + " Perdeu a batalha fim de jogo.");
                                    break;
                                }else{
                                    inimigo.vidaStatus();
                                    pokemon2.vidaStatus();
                                }
                                
                            }else{
                                inimigo.desviar(pokemon2.nome);
                            }
                        }else {
                            Random ini = new Random();
                            if(ini.nextInt(2) == 1){
                                inimigo.atacar(pokemon2.nome);
                                pokemon2.desviar(inimigo.nome);
                            }else{
                                JOptionPane.showMessageDialog(null, "Ambos desviaram nessa rodada");
                            }
                        }
                    }
                    
            break;
            case 3:
                pokemon3.mostrarStatus();
                inimigo.inimigoMessage();
                while(pokemon3.vida > 0 || inimigo.vida > 0){
                    movimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ação do pokemon \n 1: atacar \n 2: desviar"));
                    if(movimento == 1) {
                        Random ini = new Random();
                        if(ini.nextInt(2) == 1){
                            pokemon3.atacar(inimigo.nome);
                            inimigo.atacar(pokemon3.nome);
                            inimigo.vida = inimigo.vida - pokemon3.forca;
                            pokemon3.vida = pokemon3.vida - inimigo.forca;
                            if(pokemon3.vida <= 0){
                                JOptionPane.showMessageDialog(null,pokemon3.nome + " Perdeu a batalha fim de jogo.");
                                break;
                            }else if(inimigo.vida <= 0){
                                JOptionPane.showMessageDialog(null,inimigo.nome + " Perdeu a batalha fim de jogo.");
                                break;
                            }else{
                                inimigo.vidaStatus();
                                pokemon3.vidaStatus();
                            }
                            
                        }else{
                            inimigo.desviar(pokemon3.nome);
                        }
                    }else {
                        Random ini = new Random();
                        if(ini.nextInt(2) == 1){
                            inimigo.atacar(pokemon3.nome);
                            pokemon3.desviar(inimigo.nome);
                        }else{
                            JOptionPane.showMessageDialog(null, "Ambos desviaram nessa rodada");
                        }
                    }
                }
                
            break;
            default:
                JOptionPane.showMessageDialog(null, "Você foi expulso do jogo");
            break;
        }

        

    }
}
