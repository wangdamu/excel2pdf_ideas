package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

class zawv
{
  boolean a;
  boolean b;
  private ArrayList c;
  private ArrayList d = new ArrayList();
  private ArrayList e;
  private ArrayList f;
  private ArrayList g;
  private int h;
  private ArrayList i = null;
  
  zawv(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramBoolean1;
    this.b = paramBoolean2;
    if (!paramBoolean1) {
      this.c = new ArrayList();
    }
  }
  
  void a(Object paramObject, int paramInt)
  {
    this.h += 1;
    if (paramObject == null)
    {
      if (this.a)
      {
        if (this.g == null) {
          this.g = new ArrayList();
        }
        zf.a(this.g, Integer.valueOf(paramInt));
        return;
      }
      paramObject = Double.valueOf(0.0D);
    }
    switch (zaoj.a(paramObject.getClass()))
    {
    case 18: 
      a((String)paramObject, paramInt);
      break;
    case 3: 
      a((Boolean)paramObject, paramInt);
      break;
    case 9: 
      a(((Integer)paramObject).intValue(), paramInt);
      break;
    case 14: 
      a((Double)paramObject, paramInt);
      break;
    case 16: 
      DateTime localDateTime = (DateTime)paramObject;
      a(CellsHelper.getDoubleFromDateTime(localDateTime, false), paramInt);
    }
  }
  
  private void a(double paramDouble, int paramInt)
  {
    zb localzb1 = new zb();
    localzb1.a = paramDouble;
    localzb1.b = paramInt;
    int j = 0;
    for (int k = 0; k < this.d.size(); k++)
    {
      zb localzb2 = (zb)this.d.get(k);
      if (paramDouble < localzb2.a)
      {
        this.d.add(k, localzb1);
        j = 1;
        break;
      }
    }
    if (j == 0) {
      zf.a(this.d, localzb1);
    }
  }
  
  private void a(String paramString, int paramInt)
  {
    if (this.c == null) {
      this.c = new ArrayList();
    }
    zc localzc1 = new zc();
    localzc1.a = paramString;
    localzc1.b = paramInt;
    int j = 0;
    for (int k = 0; k < this.c.size(); k++)
    {
      zc localzc2 = (zc)this.c.get(k);
      if (zw.c(paramString, localzc2.a) == -1)
      {
        this.c.add(k, localzc1);
        j = 1;
        break;
      }
    }
    if (j == 0) {
      zf.a(this.c, localzc1);
    }
  }
  
  int[] a()
  {
    int[] arrayOfInt = new int[this.h];
    int j = 0;
    int k;
    Object localObject;
    if (this.b)
    {
      if (this.d != null) {
        for (k = 0; k < this.d.size(); k++)
        {
          localObject = (zb)this.d.get(k);
          arrayOfInt[(j++)] = ((zb)localObject).b;
        }
      }
      if (this.c != null) {
        for (k = 0; k < this.c.size(); k++)
        {
          localObject = (zc)this.c.get(k);
          arrayOfInt[(j++)] = ((zc)localObject).b;
        }
      }
      if (this.f != null) {
        for (k = 0; k < this.f.size(); k++) {
          arrayOfInt[(j++)] = ((Integer)this.f.get(k)).intValue();
        }
      }
      if (this.e != null) {
        for (k = 0; k < this.e.size(); k++) {
          arrayOfInt[(j++)] = ((Integer)this.e.get(k)).intValue();
        }
      }
      if (this.i != null) {
        for (k = 0; k < this.i.size(); k++)
        {
          localObject = (za)this.i.get(k);
          arrayOfInt[(j++)] = ((za)localObject).a;
        }
      }
      if (this.g != null) {
        for (k = 0; k < this.g.size(); k++) {
          arrayOfInt[(j++)] = ((Integer)this.g.get(k)).intValue();
        }
      }
    }
    else
    {
      if (this.g != null) {
        for (k = 0; k < this.g.size(); k++) {
          arrayOfInt[(j++)] = ((Integer)this.g.get(k)).intValue();
        }
      }
      if (this.i != null) {
        for (k = this.i.size() - 1; k >= 0; k--)
        {
          localObject = (za)this.i.get(k);
          arrayOfInt[(j++)] = ((za)localObject).a;
        }
      }
      if (this.e != null) {
        for (k = 0; k < this.e.size(); k++) {
          arrayOfInt[(j++)] = ((Integer)this.e.get(k)).intValue();
        }
      }
      if (this.f != null) {
        for (k = 0; k < this.f.size(); k++) {
          arrayOfInt[(j++)] = ((Integer)this.f.get(k)).intValue();
        }
      }
      if (this.c != null) {
        for (k = this.c.size() - 1; k >= 0; k--)
        {
          localObject = (zc)this.c.get(k);
          arrayOfInt[(j++)] = ((zc)localObject).b;
        }
      }
      if (this.d != null) {
        for (k = this.d.size() - 1; k >= 0; k--)
        {
          localObject = (zb)this.d.get(k);
          arrayOfInt[(j++)] = ((zb)localObject).b;
        }
      }
    }
    return arrayOfInt;
  }
  
  private final class za
  {
    int a;
  }
  
  private final class zc
  {
    String a;
    int b;
    
    public zc() {}
  }
  
  private final class zb
  {
    double a;
    int b;
    
    public zb() {}
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */