package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zu;

class zxg
  implements zaib
{
  private zagu a;
  private com.aspose.cells.b.a.b.a.zg b = null;
  private zbwl c;
  private zado d;
  private zaml e;
  private zaml f;
  private boolean g = false;
  
  zxg(zagu paramzagu)
  {
    this.a = paramzagu;
    this.d = new zado();
    this.c = new zbwl();
  }
  
  com.aspose.cells.b.a.b.a.zg a()
  {
    return this.b;
  }
  
  public zaml b()
  {
    return this.e;
  }
  
  public void a(zaml paramzaml)
  {
    this.e = paramzaml;
  }
  
  public zaml c()
  {
    return this.f;
  }
  
  public void b(zaml paramzaml)
  {
    this.f = paramzaml;
  }
  
  zado d()
  {
    return this.d;
  }
  
  zbwl e()
  {
    return this.c;
  }
  
  public zaih f()
  {
    return this.d;
  }
  
  public zajp g()
  {
    return this.c;
  }
  
  public void a(Color paramColor1, Color paramColor2, int paramInt)
  {
    this.a.a(5);
    this.b = new com.aspose.cells.b.a.b.a.zg(paramInt, paramColor1, paramColor2);
  }
  
  int h()
  {
    return this.a.h();
  }
  
  public zc a(ze paramze, boolean paramBoolean, float paramFloat)
    throws Exception
  {
    switch (h())
    {
    case 3: 
      return d().a(paramze, null, paramBoolean, paramFloat);
    case 5: 
      Color localColor1 = Color.fromArgb(this.b.c().getA() & 0xFF, (int)((this.b.c().getR() & 0xFF) * paramFloat), (int)((this.b.c().getG() & 0xFF) * paramFloat), (int)((this.b.c().getB() & 0xFF) * paramFloat));
      Color localColor2 = Color.fromArgb(this.b.b().getA() & 0xFF, (int)((this.b.b().getR() & 0xFF) * paramFloat), (int)((this.b.b().getG() & 0xFF) * paramFloat), (int)((this.b.b().getB() & 0xFF) * paramFloat));
      return new com.aspose.cells.b.a.b.a.zg(this.b.d(), localColor1, localColor2);
    case 4: 
      return this.c.a(paramze, paramFloat);
    }
    return new zu(Color.getWhite());
  }
  
  public void a(zc paramzc)
  {
    switch (h())
    {
    case 3: 
    case 5: 
      paramzc.h();
      break;
    case 4: 
      paramzc.h();
      break;
    }
  }
  
  public boolean a(zxg paramzxg)
  {
    if (paramzxg == null) {
      return false;
    }
    if (h() != paramzxg.h()) {
      return false;
    }
    if (h() == 3) {
      return d().a(paramzxg.d());
    }
    if (h() == 5)
    {
      if (a().d() != paramzxg.a().d()) {
        return false;
      }
      if ((a().b().getA() != paramzxg.a().b().getA()) || (a().b().getR() != paramzxg.a().b().getR()) || (a().b().getG() != paramzxg.a().b().getB()) || (a().b().getB() != paramzxg.a().b().getB())) {
        return false;
      }
      return (a().c().getA() == paramzxg.a().c().getA()) && (a().c().getR() == paramzxg.a().c().getR()) && (a().c().getG() == paramzxg.a().c().getB()) && (a().c().getB() == paramzxg.a().c().getB());
    }
    if (h() == 4) {
      return e().a(paramzxg.e());
    }
    return false;
  }
  
  void b(zxg paramzxg)
  {
    this.b = paramzxg.b;
    this.c = paramzxg.c;
    this.d.b(paramzxg.d);
    this.e = paramzxg.e;
    b(paramzxg.f);
  }
  
  protected void finalize()
    throws Exception
  {
    a(false);
  }
  
  public void dispose()
  {
    a(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void a(boolean paramBoolean)
  {
    if (!this.g)
    {
      if ((paramBoolean) && (this.c != null)) {
        this.c.dispose();
      }
      this.g = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */