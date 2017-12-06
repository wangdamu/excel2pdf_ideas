package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class ChartPointCollection
{
  ArrayList a;
  private Series b;
  
  ChartPointCollection(Series parent)
  {
    this.b = parent;
    this.a = new ArrayList();
  }
  
  public Iterator iterator()
  {
    return this.a.iterator();
  }
  
  public void clear()
  {
    this.a.clear();
  }
  
  public void removeAt(int index)
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      ChartPoint localChartPoint = (ChartPoint)this.a.get(i);
      if (localChartPoint.a == index)
      {
        this.a.remove(index);
        return;
      }
    }
  }
  
  public int getCount()
  {
    int i = 0;
    if (this.b.m() != null)
    {
      int j = 0;
      boolean[] arrayOfBoolean = { j };
      ArrayList localArrayList = this.b.m().a(true, this.b.i().e().h(), arrayOfBoolean, false);
      j = arrayOfBoolean[0];
      i += localArrayList.size();
      if (this.b.i().e().getPlotVisibleCells()) {
        for (int k = 0; k < localArrayList.size(); k++)
        {
          zjt localzjt = (zjt)localArrayList.get(k);
          if (!localzjt.d) {
            i--;
          }
        }
      }
      if ((this.b.u() != null) && ((this.b.getType() == 46) || (this.b.getType() == 49))) {
        i++;
      }
    }
    return i;
  }
  
  public ChartPoint get(int index)
  {
    int i = 0;
    boolean[] arrayOfBoolean = { i };
    ChartPoint localChartPoint = a(index, arrayOfBoolean);
    i = arrayOfBoolean[0];
    if ((i != 0) && (this.b.G() != null)) {
      localChartPoint.getShapeProperties().a(this.b.getShapeProperties(), null);
    }
    return localChartPoint;
  }
  
  void a(ChartPoint paramChartPoint)
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      ChartPoint localChartPoint = (ChartPoint)this.a.get(i);
      if (localChartPoint.a > paramChartPoint.a)
      {
        this.a.add(i, paramChartPoint);
        return;
      }
      if (localChartPoint.a == paramChartPoint.a)
      {
        this.a.set(i, paramChartPoint);
        return;
      }
    }
    zf.a(this.a, paramChartPoint);
  }
  
  ChartPoint a(int paramInt)
  {
    int i = 0;
    boolean[] arrayOfBoolean = { i };
    ChartPoint localChartPoint = a(paramInt, arrayOfBoolean);
    i = arrayOfBoolean[0];
    return localChartPoint;
  }
  
  private ChartPoint a(int paramInt, boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = true;
    ChartPoint localChartPoint;
    if (this.a.size() == 0)
    {
      localChartPoint = new ChartPoint(this.b, paramInt);
      zf.a(this.a, localChartPoint);
      return localChartPoint;
    }
    if (this.a.size() > paramInt)
    {
      localChartPoint = (ChartPoint)this.a.get(paramInt);
      if (paramInt == localChartPoint.a)
      {
        paramArrayOfBoolean[0] = false;
        return localChartPoint;
      }
    }
    return a(paramInt, 0, this.a.size() - 1, paramArrayOfBoolean);
  }
  
  private ChartPoint a(int paramInt1, int paramInt2, int paramInt3, boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = true;
    ChartPoint localChartPoint2;
    switch (paramInt3 - paramInt2)
    {
    case 0: 
      ChartPoint localChartPoint1 = (ChartPoint)this.a.get(paramInt2);
      if (paramInt1 > localChartPoint1.a)
      {
        localChartPoint2 = new ChartPoint(this.b, paramInt1);
        if (paramInt3 == this.a.size() - 1) {
          zf.a(this.a, localChartPoint2);
        } else {
          this.a.add(paramInt3 + 1, localChartPoint2);
        }
        return localChartPoint2;
      }
      if (paramInt1 == localChartPoint1.a)
      {
        paramArrayOfBoolean[0] = false;
        return localChartPoint1;
      }
      localChartPoint2 = new ChartPoint(this.b, paramInt1);
      this.a.add(paramInt2, localChartPoint2);
      return localChartPoint2;
    case 1: 
      localChartPoint2 = (ChartPoint)this.a.get(paramInt2);
      ChartPoint localChartPoint3 = (ChartPoint)this.a.get(paramInt3);
      if (paramInt1 > localChartPoint3.a)
      {
        localChartPoint4 = new ChartPoint(this.b, paramInt1);
        if (paramInt3 == this.a.size() - 1) {
          zf.a(this.a, localChartPoint4);
        } else {
          this.a.add(paramInt3 + 1, localChartPoint4);
        }
        return localChartPoint4;
      }
      if (paramInt1 == localChartPoint3.a)
      {
        paramArrayOfBoolean[0] = false;
        return localChartPoint3;
      }
      if ((paramInt1 > localChartPoint2.a) && (paramInt1 < localChartPoint3.a))
      {
        localChartPoint4 = new ChartPoint(this.b, paramInt1);
        this.a.add(paramInt3, localChartPoint4);
        return localChartPoint4;
      }
      if (paramInt1 == localChartPoint2.a)
      {
        paramArrayOfBoolean[0] = false;
        return localChartPoint2;
      }
      localChartPoint4 = new ChartPoint(this.b, paramInt1);
      this.a.add(paramInt2, localChartPoint4);
      return localChartPoint4;
    }
    ChartPoint localChartPoint4 = (ChartPoint)this.a.get(paramInt2);
    ChartPoint localChartPoint5 = (ChartPoint)this.a.get(paramInt3);
    if (paramInt1 > localChartPoint5.a)
    {
      ChartPoint localChartPoint6 = new ChartPoint(this.b, paramInt1);
      if (paramInt3 == this.a.size() - 1) {
        zf.a(this.a, localChartPoint6);
      } else {
        this.a.add(paramInt3 + 1, localChartPoint6);
      }
      return localChartPoint6;
    }
    if (paramInt1 == localChartPoint5.a)
    {
      paramArrayOfBoolean[0] = false;
      return localChartPoint5;
    }
    if ((paramInt1 > localChartPoint4.a) && (paramInt1 < localChartPoint5.a))
    {
      int i = (paramInt3 + paramInt2) / 2;
      ChartPoint localChartPoint8 = (ChartPoint)this.a.get(i);
      ChartPoint localChartPoint9;
      if (paramInt1 > localChartPoint8.a)
      {
        if (paramInt3 - i == 1)
        {
          localChartPoint9 = new ChartPoint(this.b, paramInt1);
          this.a.add(paramInt3, localChartPoint9);
          return localChartPoint9;
        }
        return a(paramInt1, i + 1, paramInt3 - 1, paramArrayOfBoolean);
      }
      if (paramInt1 == localChartPoint8.a)
      {
        paramArrayOfBoolean[0] = false;
        return localChartPoint8;
      }
      if (i - paramInt2 == 1)
      {
        localChartPoint9 = new ChartPoint(this.b, paramInt1);
        this.a.add(i, localChartPoint9);
        return localChartPoint9;
      }
      return a(paramInt1, paramInt2 + 1, i - 1, paramArrayOfBoolean);
    }
    if (paramInt1 == localChartPoint4.a)
    {
      paramArrayOfBoolean[0] = false;
      return localChartPoint4;
    }
    ChartPoint localChartPoint7 = new ChartPoint(this.b, paramInt1);
    this.a.add(paramInt2, localChartPoint7);
    return localChartPoint7;
  }
  
  int a()
  {
    return this.a.size();
  }
  
  ChartPoint b(int paramInt)
  {
    if (this.a.size() == 0) {
      return null;
    }
    if (this.a.size() > paramInt)
    {
      ChartPoint localChartPoint = (ChartPoint)this.a.get(paramInt);
      if (localChartPoint.a == paramInt) {
        return localChartPoint;
      }
    }
    return a(paramInt, 0, this.a.size() - 1);
  }
  
  private ChartPoint a(int paramInt1, int paramInt2, int paramInt3)
  {
    switch (paramInt3 - paramInt2)
    {
    case 0: 
      ChartPoint localChartPoint1 = (ChartPoint)this.a.get(paramInt2);
      if (paramInt1 == localChartPoint1.a) {
        return localChartPoint1;
      }
      return null;
    case 1: 
      ChartPoint localChartPoint2 = (ChartPoint)this.a.get(paramInt2);
      ChartPoint localChartPoint3 = (ChartPoint)this.a.get(paramInt3);
      if (paramInt1 == localChartPoint2.a) {
        return localChartPoint2;
      }
      if (paramInt1 == localChartPoint3.a) {
        return localChartPoint3;
      }
      return null;
    }
    ChartPoint localChartPoint4 = (ChartPoint)this.a.get(paramInt2);
    ChartPoint localChartPoint5 = (ChartPoint)this.a.get(paramInt3);
    if (paramInt1 > localChartPoint5.a) {
      return null;
    }
    if (paramInt1 == localChartPoint5.a) {
      return localChartPoint5;
    }
    if ((paramInt1 > localChartPoint4.a) && (paramInt1 < localChartPoint5.a))
    {
      int i = (paramInt3 + paramInt2) / 2;
      ChartPoint localChartPoint6 = (ChartPoint)this.a.get(i);
      if (paramInt1 > localChartPoint6.a)
      {
        if (paramInt3 - i == 1) {
          return null;
        }
        return a(paramInt1, i + 1, paramInt3 - 1);
      }
      if (paramInt1 == localChartPoint6.a) {
        return localChartPoint6;
      }
      if (i - paramInt2 == 1) {
        return null;
      }
      return a(paramInt1, paramInt2 + 1, i - 1);
    }
    if (paramInt1 == localChartPoint4.a) {
      return localChartPoint4;
    }
    return null;
  }
  
  ChartPoint c(int paramInt)
  {
    return (ChartPoint)this.a.get(paramInt);
  }
  
  void b()
  {
    int i = getCount();
    if (i < this.a.size()) {
      zf.a(this.a, i, this.a.size() - i);
    }
  }
  
  void a(ChartPointCollection paramChartPointCollection, CopyOptions paramCopyOptions)
  {
    for (int i = 0; i < paramChartPointCollection.a(); i++)
    {
      ChartPoint localChartPoint1 = (ChartPoint)paramChartPointCollection.a.get(i);
      ChartPoint localChartPoint2 = new ChartPoint(this.b, localChartPoint1.a);
      zf.a(this.a, localChartPoint2);
      localChartPoint2.a(localChartPoint1, paramCopyOptions);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ChartPointCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */