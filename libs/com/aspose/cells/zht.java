package com.aspose.cells;

import com.aspose.cells.a.c.zl;

class zht
  implements zahb, zail
{
  private int a;
  private int b;
  private Cells c;
  private RowCollection d;
  private zv e;
  private int f = 0;
  private int g;
  private int[][] h;
  private int[] i;
  private int j;
  private Row k;
  private Row l;
  private Row m;
  private int n;
  
  zht(Cells paramCells, RowCollection paramRowCollection, int paramInt)
  {
    this.c = paramCells;
    this.d = paramRowCollection;
    this.e = paramRowCollection.c;
    this.h = new int[this.e.a()][];
    this.j = 0;
    int i1 = -1;
    int i2 = -1;
    if (this.h.length > 1)
    {
      Object localObject1;
      Object localObject2;
      int i5;
      if (((byte)paramInt & 0x1) != 0)
      {
        int i3 = ((byte)paramInt & 0x2) == 0 ? 1 : 0;
        localObject1 = this.e.a(-1, -1, false);
        localObject2 = null;
        for (;;)
        {
          i5 = ((zaiv)localObject1).a();
          if (i5 < 0) {
            break;
          }
          localObject2 = this.e.f(i5);
          if ((i3 != 0) || (((zt)localObject2).a() > 0)) {
            this.h[(this.j++)] = ((int[])(int[])((zt)localObject2).l());
          }
        }
        if (this.j < this.h.length)
        {
          int[][] arrayOfInt = new int[this.j][];
          System.arraycopy(this.h, 0, arrayOfInt, 0, this.j);
          this.h = arrayOfInt;
        }
        if (this.j > 0)
        {
          int i6 = this.j - 1;
          zaiv localzaiv2;
          if (((zt)localObject2).a() > 0)
          {
            i6--;
            i2 = ((zt)localObject2).i();
            localzaiv2 = ((zt)localObject2).b();
            do
            {
              i5 = localzaiv2.a();
              if (i5 < 0) {
                break;
              }
            } while (((zt)localObject2).h(i5) == 0);
            i1 = ((zt)localObject2).i();
          }
          if ((i1 < 0) && (i6 > -1))
          {
            localObject2 = this.e.a(this.h[i6]);
            i2 = ((zt)localObject2).i();
            for (;;)
            {
              localzaiv2 = ((zt)localObject2).b();
              do
              {
                i5 = localzaiv2.a();
                if (i5 < 0) {
                  break;
                }
              } while (((zt)localObject2).h(i5) == 0);
              i1 = ((zt)localObject2).i();
              if (i1 > -1) {
                break;
              }
              i6--;
              if (i6 < 0) {
                break;
              }
              localObject2 = this.e.a(this.h[i6]);
            }
          }
        }
      }
      else
      {
        zaiv localzaiv1 = this.e.a(-1, -1, true);
        for (;;)
        {
          i5 = localzaiv1.a();
          if (i5 >= 0)
          {
            localObject1 = this.e.f(i5);
            this.h[(this.j++)] = ((int[])(int[])((zt)localObject1).l());
            if (((zt)localObject1).a() > 0)
            {
              if (i2 < 0) {
                i2 = ((zt)localObject1).i();
              }
              localObject2 = ((zt)localObject1).b();
              do
              {
                i5 = ((zaiv)localObject2).a();
                if (i5 < 0) {
                  break;
                }
              } while (((zt)localObject1).h(i5) == 0);
              i1 = ((zt)localObject1).i();
              if (i1 > -1) {
                break;
              }
            }
          }
        }
        for (int i7 = (this.j >> 1) - 1; i7 > -1; i7--)
        {
          int[] arrayOfInt1 = this.h[i7];
          this.h[i7] = this.h[(this.j - 1 - i7)];
          this.h[(this.j - 1 - i7)] = arrayOfInt1;
        }
      }
    }
    this.b = i2;
    this.a = i1;
    this.i = new int[this.h.length];
    for (int i4 = 0; i4 < this.i.length; i4++) {
      this.i[i4] = -1;
    }
  }
  
  public int b()
  {
    return this.j;
  }
  
  public int c(int paramInt)
  {
    int[] arrayOfInt = this.h[paramInt];
    return arrayOfInt[(arrayOfInt.length - 2)];
  }
  
  public int d(int paramInt)
  {
    int[] arrayOfInt = this.h[paramInt];
    return arrayOfInt[(arrayOfInt.length - 1)];
  }
  
  private zt e(int paramInt)
  {
    return this.e.a(this.h[paramInt]);
  }
  
  private Row f(int paramInt)
  {
    Row localRow = new Row(this.c, this.d, e(paramInt), false);
    localRow.d.c(this.i[paramInt]);
    return localRow;
  }
  
  private Row a(zt paramzt)
  {
    return new Row(this.c, this.d, paramzt, false);
  }
  
  private zt b(int paramInt1, int paramInt2)
  {
    zt localzt = this.e.f(paramInt1);
    if (paramInt2 < this.j)
    {
      System.arraycopy(this.h, paramInt2, this.h, paramInt2 + 1, this.j - paramInt2);
      System.arraycopy(this.i, paramInt2, this.i, paramInt2 + 1, this.j - paramInt2);
    }
    this.h[paramInt2] = ((int[])(int[])localzt.l());
    this.j += 1;
    return localzt;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public int a_()
  {
    return this.a;
  }
  
  public zt a(int paramInt)
  {
    Row localRow = b(paramInt);
    if (localRow == null) {
      return null;
    }
    return localRow.c;
  }
  
  public Row b(int paramInt)
  {
    switch (this.n)
    {
    case 1: 
      if (this.k.c.i() == paramInt) {
        return this.k;
      }
      localRow = g(paramInt);
      if (localRow != null)
      {
        this.n = 3;
        this.l = localRow;
      }
      return localRow;
    case 2: 
      if (this.k.c.i() == paramInt) {
        return this.k;
      }
      if (this.l.c.i() == paramInt)
      {
        this.n = 3;
        return this.l;
      }
      localRow = g(paramInt);
      if (localRow != null)
      {
        this.n = 8;
        this.m = localRow;
      }
      return localRow;
    case 3: 
      if (this.l.c.i() == paramInt) {
        return this.l;
      }
      if (this.k.c.i() == paramInt)
      {
        this.n = 2;
        return this.k;
      }
      localRow = g(paramInt);
      if (localRow != null)
      {
        this.n = 9;
        this.m = localRow;
      }
      return localRow;
    case 4: 
      if (this.k.c.i() == paramInt) {
        return this.k;
      }
      if (this.l.c.i() == paramInt)
      {
        this.n = 6;
        return this.l;
      }
      if (this.m.c.i() == paramInt)
      {
        this.n = 8;
        return this.m;
      }
      localRow = g(paramInt);
      if (localRow != null)
      {
        this.n = 8;
        this.m = localRow;
      }
      return localRow;
    case 5: 
      if (this.k.c.i() == paramInt) {
        return this.k;
      }
      if (this.m.c.i() == paramInt)
      {
        this.n = 8;
        return this.m;
      }
      if (this.l.c.i() == paramInt)
      {
        this.n = 6;
        return this.l;
      }
      localRow = g(paramInt);
      if (localRow != null)
      {
        this.n = 6;
        this.l = localRow;
      }
      return localRow;
    case 6: 
      if (this.l.c.i() == paramInt) {
        return this.l;
      }
      if (this.k.c.i() == paramInt)
      {
        this.n = 4;
        return this.k;
      }
      if (this.m.c.i() == paramInt)
      {
        this.n = 9;
        return this.m;
      }
      localRow = g(paramInt);
      if (localRow != null)
      {
        this.n = 9;
        this.m = localRow;
      }
      return localRow;
    case 7: 
      if (this.l.c.i() == paramInt) {
        return this.l;
      }
      if (this.m.c.i() == paramInt)
      {
        this.n = 9;
        return this.m;
      }
      if (this.k.c.i() == paramInt)
      {
        this.n = 4;
        return this.k;
      }
      localRow = g(paramInt);
      if (localRow != null)
      {
        this.n = 4;
        this.k = localRow;
      }
      return localRow;
    case 8: 
      if (this.m.c.i() == paramInt) {
        return this.m;
      }
      if (this.k.c.i() == paramInt)
      {
        this.n = 5;
        return this.k;
      }
      if (this.l.c.i() == paramInt)
      {
        this.n = 7;
        return this.l;
      }
      localRow = g(paramInt);
      if (localRow != null)
      {
        this.n = 7;
        this.l = localRow;
      }
      return localRow;
    case 9: 
      if (this.m.c.i() == paramInt) {
        return this.m;
      }
      if (this.l.c.i() == paramInt)
      {
        this.n = 7;
        return this.l;
      }
      if (this.k.c.i() == paramInt)
      {
        this.n = 5;
        return this.k;
      }
      localRow = g(paramInt);
      if (localRow != null)
      {
        this.n = 5;
        this.k = localRow;
      }
      return localRow;
    }
    Row localRow = g(paramInt);
    if (localRow != null)
    {
      this.n = 1;
      this.k = localRow;
    }
    return localRow;
  }
  
  private Row g(int paramInt)
  {
    this.f = zld.a(this, paramInt, this.f);
    if (this.f > -1) {
      return f(this.f);
    }
    this.f = (-this.f - 1);
    if (this.j == this.h.length)
    {
      if (this.f == this.j) {
        this.f -= 1;
      }
      return null;
    }
    this.g = this.e.a(paramInt, this.g);
    if (this.g < 0)
    {
      this.g = (-this.g - 1);
      return null;
    }
    return new Row(this.c, this.d, b(this.g, this.f), false);
  }
  
  public Cell a(int paramInt1, int paramInt2)
  {
    Row localRow = b(paramInt1);
    if (localRow == null) {
      return null;
    }
    Cell localCell = localRow.d.a(paramInt2, true, false);
    this.i[this.f] = localRow.d.b();
    return localCell;
  }
  
  public zgs a(int paramInt1, zgs paramzgs, int paramInt2)
  {
    Row localRow = b(paramInt1);
    if (localRow == null) {
      return null;
    }
    Cell localCell = localRow.d.b(paramzgs.a);
    if (localCell != null)
    {
      localCell.b();
      return localCell.c;
    }
    int i1 = localRow.d.d(paramzgs.a);
    if (i1 < 0) {
      return null;
    }
    return localRow.c.a(i1, paramzgs, paramInt2);
  }
  
  public zaja a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return new zb(this, paramInt1, paramInt2);
    }
    return new zc(this, paramInt1, paramInt2);
  }
  
  private class zb
    extends zht.za
  {
    zb(zht paramzht, int paramInt1, int paramInt2)
    {
      super(paramzht, paramInt1, paramInt2, true);
      this.i = this.g;
    }
    
    protected void d()
    {
      this.i = this.g;
    }
    
    public boolean c()
    {
      this.k = null;
      this.l = null;
      g();
      this.i -= 1;
      if (this.j < 0)
      {
        if (this.i >= this.f)
        {
          this.h = this.a.c(this.i);
          return true;
        }
        return false;
      }
      if (this.i >= this.f)
      {
        if (zht.c(this.a).a(this.j) > this.a.c(this.i))
        {
          this.i += 1;
          zht.a(this.a, this.j, this.i);
          this.g += 1;
        }
      }
      else
      {
        zht.a(this.a, this.j, this.f);
        this.i += 1;
        this.g += 1;
      }
      this.j = this.b.a();
      this.h = this.a.c(this.i);
      return true;
    }
    
    public void a(int paramInt)
    {
      super.a(paramInt);
      this.i = zld.a(this.a, paramInt, this.i);
      if (this.i < 0) {
        this.i = (-this.i - 1);
      } else {
        this.i += 1;
      }
    }
  }
  
  private class zc
    extends zht.za
  {
    zc(zht paramzht, int paramInt1, int paramInt2)
    {
      super(paramzht, paramInt1, paramInt2, false);
      this.i = (this.f - 1);
    }
    
    protected void d()
    {
      this.i = (this.f - 1);
    }
    
    public boolean c()
    {
      this.k = null;
      this.l = null;
      g();
      this.i += 1;
      if (this.j < 0)
      {
        if (this.i < this.g)
        {
          this.h = this.a.c(this.i);
          return true;
        }
        return false;
      }
      if (this.i < this.g)
      {
        if (zht.c(this.a).a(this.j) < this.a.c(this.i))
        {
          zht.a(this.a, this.j, this.i);
          this.g += 1;
        }
      }
      else
      {
        zht.a(this.a, this.j, this.i);
        this.g += 1;
      }
      this.j = this.b.a();
      this.h = this.a.c(this.i);
      return true;
    }
    
    public void a(int paramInt)
    {
      super.a(paramInt);
      this.i = zld.a(this.a, paramInt, this.i);
      if (this.i < 0) {
        this.i = (-this.i - 2);
      } else {
        this.i -= 1;
      }
    }
  }
  
  private abstract class za
    implements zaja
  {
    protected zht a;
    protected zaiv b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected zt k;
    protected Row l;
    private int n;
    private boolean o;
    
    za(zht paramzht, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      this.a = paramzht;
      this.h = -1;
      this.n = zht.a(paramzht);
      if ((paramInt1 < 0) && (paramInt2 < 0))
      {
        this.e = zht.b(this.a).length;
        this.f = 0;
        this.g = this.n;
        if (this.n < this.e)
        {
          this.o = false;
          this.b = zht.c(this.a).a(-1, -1, paramBoolean);
          this.j = this.b.a();
          if (paramBoolean)
          {
            this.d = zht.c(this.a).a(this.j);
            this.c = zht.c(this.a).a(zht.c(this.a).a(-1, false));
          }
          else
          {
            this.c = zht.c(this.a).a(this.j);
            this.d = zht.c(this.a).a(zht.c(this.a).a(-1, true));
          }
        }
        else
        {
          this.o = true;
          this.j = -1;
          this.c = paramInt1;
          this.d = paramInt2;
        }
      }
      else
      {
        this.j = -1;
        int i1 = -1;
        int i2 = paramInt1;
        int i3 = paramInt2;
        if (this.n < zht.b(this.a).length)
        {
          this.b = zht.c(paramzht).b(paramInt1, paramInt2, paramBoolean);
          if (this.b != null)
          {
            this.j = this.b.a();
            if (this.j < 0)
            {
              i1 = 0;
            }
            else
            {
              if (paramBoolean) {
                i3 = zht.c(this.a).a(this.j);
              } else {
                i2 = zht.c(this.a).a(this.j);
              }
              i1 = 1;
              for (;;)
              {
                int i4 = this.b.a();
                if (i4 < 0) {
                  break;
                }
                i1++;
                this.j = i4;
              }
              if (paramBoolean) {
                i2 = zht.c(this.a).a(this.j);
              } else {
                i3 = zht.c(this.a).a(this.j);
              }
            }
          }
          else
          {
            i1 = 0;
          }
        }
        else
        {
          this.o = true;
        }
        if (i1 == 0)
        {
          this.e = 0;
          this.c = paramInt1;
          this.d = paramInt2;
          this.f = -1;
          this.g = -1;
          this.o = true;
        }
        else
        {
          this.g = -1;
          if (paramInt1 < 0)
          {
            this.f = 0;
          }
          else
          {
            this.f = zld.a(paramzht, paramInt1, -1);
            if (this.f < 0)
            {
              this.f = (-this.f - 1);
              if (paramInt2 == paramInt1) {
                this.g = this.f;
              }
            }
            else if (paramInt2 == paramInt1)
            {
              this.g = (this.f + 1);
            }
          }
          if (paramInt2 < 0)
          {
            this.g = this.n;
          }
          else if (this.g < 0)
          {
            this.g = zld.a(paramzht, paramInt2, -1);
            if (this.g < 0) {
              this.g = (-this.g - 1);
            } else {
              this.g += 1;
            }
          }
          if (i1 < 0)
          {
            this.e = (this.g - this.f);
            if (this.e > 1)
            {
              i2 = this.a.c(this.f);
              i3 = this.a.c(this.g - 1);
            }
            else if (this.e == 1)
            {
              i2 = this.a.c(this.f);
              i3 = i2;
            }
          }
          else
          {
            this.e = i1;
            if (this.g - this.f < this.e)
            {
              this.o = false;
              this.b.b();
              this.j = this.b.a();
            }
            else
            {
              this.o = true;
              this.b = null;
              this.j = -1;
            }
          }
          this.c = i2;
          this.d = i3;
        }
      }
    }
    
    public void g()
    {
      if (zht.a(this.a) == this.n) {
        return;
      }
      this.n = zht.a(this.a);
      if (this.o)
      {
        int i1 = zld.a(this.a, this.c, this.f) - this.f;
        if (i1 > 0)
        {
          this.f += i1;
          this.g += i1;
          this.i += i1;
        }
      }
      else
      {
        this.f = zld.a(this.a, this.c, this.f);
        if (this.f < 0) {
          this.f = (-this.f - 1);
        }
        this.g = zld.a(this.a, this.d, this.g);
        if (this.g < 0) {
          this.g = (-this.g - 1);
        } else {
          this.g += 1;
        }
        if (this.g - this.f == this.e)
        {
          this.o = true;
          this.b = null;
          this.j = -1;
        }
        if (this.h > -1) {
          this.i = zld.a(this.a, this.h, this.i);
        } else {
          d();
        }
      }
    }
    
    public boolean h()
    {
      return true;
    }
    
    public void a(int paramInt1, int paramInt2)
    {
      zl.a("Check the logic of using CellsAccessorImmutableCache.RowEnumerator, it should not be synchronized.");
    }
    
    public boolean hasNext()
    {
      return c();
    }
    
    public Object next()
    {
      return i();
    }
    
    public void remove()
    {
      throw new CellsException(19, "Removing cells data while iteration is not supported");
    }
    
    public abstract boolean c();
    
    protected abstract void d();
    
    public int a()
    {
      return this.a.d(this.i);
    }
    
    public void a(int paramInt)
    {
      this.h = -1;
      g();
      if (!this.o)
      {
        this.b.b(paramInt);
        this.j = this.b.a();
      }
      this.k = null;
      this.l = null;
    }
    
    public void b()
    {
      this.h = -1;
      this.k = null;
      this.l = null;
      g();
      d();
      if (!this.o)
      {
        this.b.b();
        this.j = this.b.a();
      }
    }
    
    public zt e()
    {
      if (this.k == null) {
        this.k = zht.a(this.a, this.i);
      }
      return this.k;
    }
    
    public Row f()
    {
      if (this.l == null)
      {
        if (this.k == null) {
          this.k = zht.a(this.a, this.i);
        }
        this.l = zht.a(this.a, this.k);
      }
      return zht.b(this.a, this.i);
    }
    
    public Object i()
    {
      return f();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */