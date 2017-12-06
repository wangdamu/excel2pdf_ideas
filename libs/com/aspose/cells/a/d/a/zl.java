package com.aspose.cells.a.d.a;

import java.awt.Color;
import java.util.Properties;

public class zl
{
  private static final Properties a = new Properties();
  
  public static Color a(Color paramColor1, Color paramColor2)
  {
    int i = (paramColor1.getRed() + paramColor2.getRed()) / 2;
    int j = (paramColor1.getGreen() + paramColor2.getGreen()) / 2;
    int k = (paramColor1.getBlue() + paramColor2.getBlue()) / 2;
    return new Color(i, j, k);
  }
  
  static
  {
    String str = "Arial";
    a.setProperty("Dialog", str);
    a.setProperty("DialogInput", "Courier New");
    a.setProperty("Serif", "Times New Roman");
    a.setProperty("SansSerif", str);
    a.setProperty("Monospaced", "Courier New");
    a.setProperty("Courier", "Courier New");
    a.setProperty("Helvetica", str);
    a.setProperty("Times-Roman", "Times New Roman");
    a.setProperty("TimesRoman", "Times New Roman");
    a.setProperty("Times", "Times New Roman");
    a.setProperty("Symbol", "Arial Unicode MS");
    a.setProperty("ZapfDingbats", "Arial Unicode MS");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/zl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */