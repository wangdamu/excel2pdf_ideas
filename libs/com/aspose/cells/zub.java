package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class zub
  implements zaia
{
  private zanq b;
  private zbfc c;
  private double d;
  private int e;
  private List f = new ArrayList();
  private List g = new ArrayList();
  private int h;
  private boolean i;
  private boolean j = true;
  List a = new ArrayList();
  
  void a(zo paramzo, float paramFloat1, float paramFloat2)
  {
    zud localzud = new zud(paramzo, paramFloat1, paramFloat2);
    this.a.add(localzud);
  }
  
  public zub(zje paramzje, zbfc paramzbfc)
  {
    this.b = new zanq(paramzje);
    this.c = paramzbfc;
    this.d = 0.0D;
    this.e = 2;
    this.h = 1;
    this.i = true;
  }
  
  zanq a()
  {
    return this.b;
  }
  
  public zaip b()
  {
    return this.b;
  }
  
  public double c()
  {
    return this.d;
  }
  
  public void a(double paramDouble)
  {
    this.d = paramDouble;
  }
  
  public int d()
  {
    return this.e;
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public List e()
  {
    return this.f;
  }
  
  public List f()
  {
    return this.g;
  }
  
  public int g()
  {
    return this.h;
  }
  
  public void b(int paramInt)
  {
    this.h = paramInt;
  }
  
  public boolean h()
  {
    return this.i;
  }
  
  public void a(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public boolean i()
  {
    return this.j;
  }
  
  public void b(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public void a(ArrayList paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      this.f.add(localObject);
    }
  }
  
  public void b(ArrayList paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      this.g.add(localObject);
    }
  }
  
  double a(Object paramObject)
  {
    if (paramObject == null) {
      return 0.0D;
    }
    switch (zaoj.a(paramObject.getClass()))
    {
    case 3: 
    case 9: 
    case 14: 
      return ze.g(paramObject);
    }
    return 0.0D;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */