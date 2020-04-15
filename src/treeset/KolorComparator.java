
package treeset;

import java.util.Comparator;

public class KolorComparator implements Comparator<Kolor>
{

    @Override
    public int compare(Kolor o1, Kolor o2) {
        return o1.getValueB()-o2.getValueB();
    }
/*if(o1.getValueG()>o2.getValueG())
         return o1.getValueG();
     
     else if(o1.getValueG()<o2.getValueG())
         return o2.getValueG();
     
     else if(o1.getValueB()>o2.getValueB())
         return o1.getValueB();
     
     else if(o1.getValueB()<o2.getValueB())
         return o2.getValueB();
     
     else return o1.getValueR()-o2.getValueR();    }
  */  
}
