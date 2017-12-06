package com.aspose.cells.a.d.a;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.IOException;

public class ze
{
  private Rectangle a;
  private Rectangle b;
  private String c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private String i;
  private int j;
  private Dimension k;
  private Dimension l;
  private Dimension m;
  private boolean n;
  
  public ze(Rectangle paramRectangle, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Dimension paramDimension1, Dimension paramDimension2)
  {
    this.a = paramRectangle;
    this.l = paramDimension2;
    double d1 = paramDimension2.width / paramDimension1.width;
    double d2 = paramDimension2.height / paramDimension1.height;
    this.b = new Rectangle((int)(paramRectangle.x * 100 * d1), (int)(paramRectangle.y * 100 * d2), (int)(paramRectangle.width * 100 * d1), (int)(paramRectangle.height * 100 * d2));
    this.c = " EMF";
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramInt4;
    this.h = paramInt5;
    this.i = "Aspose.Cells";
    this.j = 0;
    this.k = paramDimension1;
    this.n = false;
    this.m = new Dimension(paramDimension2.width * 1000, paramDimension2.height * 1000);
  }
  
  public void a(zb paramzb)
    throws IOException
  {
    int i1 = paramzb.f();
    int i2 = (i1 - a() % i1) % i1;
    int i3 = a() + i2;
    paramzb.b(1);
    paramzb.b(i3);
    paramzb.a(this.a);
    paramzb.a(this.b);
    paramzb.b(this.c.getBytes());
    paramzb.b(this.d << 16 | this.e);
    paramzb.b(i3 + this.f);
    paramzb.b(this.g);
    paramzb.c(this.h);
    paramzb.c(0);
    paramzb.b(this.i.length());
    paramzb.b(108);
    paramzb.b(this.j);
    paramzb.a(this.k);
    paramzb.a(this.l);
    paramzb.b(0);
    paramzb.b(0);
    paramzb.c(this.n);
    paramzb.a(this.m);
    paramzb.a(this.i);
    for (int i4 = 0; i4 < i2; i4++) {
      paramzb.write(0);
    }
  }
  
  public int a()
  {
    return 108 + 2 * this.i.length();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/ze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */