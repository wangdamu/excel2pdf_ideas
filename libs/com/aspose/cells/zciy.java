package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;

class zciy
{
  String a(zwh paramzwh, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('=');
    byte[] arrayOfByte = paramzwh.f();
    String[] arrayOfString = paramzwh.a().c();
    int i = 4;
    if (paramBoolean) {
      i = 2;
    }
    if ((arrayOfByte == null) || (arrayOfByte.length <= i)) {
      return null;
    }
    int j;
    int k;
    int m;
    int n;
    int i1;
    switch (arrayOfByte[i])
    {
    case 58: 
      j = zc.e(arrayOfByte, i + 1) & 0xFFFF;
      k = zc.e(arrayOfByte, i + 3) & 0xFFFF;
      localStringBuilder.append(arrayOfString[j]);
      if (j != k)
      {
        localStringBuilder.append(':');
        localStringBuilder.append(arrayOfString[k]);
      }
      localStringBuilder.append('!');
      m = zc.e(arrayOfByte, i + 5) & 0xFFFF;
      n = arrayOfByte[(i + 7)] & 0xFF;
      i1 = arrayOfByte[(i + 8)];
      if ((i1 & 0xFF & 0x40) == 0) {
        localStringBuilder.append('$');
      }
      CellsHelper.a(localStringBuilder, n);
      if ((i1 & 0xFF & 0x80) == 0) {
        localStringBuilder.append('$');
      }
      localStringBuilder.append(m + 1);
      return zs.a(localStringBuilder);
    case 59: 
      j = zc.e(arrayOfByte, i + 1) & 0xFFFF;
      k = zc.e(arrayOfByte, i + 3) & 0xFFFF;
      if ((j == 65535) || (j == 65534)) {
        return "#REF!";
      }
      localStringBuilder.append(arrayOfString[j]);
      if (j != k)
      {
        localStringBuilder.append(':');
        localStringBuilder.append(arrayOfString[k]);
      }
      localStringBuilder.append('!');
      m = zc.e(arrayOfByte, i + 5) & 0xFFFF;
      n = zc.e(arrayOfByte, i + 7) & 0xFFFF;
      i1 = arrayOfByte[(i + 9)] & 0xFF;
      int i2 = arrayOfByte[(i + 11)] & 0xFF;
      int i3;
      if ((m == 0) && (n == 65535))
      {
        i3 = arrayOfByte[(i + 10)];
        if ((i3 & 0xFF & 0x40) == 0) {
          localStringBuilder.append('$');
        }
        CellsHelper.a(localStringBuilder, i1);
        localStringBuilder.append(':');
        i3 = arrayOfByte[(i + 12)];
        if ((i3 & 0xFF & 0x40) == 0) {
          localStringBuilder.append('$');
        }
        CellsHelper.a(localStringBuilder, i2);
      }
      else if ((i1 == 0) && (i2 == 255))
      {
        i3 = arrayOfByte[(i + 10)];
        if ((i3 & 0xFF & 0x80) == 0) {
          localStringBuilder.append('$');
        }
        localStringBuilder.append(m + 1);
        localStringBuilder.append(':');
        i3 = arrayOfByte[(i + 12)];
        if ((i3 & 0xFF & 0x80) == 0) {
          localStringBuilder.append('$');
        }
        localStringBuilder.append(n + 1);
      }
      else
      {
        i3 = arrayOfByte[(i + 10)];
        if ((i3 & 0xFF & 0x40) == 0) {
          localStringBuilder.append('$');
        }
        CellsHelper.a(localStringBuilder, i1);
        if ((i3 & 0xFF & 0x80) == 0) {
          localStringBuilder.append('$');
        }
        localStringBuilder.append(m + 1);
        localStringBuilder.append(':');
        i3 = arrayOfByte[(i + 12)];
        if ((i3 & 0xFF & 0x40) == 0) {
          localStringBuilder.append('$');
        }
        CellsHelper.a(localStringBuilder, i2);
        if ((i3 & 0xFF & 0x80) == 0) {
          localStringBuilder.append('$');
        }
        localStringBuilder.append(n + 1);
      }
      return zs.a(localStringBuilder);
    case 60: 
    case 61: 
      return "#REF!";
    }
    return "#REF!";
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zciy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */