package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.Stack;

public class zcs
{
  private zas a;
  private zbf b;
  private Stack c;
  private zbg d;
  private zq e;
  private zo f;
  
  public zcs(zas paramzas)
    throws Exception
  {
    this.a = paramzas;
    this.b = new zbf(this);
    this.e = zbe.a();
    this.c = new Stack();
    if (this.a.c())
    {
      this.d = new zbg(true);
      i();
    }
    else
    {
      this.d = new zbg(false);
      j();
    }
  }
  
  public void a()
  {
    this.c.push(this.e);
    this.e = new zq(this.e.f(), this.e.g(), this.e.h(), this.e.i());
    this.c.push(this.b);
    this.b = this.b.a();
  }
  
  public void b()
  {
    this.b = ((zbf)this.c.pop());
    this.e = ((zq)this.c.pop());
  }
  
  public void a(zo paramzo)
  {
    this.e.a(paramzo);
  }
  
  public void a(zt paramzt)
  {
    this.e.a(paramzt);
  }
  
  public zas c()
  {
    return this.a;
  }
  
  public zbf d()
  {
    return this.b;
  }
  
  public zq e()
  {
    return this.e;
  }
  
  public void a(zq paramzq)
  {
    this.e = paramzq;
  }
  
  public zo f()
  {
    return this.f;
  }
  
  public void b(zo paramzo)
  {
    this.f = paramzo;
  }
  
  public zbg g()
  {
    return this.d;
  }
  
  private void a(Color paramColor)
    throws Exception
  {
    zcg localzcg = new zcg();
    if (paramColor.isEmpty()) {
      localzcg.a(1);
    } else {
      localzcg.a(paramColor);
    }
    this.d.a(localzcg);
  }
  
  private void b(Color paramColor)
    throws Exception
  {
    zck localzck = new zck();
    if (paramColor.isEmpty()) {
      localzck.a(5);
    } else {
      localzck.b(paramColor);
    }
    this.d.a(localzck);
  }
  
  private void a(String paramString)
    throws Exception
  {
    zci localzci = new zci();
    localzci.a(paramString);
    this.d.a(localzci);
  }
  
  private void h()
    throws Exception
  {
    zch localzch = new zch();
    this.d.a(localzch);
  }
  
  private void i()
    throws Exception
  {
    a(Color.getWhite());
    a(Color.getBlack());
    a(Color.fromArgb(128, 128, 128));
    a(Color.fromArgb(64, 64, 64));
    a(Color.getBlack());
    a(Color.getEmpty());
    b(Color.getWhite());
    b(Color.getBlack());
    b(Color.getEmpty());
    b(Color.getEmpty());
    a("MS Sans Serif");
    a("Courier");
    a("MS Sans Serif");
    a("Tahoma");
    a("MS Sans Serif");
    this.d.a(new zcj());
    a("MS Sans Serif");
    a("MS Sans Serif");
    h();
    h();
  }
  
  private void j()
    throws Exception
  {
    for (long l = 0L; (l & 0xFFFFFFFF) < this.a.m(); l += 1L) {
      this.d.a(null);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */