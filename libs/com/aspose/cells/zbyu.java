package com.aspose.cells;

import com.aspose.cells.b.a.zg;
import java.util.ArrayList;

class zbyu
  implements zajv
{
  private zje b;
  private zay c;
  private zanq d;
  private float e;
  private float f;
  private float g;
  private float h;
  private float i;
  ArrayList a = new ArrayList();
  private boolean j = false;
  
  zbyu(zje paramzje)
  {
    this.b = paramzje;
    this.d = new zanq(paramzje);
    this.c = new zay(paramzje);
    b().a(1);
    b().b(Color.getWhite());
    a().a(1);
    a().a(Color.getBlack());
  }
  
  zanq c()
  {
    return this.d;
  }
  
  public zaip a()
  {
    return this.d;
  }
  
  zay d()
  {
    return this.c;
  }
  
  public zagu b()
  {
    return this.c;
  }
  
  float e()
  {
    return this.e;
  }
  
  void a(float paramFloat)
  {
    this.e = paramFloat;
  }
  
  float f()
  {
    return this.f;
  }
  
  void b(float paramFloat)
  {
    this.f = paramFloat;
  }
  
  float g()
  {
    return this.g;
  }
  
  void c(float paramFloat)
  {
    this.g = paramFloat;
  }
  
  float h()
  {
    return this.h;
  }
  
  void d(float paramFloat)
  {
    this.h = paramFloat;
  }
  
  float i()
  {
    return this.i;
  }
  
  void e(float paramFloat)
  {
    this.i = paramFloat;
  }
  
  float j()
  {
    return e() + g() / 2.0F;
  }
  
  float a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    float f1 = this.b.o() / 100.0F;
    float f2 = 0.0F;
    if (paramBoolean) {
      f2 = i() / paramInt1;
    } else {
      f2 = g() / paramInt1;
    }
    float f3 = f2 / (paramInt2 + f1);
    return f3;
  }
  
  float k()
  {
    float f1 = this.b.n() / 100.0F;
    float f2 = h() / (1.0F + f1);
    return f2;
  }
  
  protected void finalize()
    throws Exception
  {
    a(false);
  }
  
  public void dispose()
  {
    a(true);
    zg.a(this);
  }
  
  protected void a(boolean paramBoolean)
  {
    if (!this.j)
    {
      if ((paramBoolean) && (this.c != null)) {
        this.c.dispose();
      }
      this.j = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */