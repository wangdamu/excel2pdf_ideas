package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zg;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.IOException;

public class zs
  extends zg
{
  private int b;
  private int c;
  private BufferedImage d;
  
  public zs()
  {
    super(94, 1);
  }
  
  public zs(int paramInt, BufferedImage paramBufferedImage)
  {
    super(94, 1);
    this.b = paramInt;
    AffineTransform localAffineTransform = new AffineTransform();
    localAffineTransform.rotate(3.141592653589793D, paramBufferedImage.getWidth() / 2, paramBufferedImage.getHeight() / 2);
    AffineTransformOp localAffineTransformOp = new AffineTransformOp(localAffineTransform, 2);
    this.d = localAffineTransformOp.filter(paramBufferedImage, null);
    this.c = 0;
  }
  
  public void a(int paramInt, com.aspose.cells.a.d.a.zb paramzb)
    throws IOException
  {
    paramzb.b(this.b);
    paramzb.b(this.c);
    int i = 32;
    paramzb.b(i);
    paramzb.b(40);
    paramzb.b(i + 40);
    ColorModel localColorModel = this.d.getColorModel();
    boolean bool = localColorModel.hasAlpha();
    int j = 4;
    String str = "*BGR";
    int k = 24;
    if (bool)
    {
      str = "*BGRA";
      j = 1;
      k = 32;
    }
    byte[] arrayOfByte = com.aspose.cells.a.d.b.zb.a(this.d, null, str, j);
    paramzb.b(arrayOfByte.length);
    int m = 0;
    zn localzn = new zn(this.d.getWidth(), this.d.getHeight(), k, m, arrayOfByte.length, 0, 0, 0, 0);
    paramzb.write(localzn.a());
    paramzb.write(arrayOfByte);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */