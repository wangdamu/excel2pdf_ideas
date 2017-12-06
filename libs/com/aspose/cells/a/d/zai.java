package com.aspose.cells.a.d;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.HashMap;

public class zai
{
  private byte[] a;
  private int b;
  private HashMap c;
  private ArrayList d = new ArrayList();
  
  public zai(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
    this.c = new HashMap();
  }
  
  public HashMap a()
  {
    while (this.b < this.a.length) {
      b();
    }
    return this.c;
  }
  
  private void b()
  {
    byte[] arrayOfByte = new byte[5];
    arrayOfByte[0] = d();
    if (((arrayOfByte[0] & 0xFF) >= 0) && ((arrayOfByte[0] & 0xFF) <= 21))
    {
      if (arrayOfByte[0] == 12) {
        this.c.put(Integer.valueOf(1200 + (d() & 0xFF)), this.d);
      } else {
        this.c.put(Integer.valueOf(arrayOfByte[0] & 0xFF), this.d);
      }
      this.d = new ArrayList();
      return;
    }
    if (arrayOfByte[0] == 30)
    {
      zf.a(this.d, Double.valueOf(c()));
      return;
    }
    if (((arrayOfByte[0] & 0xFF) >= 32) && ((arrayOfByte[0] & 0xFF) <= 246))
    {
      zf.a(this.d, Integer.valueOf((arrayOfByte[0] & 0xFF) - 139));
      return;
    }
    arrayOfByte[1] = d();
    if (((arrayOfByte[0] & 0xFF) >= 247) && ((arrayOfByte[0] & 0xFF) <= 250))
    {
      zf.a(this.d, Integer.valueOf(((arrayOfByte[0] & 0xFF) - 247) * 256 + (arrayOfByte[1] & 0xFF) + 108));
      return;
    }
    if (((arrayOfByte[0] & 0xFF) >= 251) && ((arrayOfByte[0] & 0xFF) <= 254))
    {
      zf.a(this.d, Integer.valueOf(-1 * ((arrayOfByte[0] & 0xFF) - 251) * 256 - (arrayOfByte[1] & 0xFF) - 108));
      return;
    }
    arrayOfByte[2] = d();
    if (arrayOfByte[0] == 28)
    {
      zf.a(this.d, Short.valueOf((short)((arrayOfByte[1] & 0xFF) << 8 | arrayOfByte[2] & 0xFF)));
      return;
    }
    arrayOfByte[3] = d();
    arrayOfByte[4] = d();
    if (arrayOfByte[0] == 29)
    {
      zf.a(this.d, Integer.valueOf((arrayOfByte[1] & 0xFF) << 24 | (arrayOfByte[2] & 0xFF) << 16 | (arrayOfByte[3] & 0xFF) << 8 | arrayOfByte[4] & 0xFF));
      return;
    }
    throw new IllegalArgumentException("DICT operand does not fall in either of acceptable values.");
  }
  
  private double c()
  {
    int i = 0;
    StringBuilder localStringBuilder = new StringBuilder();
    while (i == 0)
    {
      int j = (short)(d() & 0xFF);
      short[] arrayOfShort = new short[2];
      arrayOfShort[0] = ((short)((j & 0xF0) >> 4));
      arrayOfShort[1] = ((short)(j & 0xF));
      for (int k = 0; k < 2; k++) {
        if ((arrayOfShort[k] >= 0) && (arrayOfShort[k] <= 9)) {
          localStringBuilder.append(arrayOfShort[k]);
        } else {
          switch (arrayOfShort[k])
          {
          case 10: 
            localStringBuilder.append(".");
            break;
          case 11: 
            localStringBuilder.append("E");
            break;
          case 12: 
            localStringBuilder.append("E-");
            break;
          case 13: 
            throw new IllegalArgumentException("Reserved nibble value.");
          case 14: 
            localStringBuilder.append("-");
            break;
          case 15: 
            i = 1;
            if (k != 0) {
              break;
            }
          }
        }
      }
    }
    return zp.a(zs.a(localStringBuilder));
  }
  
  private byte d()
  {
    return this.a[(this.b++)];
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */