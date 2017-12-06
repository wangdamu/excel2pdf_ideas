package com.aspose.cells;

import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.zp;

class znu
  extends zaet
{
  public znu(zaeo paramzaeo)
  {
    this.a = paramzaeo;
  }
  
  public int a(String[] paramArrayOfString)
    throws Exception
  {
    if (paramArrayOfString[0].length() < 2)
    {
      paramArrayOfString[0] = "";
      return 1;
    }
    switch (paramArrayOfString[0].charAt(1))
    {
    case '&': 
      this.a.h += "&";
      this.a.g = this.a.a;
      break;
    case 'P': 
      int i = 0;
      int j = this.a.k;
      int k = 2;
      if ((paramArrayOfString[0].length() > 3) && (((paramArrayOfString[0].charAt(k) == '+') && (paramArrayOfString[0].charAt(k + 1) == '+')) || ((paramArrayOfString[0].charAt(k) == '-') && (paramArrayOfString[0].charAt(k + 1) == '-'))))
      {
        this.a.h += j + i;
        this.a.h += paramArrayOfString[0].charAt(k);
        this.a.g = this.a.a;
        paramArrayOfString[0] = paramArrayOfString[0].substring(k + 2);
        return 1;
      }
      if ((paramArrayOfString[0].length() > 2) && ((paramArrayOfString[0].charAt(k) == '+') || (paramArrayOfString[0].charAt(k) == '-')))
      {
        k++;
        if (paramArrayOfString[0].length() > 3)
        {
          while ((k < paramArrayOfString[0].length()) && (Character.isDigit(paramArrayOfString[0].charAt(k)))) {
            k++;
          }
          if (k > 3) {
            i = zp.a(paramArrayOfString[0].substring(2, 2 + (k - 2)), 7);
          }
        }
      }
      this.a.h += j + i;
      this.a.g = this.a.a;
      paramArrayOfString[0] = paramArrayOfString[0].substring(k);
      return 1;
    case 'N': 
      this.a.h += zp.a(this.a.l);
      this.a.g = this.a.a;
      break;
    case 'D': 
      DateTime localDateTime1 = DateTime.getNow();
      this.a.h += this.a.j.d().getSettings().f().a(14, localDateTime1).h();
      this.a.g = this.a.a;
      break;
    case 'T': 
      DateTime localDateTime2 = DateTime.getNow();
      this.a.h += localDateTime2.a();
      this.a.g = this.a.a;
      break;
    case 'A': 
      this.a.h += this.a.j.getName();
      this.a.g = this.a.a;
      break;
    case 'Z': 
      try
      {
        this.a.h += zk.e(this.a.j.d().getFileName());
      }
      catch (Exception localException1) {}
      this.a.g = this.a.a;
      break;
    case 'F': 
      try
      {
        this.a.h += zk.b(this.a.j.d().getFileName());
      }
      catch (Exception localException2) {}
      this.a.g = this.a.a;
      break;
    case 'G': 
      this.a.g = this.a.d;
      return 1;
    case ' ': 
      this.a.g = this.a.a;
      break;
    case '=': 
      this.a.g = this.a.a;
      break;
    default: 
      if ((this.a.h != null) && (this.a.h.length() > 0)) {
        this.a.d();
      }
      this.a.g = this.a.e;
      return 1;
    }
    paramArrayOfString[0] = paramArrayOfString[0].substring(2);
    return 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/znu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */