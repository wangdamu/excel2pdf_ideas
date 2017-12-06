package com.aspose.cells;

public class ChartArea
  extends ChartFrame
{
  private int i = -1;
  
  ChartArea(Chart chart)
  {
    super(chart);
    b(0);
  }
  
  public int getX()
  {
    return q();
  }
  
  public void setX(int value)
  {
    if ((value >= 0) && (value <= 4000)) {
      e(value);
    }
  }
  
  public int getY()
  {
    return r();
  }
  
  public void setY(int value)
  {
    if ((value >= 0) && (value <= 4000)) {
      f(value);
    }
  }
  
  public int getHeight()
  {
    return s();
  }
  
  public void setHeight(int value)
  {
    if ((value >= 0) && (value <= 4000)) {
      g(value);
    }
  }
  
  public int getWidth()
  {
    return t();
  }
  
  public void setWidth(int value)
  {
    if ((value >= 0) && (value <= 4000)) {
      h(value);
    }
  }
  
  public Font getFont()
  {
    if (this.m_font == null)
    {
      String str = getChart().O().f.a(getChart().n().p().getSettings().getRegion(), false);
      this.m_font = new Font(getChart().n(), null, true);
      if (str != null) {
        this.m_font.f = str;
      }
      this.m_font.b(10.0D);
      if (this.m_fontIndex != -1)
      {
        Font localFont = getChart().n().i(this.m_fontIndex);
        this.m_font.a(localFont, null);
        this.m_font.c(true);
        zbm localzbm1 = getChart().e(this.m_fontIndex);
        if (localzbm1 != null)
        {
          zbm localzbm2 = new zbm(localzbm1.f, 0, false);
          localzbm2.a(localzbm1);
          this.m_font.a(localzbm2);
        }
        else if (this.m_AutoScaleFont)
        {
          this.m_font.a(new zbm(getChart(), 10, true));
        }
      }
      else if (this.m_AutoScaleFont)
      {
        this.m_font.a(new zbm(getChart(), 10, true));
      }
    }
    return this.m_font;
  }
  
  int a()
  {
    return this.i;
  }
  
  void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  void a(ChartArea paramChartArea, CopyOptions paramCopyOptions)
  {
    super.a(paramChartArea, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ChartArea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */