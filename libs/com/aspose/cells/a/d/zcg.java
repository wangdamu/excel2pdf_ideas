package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zx;

public class zcg
  implements zbw
{
  private long a;
  private int b = 0;
  private Color c = Color.getWhite();
  private Color d = Color.getEmpty();
  private int e = 0;
  private zc f;
  private zj g;
  private int h;
  
  public void a(zdd paramzdd)
    throws Exception
  {
    this.b = paramzdd.n();
    this.c = paramzdd.e();
    this.e = paramzdd.n();
  }
  
  public void b(zdd paramzdd)
    throws Exception
  {
    this.b = 240;
    this.h = 0;
    this.g = ((zj)com.aspose.cells.b.a.zm.a(zj.a(paramzdd.k()), za.class));
  }
  
  public void c(zdd paramzdd)
    throws Exception
  {
    this.b = 240;
    this.h = 0;
    int i = (int)(paramzdd.k().h() - paramzdd.k().i());
    this.g = zcc.a(paramzdd, i);
  }
  
  public void a(zcw paramzcw)
    throws Exception
  {
    this.a = paramzcw.r();
    this.b = ((int)(paramzcw.r() & 0xFFFFFFFF));
    this.c = paramzcw.e();
    this.e = paramzcw.q();
  }
  
  public void b(zcw paramzcw)
    throws Exception
  {
    this.a = paramzcw.r();
    this.b = 240;
    this.h = 0;
    paramzcw.q();
    int i = paramzcw.q();
    int j = paramzcw.q();
    int k = paramzcw.q();
    int m = paramzcw.q();
    try
    {
      paramzcw.k().b(paramzcw.k().i() - 16L - 16L + i);
      this.g = zcc.b(paramzcw, j, m);
    }
    catch (Exception localException) {}
  }
  
  public zc a(zi paramzi)
  {
    switch (this.b)
    {
    case 1: 
      return null;
    case 0: 
      this.f = new zu(this.c);
      break;
    case 2: 
      this.f = new zg(this.e, this.c, this.d);
      break;
    case 240: 
      if (this.g == null) {
        return null;
      }
      this.f = new zx(this.g);
      ((zx)this.f).b(paramzi);
      ((zx)this.f).a(this.h);
      break;
    }
    return this.f;
  }
  
  public int a()
  {
    return 1;
  }
  
  public long b()
  {
    return this.a;
  }
  
  public void a(long paramLong)
  {
    this.a = paramLong;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void a(Color paramColor)
  {
    this.c = paramColor;
  }
  
  public void b(Color paramColor)
  {
    this.d = paramColor;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zcg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */