/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countyfood;

/**
 *
 * @author Marina Salazar Project 4 Computer Science 180-01
 */

public class CountyFood {
    //Data fields

    private String name;
    private String state;
    private int population;
    private double moreThan1Mile;
    private double moreThan1MileForLowIncome;
    private long percentLowIncome;

    //Constructors
    CountyFood(){}
    
    CountyFood(String name, String state, int population) {
        this.population = population;
        this.state = state;
        this.name = name;
    }

    //Methods
    public void setGroceriesAvailable(double moreThan1Mile) {

        this.moreThan1Mile = moreThan1Mile;
    }

    public void setGroceriesAvailableForLowIncome(double moreThan1MileLowIncome) {
        this.moreThan1MileForLowIncome = moreThan1MileLowIncome;
    }
   
    public String getName(){
        return name; 
}
    public String getState(){
        return state; 
}
    public int getPopulation(){
        return population; 
}
    public double getMoreThan1Mile(){
        return moreThan1Mile; 

}
    public double getMoreThan1MileForLowIncome(){
        return moreThan1MileForLowIncome; 
}
    public String toString(){
      double percentLowIncome;
      percentLowIncome = ((moreThan1MileForLowIncome / moreThan1Mile) * 100);
      this.percentLowIncome = Math.round(percentLowIncome);
      moreThan1Mile = Math.ceil(moreThan1Mile);
      int moreThan1Mileint = (int) moreThan1Mile;
      return String.format( "%20s", name) + "\t" + String.format("%20s", state) + "\t" + String.format("%20d", moreThan1Mileint) + "\t" + String.format("%20d", this.percentLowIncome )+ "%";

    }
//duble f
    //int d
}
