package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class zbff
  extends CollectionBase
  implements zajf
{
  private zjf c;
  private zgp d;
  private zgp e;
  private ArrayList f;
  private ArrayList g;
  boolean a = false;
  boolean b = false;
  private ArrayList[] h;
  private ArrayList i = new ArrayList();
  private ArrayList[] j;
  
  zbff(zjf paramzjf)
  {
    this.c = paramzjf;
    this.d = new zgp(null);
    this.e = new zgp(null);
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
  
  ArrayList c()
  {
    return this.f;
  }
  
  void a(ArrayList paramArrayList)
  {
    this.f = paramArrayList;
  }
  
  ArrayList d()
  {
    return this.g;
  }
  
  void b(ArrayList paramArrayList)
  {
    this.g = paramArrayList;
  }
  
  ArrayList[] e()
  {
    return this.h;
  }
  
  void a(ArrayList[] paramArrayOfArrayList)
  {
    this.h = paramArrayOfArrayList;
  }
  
  ArrayList f()
  {
    return this.i;
  }
  
  ArrayList[] g()
  {
    return this.j;
  }
  
  void b(ArrayList[] paramArrayOfArrayList)
  {
    this.j = paramArrayOfArrayList;
  }
  
  public zaje a(int paramInt)
  {
    return (zaje)this.InnerList.get(paramInt);
  }
  
  zbfd c(int paramInt)
  {
    return (zbfd)this.InnerList.get(paramInt);
  }
  
  public zaje b(int paramInt)
  {
    zbfd localzbfd = new zbfd(this.c, this, paramInt);
    localzbfd.l(getCount());
    localzbfd.b(getCount());
    localzbfd.a(getCount());
    zf.a(this.InnerList, localzbfd);
    return localzbfd;
  }
  
  void a(zbfd paramzbfd)
  {
    zf.a(this.InnerList, paramzbfd);
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
  
  zbfd d(int paramInt)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zbfd localzbfd = (zbfd)localIterator.next();
      if ((localzbfd.ao()) && (localzbfd.ah() == paramInt)) {
        return localzbfd;
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
      zbfd localzbfd = (zbfd)localIterator.next();
      if ((localzbfd.ao()) && (paramInt == localzbfd.ah())) {
        k++;
      }
    }
    return k;
  }
  
  zbfd a(int paramInt1, int paramInt2)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zbfd localzbfd = (zbfd)localIterator.next();
      if ((localzbfd.m() == paramInt2) && (paramInt1 == localzbfd.ah())) {
        return localzbfd;
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
      zbfd localzbfd = (zbfd)localIterator.next();
      if ((localzbfd.m() == paramInt2) && (paramInt1 == localzbfd.ah())) {
        k++;
      }
    }
    return k;
  }
  
  List i()
  {
    return this.InnerList;
  }
  
  ArrayList j()
  {
    ArrayList localArrayList = new ArrayList();
    zf.a(localArrayList, this.InnerList);
    zbfh localzbfh = new zbfh();
    Collections.sort(localArrayList, localzbfh);
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
      zbfd localzbfd1 = (zbfd)paramArrayList.get(k);
      int m = 0;
      for (int n = 0; n < localArrayList.size(); n++)
      {
        zbfd localzbfd2 = (zbfd)localArrayList.get(n);
        if (localzbfd1.aF() < localzbfd2.aF())
        {
          localArrayList.add(n, localzbfd1);
          m = 1;
          break;
        }
      }
      if (m == 0) {
        zf.a(localArrayList, localzbfd1);
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
      zbfd localzbfd = (zbfd)localIterator.next();
      if ((localzbfd.b(paramArrayOfInt)) && (localzbfd.ah() == paramInt)) {
        zf.a(localArrayList2, localzbfd);
      }
    }
    return localArrayList2;
  }
  
  zbfd a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    List localList = a(paramInt2, paramArrayOfInt);
    if (localList.size() > paramInt1) {
      return (zbfd)localList.get(paramInt1);
    }
    return null;
  }
  
  int a(zbfd paramzbfd, int paramInt, int[] paramArrayOfInt)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = iterator();
    while (((Iterator)localObject1).hasNext())
    {
      zbfd localzbfd = (zbfd)((Iterator)localObject1).next();
      for (int i1 : paramArrayOfInt) {
        if ((localzbfd.m() == i1) && (localzbfd.ah() == paramInt))
        {
          zf.a(localArrayList, localzbfd);
          break;
        }
      }
    }
    if (localArrayList.size() > 0)
    {
      localObject1 = new zbfh();
      Collections.sort(localArrayList, (Comparator)localObject1);
      for (int k = 0; k < localArrayList.size(); k++)
      {
        ??? = (zbfd)localArrayList.get(k);
        if (paramzbfd.equals(???)) {
          return k;
        }
      }
    }
    return -1;
  }
  
  ArrayList l()
  {
    ArrayList localArrayList = new ArrayList();
    for (int k = 0; k < this.InnerList.size(); k++)
    {
      zbfd localzbfd = c(k);
      if (!localzbfd.j()) {
        for (int m = 0; m < localzbfd.H().getCount(); m++) {
          zf.a(localArrayList, localzbfd.H().a(m));
        }
      }
    }
    return localArrayList;
  }
  
  ArrayList m()
  {
    ArrayList localArrayList = new ArrayList();
    for (int k = 0; k < this.InnerList.size(); k++)
    {
      zbfd localzbfd = c(k);
      if (localzbfd.j()) {
        for (int m = 0; m < localzbfd.H().getCount(); m++) {
          zf.a(localArrayList, localzbfd.H().a(m));
        }
      }
    }
    return localArrayList;
  }
  
  int n()
  {
    int k = this.InnerList.size();
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      zbfd localzbfd = (zbfd)localIterator.next();
      if (localzbfd.al() + 1 > k) {
        k = localzbfd.al() + 1;
      }
    }
    return k;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */