/** 
Name: Angelo Burke 
Date: July 10, 2025
Assignment: 3.2 Project Arrays and Lists
*/
import java.util.ArrayList; import java.util.Scanner; 
public class MemoryCalculator { public static void main(String[] args) { Scanner input = new Scanner(System.in); Double singleMemory = null; ArrayList<Integer> memoryList = new ArrayList<>(); 
   System.out.println("Angelo Burke - 3.2 Project Arrays and Lists"); 
    System.out.println("Welcome, Use a memory function to store a number or a list of up to 10 integers."); 
    String[] menuItems = { 
        "1. Store value", "2. Retrieve value", "3. Clear value", "4. Replace value", 
        "5. Add to memory list", "6. Remove from list", "7. Show list", "8. Count values", 
        "9. Sum & average", "10. First-last values", "11. Quit" 
    }; 
 
    while (true) { 
        System.out.println("\n=== Menu ==="); 
        for (String item : menuItems) System.out.println(item); 
        System.out.print("Choice: "); 
        String choice = input.nextLine(); 
 
        switch (choice) { 
            case "1": 
                singleMemory = getNumber(input, "Enter value: "); 
                System.out.println("Stored."); 
                break; 
            case "2": 
                System.out.println(singleMemory != null ? "Stored: " + singleMemory : "Memory is empty."); 
                break; 
            case "3": 
                singleMemory = null; 
                System.out.println("Cleared."); 
                break; 
            case "4": 
                singleMemory = getNumber(input, "Enter new value: "); 
                System.out.println("Replaced."); 
                break; 
            case "5": 
                if (memoryList.size() < 10) { 
                    memoryList.add((int) getNumber(input, "Enter integer: ")); 
                    System.out.println("Added."); 
                } else System.out.println("List full (max 10)."); 
                break; 
            case "6": 
                int val = (int) getNumber(input, "Value to remove: "); 
                System.out.println(memoryList.remove(Integer.valueOf(val)) ? "Removed." : "Not found."); 
                break; 
            case "7": 
                System.out.println(memoryList.isEmpty() ? "List is empty." : memoryList); 
                break; 
            case "8": 
                System.out.println("Count: " + memoryList.size()); 
                break; 
            case "9": 
                if (memoryList.isEmpty()) { 
                    System.out.println("List is empty."); 
                } else { 
                    int total = 0; 
                    for (int i : memoryList) total += i; 
                    System.out.printf("Sum: %d, Average: %.2f%n", total, (double) total / memoryList.size()); 
                } 
                break; 
            case "10": 
                if (memoryList.size() >= 2) { 
                    int diff = memoryList.get(memoryList.size() - 1) - memoryList.get(0); 
                    System.out.println("Difference (last - first): " + diff); 
                } else System.out.println("Need at least two values."); 
                break; 
            case "11": 
                System.out.println("Thanks for using the Memory Calculator."); 
                input.close(); 
                return; 
            default: 
                System.out.println("Invalid option."); 
        } 
    } 
} 
 
static double getNumber(Scanner in, String prompt) { 
    while (true) { 
        System.out.print(prompt); 
        try { 
            return Double.parseDouble(in.nextLine()); 
        } catch (Exception e) { 
            System.out.println("Invalid number."); 
        } 
    } 
} 
  

} 

 