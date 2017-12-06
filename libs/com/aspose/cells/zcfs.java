package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcfs
  extends zche
{
  zcfs()
  {
    this.d = 370;
  }
  
  void a(zwj paramzwj)
  {
    this.c = new byte[5];
    System.arraycopy(zc.a(paramzwj.a), 0, this.c, 0, 4);
    int i = a((zuf)paramzwj.b);
    this.c[4] = i;
  }
  
  static byte a(zuf paramzuf)
  {
    switch (zcft.a[paramzuf.ordinal()])
    {
    case 1: 
      return 0;
    case 2: 
      return 7;
    case 3: 
      return 15;
    case 4: 
      return 23;
    case 5: 
      return 29;
    case 6: 
      return 36;
    case 7: 
      return 42;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */