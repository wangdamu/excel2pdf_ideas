package com.aspose.cells;

class zcdn
  extends zche
{
  zcdn(zbos paramzbos)
  {
    if ((paramzbos.b) || (paramzbos.c)) {
      this.d = 29;
    } else {
      this.d = 22;
    }
    int i = 1;
    if ((paramzbos.b) || (paramzbos.c)) {
      i = (short)(i + 6);
    }
    this.c = new byte[i];
    if (((Boolean)paramzbos.a).booleanValue()) {
      this.c[0] = 1;
    }
    if (paramzbos.b) {
      this.c[1] = 2;
    }
    if (paramzbos.c)
    {
      int tmp108_107 = 1;
      byte[] tmp108_104 = this.c;
      tmp108_104[tmp108_107] = ((byte)(tmp108_104[tmp108_107] | 0x1));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */