package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.zs;

class zaga
  extends zafx
{
  private zm b;
  private zn c;
  private char d;
  private String e;
  
  public zaga() {}
  
  public zaga(String paramString)
  {
    this.e = paramString;
  }
  
  public boolean a(char paramChar)
  {
    return "\t\n\r ".indexOf(paramChar) != -1;
  }
  
  public void e()
    throws Exception
  {
    while (!f())
    {
      if (!a(l())) {
        return;
      }
      j();
    }
  }
  
  public boolean f()
    throws Exception
  {
    return this.c.c() == -1;
  }
  
  public String g()
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder();
    e();
    while (!f())
    {
      if (l() == ':')
      {
        j();
        break;
      }
      if ((l() == 0) || (l() == '\r') || (l() == '\n') || (l() == '\t'))
      {
        j();
      }
      else
      {
        localStringBuilder.append(l());
        j();
      }
    }
    e();
    if (localStringBuilder.length() == 0) {
      return null;
    }
    return zs.a(localStringBuilder).trim();
  }
  
  public String h()
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder();
    e();
    while ((!f()) && (l() != '\n') && (l() != '\r') && (l() != '\t') && (l() != '}'))
    {
      if (l() == ';')
      {
        j();
        if ((l() == '\n') || (l() == '\r') || (l() == '\t') || (l() == '}') || (l() == ' ')) {
          break;
        }
        localStringBuilder.append(';');
      }
      localStringBuilder.append(l());
      j();
    }
    e();
    if (localStringBuilder.length() == 0) {
      return null;
    }
    return zs.a(localStringBuilder).trim();
  }
  
  public void a(String paramString1, String paramString2)
  {
    zafw localzafw = new zafw(paramString1, paramString2);
    a(localzafw);
  }
  
  public void i()
    throws Exception
  {
    this.d = ((char)this.c.d());
  }
  
  public void j()
    throws Exception
  {
    i();
  }
  
  public void a(zm paramzm)
    throws Exception
  {
    this.b = paramzm;
    this.c = new zn(this.b, Encoding.getEncoding("gb2312"));
  }
  
  public String k()
  {
    return this.e;
  }
  
  public char l()
  {
    return this.d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */