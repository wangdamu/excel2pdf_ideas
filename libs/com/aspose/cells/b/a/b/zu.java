package com.aspose.cells.b.a.b;

import com.aspose.cells.Color;
import java.awt.Paint;

public class zu
  extends zc
{
  private Color a;
  
  public zu(Color paramColor)
  {
    this.a = paramColor;
  }
  
  public Object e()
  {
    return new zu(Color.fromArgb(this.a.toArgb()));
  }
  
  public void f() {}
  
  public void h() {}
  
  public Paint g()
  {
    return this.a.d();
  }
  
  public Color a()
  {
    return this.a;
  }
  
  public void a(Color paramColor)
  {
    this.a = paramColor;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */