package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbvb
  extends zcd
{
  zbvb(zbva paramzbva)
  {
    c(2064);
    b(16);
    String str = paramzbva.b;
    if (str != null) {
      b(d() + (short)zct.a(str));
    } else {
      b(d() + 1);
    }
    this.b = new byte[d()];
    this.b[0] = 16;
    this.b[1] = 8;
    int i = paramzbva.a;
    System.arraycopy(zc.a(i), 0, this.b, 8, 4);
    System.arraycopy(zc.a(a(paramzbva.a())), 0, this.b, 12, 2);
    if (str != null)
    {
      System.arraycopy(zc.a(str.length()), 0, this.b, 14, 2);
      zct.b(this.b, 16, str);
    }
  }
  
  private static int a(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return 4096;
    case 3: 
      return 4097;
    case 4: 
      return 4098;
    case 5: 
      return 4099;
    case 6: 
      return 4100;
    case 7: 
      return 4101;
    case 8: 
      return 4102;
    case 9: 
      return 4103;
    case 10: 
      return 4104;
    case 11: 
      return 4105;
    case 12: 
      return 4106;
    case 13: 
      return 4107;
    case 14: 
      return 4108;
    case 15: 
      return 4109;
    case 16: 
      return 4110;
    case 17: 
      return 4111;
    case 18: 
      return 4112;
    case 19: 
      return 4113;
    case 20: 
      return 4114;
    case 21: 
      return 4115;
    case 0: 
      return 4117;
    case 1: 
      return 1;
    }
    return 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */