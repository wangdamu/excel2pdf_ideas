package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class zuc
  implements zaia
{
  private zbfd b;
  private double c;
  private int d;
  private List e = new ArrayList();
  private List f = new ArrayList();
  private int g;
  private boolean h;
  private boolean i = true;
  private zanr j;
  List a = new ArrayList();
  
  void a(zo paramzo, float paramFloat1, float paramFloat2)
  {
    zue localzue = new zue(paramzo, paramFloat1, paramFloat2);
    this.a.add(localzue);
  }
  
  public zuc(zjf paramzjf, zbfd paramzbfd)
  {
    this.j = new zanr(paramzjf, 18);
    this.b = paramzbfd;
    this.c = 0.0D;
    this.d = 2;
    this.g = 1;
    this.h = true;
  }
  
  zanr a()
  {
    return this.j;
  }
  
  public zaip b()
  {
    return this.j;
  }
  
  public double c()
  {
    return this.c;
  }
  
  public void a(double paramDouble)
  {
    this.c = paramDouble;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public List e()
  {
    return this.e;
  }
  
  public List f()
  {
    return this.f;
  }
  
  public int g()
  {
    return this.g;
  }
  
  public void b(int paramInt)
  {
    this.g = paramInt;
  }
  
  public boolean h()
  {
    return this.h;
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public boolean i()
  {
    return this.i;
  }
  
  public void b(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public void a(ArrayList paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      this.e.add(localObject);
    }
  }
  
  public void b(ArrayList paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      this.f.add(localObject);
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
  
  private double[] b(zkh paramzkh, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    for (int k = 0; k < paramInt; k++)
    {
      zkf localzkf = paramzkh.b(k);
      if ((localzkf != null) && (!localzkf.a())) {
        zf.a(localArrayList, Double.valueOf(localzkf.w()));
      }
    }
    double[] arrayOfDouble = new double[localArrayList.size()];
    for (int m = 0; m < localArrayList.size(); m++) {
      arrayOfDouble[m] = ((Double)localArrayList.get(m)).doubleValue();
    }
    return arrayOfDouble;
  }
  
  double a(zkh paramzkh, int paramInt)
  {
    double[] arrayOfDouble = b(paramzkh, paramInt);
    return zbpi.c(arrayOfDouble, 0, arrayOfDouble.length) / Math.sqrt(arrayOfDouble.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zuc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */