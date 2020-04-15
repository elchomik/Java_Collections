
package treeset;

import java.util.Comparator;


public class Kolor 
{
    private int valueR;
    private int valueG;
    private int valueB;

    public Kolor(int valueR, int valueG, int valueB)
    {
        this.valueR = valueR;
        this.valueG = valueG;
        this.valueB = valueB;
    }

    public int getValueR()
    {   
        try
        {
            if(valueR>=0 && valueR<=255) return valueR;
        }
        catch(Exception e)
        {
            System.out.println("Color has bad value ");
        }
     return 0;
    }

    public int getValueG()
    {
            
          try
        {
            if(valueG>=0 && valueG<=255) return valueG;
        }
        catch(Exception e)
        {
            System.out.println("Color has bad value ");
        }
     return 0;
    }

    public int getValueB()
    {
        
        
         try
        {
            if(valueB>=0 && valueB<=255) return valueB;
        }
        catch(Exception e)
        {
            System.out.println("Color has bad value ");
        }
     return 0;
    }

   public String toString()
   {
       return "ValueR "+getValueR()+" ValueG "+getValueG()+" ValueB "+ getValueB();
   }

   
    
    
    
}
