package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zh;

public class zbr
{
  public long a;
  public short b;
  public short c;
  public short d;
  public int e;
  public short f;
  public short g;
  public short h;
  public short i;
  public short j;
  public short k;
  public short l;
  public short m;
  public short n;
  public short o;
  public short p;
  public int q;
  
  public zbr(zz paramzz)
    throws Exception
  {
    this.a = paramzz.c();
    if ((this.a & 0xFFFFFFFF) != 65536L) {
      throw new UnsupportedOperationException("Unsupported font head version.");
    }
    this.b = paramzz.d();
    this.c = paramzz.d();
    this.d = paramzz.d();
    this.e = paramzz.e();
    this.f = paramzz.d();
    this.g = paramzz.d();
    this.h = paramzz.d();
    this.i = paramzz.d();
    this.j = paramzz.d();
    this.k = paramzz.d();
    this.l = paramzz.d();
    this.m = paramzz.d();
    this.n = paramzz.d();
    this.o = paramzz.d();
    this.p = paramzz.d();
    this.q = paramzz.e();
  }
  
  public void a(zaa paramzaa)
    throws Exception
  {
    paramzaa.a(this.a);
    paramzaa.b(this.b);
    paramzaa.b(this.c);
    paramzaa.b(this.d);
    paramzaa.c(this.e);
    paramzaa.b(this.f);
    paramzaa.b(this.g);
    paramzaa.b(this.h);
    paramzaa.b(this.i);
    paramzaa.b(this.j);
    paramzaa.b(this.k);
    paramzaa.b(this.l);
    paramzaa.b(this.m);
    paramzaa.b(this.n);
    paramzaa.b(this.o);
    paramzaa.b(this.p);
    paramzaa.c(this.q);
  }
  
  public zh a()
    throws Exception
  {
    zh localzh = new zh();
    zaa localzaa = new zaa(localzh);
    a(localzaa);
    localzaa.b();
    return localzh;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zbr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */