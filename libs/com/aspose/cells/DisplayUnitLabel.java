package com.aspose.cells;

public class DisplayUnitLabel
  extends ChartTextFrame
{
  private Axis k;
  
  DisplayUnitLabel(Axis axis)
  {
    super(axis.a());
    this.k = axis;
    getBorder().setVisible(false);
    getArea().setFormatting(1);
    if (!ChartCollection.h(axis.a().getType())) {
      setRotationAngle(90);
    }
    if (axis.a().getChartArea() != null) {
      this.m_AutoScaleFont = axis.a().getChartArea().getAutoScaleFont();
    }
    getFont().setBold(true);
    b(7);
  }
  
  Axis J()
  {
    return this.k;
  }
  
  public String getText()
  {
    if (!this.k.isDisplayUnitLabelShown()) {
      return "";
    }
    if (this.m_text == null) {
      switch (this.k.getDisplayUnit())
      {
      case 0: 
        return "";
      case 1: 
        return "Hundreds";
      case 2: 
        return "Thousands";
      case 5: 
        return "Millions";
      case 8: 
        return "Billions";
      case 9: 
        return "Trillions";
      }
    }
    return this.m_text;
  }
  
  public void setText(String value)
  {
    this.m_text = value;
  }
  
  public Font getFont()
  {
    if (this.m_font == null)
    {
      this.m_font = new Font(getChart().n(), null, true);
      Font localFont = null;
      if (this.m_fontIndex != -1)
      {
        localFont = getChart().n().i(this.m_fontIndex);
        this.m_font.a(localFont, null);
        this.m_font.c(true);
        zbm localzbm1 = getChart().e(this.m_fontIndex);
        if (localzbm1 != null)
        {
          zbm localzbm2 = new zbm(localzbm1.f, 0, false);
          localzbm2.a(localzbm1);
          this.m_font.a(localzbm2);
        }
      }
      else
      {
        if (this.k.a().getChartArea() != null)
        {
          this.m_font.a(this.k.a().getChartArea().getFont(), null);
          this.m_font.o();
        }
        if (getAutoScaleFont()) {
          this.m_font.a(new zbm(getChart(), 10, true));
        }
      }
    }
    return this.m_font;
  }
  
  public boolean getAutoScaleFont()
  {
    return this.m_AutoScaleFont;
  }
  
  public void setAutoScaleFont(boolean value)
  {
    if (this.m_AutoScaleFont == value) {
      return;
    }
    if (value)
    {
      if (this.m_font != null)
      {
        zbm localzbm = new zbm(getChart(), this.m_font.getSize(), true);
        this.m_font.a(localzbm);
      }
    }
    else {
      getFont().a(null);
    }
    this.m_AutoScaleFont = value;
  }
  
  boolean K()
  {
    return (getBorder().isVisible()) || (getArea().getFormatting() != 1);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DisplayUnitLabel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */