package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class zamx
  extends CollectionBase
  implements zain
{
  private zjf a;
  
  zamx(zjf paramzjf)
  {
    this.a = paramzjf;
  }
  
  public zamz b(int paramInt)
  {
    if (paramInt < getCount()) {
      return (zamz)this.InnerList.get(paramInt);
    }
    return null;
  }
  
  public zaio a(int paramInt)
  {
    zamz localzamz = new zamz(this.a, this.a.x(), paramInt);
    zf.a(this.InnerList, localzamz);
    return localzamz;
  }
  
  void a(zamz paramzamz)
  {
    zf.a(this.InnerList, paramzamz);
  }
  
  int a()
  {
    int i = 0;
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      zamz localzamz = (zamz)localIterator.next();
      if (!localzamz.b()) {
        i++;
      }
    }
    return i;
  }
  
  zamz c(int paramInt)
  {
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      zamz localzamz = (zamz)localIterator.next();
      if (localzamz.f() == paramInt) {
        return localzamz;
      }
    }
    return null;
  }
  
  ArrayList a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    ArrayList localArrayList1 = a(1, false);
    ArrayList localArrayList2 = a(1, true);
    ArrayList localArrayList3 = a(2, false);
    ArrayList localArrayList4 = a(2, true);
    boolean bool1 = this.a.e().p();
    boolean bool2 = this.a.G().p();
    boolean bool3 = this.a.g().p();
    boolean bool4 = this.a.I().p();
    int i = 1;
    ArrayList localArrayList5 = this.a.z().j();
    if ((localArrayList5.size() > 0) && (((zbfd)localArrayList5.get(0)).j())) {
      i = 0;
    }
    boolean bool5 = b(localArrayList1);
    boolean bool6 = b(localArrayList2);
    if (paramBoolean2)
    {
      if ((!bool5) && (!bool1))
      {
        localArrayList1 = a(localArrayList1);
        Collections.reverse(localArrayList3);
      }
    }
    else if ((bool5) && (paramBoolean1))
    {
      localArrayList1 = a(localArrayList1);
      Collections.reverse(localArrayList3);
    }
    if (paramBoolean3)
    {
      if ((!bool6) && (!bool3))
      {
        localArrayList2 = a(localArrayList2);
        Collections.reverse(localArrayList4);
      }
    }
    else if ((bool6) && (paramBoolean1))
    {
      localArrayList2 = a(localArrayList2);
      Collections.reverse(localArrayList4);
    }
    ArrayList localArrayList6 = new ArrayList();
    if (i != 0)
    {
      zf.a(localArrayList6, localArrayList1);
      zf.a(localArrayList6, localArrayList2);
      zf.a(localArrayList6, localArrayList3);
      zf.a(localArrayList6, localArrayList4);
    }
    else
    {
      zf.a(localArrayList6, localArrayList2);
      zf.a(localArrayList6, localArrayList1);
      zf.a(localArrayList6, localArrayList4);
      zf.a(localArrayList6, localArrayList3);
    }
    return localArrayList6;
  }
  
  private ArrayList a(ArrayList paramArrayList)
  {
    ArrayList localArrayList1 = new ArrayList();
    zbfd localzbfd = null;
    if (paramArrayList.size() > 0)
    {
      localzbfd = ((zamz)paramArrayList.get(0)).l();
      ArrayList localArrayList2 = new ArrayList();
      zf.a(localArrayList2, paramArrayList.get(0));
      zf.a(localArrayList1, localArrayList2);
    }
    else
    {
      return paramArrayList;
    }
    ArrayList localArrayList4;
    for (int i = 1; i < paramArrayList.size(); i++)
    {
      zamz localzamz = (zamz)paramArrayList.get(i);
      if (localzamz.l().ai() == localzbfd.ai())
      {
        localArrayList4 = (ArrayList)localArrayList1.get(localArrayList1.size() - 1);
        zf.a(localArrayList4, paramArrayList.get(i));
      }
      else
      {
        localzbfd = localzamz.l();
        localArrayList4 = new ArrayList();
        zf.a(localArrayList4, paramArrayList.get(i));
        zf.a(localArrayList1, localArrayList4);
      }
    }
    ArrayList localArrayList3 = new ArrayList();
    for (int j = 0; j < localArrayList1.size(); j++)
    {
      localArrayList4 = (ArrayList)localArrayList1.get(j);
      Collections.reverse(localArrayList4);
      zf.a(localArrayList3, localArrayList4);
    }
    return localArrayList3;
  }
  
  private ArrayList a(int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < getCount(); i++)
    {
      zamz localzamz = b(i);
      if ((localzamz.k() == paramInt) && (localzamz.l().j() == paramBoolean)) {
        zf.a(localArrayList, localzamz);
      }
    }
    return localArrayList;
  }
  
  private boolean b(ArrayList paramArrayList)
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      zamz localzamz = (zamz)paramArrayList.get(i);
      if ((localzamz.l().ap()) || (localzamz.l().as())) {
        return true;
      }
    }
    return false;
  }
  
  public void a(int paramInt, zamz paramzamz)
  {
    this.InnerList.add(paramInt, paramzamz);
  }
  
  boolean b()
  {
    if (this.InnerList == null) {
      return false;
    }
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      zamz localzamz = (zamz)localIterator.next();
      if (localzamz.k() == 2) {
        return true;
      }
      if ((localzamz.k() == 1) && (localzamz.l().an())) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */