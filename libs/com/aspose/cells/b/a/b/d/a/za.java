package com.aspose.cells.b.a.b.d.a;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.b.a.b.zg;
import java.awt.FontMetrics;

public final class za
  implements Cloneable
{
  private final String a;
  private final zg b;
  private zgs c;
  
  public za(String paramString, zgs paramzgs, zg paramzg)
  {
    this.a = paramString;
    this.b = paramzg;
    this.c = paramzgs;
  }
  
  public int a(FontMetrics paramFontMetrics, int paramInt, float paramFloat)
  {
    float f = 0.0F;
    for (int i = paramInt; i < this.a.length(); i++)
    {
      int j = this.a.charAt(i);
      if (j == 10) {
        return i;
      }
      String str = this.a.substring(paramInt, i + 1);
      f = zn.a(paramFontMetrics, this.c, str, this.b.g(), this.b.i(), this.b.k());
      if (f > paramFloat) {
        return i;
      }
    }
    return this.a.length();
  }
  
  public String a(int paramInt1, int paramInt2)
  {
    return this.a.substring(paramInt1, paramInt2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/d/a/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */