package com.aspose.cells.a.e;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class ze
{
  public static Hashtable a()
  {
    return new zc();
  }
  
  public static HashMap b()
  {
    return new zb();
  }
  
  public static void a(Collection paramCollection, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramCollection != null)
    {
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        paramArrayOfObject[paramInt] = localIterator.next();
        paramInt++;
      }
    }
  }
  
  public static void a(Iterable paramIterable, String[] paramArrayOfString, int paramInt)
  {
    if (paramIterable != null)
    {
      Iterator localIterator = paramIterable.iterator();
      while (localIterator.hasNext())
      {
        paramArrayOfString[paramInt] = ((String)localIterator.next());
        paramInt++;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/e/ze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */