package com.aspose.cells;

import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;

class zbdb
{
  zq a = new zq(0.0F, 0.0F, 0.0F, 0.0F);
  int b;
  zt c;
  private zg d;
  private String e = "";
  private Color f;
  
  zbdb(String paramString, zg paramzg, Color paramColor, int paramInt)
  {
    this.e = paramString;
    this.d = paramzg;
    this.f = paramColor;
    this.b = paramInt;
    if ((paramInt == 2) && ((paramString == null) || ("".equals(paramString)))) {
      this.b = 1;
    }
  }
  
  public String a()
  {
    return this.e;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public zg b()
  {
    return this.d;
  }
  
  public Color c()
  {
    return this.f;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */