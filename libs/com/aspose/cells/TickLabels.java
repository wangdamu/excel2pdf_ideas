package com.aspose.cells;

public class TickLabels
{
  private Axis c;
  private Font d;
  private int e = -1;
  private boolean f = true;
  private int g = 0;
  private int h;
  private boolean i = true;
  private String j;
  private int k = 0;
  boolean a = true;
  private boolean l = true;
  private int m = 100;
  private boolean n = false;
  private boolean o = false;
  private int p;
  boolean b = true;
  
  TickLabels(Axis axis)
  {
    this.c = axis;
    if (axis.a().getChartArea() != null) {
      this.f = axis.a().getChartArea().getAutoScaleFont();
    }
  }
  
  public Font getFont()
  {
    if (this.d == null)
    {
      this.d = new Font(this.c.a().n(), null, true);
      this.d.setSize(10);
      Font localFont = null;
      if (this.e != -1)
      {
        localFont = this.c.a().n().i(this.e);
        this.d.a(localFont, null);
        if ((this.d.k()) && (this.c.a().getStyle() > 40)) {
          this.d.setColor(this.c.a().O().a("lt1"));
        }
        this.d.c(true);
        zbm localzbm1 = this.c.a().e(this.e);
        if (localzbm1 != null)
        {
          zbm localzbm2 = new zbm(localzbm1.f, 0, false);
          localzbm2.a(localzbm1);
          this.d.a(localzbm2);
        }
      }
      else
      {
        localFont = this.c.a().getChartArea().getFont();
        this.d.a(localFont, null);
        if (getAutoScaleFont()) {
          this.d.a(new zbm(this.c.a(), this.d.getSize(), true));
        }
      }
    }
    return this.d;
  }
  
  Font a()
  {
    if ((this.d == null) && (this.e != -1)) {
      return this.c.a().n().i(this.e);
    }
    return this.d;
  }
  
  int b()
  {
    return this.e;
  }
  
  void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public boolean getAutoScaleFont()
  {
    return this.f;
  }
  
  public void setAutoScaleFont(boolean value)
  {
    if (this.f == value) {
      return;
    }
    if (value)
    {
      if (this.d != null) {
        this.d.a(new zbm(this.c.a(), this.d.getSize(), true));
      }
    }
    else {
      getFont().a(null);
    }
    this.f = value;
  }
  
  void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public int getBackgroundMode()
  {
    return this.g;
  }
  
  public void setBackgroundMode(int value)
  {
    this.g = value;
  }
  
  /**
   * @deprecated
   */
  public int getBackground()
  {
    return this.g;
  }
  
  /**
   * @deprecated
   */
  public void setBackground(int value)
  {
    this.g = value;
  }
  
  public int getRotationAngle()
  {
    return this.h;
  }
  
  public void setRotationAngle(int value)
  {
    if (((value >= -90) && (value <= 90)) || (value == 255))
    {
      this.h = value;
      this.i = false;
    }
    else
    {
      throw new CellsException(0, "Invalid tick labels rotation.");
    }
  }
  
  void b(int paramInt)
  {
    this.h = paramInt;
    this.i = false;
  }
  
  boolean c()
  {
    return this.i;
  }
  
  public String getNumberFormat()
  {
    return this.j;
  }
  
  public void setNumberFormat(String value)
  {
    this.k = 0;
    this.j = value;
    this.l = false;
  }
  
  public int getNumber()
  {
    if ((this.k >= 0) && (this.k < 59)) {
      return (byte)this.k;
    }
    return 0;
  }
  
  public void setNumber(int value)
  {
    if ((value < 59) && (value >= 0))
    {
      this.j = null;
      this.k = value;
    }
    else
    {
      this.k = value;
    }
    setNumberFormatLinked(false);
  }
  
  int d()
  {
    return this.k;
  }
  
  void c(int paramInt)
  {
    this.k = paramInt;
  }
  
  public boolean getNumberFormatLinked()
  {
    return this.l;
  }
  
  public void setNumberFormatLinked(boolean value)
  {
    this.l = value;
    if (value)
    {
      this.k = 0;
      this.j = null;
    }
  }
  
  public int getOffset()
  {
    return this.m;
  }
  
  public void setOffset(int value)
  {
    if ((value < 0) || (value > 1000)) {
      throw new IllegalArgumentException("The tick offset must be between 0 and 1000.");
    }
    this.m = value;
  }
  
  boolean e()
  {
    return this.n;
  }
  
  void b(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  boolean f()
  {
    return this.o;
  }
  
  void c(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public int getTextDirection()
  {
    return this.p;
  }
  
  public void setTextDirection(int value)
  {
    this.p = value;
  }
  
  void a(TickLabels paramTickLabels)
  {
    this.f = paramTickLabels.f;
    this.e = -1;
    if ((paramTickLabels.d != null) || (paramTickLabels.e != -1))
    {
      this.d = new Font(this.c.a().n(), null, true);
      this.d.a(paramTickLabels.getFont(), null);
      if ((paramTickLabels.getFont().c() != null) && (paramTickLabels.f))
      {
        zbm localzbm1 = paramTickLabels.getFont().c();
        zbm localzbm2 = new zbm(this.c.a(), 0, false);
        localzbm2.a(localzbm1);
        this.d.a(localzbm2);
      }
    }
    else
    {
      this.d = null;
    }
    this.j = paramTickLabels.j;
    this.k = paramTickLabels.k;
    this.l = paramTickLabels.l;
    this.h = paramTickLabels.h;
    this.i = paramTickLabels.i;
    this.m = paramTickLabels.m;
    this.g = paramTickLabels.g;
    this.o = paramTickLabels.o;
    this.n = paramTickLabels.n;
    this.p = paramTickLabels.p;
    this.a = paramTickLabels.a;
    this.b = paramTickLabels.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TickLabels.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */