package com.aspose.cells;

import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.zs;

class zagj
  extends zafx
{
  private zn b;
  private char c;
  private StringBuilder d = new StringBuilder();
  
  public static boolean a(char paramChar)
  {
    return "\t\n\r ".indexOf(paramChar) != -1;
  }
  
  public char e()
    throws Exception
  {
    char c1 = ' ';
    while (!f())
    {
      c1 = g();
      if (!a(c1)) {
        break;
      }
    }
    return c1;
  }
  
  public boolean f()
    throws Exception
  {
    return this.b.c() == -1;
  }
  
  public char g()
    throws Exception
  {
    return a(this.b.d());
  }
  
  private char a(int paramInt)
  {
    switch (paramInt)
    {
    case 150: 
      return '–';
    case 151: 
      return '—';
    case 95: 
      return '_';
    }
    return (char)paramInt;
  }
  
  public String h()
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.c);
    while (!f())
    {
      char c1 = g();
      if (!a(c1))
      {
        if ((c1 == '=') || (c1 == '>'))
        {
          this.c = c1;
          break;
        }
        localStringBuilder.append(c1);
      }
    }
    return zs.a(localStringBuilder).trim();
  }
  
  public String i()
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.c == '=')
    {
      char c1 = g();
      if (a(c1)) {
        c1 = e();
      }
      if ((c1 == '\'') || (c1 == '"'))
      {
        char c2 = c1;
        while (!f())
        {
          c1 = g();
          if (c1 == c2) {
            break;
          }
          localStringBuilder.append(c1);
        }
      }
      else
      {
        localStringBuilder.append(c1);
        while (!f())
        {
          c1 = g();
          if (a(c1)) {
            break;
          }
          if (c1 == '>')
          {
            this.c = c1;
            return zs.a(localStringBuilder).trim();
          }
          if (c1 == '"') {
            localStringBuilder.append('\'');
          } else {
            localStringBuilder.append(c1);
          }
        }
      }
      this.c = e();
    }
    return zs.a(localStringBuilder).trim();
  }
  
  public void a(String paramString1, String paramString2)
  {
    zafw localzafw = new zafw(paramString1, paramString2);
    a(localzafw);
  }
  
  public StringBuilder j()
  {
    return this.d;
  }
  
  public void a(zn paramzn)
  {
    this.b = paramzn;
  }
  
  public char k()
  {
    return this.c;
  }
  
  public void b(char paramChar)
  {
    this.c = paramChar;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zagj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */