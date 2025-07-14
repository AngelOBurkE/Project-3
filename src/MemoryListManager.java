/** 
Name: Angelo Burke 
Date: July 14, 2025
Assignment: 3.2 Project Arrays and Lists
*/
import java.util.ArrayList; 
public class MemoryListManager { 
    private ArrayList<Integer> memoryList = new ArrayList<>(); 
    public void add(int val) { 
        if (memoryList.size() < 10) { 
            memoryList.add(val); 
            System.out.println("Added."); 
        } else { 
            System.out.println("List full (max 10)."); 
        } 
    } 

    public void remove(int val) { 
        boolean removed = memoryList.remove(Integer.valueOf(val)); 
        System.out.println(removed ? "Removed." : "Not found."); 
    } 

    public void display() { 
        System.out.println(memoryList.isEmpty() ? "List is empty." : memoryList); 
    } 

    public void count() { 
        System.out.println("Count: " + memoryList.size()); 
    } 

    public void sumAndAverage() { 
        if (memoryList.isEmpty()) { 
            System.out.println("List is empty."); 
            return; 
        } 
        int total = 0; 
        for (int i : memoryList) total += i; 
        System.out.printf("Sum: %d, Average: %.2f%n", total, (double) total / memoryList.size()); 
    } 

    public void firstLastDifference() { 
        if (memoryList.size() >= 2) { 
            int diff = memoryList.get(memoryList.size() - 1) - memoryList.get(0); 
            System.out.println("Difference (last - first): " + diff); 
        } else { 
            System.out.println("Need at least two values."); 
        } 
    } 
} 

 