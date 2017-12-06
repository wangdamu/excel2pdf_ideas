package com.aspose.cells;

import com.aspose.cells.b.a.zo;

class zne
{
  private double a;
  private double b;
  private String c = "i";
  
  public double a()
  {
    return this.a;
  }
  
  public void a(double paramDouble)
  {
    this.a = paramDouble;
  }
  
  public double b()
  {
    return this.b;
  }
  
  public void b(double paramDouble)
  {
    this.b = paramDouble;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public zne()
  {
    this.a = 0.0D;
    this.b = 0.0D;
    this.c = "i";
  }
  
  public zne(double paramDouble1, double paramDouble2)
  {
    this.a = paramDouble1;
    this.b = paramDouble2;
    this.c = "i";
  }
  
  public zne(double paramDouble1, double paramDouble2, String paramString)
  {
    this.a = paramDouble1;
    this.b = paramDouble2;
    this.c = paramString;
  }
  
  public zne(String paramString)
  {
    String str = a(paramString);
    this.c = b(paramString);
    a(paramString, str, this.c);
  }
  
  private String a(String paramString)
  {
    int i = paramString.indexOf("-");
    if (paramString.indexOf("+") != -1) {
      return "+";
    }
    if ((i != -1) && (i != 0)) {
      return "-";
    }
    return "";
  }
  
  private String b(String paramString)
  {
    if (paramString.indexOf("i") != -1) {
      return "i";
    }
    if (paramString.indexOf("j") != -1) {
      return "j";
    }
    return "";
  }
  
  private void a(String paramString1, String paramString2, String paramString3)
  {
    int i = 0;
    int j = paramString1.length();
    String str1;
    if (paramString2.length() == 0)
    {
      if (paramString3.length() == 0)
      {
        this.a = zo.a(paramString1);
      }
      else
      {
        str1 = paramString1.substring(0, 0 + (j - 1));
        if (str1.equals("-")) {
          this.b = -1.0D;
        } else if (str1.length() == 0) {
          this.b = 1.0D;
        } else {
          this.b = zo.a(str1);
        }
      }
    }
    else
    {
      i = paramString1.indexOf(paramString2);
      j = paramString1.length();
      str1 = paramString1.substring(0, 0 + i);
      String str2 = paramString1.substring(i + 1, i + 1 + (j - i - 2));
      if (str2.length() == 0) {
        str2 = "1";
      }
      str1 = str1.trim();
      str2 = str2.trim();
      if (str1.length() != 0) {
        this.a = zo.a(str1);
      }
      if (paramString2.equals("-")) {
        this.b = (-zo.a(str2));
      } else {
        this.b = zo.a(str2);
      }
    }
  }
  
  public String toString()
  {
    String str;
    if (this.a != 0.0D)
    {
      if (this.b > 0.0D)
      {
        if (this.b == 1.0D) {
          str = zo.b(this.a) + "+" + this.c;
        } else {
          str = zo.b(this.a) + "+" + zo.b(this.b) + this.c;
        }
      }
      else if (this.b < 0.0D)
      {
        if (this.b == -1.0D)
        {
          str = zo.b(this.a) + "-" + this.c;
        }
        else
        {
          double d = -1.0D * this.b;
          str = zo.b(this.a) + "-" + zo.b(d) + this.c;
        }
      }
      else {
        str = zo.b(this.a);
      }
    }
    else if (this.b == 0.0D) {
      str = zo.b(this.a);
    } else if (this.b == -1.0D) {
      str = "-" + this.c;
    } else if (this.b == 1.0D) {
      str = this.c;
    } else {
      str = zo.b(this.b) + this.c;
    }
    return str;
  }
  
  public zne a(zne paramzne)
  {
    double d1 = this.a + paramzne.a;
    double d2 = this.b + paramzne.b;
    String str = "i";
    if ((paramzne.c.equals("j")) || (this.c.equals("j"))) {
      str = "j";
    }
    return new zne(d1, d2, str);
  }
  
  public zne b(zne paramzne)
  {
    double d1 = this.a - paramzne.a;
    double d2 = this.b - paramzne.b;
    String str = "i";
    if ((paramzne.c.equals("j")) || (this.c.equals("j"))) {
      str = "j";
    }
    return new zne(d1, d2, str);
  }
  
  public zne c(zne paramzne)
  {
    double d1 = this.a * paramzne.a - this.b * paramzne.b;
    double d2 = this.a * paramzne.b + this.b * paramzne.a;
    String str = "i";
    if ((paramzne.c.equals("j")) || (this.c.equals("j"))) {
      str = "j";
    }
    return new zne(d1, d2, str);
  }
  
  public zne d(zne paramzne)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    d1 = this.a * paramzne.a + this.b * paramzne.b;
    d2 = this.b * paramzne.a - this.a * paramzne.b;
    d3 = paramzne.a * paramzne.a + paramzne.b * paramzne.b;
    double d4 = d1 / d3;
    double d5 = d2 / d3;
    String str = "i";
    if ((paramzne.c.equals("j")) || (this.c.equals("j"))) {
      str = "j";
    }
    return new zne(d4, d5, str);
  }
  
  public double d()
  {
    return Math.sqrt(this.a * this.a + this.b * this.b);
  }
  
  public zne e()
  {
    double d = Math.log(Math.sqrt(this.a * this.a + this.b * this.b));
    return new zne(d, Math.atan2(this.b, this.a), this.c);
  }
  
  public zne f()
  {
    double d1 = Math.sqrt(this.a * this.a + this.b * this.b);
    double d2 = Math.atan2(this.b, this.a);
    if (this.c.length() == 0) {
      this.c = "i";
    }
    return new zne(Math.sqrt(d1) * Math.cos(d2 / 2.0D), Math.sqrt(d1) * Math.sin(d2 / 2.0D), this.c);
  }
  
  public zne g()
  {
    if (this.c.length() == 0) {
      this.c = "i";
    }
    return new zne(Math.sin(this.a) * Math.cosh(this.b), Math.cos(this.a) * Math.sinh(this.b), this.c);
  }
  
  public zne h()
  {
    if (this.c.length() == 0) {
      this.c = "i";
    }
    double d1 = Math.cos(this.a) * Math.cosh(this.b);
    double d2 = -(Math.sin(this.a) * Math.sinh(this.b));
    return new zne(d1, d2, this.c);
  }
  
  public zne c(double paramDouble)
  {
    if (this.c.length() == 0) {
      this.c = "i";
    }
    double d1 = Math.sqrt(this.a * this.a + this.b * this.b);
    double d2 = Math.atan2(this.b, this.a);
    double d3 = Math.pow(d1, paramDouble) * Math.cos(paramDouble * d2);
    double d4 = Math.pow(d1, paramDouble) * Math.sin(paramDouble * d2);
    return new zne(d3, d4, this.c);
  }
  
  public zne i()
  {
    if (this.c.length() == 0) {
      this.c = "i";
    }
    double d1 = Math.pow(2.718281828459045D, this.a) * Math.cos(this.b);
    double d2 = Math.pow(2.718281828459045D, this.a) * Math.sin(this.b);
    return new zne(d1, d2, this.c);
  }
  
  public double j()
  {
    return Math.atan2(this.b, this.a);
  }
  
  public zne k()
  {
    return new zne(this.a, -this.b, this.c);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zne.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */