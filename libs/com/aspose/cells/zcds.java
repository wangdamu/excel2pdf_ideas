package com.aspose.cells;

class zcds
  extends zche
{
  zcds(zbos paramzbos)
    throws Exception
  {
    if ((paramzbos.b) || (paramzbos.c)) {
      this.d = 31;
    } else {
      this.d = 24;
    }
    int i = 0;
    i += ((String)paramzbos.a).length() * 2 + 4;
    if ((paramzbos.b) || (paramzbos.c)) {
      i += 6;
    }
    this.c = new byte[i];
    int j = 0;
    j = zcgj.a(this.c, j, (String)paramzbos.a);
    if (paramzbos.b)
    {
      int tmp106_105 = j;
      byte[] tmp106_102 = this.c;
      tmp106_102[tmp106_105] = ((byte)(tmp106_102[tmp106_105] | 0x2));
    }
    if (paramzbos.c)
    {
      int tmp124_123 = j;
      byte[] tmp124_120 = this.c;
      tmp124_120[tmp124_123] = ((byte)(tmp124_120[tmp124_123] | 0x1));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */