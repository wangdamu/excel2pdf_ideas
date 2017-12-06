package com.aspose.cells;

import com.aspose.cells.b.a.c.za;
import com.aspose.cells.b.a.c.zc;
import com.aspose.cells.b.a.zp;

class zbrc
  extends zy
{
  private int e;
  
  public zbrc(zig paramzig, String paramString1, String paramString2, int paramInt)
  {
    super(paramzig, paramString1, paramString2);
    this.e = paramInt;
  }
  
  protected void a(zzu paramzzu, DateTime paramDateTime, double paramDouble, StringBuilder paramStringBuilder)
  {
    int i = paramDateTime.getMillisecond();
    switch (this.e)
    {
    case 1: 
      i = (int)(i / 100.0F);
      break;
    case 2: 
      i = (int)(i / 10.0F);
    }
    paramStringBuilder.append(this.a.c().a().d().c());
    String str = zp.a(i);
    for (int j = str.length(); j < this.e; j++) {
      paramStringBuilder.append('0');
    }
    paramStringBuilder.append(str);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */