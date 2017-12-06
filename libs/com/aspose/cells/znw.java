package com.aspose.cells;

import com.aspose.cells.b.a.c.zd;
import com.aspose.cells.b.a.zc;

class znw
  extends zcd
{
  private static final com.aspose.cells.b.c.a.za a = new com.aspose.cells.b.c.a.za(new String[] { "BEL", "spa", "deu", "fra", "fre", "frm", "fro" });
  
  public znw(int paramInt1, int paramInt2)
  {
    c(140);
    b(4);
    this.b = new byte[4];
    com.aspose.cells.b.a.c.za localza = null;
    int i;
    if (paramInt1 == 0)
    {
      localza = com.aspose.cells.b.a.c.za.a();
      i = a(localza);
    }
    else
    {
      i = paramInt1;
    }
    System.arraycopy(zc.a(i), 0, this.b, 0, 2);
    if (paramInt2 == 0)
    {
      if (localza == null) {
        localza = com.aspose.cells.b.a.c.za.a();
      }
      i = a(zd.a(), localza);
    }
    else
    {
      i = paramInt2;
    }
    System.arraycopy(zc.a(i), 0, this.b, 2, 2);
  }
  
  private int a(zd paramzd, com.aspose.cells.b.a.c.za paramza)
  {
    try
    {
      switch (a.a(paramzd.b()))
      {
      case 0: 
        return 32;
      }
      return a(paramza);
    }
    catch (Exception localException) {}
    return a(paramza);
  }
  
  private int a(com.aspose.cells.b.a.c.za paramza)
  {
    switch (a.a(paramza.f()))
    {
    case 1: 
      return 34;
    case 2: 
      return 49;
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      return 33;
    }
    return 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/znw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */