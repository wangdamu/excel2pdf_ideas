package com.aspose.cells;

import com.aspose.cells.b.a.b.zt;

class zbss
  extends zaet
{
  public zbss(zaeo paramzaeo)
  {
    this.a = paramzaeo;
  }
  
  public int a(String[] paramArrayOfString)
    throws Exception
  {
    for (int i = 0; i < paramArrayOfString[0].length(); i++)
    {
      switch (paramArrayOfString[0].charAt(i))
      {
      case '\n': 
      case '\r': 
        this.a.d();
        this.a.g = this.a.a;
        paramArrayOfString[0] = paramArrayOfString[0].substring(i);
        return 1;
      case '&': 
        this.a.d();
        this.a.g = this.a.a;
        paramArrayOfString[0] = paramArrayOfString[0].substring(i);
        return 1;
      }
      if (this.a.r)
      {
        this.a.h += paramArrayOfString[0].charAt(i);
        if (((paramArrayOfString[0].charAt(i) == '-') || (paramArrayOfString[0].charAt(i) == ' ')) && (zavt.a(this.a.h, this.a.i, this.a.q).b() > this.a.o))
        {
          this.a.d();
          this.a.g = this.a.a;
          paramArrayOfString[0] = ("\n" + paramArrayOfString[0].substring(i + 1));
          return 1;
        }
      }
      else
      {
        if ((paramArrayOfString[0].charAt(i) == '-') || (paramArrayOfString[0].charAt(i) == ' '))
        {
          this.a.d();
          this.a.h = Character.toString(paramArrayOfString[0].charAt(i));
          this.a.d();
          paramArrayOfString[0] = paramArrayOfString[0].substring(i + 1);
          return 1;
        }
        this.a.h += paramArrayOfString[0].charAt(i);
      }
    }
    this.a.d();
    paramArrayOfString[0] = "";
    return 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */