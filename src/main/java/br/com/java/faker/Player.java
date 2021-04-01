package br.com.java.faker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Player {
    private String nome;
    private String username;
    private int idade;

    public void apresentacaoPlayer(Player player) {
        if (player != null){
            System.out.println("Player: "+getNome()+ "\nUsername: "+getUsername()+ "\nIdade: "+getIdade()+" anos");
        }else   {
            System.out.println("Player não existe!");
        }
    }

}
