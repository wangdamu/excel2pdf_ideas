package com.aspose.cells;

public class ShadowEffect
{
  zw a;
  ztf b;
  
  void a(ShadowEffect paramShadowEffect, CopyOptions paramCopyOptions)
  {
    a(paramShadowEffect.a());
    if (this.a != null) {
      this.a.a(paramShadowEffect.a, paramCopyOptions);
    }
  }
  
  boolean a(ShadowEffect paramShadowEffect)
  {
    if (a() != paramShadowEffect.a()) {
      return false;
    }
    if (this.a == null) {
      return true;
    }
    return this.a.a(paramShadowEffect.a);
  }
  
  int a()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.a();
  }
  
  void a(int paramInt)
  {
    if (paramInt == a()) {
      return;
    }
    switch (paramInt)
    {
    case 0: 
      this.a = null;
      break;
    case 1: 
      this.a = new zamg(this);
      break;
    case 2: 
      this.a = new zaun(this);
      break;
    case 3: 
      this.a = new zapz(this);
      break;
    }
  }
  
  zamg b()
  {
    if (a() == 1) {
      return (zamg)this.a;
    }
    return null;
  }
  
  zaun c()
  {
    if (a() == 2) {
      return (zaun)this.a;
    }
    return null;
  }
  
  zapz d()
  {
    if (a() == 3) {
      return (zapz)this.a;
    }
    return null;
  }
  
  Workbook e()
  {
    return this.b.a();
  }
  
  ShadowEffect(ztf parent)
  {
    this.b = parent;
    this.a = null;
  }
  
  public int getPresetType()
  {
    return f();
  }
  
  public void setPresetType(int value)
  {
    b(value);
    this.b.j();
  }
  
  private int f()
  {
    switch (a())
    {
    case 0: 
      return 0;
    case 2: 
      zaun localzaun = (zaun)this.a;
      if (localzaun != null)
      {
        if (a(localzaun, 50800, 38100, 2700000, 100000, 100000, 0, 0, 7, 40000)) {
          return 2;
        }
        if (a(localzaun, 50800, 38100, 5400000, 100000, 100000, 0, 0, 6, 40000)) {
          return 3;
        }
        if (a(localzaun, 50800, 38100, 8100000, 100000, 100000, 0, 0, 8, 40000)) {
          return 4;
        }
        if (a(localzaun, 50800, 38100, 0, 100000, 100000, 0, 0, 4, 40000)) {
          return 5;
        }
        if (a(localzaun, 63500, 0, 0, 102000, 102000, 0, 0, 3, 40000)) {
          return 6;
        }
        if (a(localzaun, 50800, 38100, 10800000, 100000, 100000, 0, 0, 5, 40000)) {
          return 7;
        }
        if (a(localzaun, 50800, 38100, 18900000, 100000, 100000, 0, 0, 1, 40000)) {
          return 8;
        }
        if (a(localzaun, 50800, 38100, 16200000, 100000, 100000, 0, 0, 0, 40000)) {
          return 9;
        }
        if (a(localzaun, 50800, 38100, 13500000, 100000, 100000, 0, 0, 2, 40000)) {
          return 10;
        }
        if (a(localzaun, 76200, 0, 13500000, 100000, 23000, 1200000, 0, 2, 20000)) {
          return 20;
        }
        if (a(localzaun, 76200, 0, 18900000, 100000, 23000, -1200000, 0, 1, 20000)) {
          return 21;
        }
        if (a(localzaun, 152400, 317500, 5400000, 90000, 46536, 0, 0, 0, 15000)) {
          return 22;
        }
        if (a(localzaun, 76200, 12700, 8100000, 100000, 42536, 800400, 0, 2, 20000)) {
          return 23;
        }
        if (a(localzaun, 76200, 12700, 2700000, 100000, 42536, -800400, 0, 1, 20000)) {
          return 24;
        }
      }
      break;
    case 1: 
      zamg localzamg = (zamg)this.a;
      if (localzamg != null)
      {
        if (a(localzamg, 63500, 50800, 13500000)) {
          return 11;
        }
        if (a(localzamg, 63500, 50800, 16200000)) {
          return 12;
        }
        if (a(localzamg, 63500, 50800, 18900000)) {
          return 13;
        }
        if (a(localzamg, 63500, 50800, 10800000)) {
          return 14;
        }
        if (a(localzamg, 114300, 0, 0)) {
          return 15;
        }
        if (a(localzamg, 63500, 50800, 0)) {
          return 16;
        }
        if (a(localzamg, 63500, 50800, 8100000)) {
          return 17;
        }
        if (a(localzamg, 63500, 50800, 5400000)) {
          return 18;
        }
        if (a(localzamg, 63500, 50800, 2700000)) {
          return 19;
        }
      }
      break;
    }
    return 1;
  }
  
  private void b(int paramInt)
  {
    if (paramInt == 0)
    {
      this.a = null;
      return;
    }
    if (paramInt == 1) {
      return;
    }
    switch (paramInt)
    {
    case 2: 
      a(50800, 38100, 2700000, 100000, 100000, 0, 0, 7, 40000);
      break;
    case 3: 
      a(50800, 38100, 5400000, 100000, 100000, 0, 0, 6, 40000);
      break;
    case 4: 
      a(50800, 38100, 8100000, 100000, 100000, 0, 0, 8, 40000);
      break;
    case 5: 
      a(50800, 38100, 0, 100000, 100000, 0, 0, 4, 40000);
      break;
    case 6: 
      a(63500, 0, 0, 102000, 102000, 0, 0, 3, 40000);
      break;
    case 7: 
      a(50800, 38100, 10800000, 100000, 100000, 0, 0, 5, 40000);
      break;
    case 8: 
      a(50800, 38100, 18900000, 100000, 100000, 0, 0, 1, 40000);
      break;
    case 9: 
      a(50800, 38100, 16200000, 100000, 100000, 0, 0, 0, 40000);
      break;
    case 10: 
      a(50800, 38100, 13500000, 100000, 100000, 0, 0, 2, 40000);
      break;
    case 11: 
      a(63500, 50800, 13500000);
      break;
    case 12: 
      a(63500, 50800, 16200000);
      break;
    case 13: 
      a(63500, 50800, 18900000);
      break;
    case 14: 
      a(63500, 50800, 10800000);
      break;
    case 15: 
      a(114300, 0, 0, -1);
      break;
    case 16: 
      a(63500, 50800, 0);
      break;
    case 17: 
      a(63500, 50800, 8100000);
      break;
    case 18: 
      a(63500, 50800, 5400000);
      break;
    case 19: 
      a(63500, 50800, 2700000);
      break;
    case 20: 
      a(76200, 0, 13500000, 100000, 23000, 1200000, 0, 2, 20000);
      break;
    case 21: 
      a(76200, 0, 18900000, 100000, 23000, -1200000, 0, 1, 20000);
      break;
    case 22: 
      a(152400, 317500, 5400000, 90000, 46536, 0, 0, 0, 15000);
      break;
    case 23: 
      a(76200, 12700, 8100000, 100000, 42536, 800400, 0, 2, 20000);
      break;
    case 24: 
      a(76200, 12700, 2700000, 100000, 42536, -800400, 0, 1, 20000);
      break;
    }
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramInt1, paramInt2, paramInt3, 50000);
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(1);
    zamg localzamg = b();
    localzamg.e = paramInt1;
    localzamg.d = paramInt2;
    localzamg.c = paramInt3;
    CellsColor localCellsColor = new CellsColor(e());
    localCellsColor.setColor(Color.getBlack());
    if (paramInt4 != -1) {
      localCellsColor.a(paramInt4 / 1000);
    }
    localzamg.a(localCellsColor);
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    a(2);
    zaun localzaun = c();
    localzaun.e = paramInt1;
    localzaun.d = paramInt2;
    localzaun.c = paramInt3;
    localzaun.d(paramInt4);
    localzaun.e(paramInt5);
    localzaun.b(paramInt6);
    localzaun.c(paramInt7);
    localzaun.a(paramInt8);
    localzaun.i = false;
    CellsColor localCellsColor = new CellsColor(e());
    localCellsColor.setColor(Color.getBlack());
    if (paramInt9 != -1) {
      localCellsColor.a(paramInt9 / 1000);
    }
    localzaun.a(localCellsColor);
  }
  
  private boolean a(zaun paramzaun, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    if ((paramzaun.e != paramInt1) || (paramzaun.d != paramInt2) || (paramzaun.c != paramInt3) || (paramzaun.k() != paramInt4) || (paramzaun.l() != paramInt5) || (paramzaun.h() != paramInt6) || (paramzaun.i() != paramInt7) || (paramzaun.g() != paramInt8) || (paramzaun.j())) {
      return false;
    }
    zaml localzaml = paramzaun.b;
    return (localzaml != null) && (localzaml.c() == 2) && (localzaml.e() == 0) && (localzaml.j() == paramInt9);
  }
  
  private boolean a(zamg paramzamg, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramzamg.e != paramInt1) || (paramzamg.d != paramInt2) || (paramzamg.c != paramInt3)) {
      return false;
    }
    zaml localzaml = paramzamg.b;
    return (localzaml != null) && (localzaml.c() == 2) && (localzaml.e() == 0) && (localzaml.j() != 50000);
  }
  
  public CellsColor getColor()
  {
    if (this.a != null) {
      return this.a.b();
    }
    return null;
  }
  
  public void setColor(CellsColor value)
  {
    if (value == null) {
      return;
    }
    if (a() == 0) {
      a(50800, 50800, 5400000, 100000, 100000, 0, 0, 3, -1);
    }
    this.a.a(getColor());
  }
  
  private void g()
  {
    if (a() == 0) {
      a(50800, 50800, 5400000, 100000, 100000, 0, 0, 3, 43);
    }
    this.b.j();
  }
  
  public double getTransparency()
  {
    CellsColor localCellsColor = getColor();
    if (localCellsColor == null) {
      return 0.0D;
    }
    return localCellsColor.getTransparency();
  }
  
  public void setTransparency(double value)
  {
    if ((value < 0.0D) || (value > 1.0D)) {
      throw new CellsException(6, "Transparency must between 0.0 (opaque) and 1.0 (clear)");
    }
    g();
    getColor().setTransparency(value);
  }
  
  public double getSize()
  {
    if (this.a != null) {
      return this.a.f();
    }
    return 0.0D;
  }
  
  public void setSize(double value)
  {
    if ((value < 0.0D) || (value > 2.0D)) {
      throw new CellsException(6, "Size must between 0.0 and 2.0");
    }
    g();
    this.a.d(value);
  }
  
  public double getBlur()
  {
    if (this.a != null) {
      return this.a.e();
    }
    return 0.0D;
  }
  
  public void setBlur(double value)
  {
    if ((value < 0.0D) || (value > 100.0D)) {
      throw new CellsException(6, "Blur must between 0 and 100 points");
    }
    g();
    this.a.c(value);
  }
  
  public double getAngle()
  {
    if (this.a != null) {
      return this.a.c();
    }
    return 0.0D;
  }
  
  public void setAngle(double value)
  {
    if ((value < 0.0D) || (value > 359.9D)) {
      throw new CellsException(6, "Angle must between 0 and 359.9 degrees");
    }
    g();
    this.a.a(value);
  }
  
  public double getDistance()
  {
    if (this.a != null) {
      return this.a.d();
    }
    return 0.0D;
  }
  
  public void setDistance(double value)
  {
    if ((value < 0.0D) || (value > 200.0D)) {
      throw new CellsException(6, "Distance must between 0 and 200 points");
    }
    g();
    this.a.b(value);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ShadowEffect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */