package com.aspose.cells;

import com.aspose.cells.b.a.d.zb;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import java.io.IOException;

class zsg
{
  static zbes a(zm paramzm, int paramInt1, long paramLong, int paramInt2)
    throws Exception
  {
    zh localzh = new zh();
    byte[] arrayOfByte = new byte['Ȁ'];
    paramzm.b(76L);
    int i = Math.min(paramInt1, 109) * 4;
    paramzm.a(arrayOfByte, 0, i);
    localzh.b(arrayOfByte, 0, i);
    long l = paramLong;
    for (int j = 0; j < paramInt2; j++)
    {
      paramzm.b(zbet.a(l, true));
      if (paramzm.i() >= paramzm.h()) {
        throw new IOException("The file is corrupted.");
      }
      paramzm.a(arrayOfByte, 0, 512);
      int k = 508;
      localzh.b(arrayOfByte, 0, k);
      l = arrayOfByte[k] & 0xFF | (arrayOfByte[(k + 1)] & 0xFF) << 8 | (arrayOfByte[(k + 2)] & 0xFF) << 16 | (arrayOfByte[(k + 3)] & 0xFF) << 24;
    }
    return new zbes(localzh);
  }
  
  static void a(zm paramzm, long paramLong, int paramInt, zagp paramzagp)
    throws Exception
  {
    long l1 = paramLong;
    zb localzb = new zb(paramzm, Encoding.getUnicode());
    long l2 = paramzm.i();
    paramzm.b(76L);
    int i = Math.min(paramInt, 109);
    for (int j = 0; j < i; j++)
    {
      localzb.a(l1 & 0xFFFFFFFF);
      l1 += 1L;
    }
    zbet.a(localzb);
    paramzm.b(l2);
    j = paramInt - i;
    if (j > 0)
    {
      paramzagp.k = zbet.b(paramzm.i(), true);
      paramzagp.l = 0;
      while (j > 0)
      {
        int k = Math.min(j, 127);
        for (int m = 0; m < k; m++)
        {
          localzb.a(l1 & 0xFFFFFFFF);
          l1 += 1L;
        }
        zbet.a(localzb);
        j -= k;
        paramzagp.l += 1;
        paramzm.b(paramzm.i() - 4L);
        if (j > 0)
        {
          long l3 = (zbet.b(paramzm.i(), true) & 0xFFFFFFFF) + 1L;
          localzb.a(l3 & 0xFFFFFFFF);
        }
        else
        {
          localzb.a(4294967294L);
        }
      }
    }
    paramzagp.k = 4294967294L;
    paramzagp.l = 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */