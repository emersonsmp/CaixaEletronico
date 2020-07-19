package caixaeletronico;

public class Cash
{
        private boolean _limit;
        private int _tenNotes;
        private int _twentyNotes;
        private int _fiftyNotes;
        private int _hundredNotes;
               

        public Cash(int tenNotes, int twentyNotes, int fiftyNotes, int hundredNotes)
        {
            _tenNotes = tenNotes;
            _twentyNotes = twentyNotes;
            _fiftyNotes = fiftyNotes;
            _hundredNotes = hundredNotes;
            _limit = true;
        }
        
        public Cash(){
            _limit = false;
        }
        
        
        public boolean getHaveNotesLimit() {
            return this._limit;
        }
        
        public int gettenNotes() {
            return this._tenNotes;
        }
        
        public void settenNotes(int value){
            this._tenNotes = value;
        }

            
        
        public int gettwentyNotes() {
            return this._twentyNotes;
        }
        
        public void settwentyNotes(int value){
            this._twentyNotes = value;
        }
        
        
        
        public int getfiftyNotes() {
            return this._fiftyNotes;
        }
        
        public void setfiftyNotes(int value){
            this._fiftyNotes = value;
        }
        
        
        
        public int gethundredNotes() {
            return this._hundredNotes;
        }
        
        public void sethundredNotes(int value){
            this._hundredNotes = value;
        }           
}

    
