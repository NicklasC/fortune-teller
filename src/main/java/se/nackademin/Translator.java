
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;
import java.util.ArrayList;
/**
 *
 * @author nicklas
 */
public class Translator {
    public ArrayList<String> listOfAdjectives = new ArrayList();
    public ArrayList<String> listOfSubstantives = new ArrayList();
    public ArrayList<String> listOfVerbs = new ArrayList();
    public Translator(){
        initializeAdjectiveValues();
        initializeSubstantiveValues();
        initializeVerbsValues();
    }
    
    public void initializeAdjectiveValues(){
        listOfAdjectives.add("stor");
        listOfAdjectives.add("liten");
        listOfAdjectives.add("stark");
        listOfAdjectives.add("svag");
        listOfAdjectives.add("mjuk");
        listOfAdjectives.add("hård");
        listOfAdjectives.add("snabb");
        listOfAdjectives.add("vacker");
        listOfAdjectives.add("ljus");
        listOfAdjectives.add("mörk");
    }
    public void initializeSubstantiveValues(){
        listOfSubstantives.add("en lönehöjning");
        listOfSubstantives.add("en lönesänkning");
        listOfSubstantives.add("en fotbojja");
        listOfSubstantives.add("en katt");
        listOfSubstantives.add("en hund");
        listOfSubstantives.add("ett hus");
        listOfSubstantives.add("ett barn");
        listOfSubstantives.add("ett elstängsel");
        listOfSubstantives.add("en dator");
        listOfSubstantives.add("ett golv");
    }
    public void initializeVerbsValues(){
        listOfVerbs.add("springa");
        listOfVerbs.add("ljuga");
        listOfVerbs.add("flyga");
        listOfVerbs.add("se");
        listOfVerbs.add("vara");
        listOfVerbs.add("äta");
        listOfVerbs.add("mäta");
        listOfVerbs.add("gå");
        listOfVerbs.add("röra");
        listOfVerbs.add("resa");
    }
    public String fetchAdjective(int number){
        System.out.println("testing number:"+number);
        return listOfAdjectives.get(number);
    }
    public String fetchSubstantive(int number){
        return listOfSubstantives.get(number);
    }
    public String fetchVerb(int number){
        return listOfVerbs.get(number);
    }
}
