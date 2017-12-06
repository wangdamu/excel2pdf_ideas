package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.c.a.za;

class zcfi
  extends zche
{
  private static final za a = new za(new String[] { "#DIV/0!", "#N/A", "#NAME?", "#NULL!", "#NUM!", "#REF!", "#VALUE!" });
  
  zcfi()
  {
    this.d = 174;
  }
  
  void a(CustomFilter paramCustomFilter)
    throws Exception
  {
    int i = 10;
    int j = 0;
    int k = zcij.w(paramCustomFilter.getFilterOperatorType());
    Object localObject = paramCustomFilter.getCriteria();
    if (localObject != null)
    {
      switch (zaoj.a(localObject.getClass()))
      {
      case 18: 
        String str = (String)localObject;
        i += str.length() * 2 + 4;
        this.c = new byte[i];
        this.c[0] = 6;
        j = 10;
        j = zcgj.a(this.c, j, str);
        break;
      case 3: 
        this.c = new byte[i];
        this.c[0] = 8;
        if (((Boolean)localObject).booleanValue()) {
          this.c[2] = 1;
        }
        break;
      case 9: 
      case 14: 
        this.c = new byte[i];
        this.c[0] = 4;
        System.arraycopy(zc.a(((Double)localObject).doubleValue()), 0, this.c, 2, 8);
        break;
      default: 
        this.c = new byte[i];
      }
      this.c[1] = k;
    }
    else
    {
      this.c = new byte[i];
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */