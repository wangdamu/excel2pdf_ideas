package com.aspose.cells;

import java.util.ArrayList;

public class ChartDataTable
{
  private Chart a;
  private Font b;
  private int c = -1;
  private boolean d = true;
  private int e = 0;
  private boolean f = true;
  private boolean g = true;
  private boolean h = true;
  private boolean i = true;
  private Line j;
  private ShapePropertyCollection k;
  
  ChartDataTable(Chart chart)
  {
    this.a = chart;
  }
  
  void a(ChartDataTable paramChartDataTable, CopyOptions paramCopyOptions)
  {
    this.d = paramChartDataTable.d;
    this.c = -1;
    this.e = paramChartDataTable.e;
    if ((paramChartDataTable.b != null) || (paramChartDataTable.c != -1))
    {
      this.b = new Font(this.a.n(), null, true);
      this.b.a(paramChartDataTable.getFont(), null);
      if ((paramChartDataTable.getFont().c() != null) && (paramChartDataTable.d))
      {
        zbm localzbm1 = paramChartDataTable.getFont().c();
        zbm localzbm2 = new zbm(this.a, 0, false);
        localzbm2.a(localzbm1);
        this.b.a(localzbm2);
      }
    }
    else
    {
      this.b = null;
    }
    this.f = paramChartDataTable.f;
    this.h = paramChartDataTable.h;
    this.g = paramChartDataTable.g;
    this.i = paramChartDataTable.i;
    if (paramChartDataTable.j != null)
    {
      this.j = new Line(this.a, this);
      this.j.a(paramChartDataTable.j);
    }
    else
    {
      this.j = null;
    }
    if (paramChartDataTable.k != null)
    {
      this.k = new ShapePropertyCollection(this.a, this, 3);
      this.k.a(paramChartDataTable.k, paramCopyOptions);
    }
  }
  
  public Font getFont()
  {
    if (this.b == null)
    {
      this.b = new Font(this.a.n(), null, true);
      this.b.setSize(10);
      if (this.c != -1)
      {
        Font localFont = (Font)this.a.n().A().get(this.c > 4 ? this.c - 1 : this.c);
        this.b.a(localFont, null);
        this.b.c(true);
        zbm localzbm1 = this.a.e(this.c);
        if (localzbm1 != null)
        {
          zbm localzbm2 = new zbm(localzbm1.f, 0, false);
          localzbm2.a(localzbm1);
          this.b.a(localzbm2);
        }
      }
      else if (getAutoScaleFont())
      {
        this.b.a(new zbm(this.a, this.b.getSize(), true));
      }
    }
    return this.b;
  }
  
  Font a()
  {
    if ((this.b == null) && (this.c != -1)) {
      return this.a.n().i(this.c);
    }
    return this.b;
  }
  
  int b()
  {
    return this.c;
  }
  
  void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public boolean getAutoScaleFont()
  {
    return this.d;
  }
  
  public void setAutoScaleFont(boolean value)
  {
    if (value)
    {
      if (this.b != null)
      {
        zbm localzbm = new zbm(this.a, this.b.getSize(), true);
        this.b.a(localzbm);
      }
    }
    else {
      getFont().a(null);
    }
    this.d = value;
  }
  
  public int getBackgroundMode()
  {
    return this.e;
  }
  
  public void setBackgroundMode(int value)
  {
    this.e = value;
  }
  
  /**
   * @deprecated
   */
  public int getBackground()
  {
    return this.e;
  }
  
  /**
   * @deprecated
   */
  public void setBackground(int value)
  {
    this.e = value;
  }
  
  public boolean hasBorderHorizontal()
  {
    return this.f;
  }
  
  public void setHasBorderHorizontal(boolean value)
  {
    this.f = value;
  }
  
  public boolean hasBorderVertical()
  {
    return this.g;
  }
  
  public void setHasBorderVertical(boolean value)
  {
    this.g = value;
  }
  
  public boolean hasBorderOutline()
  {
    return this.h;
  }
  
  public void setHasBorderOutline(boolean value)
  {
    this.h = value;
  }
  
  public boolean getShowLegendKey()
  {
    return this.i;
  }
  
  public void setShowLegendKey(boolean value)
  {
    this.i = value;
  }
  
  public Line getBorder()
  {
    if (this.j == null) {
      this.j = new Line(this.a, this);
    }
    return this.j;
  }
  
  Line c()
  {
    return this.j;
  }
  
  ShapePropertyCollection d()
  {
    if (this.k == null) {
      this.k = new ShapePropertyCollection(this.a, this, 3);
    }
    return this.k;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ChartDataTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */