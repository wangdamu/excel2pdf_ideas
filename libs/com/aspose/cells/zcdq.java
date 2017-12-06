package com.aspose.cells;

class zcdq
  extends zche
{
  zcdq(zbos paramzbos)
  {
    if ((paramzbos.b) || (paramzbos.c)) {
      this.d = 27;
    } else {
      this.d = 20;
    }
    if ((paramzbos.b) || (paramzbos.c))
    {
      int i = 6;
      this.c = new byte[i];
    }
    if (paramzbos.b) {
      this.c[0] = 2;
    }
    if (paramzbos.c)
    {
      int tmp83_82 = 0;
      byte[] tmp83_79 = this.c;
      tmp83_79[tmp83_82] = ((byte)(tmp83_79[tmp83_82] | 0x1));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */