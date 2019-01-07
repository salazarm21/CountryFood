package countyfood;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marina
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DriverClassCountyFood {

   public static void main(String[] args) throws FileNotFoundException {
    //Methods
       readFile();
}
private static void readFile() throws FileNotFoundException {
    Scanner s;
    s = new Scanner(new File("food_access"));
    ArrayList<CountyFood> CountyFood = new ArrayList<>();
   
    System.out.println(String.format( "%20s", "County") +"\t"+ String.format( "%20s", "State") +"\t"+ String.format( "%20s", "NumMore1MileAway") +"\t"+ String.format( "%20s", "PercentLowIncome"));
   
    s.nextLine();
    while(s.hasNextLine()){
 
    String newLine = s.nextLine(); 
    String[] Part = newLine.split(","); 
        
    
    CountyFood countyFood = new CountyFood(Part[0], Part[1], Integer.parseInt(Part[4]));
    countyFood.setGroceriesAvailable(Double.parseDouble(Part[3]));
    countyFood.setGroceriesAvailableForLowIncome(Double.parseDouble(Part[2]));
    
    
    CountyFood.add(countyFood);
    }
    
   for (int i = 0; i < CountyFood.size(); i++) {
    System.out.println(CountyFood.get(i));
        }
}

}

