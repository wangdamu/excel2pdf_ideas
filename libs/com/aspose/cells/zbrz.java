package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zbrz
  implements zaji
{
  private boolean a;
  private int b;
  private HashMap c = new HashMap();
  private ArrayList d = new ArrayList();
  
  public zbrz(boolean paramBoolean, int paramInt)
  {
    this.a = paramBoolean;
    this.b = paramInt;
  }
  
  public zaie a()
  {
    if (this.c.size() == 0) {
      return zabc.g;
    }
    int i = 0;
    Object localObject2;
    int m;
    if (this.b < 2)
    {
      double d1 = 0.0D;
      localObject1 = this.d.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = ((Iterator)localObject1).next();
        m = ((Integer)this.c.get(localObject2)).intValue();
        if (m > i)
        {
          i = m;
          d1 = ((Double)localObject2).doubleValue();
        }
      }
      if (i < 2) {
        return zabc.g;
      }
      return new zabb(d1);
    }
    double[] arrayOfDouble = new double[this.b];
    int j = 0;
    Object localObject1 = this.d.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      m = ((Integer)this.c.get(localObject2)).intValue();
      if (m > i)
      {
        i = m;
        arrayOfDouble[0] = ((Double)localObject2).doubleValue();
        j = 1;
      }
      else if ((m == i) && (j < this.b))
      {
        arrayOfDouble[j] = ((Double)localObject2).doubleValue();
        j++;
      }
    }
    if (i < 2) {
      return zabc.g;
    }
    if (j > 1)
    {
      localObject1 = new zaie[j][];
      for (int k = 0; k < j; k++) {
        localObject1[k] = { new zabb(arrayOfDouble[k]) };
      }
      return new zaax((zaie[][])localObject1);
    }
    return new zabb(arrayOfDouble[0]);
  }
  
  public boolean a(zaie paramzaie, boolean paramBoolean)
  {
    return (paramBoolean) && (paramzaie.b() == 12);
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean)
  {
    paramzaie = paramzaie.e(paramzaca);
    switch (paramzaie.b())
    {
    case 12: 
      if (paramBoolean) {
        return zaba.b;
      }
      return zabc.f;
    case 3: 
      double d1 = ((zabb)paramzaie).o();
      Object localObject = this.c.get(Double.valueOf(d1));
      if (localObject != null)
      {
        this.c.put(Double.valueOf(d1), Integer.valueOf(((Integer)localObject).intValue() + 1));
      }
      else
      {
        this.c.put(Double.valueOf(d1), Integer.valueOf(1));
        zf.a(this.d, Double.valueOf(d1));
      }
      return null;
    case 0: 
      if (this.a) {
        return zaba.b;
      }
      return paramzaie;
    }
    if (paramBoolean) {
      return zaba.b;
    }
    return zabc.f;
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean, int paramInt)
  {
    paramzaie = paramzaie.e(paramzaca);
    switch (paramzaie.b())
    {
    case 12: 
      if (paramBoolean) {
        return zaba.b;
      }
      return zabc.f;
    case 3: 
      double d1 = ((zabb)paramzaie).o();
      Object localObject = this.c.get(Double.valueOf(d1));
      if (localObject != null)
      {
        this.c.put(Double.valueOf(d1), Integer.valueOf(((Integer)localObject).intValue() + paramInt));
      }
      else
      {
        this.c.put(Double.valueOf(d1), Integer.valueOf(paramInt));
        zf.a(this.d, Double.valueOf(d1));
      }
      return null;
    case 0: 
      if (this.a) {
        return zaba.b;
      }
      return paramzaie;
    }
    if (paramBoolean) {
      return zaba.b;
    }
    return zabc.f;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */