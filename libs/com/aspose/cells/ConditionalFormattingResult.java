package com.aspose.cells;

import java.util.HashMap;

public class ConditionalFormattingResult
{
  private zfe a;
  
  ConditionalFormattingResult(zfe cStyle)
  {
    this.a = cStyle;
  }
  
  public Style getConditionalStyle()
  {
    return this.a.a;
  }
  
  Style a()
  {
    Style localStyle = this.a.b;
    if (getConditionalFormattingColorScale() != null) {
      if ((localStyle.getPattern() == 0) || (localStyle.getPattern() == 1))
      {
        localStyle.setPattern(1);
        localStyle.setForegroundColor(getColorScaleResult());
      }
      else
      {
        localStyle.setBackgroundColor(getColorScaleResult());
      }
    }
    return localStyle;
  }
  
  public ConditionalFormattingIcon getConditionalFormattingIcon()
  {
    if (this.a.c == null) {
      return null;
    }
    zajx localzajx = (zajx)this.a.c.get("IconSetStyle");
    if (localzajx != null)
    {
      IconSet localIconSet = localzajx.a;
      int i = localzajx.a();
      if (i == -1) {
        return null;
      }
      int j = localzajx.b(i);
      ConditionalFormattingIcon localConditionalFormattingIcon = new ConditionalFormattingIcon();
      if (localIconSet.getType() == 21)
      {
        if (localIconSet.getCfIcons().get(i).getType() == 20) {
          return null;
        }
        i = localIconSet.getCfIcons().get(i).getIndex();
      }
      else if (localIconSet.getReverse())
      {
        int k = zajx.c(j);
        i = k - 1 - i;
      }
      localConditionalFormattingIcon.setIndex(i);
      localConditionalFormattingIcon.setType(j);
      return localConditionalFormattingIcon;
    }
    return null;
  }
  
  public DataBar getConditionalFormattingDataBar()
  {
    if (this.a.c == null) {
      return null;
    }
    zov localzov = (zov)this.a.c.get("DataBarStyle");
    if (localzov != null)
    {
      DataBar localDataBar = localzov.a;
      return localDataBar;
    }
    return null;
  }
  
  public ColorScale getConditionalFormattingColorScale()
  {
    if (this.a.c == null) {
      return null;
    }
    zli localzli = (zli)this.a.c.get("ColorScaledStyle");
    if (localzli != null)
    {
      ColorScale localColorScale = localzli.a;
      return localColorScale;
    }
    return null;
  }
  
  public Color getColorScaleResult()
  {
    Color localColor = new Color();
    if (this.a.c == null) {
      return localColor;
    }
    zli localzli = (zli)this.a.c.get("ColorScaledStyle");
    if (localzli != null)
    {
      ColorScale localColorScale = localzli.a;
      if (!localColorScale.a()) {
        localColor = localzli.a();
      } else {
        localColor = localzli.b();
      }
      return localColor;
    }
    return localColor;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ConditionalFormattingResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */