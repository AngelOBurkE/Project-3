/** 
Name: Angelo Burke 
Date: July 14, 2025
Assignment: 3.2 Project Arrays and Lists
*/
public class singleMemory { 
    private Double value = null; 
    public void store(double val) { 
        value = val; 
        System.out.println("Value stored."); 
    } 

    public void retrieve() { 
        System.out.println(value != null ? "Stored value: " + value : "Memory is empty."); 
    } 

    public void clear() { 
        value = null; 
        System.out.println("Memory cleared."); 
    } 

    public void replace(double val) { 
        value = val; 
        System.out.println("Value replaced."); 
    } 
} 