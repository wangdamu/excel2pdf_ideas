package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zx;
import com.aspose.cells.b.a.zm;
import com.aspose.cells.b.a.zs;

public abstract class zfl
  extends zfu
{
  protected zfp a;
  protected zeu b;
  private zi d;
  
  public zfl(zdz paramzdz)
    throws Exception
  {
    super(paramzdz, false);
    this.a = new zfp(paramzdz);
    this.b = new zeu(this.e, this.a, this);
    this.d = this.e.j().b().b().b();
  }
  
  public void b(zez paramzez)
    throws Exception
  {
    paramzez.a("/Type", "/Pattern");
    paramzez.a("/PatternType", c());
  }
  
  public static zfl a(zc paramzc, zdz paramzdz)
    throws Exception
  {
    zx localzx = (zx)zm.a(paramzc, zx.class);
    if (localzx != null) {
      return new zfz(paramzdz, localzx);
    }
    zg localzg = (zg)zm.a(paramzc, zg.class);
    if (localzg != null) {
      return new zfz(paramzdz, localzg);
    }
    return null;
  }
  
  protected void c(zez paramzez)
    throws Exception
  {
    zi localzi;
    if (d() == null)
    {
      float f = (float)zao.c(1.0D);
      localzi = new zi(f, 0.0F, 0.0F, f, 0.0F, 0.0F);
    }
    else
    {
      localzi = d().b();
      localzi.a(this.d, 1);
    }
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("/Matrix");
    zgd.a(localzi.d(), localStringBuilder);
    paramzez.a(zs.a(localStringBuilder));
  }
  
  protected abstract int c();
  
  protected abstract zi d();
  
  public int e_()
  {
    return 2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */