import caixaeletronico.Cash;
import caixaeletronico.CashMachine;
import org.junit.Test;
import static org.junit.Assert.*;

public class CashTest {
      
    public void TestNoMoneyLimit_1000() {
        
        CashMachine Machine = new CashMachine();
        Cash cash = new Cash();       
        assertEquals("10 Nota(s) de 100;\n0 Nota(s) de 50;\n0 Nota(s) de 20;\n0 Nota(s) de 10;", Machine.Withdral(cash, 1000));
    }
    
    @Test
    public void TestNoMoneyLimit_180() {
        
        CashMachine Machine = new CashMachine();
        Cash cash = new Cash();       
        assertEquals("1 Nota(s) de 100;\n1 Nota(s) de 50;\n1 Nota(s) de 20;\n1 Nota(s) de 10;", Machine.Withdral(cash, 180));
    }
    
    @Test
    public void TestNoMoneyLimit_80() {
        
        CashMachine Machine = new CashMachine();
        Cash cash = new Cash();       
        assertEquals("0 Nota(s) de 100;\n1 Nota(s) de 50;\n1 Nota(s) de 20;\n1 Nota(s) de 10;", Machine.Withdral(cash, 80));
    }
    
    @Test
    public void TestNoMoneyLimit_30() {
        
        CashMachine Machine = new CashMachine();
        Cash cash = new Cash();       
        assertEquals("0 Nota(s) de 100;\n0 Nota(s) de 50;\n1 Nota(s) de 20;\n1 Nota(s) de 10;", Machine.Withdral(cash, 30));
    }
    
    @Test
    public void TestNoMoneyLimit_10() {
        
        CashMachine Machine = new CashMachine();
        Cash cash = new Cash();       
        assertEquals("0 Nota(s) de 100;\n0 Nota(s) de 50;\n0 Nota(s) de 20;\n1 Nota(s) de 10;", Machine.Withdral(cash, 10));
    }
    
    
      
    
    @Test
    public void TestWithMoneyLimit_1000() {
        
        CashMachine Machine = new CashMachine();
        Cash cash = new Cash(100,1,1,1);     
        assertEquals("1 Nota(s) de 100;\n1 Nota(s) de 50;\n1 Nota(s) de 20;\n83 Nota(s) de 10;", Machine.Withdral(cash, 1000));
        
        //Machine.insereNotaMaisProxima(1000, cash);
        //assertEquals("1 Nota(s) de 100;\n1 Nota(s) de 50;\n1 Nota(s) de 20;\n83 Nota(s) de 10;", Machine.print());
    }
    
    @Test
    public void TestWithMoneyLimit_500() {
        
        CashMachine Machine = new CashMachine();
        Cash cash = new Cash(100,0,0,0);     
        assertEquals("0 Nota(s) de 100;\n0 Nota(s) de 50;\n0 Nota(s) de 20;\n50 Nota(s) de 10;", Machine.Withdral(cash, 500));
    }
    
    @Test
    public void TestWithMoneyLimit_780() {
        
        CashMachine Machine = new CashMachine();
        Cash cash = new Cash(10,20,1,5);
        System.out.println(Machine.Withdral(cash, 780));
        assertEquals("5 Nota(s) de 100;\n1 Nota(s) de 50;\n11 Nota(s) de 20;\n1 Nota(s) de 10;", Machine.Withdral(cash, 780));
    }
    
    public void TestWithMoneyLimit_30() {
        
        CashMachine Machine = new CashMachine();
        Cash cash = new Cash(100,2,2,2);
        assertEquals("0 Nota(s) de 100;\n0 Nota(s) de 50;\n1 Nota(s) de 20;\n1 Nota(s) de 10;", Machine.Withdral(cash, 30));
    }
    
}
