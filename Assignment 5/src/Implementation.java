import java.util.*;

public class Implementation {

   public static void main(String[] args) throws Listemptyexception {
      
ArrayList<Integer> list1= new ArrayList<>();
ArrayList<Integer> list2= new ArrayList<>();
  
  
// make 2 instance of integerset class for implementation
IntegerSet set1= new IntegerSet(list1);
IntegerSet set2= new IntegerSet(list2);
  
set1.addItem(1);
set1.addItem(3);
set1.addItem(4);
set1.addItem(6);
set1.addItem(3);
set1.addItem(8);
set1.addItem(7);
  
set2.addItem(1);
set2.addItem(2);
set2.addItem(3);
set2.addItem(4);
set2.addItem(5);
set2.addItem(6);
set2.addItem(7);
  
System.out.println("Set 1: "+set1.getlist());
System.out.println("Set 2: "+set2.getlist());
System.out.println("Are the sets equal (true/false)?: "+set1.equals(set2));
System.out.println("Largest element in Set1: "+set1.largestelement());
System.out.println("Smallest element in Set2: "+set2.smallestelement());  
IntegerSet setx= set1.union(set2);
System.out.println("Union: "+setx.getlist() );
IntegerSet sety= set1.intersection(set2);
System.out.println("Intersection: "+sety.getlist() );
  

      
   }

}
