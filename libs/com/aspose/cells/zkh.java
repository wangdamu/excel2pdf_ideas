package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class zkh
  extends CollectionBase
  implements zaho
{
  private zbfd a;
  private zjf b;
  
  zkh(zjf paramzjf, zbfd paramzbfd)
  {
    this.b = paramzjf;
    this.a = paramzbfd;
  }
  
  zbfd a()
  {
    return this.a;
  }
  
  public zahn a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > getCount() - 1)) {
      return null;
    }
    return (zahn)this.InnerList.get(paramInt);
  }
  
  public zkf b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > getCount() - 1)) {
      return null;
    }
    return (zkf)this.InnerList.get(paramInt);
  }
  
  zjf b()
  {
    return this.b;
  }
  
  private int a(zkf paramzkf)
  {
    zf.a(this.InnerList, paramzkf);
    paramzkf.a(this);
    paramzkf.f();
    return this.InnerList.size() - 1;
  }
  
  public zahn a(double paramDouble)
  {
    zkf localzkf = new zkf(this.b, paramDouble);
    a(localzkf);
    return localzkf;
  }
  
  List c()
  {
    return this.InnerList;
  }
  
  ArrayList d()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = null;
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      zkf localzkf1 = b(i);
      if (i == 0)
      {
        zf.a(localArrayList, localzkf1);
      }
      else
      {
        int j = 0;
        for (int k = 0; k < localArrayList.size(); k++)
        {
          zkf localzkf2 = (zkf)localArrayList.get(k);
          if (localzkf2.q() > localzkf1.q())
          {
            localArrayList.add(k, localzkf1);
            j = 1;
            break;
          }
        }
        if (j == 0) {
          zf.a(localArrayList, localzkf1);
        }
      }
      localObject = localzkf1;
    }
    return localArrayList;
  }
  
  double e()
  {
    double d1 = 0.0D;
    int i = 1;
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      zkf localzkf = (zkf)localIterator.next();
      if (localzkf != null)
      {
        double d2 = Math.abs(localzkf.w());
        if (i != 0)
        {
          d1 = localzkf.w();
          i = 0;
        }
        if ((d2 > 0.0D) && (d2 < d1)) {
          d1 = d2;
        }
      }
    }
    return d1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zkh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */