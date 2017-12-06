package com.aspose.cells.a.d.a.b;

import com.aspose.cells.a.d.a.zb;
import java.awt.geom.AffineTransform;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class zr
  extends zs
{
  private int a;
  private byte[] b;
  
  public zr(int paramInt1, float paramFloat, int paramInt2, float[] paramArrayOfFloat, AffineTransform paramAffineTransform)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    zb localzb = new zb(localByteArrayOutputStream, true);
    try
    {
      localzb.b(paramInt1);
      localzb.writeFloat(paramFloat);
      int i = paramInt2 & 0x7;
      int j = ((paramArrayOfFloat != null) && (paramArrayOfFloat.length > 0)) || (i == 1) || (i == 3) || (i == 4) ? 1 : 0;
      int k;
      if (j == 0)
      {
        k = a(paramInt2);
        if (k > -1)
        {
          this.a |= 0x6;
          localzb.b(k);
          localzb.b(k);
        }
      }
      switch (paramInt2 & 0x3000)
      {
      case 4096: 
        this.a |= 0x8;
        localzb.b(1);
        break;
      case 0: 
        this.a |= 0x8;
        localzb.b(2);
      }
      if ((i >= 1) && (i <= 4))
      {
        this.a |= 0x20;
        localzb.b(i);
      }
      if (j != 0)
      {
        k = a(paramInt2);
        if (k > -1)
        {
          this.a |= 0x40;
          localzb.b(k);
        }
      }
      if ((paramArrayOfFloat != null) && (paramArrayOfFloat.length > 0))
      {
        this.a |= 0x100;
        localzb.b(paramArrayOfFloat.length);
        for (k = 0; k < paramArrayOfFloat.length; k++) {
          localzb.writeFloat(paramArrayOfFloat[k]);
        }
      }
      localzb.flush();
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("Fail to create EmfPlusPenData", localIOException);
    }
    this.b = localByteArrayOutputStream.toByteArray();
  }
  
  private int a(int paramInt)
  {
    switch (paramInt & 0x300)
    {
    case 256: 
      return 1;
    case 0: 
      return 2;
    }
    return -1;
  }
  
  public int b()
  {
    return 16392;
  }
  
  public int c()
  {
    return 4 + this.b.length;
  }
  
  public int a(zb paramzb)
    throws IOException
  {
    paramzb.b(this.a);
    paramzb.a(this.b);
    return 4 + this.b.length;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/b/zr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */