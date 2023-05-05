public class Gorilla extends Mammal {


    //	CONSTRUCTORES
        public Gorilla() {
            super();
        }
    
        public Gorilla(int energia) {
            super(energia);
            
        }
    
        public void throwSomething() {
            System.out.println(" Gorilla lanzo barril ");
    //		super.displayEnergy();		
            super.setEnergyLevel(getEnergyLevel() - 5);
        }
    
        public void eatBananas() {
            super.setEnergyLevel(getEnergyLevel() + 10);
            super.displayEnergy();
        }
    
        public void climb() {
            super.setEnergyLevel(getEnergyLevel() - 10);
            super.displayEnergy();
        }
    
        public int displayEnergyGorilla() {
            System.out.println("Su nivel de energia es: " + getEnergyLevel());
            return getEnergyLevel();
        }
    
        @Override
        public int displayEnergy() {
    //		super.displayEnergy();
            System.out.println(" Hola");
            return getEnergyLevel();
        }
    
    }