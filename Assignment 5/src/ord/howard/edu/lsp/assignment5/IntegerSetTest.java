package ord.howard.edu.lsp.assignment5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Program for IntergetSet Assignment
 * @author Esau
 *
 */

public class IntegerSetTest{
  
   /**
 *  creates new array list with type interger to be utilized
 */
private ArrayList<Integer> list= new ArrayList<>();
  
   /**
 * @param list passed in the array list and initializes it 
 */
public IntegerSetTest(ArrayList<Integer> list) {
       this.list=list;
   }
  
  
  

   /**
 * clears the all representation of class
 */
public void clear() {
       list.clear();
   }
  
  
   /**
 * @return returns the length of set
 */
public int length() {
       return list.size();
   }
  
   /**
 * @param b 
 * @return returns true if the 2 lists are equal
 */
public boolean equals(IntegerSet b) {
      
       ArrayList<Integer> list2=b.list;
         
       if(list.size()!=list2.size()) {
           return false;
       }
         
       ArrayList<Integer> temp1=list;
         
       ArrayList<Integer> temp2=list2;
         
       Collections.sort(temp1);
       Collections.sort(temp2);
         
       for(int i=0;i<temp1.size();i++) {
           if(temp1.get(i)!=temp2.get(i)) {
               return false;
           }
       }
         
       return true;
      
   }
  
  
  
   /** returns the largest item and throws exception if the list is empty
 * @return
 * @throws Listemptyexception when the list is empty this is thrown
 */
public int largestelement() throws Listemptyexception {
      
       if(list.size()==0) {
           Listemptyexception e= new Listemptyexception();
           throw e;
       }
      
       int max=0;
      
       for(int i=0;i<list.size();i++) {
           if(list.get(i)>max) {
               max=list.get(i);
           }
       }
      
       return max;
      
   }
  
  
   /**
 * @return returns the smallest element of the list and throws exception if the list is empty
 * @throws Listemptyexception is thrown when list is empty
 */
public int smallestelement() throws Listemptyexception {
      
       if(list.size()==0) {
           Listemptyexception e= new Listemptyexception();
           throw e;
       }
      
       int min=Integer.MAX_VALUE;
      
       for(int i=0;i<list.size();i++) {
           if(list.get(i)<min) {
               min=list.get(i);
           }
       }
      
       return min;
      
   }
  
  
   /**
 * @param item int value that is added to the list if it is not present
 */
public void addItem(int item ) {
      
       boolean exist=false;
      
       for(int i=0;i<list.size();i++) {
          
           if(list.get(i)==item) {
               exist=true;
           }
       }
      
       if(exist==false) {
           list.add(item);
       }
      
   }
  
  
   /**
 * @param item parameter choosen that removes the item from the list if it is found in the list
 */
public void removeItem(int item ) {
      
      
      
       for(int i=0;i<list.size();i++) {
          
           if(list.get(i)==item) {
               list.remove(i);
           }
       }
      
   }
  
   /**
 * @param list2 list that is entered as the parameter for the method and is utilized to check the union of
 * @return returns the union of the two sets
 */
public IntegerSet union(IntegerSet list2) {
      
       ArrayList<Integer> temp=list2.getlist();
      
       Set<Integer> set = new HashSet<>();
       set.addAll(list);
       set.addAll(temp);
      
       ArrayList<Integer> list3= new ArrayList<>(set);
      
       IntegerSet list4= new IntegerSet(list3);
      
       return list4;
      
   }
  
   /**
 * @param list2 list that is utilized as the parameter to check the intersection of 
 * @return returns the intersection of the two sets
 */
public IntegerSet intersection(IntegerSet list2) {
      
       ArrayList<Integer> temp=list2.getlist();
      
       list.retainAll(temp);
      
IntegerSet list4= new IntegerSet(list);
      
       return list4;
   }
  
   /**
 * @param list2  the second set/list
 * @return returns the difference of the two sets
 */
public IntegerSet difference (IntegerSet list2) {
      
       ArrayList<Integer> temp=list2.getlist();
      
       list.removeAll(temp);
      
IntegerSet list4= new IntegerSet(list);
      
       return list4;
      
   }
  
   public ArrayList<Integer> getlist(){
       return list;
   }
  
  
}
