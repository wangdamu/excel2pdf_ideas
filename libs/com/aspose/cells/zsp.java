package com.aspose.cells;

import com.aspose.cells.b.a.zg;

class zsp
  implements zahz
{
  private zjx a;
  private String b = "";
  private int c = 0;
  private int d;
  private int e;
  private int f;
  private boolean g = false;
  private boolean h;
  private int i = 0;
  private boolean j = false;
  private boolean k = false;
  private int l = 0;
  private boolean m = false;
  
  boolean a()
  {
    return this.h;
  }
  
  void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  zsp(zje paramzje, Object paramObject, int paramInt)
  {
    this.a = new zjx(paramzje, paramObject, paramInt);
    this.d = 0;
    this.a.d().a(0);
    this.e = 1;
    this.f = 1;
    this.h = true;
  }
  
  zjx b()
  {
    return this.a;
  }
  
  public zahm c()
  {
    return this.a;
  }
  
  public int d()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int e()
  {
    return this.i;
  }
  
  public void b(int paramInt)
  {
    a(-11);
    this.i = paramInt;
  }
  
  public double f()
  {
    if (d() != -11) {
      return d();
    }
    return -Math.log10(e());
  }
  
  public String g()
  {
    if (!"".equals(this.b)) {
      return this.b;
    }
    switch (this.c)
    {
    case 0: 
      return "None";
    case -2: 
      return "Hundrends";
    case -8: 
      return "x 100000000";
    case -5: 
      return "x 100000";
    case -7: 
      return "x 10000000";
    case -4: 
      return "x 10000";
    case -3: 
      return "Thousands";
    case -6: 
      return "Millions";
    case -9: 
      return "Billions";
    case -12: 
      return "Trillions";
    case -11: 
      return "x " + e();
    }
    return "None";
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public int h()
  {
    return this.d;
  }
  
  public void c(int paramInt)
  {
    this.d = paramInt;
    a(false);
  }
  
  public int i()
  {
    return this.e;
  }
  
  public void d(int paramInt)
  {
    this.e = paramInt;
  }
  
  public int j()
  {
    return this.f;
  }
  
  public void e(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void b(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public void c(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public int k()
  {
    return this.l;
  }
  
  public void f(int paramInt)
  {
    this.l = paramInt;
  }
  
  public boolean l()
  {
    return this.g;
  }
  
  public void d(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  protected void finalize()
    throws Exception
  {
    e(false);
  }
  
  public void dispose()
  {
    e(true);
    zg.a(this);
  }
  
  protected void e(boolean paramBoolean)
  {
    if (!this.m)
    {
      if ((paramBoolean) && (this.a != null)) {
        this.a.dispose();
      }
      this.m = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */