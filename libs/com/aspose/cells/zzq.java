package com.aspose.cells;

import com.aspose.cells.b.a.zp;

class zzq
  extends zaet
{
  public zzq(zaeo paramzaeo)
  {
    this.a = paramzaeo;
  }
  
  public int a(String[] paramArrayOfString)
  {
    int j = 1;
    int i;
    switch (paramArrayOfString[0].charAt(j))
    {
    case 'B': 
      if (this.a.i.isBold()) {
        this.a.i.setBold(false);
      } else {
        this.a.i.setBold(true);
      }
      break;
    case 'I': 
      if (this.a.i.isItalic()) {
        this.a.i.setItalic(false);
      } else {
        this.a.i.setItalic(true);
      }
      break;
    case 'U': 
      if (this.a.i.getUnderline() == 1) {
        this.a.i.setUnderline(0);
      } else {
        this.a.i.setUnderline(1);
      }
      break;
    case 'E': 
      if (this.a.i.getUnderline() == 2) {
        this.a.i.setUnderline(0);
      } else {
        this.a.i.setUnderline(2);
      }
      break;
    case 'S': 
      if (this.a.i.isStrikeout()) {
        this.a.i.setStrikeout(false);
      } else {
        this.a.i.setStrikeout(true);
      }
      break;
    case 'X': 
      if (this.a.i.isSuperscript()) {
        this.a.i.setSuperscript(false);
      } else {
        this.a.i.setSuperscript(true);
      }
      break;
    case 'Y': 
      if (this.a.i.isSubscript()) {
        this.a.i.setSubscript(false);
      } else {
        this.a.i.setSubscript(true);
      }
      break;
    case 'K': 
      if (j + 6 >= paramArrayOfString[0].length()) {
        throw new CellsException(6, "Invalid font color of the page header/footer");
      }
      try
      {
        int k;
        if ((paramArrayOfString[0].charAt(j + 3) == '+') || (paramArrayOfString[0].charAt(j + 3) == '-'))
        {
          k = zp.a(paramArrayOfString[0].substring(j + 1, j + 1 + 2));
          double d = zp.a(paramArrayOfString[0].substring(j + 3, j + 3 + 4)) / 100.0F;
          zaml localzaml = new zaml(false);
          localzaml.a(4, k);
          localzaml.a(d);
          this.a.i.a(localzaml);
        }
        else
        {
          k = zp.a(paramArrayOfString[0].substring(j + 1, j + 1 + 2), 515);
          int m = zp.a(paramArrayOfString[0].substring(j + 3, j + 3 + 2), 515);
          int n = zp.a(paramArrayOfString[0].substring(j + 5, j + 5 + 2), 515);
          this.a.i.setColor(Color.fromArgb(k, m, n));
        }
      }
      catch (Exception localException)
      {
        this.a.i.setColor(Color.fromArgb(0, 0, 0));
      }
      j += 6;
      break;
    case '"': 
      j++;
      i = j;
      while ((j < paramArrayOfString[0].length()) && (paramArrayOfString[0].charAt(j) != '"')) {
        j++;
      }
      if (j - i >= 0)
      {
        String str = paramArrayOfString[0].substring(i, i + (j - i));
        this.a.a(str);
      }
      break;
    default: 
      i = j;
      j++;
      while ((j < paramArrayOfString[0].length()) && (Character.isDigit(paramArrayOfString[0].charAt(j)))) {
        j++;
      }
      this.a.i.setSize(zp.a(paramArrayOfString[0].substring(i, i + (j - i))));
      j--;
    }
    paramArrayOfString[0] = paramArrayOfString[0].substring(j + 1);
    this.a.g = this.a.a;
    return 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */