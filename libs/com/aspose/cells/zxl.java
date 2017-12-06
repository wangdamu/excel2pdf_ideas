package com.aspose.cells;

import com.aspose.cells.a.c.zh;

class zxl
{
  private zbni d;
  private boolean e = false;
  private Color f = Color.getEmpty();
  private zxj g = null;
  boolean a = false;
  boolean b = false;
  int c = 1;
  
  zxl(zbni paramzbni)
  {
    this.d = paramzbni;
  }
  
  public boolean a()
  {
    if ((zh.a(this.f)) && (c() == null)) {
      return true;
    }
    return this.e;
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public Color b()
  {
    return this.f;
  }
  
  public void a(Color paramColor)
  {
    this.f = paramColor;
  }
  
  public zxj c()
  {
    if (this.g == null) {
      return new zxj(this);
    }
    return this.g;
  }
  
  public void a(zxj paramzxj)
  {
    this.g = paramzxj;
  }
  
  public boolean d()
  {
    return this.g != null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */