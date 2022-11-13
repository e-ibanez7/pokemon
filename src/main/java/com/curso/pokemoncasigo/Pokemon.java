/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.pokemoncasigo;

/**
 *
 * @author eibaneza
 */
public class Pokemon {
    int id;
    String name;
    String type;
    String secondaryType;
    
    boolean canEvolve;
    int evoStage;
    
    int level;
    int hp;
    int atk;
    int def;
    int spAtk;
    int spDef;
    int spd;
       
    public Pokemon (){
    }
    
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public String getSecondaryType (){
        return this.secondaryType;
    }
    public int getLevel(){
        return this.level;
    }
    public int getHP(){
        return this.hp;
    }
    public int getATK () {
        return this.atk;
    }
    public int getDEF () {
        return this.def;
    }
    public int getSpATK () {
        return this.spAtk;
    }
    public int getSpDEF () {
        return this.spDef;
    }
    public int getSpeed(){
        return this.spd;
    }
    
    
    public void modifyId(int id){
        this.id = id;
    }
    public void modifyName(String name){
        this.name = name;
    }

    public void assignLevel(int level){
        if (level <= 0)
            this.level = 1;
        else if ( level >99)
            this.level = 99;
        else
            this.level = level;
    }
    
    public void levelUp (){
        this.level++;
    }

    public void addHp(int hp){
        this.hp += hp;
    }
    public void addATK (int atk) {
        this.atk += atk;
    }
    public void addDEF (int def) {
        this.def += def;
    }
    public void addSpATK (int spAtk) {
        this.spAtk += spAtk;
    }
    public void addSpDEF (int spDef) {
        this.spDef += spDef;
    }
    public void addSpd (int spd) {
        this.spd += spd;
    }
    
    
    public void assignStats (int hp, int atk, int def, int spatk, int spdef, int spd){
        this.atk = atk;
        this.def = def;
        this.spAtk = spatk;
        this.spDef = spdef;
        this.spd = spd;
    }
    public void evolution (){
    }
    
}
