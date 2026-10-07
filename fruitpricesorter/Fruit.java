/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fruitpricesorter;

/**
 *
 * @author User
 */
public class Fruit {
    String fruitId;
    String name;
    double price;
    
    public Fruit (String fruitId, String name, double price){
        this.fruitId = fruitId;
        this.name = name;
        this.price = price;
        
        
}

    public String getFruitId() {
        return fruitId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setFruitId(String fruitId) {
        this.fruitId = fruitId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   
     public double calculateFruit() {
       return 0.00;
    }
     public void displayFruit() {
         System.out.println("FruitID: " + fruitId);
         System.out.println("Name: " + name);
         System.out.printf("Price: " + price);
         System.out.println();
         
     }
}


