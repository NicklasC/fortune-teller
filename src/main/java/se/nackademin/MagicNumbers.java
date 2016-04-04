package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        int number;
        number=this.numberOfCharacters(name,' ')+1;
        number+=age;
        
        while (number > 9){
            number-=7;
        }
        
        return number;
    }

    public int calculateB() {
        int number;
        number=location.length();
        number+=income;
        
        while (number > 9){
            number-=7;
        }
        return number;
    }

    public int calculateC() {
        int number;
        number=this.calculateA();
        number+=this.calculateB();
        number-=this.height;
        
        while (number < 0){
            number+=10;
        }
        
        return number;
     
    }

    public int calculateD() {
        int number;
        number=this.calculateA();
        
        if(number>5)
            number+=this.calculateB();
        else{
            number+=this.calculateC();
        }
        number-=this.income;
        while(number<0){
            number+=10;
        }
        return number;
    }

    public int calculateE() {
        int number;
        double doubleNumber;
        
        number=(age*income)*income;
        number*=height;
        
        doubleNumber=number;
        doubleNumber=Math.sqrt(number);
        
        
        
        while (doubleNumber > 10){
            doubleNumber/=2;
        }
        
        return Math.round((int)doubleNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public int numberOfCharacters(String stringToSearch, char charToSearchFor){
        int counter = 0;
        for( int i=0; i<stringToSearch.length(); i++ ) {
            if( stringToSearch.charAt(i) == charToSearchFor ) {
                counter++;
            } 
        }
        return counter;
    }

}
