package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zx;

public class zfz
  extends zfl
{
  private zex d;
  private zi f;
  
  public zfz(zdz paramzdz, zx paramzx)
    throws Exception
  {
    super(paramzdz);
    this.d = new zdv((za)paramzx.a(), paramzdz.b().u());
    this.f = paramzx.b();
  }
  
  public zfz(zdz paramzdz, zg paramzg)
    throws Exception
  {
    super(paramzdz);
    this.d = new zev(paramzg);
  }
  
  public void b(zez paramzez)
    throws Exception
  {
    super.b(paramzez);
    paramzez.a("/PaintType", 1);
    paramzez.a("/TilingType", 2);
    paramzez.a("/BBox", new zq(0.0F, 0.0F, this.d.b(), this.d.c()));
    paramzez.a("/XStep", this.d.b());
    paramzez.a("/YStep", this.d.c());
    paramzez.a("/Resources");
    paramzez.g();
    this.a.a(paramzez);
    paramzez.h();
    c(paramzez);
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    int i = this.e.b().c();
    this.e.b().b(0);
    this.b.a(this.d, zo.a(), new zt(this.d.b(), this.d.c()));
    super.a(paramzez);
    this.a.b(paramzez);
    this.e.b().b(i);
  }
  
  protected int c()
  {
    return 1;
  }
  
  protected zi d()
  {
    return this.f;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */