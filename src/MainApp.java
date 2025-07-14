/** 
Name: Angelo Burke 
Date: July 14, 2025
Assignment: 3.2 Project Arrays and Lists
*/
import java.util.Scanner; 
public class MainApp { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        singleMemory single = new singleMemory(); 
        MemoryListManager list = new MemoryListManager(); 
        System.out.println("Angelo Burke - 3.2 Project Arrays and Lists"); 
        System.out.println("Welcome, use memory functions to store a number or up to 10 integers."); 

        String[] menuItems = { 
            "1. Store single value", "2. Retrieve value", "3. Clear value", "4. Replace value", 
            "5. Add to list", "6. Remove from list", "7. Show list", "8. Count values", 
            "9. Sum & average", "10. First-last difference", "11. Quit" 
        }; 

        while (true) { 
            System.out.println("\n=== Menu ==="); 
            for (String item : menuItems) System.out.println(item); 
            System.out.print("Choice: "); 
            String choice = input.nextLine(); 

            switch (choice) { 
                case "1":
                 single.store(getNumber(input, "Enter value: ")); 
                 break;
                case "2": single.retrieve(); 
                 break;
                case "3": single.clear(); 
                 break;
                case "4": single.replace(getNumber(input, "Enter new value: ")); 
                 break;
                case "5": list.add((int) getNumber(input, "Enter integer: ")); 
                 break;
                case "6": list.remove((int) getNumber(input, "Enter value to remove: ")); 
                 break;
                case "7": list.display(); 
                 break;
                case "8": list.count();
                 break; 
                case "9": list.sumAndAverage(); 
                 break;
                case "10": list.firstLastDifference(); 
                 break;
                case "11": { 
                    System.out.println("Thanks for using the Memory Calculator"); 
                    input.close(); 
                    return; 
                } 
                default: System.out.println("Invalid choice."); 
                 break;
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

 