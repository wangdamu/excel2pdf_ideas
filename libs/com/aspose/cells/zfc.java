package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zfc
  extends zcd
{
  zfc()
  {
    c(2171);
  }
  
  void a(zzt paramzzt)
  {
    FormatCondition localFormatCondition = paramzzt.a;
    int i = 18;
    i += 8;
    if (paramzzt.c != null) {
      i += paramzzt.c();
    }
    i += 17;
    a((short)i);
    this.b = new byte[i];
    this.b[0] = 123;
    this.b[1] = 8;
    int j = 12;
    j += 4;
    System.arraycopy(zc.a((short)paramzzt.e), 0, this.b, j, 2);
    j += 2;
    System.arraycopy(zc.a((short)paramzzt.b), 0, this.b, j, 2);
    j += 2;
    this.b[j] = zfd.a(localFormatCondition.getType() == 0 ? localFormatCondition.getOperator() : 6);
    j++;
    this.b[j] = ((byte)zfb.a(localFormatCondition));
    j++;
    System.arraycopy(zc.a(localFormatCondition.getPriority()), 0, this.b, j, 2);
    j += 2;
    this.b[j] = 1;
    if (localFormatCondition.getStopIfTrue())
    {
      int tmp194_192 = j;
      byte[] tmp194_189 = this.b;
      tmp194_189[tmp194_192] = ((byte)(tmp194_189[tmp194_192] | 0x2));
    }
    j++;
    if (paramzzt.c != null)
    {
      this.b[j] = 1;
      j++;
      j = zfb.a(paramzzt.d, paramzzt.c, this.b, j);
    }
    else
    {
      j++;
    }
    j = zfb.a(localFormatCondition, this.b, j);
  }
  
  void a(int paramInt)
  {
    b(18);
    this.b = new byte[d()];
    this.b[0] = 123;
    this.b[1] = 8;
    this.b[12] = 1;
    System.arraycopy(zc.a(paramInt), 0, this.b, 16, 2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */