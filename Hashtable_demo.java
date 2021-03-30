import java.util.Hashtable;
import java.util.Enumeration;
public class Hashtable_demo {
   public static void main(String args[]) {
      Hashtable<String, Double> hashtable = new Hashtable<>(); // Create a hash map

      hashtable.put("one", new Double(1));
      hashtable.put("two", new Double(2));
      hashtable.put("three", new Double(3));
      hashtable.put("four", new Double(4));
      hashtable.put("five", new Double(5));
      hashtable.put("six", new Double(6));
      hashtable.put("seven", new Double(7));
      
      Enumeration names;//create an Enumeration object to read elements
      Enumeration elements;//create an Enumeration object to read elements      
      String key; 
      Double values;
      names = hashtable.keys(); 
      elements =  hashtable.elements();

      while(names.hasMoreElements()) { //Enumeration methods
         key = (String) names.nextElement(); //Enumeration names
         values = (Double)elements.nextElement(); //Enumeration elements
         System.out.print(key + ": " + hashtable.get(key));
         System.out.println(values + ": " + hashtable.get(values));
      }            
      
/**
  * five: 5.0 5.0: null
  * six: 6.0 6.0: null
  * two: 2.0 2.0: null
  * one: 1.0 1.0: null
  * seven: 7.0 7.0: null
  * three: 3.0 3.0: null
  * four: 4.0 4.0: null
**/
   }
}