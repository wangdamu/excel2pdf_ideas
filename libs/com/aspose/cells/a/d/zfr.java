package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

public class zfr
  extends zey
{
  private zi b;
  private zq c;
  public zer a;
  
  public zfr(zdz paramzdz, zi paramzi)
  {
    super(paramzdz);
    this.b = paramzi;
    this.a = new zer(paramzdz, paramzi.b(), paramzi.a());
    this.c = new zq(paramzi.d().d(), paramzi.d().e(), paramzi.c().d() - paramzi.d().d(), paramzi.c().e() - paramzi.d().e());
  }
  
  public int e_()
  {
    return 5;
  }
  
  public void b(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    paramzez.a("/ShadingType", 2);
    paramzez.a("/Coords", this.c);
    paramzez.a("/ColorSpace", "/DeviceRGB");
    paramzez.a("/Function", this.a.o());
    paramzez.h();
    paramzez.b();
    this.a.a(paramzez);
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    b(paramzez);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */