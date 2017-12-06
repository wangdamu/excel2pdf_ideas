package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class znt
  extends zcd
{
  znt()
  {
    c(60);
  }
  
  void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a((short)paramInt2);
    this.b = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, this.b, 0, paramInt2);
  }
  
  void a(String paramString, zrg paramzrg)
    throws Exception
  {
    int i = 1;
    Object localObject = Encoding.getUnicode().a(paramString);
    for (int j = 0; j < localObject.length / 2; j++) {
      if (localObject[(2 * j + 1)] != 0)
      {
        i = 0;
        break;
      }
    }
    if (i != 0)
    {
      byte[] arrayOfByte = new byte[paramString.length()];
      for (m = 0; m < paramString.length(); m++) {
        arrayOfByte[m] = localObject[(2 * m)];
      }
      localObject = arrayOfByte;
    }
    int k = 0;
    int m = 0;
    for (;;)
    {
      m = localObject.length - k;
      if (m + 1 <= 8224) {
        break;
      }
      if (i != 0)
      {
        a((short)8224);
        this.b = new byte[d()];
        this.b[0] = 0;
      }
      else
      {
        b(8223);
        this.b = new byte[d()];
        this.b[0] = 1;
      }
      System.arraycopy(localObject, k, this.b, 1, d() - 1);
      k += d() - 1;
      a(paramzrg);
    }
    a((short)(m + 1));
    this.b = new byte[d()];
    this.b[0] = ((byte)(i != 0 ? 0 : 1));
    System.arraycopy(localObject, k, this.b, 1, d() - 1);
  }
  
  void a(ArrayList paramArrayList)
  {
    a((short)(paramArrayList.size() * 8));
    this.b = new byte[d()];
    int i = 0;
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zbwh localzbwh = (zbwh)localIterator.next();
      System.arraycopy(zc.a(localzbwh.a), 0, this.b, i, 2);
      System.arraycopy(zc.a(localzbwh.b), 0, this.b, i + 2, 2);
      i += 8;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/znt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */