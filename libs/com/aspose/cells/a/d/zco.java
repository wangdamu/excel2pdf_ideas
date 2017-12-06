package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zh;

public class zco
{
  public long a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k;
  public int l;
  public int m;
  public int n;
  public int o;
  
  public zco(zz paramzz)
    throws Exception
  {
    this.a = paramzz.c();
    this.b = paramzz.e();
    if ((this.a & 0xFFFFFFFF) == 20480L) {
      return;
    }
    if ((this.a & 0xFFFFFFFF) != 65536L) {
      throw new UnsupportedOperationException("Unsupported maximum profile version.");
    }
    this.c = paramzz.e();
    this.d = paramzz.e();
    this.e = paramzz.e();
    this.f = paramzz.e();
    this.g = paramzz.e();
    this.h = paramzz.e();
    this.i = paramzz.e();
    this.j = paramzz.e();
    this.k = paramzz.e();
    this.l = paramzz.e();
    this.m = paramzz.e();
    this.n = paramzz.e();
    this.o = paramzz.e();
  }
  
  public void a(zaa paramzaa)
    throws Exception
  {
    paramzaa.a(this.a);
    paramzaa.c(this.b);
    if ((this.a & 0xFFFFFFFF) == 20480L) {
      return;
    }
    paramzaa.c(this.c);
    paramzaa.c(this.d);
    paramzaa.c(this.e);
    paramzaa.c(this.f);
    paramzaa.c(this.g);
    paramzaa.c(this.h);
    paramzaa.c(this.i);
    paramzaa.c(this.j);
    paramzaa.c(this.k);
    paramzaa.c(this.l);
    paramzaa.c(this.m);
    paramzaa.c(this.n);
    paramzaa.c(this.o);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */