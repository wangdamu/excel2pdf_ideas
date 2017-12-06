package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zg;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.IOException;

public class zcs
  extends zg
{
  private Rectangle b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private Color m;
  private BufferedImage n;
  
  public zcs()
  {
    super(81, 1);
  }
  
  public zcs(Rectangle paramRectangle, int paramInt1, int paramInt2, int paramInt3, int paramInt4, BufferedImage paramBufferedImage, Color paramColor)
  {
    this();
    this.b = paramRectangle;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
    this.g = 0;
    this.h = 0;
    this.i = paramBufferedImage.getWidth();
    this.j = paramBufferedImage.getHeight();
    this.k = 0;
    this.l = 13369376;
    this.m = paramColor;
    this.n = paramBufferedImage;
  }
  
  public void a(int paramInt, com.aspose.cells.a.d.a.zb paramzb)
    throws IOException
  {
    paramzb.a(this.b);
    paramzb.f(this.c);
    paramzb.f(this.d);
    paramzb.f(this.g);
    paramzb.f(this.h);
    paramzb.f(this.i);
    paramzb.f(this.j);
    paramzb.b(80);
    paramzb.b(40);
    paramzb.b(120);
    ColorModel localColorModel = this.n.getColorModel();
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
    byte[] arrayOfByte = com.aspose.cells.a.d.b.zb.a(this.n, this.m, str, i1);
    paramzb.b(arrayOfByte.length);
    paramzb.b(this.k);
    paramzb.b(this.l);
    paramzb.f(this.e);
    paramzb.f(this.f);
    int i3 = 0;
    zn localzn = new zn(this.n.getWidth(), this.n.getHeight(), i2, i3, arrayOfByte.length, 0, 0, 0, 0);
    paramzb.write(localzn.a());
    paramzb.write(arrayOfByte);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */