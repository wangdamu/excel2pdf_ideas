package com.aspose.cells;

public class ColorScale
{
  ConditionalFormattingValue a = null;
  ConditionalFormattingValue b = null;
  ConditionalFormattingValue c = null;
  zaml d;
  zaml e;
  zaml f;
  private Workbook g;
  private FormatCondition h;
  
  ColorScale(Workbook book, FormatCondition fc)
  {
    this.g = book;
    this.h = fc;
    this.f = new zaml(false);
    this.e = new zaml(false);
    this.d = new zaml(false);
  }
  
  void a(ColorScale paramColorScale, CopyOptions paramCopyOptions, int paramInt1, int paramInt2)
  {
    if (paramColorScale.c != null)
    {
      this.c = new ConditionalFormattingValue(this.h);
      this.c.a(paramColorScale.c, paramColorScale.g.getWorksheets(), this.g.getWorksheets(), paramCopyOptions, paramInt1, paramInt2);
    }
    if (paramColorScale.b != null)
    {
      this.b = new ConditionalFormattingValue(this.h);
      this.b.a(paramColorScale.b, paramColorScale.g.getWorksheets(), this.g.getWorksheets(), paramCopyOptions, paramInt1, paramInt2);
    }
    if (paramColorScale.a != null)
    {
      this.a = new ConditionalFormattingValue(this.h);
      this.a.a(paramColorScale.a, paramColorScale.g.getWorksheets(), this.g.getWorksheets(), paramCopyOptions, paramInt1, paramInt2);
    }
    this.e.f(paramColorScale.e);
    this.d.f(paramColorScale.d);
    this.f.f(paramColorScale.f);
  }
  
  static ColorScale a(Workbook paramWorkbook, FormatCondition paramFormatCondition)
  {
    ColorScale localColorScale = new ColorScale(paramWorkbook, paramFormatCondition);
    localColorScale.a = new ConditionalFormattingValue(paramFormatCondition, 2, null);
    localColorScale.b = new ConditionalFormattingValue(paramFormatCondition, 5, Integer.valueOf(50));
    localColorScale.c = new ConditionalFormattingValue(paramFormatCondition, 1, null);
    zaml localzaml = new zaml(false);
    localzaml.a(2, zauj.r("FFF8696B"));
    localColorScale.b().f(localzaml);
    localzaml.a(2, zauj.r("FFFFEB84"));
    localColorScale.c().f(localzaml);
    localzaml.a(2, zauj.r("FF63BE7B"));
    localColorScale.d().f(localzaml);
    localColorScale.g = paramWorkbook;
    return localColorScale;
  }
  
  public boolean getIs3ColorScale()
  {
    return (this.b != null) && ((this.b.f() != null) || (this.b.getValue() != null));
  }
  
  public void setIs3ColorScale(boolean value)
  {
    if (value) {
      this.b = new ConditionalFormattingValue(this.h, 5, Integer.valueOf(50));
    } else {
      this.b = null;
    }
  }
  
  public ConditionalFormattingValue getMinCfvo()
  {
    if (this.a == null) {
      this.a = new ConditionalFormattingValue(this.h, 2, null);
    }
    return this.a;
  }
  
  public ConditionalFormattingValue getMidCfvo()
  {
    return this.b;
  }
  
  boolean a()
  {
    return (this.b != null) && ((this.b.f() != null) || (this.b.getValue() != null));
  }
  
  public ConditionalFormattingValue getMaxCfvo()
  {
    if (this.c == null) {
      this.c = new ConditionalFormattingValue(this.h, 1, null);
    }
    return this.c;
  }
  
  public Color getMinColor()
  {
    return this.d.b(this.g);
  }
  
  public void setMinColor(Color value)
  {
    this.d.a(2, value.toArgb());
  }
  
  public Color getMidColor()
  {
    return this.e.b(this.g);
  }
  
  public void setMidColor(Color value)
  {
    this.e.a(2, value.toArgb());
  }
  
  public Color getMaxColor()
  {
    return this.f.b(this.g);
  }
  
  public void setMaxColor(Color value)
  {
    this.f.a(2, value.toArgb());
  }
  
  zaml b()
  {
    return this.d;
  }
  
  void a(zaml paramzaml)
  {
    this.d = paramzaml;
  }
  
  zaml c()
  {
    return this.e;
  }
  
  void b(zaml paramzaml)
  {
    this.e = paramzaml;
  }
  
  zaml d()
  {
    return this.f;
  }
  
  void c(zaml paramzaml)
  {
    this.f = paramzaml;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ColorScale.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */