package com.aspose.cells;

import java.util.ArrayList;

public class LegendEntry
{
  private Legend a;
  private boolean b;
  private Font c;
  private int d = -1;
  private int e;
  private boolean f = true;
  private int g = 0;
  
  LegendEntry(Legend legend, int index)
  {
    this.a = legend;
    this.e = index;
  }
  
  public boolean isDeleted()
  {
    return this.b;
  }
  
  public void setDeleted(boolean value)
  {
    this.b = value;
  }
  
  public Font getFont()
  {
    if (this.c == null)
    {
      this.c = new Font(this.a.getChart().n(), null, true);
      this.c.setSize(10);
      Font localFont;
      if (this.d != -1)
      {
        localFont = (Font)this.a.getChart().n().A().get(this.d > 4 ? this.d - 1 : this.d);
        this.c.a(localFont, null);
        zbm localzbm1 = this.a.getChart().e(this.d);
        if (localzbm1 != null)
        {
          zbm localzbm2 = new zbm(localzbm1.f, 0, false);
          localzbm2.a(localzbm1);
          this.c.a(localzbm2);
        }
      }
      else
      {
        localFont = this.a.j();
        if (localFont != null) {
          this.c.a(localFont, null);
        }
        if (getAutoScaleFont()) {
          this.c.a(new zbm(this.a.getChart(), this.c.getSize(), true));
        }
      }
    }
    return this.c;
  }
  
  /**
   * @deprecated
   */
  public Font getTextFont()
  {
    return getFont();
  }
  
  Font a()
  {
    if ((this.c == null) && (this.d != -1)) {
      return this.a.getChart().n().i(this.d);
    }
    return this.c;
  }
  
  int b()
  {
    return this.d;
  }
  
  void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public boolean isTextNoFill()
  {
    return getFont().b().a();
  }
  
  public void setTextNoFill(boolean value)
  {
    getFont().b().a(value);
  }
  
  int c()
  {
    return this.e;
  }
  
  void b(int paramInt)
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
      if (this.c != null) {
        this.c.a(new zbm(this.a.getChart(), this.c.getSize(), true));
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
  
  public int getBackgroundMode()
  {
    return this.g;
  }
  
  public void setBackgroundMode(int value)
  {
    this.g = value;
  }
  
  void a(LegendEntry paramLegendEntry)
  {
    this.f = paramLegendEntry.f;
    this.g = paramLegendEntry.g;
    this.b = paramLegendEntry.b;
    this.d = -1;
    if ((paramLegendEntry.c != null) || (paramLegendEntry.d != -1))
    {
      this.c = new Font(this.a.getChart().n(), null, true);
      this.c.a(paramLegendEntry.getFont(), null);
      if ((paramLegendEntry.getFont().c() != null) && (paramLegendEntry.f))
      {
        zbm localzbm1 = paramLegendEntry.getFont().c();
        zbm localzbm2 = new zbm(this.a.getChart(), 0, false);
        localzbm2.a(localzbm1);
        this.c.a(localzbm2);
      }
    }
    else
    {
      this.c = null;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/LegendEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */