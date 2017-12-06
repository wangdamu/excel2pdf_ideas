package com.aspose.cells;

import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zr;

class zbrd
  extends zy
{
  private double e;
  private int f;
  
  public zbrd(zig paramzig, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    super(paramzig, paramString1, paramString2);
    this.f = paramInt2;
    switch (paramInt1)
    {
    case 0: 
      this.e = 24.0D;
      break;
    case 1: 
      this.e = 1440.0D;
      break;
    case 2: 
      this.e = 86400.0D;
      break;
    default: 
      this.e = 1.0D;
    }
  }
  
  public boolean e()
  {
    return true;
  }
  
  public boolean f()
  {
    return false;
  }
  
  protected void a(zzu paramzzu, DateTime paramDateTime, double paramDouble, StringBuilder paramStringBuilder)
  {
    int i;
    if (this.e > 72000.0D)
    {
      if (paramDouble < 0.0D) {
        i = (int)(paramDouble * this.e - 0.5D);
      } else {
        i = (int)(paramDouble * this.e + 0.5D);
      }
    }
    else {
      i = (int)(zr.b(paramDouble * 8.64E7D, 0) / 8.64E7D * this.e);
    }
    String str = zp.a(Math.abs(i));
    if (i < 0) {
      paramStringBuilder.append('-');
    }
    for (int j = str.length(); j < this.f; j++) {
      paramStringBuilder.append('0');
    }
    paramStringBuilder.append(str);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */