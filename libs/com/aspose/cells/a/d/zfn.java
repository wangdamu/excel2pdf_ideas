package com.aspose.cells.a.d;

public class zfn
  extends zf
{
  private zec g;
  private int h = Integer.MAX_VALUE;
  private int i = 0;
  
  public zfn(zhb paramzhb, com.aspose.cells.b.a.d.zm paramzm, zff paramzff)
    throws Exception
  {
    super(paramzhb);
    this.g = new zec(paramzm, paramzff);
  }
  
  public zfn(zhb paramzhb, com.aspose.cells.b.a.d.zm paramzm, zff paramzff, int paramInt)
    throws Exception
  {
    this(paramzhb, paramzm, paramzff);
    this.i = paramInt;
  }
  
  public void a(zn paramzn)
    throws Exception
  {
    paramzn.a(this);
  }
  
  public void a()
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.a();
  }
  
  public void a(zo paramzo)
    throws Exception
  {
    this.h = paramzo.b();
    if (this.h < this.i) {
      return;
    }
    this.g.a(paramzo.a());
  }
  
  public void b(zo paramzo)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.b();
  }
  
  public void a(zb paramzb)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.d().a(paramzb);
  }
  
  public void b(zb paramzb)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.d().b(paramzb);
  }
  
  public void a(zh paramzh)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.d().a(paramzh);
  }
  
  public void a(zp paramzp)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.d().a(paramzp);
  }
  
  public void b(zp paramzp)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.d().b(paramzp);
  }
  
  public void a(zq paramzq)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.d().a(paramzq);
  }
  
  public void b(zq paramzq)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.d().b(paramzq);
  }
  
  public void a(zu paramzu)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.d().a(paramzu);
  }
  
  public void a(zt paramzt)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.d().a(paramzt);
  }
  
  public void a(za paramza)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.d().a(paramza);
  }
  
  public void a(zk paramzk)
  {
    if (this.h < this.i) {
      return;
    }
    this.g.d().a(paramzk);
  }
  
  public void a(zl paramzl)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    if (paramzl.g() != null) {
      a(paramzl.g());
    }
    switch (paramzl.e())
    {
    case 0: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
      int j = this.g.c().q();
      if (j > 0) {
        try
        {
          com.aspose.cells.b.a.b.za localza1 = new com.aspose.cells.b.a.b.za(new com.aspose.cells.b.a.d.zh(paramzl.d()));
          double d1 = zao.d(paramzl.c().b());
          double d2 = zao.d(paramzl.c().c());
          double d3 = localza1.i() / d1;
          double d4 = localza1.h() / d2;
          this.g.c().b(4);
          if ((d3 > j) && (d4 > j))
          {
            int k = (int)(d2 * j);
            int m = (int)(d2 * j);
            com.aspose.cells.b.a.b.za localza2 = new com.aspose.cells.b.a.b.za(localza1, k, m);
            com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
            localza2.a(localzh, localza1.e());
            localza2.d();
            paramzl.a(localzh.o());
            localzh.a();
          }
          localza1.d();
        }
        catch (Exception localException) {}
      }
      this.g.d().a(paramzl);
      break;
    case 1: 
    case 2: 
      zb localzb = zcy.a(paramzl, b());
      localzb.a(paramzl.g());
      localzb.a(this);
      break;
    case 3: 
    default: 
      if (!f) {
        throw new AssertionError();
      }
      break;
    }
  }
  
  public void a(zm paramzm)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.d().a(paramzm);
  }
  
  public zec d()
  {
    return this.g;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */