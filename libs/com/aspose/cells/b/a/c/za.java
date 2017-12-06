package com.aspose.cells.b.a.c;

import com.aspose.cells.a.c.zj;
import com.aspose.cells.zamr;
import java.util.Locale;

public class za
{
  private Locale a;
  private int b;
  private zc c;
  private zb d;
  private boolean e = false;
  private static final za f = new za(Locale.US, true);
  private static final za g = new za(Locale.getDefault());
  
  public za(Locale paramLocale)
  {
    this.a = paramLocale;
    this.b = zamr.a(paramLocale.getLanguage(), paramLocale.getCountry(), paramLocale.getVariant());
    this.e = false;
    this.c = new zc(this, false);
    this.d = new zb(this);
  }
  
  public za(int paramInt, boolean paramBoolean)
  {
    this.a = zj.b((short)paramInt);
    this.b = paramInt;
    this.e = paramBoolean;
    this.c = new zc(this, paramBoolean);
    this.d = new zb(this);
  }
  
  public za(Locale paramLocale, boolean paramBoolean)
  {
    this.a = paramLocale;
    this.b = zamr.a(paramLocale.getLanguage(), paramLocale.getCountry(), paramLocale.getVariant());
    this.e = paramBoolean;
    this.c = new zc(this, paramBoolean);
    this.d = new zb(this);
  }
  
  public static za a()
  {
    return g;
  }
  
  public static za b()
  {
    return f;
  }
  
  public boolean c()
  {
    return this.e;
  }
  
  public zc d()
  {
    return this.c;
  }
  
  public zb e()
  {
    return this.d;
  }
  
  public String f()
  {
    return this.a.getISO3Language();
  }
  
  public int g()
  {
    return this.b;
  }
  
  public Locale h()
  {
    return this.a;
  }
  
  public boolean equals(Object another)
  {
    if (another == null) {
      return false;
    }
    if (this == another) {
      return true;
    }
    if (!(another instanceof za)) {
      return false;
    }
    return a((za)another);
  }
  
  public boolean a(za paramza)
  {
    if (paramza == null) {
      return false;
    }
    if (this.a.equals(paramza.a)) {
      return true;
    }
    boolean bool = false;
    String str1 = this.a.getCountry();
    String str2;
    if (str1 != null)
    {
      str2 = paramza.a.getCountry();
      if (str2 != null)
      {
        if (!str1.equals(str2)) {
          return false;
        }
        bool = true;
      }
    }
    str1 = this.a.getLanguage();
    if (str1 != null)
    {
      str2 = paramza.a.getLanguage();
      if (str2 != null)
      {
        if (!str1.equals(str2)) {
          return false;
        }
        bool = true;
      }
    }
    return bool;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/c/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */