package com.aspose.cells;

class zcdp
  extends zche
{
  zcdp(zbos paramzbos)
  {
    if ((paramzbos.b) || (paramzbos.c)) {
      this.d = 30;
    } else {
      this.d = 23;
    }
    int i = 1;
    if ((paramzbos.b) || (paramzbos.c)) {
      i = (short)(i + 6);
    }
    this.c = new byte[i];
    if ("#NULL!".equals((String)paramzbos.a)) {
      this.c[0] = 0;
    } else if ("#DIV/0!".equals((String)paramzbos.a)) {
      this.c[0] = 7;
    } else if ("#VALUE!".equals((String)paramzbos.a)) {
      this.c[0] = 15;
    } else if ("#REF!".equals((String)paramzbos.a)) {
      this.c[0] = 23;
    } else if ("#NAME?".equals((String)paramzbos.a)) {
      this.c[0] = 29;
    } else if ("#NUM!".equals((String)paramzbos.a)) {
      this.c[0] = 36;
    } else if ("#N/A".equals((String)paramzbos.a)) {
      this.c[0] = 42;
    }
    if (paramzbos.b) {
      this.c[1] = 2;
    }
    if (paramzbos.c)
    {
      int tmp266_265 = 1;
      byte[] tmp266_262 = this.c;
      tmp266_262[tmp266_265] = ((byte)(tmp266_262[tmp266_265] | 0x1));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */