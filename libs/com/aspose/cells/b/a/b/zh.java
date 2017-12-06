package com.aspose.cells.b.a.b;

import com.aspose.cells.b.a.b.d.a.zb;
import com.aspose.cells.b.a.b.d.za;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.font.TextAttribute;
import java.util.Map;

public class zh
{
  private static zh b = new zh(2);
  private static zh c = new zh(1);
  private static zh d = new zh(0);
  private static za e;
  public static Container a = new Container();
  private String f;
  private FontMetrics g = null;
  private int h = 0;
  private Font i;
  
  zh() {}
  
  zh(String paramString, Font paramFont)
  {
    this.f = paramString;
    this.i = paramFont;
  }
  
  public static zh a()
  {
    return c;
  }
  
  public zh(String paramString)
  {
    this(paramString, e);
  }
  
  public zh(int paramInt)
  {
    this(g(paramInt));
  }
  
  public zh(String paramString, za paramza)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("name can not be null");
    }
    if (paramza == null) {
      paramza = e;
    }
    if (paramza.a(paramString))
    {
      this.f = paramString;
    }
    else
    {
      this.f = g(1);
      paramza = e;
    }
    this.i = paramza.b(this.f);
  }
  
  public String b()
  {
    return this.f;
  }
  
  public int a(int paramInt)
  {
    return 571;
  }
  
  FontMetrics b(int paramInt)
  {
    if ((this.h != paramInt) || (this.g == null))
    {
      Map localMap = zg.a(this.i.getAttributes(), paramInt, true);
      localMap.put(TextAttribute.SIZE, new Float(4096.0F));
      this.g = a.getFontMetrics(this.i.deriveFont(localMap));
    }
    return this.g;
  }
  
  public int c(int paramInt)
  {
    return b(paramInt).getMaxAscent() >> 1;
  }
  
  public int d(int paramInt)
  {
    return b(paramInt).getMaxDescent() >> 1;
  }
  
  public int e(int paramInt)
  {
    return 2048;
  }
  
  public int f(int paramInt)
  {
    return b(paramInt).getHeight() >> 1;
  }
  
  public final Font c()
  {
    return this.i;
  }
  
  private static String g(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "SansSerif";
    case 0: 
      return "Serif";
    }
    return "Monospaced";
  }
  
  static
  {
    e = new zb();
    e.a("Monospaced", new Font("Monospaced", 0, 10));
    e.a("SansSerif", new Font("SansSerif", 0, 10));
    e.a("Serif", new Font("Serif", 0, 10));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */