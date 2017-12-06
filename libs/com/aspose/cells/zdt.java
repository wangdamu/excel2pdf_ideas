package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zdt
  extends zche
{
  zdt(ConnectionParameter paramConnectionParameter)
    throws Exception
  {
    this.d = 267;
    int i = 12 + paramConnectionParameter.b.length() * 2;
    int j = 0;
    int k = 0;
    String str = null;
    byte[] arrayOfByte = null;
    if (paramConnectionParameter.getType() == 1)
    {
      j = 0;
      str = paramConnectionParameter.getPrompt();
      if (str != null)
      {
        k = 1;
        i += 4 + str.length() * 2;
      }
    }
    else if (paramConnectionParameter.c == 0)
    {
      j = 2;
      arrayOfByte = (byte[])paramConnectionParameter.a;
      i += arrayOfByte.length;
    }
    else
    {
      j = 1;
      if ((paramConnectionParameter.getValue() instanceof Boolean))
      {
        k = 4;
        i++;
      }
      else if ((paramConnectionParameter.getValue() instanceof Double))
      {
        k = 1;
        i += 8;
      }
      else if ((paramConnectionParameter.getValue() instanceof Integer))
      {
        k = 2048;
        i += 8;
      }
      else if ((paramConnectionParameter.getValue() instanceof String))
      {
        k = 2;
        i += 4 + ((String)paramConnectionParameter.getValue()).length() * 2;
      }
    }
    this.c = new byte[i];
    int m = 0;
    if (paramConnectionParameter.d) {
      j = (byte)(j | 0x8);
    }
    this.c[m] = j;
    m += 2;
    int n = zwl.g(paramConnectionParameter.e);
    System.arraycopy(zc.a(n), 0, this.c, m, 2);
    m += 2;
    System.arraycopy(zc.a(k), 0, this.c, m, 4);
    m += 4;
    m = zcgj.a(this.c, m, paramConnectionParameter.b);
    if (paramConnectionParameter.getType() == 1)
    {
      if (str != null) {
        zcgj.a(this.c, m, str);
      }
    }
    else if (paramConnectionParameter.c == 0) {
      System.arraycopy(arrayOfByte, 0, this.c, m, arrayOfByte.length);
    } else if ((paramConnectionParameter.getValue() instanceof Boolean)) {
      this.c[m] = ((byte)(((Boolean)paramConnectionParameter.getValue()).booleanValue() ? 0 : 1));
    } else if ((paramConnectionParameter.getValue() instanceof Double)) {
      System.arraycopy(zc.a(((Double)paramConnectionParameter.getValue()).doubleValue()), 0, this.c, m, 8);
    } else if ((paramConnectionParameter.getValue() instanceof Integer)) {
      System.arraycopy(zc.a(((Integer)paramConnectionParameter.getValue()).intValue()), 0, this.c, m, 8);
    } else if ((paramConnectionParameter.getValue() instanceof String)) {
      zcgj.a(this.c, m, (String)paramConnectionParameter.getValue());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */