package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zmv
{
  private zig a;
  private ArrayList b = new ArrayList();
  private ArrayList c = new ArrayList();
  private ArrayList d = new ArrayList();
  private ArrayList e = new ArrayList();
  private ArrayList f = new ArrayList();
  private ArrayList g = new ArrayList();
  private ArrayList h = new ArrayList();
  private ArrayList i = new ArrayList();
  private ArrayList j = new ArrayList();
  private ArrayList k = new ArrayList();
  private int l = 0;
  private int m = 0;
  private int n = 0;
  private StringBuilder o;
  private StringBuilder p;
  
  public zmv(zig paramzig, StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2)
  {
    this.a = paramzig;
    this.o = paramStringBuilder1;
    this.p = paramStringBuilder2;
  }
  
  public void a()
  {
    if (this.o.length() < 1) {
      return;
    }
    zir localzir = new zir(this.a, zs.a(this.o));
    this.o.setLength(0);
    this.m += localzir.d();
    if (localzir.c() != null) {
      for (int i3 : localzir.c()) {
        zf.a(this.i, Integer.valueOf(i3));
      }
    }
    zf.a(this.f, localzir);
    zf.a(this.g, Integer.valueOf(this.p.length()));
  }
  
  public void a(boolean paramBoolean, int paramInt)
  {
    a();
    zf.a(this.e, Boolean.valueOf(paramBoolean));
    zf.a(this.d, Integer.valueOf(this.m));
    this.l += this.m;
    this.m = 0;
    zf.a(this.h, Integer.valueOf(this.i.size()));
    Object localObject;
    int i2;
    if (this.f.size() > 0)
    {
      localObject = new zir[this.f.size()];
      int[] arrayOfInt = new int[localObject.length];
      for (i2 = 0; i2 < localObject.length; i2++)
      {
        localObject[i2] = ((zir)this.f.get(i2));
        arrayOfInt[i2] = (paramBoolean ? paramInt - ((Integer)this.g.get(i2)).intValue() : ((Integer)this.g.get(i2)).intValue() - paramInt);
      }
      if (paramBoolean)
      {
        if (arrayOfInt[0] == paramInt - this.n) {
          arrayOfInt[0] = Integer.MAX_VALUE;
        }
      }
      else if (arrayOfInt[(arrayOfInt.length - 1)] == this.p.length() - paramInt) {
        arrayOfInt[(arrayOfInt.length - 1)] = Integer.MAX_VALUE;
      }
      zf.a(this.b, localObject);
      zf.a(this.c, arrayOfInt);
      this.f.clear();
      this.g.clear();
    }
    else
    {
      zf.a(this.b, null);
      zf.a(this.c, null);
    }
    if (this.k.size() > 0)
    {
      localObject = new int[this.k.size()];
      for (i2 = 0; i2 < localObject.length; i2++)
      {
        int i1 = ((Integer)this.k.get(i2)).intValue();
        if (i1 < 0)
        {
          i1 = -i1 - 1;
          i1 = paramBoolean ? paramInt - i1 - 1 : i1 - paramInt;
          i1 = -i1 - 1;
        }
        else
        {
          i1 = paramBoolean ? paramInt - i1 - 1 : i1 - paramInt;
        }
        localObject[i2] = i1;
      }
      this.k.clear();
      zf.a(this.j, localObject);
    }
    else
    {
      zf.a(this.j, null);
    }
    this.n = this.p.length();
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      zf.a(this.k, Integer.valueOf(this.p.length()));
    } else {
      zf.a(this.k, Integer.valueOf(-this.p.length() - 1));
    }
  }
  
  public StringBuilder b()
  {
    return this.o;
  }
  
  public StringBuilder c()
  {
    return this.p;
  }
  
  public int d()
  {
    return this.l;
  }
  
  public zir[][] e()
  {
    if (this.b.size() > 0)
    {
      zir[][] arrayOfzir = new zir[this.b.size()][];
      for (int i1 = 0; i1 < arrayOfzir.length; i1++) {
        if (this.b.get(i1) != null) {
          arrayOfzir[i1] = ((zir[])(zir[])this.b.get(i1));
        }
      }
      return arrayOfzir;
    }
    return (zir[][])null;
  }
  
  public int[][] f()
  {
    if (this.b.size() > 0)
    {
      int[][] arrayOfInt = new int[this.c.size()][];
      for (int i1 = 0; i1 < arrayOfInt.length; i1++) {
        if (this.c.get(i1) != null) {
          arrayOfInt[i1] = ((int[])(int[])this.c.get(i1));
        }
      }
      return arrayOfInt;
    }
    return (int[][])null;
  }
  
  public int[] g()
  {
    if (this.b.size() > 0)
    {
      int[] arrayOfInt = new int[this.d.size()];
      for (int i1 = 0; i1 < arrayOfInt.length; i1++) {
        arrayOfInt[i1] = ((Integer)this.d.get(i1)).intValue();
      }
      return arrayOfInt;
    }
    return null;
  }
  
  public boolean[] h()
  {
    if (this.b.size() > 0)
    {
      boolean[] arrayOfBoolean = new boolean[this.e.size()];
      for (int i1 = 0; i1 < arrayOfBoolean.length; i1++) {
        arrayOfBoolean[i1] = ((Boolean)this.e.get(i1)).booleanValue();
      }
      return arrayOfBoolean;
    }
    return null;
  }
  
  public int[] i()
  {
    if (this.i.size() > 0)
    {
      int[] arrayOfInt = new int[this.i.size()];
      for (int i1 = 0; i1 < arrayOfInt.length; i1++) {
        arrayOfInt[i1] = ((Integer)this.i.get(i1)).intValue();
      }
      return arrayOfInt;
    }
    return null;
  }
  
  public int[] j()
  {
    if (this.i.size() > 0)
    {
      int[] arrayOfInt = new int[this.h.size()];
      for (int i1 = 0; i1 < arrayOfInt.length; i1++) {
        arrayOfInt[i1] = ((Integer)this.h.get(i1)).intValue();
      }
      return arrayOfInt;
    }
    return null;
  }
  
  public int[][] k()
  {
    if (this.j.size() > 0)
    {
      int[][] arrayOfInt = new int[this.j.size()][];
      for (int i1 = 0; i1 < arrayOfInt.length; i1++) {
        if (this.j.get(i1) != null) {
          arrayOfInt[i1] = ((int[])(int[])this.j.get(i1));
        }
      }
      return arrayOfInt;
    }
    return (int[][])null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */