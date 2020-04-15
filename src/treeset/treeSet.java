
package treeset;

import java.util.Set;
import java.util.*;

public class treeSet {

  
    public static void main(String[] args) {
       
        KolorComparator comparator= new KolorComparator();
        Set<Kolor> colors=new TreeSet<>(comparator);
      
       colors.add(new Kolor(323,442,43));
       colors.add(new Kolor(255, 32, 43));
       colors.add(new Kolor(32,42,55));
       colors.add(new Kolor(234,23,54));
       colors.add(new Kolor(2245,2323, 42));
       
        System.out.println("Color elements");
        for(Kolor color:colors)
        {
            System.out.println(color.toString());
        }
        
        Iterator<Kolor> it=colors.iterator();
        
        System.out.println("\nThe size of the list before remove elements\n");
        System.out.println(colors.size());
        
        while(it.hasNext())
        {
        
            Kolor color=it.next();
            
            if(color.getValueB()>200) 
                it.remove();
            
         else   if(color.getValueG()>30 && color.getValueG()<150)
                it.remove();
       
        }
        
        System.out.println("\nThe size of list after remove objects");
        System.out.println(colors.size());
        
        System.out.println("\nElements after remove objects\n");
        
       for(Kolor color: colors)
       {
           System.out.println(color.toString());
       }
       
       Random r=new Random();
       int a,a1,a2;
       
       for(int index=0;index<colors.size()-1;index++)
       {
       
        a=r.nextInt(256);
        a1=r.nextInt(256);
        a2=r.nextInt(256);
        colors.add(new Kolor(a,a1,a2));
       }
       
        System.out.println("\nSize of the new list");
        System.out.println(colors.size());
        
        System.out.println("The new TreeList sorted by ColorB \n");
        
            for(Kolor color: colors)
            {
                System.out.println(color.toString());
            }
       
       
       
    }
    
}
