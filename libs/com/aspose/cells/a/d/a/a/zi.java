package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zg;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.IOException;

public class zi
  extends zg
{
  private Rectangle b;
  private int c;
  private int d;
  private int e;
  private int f;
  private zo g;
  private int h;
  private int i;
  private AffineTransform j;
  private Color k;
  private int l;
  private BufferedImage m;
  
  public zi()
  {
    super(114, 1);
  }
  
  public void a(int paramInt, com.aspose.cells.a.d.a.zb paramzb)
    throws IOException
  {
    paramzb.a(this.b);
    paramzb.f(this.c);
    paramzb.f(this.d);
    paramzb.f(this.e);
    paramzb.f(this.f);
    int n = 3;
    n = this.m.getTransparency();
    switch (n)
    {
    case 1: 
      this.g.a(255);
      this.g.b(0);
      break;
    case 3: 
      this.g.a(255);
      this.g.b(1);
      break;
    case 2: 
      this.g.a(0);
      this.g.b(0);
    }
    this.g.a(paramzb);
    paramzb.f(this.h);
    paramzb.f(this.i);
    paramzb.a(this.j);
    paramzb.a(this.k);
    paramzb.b(this.l);
    paramzb.b(108);
    paramzb.b(40);
    paramzb.b(148);
    ColorModel localColorModel = this.m.getColorModel();
    boolean bool = localColorModel.hasAlpha();
    int i1 = 4;
    String str = "*BGR";
    int i2 = 24;
    if (bool)
    {
      str = "*BGRA";
      i1 = 1;
      i2 = 32;
    }
    byte[] arrayOfByte = com.aspose.cells.a.d.b.zb.a(this.m, this.k, str, i1);
    paramzb.b(arrayOfByte.length);
    paramzb.f(this.m.getWidth());
    paramzb.f(this.m.getHeight());
    int i3 = 0;
    zn localzn = new zn(this.m.getWidth(), this.m.getHeight(), i2, i3, arrayOfByte.length, 0, 0, 0, 0);
    paramzb.write(localzn.a());
    paramzb.write(arrayOfByte);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */