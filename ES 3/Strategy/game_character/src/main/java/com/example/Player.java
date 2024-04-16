package com.example;

import com.example.abilities.AbilityStrategy;

public class Player {
    private String name;
    private AbilityStrategy abilityStrategy;

    public Player(String name) {
        this.name = name;
    }

    public void setAbilityStrategy(AbilityStrategy abilityStrategy) {
        this.abilityStrategy = abilityStrategy;
    }

    public void useAbility() {
        if (abilityStrategy != null) {
            abilityStrategy.performAbility();
        } else {
            System.out.println("Nenhuma Habilidade Selecionada.");
        }
    }
}