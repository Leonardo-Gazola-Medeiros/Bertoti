package com.example;

import com.example.abilities.Fireball;
import com.example.abilities.IceSpear;
import com.example.abilities.LightningBolt;

public class App 
{
    public static void main( String[] args )
    {
        // Criar o Personagem
        Player player = new Player("Hero");

        // Habilidades
        player.setAbilityStrategy(new Fireball());
        player.useAbility();

        player.setAbilityStrategy(new IceSpear());
        player.useAbility();

        player.setAbilityStrategy(new LightningBolt());
        player.useAbility();
    }
}
