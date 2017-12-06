package com.aspose.cells.b.a.a;

import com.aspose.cells.CollectionBase;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class zf
{
  public static void a(ArrayList paramArrayList, CollectionBase paramCollectionBase)
  {
    if (paramCollectionBase == null) {
      return;
    }
    try
    {
      int i = paramCollectionBase.getCount();
      for (int j = 0; j < i; j++) {
        paramArrayList.add(paramCollectionBase.get(j));
      }
    }
    catch (Exception localException)
    {
      throw new RuntimeException(localException);
    }
  }
  
  public static void a(ArrayList paramArrayList, Object[] paramArrayOfObject)
  {
    for (int i = paramArrayList.size() - 1; i > -1; i--) {
      paramArrayOfObject[i] = paramArrayList.get(i);
    }
  }
  
  public static void a(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt2 < 0)) {
      throw new IndexOutOfBoundsException(paramInt1 < 0 ? "index" : "count");
    }
    if (paramArrayList.size() - paramInt1 < paramInt2) {
      throw new IllegalArgumentException("Argument_InvalidOffLen");
    }
    if (paramInt2 > 0) {
      for (int i = 0; i < paramInt2; i++) {
        paramArrayList.remove(paramInt1);
      }
    }
  }
  
  public static void b(ArrayList paramArrayList, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      return;
    }
    for (int i = 0; i < paramArrayOfObject.length; i++) {
      paramArrayList.add(paramArrayOfObject[i]);
    }
  }
  
  public static void a(ArrayList paramArrayList, Collection paramCollection)
  {
    paramArrayList.addAll(paramCollection);
  }
  
  public static int a(ArrayList paramArrayList, Object paramObject)
  {
    paramArrayList.add(paramObject);
    return paramArrayList.size() - 1;
  }
  
  public static Object a(ArrayList paramArrayList, Class paramClass)
  {
    if (paramClass == Double.TYPE) {
      paramClass = Double.class;
    } else if (paramClass == Integer.TYPE) {
      paramClass = Integer.class;
    } else if (paramClass == Short.TYPE) {
      paramClass = Short.class;
    } else if (paramClass == Byte.TYPE) {
      paramClass = Byte.class;
    } else if (paramClass == Character.TYPE) {
      paramClass = Character.class;
    } else if (paramClass == Boolean.TYPE) {
      paramClass = Boolean.class;
    }
    Object[] arrayOfObject = (Object[])Array.newInstance(paramClass, paramArrayList.size());
    return paramArrayList.toArray(arrayOfObject);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/a/zf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */