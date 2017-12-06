package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbew
  extends ArrayList
{
  private Worksheet a;
  
  public zbew(Worksheet paramWorksheet)
  {
    this.a = paramWorksheet;
  }
  
  zbev a(int paramInt)
  {
    for (int i = 0; i < size(); i++)
    {
      zbev localzbev = (zbev)get(i);
      if ((localzbev.a() & 0xFF) == paramInt) {
        return localzbev;
      }
    }
    return null;
  }
  
  byte a()
  {
    int i = 3;
    if (this.a.getPanes() != null) {
      i = this.a.b().a() & 0xFF;
    }
    return (byte)i;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    int i = a();
    for (int j = 0; j < size(); j++)
    {
      zbev localzbev = (zbev)get(j);
      if (localzbev.a() == i) {
        localzbev.a(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean);
      }
    }
  }
  
  String b()
  {
    int i = a() & 0xFF;
    int j = size();
    switch (j)
    {
    case 0: 
      return "A1";
    }
    for (int k = 0; k < size(); k++)
    {
      zbev localzbev = (zbev)get(k);
      if ((localzbev.a() & 0xFF) == i) {
        return CellsHelper.cellIndexToName(localzbev.c(), localzbev.d());
      }
    }
    return "A1";
  }
  
  void a(String paramString)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(paramString, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    int k = size();
    int m = a() & 0xFF;
    zbev localzbev;
    switch (k)
    {
    case 0: 
      localzbev = new zbev(m);
      localzbev.a(i, j);
      zf.a(this, localzbev);
      break;
    default: 
      for (int n = 0; n < size(); n++)
      {
        localzbev = (zbev)get(n);
        if ((localzbev.a() & 0xFF) == m)
        {
          localzbev = new zbev(m);
          localzbev.a(i, j);
          set(n, localzbev);
          break;
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */