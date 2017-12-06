package com.aspose.cells.b.a.b.a;

import com.aspose.cells.b.a.b.zc;
import java.awt.Paint;
import java.awt.TexturePaint;
import java.awt.geom.Rectangle2D.Float;
import java.awt.image.BufferedImage;

public class zg
  extends zc
{
  private static byte[] a;
  private int b;
  private com.aspose.cells.Color c;
  private com.aspose.cells.Color d;
  
  public zg(int paramInt, com.aspose.cells.Color paramColor1, com.aspose.cells.Color paramColor2)
  {
    this.b = paramInt;
    this.c = paramColor2;
    this.d = paramColor1;
  }
  
  public Paint g()
  {
    byte[] arrayOfByte1 = new byte[8];
    System.arraycopy(a, this.b * 8, arrayOfByte1, 0, 8);
    java.awt.Color[] arrayOfColor = new java.awt.Color[2];
    arrayOfColor[0] = b().d();
    arrayOfColor[1] = c().d();
    int i = arrayOfColor[0].getRGB();
    int j = arrayOfColor[1].getRGB();
    byte[] arrayOfByte2 = null;
    if (i())
    {
      arrayOfByte2 = new byte[64];
      for (int k = 0; k < 8; k++) {
        for (m = 0; m < 8; m++)
        {
          int n = (arrayOfByte2[k] & 0xFF & 128 >> m) > 0 ? 1 : 0;
          arrayOfByte2[(m + k * 8)] = ((byte)(arrayOfColor[n].getAlpha() & 0xFF));
        }
      }
    }
    else
    {
      arrayOfByte2 = new byte[0];
    }
    BufferedImage localBufferedImage = new BufferedImage(8, 8, 5);
    for (int m = 0; m < 8; m++)
    {
      localBufferedImage.setRGB(0, m, arrayOfColor[(arrayOfByte1[m] & 0x1)].getRGB());
      localBufferedImage.setRGB(1, m, arrayOfColor[(arrayOfByte1[m] >> 1 & 0x1)].getRGB());
      localBufferedImage.setRGB(2, m, arrayOfColor[(arrayOfByte1[m] >> 2 & 0x1)].getRGB());
      localBufferedImage.setRGB(3, m, arrayOfColor[(arrayOfByte1[m] >> 3 & 0x1)].getRGB());
      localBufferedImage.setRGB(4, m, arrayOfColor[(arrayOfByte1[m] >> 4 & 0x1)].getRGB());
      localBufferedImage.setRGB(5, m, arrayOfColor[(arrayOfByte1[m] >> 5 & 0x1)].getRGB());
      localBufferedImage.setRGB(6, m, arrayOfColor[(arrayOfByte1[m] >> 6 & 0x1)].getRGB());
      localBufferedImage.setRGB(7, m, arrayOfColor[(arrayOfByte1[m] >> 7 & 0x1)].getRGB());
    }
    Rectangle2D.Float localFloat = new Rectangle2D.Float(0.0F, 0.0F, 8.0F, 8.0F);
    return new TexturePaint(localBufferedImage, localFloat);
  }
  
  public zg a()
  {
    return new zg(this.b, this.d, this.c);
  }
  
  public void f() {}
  
  public void h() {}
  
  public com.aspose.cells.Color b()
  {
    return this.c;
  }
  
  public com.aspose.cells.Color c()
  {
    return this.d;
  }
  
  public int d()
  {
    return this.b;
  }
  
  public boolean i()
  {
    return ((b().getA() & 0xFF) < 255) || ((c().getA() & 0xFF) < 255);
  }
  
  /* Error */
  static
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 25	com/aspose/cells/a/c/zz:a	(Ljava/lang/String;)Lcom/aspose/cells/b/a/d/zm;
    //   5: astore_0
    //   6: aload_0
    //   7: invokevirtual 34	com/aspose/cells/b/a/d/zm:h	()J
    //   10: l2i
    //   11: newarray <illegal type>
    //   13: putstatic 19	com/aspose/cells/b/a/b/a/zg:a	[B
    //   16: aload_0
    //   17: getstatic 19	com/aspose/cells/b/a/b/a/zg:a	[B
    //   20: iconst_0
    //   21: getstatic 19	com/aspose/cells/b/a/b/a/zg:a	[B
    //   24: arraylength
    //   25: invokevirtual 33	com/aspose/cells/b/a/d/zm:a	([BII)I
    //   28: pop
    //   29: aload_0
    //   30: ifnull +21 -> 51
    //   33: aload_0
    //   34: invokevirtual 32	com/aspose/cells/b/a/d/zm:a	()V
    //   37: goto +14 -> 51
    //   40: astore_1
    //   41: aload_0
    //   42: ifnull +7 -> 49
    //   45: aload_0
    //   46: invokevirtual 32	com/aspose/cells/b/a/d/zm:a	()V
    //   49: aload_1
    //   50: athrow
    //   51: goto +13 -> 64
    //   54: astore_0
    //   55: new 16	java/lang/RuntimeException
    //   58: dup
    //   59: aload_0
    //   60: invokespecial 41	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   63: athrow
    //   64: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   5	41	0	localzm	com.aspose.cells.b.a.d.zm
    //   54	6	0	localException	Exception
    //   40	10	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   6	29	40	finally
    //   0	51	54	java/lang/Exception
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/a/zg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */