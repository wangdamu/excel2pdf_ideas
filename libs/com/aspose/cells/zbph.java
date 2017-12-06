package com.aspose.cells;

import com.aspose.cells.a.c.zm;
import com.aspose.cells.b.a.zr;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

class zbph
  extends zs
{
  private static final Method d;
  private static final Object[] e;
  private boolean f = true;
  private String g;
  private NumberFormat h;
  private String i;
  private NumberFormat j;
  private int k;
  private boolean l;
  private char m = '.';
  
  public zbph(zig paramzig, String paramString)
  {
    super(paramzig);
    if (paramString == null) {
      paramString = paramzig.b();
    }
    char[] arrayOfChar = paramString.toCharArray();
    b(arrayOfChar, 0, arrayOfChar.length);
    a(this.a.c());
  }
  
  private void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramInt2 - paramInt1 + 1);
    d(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder);
    paramArrayOfChar = localStringBuilder.toString().toCharArray();
    paramInt1 = 0;
    paramInt2 = paramArrayOfChar.length;
    localStringBuilder.setLength(0);
    int n = this.c.d() > -1 ? 1 : 0;
    int i1 = -1;
    this.k = -1;
    this.l = false;
    while (paramInt1 < paramInt2)
    {
      switch (paramArrayOfChar[paramInt1])
      {
      case '#': 
      case '0': 
        localStringBuilder.append((n != 0) && (this.k < 0) ? '0' : paramArrayOfChar[paramInt1]);
        break;
      case '.': 
        this.l = true;
        if (n != 0) {
          this.k = localStringBuilder.length();
        }
        localStringBuilder.append('.');
        break;
      case 'E': 
      case 'e': 
        if (i1 < 0)
        {
          i1 = localStringBuilder.length();
          if (this.k < 0) {
            this.k = i1;
          }
          localStringBuilder.append('E');
        }
        else
        {
          localStringBuilder.append(paramArrayOfChar[paramInt1]);
        }
        break;
      default: 
        paramInt1 = super.a(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder);
        break;
      }
      paramInt1++;
    }
    this.g = localStringBuilder.toString();
    if (this.k > -1)
    {
      this.c.a(false);
      if (this.k > 1) {
        if (this.l) {
          this.i = ("0" + this.g.substring(this.g.indexOf('.')));
        } else {
          this.i = ("0" + this.g.substring(this.g.indexOf('E')));
        }
      }
    }
  }
  
  protected int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    return paramInt1;
  }
  
  public double c(double paramDouble)
  {
    if ((paramDouble == 0.0D) || (paramDouble == -0.0D)) {
      return 0.0D;
    }
    return zr.b(paramDouble, this.c.b());
  }
  
  public void a(zzu paramzzu, double paramDouble, zzz paramzzz)
  {
    String str = null;
    int n;
    if ((paramDouble == 0.0D) || (paramDouble == -0.0D))
    {
      str = this.h.format(0.0D);
    }
    else
    {
      int i1;
      double d1;
      if (this.k > -1)
      {
        n = 0;
        if (paramDouble < 0.0D)
        {
          n = 1;
          paramDouble = -paramDouble;
        }
        i1 = (int)Math.floor(Math.log10(paramDouble));
        if ((this.k > 1) && (Math.abs(i1) <= this.k))
        {
          if (i1 < 65228)
          {
            n = 0;
            paramDouble = 0.0D;
          }
          else if (this.f)
          {
            i1 = this.c.b() - i1;
            if ((i1 > 65228) && (i1 < 307))
            {
              d1 = Math.pow(10.0D, i1);
              paramDouble = Math.round(paramDouble * d1 + 1.0E-15D) / d1;
            }
          }
          if ((n != 0) && (paramDouble != 0.0D)) {
            paramDouble = -paramDouble;
          }
          str = this.j.format(paramDouble);
        }
        else
        {
          if (i1 < 65228)
          {
            n = 0;
            paramDouble = 0.0D;
          }
          else if (this.f)
          {
            i1 = this.c.b() + this.k - i1 - 1;
            if ((i1 > 65228) && (i1 < 307))
            {
              d1 = Math.pow(10.0D, i1);
              paramDouble = Math.round(paramDouble * d1 + (this.k >= 16 ? 0.0D : Math.pow(10.0D, this.k - 16))) / d1;
            }
          }
          if ((n != 0) && (paramDouble != 0.0D)) {
            paramDouble = -paramDouble;
          }
          str = this.h.format(paramDouble);
        }
      }
      else if (this.f)
      {
        paramDouble = zm.b(paramDouble, this.c.b());
        str = this.h.format(paramDouble);
      }
      else
      {
        if (paramDouble != 0.0D)
        {
          if (paramDouble < 0.0D)
          {
            n = 1;
            paramDouble = -paramDouble;
          }
          else
          {
            n = 0;
          }
          if (paramDouble >= 1.0D) {
            i1 = (int)Math.log10(paramDouble) + 1;
          } else {
            i1 = (int)Math.floor(Math.log10(paramDouble)) + 1;
          }
          if ((i1 < 339) && (i1 > 65242))
          {
            d1 = Math.pow(10.0D, 15 - i1);
            paramDouble = Math.floor(paramDouble * d1 + 0.51D) / d1;
          }
          else
          {
            d1 = Math.pow(10.0D, 1 - i1);
            paramDouble = Math.floor(paramDouble * d1 * 1.0E14D + 0.51D) / d1 / 1.0E14D;
          }
          if (n != 0) {
            paramDouble = -paramDouble;
          }
        }
        str = this.h.format(paramDouble);
        if ((paramDouble < 0.0D) && (!str.equals("")) && (str.charAt(0) == '-'))
        {
          n = 1;
          for (int i4 : str.toCharArray()) {
            if ((i4 >= 49) && (i4 <= 57))
            {
              n = 0;
              break;
            }
          }
          if (n != 0) {
            str = str.substring(1);
          }
        }
      }
    }
    if (this.l)
    {
      n = str.indexOf(this.m);
      if (n < 0)
      {
        ??? = new StringBuilder(str.length() + 1);
        ((StringBuilder)???).append(str);
        if (this.k > -1)
        {
          ??? = str.indexOf('E');
          ((StringBuilder)???).insert(???, this.m);
        }
        else
        {
          ((StringBuilder)???).append(this.m);
        }
        str = ((StringBuilder)???).toString();
      }
    }
    if (this.k > -1)
    {
      if ((this.c.f()) && (this.l))
      {
        n = str.indexOf(this.m);
        if ((n < str.length() - 2) && (str.charAt(n + 1) == '0') && (str.charAt(n + 2) == 'E'))
        {
          ??? = new StringBuilder(str);
          ((StringBuilder)???).deleteCharAt(n + 1);
          str = ((StringBuilder)???).toString();
        }
      }
    }
    else if ((this.c.e()) && (Math.abs(paramDouble) < 1.0D)) {
      if (this.l)
      {
        n = str.indexOf(this.m);
        if ((n > 0) && (str.charAt(n - 1) == '0'))
        {
          ??? = new StringBuilder(str);
          ((StringBuilder)???).deleteCharAt(n - 1);
          if ((n == str.length() - 1) && (str.charAt(0) == '-')) {
            ((StringBuilder)???).deleteCharAt(0);
          }
          str = ((StringBuilder)???).toString();
        }
      }
      else if (str.equals("0"))
      {
        str = "";
      }
    }
    zom localzom = this.a.g();
    if (localzom != null) {
      str = localzom.a(str);
    }
    paramzzz.a(2, str);
  }
  
  private void a(zzx paramzzx)
  {
    DecimalFormatSymbols localDecimalFormatSymbols = new DecimalFormatSymbols(paramzzx.a().h());
    com.aspose.cells.a.a.za localza = paramzzx.f();
    if ((localza.b()) && (localza.d != localDecimalFormatSymbols.getDecimalSeparator())) {
      localDecimalFormatSymbols.setDecimalSeparator(localza.d);
    }
    if ((localza.c()) && (localza.e != localDecimalFormatSymbols.getGroupingSeparator())) {
      localDecimalFormatSymbols.setGroupingSeparator(localza.e);
    }
    this.h = new DecimalFormat(this.g, localDecimalFormatSymbols);
    if (this.i != null) {
      this.j = new DecimalFormat(this.i, localDecimalFormatSymbols);
    }
    if (d != null) {
      try
      {
        d.invoke(this.h, e);
        if (this.j != null) {
          d.invoke(this.j, e);
        }
        this.f = (com.aspose.cells.a.za.c > 3);
      }
      catch (Exception localException)
      {
        this.f = true;
      }
    }
    if (this.l) {
      this.m = localza.d();
    }
  }
  
  static
  {
    Method localMethod = null;
    Object[] arrayOfObject = null;
    try
    {
      localMethod = DecimalFormat.class.getMethod("setRoundingMode", new Class[] { RoundingMode.class });
      arrayOfObject = new Object[] { RoundingMode.HALF_UP };
    }
    catch (Exception localException) {}
    d = localMethod;
    e = arrayOfObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */