package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.za;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.WritableRaster;

public class zac
{
  public static void a(za paramza, byte[][] paramArrayOfByte, int[] paramArrayOfInt)
    throws Exception
  {
    int[] arrayOfInt = ((DataBufferInt)paramza.f().getRaster().getDataBuffer()).getData();
    paramArrayOfByte[0] = new byte[arrayOfInt.length * 4];
    paramArrayOfInt[0] = (paramArrayOfByte[0].length / paramza.h());
    for (int i = 0; i < arrayOfInt.length; i++)
    {
      paramArrayOfByte[0][(i * 4 + 0)] = ((byte)(arrayOfInt[i] & 0xFF));
      paramArrayOfByte[0][(i * 4 + 1)] = ((byte)(arrayOfInt[i] >> 8 & 0xFF));
      paramArrayOfByte[0][(i * 4 + 2)] = ((byte)(arrayOfInt[i] >> 16 & 0xFF));
      paramArrayOfByte[0][(i * 4 + 3)] = ((byte)(arrayOfInt[i] >> 24 & 0xFF));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */