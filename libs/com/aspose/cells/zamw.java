package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class zamw
  extends CollectionBase
  implements zain
{
  private zje a;
  
  zamw(zje paramzje)
  {
    this.a = paramzje;
  }
  
  public zamy b(int paramInt)
  {
    return (zamy)this.InnerList.get(paramInt);
  }
  
  public zaio a(int paramInt)
  {
    zamy localzamy = new zamy(this.a, this.a.x(), paramInt);
    zf.a(this.InnerList, localzamy);
    return localzamy;
  }
  
  public int a(zamy paramzamy)
  {
    zf.a(this.InnerList, paramzamy);
    return this.InnerList.size() - 1;
  }
  
  int a()
  {
    int i = 0;
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      zamy localzamy = (zamy)localIterator.next();
      if (!localzamy.b()) {
        i++;
      }
    }
    return i;
  }
  
  ArrayList a(boolean paramBoolean1, boolean paramBoolean2)
  {
    ArrayList localArrayList1 = a(1, false);
    ArrayList localArrayList2 = a(1, true);
    ArrayList localArrayList3 = a(2, false);
    ArrayList localArrayList4 = a(2, true);
    boolean bool1 = this.a.e().p();
    boolean bool2 = this.a.E().p();
    int i = 1;
    ArrayList localArrayList5 = this.a.z().j();
    if ((localArrayList5.size() > 0) && (((zbfc)localArrayList5.get(0)).j())) {
      i = 0;
    }
    int j = 0;
    if (localArrayList1.size() > 0)
    {
      localObject = ((zamy)localArrayList1.get(0)).i();
      if ((((zbfc)localObject).an()) || (((zbfc)localObject).aq())) {
        j = 1;
      }
    }
    if (localArrayList2.size() > 0)
    {
      localObject = ((zamy)localArrayList2.get(0)).i();
      if ((((zbfc)localObject).an()) || (((zbfc)localObject).aq())) {
        j = 1;
      }
    }
    if (paramBoolean2)
    {
      if (j == 0)
      {
        if ((!bool1) && (paramBoolean1))
        {
          localArrayList1 = a(localArrayList1);
          localArrayList2 = a(localArrayList2);
          Collections.reverse(localArrayList3);
          Collections.reverse(localArrayList4);
        }
      }
      else if ((bool2) && (paramBoolean1))
      {
        localArrayList1 = a(localArrayList1);
        localArrayList2 = a(localArrayList2);
        Collections.reverse(localArrayList3);
        Collections.reverse(localArrayList4);
      }
    }
    else if ((j != 0) && (paramBoolean1))
    {
      localArrayList1 = a(localArrayList1);
      localArrayList2 = a(localArrayList2);
      Collections.reverse(localArrayList3);
      Collections.reverse(localArrayList4);
    }
    Object localObject = new ArrayList();
    if (i != 0)
    {
      zf.a((ArrayList)localObject, localArrayList1);
      zf.a((ArrayList)localObject, localArrayList2);
      zf.a((ArrayList)localObject, localArrayList3);
      zf.a((ArrayList)localObject, localArrayList4);
    }
    else
    {
      zf.a((ArrayList)localObject, localArrayList2);
      zf.a((ArrayList)localObject, localArrayList1);
      zf.a((ArrayList)localObject, localArrayList4);
      zf.a((ArrayList)localObject, localArrayList3);
    }
    return (ArrayList)localObject;
  }
  
  zamy c(int paramInt)
  {
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      zamy localzamy = (zamy)localIterator.next();
      if (localzamy.f() == paramInt) {
        return localzamy;
      }
    }
    return null;
  }
  
  private ArrayList a(ArrayList paramArrayList)
  {
    ArrayList localArrayList1 = new ArrayList();
    zbfc localzbfc = null;
    if (paramArrayList.size() > 0)
    {
      localzbfc = ((zamy)paramArrayList.get(0)).i();
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
      zamy localzamy = (zamy)paramArrayList.get(i);
      if (localzamy.i().ag() == localzbfc.ag())
      {
        localArrayList4 = (ArrayList)localArrayList1.get(localArrayList1.size() - 1);
        zf.a(localArrayList4, paramArrayList.get(i));
      }
      else
      {
        localzbfc = localzamy.i();
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
      zamy localzamy = b(i);
      if ((localzamy.h() == paramInt) && (localzamy.i().j() == paramBoolean)) {
        zf.a(localArrayList, localzamy);
      }
    }
    return localArrayList;
  }
  
  public void a(int paramInt, zamy paramzamy)
  {
    this.InnerList.add(paramInt, paramzamy);
  }
  
  boolean b()
  {
    if (this.InnerList == null) {
      return false;
    }
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      zamy localzamy = (zamy)localIterator.next();
      if (localzamy.h() == 2) {
        return true;
      }
      if ((localzamy.h() == 1) && (localzamy.i().al())) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */