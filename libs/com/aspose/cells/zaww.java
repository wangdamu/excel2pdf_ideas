package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;

class zaww
{
  boolean a;
  private ArrayList c;
  int b;
  
  zaww(boolean paramBoolean, int paramInt)
  {
    this.a = paramBoolean;
    this.c = new ArrayList();
    this.b = paramInt;
  }
  
  void a(Object paramObject, int paramInt)
  {
    if (paramObject == null)
    {
      a(0.0D, paramInt);
    }
    else
    {
      double d;
      if ((paramObject instanceof Double))
      {
        d = ((Double)paramObject).doubleValue();
        a(d, paramInt);
      }
      else if ((paramObject instanceof Integer))
      {
        d = ((Integer)paramObject).intValue();
        a(d, paramInt);
      }
      else if ((paramObject instanceof zuf))
      {
        a((zuf)paramObject, paramInt);
      }
      else if (((paramObject instanceof String)) && (((String)paramObject).length() == 0))
      {
        a(0.0D, paramInt);
      }
    }
  }
  
  private void a(double paramDouble, int paramInt)
  {
    int i = 0;
    for (int j = 0; j < this.c.size(); j++)
    {
      za localza2 = (za)this.c.get(j);
      if ((localza2.a instanceof zuf))
      {
        za localza3 = new za(null);
        localza3.a = Double.valueOf(paramDouble);
        zf.a(localza3.b, Integer.valueOf(paramInt));
        this.c.add(j, localza3);
        i = 1;
        break;
      }
      double d = ((Double)localza2.a).doubleValue();
      if (d == paramDouble)
      {
        zf.a(localza2.b, Integer.valueOf(paramInt));
        i = 1;
        break;
      }
      if (paramDouble < d)
      {
        za localza4 = new za(null);
        localza4.a = Double.valueOf(paramDouble);
        zf.a(localza4.b, Integer.valueOf(paramInt));
        this.c.add(j, localza4);
        i = 1;
        break;
      }
    }
    if (i == 0)
    {
      za localza1 = new za(null);
      localza1.a = Double.valueOf(paramDouble);
      zf.a(localza1.b, Integer.valueOf(paramInt));
      zf.a(this.c, localza1);
    }
    if (this.c.size() > this.b) {
      if (this.a) {
        this.c.remove(0);
      } else {
        this.c.remove(this.c.size() - 1);
      }
    }
  }
  
  private void a(zuf paramzuf, int paramInt)
  {
    int i = 0;
    int j = zamm.a(paramzuf);
    for (int k = 0; k < this.c.size(); k++)
    {
      za localza2 = (za)this.c.get(k);
      if ((localza2.a instanceof zuf))
      {
        int m = zamm.a((zuf)localza2.a);
        if (j == m)
        {
          zf.a(localza2.b, Integer.valueOf(paramInt));
          i = 1;
          break;
        }
        if (j < m)
        {
          za localza3 = new za(null);
          localza3.a = paramzuf;
          zf.a(localza3.b, Integer.valueOf(paramInt));
          this.c.add(k, localza3);
          i = 1;
          break;
        }
      }
    }
    if (i == 0)
    {
      za localza1 = new za(null);
      localza1.a = paramzuf;
      zf.a(localza1.b, Integer.valueOf(paramInt));
      zf.a(this.c, localza1);
    }
    if (this.c.size() > this.b) {
      if (this.a) {
        this.c.remove(0);
      } else {
        this.c.remove(this.c.size() - 1);
      }
    }
  }
  
  HashMap a()
  {
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < this.c.size(); i++)
    {
      za localza = (za)this.c.get(i);
      for (int j = 0; j < localza.b.size(); j++) {
        localHashMap.put(localza.b.get(j), Boolean.valueOf(true));
      }
    }
    return localHashMap;
  }
  
  private class za
  {
    Object a;
    ArrayList b = new ArrayList();
    
    private za() {}
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaww.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */