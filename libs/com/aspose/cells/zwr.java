package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zwr
  implements zail
{
  ArrayList a = new ArrayList();
  zqk b = null;
  
  public int b()
  {
    return this.a.size();
  }
  
  public int c(int paramInt)
  {
    return ((zwn)this.a.get(paramInt)).a();
  }
  
  zqk a()
  {
    if (this.b == null) {
      this.b = new zqk();
    }
    return this.b;
  }
  
  void a(zwr paramzwr)
  {
    this.a = new ArrayList(paramzwr.a.size());
    for (int i = 0; i < paramzwr.a.size(); i++)
    {
      zwn localzwn1 = (zwn)paramzwr.a.get(i);
      zwn localzwn2 = new zwn(localzwn1.a());
      zf.a(this.a, localzwn2);
      localzwn2.a(localzwn1);
    }
  }
  
  boolean c()
  {
    return this.a.size() != 0;
  }
  
  zwn a(int paramInt)
  {
    if (this.a.size() == 0) {
      return null;
    }
    int i = 0;
    int j = this.a.size() - 1;
    int k = 0;
    zwn localzwn = (zwn)this.a.get(j);
    if (localzwn.a() == paramInt) {
      return localzwn;
    }
    if (localzwn.a() < paramInt) {
      return null;
    }
    while (i <= j)
    {
      k = (i + j) / 2;
      localzwn = (zwn)this.a.get(k);
      if (localzwn.a() == paramInt) {
        return localzwn;
      }
      if (localzwn.a() < paramInt) {
        i = k + 1;
      } else {
        j = k - 1;
      }
    }
    return null;
  }
  
  zwn b(int paramInt)
  {
    return (zwn)this.a.get(paramInt);
  }
  
  int d(int paramInt)
  {
    return zld.a(this, paramInt, 0);
  }
  
  zgs a(int paramInt1, int paramInt2)
  {
    zwn localzwn = a(paramInt1);
    if (localzwn != null)
    {
      zgs localzgs = new zgs(paramInt2);
      int i = localzwn.a(localzgs, -1, (short)-1, false, true);
      if (localzgs.a == paramInt2)
      {
        zgs tmp43_41 = localzgs;
        tmp43_41.a = ((short)(tmp43_41.a - 1));
        localzwn.a(i, localzgs);
        return localzgs;
      }
    }
    return null;
  }
  
  zwn e(int paramInt)
  {
    if (this.a.size() == 0)
    {
      zwn localzwn1 = new zwn(paramInt);
      zf.a(this.a, localzwn1);
      return localzwn1;
    }
    int i = 0;
    int j = this.a.size() - 1;
    int k = 0;
    zwn localzwn2 = (zwn)this.a.get(j);
    if (localzwn2.a() == paramInt) {
      return localzwn2;
    }
    if (localzwn2.a() < paramInt)
    {
      localzwn3 = new zwn(paramInt);
      zf.a(this.a, localzwn3);
      return localzwn3;
    }
    while (i <= j)
    {
      k = (i + j) / 2;
      localzwn2 = (zwn)this.a.get(k);
      if (localzwn2.a() == paramInt) {
        return localzwn2;
      }
      if (localzwn2.a() < paramInt) {
        i = k + 1;
      } else {
        j = k - 1;
      }
    }
    zwn localzwn3 = new zwn(paramInt);
    if (localzwn2.a() < paramInt) {
      this.a.add(k + 1, localzwn3);
    } else {
      this.a.add(k, localzwn3);
    }
    return localzwn3;
  }
  
  void a(int paramInt1, int paramInt2, Object paramObject)
  {
    zwn localzwn = e(paramInt1);
    localzwn.a(paramInt2, paramObject);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */