package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zx;
import java.awt.Paint;

public class zv
  extends zc
  implements zbu
{
  private zx a;
  private zq b;
  private zj c;
  
  private zv() {}
  
  public zv(zj paramzj, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.c = paramzj;
    this.a = new zx(paramzj, paramInt, new zq(0.0F, 0.0F, Math.min(paramzj.i(), paramFloat3), Math.min(paramzj.h(), paramFloat4)));
    this.a.b(new zi(1.0F, 0.0F, 0.0F, 1.0F, paramFloat1, paramFloat2));
    this.b = new zq(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public zv(zj paramzj, zq paramzq)
  {
    this.c = paramzj;
    this.a = new zx(paramzj, new zq(0.0F, 0.0F, Math.min(paramzj.i(), paramzq.h()), Math.min(paramzj.h(), paramzq.i())));
    this.a.b(new zi(1.0F, 0.0F, 0.0F, 1.0F, paramzq.f(), paramzq.g()));
    this.b = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
  }
  
  protected void a(boolean paramBoolean)
  {
    this.a.h();
  }
  
  public Object e()
  {
    zv localzv = new zv();
    localzv.a = ((zx)this.a.e());
    localzv.c = this.c.a();
    localzv.b = new zq(this.b.f(), this.b.g(), this.b.h(), this.b.i());
    return localzv;
  }
  
  public zj a()
  {
    return this.c;
  }
  
  public int b()
  {
    return this.a.c();
  }
  
  public zq c()
  {
    return new zq(this.b.f(), this.b.g(), this.b.h(), this.b.i());
  }
  
  public zc j()
  {
    return this.a;
  }
  
  public void f()
  {
    h();
  }
  
  public void h()
  {
    a(true);
  }
  
  public Paint g()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */