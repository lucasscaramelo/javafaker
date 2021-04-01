package br.com.java.faker;

import com.github.javafaker.Faker;
import org.junit.Test;

public class PalyerTest {
    Faker faker = new Faker();
    Player player1;

    @Test
    public void apresentacaoPlayer() {
        player1 = new Player(
                faker.name().firstName(),
                faker.name().username(),
                faker.number().numberBetween(10, 25));
        player1.apresentacaoPlayer(player1);
    }
}
