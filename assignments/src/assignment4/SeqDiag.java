package assignment4;

public class SeqDiag {

    public static void main (String [] args) {
          func();
   }

   public void  func() {
          ClassA objA = new ClassA();
          ClassA objB = new ClassA();
          int val =  objA.get();
          int val1 = objB.get();
          objA.put(val + 1);
          objB.put(val1 � 1);
   }
}

public class ClassA {

    static private int num = 10;
  
    public int get() {
          return num;
    }

    public void put(int val) {
          num = val;
    }
}
