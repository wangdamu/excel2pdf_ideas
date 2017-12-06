package com.aspose.cells;

import java.util.ArrayList;

public class Title
  extends ChartTextFrame
{
  Axis k;
  int l = 1;
  int m = 2;
  private boolean o = false;
  boolean n = false;
  private boolean p = true;
  
  Title(Chart chart)
  {
    super(chart);
    b(3);
  }
  
  Title(Axis axis)
  {
    super(axis.a());
    this.k = axis;
    b(4);
  }
  
  public boolean isVisible()
  {
    if (this.m_deleted) {
      return false;
    }
    String str = getText();
    return (isAutoText()) || ((str != null) && (!"".equals(str)));
  }
  
  public void setVisible(boolean value)
  {
    if (value)
    {
      this.m_deleted = false;
      String str = getText();
      if ((str == null) || ("".equals(str))) {
        j(true);
      }
    }
    else
    {
      setText(null);
    }
  }
  
  static void a(Chart paramChart, Font paramFont, boolean paramBoolean)
  {
    Font localFont = paramChart.getChartArea().getFont();
    paramFont.a(localFont, null);
    paramFont.o();
    if (paramBoolean)
    {
      if (!paramChart.getChartArea().getFont().f(17)) {
        paramFont.a(true);
      }
      if (paramChart.getChartArea().getFont().f(12)) {
        paramFont.b(paramChart.getChartArea().getFont().getDoubleSize() * 1.2D);
      } else {
        switch (paramChart.getStyle())
        {
        case 41: 
        case 42: 
        case 43: 
        case 44: 
        case 45: 
        case 46: 
        case 47: 
        case 48: 
          paramFont.b(18.0D);
          if (paramChart.getChartArea().getFont().f(16)) {
            break;
          }
          paramFont.a(new zaml(true, 2, Color.getWhite().toArgb()));
          break;
        case -1: 
        case 2: 
          paramFont.b(18.0D);
          break;
        default: 
          paramFont.b(18.0D);
          break;
        }
      }
    }
    else
    {
      if (!paramChart.getChartArea().getFont().f(17)) {
        paramFont.a(true);
      }
      if (paramChart.getChartArea().getFont().f(12)) {
        paramFont.b(paramChart.getChartArea().getFont().getDoubleSize());
      }
      switch (paramChart.getStyle())
      {
      case 41: 
      case 42: 
      case 43: 
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 48: 
        paramFont.a(new zaml(true, 2, Color.getWhite().toArgb()));
        break;
      }
    }
  }
  
  public int getX()
  {
    return q();
  }
  
  public void setX(int value)
  {
    e(value);
    a(true);
    h(false);
    e(false);
    i(true);
  }
  
  public int getY()
  {
    return r();
  }
  
  public void setY(int value)
  {
    f(value);
    b(true);
    h(false);
    f(false);
    i(true);
  }
  
  void a(Title paramTitle, CopyOptions paramCopyOptions)
  {
    super.a(paramTitle, paramCopyOptions);
    this.p = paramTitle.p;
    this.o = paramTitle.o;
    this.n = paramTitle.n;
  }
  
  boolean J()
  {
    return (getBorder().isVisible()) || (getArea().getFormatting() != 1);
  }
  
  public boolean getOverLay()
  {
    return this.o;
  }
  
  public void setOverLay(boolean value)
  {
    this.o = value;
    this.n = true;
  }
  
  boolean K()
  {
    return this.p;
  }
  
  void m(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  /**
   * @deprecated
   */
  public FontSetting[] getCharacters()
  {
    return characters();
  }
  
  public FontSetting[] characters()
  {
    if (this.m_CharsList == null) {
      return new FontSetting[0];
    }
    FontSetting[] arrayOfFontSetting = new FontSetting[this.m_CharsList.size()];
    for (int i = 0; i < this.m_CharsList.size(); i++)
    {
      FontSetting localFontSetting = (FontSetting)this.m_CharsList.get(i);
      arrayOfFontSetting[i] = localFontSetting;
    }
    return arrayOfFontSetting;
  }
  
  Font L()
  {
    if ((E() == null) || (E().size() == 0)) {
      return null;
    }
    if (E().size() == 1) {
      return ((FontSetting)E().get(0)).getFont();
    }
    Font localFont = ((FontSetting)E().get(0)).getFont();
    for (int i = 0; i < E().size(); i++)
    {
      FontSetting localFontSetting = (FontSetting)E().get(i);
      if (!localFont.a(localFontSetting.getFont())) {
        return null;
      }
    }
    return localFont;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Title.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */