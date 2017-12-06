package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class zbfe
  extends CollectionBase
  implements zajf
{
  private zje c;
  private zgo d;
  private zgo e;
  private ArrayList f;
  private ArrayList g;
  boolean a = false;
  boolean b = false;
  private ArrayList[] h;
  private ArrayList i = new ArrayList();
  private ArrayList[] j;
  
  zbfe(zje paramzje)
  {
    this.c = paramzje;
    this.d = new zgo(null);
    this.e = new zgo(null);
    this.f = new ArrayList();
    this.g = new ArrayList();
  }
  
  public zagz a()
  {
    return this.d;
  }
  
  public zagz b()
  {
    return this.e;
  }
  
  public ArrayList c()
  {
    return this.f;
  }
  
  public void a(ArrayList paramArrayList)
  {
    this.f = paramArrayList;
  }
  
  public ArrayList d()
  {
    return this.g;
  }
  
  public void b(ArrayList paramArrayList)
  {
    this.g = paramArrayList;
  }
  
  public ArrayList[] e()
  {
    return this.h;
  }
  
  public void a(ArrayList[] paramArrayOfArrayList)
  {
    this.h = paramArrayOfArrayList;
  }
  
  public ArrayList f()
  {
    return this.i;
  }
  
  public ArrayList[] g()
  {
    return this.j;
  }
  
  public void b(ArrayList[] paramArrayOfArrayList)
  {
    this.j = paramArrayOfArrayList;
  }
  
  public zaje a(int paramInt)
  {
    return (zbfc)this.InnerList.get(paramInt);
  }
  
  zbfc c(int paramInt)
  {
    return (zbfc)this.InnerList.get(paramInt);
  }
  
  public zaje b(int paramInt)
  {
    zbfc localzbfc = new zbfc(this.c, this, paramInt);
    localzbfc.l(getCount());
    localzbfc.b(getCount());
    localzbfc.a(getCount());
    zf.a(this.InnerList, localzbfc);
    return localzbfc;
  }
  
  int a(zbfc paramzbfc)
  {
    int k = this.InnerList.size();
    if (paramzbfc.ah() == null) {
      paramzbfc.a(this);
    }
    paramzbfc.a(this.c);
    zf.a(this.InnerList, paramzbfc);
    return this.InnerList.size() - 1;
  }
  
  int h()
  {
    ArrayList localArrayList = new ArrayList();
    for (int k = 0; k < getCount(); k++) {
      zf.a(localArrayList, Integer.valueOf(a(k).k().getCount()));
    }
    Collections.sort(localArrayList);
    return ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
  }
  
  zbfc d(int paramInt)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zbfc localzbfc = (zbfc)localIterator.next();
      if ((localzbfc.am()) && (localzbfc.af() == paramInt)) {
        return localzbfc;
      }
    }
    return null;
  }
  
  int e(int paramInt)
  {
    int k = 0;
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zbfc localzbfc = (zbfc)localIterator.next();
      if ((localzbfc.am()) && (paramInt == localzbfc.af())) {
        k++;
      }
    }
    return k;
  }
  
  zbfc a(int paramInt1, int paramInt2)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zbfc localzbfc = (zbfc)localIterator.next();
      if ((localzbfc.m() == paramInt2) && (paramInt1 == localzbfc.af())) {
        return localzbfc;
      }
    }
    return null;
  }
  
  int b(int paramInt1, int paramInt2)
  {
    int k = 0;
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zbfc localzbfc = (zbfc)localIterator.next();
      if ((localzbfc.m() == paramInt2) && (paramInt1 == localzbfc.af())) {
        k++;
      }
    }
    return k;
  }
  
  ArrayList i()
  {
    return this.InnerList;
  }
  
  ArrayList j()
  {
    ArrayList localArrayList = new ArrayList();
    zf.a(localArrayList, this.InnerList);
    zbfg localzbfg = new zbfg();
    Collections.sort(localArrayList, localzbfg);
    return localArrayList;
  }
  
  ArrayList k()
  {
    ArrayList localArrayList = j();
    return c(localArrayList);
  }
  
  private ArrayList c(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramArrayList.size() > 0) {
      zf.a(localArrayList, paramArrayList.get(0));
    }
    for (int k = 1; k < paramArrayList.size(); k++)
    {
      zbfc localzbfc1 = (zbfc)paramArrayList.get(k);
      int m = 0;
      for (int n = 0; n < localArrayList.size(); n++)
      {
        zbfc localzbfc2 = (zbfc)localArrayList.get(n);
        if ((localzbfc1.j() == localzbfc2.j()) && (localzbfc1.aD() < localzbfc2.aD()))
        {
          localArrayList.add(n, localzbfc1);
          m = 1;
          break;
        }
      }
      if (m == 0) {
        zf.a(localArrayList, localzbfc1);
      }
    }
    return localArrayList;
  }
  
  List a(int paramInt, int[] paramArrayOfInt)
  {
    ArrayList localArrayList1 = j();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = localArrayList1.iterator();
    while (localIterator.hasNext())
    {
      zbfc localzbfc = (zbfc)localIterator.next();
      if ((localzbfc.b(paramArrayOfInt)) && (localzbfc.af() == paramInt)) {
        zf.a(localArrayList2, localzbfc);
      }
    }
    return localArrayList2;
  }
  
  zbfc a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    List localList = a(paramInt2, paramArrayOfInt);
    if (localList.size() > paramInt1) {
      return (zbfc)localList.get(paramInt1);
    }
    return null;
  }
  
  int a(zbfc paramzbfc, int paramInt, int[] paramArrayOfInt)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = iterator();
    while (((Iterator)localObject1).hasNext())
    {
      zbfc localzbfc = (zbfc)((Iterator)localObject1).next();
      if (localzbfc.af() == paramInt) {
        for (int i1 : paramArrayOfInt) {
          if ((localzbfc.m() == i1) && (localzbfc.af() == paramInt))
          {
            zf.a(localArrayList, localzbfc);
            break;
          }
        }
      }
    }
    if (localArrayList.size() > 0)
    {
      localObject1 = new zbfg();
      Collections.sort(localArrayList, (Comparator)localObject1);
      for (int k = 0; k < localArrayList.size(); k++)
      {
        ??? = (zbfc)localArrayList.get(k);
        if (paramzbfc.equals(???)) {
          return k;
        }
      }
    }
    return -1;
  }
  
  ArrayList l()
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = this.c.z().j();
    for (int k = 0; k < localArrayList2.size(); k++)
    {
      zbfc localzbfc = (zbfc)localArrayList2.get(k);
      zf.a(localArrayList1, localzbfc.F().c());
    }
    return localArrayList1;
  }
  
  ArrayList m()
  {
    ArrayList localArrayList = new ArrayList();
    for (int k = 0; k < this.InnerList.size(); k++)
    {
      zbfc localzbfc = c(k);
      if (!localzbfc.j()) {
        for (int m = 0; m < localzbfc.F().getCount(); m++) {
          zf.a(localArrayList, localzbfc.F().a(m));
        }
      }
    }
    return localArrayList;
  }
  
  ArrayList n()
  {
    ArrayList localArrayList = new ArrayList();
    for (int k = 0; k < this.InnerList.size(); k++)
    {
      zbfc localzbfc = c(k);
      if (localzbfc.j()) {
        for (int m = 0; m < localzbfc.F().getCount(); m++) {
          zf.a(localArrayList, localzbfc.F().a(m));
        }
      }
    }
    return localArrayList;
  }
  
  boolean o()
  {
    return l().size() != 0;
  }
  
  boolean p()
  {
    if (this.InnerList == null) {
      return false;
    }
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      zbfc localzbfc = (zbfc)localIterator.next();
      if (localzbfc.al()) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */