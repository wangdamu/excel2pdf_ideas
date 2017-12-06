package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.a.zd;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zm;
import com.aspose.cells.b.a.zj;

public class zs
  implements zj
{
  private zm a;
  private zd b = null;
  private zd c = null;
  private zc d;
  
  private zs() {}
  
  public zs(Color paramColor)
  {
    this(paramColor, 1.0F);
  }
  
  public zs(Color paramColor, float paramFloat)
  {
    this.a = new zm(paramColor, paramFloat);
  }
  
  public zs(zc paramzc)
  {
    this(paramzc, 1.0F);
  }
  
  public zs(zc paramzc, float paramFloat)
  {
    zc localzc = paramzc;
    if ((paramzc instanceof zbu)) {
      localzc = ((zbu)paramzc).j();
    }
    this.a = new zm(localzc, paramFloat);
    a(paramzc);
  }
  
  public zc a()
  {
    return this.d;
  }
  
  public void a(zc paramzc)
  {
    this.d = paramzc;
  }
  
  public zc b()
  {
    return this.a.b();
  }
  
  public Color c()
  {
    return this.a.c();
  }
  
  public float[] d()
  {
    return this.a.l();
  }
  
  public void a(float[] paramArrayOfFloat)
  {
    this.a.b(paramArrayOfFloat);
  }
  
  public zd e()
  {
    return this.b;
  }
  
  public void a(zd paramzd)
  {
    this.b = paramzd;
    this.a.b(paramzd);
  }
  
  public zd f()
  {
    return this.c;
  }
  
  public void b(zd paramzd)
  {
    this.c = paramzd;
    this.a.a(paramzd);
  }
  
  public int g()
  {
    return this.a.d();
  }
  
  public void a(int paramInt)
  {
    this.a.a(paramInt);
  }
  
  public float h()
  {
    return this.a.e();
  }
  
  public void a(float paramFloat)
  {
    this.a.a(paramFloat);
  }
  
  public float[] i()
  {
    return this.a.f();
  }
  
  public void b(float[] paramArrayOfFloat)
  {
    this.a.a(paramArrayOfFloat);
  }
  
  public int j()
  {
    return this.a.g();
  }
  
  public void b(int paramInt)
  {
    this.a.b(paramInt);
  }
  
  public int k()
  {
    return this.a.i();
  }
  
  public void c(int paramInt)
  {
    this.a.d(paramInt);
  }
  
  public int l()
  {
    return this.a.j();
  }
  
  public void d(int paramInt)
  {
    this.a.e(paramInt);
  }
  
  public float m()
  {
    return this.a.k();
  }
  
  public int n()
  {
    return this.a.m();
  }
  
  public int o()
  {
    return this.a.h();
  }
  
  public void e(int paramInt)
  {
    this.a.c(paramInt);
  }
  
  public float p()
  {
    return this.a.n();
  }
  
  public void b(float paramFloat)
  {
    this.a.b(paramFloat);
  }
  
  public Object q()
  {
    zs localzs = new zs();
    localzs.a = ((zm)this.a.o());
    if (this.c != null) {
      localzs.c = ((zd)this.c.f());
    }
    if (this.b != null) {
      localzs.b = ((zd)this.b.f());
    }
    return localzs;
  }
  
  private void a(boolean paramBoolean)
  {
    this.a.a();
  }
  
  public void dispose()
  {
    a(true);
  }
  
  public zm r()
  {
    return this.a;
  }
  
  public void s()
  {
    dispose();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */