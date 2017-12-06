package com.aspose.cells.a.c;

import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class zv
{
  public static ArrayList a(String[] paramArrayOfString, Object paramObject)
  {
    Object localObject1 = new ArrayList();
    ((ArrayList)localObject1).add(paramObject);
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator1 = ((ArrayList)localObject1).iterator();
      while (localIterator1.hasNext())
      {
        Object localObject2 = localIterator1.next();
        if ((localObject2 instanceof Collection))
        {
          Iterator localIterator2 = ((Collection)localObject2).iterator();
          while (localIterator2.hasNext())
          {
            Object localObject3 = localIterator2.next();
            localArrayList.add(a(paramArrayOfString[i], localObject3));
          }
        }
        else
        {
          localArrayList.add(a(paramArrayOfString[i], localObject2));
        }
      }
      localObject1 = localArrayList;
    }
    return (ArrayList)localObject1;
  }
  
  public static Object a(String paramString, Object paramObject)
  {
    try
    {
      Class localClass = paramObject.getClass();
      String str = "get" + Character.toUpperCase(paramString.charAt(0)) + paramString.substring(1);
      paramObject = localClass.getMethod(str, new Class[0]).invoke(paramObject, new Object[0]);
      if (paramObject == null) {
        return null;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      System.out.println();
    }
    return paramObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */