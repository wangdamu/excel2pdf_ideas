package com.aspose.cells;

import com.aspose.cells.b.a.zr;

public class ShapeTextAlignment
{
  String a;
  FontSettingCollection b;
  int c = 0;
  int d = 100000;
  int e = 0;
  zaxp f = null;
  ThreeDFormat g;
  private int j;
  private int k = 45720;
  private int l = 45720;
  private int m = 91440;
  private int n = 91440;
  private int o;
  int h;
  int i;
  
  ShapeTextAlignment(FontSettingCollection parent)
  {
    this.b = parent;
  }
  
  boolean a()
  {
    return a(4096, false);
  }
  
  void a(boolean paramBoolean)
  {
    b(4096, paramBoolean);
    this.b.n();
  }
  
  public boolean isTextWrapped()
  {
    return a(1, true);
  }
  
  public void setTextWrapped(boolean value)
  {
    this.b.n();
    b(1, value);
  }
  
  boolean b()
  {
    return a(512, false);
  }
  
  void b(boolean paramBoolean)
  {
    b(512, paramBoolean);
    this.b.n();
  }
  
  public int getTextVerticalOverflow()
  {
    if (!j(64)) {
      return 2;
    }
    switch (this.o & 0xC00)
    {
    case 0: 
      return 2;
    case 1024: 
      return 0;
    case 2048: 
      return 1;
    case 3072: 
      break;
    }
    return 2;
  }
  
  public void setTextVerticalOverflow(int value)
  {
    this.o &= 0xF3FF;
    switch (value)
    {
    case 2: 
      break;
    case 0: 
      this.o |= 0x400;
      break;
    case 1: 
      this.o |= 0x800;
      break;
    }
    k(64);
    this.b.n();
  }
  
  public int getTextHorizontalOverflow()
  {
    if (!j(32)) {
      return 2;
    }
    switch (this.o & 0x3000)
    {
    case 0: 
      return 2;
    case 4096: 
      return 0;
    case 8192: 
      return 1;
    }
    return 2;
  }
  
  public void setTextHorizontalOverflow(int value)
  {
    this.o &= 0xCFFF;
    switch (value)
    {
    case 0: 
      this.o |= 0x1000;
      break;
    case 1: 
      this.o |= 0x2000;
      break;
    }
    k(32);
    this.b.n();
  }
  
  void a(ShapeTextAlignment paramShapeTextAlignment, CopyOptions paramCopyOptions)
  {
    this.a = paramShapeTextAlignment.a;
    if (this.a == null)
    {
      this.h = paramShapeTextAlignment.h;
      this.o = paramShapeTextAlignment.o;
      this.i = paramShapeTextAlignment.i;
      this.j = paramShapeTextAlignment.j;
      if (paramShapeTextAlignment.g != null)
      {
        this.g = new ThreeDFormat(this);
        this.g.c(paramShapeTextAlignment.g, paramCopyOptions);
      }
      if (paramShapeTextAlignment.f != null)
      {
        this.f = new zaxp();
        this.f.a(paramShapeTextAlignment.f);
      }
      this.l = paramShapeTextAlignment.l;
      this.m = paramShapeTextAlignment.m;
      this.n = paramShapeTextAlignment.n;
      this.c = paramShapeTextAlignment.c;
      this.k = paramShapeTextAlignment.k;
      this.d = paramShapeTextAlignment.d;
      this.e = paramShapeTextAlignment.e;
    }
  }
  
  public double getRotationAngle()
  {
    return zr.b(zbxp.d(this.c), 3);
  }
  
  public void setRotationAngle(double value)
  {
    this.c = zbxp.h(value);
    this.b.n();
  }
  
  public int getTextVerticalType()
  {
    switch ((this.o & 0x3C0) >> 6)
    {
    case 0: 
      return 1;
    case 1: 
      return 5;
    case 2: 
      return 6;
    case 3: 
      return 0;
    case 4: 
      return 4;
    case 5: 
      return 3;
    case 6: 
      return 2;
    }
    return 1;
  }
  
  public void setTextVerticalType(int value)
  {
    int i1 = 0;
    switch (value)
    {
    case 1: 
      i1 = 0;
      break;
    case 5: 
      i1 = 1;
      break;
    case 6: 
      i1 = 2;
      break;
    case 0: 
      i1 = 3;
      break;
    case 4: 
      i1 = 4;
      break;
    case 3: 
      i1 = 5;
      break;
    case 2: 
      i1 = 6;
      break;
    }
    this.o &= 0xFC3F;
    this.o |= i1 << 6;
    k(16);
    this.b.n();
  }
  
  boolean c()
  {
    return a(2, false);
  }
  
  void c(boolean paramBoolean)
  {
    b(2, paramBoolean);
    this.b.n();
  }
  
  public boolean getAutoSize()
  {
    return a(128, false);
  }
  
  public void setAutoSize(boolean value)
  {
    b(128, value);
    this.b.n();
  }
  
  void d(boolean paramBoolean)
  {
    b(256, paramBoolean);
    this.b.n();
  }
  
  public int getTextShapeType()
    throws Exception
  {
    if (this.f == null) {
      return 202;
    }
    return d().b;
  }
  
  public void setTextShapeType(int value)
    throws Exception
  {
    d().b = value;
  }
  
  zaxp d()
    throws Exception
  {
    if (this.f == null)
    {
      this.f = new zaxp();
      this.f.b = 202;
    }
    if (this.f.a != null) {
      zalg.a(this.f.a, this.f);
    }
    return this.f;
  }
  
  ThreeDFormat e()
  {
    if (this.g == null) {
      this.g = new ThreeDFormat(this);
    }
    return this.g;
  }
  
  ThreeDFormat f()
    throws Exception
  {
    if (this.g == null) {
      this.g = new ThreeDFormat(this);
    }
    if ((this.g.j != null) || (this.g.a != null)) {
      zalf.a(this.g);
    }
    return this.g;
  }
  
  int g()
  {
    return this.j;
  }
  
  void a(int paramInt)
  {
    k(2048);
    this.j = paramInt;
    this.b.n();
  }
  
  int h()
  {
    return this.k;
  }
  
  void b(int paramInt)
  {
    this.k = paramInt;
    e(false);
  }
  
  public double getTopMarginPt()
  {
    return zbxp.c(h());
  }
  
  public void setTopMarginPt(double value)
  {
    b(zbxp.f(value));
  }
  
  int i()
  {
    return this.l;
  }
  
  void c(int paramInt)
  {
    this.l = paramInt;
    e(false);
  }
  
  public double getBottomMarginPt()
  {
    return zbxp.c(i());
  }
  
  public void setBottomMarginPt(double value)
  {
    c(zbxp.f(value));
  }
  
  int j()
  {
    return this.m;
  }
  
  void d(int paramInt)
  {
    this.m = paramInt;
    e(false);
  }
  
  public double getLeftMarginPt()
  {
    return zbxp.c(j());
  }
  
  public void setLeftMarginPt(double value)
  {
    d(zbxp.f(value));
  }
  
  int k()
  {
    return this.n;
  }
  
  void e(int paramInt)
  {
    this.n = paramInt;
    e(false);
  }
  
  public double getRightMarginPt()
  {
    return zbxp.c(k());
  }
  
  public void setRightMarginPt(double value)
  {
    e(zbxp.f(value));
  }
  
  boolean l()
  {
    return a(1024, true);
  }
  
  void e(boolean paramBoolean)
  {
    b(1024, paramBoolean);
    this.b.n();
  }
  
  int m()
  {
    switch (this.o & 0x7)
    {
    case 0: 
      return 7;
    case 1: 
      return 8;
    case 2: 
      return 1;
    case 3: 
      return 6;
    case 4: 
      return 3;
    }
    return 7;
  }
  
  void f(int paramInt)
  {
    int i1 = 0;
    switch (paramInt)
    {
    case 7: 
      i1 = 0;
      break;
    case 8: 
      i1 = 1;
      break;
    case 1: 
      i1 = 2;
      break;
    case 6: 
      i1 = 3;
      break;
    case 3: 
      i1 = 4;
      break;
    }
    k(4);
    this.o &= 0xFFFFFFF8;
    this.o |= i1;
    this.b.n();
  }
  
  int n()
  {
    switch ((this.o & 0x38) >> 3)
    {
    case 0: 
      return 9;
    case 1: 
      return 0;
    case 2: 
      return 1;
    case 3: 
      return 6;
    case 4: 
      return 3;
    }
    return 9;
  }
  
  void g(int paramInt)
  {
    int i1 = 0;
    switch (paramInt)
    {
    case 9: 
      i1 = 0;
      break;
    case 0: 
      i1 = 1;
      break;
    case 1: 
      i1 = 2;
      break;
    case 6: 
      i1 = 3;
      break;
    case 3: 
      i1 = 4;
      break;
    }
    k(8);
    this.o &= 0xFFFFFFC7;
    this.o |= i1 << 3;
    this.b.n();
  }
  
  int o()
  {
    switch (getTextVerticalType())
    {
    case 0: 
    case 2: 
    case 3: 
      return 0;
    case 4: 
      return 1;
    case 5: 
    case 6: 
      return 3;
    }
    return 2;
  }
  
  void h(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      setTextVerticalType(3);
      break;
    case 1: 
      setTextVerticalType(4);
      break;
    case 3: 
      if (getTextVerticalType() != 6) {
        setTextVerticalType(5);
      }
      break;
    case 2: 
      setTextVerticalType(1);
      break;
    }
  }
  
  int p()
  {
    if (getTextVerticalType() == 6) {
      return 2;
    }
    return 1;
  }
  
  void i(int paramInt)
  {
    if (paramInt == 2) {
      setTextVerticalType(6);
    }
  }
  
  boolean a(int paramInt, boolean paramBoolean)
  {
    if (j(paramInt)) {
      return (this.h & paramInt) != 0;
    }
    return paramBoolean;
  }
  
  boolean j(int paramInt)
  {
    return (this.i & paramInt) != 0;
  }
  
  void b(int paramInt, boolean paramBoolean)
  {
    this.i |= paramInt;
    if (paramBoolean) {
      this.h |= paramInt;
    } else {
      this.h &= (paramInt ^ 0xFFFFFFFF);
    }
  }
  
  void k(int paramInt)
  {
    this.i |= paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ShapeTextAlignment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */