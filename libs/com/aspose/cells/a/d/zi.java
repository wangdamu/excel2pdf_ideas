package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import java.awt.GradientPaint;
import java.awt.Paint;

class zi
  extends zc
{
  private zo a;
  private zo b;
  private Color c;
  private Color d;
  private float e;
  
  public zi(zo paramzo1, zo paramzo2, Color paramColor1, Color paramColor2, float paramFloat)
  {
    this.a = paramzo1.c();
    this.b = paramzo2.c();
    this.c = paramColor1.a();
    this.d = paramColor2.a();
    this.e = 1.0F;
  }
  
  public Color a()
  {
    return this.d;
  }
  
  public Color b()
  {
    return this.c;
  }
  
  public zo c()
  {
    return this.b;
  }
  
  public zo d()
  {
    return this.a;
  }
  
  public Object e()
  {
    return new zi(this.a.c(), this.b.c(), this.c.a(), this.d.a(), this.e);
  }
  
  public void f() {}
  
  public Paint g()
  {
    GradientPaint localGradientPaint = new GradientPaint((float)zao.a(this.a.d(), 96.0D), (float)zao.a(this.a.e(), 96.0D), this.c.d(), (float)zao.a(this.b.d(), 96.0D), (float)zao.a(this.b.e(), 96.0D), this.d.d());
    return localGradientPaint;
  }
  
  public void h() {}
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */