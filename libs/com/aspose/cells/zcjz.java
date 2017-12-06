package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import com.aspose.cells.a.c.zw;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zo;
import com.aspose.cells.b.a.d.zr;

public class zcjz
{
  private static char[] c = { ' ', '/', '>' };
  private static char[] d = { '<', '/' };
  private boolean e = false;
  private boolean[] f;
  private String[] g;
  private int h;
  private zr i;
  private int j;
  boolean a;
  boolean b;
  private char[] k;
  private boolean l = false;
  private static byte[] m = new byte[65536];
  
  public zcjz(zm paramzm, Encoding paramEncoding)
    throws Exception
  {
    this.i = new zo(paramzm, paramEncoding);
    i();
  }
  
  public zcjz(StringBuilder paramStringBuilder)
    throws Exception
  {
    this.i = new com.aspose.cells.b.a.d.zp(paramStringBuilder);
    i();
  }
  
  public zcjz(zo paramzo)
  {
    this.i = paramzo;
    i();
  }
  
  public void a(String paramString1, String paramString2)
    throws Exception
  {
    this.i.a(' ');
    this.i.a(paramString1);
    this.i.a('=');
    this.i.a('"');
    if (paramString2 != null) {
      b(paramString2, true);
    }
    this.i.a('"');
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    this.i.a(' ');
    this.i.a(paramString1);
    this.i.a('=');
    this.i.a('"');
    if (paramString3 != null) {
      b(paramString3, true);
    }
    this.i.a('"');
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4)
    throws Exception
  {
    this.i.a(' ');
    if (paramString1 == null)
    {
      this.i.a(paramString2);
    }
    else if (paramString2 == null)
    {
      this.i.a(paramString1);
    }
    else
    {
      this.i.a(paramString1);
      this.i.a(':');
      this.i.a(paramString2);
    }
    this.i.a('=');
    this.i.a('"');
    if (paramString4 != null) {
      b(paramString4, true);
    }
    this.i.a('"');
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
    throws Exception
  {
    this.i.a(' ');
    if (paramString1 == null)
    {
      this.i.a(paramString2);
    }
    else if (paramString2 == null)
    {
      this.i.a(paramString1);
    }
    else
    {
      this.i.a(paramString1);
      this.i.a(':');
      this.i.a(paramString2);
    }
    this.i.a('=');
    this.i.a('"');
    if (paramString4 != null) {
      if (paramBoolean) {
        b(paramString4, true);
      } else {
        this.i.a(paramString4);
      }
    }
    this.i.a('"');
  }
  
  private void e(boolean paramBoolean)
    throws Exception
  {
    if (this.e)
    {
      this.i.a('>');
      this.e = false;
    }
    if ((this.j == 1) && (this.h > 0))
    {
      this.i.f();
      this.i.a(this.k, 0, this.h);
    }
  }
  
  private void f(boolean paramBoolean)
    throws Exception
  {
    if (this.e)
    {
      this.i.a('>');
      this.e = false;
    }
    if (this.j == 1)
    {
      this.i.f();
      if (this.h > 0) {
        this.i.a(this.k, 0, this.h);
      }
    }
  }
  
  public void a(String paramString)
    throws Exception
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return;
    }
    if (this.e)
    {
      this.i.a('>');
      this.e = false;
    }
    b(paramString, false);
  }
  
  public void a(String paramString, boolean paramBoolean)
    throws Exception
  {
    if (this.e)
    {
      this.i.a('>');
      this.e = false;
    }
    if (paramBoolean) {
      b(paramString, false);
    } else {
      this.i.a(paramString);
    }
  }
  
  public void b(String paramString1, String paramString2)
    throws Exception
  {
    b(null, paramString1, null, paramString2, true);
  }
  
  public void b(String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    b(null, paramString1, paramString2, paramString3, true);
  }
  
  public void b(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
    throws Exception
  {
    e(true);
    if (this.h > 0) {
      this.f[(this.h - 1)] = true;
    }
    String str = paramString2;
    if (paramString1 != null) {
      str = paramString1 + ":" + paramString2;
    }
    this.i.a('<');
    this.i.a(str);
    if ((paramString4 == null) || ("".equals(paramString4)))
    {
      this.i.a(c, 0, c.length);
    }
    else
    {
      this.i.a('>');
      if (paramBoolean) {
        b(paramString4, false);
      } else {
        this.i.a(paramString4);
      }
      this.i.a(d, 0, 2);
      this.i.a(str);
      this.i.a('>');
    }
  }
  
  public void b(String paramString)
    throws Exception
  {
    c(null, paramString, null);
  }
  
  public void c(String paramString1, String paramString2)
    throws Exception
  {
    c(null, paramString1, paramString2);
  }
  
  public void c(String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    e(true);
    this.i.a('<');
    String str = paramString2;
    if (paramString1 != null) {
      str = paramString1 + ":" + paramString2;
    }
    this.i.a(str);
    if (this.h > 0) {
      this.f[(this.h - 1)] = true;
    }
    this.g[(this.h++)] = str;
    this.e = true;
  }
  
  public void a(String paramString1, String paramString2, boolean paramBoolean)
    throws Exception
  {
    e(true);
    this.i.a('<');
    String str = paramString2;
    if (paramString1 != null) {
      str = paramString1 + ":" + paramString2;
    }
    if (paramBoolean) {
      e(str);
    } else {
      this.i.a(str);
    }
    if (this.h > 0) {
      this.f[(this.h - 1)] = true;
    }
    this.g[(this.h++)] = str;
    this.e = true;
  }
  
  public void a()
    throws Exception
  {
    this.h -= 1;
    if (this.e)
    {
      this.i.a('>');
      this.e = false;
    }
    else if (this.f[this.h] != 0)
    {
      f(true);
      this.f[this.h] = false;
    }
    String str = this.g[this.h];
    this.i.a(d, 0, 2);
    this.i.a(str);
    this.i.a('>');
  }
  
  public void c(String paramString)
    throws Exception
  {
    e(true);
    this.i.a("<!--");
    this.i.a(paramString);
    this.i.a("-->");
  }
  
  public void b()
    throws Exception
  {
    this.h -= 1;
    if (this.e)
    {
      this.i.a(c, 0, c.length);
      this.e = false;
    }
    else
    {
      if (this.f[this.h] != 0)
      {
        f(true);
        this.f[this.h] = false;
      }
      String str = this.g[this.h];
      this.i.a(d, 0, 2);
      this.i.a(str);
      this.i.a('>');
    }
  }
  
  public void a(boolean paramBoolean)
    throws Exception
  {
    this.h -= 1;
    if (this.e)
    {
      this.i.a(c, 0, c.length);
      this.e = false;
    }
    else
    {
      if (this.f[this.h] != 0)
      {
        f(true);
        this.f[this.h] = false;
      }
      String str = this.g[this.h];
      this.i.a(d, 0, 2);
      if (paramBoolean) {
        e(str);
      } else {
        this.i.a(str);
      }
      this.i.a('>');
    }
  }
  
  public void c()
    throws Exception
  {
    this.i.a("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
  }
  
  public void b(boolean paramBoolean)
    throws Exception
  {
    if (paramBoolean) {
      this.i.a("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
    } else {
      this.i.a("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    }
    if (this.j == 1) {
      this.i.f();
    }
  }
  
  public void d()
    throws Exception
  {
    if (this.j == 1) {
      this.i.f();
    }
  }
  
  public void d(String paramString)
    throws Exception
  {
    e((paramString != null) && (!"".equals(paramString)));
    this.i.a(paramString);
  }
  
  public void e()
    throws Exception
  {
    this.i.c();
  }
  
  public void f()
    throws Exception
  {
    this.i.b();
  }
  
  private void e(String paramString)
    throws Exception
  {
    if (paramString == null) {
      return;
    }
    char[] arrayOfChar = paramString.toCharArray();
    int n = 0;
    int i1 = 0;
    for (int i2 = 0; i2 < arrayOfChar.length; i2++)
    {
      i1 = arrayOfChar[i2];
      switch (i1)
      {
      case 95: 
        if ((this.l) && (i2 + 6 < arrayOfChar.length) && (arrayOfChar[(i2 + 1)] == 'x') && (arrayOfChar[(i2 + 6)] == '_'))
        {
          int i3 = 1;
          for (int i4 = i2 + 2; i4 < i2 + 6; i4++)
          {
            char c1 = arrayOfChar[i4];
            if (!zcjj.a(c1))
            {
              i3 = 0;
              break;
            }
          }
          if (i3 != 0)
          {
            if (i2 - n > 0) {
              this.i.a(arrayOfChar, n, i2 - n);
            }
            this.i.a("_x005F_");
            n = i2 + 1;
          }
        }
        break;
      case 10: 
      case 13: 
      case 32: 
      case 34: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 46: 
      case 47: 
      case 60: 
      case 62: 
      case 63: 
      case 92: 
        if (i2 - n > 0) {
          this.i.a(arrayOfChar, n, i2 - n);
        }
        this.i.a("_x");
        this.i.a(com.aspose.cells.a.c.zp.c(i1));
        this.i.a('_');
        n = i2 + 1;
        break;
      case 58: 
        if (i2 == arrayOfChar.length - 1)
        {
          if (i2 - n > 0) {
            this.i.a(arrayOfChar, n, i2 - n);
          }
          this.i.a("_x");
          this.i.a(com.aspose.cells.a.c.zp.c(i1));
          this.i.a('_');
          n = i2 + 1;
        }
        break;
      default: 
        if ((m[(i1 = arrayOfChar[i2])] & 0xFF & 0x80) == 0)
        {
          if (i2 - n > 0) {
            this.i.a(arrayOfChar, n, i2 - n);
          }
          if (this.l)
          {
            this.i.a("_x");
            this.i.a(com.aspose.cells.a.c.zp.c(i1));
            this.i.a('_');
          }
          else if ((i2 + 1 < arrayOfChar.length) && (i1 >= 55296) && (i1 <= 56319))
          {
            this.i.a(i1);
            i2++;
            this.i.a(arrayOfChar[i2]);
          }
          else
          {
            this.i.a("&#x");
            this.i.a(com.aspose.cells.a.c.zp.c(i1));
            this.i.a(';');
          }
          n = i2 + 1;
        }
        break;
      }
    }
    if (n < arrayOfChar.length) {
      this.i.a(arrayOfChar, n, arrayOfChar.length - n);
    }
  }
  
  private void b(String paramString, boolean paramBoolean)
    throws Exception
  {
    if (paramString == null) {
      return;
    }
    char[] arrayOfChar = paramString.toCharArray();
    int n = 0;
    int i1 = 0;
    for (int i2 = 0; i2 < arrayOfChar.length; i2++) {
      if ((m[(i1 = arrayOfChar[i2])] & 0xFF & 0x80) == 0) {
        switch (i1)
        {
        case 9: 
          if ((this.a) && (paramBoolean))
          {
            if (i2 - n > 0) {
              this.i.a(arrayOfChar, n, i2 - n);
            }
            if (this.l) {
              this.i.a("_x0009_");
            } else {
              this.i.a("&#x0009;");
            }
            n = i2 + 1;
          }
          break;
        case 95: 
          if ((this.l) && (i2 + 6 < arrayOfChar.length) && (arrayOfChar[(i2 + 1)] == 'x') && (arrayOfChar[(i2 + 6)] == '_'))
          {
            int i3 = 1;
            for (int i4 = i2 + 2; i4 < i2 + 6; i4++)
            {
              char c1 = arrayOfChar[i4];
              if (!zcjj.a(c1))
              {
                i3 = 0;
                break;
              }
            }
            if (i3 != 0)
            {
              if (i2 - n > 0) {
                this.i.a(arrayOfChar, n, i2 - n);
              }
              this.i.a("_x005F_");
              n = i2 + 1;
            }
          }
          break;
        case 10: 
          if ((!this.b) && (paramBoolean))
          {
            if (i2 - n > 0) {
              this.i.a(arrayOfChar, n, i2 - n);
            }
            if (this.l) {
              this.i.a("_x000a_");
            } else {
              this.i.a("&#x000a;");
            }
            n = i2 + 1;
          }
          break;
        case 13: 
          if (!this.b)
          {
            if (i2 - n > 0) {
              this.i.a(arrayOfChar, n, i2 - n);
            }
            if (this.l) {
              this.i.a("_x000d_");
            } else {
              this.i.a("&#x000d;");
            }
            n = i2 + 1;
          }
          break;
        case 34: 
          if (paramBoolean)
          {
            if (i2 - n > 0) {
              this.i.a(arrayOfChar, n, i2 - n);
            }
            this.i.a("&quot;");
            n = i2 + 1;
          }
          break;
        case 38: 
          if (i2 - n > 0) {
            this.i.a(arrayOfChar, n, i2 - n);
          }
          this.i.a("&amp;");
          n = i2 + 1;
          break;
        case 39: 
          break;
        case 60: 
          if (i2 - n > 0) {
            this.i.a(arrayOfChar, n, i2 - n);
          }
          this.i.a("&lt;");
          n = i2 + 1;
          break;
        case 62: 
          if (i2 - n > 0) {
            this.i.a(arrayOfChar, n, i2 - n);
          }
          this.i.a("&gt;");
          n = i2 + 1;
          break;
        default: 
          if (i2 - n > 0) {
            this.i.a(arrayOfChar, n, i2 - n);
          }
          if ((i2 + 1 < arrayOfChar.length) && (i1 >= 55296) && (i1 <= 56319))
          {
            this.i.a(i1);
            i2++;
            this.i.a(arrayOfChar[i2]);
          }
          else if (this.l)
          {
            this.i.a("_x");
            this.i.a(com.aspose.cells.a.c.zp.c(i1));
            this.i.a('_');
          }
          else
          {
            this.i.a("&#x");
            this.i.a(com.aspose.cells.a.c.zp.c(i1));
            this.i.a(';');
          }
          n = i2 + 1;
        }
      }
    }
    if (n < arrayOfChar.length) {
      this.i.a(arrayOfChar, n, arrayOfChar.length - n);
    }
  }
  
  private void i()
  {
    this.k = new char['Ā'];
    zc.a(this.k, 0, 256, ' ');
    this.e = false;
    this.f = new boolean['Ā'];
    this.g = new String['Ā'];
    this.j = 0;
    if (m[97] == 0) {
      synchronized (m)
      {
        byte[] arrayOfByte = zw.h();
        System.arraycopy(arrayOfByte, 0, m, 0, arrayOfByte.length);
      }
    }
  }
  
  public int g()
  {
    return this.j;
  }
  
  public void a(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void a(char paramChar)
  {
    zc.a(this.k, 0, 256, paramChar);
  }
  
  public boolean h()
  {
    return this.l;
  }
  
  public void c(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public void b(int paramInt) {}
  
  public void d(boolean paramBoolean) {}
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */