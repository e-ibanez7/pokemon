/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.pokemoncasigo;

/**
 *
 * @author eibaneza
 */
public class CharmanderLine extends Pokemon {
    
    public CharmanderLine (int level){
        this.assignLevel(level);
        this.type = "Fire";
        this.secondaryType = null;
        
        if (level>=16 && level <36){
            this.id = 005;
            this.name = "Charmeleon";
            this.assignStats(58, 64, 58, 80,65, 80);
        }
        
        if (level>=36){
            this.id = 006;
            this.name = "Charizard";
            this.type = "Fire";
            this.secondaryType = "Flying";
            this.assignStats(78, 84, 78, 109,85, 100);
        }
        
        else {
            this.id = 004;
            this.name = "Charmander";
            this.assignStats(39, 52, 43, 60,50, 65);
        }
    }
    
}
