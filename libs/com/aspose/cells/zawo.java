package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class zawo
  extends CollectionBase
{
  void a(byte[] paramArrayOfByte)
  {
    zf.a(this.InnerList, paramArrayOfByte);
  }
  
  public byte[] a(int paramInt)
  {
    return (byte[])this.InnerList.get(paramInt);
  }
  
  void a(zawp paramzawp)
  {
    byte[] arrayOfByte = null;
    arrayOfByte = new byte[] { 3, 0, 1, 0, 0, 0, 0, 0 };
    System.arraycopy(zc.a(paramzawp.b), 0, arrayOfByte, 2, 4);
    zf.a(this.InnerList, arrayOfByte);
    arrayOfByte = new byte[24];
    arrayOfByte[0] = 3;
    arrayOfByte[1] = 2;
    arrayOfByte[8] = (arrayOfByte[9] = arrayOfByte[10] = arrayOfByte[11] = -1);
    arrayOfByte[12] = 2;
    DateTime localDateTime = paramzawp.k;
    System.arraycopy(zc.a(CellsHelper.getDoubleFromDateTime(localDateTime, false)), 0, arrayOfByte, 14, 8);
    zf.a(this.InnerList, arrayOfByte);
    arrayOfByte = new byte[] { 3, -1, 0, 0, 0, 0, 0, 0 };
    zf.a(this.InnerList, arrayOfByte);
  }
  
  void a(PivotTable paramPivotTable)
  {
    byte[] arrayOfByte = null;
    String str = paramPivotTable.getName();
    int i = 10 + zct.a(str);
    arrayOfByte = new byte[i];
    System.arraycopy(zc.a((short)str.length()), 0, arrayOfByte, 2, 2);
    System.arraycopy(zc.a((short)str.length()), 0, arrayOfByte, 8, 2);
    zct.b(arrayOfByte, 10, str);
    zf.a(this.InnerList, arrayOfByte);
    arrayOfByte = new byte[] { 0, 2, 1, 65, 0, 0, 0, 0 };
    zf.a(this.InnerList, arrayOfByte);
    arrayOfByte = new byte[] { 0, -1, 0, 0, 0, 0, 0, 0 };
    zf.a(this.InnerList, arrayOfByte);
  }
  
  long a()
  {
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      byte[] arrayOfByte = (byte[])localIterator.next();
      if ((arrayOfByte[0] == 0) && (arrayOfByte[1] == 2)) {
        return zc.d(arrayOfByte, 2);
      }
    }
    return 16641L;
  }
  
  void a(long paramLong)
  {
    int i = -1;
    byte[] arrayOfByte = null;
    for (int j = 0; j < this.InnerList.size(); j++)
    {
      arrayOfByte = (byte[])this.InnerList.get(j);
      if ((arrayOfByte[0] == 0) && (arrayOfByte[1] == 2))
      {
        if (arrayOfByte[1] == 2)
        {
          System.arraycopy(zc.a(paramLong), 0, arrayOfByte, 2, 4);
          return;
        }
        if ((arrayOfByte[1] & 0xFF) == 255) {
          i = j;
        }
      }
    }
    arrayOfByte = new byte[] { 0, 2, 1, 65, 0, 0, 0, 0 };
    System.arraycopy(zc.a(paramLong), 0, arrayOfByte, 2, 4);
    if (i != -1)
    {
      this.InnerList.add(i, arrayOfByte);
    }
    else
    {
      zf.a(this.InnerList, arrayOfByte);
      arrayOfByte = new byte[] { 0, -1, 0, 0, 0, 0, 0, 0 };
      zf.a(this.InnerList, arrayOfByte);
    }
  }
  
  boolean b()
  {
    return (a() & 0xFFFFFFFF & 0x100) != 0L;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      a(a() | 0x100);
    } else {
      a(a() & 0xFFFFFEFF);
    }
  }
  
  void a(zawo paramzawo)
  {
    for (int i = 0; i < paramzawo.getCount(); i++)
    {
      byte[] arrayOfByte1 = paramzawo.a(i);
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
      a(arrayOfByte2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */