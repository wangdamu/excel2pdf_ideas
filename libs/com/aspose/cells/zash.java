package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zash
{
  Worksheet a;
  zasg b;
  ArrayList c;
  ArrayList d;
  int e;
  double f;
  ArrayList g;
  
  zash(zasg paramzasg, Worksheet paramWorksheet)
  {
    this.a = paramWorksheet;
    this.b = paramzasg;
    this.d = new ArrayList();
    this.e = 0;
    this.c = new ArrayList();
    this.g = new ArrayList();
  }
  
  void a(int paramInt)
  {
    for (int i = 0; i < this.c.size(); i++)
    {
      zarz localzarz = (zarz)this.c.get(i);
      localzarz.a(this.b, paramInt);
    }
  }
  
  int b(int paramInt)
  {
    for (int i = 0; i < this.c.size(); i++)
    {
      zarz localzarz = (zarz)this.c.get(i);
      if ((paramInt >= localzarz.b) && (paramInt < localzarz.b + localzarz.a)) {
        return localzarz.h;
      }
    }
    return 15;
  }
  
  int c(int paramInt)
  {
    for (int i = 0; i < this.c.size(); i++)
    {
      zarz localzarz = (zarz)this.c.get(i);
      if ((paramInt >= localzarz.b) && (paramInt < localzarz.b + localzarz.a)) {
        return localzarz.f;
      }
    }
    return 15;
  }
  
  zarz d(int paramInt)
  {
    for (int i = 0; i < this.c.size(); i++)
    {
      zarz localzarz = (zarz)this.c.get(i);
      if ((paramInt >= localzarz.b) && (paramInt < localzarz.b + localzarz.a)) {
        return localzarz;
      }
    }
    return null;
  }
  
  zarz a(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < this.c.size(); i++)
    {
      zarz localzarz2 = (zarz)this.c.get(i);
      if ((paramInt1 >= localzarz2.b) && (paramInt1 < localzarz2.b + localzarz2.a))
      {
        if (localzarz2.b == paramInt1)
        {
          if (localzarz2.a > paramInt2)
          {
            j = localzarz2.b + localzarz2.a;
            localzarz2.a = paramInt2;
            zarz localzarz3 = new zarz();
            localzarz3.a(localzarz2);
            localzarz3.b = (paramInt1 + paramInt2);
            localzarz3.a = (j - localzarz3.b);
            this.c.add(i + 1, localzarz3);
          }
          return localzarz2;
        }
        int j = localzarz2.b + localzarz2.a;
        int k = paramInt1 + paramInt2;
        localzarz2.a = (paramInt1 - localzarz2.b + 1);
        zarz localzarz4 = new zarz();
        localzarz4.a(localzarz2);
        localzarz4.b = paramInt1;
        this.c.add(i + 1, localzarz4);
        if (j == k)
        {
          localzarz4.a = (k - localzarz4.b);
          return localzarz4;
        }
        if (j > k)
        {
          int m = j;
          j = k;
          k = m;
        }
        zarz localzarz5 = new zarz();
        localzarz5.a(localzarz2);
        localzarz5.b = j;
        localzarz5.a = (k - j);
        this.c.add(i + 2, localzarz5);
        return localzarz4;
      }
    }
    zarz localzarz1 = new zarz();
    localzarz1.b = paramInt1;
    localzarz1.a = paramInt2;
    zf.a(this.c, localzarz1);
    return localzarz1;
  }
  
  zatd e(int paramInt)
  {
    if (this.e >= this.d.size()) {
      return null;
    }
    while (this.e < this.d.size())
    {
      zatd localzatd = (zatd)this.d.get(this.e);
      if (paramInt >= localzatd.a)
      {
        if (paramInt < localzatd.a + localzatd.b) {
          return localzatd;
        }
      }
      else {
        return null;
      }
      this.e += 1;
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zash.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */