package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zsd
{
  private zww a;
  private zse b;
  private ArrayList c;
  private int d;
  
  zsd(zse paramzse)
  {
    this.b = paramzse;
    this.c = new ArrayList();
    this.a = new zww();
  }
  
  void a(zsd paramzsd)
  {
    this.a.a(paramzsd.a);
    this.d = paramzsd.d;
    this.c.clear();
    for (int i = 0; i < paramzsd.c.size(); i++)
    {
      zwy localzwy1 = (zwy)paramzsd.c.get(i);
      zwy localzwy2 = new zwy();
      localzwy2.a(localzwy1);
      zf.a(this.c, localzwy2);
    }
  }
  
  int a()
  {
    int i = 16 + this.c.size() * 8;
    return i;
  }
  
  zww b()
  {
    return this.a;
  }
  
  ArrayList c()
  {
    return this.c;
  }
  
  int d()
  {
    return this.d;
  }
  
  void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  void b(int paramInt)
  {
    int i = -1;
    for (int j = this.c.size() - 1; j >= 0; j--)
    {
      zwy localzwy = (zwy)this.c.get(j);
      if (paramInt == localzwy.a) {
        this.c.remove(j);
      } else if (localzwy.a > i) {
        i = localzwy.a;
      }
    }
    if ((this.d & 0xFFFF) == paramInt) {
      this.d = i;
    }
  }
  
  zsc a(ShapeCollection paramShapeCollection, zse paramzse)
  {
    this.d += 1;
    zwy localzwy = new zwy();
    localzwy.a = (this.d & 0xFFFF);
    localzwy.b = 1;
    zf.a(c(), localzwy);
    int i = this.c.size() * 1024 + 1;
    if (i < b().a)
    {
      int j = (int)Math.ceil((b().a - 1) / 1024.0D);
      if (j > this.c.size()) {
        i = (b().a / 1024 + 1) * 1024 + 1;
      }
    }
    b().a = i;
    b().c = 1;
    b().b = 1;
    zsc localzsc = new zsc(paramShapeCollection, paramzse, this.d & 0xFFFF, b().a - 1);
    return localzsc;
  }
  
  int a(int paramInt1, int paramInt2)
  {
    for (int i = this.c.size() - 1; i >= 0; i--)
    {
      zwy localzwy = (zwy)this.c.get(i);
      if (localzwy.a == paramInt1)
      {
        if ((localzwy.b + paramInt2) / 1024 != 1) {
          break;
        }
        localzwy = new zwy();
        localzwy.a = paramInt1;
        localzwy.b = 1;
        zf.a(this.c, localzwy);
        int j = this.c.size() * 1024 + 1;
        if (j < b().a)
        {
          int k = (int)Math.ceil((b().a - 1) / 1024.0D);
          if (k > this.c.size()) {
            j = (b().a / 1024 + 1) * 1024 + 1;
          }
        }
        j--;
        b().a = j;
        return b().a;
      }
    }
    return -1;
  }
  
  int b(int paramInt1, int paramInt2)
  {
    b().b += paramInt2;
    for (int i = this.c.size() - 1; i >= 0; i--)
    {
      zwy localzwy = (zwy)this.c.get(i);
      if (localzwy.a == paramInt1)
      {
        if ((i == this.c.size() - 1) && (b().a / 1024 <= this.c.size())) {
          b().a = ((this.c.size() + 1) * 1024 + 1);
        }
        localzwy.b += paramInt2;
        if ((paramInt2 != 1) || (localzwy.b == 1) || (localzwy.b % 1024 != 1)) {
          break;
        }
        localzwy.b -= 1;
        localzwy = new zwy();
        localzwy.a = paramInt1;
        localzwy.b = 1;
        zf.a(this.c, localzwy);
        int j = this.c.size() * 1024 + 1;
        if (j < b().a)
        {
          int k = (int)Math.ceil((b().a - 1) / 1024.0D);
          if (k > this.c.size()) {
            j = (b().a / 1024 + 1) * 1024 + 1;
          }
        }
        b().a = j;
        return b().a;
      }
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */