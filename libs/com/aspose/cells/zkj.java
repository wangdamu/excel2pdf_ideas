package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

class zkj
  extends CollectionBase
{
  void a(int paramInt, Object paramObject)
  {
    if (this.InnerList.size() > 0)
    {
      localObject = this.InnerList.iterator();
      while (((Iterator)localObject).hasNext())
      {
        zki localzki = (zki)((Iterator)localObject).next();
        if (localzki.a == paramInt)
        {
          localzki.b = paramObject;
          return;
        }
      }
    }
    Object localObject = new zki();
    ((zki)localObject).a = paramInt;
    ((zki)localObject).b = paramObject;
    zf.a(this.InnerList, localObject);
  }
  
  Object a(int paramInt)
  {
    if (this.InnerList.size() > 0)
    {
      Iterator localIterator = this.InnerList.iterator();
      while (localIterator.hasNext())
      {
        zki localzki = (zki)localIterator.next();
        if (localzki.a == paramInt) {
          return localzki.b;
        }
      }
    }
    return null;
  }
  
  zki b(int paramInt)
  {
    if (this.InnerList.size() > 0)
    {
      Iterator localIterator = this.InnerList.iterator();
      while (localIterator.hasNext())
      {
        zki localzki = (zki)localIterator.next();
        if (localzki.a == paramInt) {
          return localzki;
        }
      }
    }
    return null;
  }
  
  void a(zkj paramzkj)
  {
    Iterator localIterator = paramzkj.iterator();
    while (localIterator.hasNext())
    {
      zki localzki = (zki)localIterator.next();
      a(localzki.a, localzki.b);
    }
  }
  
  boolean b(zkj paramzkj)
  {
    if (getCount() != paramzkj.getCount()) {
      return false;
    }
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      zki localzki1 = (zki)localIterator.next();
      zki localzki2 = paramzkj.b(localzki1.a);
      if ((localzki2 == null) || (localzki1.b != localzki2.b)) {
        return false;
      }
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zkj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */