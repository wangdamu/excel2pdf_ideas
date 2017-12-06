package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.zs;

public class zew
  extends zgf
{
  private zex b;
  private zfu d;
  private boolean f;
  private zft g;
  
  public zew(zdz paramzdz, zex paramzex)
    throws Exception
  {
    this(paramzdz, paramzex, false);
  }
  
  public zew(zdz paramzdz, zex paramzex, boolean paramBoolean)
    throws Exception
  {
    super(paramzdz);
    this.b = paramzex;
    this.f = paramBoolean;
  }
  
  public void b(zez paramzez)
    throws Exception
  {
    paramzez.a("/Type", "/XObject");
    paramzez.a("/Subtype", "/Image");
    paramzez.a("/Width", this.b.b());
    paramzez.a("/Height", this.b.c());
    c(paramzez);
    paramzez.a("/BitsPerComponent", h());
    if ((this.b.f()) && (!this.e.b().u()))
    {
      this.g = new zft(this.e, this.b.l(), this.b.b(), this.b.c());
      paramzez.a("/SMask", this.g.o());
    }
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    if (i())
    {
      c();
    }
    else
    {
      byte[] arrayOfByte = this.f ? this.b.l() : this.b.k();
      a(arrayOfByte, 0, arrayOfByte.length);
    }
    this.b.n();
    super.a(paramzez);
    if (this.d != null) {
      this.d.a(paramzez);
    }
    if (this.g != null) {
      this.g.a(paramzez);
    }
  }
  
  private void c(zez paramzez)
    throws Exception
  {
    zdy localzdy = g();
    if (localzdy != zdy.c())
    {
      paramzez.a("/ColorSpace", "/" + localzdy.e());
    }
    else
    {
      d();
      StringBuilder localStringBuilder = new StringBuilder(32);
      localStringBuilder.append("[/");
      localStringBuilder.append(localzdy.e());
      localStringBuilder.append("/DeviceRGB ");
      localStringBuilder.append(this.b.m().length - 1);
      localStringBuilder.append(" ");
      localStringBuilder.append(this.d.o());
      localStringBuilder.append("]");
      paramzez.a("/ColorSpace", zs.a(localStringBuilder));
    }
  }
  
  private void c()
    throws Exception
  {
    switch (this.e.b().c())
    {
    case 4: 
      zbz.a(this.b.a(), e(), this.e.b().d());
      break;
    case 5: 
      zbz.a(this.b.a(), e(), 3, false);
      break;
    case 6: 
      zbz.a(this.b.a(), e(), 4, false);
      break;
    default: 
      throw new Exception("Unknown image compression.");
    }
  }
  
  private void d()
    throws Exception
  {
    this.d = new zfu(this.e);
    for (int i = 0; i < this.b.m().length; i++)
    {
      this.d.a(this.b.m()[i].getR());
      this.d.a(this.b.m()[i].getG());
      this.d.a(this.b.m()[i].getB());
    }
  }
  
  public static void a(zfu paramzfu, zex paramzex)
    throws Exception
  {
    paramzfu.c("BI");
    paramzfu.a("/W " + paramzex.b());
    paramzfu.a("/H " + paramzex.c());
    if ((!a) && (paramzex.e() == zdy.c())) {
      throw new AssertionError();
    }
    paramzfu.a("/CS/" + paramzex.e().f());
    paramzfu.c("/BPC " + paramzex.d());
    paramzfu.a("ID ");
    paramzfu.a(paramzex.k(), 0, paramzex.k().length);
    paramzfu.a("\r\n");
    paramzfu.c("EI");
  }
  
  private zdy g()
  {
    if (this.f) {
      return zdy.a();
    }
    if (this.e.b().h() == 6) {
      return zdy.a();
    }
    if (i()) {
      return zdy.b();
    }
    return this.b.e();
  }
  
  private int h()
    throws Exception
  {
    if (this.f) {
      return 8;
    }
    if (this.e.b().h() == 6) {
      return 1;
    }
    return this.b.d();
  }
  
  protected boolean b()
  {
    return true;
  }
  
  private boolean i()
  {
    return (!this.f) && (this.e.b().f()) && (this.b.a() != null);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */