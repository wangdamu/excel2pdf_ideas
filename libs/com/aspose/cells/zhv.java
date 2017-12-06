package com.aspose.cells;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

class zhv
  implements ICellsDataTable
{
  String[] a;
  Collection b;
  private HashMap c;
  private Iterator d;
  private Object e;
  private Method[] f;
  
  zhv(Collection paramCollection, Method[] paramArrayOfMethod)
  {
    this.b = paramCollection;
    Method[] arrayOfMethod = new Method[paramArrayOfMethod.length];
    int i = 0;
    for (int j = 0; j < paramArrayOfMethod.length; j++)
    {
      Method localMethod = paramArrayOfMethod[j];
      if ((Modifier.isPublic(localMethod.getModifiers())) && (localMethod.getName().startsWith("get")) && (localMethod.getParameterTypes().length < 1) && (localMethod.getReturnType() != Void.TYPE) && (!localMethod.getName().equals("getClass")))
      {
        arrayOfMethod[i] = paramArrayOfMethod[j];
        i++;
      }
    }
    this.f = new Method[i];
    System.arraycopy(arrayOfMethod, 0, this.f, 0, i);
    arrayOfMethod = null;
    this.a = new String[i];
    this.c = new HashMap(i);
    for (j = 0; j < this.f.length; j++)
    {
      this.a[j] = this.f[j].getName().substring(3);
      this.c.put(this.a[j], this.f[j]);
    }
    beforeFirst();
  }
  
  public String[] getColumns()
  {
    return this.a;
  }
  
  public int getCount()
  {
    return this.b.size();
  }
  
  public void beforeFirst()
  {
    this.e = null;
    this.d = this.b.iterator();
  }
  
  public Object get(int index)
  {
    try
    {
      return this.f[index].invoke(this.e, (Object[])null);
    }
    catch (Exception localException) {}
    return null;
  }
  
  public Object get(String columnName)
  {
    try
    {
      return ((Method)this.c.get(columnName)).invoke(this.e, (Object[])null);
    }
    catch (Exception localException) {}
    return null;
  }
  
  public boolean next()
  {
    if (this.d == null) {
      return false;
    }
    if (this.d.hasNext())
    {
      this.e = this.d.next();
      return true;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */