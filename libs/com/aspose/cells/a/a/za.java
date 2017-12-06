package com.aspose.cells.a.a;

import com.aspose.cells.b.a.c.zc;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class za
{
  public final com.aspose.cells.b.a.c.za a;
  public final char b;
  public final char c;
  public final char d;
  public final char e;
  public final int f;
  public final String g;
  public final String h;
  public final String i;
  public final String j;
  public final String k;
  public final String l;
  public final DecimalFormat m;
  public final DateFormat n;
  private final boolean o;
  private final boolean p;
  private final boolean q;
  
  public za(za paramza, char paramChar1, char paramChar2)
  {
    this.a = paramza.a;
    this.b = paramza.b;
    this.c = paramza.c;
    this.f = paramza.f;
    this.g = paramza.g;
    this.h = paramza.h;
    this.i = paramza.i;
    this.j = paramza.j;
    this.k = paramza.k;
    this.l = paramza.l;
    this.m = paramza.m;
    this.n = paramza.n;
    if (paramza.o)
    {
      if (paramChar1 == paramza.d) {
        this.o = true;
      } else {
        this.o = (paramChar1 != a(this.a));
      }
    }
    else {
      this.o = (paramChar1 != paramza.d);
    }
    if (paramza.p)
    {
      if (paramChar2 == paramza.e) {
        this.p = true;
      } else {
        this.p = (paramChar2 != b(this.a));
      }
    }
    else {
      this.p = (paramChar2 != paramza.e);
    }
    this.d = paramChar1;
    this.e = paramChar2;
    this.q = ((this.d == '.') && (this.e == ','));
  }
  
  public za(com.aspose.cells.b.a.c.za paramza)
  {
    this(paramza, a(paramza), b(paramza), false, false);
  }
  
  public za(com.aspose.cells.b.a.c.za paramza, char paramChar1, char paramChar2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramza;
    Locale localLocale = paramza.h();
    this.m = new DecimalFormat("#.######", new DecimalFormatSymbols(localLocale));
    DateFormat localDateFormat = null;
    SimpleDateFormat localSimpleDateFormat;
    String str1;
    char c1;
    int i1;
    String str2;
    if (paramza.g() == 16393)
    {
      this.c = '-';
      this.g = "yyyy";
      this.h = "MM";
      this.i = "dd";
      this.f = 3;
      this.n = new SimpleDateFormat("dd-MM-yyyy");
    }
    else
    {
      this.n = DateFormat.getDateTimeInstance(3, 3, localLocale);
      localDateFormat = DateFormat.getDateInstance(3, localLocale);
      if ((localDateFormat instanceof SimpleDateFormat))
      {
        localSimpleDateFormat = (SimpleDateFormat)localDateFormat;
        str1 = localSimpleDateFormat.toPattern();
        if (a(localLocale)) {
          str1 = str1.replace('-', '/');
        }
        c1 = a(str1, true);
        if (c1 == 0)
        {
          this.c = '/';
          this.g = "yyyy";
          this.h = "M";
          this.i = "d";
          this.f = 2;
        }
        else
        {
          this.c = c1;
          i1 = str1.indexOf('y');
          if (i1 < 0)
          {
            if (str1.charAt(str1.length() - 1) != c1) {
              str1 = str1 + c1;
            }
            str1 = str1 + "yyyy";
            this.g = "yyyy";
          }
          else
          {
            int i2 = 1;
            i1++;
            while ((i1 < str1.length()) && (str1.charAt(i1) == 'y'))
            {
              i2++;
              i1++;
            }
            this.g = str1.substring(i1 - i2, i1);
          }
          str2 = a('M', str1);
          if (str2 == null) {
            str2 = "M";
          }
          this.h = str2;
          str2 = a('d', str1);
          if (str2 == null) {
            str2 = "d";
          }
          this.i = str2;
          i1 = str1.indexOf('y');
          int i3 = str1.indexOf('M');
          int i4 = str1.indexOf('d');
          if (i1 > i3)
          {
            if (i3 > i4) {
              this.f = 3;
            } else if (i1 > i4) {
              this.f = 2;
            } else {
              this.f = 6;
            }
          }
          else if (i3 < i4) {
            this.f = 4;
          } else if (i1 > i4) {
            this.f = 7;
          } else {
            this.f = 5;
          }
        }
      }
      else
      {
        this.c = '/';
        this.g = "yyyy";
        this.h = "M";
        this.i = "d";
        this.f = 2;
      }
    }
    localDateFormat = DateFormat.getTimeInstance(2, localLocale);
    if ((localDateFormat instanceof SimpleDateFormat))
    {
      localSimpleDateFormat = (SimpleDateFormat)localDateFormat;
      str1 = localSimpleDateFormat.toPattern();
      c1 = a(str1, false);
      if (c1 == 0)
      {
        this.b = ':';
        this.j = "H";
        this.k = "mm";
        this.l = "ss";
      }
      else
      {
        this.b = c1;
        for (i1 = str1.lastIndexOf(c1) + 1; (i1 < str1.length()) && (b(str1.charAt(i1))); i1++) {}
        str1 = str1.substring(0, i1);
        str2 = a('H', str1);
        if (str2 == null) {
          str2 = "H";
        }
        this.j = str2;
        str2 = a('m', str1);
        if (str2 == null) {
          str2 = "mm";
        }
        this.k = str2;
        str2 = a('s', str1);
        if (str2 == null) {
          str2 = "ss";
        }
        this.l = str2;
      }
    }
    else
    {
      this.b = ':';
      this.j = "H";
      this.k = "mm";
      this.l = "ss";
    }
    this.d = paramChar1;
    this.e = paramChar2;
    this.o = paramBoolean1;
    this.p = paramBoolean2;
    this.q = ((this.d == '.') && (this.e == ','));
  }
  
  public static char a(com.aspose.cells.b.a.c.za paramza)
  {
    return paramza.d().c().charAt(0);
  }
  
  public static char b(com.aspose.cells.b.a.c.za paramza)
  {
    return paramza.d().b().charAt(0);
  }
  
  private static char a(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return '\000';
    }
    boolean bool = a(paramString.charAt(0), paramBoolean);
    int i1 = 1;
    char c1 = '\000';
    while (i1 < paramString.length())
    {
      char c2 = paramString.charAt(i1);
      if (bool)
      {
        if (!a(c2, paramBoolean))
        {
          i1++;
          if (i1 < paramString.length())
          {
            c2 = paramString.charAt(i1);
            if (a(c2, paramBoolean))
            {
              c1 = paramString.charAt(i1 - 1);
              break;
            }
          }
          bool = false;
        }
      }
      else if (a(c2, paramBoolean)) {
        bool = true;
      }
      i1++;
    }
    return c1;
  }
  
  private static String a(char paramChar, String paramString)
  {
    int i1 = paramString.indexOf(paramChar);
    if (i1 < 0) {
      return null;
    }
    for (int i2 = i1 + 1; (i2 < paramString.length()) && (paramString.charAt(i2) == paramChar); i2++) {}
    return paramString.substring(i1, i2);
  }
  
  private static boolean a(char paramChar, boolean paramBoolean)
  {
    return paramBoolean ? a(paramChar) : b(paramChar);
  }
  
  private static boolean a(char paramChar)
  {
    switch (paramChar)
    {
    case 'D': 
    case 'M': 
    case 'd': 
    case 'y': 
      return true;
    }
    return false;
  }
  
  private static boolean b(char paramChar)
  {
    switch (paramChar)
    {
    case 'H': 
    case 'K': 
    case 'S': 
    case 'h': 
    case 'k': 
    case 'm': 
    case 's': 
      return true;
    }
    return false;
  }
  
  public boolean a()
  {
    return this.q;
  }
  
  public boolean b()
  {
    return this.o;
  }
  
  public boolean c()
  {
    return this.p;
  }
  
  public char d()
  {
    return this.d;
  }
  
  public char e()
  {
    return this.e;
  }
  
  public int f()
  {
    return this.f;
  }
  
  public char g()
  {
    return this.c;
  }
  
  public char h()
  {
    return this.b;
  }
  
  public String i()
  {
    return this.h;
  }
  
  public String j()
  {
    return this.i;
  }
  
  public String k()
  {
    return this.j;
  }
  
  public String l()
  {
    return this.k;
  }
  
  public String m()
  {
    return this.l;
  }
  
  private static boolean a(Locale paramLocale)
  {
    if ("zh".equals(paramLocale.getLanguage())) {
      return true;
    }
    String str = paramLocale.getCountry();
    if ((str != null) && (!str.equals("")))
    {
      str = str.toUpperCase();
      return (str.equals("CN")) || (str.equals("TW")) || (str.equals("HK")) || (str.equals("MO")) || (str.equals("SG")) || (str.equals("CHS")) || (str.equals("CHT"));
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/a/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */