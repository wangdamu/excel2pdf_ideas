package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zw;

public abstract class zep
  extends zey
{
  protected String a;
  protected int b;
  public zgs c;
  protected String d = null;
  
  protected zep(zdz paramzdz, String paramString, int paramInt, boolean paramBoolean)
    throws Exception
  {
    super(paramzdz);
    this.a = paramString;
    this.b = paramInt;
    this.c = zav.a().b(paramString, paramInt, false);
    if (this.c == null) {
      throw new Exception(paramString + ze.e(Integer.valueOf(paramInt)));
    }
  }
  
  protected String b()
  {
    String str = this.c.c();
    if (str == null) {
      str = this.c.b();
    }
    return zw.a(str, " ", "#20");
  }
  
  public void a(zm paramzm)
    throws Exception
  {}
  
  public static zep a(zdz paramzdz, String paramString, int paramInt, boolean paramBoolean)
    throws Exception
  {
    if (paramBoolean) {
      return new zgc(paramzdz, paramString, paramInt);
    }
    return new zga(paramzdz, paramString, paramInt);
  }
  
  protected abstract void c()
    throws Exception;
  
  protected int a(int paramInt)
  {
    return (int)(paramInt * 1000.0F / this.c.g() + 0.5F);
  }
  
  public boolean d()
  {
    return ((this.b & 0x2) != 0) && ((this.c.f() & 0x2) == 0);
  }
  
  public boolean e()
  {
    return ((this.b & 0x1) != 0) && ((this.c.f() & 0x1) == 0);
  }
  
  public String f()
    throws Exception
  {
    if (this.d == null) {
      c();
    }
    return this.d;
  }
  
  public int g()
  {
    return -a(this.c.i());
  }
  
  public int h()
  {
    return a(this.c.h());
  }
  
  public int i()
  {
    return a(this.c.q());
  }
  
  public int j()
  {
    int i = 0;
    i |= 0x20;
    i |= ((this.c.f() & 0x2) != 0 ? 64 : 0);
    i |= ((this.c.f() & 0x1) != 0 ? 262144 : 0);
    return i;
  }
  
  public zq k()
  {
    return new zq(a(this.c.l()), a(this.c.n()), a(this.c.o() - this.c.l()), a(this.c.p() - this.c.n()));
  }
  
  public float l()
  {
    return this.c.r();
  }
  
  public int e_()
  {
    return 1;
  }
  
  public abstract boolean m();
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */