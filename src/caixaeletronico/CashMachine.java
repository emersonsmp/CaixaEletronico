package caixaeletronico;


public class CashMachine {
    
    private int hundredCedulles;
    private int fiftyCedulles;
    private int twentyCedulles;
    private int tenCedulles;
    
    
    public CashMachine(){}
        
    public String Withdral(Cash notas, int value)
    {       
            
            if(notas.getHaveNotesLimit()){   
                
                CedullesCount(value, notas);
                                             
            }else{
                
                hundredCedulles = value/100;
                fiftyCedulles   = (value%100)/50;
                twentyCedulles  = ((value%100)%50)/20;
                tenCedulles     = (((value%100)%50)%20)/10;                              
            }
                      
            return hundredCedulles+" Nota(s) de 100;"
                    +"\n"+fiftyCedulles+" Nota(s) de 50;"             
                    +"\n"+twentyCedulles+" Nota(s) de 20;"
                    +"\n"+tenCedulles+" Nota(s) de 10;";           
    }
    
    
    public void CedullesCount(int value, Cash notas){
        
        int Remainder = value;
        
        if(notas.getfiftyNotes()> 0){ 
            hundredCedulles = value/100;        
            if(notas.gethundredNotes() >= hundredCedulles)
                Remainder = Remainder%100;
                    
            else{
                hundredCedulles = notas.gethundredNotes();
                Remainder = Remainder - (hundredCedulles * 100);
            }
        }
                
                
                if(notas.getfiftyNotes()> 0){      
                    fiftyCedulles = Remainder/50;
                    if(notas.getfiftyNotes() >= fiftyCedulles)
                        Remainder = Remainder%50;
                    else{
                        fiftyCedulles = notas.getfiftyNotes();
                        Remainder = Remainder - (fiftyCedulles * 50);
                    }
                }
              
                
                if(notas.gettwentyNotes()> 0){                 
                    twentyCedulles = Remainder/20;
                    if(notas.gettwentyNotes() >= twentyCedulles)
                        Remainder = Remainder % 20;
                    else{
                        twentyCedulles = notas.gettwentyNotes();
                        Remainder = Remainder - (twentyCedulles * 20);
                    }
                }               
                
                if(notas.gettenNotes() > 0){
                    tenCedulles = Remainder/10;
                    if(notas.gettenNotes() >= tenCedulles)
                        Remainder = Remainder % 10;
                    else{
                        tenCedulles = notas.gettenNotes();
                        Remainder = Remainder - (tenCedulles * 10);
                    }
                }
    }
}
