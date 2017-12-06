package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

class zagi
  extends zafx
{
  private String b;
  private int c;
  
  private boolean a(char paramChar)
  {
    return "\t\n\r".indexOf(paramChar) != -1;
  }
  
  private void h()
  {
    while (!i())
    {
      if (!a(j())) {
        return;
      }
      this.c += 1;
    }
  }
  
  private boolean i()
  {
    return this.c >= this.b.length();
  }
  
  public ArrayList e()
  {
    this.b = zw.a(this.b, "&quot;", "");
    String str1 = "";
    String str2 = "";
    while (!i())
    {
      str1 = f();
      for (str2 = g(); (!str1.equals("")) && (!str2.equals("")); str2 = g())
      {
        a(str1, str2);
        str1 = f();
      }
    }
    return d();
  }
  
  public String f()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    h();
    while (!i())
    {
      if (j() == ':')
      {
        this.c += 1;
        break;
      }
      if (j() == ';')
      {
        this.c -= zs.a(localStringBuilder).trim().length();
        return "";
      }
      localStringBuilder.append(j());
      this.c += 1;
    }
    h();
    return zs.a(localStringBuilder).trim();
  }
  
  public String g()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    h();
    while (!i())
    {
      if (j() == ';')
      {
        this.c += 1;
        break;
      }
      localStringBuilder.append(j());
      this.c += 1;
    }
    return zs.a(localStringBuilder).trim();
  }
  
  public void a(String paramString1, String paramString2)
  {
    zafw localzafw = new zafw(paramString1, paramString2);
    a(localzafw);
  }
  
  private char j()
  {
    return a(0);
  }
  
  private char a(int paramInt)
  {
    if (this.c + paramInt < this.b.length()) {
      return this.b.charAt(this.c + paramInt);
    }
    return '\000';
  }
  
  public void b(String paramString)
  {
    if ((paramString.startsWith("'")) && (paramString.endsWith("'"))) {
      this.b = paramString.substring(1, 1 + (paramString.length() - 2));
    } else {
      this.b = paramString;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zagi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */