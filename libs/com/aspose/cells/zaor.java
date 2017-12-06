package com.aspose.cells;

import com.aspose.cells.b.a.zg;

class zaor
  implements zair
{
  private zay a;
  private zanq b;
  private Color c = Color.getEmpty();
  private Color d = Color.getEmpty();
  private int e;
  private int f = 0;
  private int g = 1;
  private Object h;
  private boolean i = false;
  
  zaor(zje paramzje, Object paramObject)
  {
    this.h = paramObject;
    float f1;
    if (paramzje.ar() == null) {
      f1 = 96.0F;
    } else {
      f1 = paramzje.ar().f();
    }
    this.e = ((int)(5.0F * f1 / 72.0F + 0.5F));
    this.a = new zay(paramzje);
    this.b = new zanq(paramzje);
  }
  
  zay e()
  {
    return this.a;
  }
  
  public zagu a()
  {
    return this.a;
  }
  
  zanq f()
  {
    return this.b;
  }
  
  public zaip b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.e;
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public int d()
  {
    if (this.g == 0) {
      return 1;
    }
    return this.f;
  }
  
  public void b(int paramInt)
  {
    this.f = paramInt;
  }
  
  public boolean g()
  {
    return d() != 1;
  }
  
  public boolean a(zaor paramzaor)
  {
    if ((g() == paramzaor.g()) && (g()))
    {
      if (d() != paramzaor.d()) {
        return false;
      }
      if (!this.a.a(paramzaor.e())) {
        return false;
      }
      if (!this.b.a(paramzaor.f())) {
        return false;
      }
      if (d() != paramzaor.d()) {
        return false;
      }
      if (c() != paramzaor.c()) {
        return false;
      }
    }
    return true;
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
    if (!this.i)
    {
      if ((paramBoolean) && (this.a != null)) {
        this.a.dispose();
      }
      this.i = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */