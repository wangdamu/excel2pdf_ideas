package com.aspose.cells;

import java.util.HashMap;

class zbvj
  implements zajn
{
  private ListObjectCollection a;
  private HashMap b;
  
  public zbvj(ListObjectCollection paramListObjectCollection)
  {
    this.a = paramListObjectCollection;
    this.b = new HashMap();
  }
  
  public void a(int paramInt1, int paramInt2, zgt paramzgt)
  {
    if (paramzgt.c)
    {
      long l = paramInt1 << 48 | paramzgt.b << 24 | paramInt2;
      Object localObject = this.b.get(Long.valueOf(l));
      Style localStyle2;
      if (localObject != null)
      {
        localStyle2 = (Style)localObject;
      }
      else
      {
        Style localStyle3 = this.a.get(paramInt1).n(paramInt2);
        localStyle2 = new Style(paramzgt.a.e());
        localStyle2.copy(paramzgt.a);
        zla.a(localStyle2, localStyle3, localStyle3.e().Q());
        this.b.put(Long.valueOf(l), localStyle2);
      }
      paramzgt.c = false;
      paramzgt.a = new Style(paramzgt.a.e());
      paramzgt.a.copy(localStyle2);
    }
    else
    {
      Style localStyle1 = this.a.get(paramInt1).n(paramInt2);
      zla.a(paramzgt.a, this.a.get(paramInt1).n(paramInt2), paramzgt.a.e().Q());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */