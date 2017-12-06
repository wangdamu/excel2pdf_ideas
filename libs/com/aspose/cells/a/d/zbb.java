package com.aspose.cells.a.d;

public class zbb
{
  public long a;
  public long b;
  public long c;
  public long d;
  public int e;
  public int f;
  public short g;
  public short h;
  public short i;
  public short j;
  public int k;
  public int l;
  public short m;
  public short n;
  public short o;
  
  public zbb(zz paramzz)
    throws Exception
  {
    this.a = paramzz.c();
    if ((this.a & 0xFFFFFFFF) != 65536L) {
      throw new UnsupportedOperationException("Unsupported font head version.");
    }
    this.b = paramzz.c();
    this.c = paramzz.c();
    this.d = paramzz.c();
    if ((this.d & 0xFFFFFFFF) != 1594834165L) {
      throw new UnsupportedOperationException("Unsupported font head magic number.");
    }
    this.e = paramzz.e();
    this.f = paramzz.e();
    paramzz.b();
    paramzz.b();
    paramzz.b();
    paramzz.b();
    this.g = paramzz.d();
    this.h = paramzz.d();
    this.i = paramzz.d();
    this.j = paramzz.d();
    this.k = paramzz.e();
    this.l = paramzz.e();
    this.m = paramzz.d();
    this.n = paramzz.d();
    this.o = paramzz.d();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */