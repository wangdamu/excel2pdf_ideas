package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

class zkb
  extends CollectionBase
{
  private Chart a;
  
  zkb(Chart paramChart)
  {
    this.a = paramChart;
  }
  
  Chart a()
  {
    return this.a;
  }
  
  public zka a(int paramInt)
  {
    return (zka)this.InnerList.get(paramInt);
  }
  
  zka b(int paramInt)
  {
    if (paramInt >= getCount()) {
      for (int i = getCount(); i <= paramInt; i++)
      {
        zka localzka = new zka(this);
        zf.a(this.InnerList, localzka);
      }
    }
    return a(paramInt);
  }
  
  int a(zka paramzka)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      zka localzka = (zka)this.InnerList.get(i);
      if (paramzka.X() < localzka.X())
      {
        this.InnerList.add(i, paramzka);
        return i;
      }
      if ((paramzka.X() == localzka.X()) && (!paramzka.m()) && (localzka.m()))
      {
        this.InnerList.add(i, paramzka);
        return i;
      }
    }
    zf.a(this.InnerList, paramzka);
    return getCount() - 1;
  }
  
  int b(zka paramzka)
  {
    zf.a(this.InnerList, paramzka);
    return getCount() - 1;
  }
  
  boolean b()
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zka localzka = (zka)localIterator.next();
      if (localzka.m()) {
        return true;
      }
    }
    return false;
  }
  
  zka a(boolean paramBoolean)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zka localzka = (zka)localIterator.next();
      if (localzka.m() == paramBoolean) {
        return localzka;
      }
    }
    return null;
  }
  
  void c(zka paramzka)
  {
    this.InnerList.remove(paramzka);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zkb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */