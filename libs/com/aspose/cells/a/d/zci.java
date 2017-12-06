package com.aspose.cells.a.d;

import com.aspose.cells.Encoding;
import com.aspose.cells.b.a.zw;

public class zci
  implements zbw
{
  private long a;
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private boolean f = false;
  private boolean g = false;
  private boolean h = false;
  private String i = "Microsoft Sans Serif";
  private int j;
  
  public void a(zdd paramzdd)
    throws Exception
  {
    this.c = paramzdd.n();
    paramzdd.n();
    this.d = paramzdd.n();
    paramzdd.n();
    this.e = paramzdd.n();
    this.f = paramzdd.o();
    this.g = paramzdd.o();
    this.h = paramzdd.o();
    this.j = (paramzdd.m() & 0xFF);
    paramzdd.m();
    paramzdd.m();
    paramzdd.m();
    paramzdd.m();
    this.i = paramzdd.a(32, f()).trim();
  }
  
  public void a(zcw paramzcw)
    throws Exception
  {
    this.a = paramzcw.r();
    this.c = paramzcw.q();
    paramzcw.q();
    this.d = paramzcw.q();
    paramzcw.q();
    this.e = paramzcw.q();
    this.f = paramzcw.o();
    this.g = paramzcw.o();
    this.h = paramzcw.o();
    this.j = (paramzcw.m() & 0xFF);
    paramzcw.m();
    paramzcw.m();
    paramzcw.m();
    paramzcw.m();
    this.i = zw.b(paramzcw.b(32).trim(), '\000');
  }
  
  public zbj c()
    throws Exception
  {
    return zbj.a(this.i, h(), d());
  }
  
  public int d()
  {
    if (this.b != 0) {
      return this.b;
    }
    if (this.e >= 700) {
      this.b |= 0x1;
    }
    if (this.f) {
      this.b |= 0x2;
    }
    if (this.g) {
      this.b |= 0x4;
    }
    if (this.h) {
      this.b |= 0x8;
    }
    return this.b;
  }
  
  private float h()
  {
    if (this.c != 0) {
      return Math.abs(this.c);
    }
    return 12.0F;
  }
  
  public int a()
  {
    return 6;
  }
  
  public long b()
  {
    return this.a;
  }
  
  public void a(long paramLong)
  {
    this.a = paramLong;
  }
  
  public float e()
  {
    return this.d / 10.0F;
  }
  
  public void a(String paramString)
  {
    this.i = paramString;
  }
  
  public Encoding f()
  {
    int k = zan.a(g(), 1252);
    return Encoding.getEncoding(k);
  }
  
  public int g()
  {
    return this.j;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */