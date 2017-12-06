package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.HashMap;

class zchn
{
  static zbbj a(byte[] paramArrayOfByte, int paramInt, zqh paramzqh)
    throws Exception
  {
    int i = (paramArrayOfByte[paramInt] & 0xFF & 0x1) != 0 ? 1 : 0;
    int j = (paramArrayOfByte[paramInt] & 0xFF & 0x2) != 0 ? 1 : 0;
    paramInt++;
    String str1 = null;
    Object localObject1 = { paramInt };
    str1 = zcgj.a(paramArrayOfByte, (int[])localObject1);
    paramInt = localObject1[0];
    localObject1 = null;
    zawa localzawa = null;
    Object localObject2 = null;
    int n;
    int i1;
    if (i != 0)
    {
      int k = zc.a(paramArrayOfByte, paramInt);
      localObject1 = new byte[k * 4];
      paramInt += 4;
      for (int m = 0; m < k; m++)
      {
        System.arraycopy(paramArrayOfByte, paramInt, localObject1, m * 4, 4);
        n = zc.e(paramArrayOfByte, paramInt + 2) & 0xFFFF;
        if (n < paramzqh.c().size())
        {
          i1 = ((Integer)paramzqh.c().get(Integer.valueOf(n))).intValue();
          System.arraycopy(zc.a(i1), 0, localObject1, m * 4 + 2, 2);
        }
        paramInt += 4;
      }
    }
    if (j != 0)
    {
      localzawa = new zawa();
      localzawa.c = new zavz();
      int[] arrayOfInt = { paramInt };
      String str2 = zcgj.a(paramArrayOfByte, arrayOfInt);
      paramInt = arrayOfInt[0];
      n = zc.a(paramArrayOfByte, paramInt);
      paramInt += 4;
      for (i1 = 0; i1 < n; i1++)
      {
        zavy localzavy = new zavy();
        int i2 = zc.e(paramArrayOfByte, paramInt) & 0xFFFF;
        int i3;
        if (paramInt + 12 < paramArrayOfByte.length)
        {
          localzavy.c = str2.substring(i2);
        }
        else
        {
          i3 = zc.e(paramArrayOfByte, paramInt + 12) & 0xFFFF;
          localzavy.c = str2.substring(i2, i2 + (i3 - i2 + 1));
        }
        localzavy.a = (zc.e(paramArrayOfByte, paramInt + 2) & 0xFFFF);
        localzavy.b = (zc.e(paramArrayOfByte, paramInt + 4) & 0xFFFF);
        if (i1 == 0)
        {
          i3 = zc.e(paramArrayOfByte, paramInt + 6) & 0xFFFF;
          if (i3 < paramzqh.c().size()) {
            i3 = ((Integer)paramzqh.c().get(Integer.valueOf(i3))).intValue();
          }
          localzawa.b = i3;
          localzawa.a = paramArrayOfByte[(paramInt + 8)];
        }
        paramInt += 12;
      }
    }
    if (localzawa != null) {
      localObject2 = new zawb(str1, (byte[])localObject1, localzawa);
    } else if (localObject1 != null) {
      localObject2 = new zbdd(str1, (byte[])localObject1, 0);
    } else {
      localObject2 = new zbbj(str1, 0);
    }
    return (zbbj)localObject2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */