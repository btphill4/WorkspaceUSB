

public class Exercise {

    public static void main (String [] args) {                                      

             Class3 num3 = new Class3 (3);

             Class2 num2 = new Class2 (4);

             System.out.println (num3);

             System.out.println (num2);
            
             num3 = new Class2 (5);

             System.out.println (num3);                 
    }
}

class Class2 extends Class3 {

    private int val;
   
    Class2 (int num) {

             super(num);

             val = num + 1;

    }

    
    public String toString () {
             return super.toString() + "-" + val;
    }
}

class Class3 {

    private int val;
    

    Class3 (int num) {
             val = num;
    }        

    public String toString () {
             return val + "";
    }
}

