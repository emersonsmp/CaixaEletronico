package caixaeletronico;

public class Main {

    public static void main(String[] args) { 
        
        CashMachine Machine = new CashMachine();
        Cash notesWithLimit = new Cash(10,10,10,10);
        System.out.println(Machine.Withdral(notesWithLimit , 90));      
    }   
}
