package com.aspose.cells.a.d;

import com.aspose.cells.b.a.zs;

public class zga
  extends zep
{
  private boolean[] f = new boolean['Ā'];
  private char g = 'ÿ';
  private char h = '\000';
  private zeq i = new zeq(paramzdz, this);
  private zgb j;
  private zdz k;
  
  public zga(zdz paramzdz, String paramString, int paramInt)
    throws Exception
  {
    super(paramzdz, paramString, paramInt, false);
    this.k = paramzdz;
  }
  
  public void a(String paramString)
  {
    for (int m = 0; m < paramString.length(); m++)
    {
      char c = paramString.charAt(m);
      if (c <= 'ÿ')
      {
        this.f[c] = true;
        if (c < this.g) {
          this.g = c;
        }
        if (c > this.h) {
          this.h = c;
        }
      }
    }
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    b(paramzez);
    this.j.a(paramzez);
    this.i.a(paramzez);
  }
  
  private void b(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    paramzez.a("/Type", "/Font");
    if (this.k.b().a == 1) {
      paramzez.a("/Subtype", "/TrueType");
    } else {
      paramzez.a("/Subtype", "/Type1");
    }
    paramzez.a("/BaseFont", "/" + f());
    paramzez.a("/FirstChar", this.g);
    paramzez.a("/LastChar", this.h);
    this.j = new zgb(this.k, t());
    paramzez.a("/Widths", this.j.o());
    paramzez.a("/FontDescriptor", this.i.o());
    paramzez.a("/Encoding", "/WinAnsiEncoding");
    paramzez.h();
    paramzez.b();
  }
  
  protected void c()
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder(b());
    if ((e()) && (d())) {
      localStringBuilder.append(",BoldItalic");
    } else if (e()) {
      localStringBuilder.append(",Bold");
    } else if (d()) {
      localStringBuilder.append(",Italic");
    }
    this.d = zs.a(localStringBuilder);
  }
  
  public String t()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str = "[";
    for (int m = this.g; m <= this.h; m = (char)(m + 1))
    {
      if (this.f[m] != 0)
      {
        zgx localzgx = this.c.e().b(m);
        str = str + a(localzgx.c());
      }
      else
      {
        str = str + 0;
      }
      if (m < this.h) {
        str = str + " ";
      }
    }
    str = str + "]";
    return str;
  }
  
  public boolean m()
  {
    return false;
  }
  
  public static boolean b(String paramString)
  {
    for (int m = 0; m < paramString.length(); m++) {
      if (paramString.charAt(m) > 'ÿ') {
        return false;
      }
    }
    return true;
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    if (("Arial".equals(paramString1)) || ("Times New Roman".equals(paramString1))) {
      return b(paramString2);
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */