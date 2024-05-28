package Collection.HashMap;

import java.util.*;

//Load factor is a threshold, when we add the elements is HashMap and it crosses this threshold then the capacity hashmap will increase
//inherits AbstractMap
//HashMap implements Map Cloneable serializable
public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer , String> hm = new HashMap();

        hm.put(102, 203);
//        hm.put(10, "deepraj");
        hm.put(11, null);
        hm.put(201, null);
        hm.put(null, null);
        hm.put(null, 202);
//        hm.put(101,101);
//        hm.put("deep", "full");

        //We can retrieve HashMap elements by 2 ways
        //1. Using Set Iterator interface
        //2. Directly i.e without using Set & Iterator interface
        //Note in both cases we use Map.Entry interface


        // in order to print entries
        System.out.println(hm);
         Set s = hm.entrySet();
        System.out.println(s);

        // to print keys
       Set sk = hm.keySet();
        System.out.println(sk);

        // in order to print values
        Collection sv = hm.values();
        System.out.println(sv);

     Set sm = hm.entrySet();

     Iterator it = sm.iterator();

     while (it.hasNext()){
         Map.Entry entry = (Map.Entry) it.next();
         System.out.println(entry.getKey());
     }

     for(Map.Entry mp : hm.entrySet()){
         System.out.println(mp.getKey());
         System.out.println(mp.getValue());
     }
     hm.containsKey(101);
     hm.containsValue("deepraj");
     hm.replace(102 , "deepraj");







//        System.out.println( hm.get(10));
//
//        System.out.println(hm.entrySet());
//
//        Set key= hm.keySet();
//
//        Iterator iterator =key.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


    }
}
