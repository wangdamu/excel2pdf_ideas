package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.a.d.zce;
import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;

public class zcjy
{
  private int q = 4096;
  public zcjr a = null;
  private int r;
  public boolean[] b = null;
  public zcjs c = new zcjm();
  public StringBuilder d = new StringBuilder(16);
  boolean e = false;
  boolean f = false;
  public boolean g;
  public char[] h;
  public int i = -1;
  public int j;
  public int k = 0;
  public zaqr[] l;
  public zaqr m;
  public int n = -1;
  public int o = 0;
  private zn s;
  public boolean p;
  private static final za t = new za(new String[] { "&quot;", "&apos;", "&amp;", "&lt;", "&gt;", "&nbsp;", "&iexcl;", "&cent;", "&pound;", "&curren;", "&yen;", "&brvbar;", "&sect;", "&uml;", "&copy;", "&ordf;", "&laquo;", "&not;", "&shy;", "&reg;", "&macr;", "&deg;", "&plusmn;", "&sup2;", "&sup3;", "&acute;", "&micro;", "&para;", "&middot;", "&cedil;", "&sup1;", "&ordm;", "&raquo;", "&frac14;", "&frac12;", "&frac34;", "&iquest;", "&Agrave;", "&Aacute;", "&Acirc;", "&Atilde;", "&Auml;", "&Aring;", "&AElig;", "&Ccedil;", "&Egrave;", "&Eacute;", "&Ecirc;", "&Euml;", "&Igrave;", "&Iacute;", "&Icirc;", "&Iuml;", "&ETH;", "&Ntilde;", "&Ograve;", "&Oacute;", "&Ocirc;", "&Otilde;", "&Ouml;", "&times;", "&Oslash;", "&Ugrave;", "&Uacute;", "&Ucirc;", "&Uuml;", "&Yacute;", "&THORN;", "&szlig;", "&agrave;", "&aacute;", "&acirc;", "&atilde;", "&auml;", "&aring;", "&aelig;", "&ccedil;", "&egrave;", "&eacute;", "&ecirc;", "&euml;", "&igrave;", "&iacute;", "&icirc;", "&iuml;", "&eth;", "&ntilde;", "&ograve;", "&oacute;", "&ocirc;", "&otilde;", "&ouml;", "&divide;", "&oslash;", "&ugrave;", "&uacute;", "&ucirc;", "&uuml;", "&yacute;", "&thorn;", "&yuml;" });
  
  public static zcjy a(String paramString, boolean paramBoolean)
    throws Exception
  {
    return new zcjy(paramString, paramBoolean);
  }
  
  public zcjy(zm paramzm)
    throws Exception
  {
    this.s = new zn(paramzm, Encoding.getUTF8());
    A();
  }
  
  public zcjy(zm paramzm, Encoding paramEncoding)
    throws Exception
  {
    this.s = new zn(paramzm, paramEncoding == null ? Encoding.getUTF8() : paramEncoding);
    A();
  }
  
  public zcjy(String paramString, boolean paramBoolean)
    throws Exception
  {
    Object localObject;
    if (paramBoolean)
    {
      localObject = zd.b(paramString);
      this.s = new zn((zm)localObject, Encoding.getUTF8());
    }
    else
    {
      this.h = new char[paramString.length() + 1];
      localObject = paramString.toCharArray();
      System.arraycopy(localObject, 0, this.h, 0, localObject.length);
      this.j = paramString.length();
      this.i = -1;
    }
    A();
  }
  
  public void c()
    throws Exception
  {
    if (this.s != null) {
      this.s.a();
    }
  }
  
  public static int a(zm paramzm)
    throws Exception
  {
    int i1 = 4096;
    if (paramzm.e())
    {
      long l1 = paramzm.h() + 1L;
      if (l1 < i1) {
        return (int)l1;
      }
      if (l1 > 65536L) {
        i1 = 8192;
      }
    }
    return i1;
  }
  
  private void A()
    throws Exception
  {
    this.l = new zaqr[8];
    this.l[0] = new zaqr();
    this.m = this.l[0];
    this.n = -1;
    this.o = 0;
    this.a = new zcjr();
    if (this.s != null)
    {
      this.q = a(this.s.b());
      this.h = new char[this.q];
      this.q -= 1;
      this.j = this.s.a(this.h, 0, this.q);
      this.i = -1;
    }
  }
  
  public boolean d()
    throws Exception
  {
    if (this.g)
    {
      this.i += 1;
      if ((this.i >= this.j) && (!E()))
      {
        this.m = this.l[0];
        this.m.a = 0;
        this.i -= 1;
        return false;
      }
    }
    else
    {
      int i1 = 1;
      while (i1 != 0)
      {
        this.i += 1;
        switch (this.h[this.i])
        {
        case '\000': 
          if (this.i >= this.j)
          {
            if (!E())
            {
              this.m = this.l[0];
              this.m.a = 0;
              this.i -= 1;
              return false;
            }
            this.i -= 1;
          }
          break;
        case '\t': 
        case '\n': 
        case '\r': 
        case '\020': 
        case '\023': 
        case ' ': 
          break;
        default: 
          i1 = 0;
        }
      }
    }
    if (this.h[this.i] == '<')
    {
      B();
    }
    else
    {
      this.k = this.i;
      String str = C();
      this.m = this.l[0];
      this.m.c = (this.m.b = null);
      this.m.e = null;
      this.n = -1;
      this.o = 0;
      this.m.d = str;
      this.m.a = 3;
      this.i -= 1;
      this.r += 1;
    }
    return true;
  }
  
  private void B()
    throws Exception
  {
    this.m = this.l[0];
    this.m.c = (this.m.d = this.m.b = null);
    this.m.e = null;
    this.m.f = false;
    this.n = -1;
    this.o = 0;
    this.i += 1;
    if (this.i >= this.j) {
      z();
    }
    switch (this.h[this.i])
    {
    case '!': 
      g();
      return;
    case '?': 
      this.m.a = 6;
      e();
      return;
    case '/': 
      this.m.a = 4;
      if (this.p)
      {
        this.k = (this.i + 1);
        i1 = 1;
        while (i1 != 0)
        {
          this.i += 1;
          switch (this.h[this.i])
          {
          case '\000': 
            y();
            this.i -= 1;
            break;
          case '>': 
            i1 = 0;
            break;
          case ':': 
            this.m.b = this.a.a(this.h, this.k, this.i - this.k);
            this.k = (this.i + 1);
            break;
          case '&': 
            w();
          }
        }
        for (i2 = this.i - 1; i2 >= this.k; i2--) {
          switch (this.h[i2])
          {
          case '\t': 
          case '\n': 
          case '\r': 
          case ' ': 
            break;
          default: 
            this.m.c = this.a.a(this.h, this.k, i2 - this.k + 1);
            return;
          }
        }
      }
      else
      {
        do
        {
          this.i += 1;
          if (this.i >= this.j) {
            z();
          }
        } while (this.h[this.i] != '>');
      }
      return;
    case '&': 
      w();
      break;
    case '_': 
      D();
    }
    this.m.a = 1;
    int i1 = 1;
    int i2 = 0;
    this.k = this.i;
    while (i1 != 0)
    {
      this.i += 1;
      switch (this.h[this.i])
      {
      case '\000': 
        y();
        this.i -= 1;
        break;
      case ':': 
        this.m.b = this.a.a(this.h, this.k, this.i - this.k);
        this.k = (this.i + 1);
        break;
      case '\t': 
      case '\n': 
      case '\r': 
      case ' ': 
        i1 = 0;
        break;
      case '&': 
        w();
        break;
      case '_': 
        D();
        break;
      case '/': 
        i1 = 0;
        i2 = 1;
        this.m.f = true;
        break;
      case '>': 
        i1 = 0;
        i2 = 1;
      }
    }
    this.m.c = this.a.a(this.h, this.k, this.i - this.k);
    if (i2 != 0)
    {
      if (this.m.f)
      {
        this.i += 1;
        if (this.i >= this.j) {
          z();
        }
      }
      return;
    }
    this.k = (this.i + 1);
    i1 = 1;
    zaqr localzaqr = null;
    while (i1 != 0)
    {
      this.i += 1;
      zaqr[] arrayOfzaqr;
      switch (this.h[this.i])
      {
      case '\000': 
        y();
        this.i -= 1;
        break;
      case '\t': 
      case '\n': 
      case '\r': 
      case ' ': 
        if (this.i == this.k) {
          this.k += 1;
        }
        break;
      case '&': 
        w();
        break;
      case ':': 
        this.o += 1;
        if (this.o >= this.l.length)
        {
          arrayOfzaqr = new zaqr[this.l.length << 1];
          System.arraycopy(this.l, 0, arrayOfzaqr, 0, this.l.length);
          this.l = arrayOfzaqr;
        }
        if (this.l[this.o] == null)
        {
          localzaqr = new zaqr();
          localzaqr.a = 2;
          this.l[this.o] = localzaqr;
        }
        else
        {
          localzaqr = this.l[this.o];
          localzaqr.e = null;
          localzaqr.d = null;
        }
        localzaqr.b = this.a.a(this.h, this.k, this.i - this.k);
        this.k = (this.i + 1);
        break;
      case '=': 
        if (localzaqr == null)
        {
          this.o += 1;
          if (this.o + 1 > this.l.length)
          {
            arrayOfzaqr = new zaqr[this.l.length << 1];
            System.arraycopy(this.l, 0, arrayOfzaqr, 0, this.l.length);
            this.l = arrayOfzaqr;
          }
          if (this.l[this.o] == null)
          {
            localzaqr = new zaqr();
            localzaqr.a = 2;
            this.l[this.o] = localzaqr;
          }
          else
          {
            localzaqr = this.l[this.o];
            localzaqr.b = null;
            localzaqr.e = null;
          }
        }
        int i3 = 1;
        for (int i4 = this.i - 1; (i4 >= this.k) && (i3 != 0); i4--) {
          switch (this.h[i4])
          {
          case '\t': 
          case '\n': 
          case '\r': 
          case ' ': 
            break;
          default: 
            localzaqr.c = this.a.a(this.h, this.k, i4 - this.k + 1);
            i3 = 0;
          }
        }
        i3 = 1;
        i4 = 1;
        while (i3 != 0)
        {
          this.i += 1;
          switch (this.h[this.i])
          {
          case '\000': 
            z();
            this.i -= 1;
            break;
          case '\t': 
          case '\n': 
          case '\r': 
          case ' ': 
            break;
          case '"': 
          case '\'': 
            i4 = 0;
            i3 = 0;
            this.k = (this.i + 1);
            break;
          default: 
            i3 = 0;
            this.k = this.i;
          }
        }
        int i5 = this.h[this.i];
        i3 = 1;
        while (i3 != 0)
        {
          this.i += 1;
          switch (this.h[this.i])
          {
          case '\000': 
            y();
            this.i -= 1;
            break;
          case '\t': 
          case '\n': 
          case '\r': 
          case ' ': 
            if (i4 != 0) {
              i3 = 0;
            }
            break;
          case '_': 
            if (this.f) {
              D();
            }
            break;
          case '&': 
            w();
            break;
          case '/': 
            if (i4 != 0)
            {
              i3 = 0;
              i1 = 0;
              this.m.f = true;
            }
            break;
          case '>': 
            if (i4 != 0)
            {
              i3 = 0;
              i1 = 0;
            }
            break;
          case '"': 
          case '\'': 
            if ((i5 == this.h[this.i]) && (i4 == 0)) {
              i3 = 0;
            }
            break;
          }
        }
        localzaqr.d = new String(this.h, this.k, this.i - this.k);
        this.k = (this.i + 1);
        localzaqr = null;
        break;
      case '/': 
        i1 = 0;
        this.m.f = true;
        break;
      case '>': 
        i1 = 0;
      }
    }
    if (this.m.f)
    {
      this.i += 1;
      if (this.i >= this.j) {
        z();
      }
    }
  }
  
  public void e()
    throws Exception
  {
    do
    {
      do
      {
        this.i += 1;
        if (this.i >= this.j) {
          z();
        }
      } while (this.h[this.i] != '?');
      this.i += 1;
      if (this.i >= this.j) {
        z();
      }
    } while (this.h[this.i] != '>');
  }
  
  public int f()
    throws Exception
  {
    int i1 = 7;
    this.i += 1;
    if (this.i >= this.j) {
      z();
    }
    int i2;
    int i3;
    switch (this.h[this.i])
    {
    case '-': 
      i2 = 1;
      i1 = 7;
      this.i += 1;
      if (this.i >= this.j) {
        z();
      }
      if (this.h[this.i] != '-') {
        throw new zcjp("Invalid xml comment");
      }
      while (i2 != 0)
      {
        this.i += 1;
        if (this.i >= this.j) {
          z();
        }
        if (this.h[this.i] == '-')
        {
          i3 = 0;
          do
          {
            i3++;
            this.i += 1;
            if (this.i >= this.j) {
              z();
            }
          } while (this.h[this.i] == '-');
          if (i3 >= 2) {
            i2 = this.h[this.i] != '>' ? 1 : 0;
          }
        }
      }
      break;
    case '[': 
      i1 = 3;
      i2 = 1;
      while (i2 != 0)
      {
        this.i += 1;
        if (this.i >= this.j) {
          z();
        }
        if (this.h[this.i] == ']')
        {
          i3 = 0;
          do
          {
            i3++;
            this.i += 1;
            if (this.i >= this.j) {
              z();
            }
          } while (this.h[this.i] == ']');
          if (i3 >= 2) {
            i2 = this.h[this.i] != '>' ? 1 : 0;
          }
        }
      }
      break;
    default: 
      i1 = 5;
      i2 = 1;
      while (i2 != 0)
      {
        this.i += 1;
        switch (this.h[this.i])
        {
        case '\000': 
          z();
          this.i -= 1;
          break;
        case '>': 
          i2 = 0;
          break;
        case '"': 
        case '\'': 
          i3 = this.h[this.i];
          do
          {
            this.i += 1;
            if (this.i >= this.j) {
              z();
            }
          } while (this.h[this.i] != i3);
          break;
        case '[': 
          i3 = 1;
          while (i3 != 0)
          {
            this.i += 1;
            switch (this.h[this.i])
            {
            case '\000': 
              z();
              this.i -= 1;
              break;
            case '"': 
            case '\'': 
              int i4 = this.h[this.i];
              do
              {
                this.i += 1;
                if (this.i >= this.j) {
                  z();
                }
              } while (this.h[this.i] != i4);
              break;
            case '<': 
              this.i += 1;
              if (this.i >= this.j) {
                z();
              }
              switch (this.h[this.i])
              {
              case '!': 
                f();
                break;
              case '?': 
                e();
              }
              break;
            case ']': 
              this.i += 1;
              if (this.i >= this.j) {
                z();
              }
              if (this.h[this.i] != '>') {
                throw new zcjp("missing \">\" of DTD in");
              }
              i3 = 0;
            }
          }
        }
      }
    }
    return i1;
  }
  
  public void g()
    throws Exception
  {
    this.i += 1;
    if (this.i >= this.j) {
      z();
    }
    int i1;
    int i2;
    switch (this.h[this.i])
    {
    case '-': 
      this.m.a = 7;
      i1 = 1;
      this.i += 1;
      if (this.i >= this.j) {
        z();
      }
      if (this.h[this.i] != '-') {
        throw new zcjp("Invalid xml comment");
      }
      while (i1 != 0)
      {
        this.i += 1;
        if (this.i >= this.j) {
          z();
        }
        if (this.h[this.i] == '-')
        {
          i2 = 0;
          do
          {
            i2++;
            this.i += 1;
            if (this.i >= this.j) {
              z();
            }
          } while (this.h[this.i] == '-');
          if (i2 >= 2) {
            i1 = this.h[this.i] != '>' ? 1 : 0;
          }
        }
      }
      break;
    case '[': 
      this.m.a = 3;
      do
      {
        this.i += 1;
        if (this.i >= this.j) {
          z();
        }
      } while (this.h[this.i] != '[');
      this.k = (this.i + 1);
      for (;;)
      {
        this.i += 1;
        if (this.i >= this.j) {
          x();
        }
        if (this.h[this.i] == ']')
        {
          i1 = 0;
          do
          {
            i1++;
            this.i += 1;
            if (this.i >= this.j) {
              x();
            }
          } while (this.h[this.i] == ']');
          if ((i1 >= 2) && (this.h[this.i] == '>'))
          {
            if (this.d.length() != 0)
            {
              this.d.append(this.h, this.k, this.i - this.k);
              this.m.d = this.d.substring(0, 0 + (this.d.length() - 2));
              this.d.delete(0, 0 + this.d.length());
              break;
            }
            this.m.d = new String(this.h, this.k, this.i - this.k - 2);
            break;
          }
        }
      }
    default: 
      this.m.a = 5;
      i1 = 1;
      while (i1 != 0)
      {
        this.i += 1;
        switch (this.h[this.i])
        {
        case '\000': 
          z();
          this.i -= 1;
          break;
        case '>': 
          i1 = 0;
          break;
        case '"': 
        case '\'': 
          i2 = this.h[this.i];
          do
          {
            this.i += 1;
            if (this.i >= this.j) {
              z();
            }
          } while (this.h[this.i] != i2);
          break;
        case '[': 
          i2 = 1;
          while (i2 != 0)
          {
            this.i += 1;
            switch (this.h[this.i])
            {
            case '\000': 
              z();
              this.i -= 1;
              break;
            case '"': 
            case '\'': 
              int i3 = this.h[this.i];
              do
              {
                this.i += 1;
                if (this.i >= this.j) {
                  z();
                }
              } while (this.h[this.i] != i3);
              break;
            case '<': 
              this.i += 1;
              if (this.i >= this.j) {
                z();
              }
              switch (this.h[this.i])
              {
              case '!': 
                f();
                break;
              case '?': 
                e();
              }
              break;
            case ']': 
              this.i += 1;
              if (this.i >= this.j) {
                z();
              }
              if (this.h[this.i] != '>') {
                throw new zcjp("missing \">\" of DTD in");
              }
              i2 = 0;
            }
          }
        }
      }
    }
  }
  
  public boolean a()
    throws Exception
  {
    if ((this.l[0].a == 1) && (!this.l[0].f))
    {
      int i1 = 1;
      while (i1 > 0)
      {
        this.i += 1;
        switch (this.h[this.i])
        {
        case '\000': 
          z();
          this.i -= 1;
          break;
        case '<': 
          this.i += 1;
          if (this.i >= this.j) {
            z();
          }
          switch (this.h[this.i])
          {
          case '!': 
            f();
            break;
          case '?': 
            e();
            break;
          case '/': 
            i1--;
            do
            {
              this.i += 1;
              if (this.i >= this.j) {
                z();
              }
            } while (this.h[this.i] != '>');
            break;
          default: 
            i1++;
            int i2 = 1;
            while (i2 != 0)
            {
              this.i += 1;
              switch (this.h[this.i])
              {
              case '\000': 
                z();
                this.i -= 1;
                break;
              case '"': 
              case '\'': 
                int i3 = this.h[this.i];
                do
                {
                  this.i += 1;
                  if (this.i >= this.j) {
                    z();
                  }
                } while (this.h[this.i] != i3);
                break;
              case '/': 
                i1--;
                break;
              case '<': 
                i2 = 0;
                this.i -= 1;
                i1--;
                break;
              case '>': 
                i2 = 0;
              }
            }
          }
          break;
        }
      }
    }
    return d();
  }
  
  public void h()
    throws Exception
  {
    d();
  }
  
  private String C()
    throws Exception
  {
    int i1 = 0;
    for (;;)
    {
      switch (this.h[this.i])
      {
      case '\000': 
        x();
        this.i -= 1;
        break;
      case '<': 
        String str = null;
        if (this.d.length() != 0)
        {
          this.d.append(this.h, this.k, this.i - this.k);
          str = zs.a(this.d);
          this.d.delete(0, 0 + this.d.length());
        }
        else
        {
          str = new String(this.h, this.k, this.i - this.k);
        }
        if (i1 != 0) {
          str = zw.a(str, "\r\n", "\n");
        }
        return str;
      case '\r': 
        if ((!this.g) && (this.i == this.k) && (this.d.length() == 0)) {
          this.k += 1;
        } else {
          i1 = 1;
        }
        break;
      case '\t': 
      case '\n': 
      case ' ': 
        if ((!this.g) && (this.i == this.k) && (this.d.length() == 0)) {
          this.k += 1;
        }
        break;
      case '_': 
        if (this.e) {
          D();
        }
        break;
      case '&': 
        w();
      }
      this.i += 1;
    }
  }
  
  public String i()
    throws Exception
  {
    if (this.l[0].f) {
      return "";
    }
    this.k = (this.i + 1);
    String str = C();
    B();
    return str;
  }
  
  public String a(boolean paramBoolean)
    throws Exception
  {
    boolean bool = paramBoolean;
    c(paramBoolean);
    String str = j();
    c(bool);
    return str;
  }
  
  public String j()
    throws Exception
  {
    if (this.l[0].f)
    {
      d();
      return "";
    }
    this.k = (this.i + 1);
    String str = C();
    B();
    while (this.m.a != 4)
    {
      switch (this.m.a)
      {
      case 8: 
        str = str + this.m.d;
        break;
      case 3: 
        str = str + this.m.d;
        break;
      case 1: 
        throw new zcjp("ReadElementString only could be called when the content is simple or empty.");
      }
      d();
    }
    d();
    return str;
  }
  
  public int k()
    throws Exception
  {
    int i1 = 1;
    while (i1 != 0) {
      switch (this.l[0].a)
      {
      case 0: 
      case 5: 
      case 6: 
      case 7: 
        if (!d()) {
          return this.l[0].a;
        }
        break;
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      default: 
        i1 = 0;
      }
    }
    return this.l[0].a;
  }
  
  public boolean l()
  {
    this.n = -1;
    this.m = this.l[0];
    return true;
  }
  
  public boolean m()
  {
    this.n += 1;
    if (this.n < this.o)
    {
      this.m = this.l[(this.n + 1)];
      return true;
    }
    return false;
  }
  
  public boolean n()
  {
    return this.o > 0;
  }
  
  public boolean o()
  {
    return this.l[0].f;
  }
  
  public String a(String paramString1, String paramString2)
  {
    paramString1 = this.a.a(paramString1);
    for (int i1 = 1; i1 <= this.o; i1++) {
      if (zy.b(this.l[i1].c, paramString1)) {
        return this.l[i1].d;
      }
    }
    return null;
  }
  
  public String a(String paramString)
  {
    int i1 = paramString.indexOf(':');
    if (i1 != -1) {
      paramString = this.a.a(paramString.toCharArray(), i1 + 1, paramString.length() - i1 - 1);
    } else {
      paramString = this.a.a(paramString);
    }
    for (int i2 = 1; i2 <= this.o; i2++) {
      if (zy.b(this.l[i2].c, paramString)) {
        return this.l[i2].d;
      }
    }
    return null;
  }
  
  public String p()
  {
    return this.m.a();
  }
  
  public String q()
  {
    return this.m.c;
  }
  
  public String r()
  {
    return this.m.b;
  }
  
  public int s()
  {
    return this.m.a;
  }
  
  public String t()
  {
    return this.m.d;
  }
  
  public int u()
  {
    return 0;
  }
  
  public String v()
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder();
    zcjz localzcjz = new zcjz(localStringBuilder);
    localzcjz.c(this.l[0].b, this.l[0].c, null);
    if (this.o > 0) {
      for (int i1 = 1; i1 <= this.o; i1++) {
        localzcjz.a(this.l[i1].b, this.l[i1].c, null, this.l[i1].d);
      }
    }
    String str = b();
    localzcjz.d(str);
    localzcjz.b();
    return zs.a(localStringBuilder);
  }
  
  public String b()
    throws Exception
  {
    switch (this.m.a)
    {
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
      d();
      return "";
    }
    if (this.l[0].f)
    {
      d();
      return "";
    }
    this.m = this.l[0];
    this.m.a = 4;
    this.k = (this.i + 1);
    int i1 = 1;
    String str = null;
    while (i1 > 0)
    {
      this.i += 1;
      switch (this.h[this.i])
      {
      case '\000': 
        x();
        this.i -= 1;
        break;
      case '<': 
        this.i += 1;
        if (this.i >= this.j) {
          x();
        }
        switch (this.h[this.i])
        {
        case '!': 
          if (this.i == 0) {
            this.d.delete(this.d.length() - 1, this.d.length() - 1 + 1);
          } else {
            this.d.append(this.h, this.k, this.i - this.k - 1);
          }
          f();
          this.k = (this.i + 1);
          break;
        case '?': 
          if (this.i == 0) {
            this.d.delete(this.d.length() - 1, this.d.length() - 1 + 1);
          } else {
            this.d.append(this.h, this.k, this.i - this.k - 1);
          }
          e();
          this.k = (this.i + 1);
          break;
        case '/': 
          i1--;
          if (i1 == 0) {
            if (this.i == 0)
            {
              if (this.d.length() != 0)
              {
                str = this.d.substring(0, 0 + (this.d.length() - 1));
                this.d.delete(0, 0 + this.d.length());
              }
            }
            else if (this.d.length() != 0)
            {
              this.d.append(this.h, this.k, this.i - this.k - 1);
              str = zs.a(this.d);
              this.d.delete(0, 0 + this.d.length());
            }
            else
            {
              str = new String(this.h, this.k, this.i - this.k - 1);
            }
          }
          do
          {
            this.i += 1;
            if (this.i >= this.j) {
              if (str != null) {
                z();
              } else {
                x();
              }
            }
          } while (this.h[this.i] != '>');
          break;
        default: 
          i1++;
          int i2 = 1;
          while (i2 != 0)
          {
            this.i += 1;
            switch (this.h[this.i])
            {
            case '\000': 
              x();
              this.i -= 1;
              break;
            case '"': 
            case '\'': 
              int i3 = this.h[this.i];
              do
              {
                this.i += 1;
                if (this.i >= this.j) {
                  x();
                }
              } while (this.h[this.i] != i3);
              break;
            case '/': 
              i1--;
              break;
            case '>': 
              i2 = 0;
            }
          }
        }
        break;
      }
    }
    d();
    return str;
  }
  
  public zcjs a(zcjv paramzcjv, boolean paramBoolean)
    throws Exception
  {
    if (this.b == null) {
      this.b = new boolean['Ā'];
    }
    k();
    this.c.c = (this.c.d = null);
    boolean bool = this.g;
    int i1 = 0;
    Object localObject1 = this.c;
    for (;;)
    {
      Object localObject2;
      Object localObject3;
      switch (this.m.a)
      {
      case 0: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
        break;
      case 1: 
        localObject2 = new zcjn((zcjs)localObject1);
        ((zcjn)localObject2).a(this.l[0]);
        if (this.o > 0)
        {
          ((zcjn)localObject2).a = new zcjh((zcjs)localObject2, this.o);
          for (int i2 = 1; i2 <= this.o; i2++)
          {
            zcjg localzcjg = new zcjg((zcjs)localObject2);
            localzcjg.a(this.l[i2]);
            ((zcjn)localObject2).a.a(localzcjg);
          }
        }
        if (((zcjs)localObject1).d != null)
        {
          localObject3 = ((zcjs)localObject1).d.c;
          ((zcjn)localObject2).c = ((zcjs)localObject3);
          ((zcjs)localObject1).d.c = ((zcjs)localObject2);
          ((zcjs)localObject1).d = ((zcjs)localObject2);
        }
        else
        {
          ((zcjn)localObject2).c = ((zcjs)localObject2);
          ((zcjs)localObject1).d = ((zcjs)localObject2);
        }
        if (!o())
        {
          localObject1 = localObject2;
          if (paramzcjv != null)
          {
            localObject3 = paramzcjv.a((zcjs)localObject2);
            this.g = ((zcjw)localObject3).a;
            this.b[(i1++)] = this.g;
          }
          else
          {
            this.b[(i1++)] = this.g;
          }
        }
        break;
      case 4: 
        localObject1 = ((zcjs)localObject1).b;
        i1--;
        this.g = this.b[i1];
        break;
      case 3: 
        localObject2 = new zcjx((zcjs)localObject1);
        ((zcjs)localObject2).h = this.l[0].d;
        if (((zcjs)localObject1).d != null)
        {
          localObject3 = ((zcjs)localObject1).d.c;
          ((zcjs)localObject2).c = ((zcjs)localObject3);
          ((zcjs)localObject1).d.c = ((zcjs)localObject2);
          ((zcjs)localObject1).d = ((zcjs)localObject2);
        }
        else
        {
          ((zcjs)localObject2).c = ((zcjs)localObject2);
          ((zcjs)localObject1).d = ((zcjs)localObject2);
        }
        break;
      }
      if (i1 != 0) {
        if (!d()) {
          break;
        }
      }
    }
    this.g = bool;
    d();
    if (paramBoolean) {
      return this.c;
    }
    return this.c.d;
  }
  
  private void D()
    throws Exception
  {
    if (this.i + 7 >= this.j) {
      b(7);
    }
    if (this.i + 7 >= this.j) {
      return;
    }
    int i1 = -1;
    int i2 = this.i;
    int i3;
    if ((this.h[(i2 + 1)] == 'x') && (this.h[(i2 + 6)] == '_'))
    {
      i1 = 0;
      for (i3 = 2; i3 < 6; i3++)
      {
        int i4 = zcjj.b(this.h[(i2 + i3)]);
        if (i4 >= 0) {
          i1 = (i1 << 4) + i4;
        } else {
          return;
        }
      }
    }
    if (i1 != -1)
    {
      i3 = 6;
      this.i += i3;
      this.h[this.i] = ((char)i1);
      if (i2 - this.k < this.j - this.i)
      {
        System.arraycopy(this.h, this.k, this.h, this.k + i3, i2 - this.k);
        this.k += i3;
      }
      else
      {
        System.arraycopy(this.h, this.i, this.h, i2, this.j - this.i + 1);
        this.j -= i3;
        this.i = i2;
        this.h[this.j] = '\000';
      }
    }
  }
  
  public void w()
    throws Exception
  {
    if (this.i + 9 > this.j) {
      b(8);
    }
    int i1 = this.i;
    for (int i2 = 1; i2 < 9; i2++)
    {
      this.i += 1;
      switch (this.h[this.i])
      {
      case '/': 
      case '<': 
      case '>': 
        this.i -= 1;
        return;
      case ';': 
        i2++;
        int i3 = 0;
        if (i2 == 2) {
          return;
        }
        Object localObject;
        if (this.h[(1 + i1)] == '#')
        {
          int i4;
          if ((this.h[(2 + i1)] | 0x20) == 'x') {
            for (i4 = 3; i4 < i2 - 1; i4++)
            {
              int i5 = zcjj.b(this.h[(i4 + i1)]);
              if (i5 >= 0) {
                i3 = (i3 << 4) + i5;
              } else {
                return;
              }
            }
          } else {
            for (i4 = 2; i4 < i2 - 1; i4++) {
              if (Character.isDigit(this.h[(i4 + i1)])) {
                i3 = i3 * 10 + this.h[(i4 + i1)] - 48;
              } else {
                return;
              }
            }
          }
        }
        else
        {
          localObject = new String(this.h, i1, i2);
          switch (t.a((String)localObject))
          {
          case 0: 
            i3 = 34;
            break;
          case 1: 
            i3 = 39;
            break;
          case 2: 
            i3 = 38;
            break;
          case 3: 
            i3 = 60;
            break;
          case 4: 
            i3 = 62;
            break;
          case 5: 
            i3 = 32;
            break;
          case 6: 
            i3 = 161;
            break;
          case 7: 
            i3 = 162;
            break;
          case 8: 
            i3 = 163;
            break;
          case 9: 
            i3 = 164;
            break;
          case 10: 
            i3 = 165;
            break;
          case 11: 
            i3 = 166;
            break;
          case 12: 
            i3 = 167;
            break;
          case 13: 
            i3 = 168;
            break;
          case 14: 
            i3 = 169;
            break;
          case 15: 
            i3 = 170;
            break;
          case 16: 
            i3 = 171;
            break;
          case 17: 
            i3 = 172;
            break;
          case 18: 
            i3 = 173;
            break;
          case 19: 
            i3 = 174;
            break;
          case 20: 
            i3 = 175;
            break;
          case 21: 
            i3 = 176;
            break;
          case 22: 
            i3 = 177;
            break;
          case 23: 
            i3 = 178;
            break;
          case 24: 
            i3 = 179;
            break;
          case 25: 
            i3 = 180;
            break;
          case 26: 
            i3 = 181;
            break;
          case 27: 
            i3 = 182;
            break;
          case 28: 
            i3 = 183;
            break;
          case 29: 
            i3 = 184;
            break;
          case 30: 
            i3 = 185;
            break;
          case 31: 
            i3 = 186;
            break;
          case 32: 
            i3 = 187;
            break;
          case 33: 
            i3 = 188;
            break;
          case 34: 
            i3 = 189;
            break;
          case 35: 
            i3 = 190;
            break;
          case 36: 
            i3 = 191;
            break;
          case 37: 
            i3 = 192;
            break;
          case 38: 
            i3 = 193;
            break;
          case 39: 
            i3 = 194;
            break;
          case 40: 
            i3 = 195;
            break;
          case 41: 
            i3 = 196;
            break;
          case 42: 
            i3 = 197;
            break;
          case 43: 
            i3 = 198;
            break;
          case 44: 
            i3 = 199;
            break;
          case 45: 
            i3 = 200;
            break;
          case 46: 
            i3 = 201;
            break;
          case 47: 
            i3 = 202;
            break;
          case 48: 
            i3 = 203;
            break;
          case 49: 
            i3 = 204;
            break;
          case 50: 
            i3 = 205;
            break;
          case 51: 
            i3 = 206;
            break;
          case 52: 
            i3 = 207;
            break;
          case 53: 
            i3 = 208;
            break;
          case 54: 
            i3 = 209;
            break;
          case 55: 
            i3 = 210;
            break;
          case 56: 
            i3 = 211;
            break;
          case 57: 
            i3 = 212;
            break;
          case 58: 
            i3 = 213;
            break;
          case 59: 
            i3 = 214;
            break;
          case 60: 
            i3 = 215;
            break;
          case 61: 
            i3 = 216;
            break;
          case 62: 
            i3 = 217;
            break;
          case 63: 
            i3 = 218;
            break;
          case 64: 
            i3 = 219;
            break;
          case 65: 
            i3 = 220;
            break;
          case 66: 
            i3 = 221;
            break;
          case 67: 
            i3 = 222;
            break;
          case 68: 
            i3 = 223;
            break;
          case 69: 
            i3 = 224;
            break;
          case 70: 
            i3 = 225;
            break;
          case 71: 
            i3 = 226;
            break;
          case 72: 
            i3 = 227;
            break;
          case 73: 
            i3 = 228;
            break;
          case 74: 
            i3 = 229;
            break;
          case 75: 
            i3 = 230;
            break;
          case 76: 
            i3 = 231;
            break;
          case 77: 
            i3 = 232;
            break;
          case 78: 
            i3 = 233;
            break;
          case 79: 
            i3 = 234;
            break;
          case 80: 
            i3 = 235;
            break;
          case 81: 
            i3 = 236;
            break;
          case 82: 
            i3 = 237;
            break;
          case 83: 
            i3 = 238;
            break;
          case 84: 
            i3 = 239;
            break;
          case 85: 
            i3 = 240;
            break;
          case 86: 
            i3 = 241;
            break;
          case 87: 
            i3 = 242;
            break;
          case 88: 
            i3 = 243;
            break;
          case 89: 
            i3 = 244;
            break;
          case 90: 
            i3 = 245;
            break;
          case 91: 
            i3 = 246;
            break;
          case 92: 
            i3 = 247;
            break;
          case 93: 
            i3 = 248;
            break;
          case 94: 
            i3 = 249;
            break;
          case 95: 
            i3 = 250;
            break;
          case 96: 
            i3 = 251;
            break;
          case 97: 
            i3 = 252;
            break;
          case 98: 
            i3 = 253;
            break;
          case 99: 
            i3 = 254;
            break;
          case 100: 
            i3 = 255;
            break;
          default: 
            i3 = -1;
          }
        }
        if (i3 != -1)
        {
          if (i3 > 65535)
          {
            localObject = zce.a().a(i3);
            System.arraycopy(localObject, 0, this.h, this.i - 1, localObject.length);
            i2 -= 2;
          }
          else
          {
            this.h[this.i] = ((char)i3);
            i2--;
          }
          if (i1 - this.k < this.j - this.i)
          {
            System.arraycopy(this.h, this.k, this.h, this.k + i2, i1 - this.k);
            this.k += i2;
          }
          else
          {
            System.arraycopy(this.h, this.i, this.h, i1, this.j - this.i + 1);
            this.j -= i2;
            this.i = i1;
            this.h[this.j] = '\000';
          }
        }
        return;
      }
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.e = (this.f = paramBoolean);
  }
  
  public void a(int paramInt)
  {
    this.g = (paramInt != 0);
  }
  
  public void c(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public void x()
    throws Exception
  {
    if (this.s == null) {
      throw new zcjp("Unexcepted eof.");
    }
    this.d.append(this.h, this.k, this.i - this.k);
    this.i = 0;
    this.k = 0;
    this.j = this.s.a(this.h, 0, this.q);
    if (this.j <= 0) {
      throw new zcjp("Unexcepted eof.");
    }
    if (this.j < this.q) {
      this.h[this.j] = '\000';
    }
  }
  
  public void y()
    throws Exception
  {
    if (this.s == null) {
      throw new zcjp("Unexcepted eof.");
    }
    if (this.k >= this.j)
    {
      this.j = this.s.a(this.h, 0, this.q);
      if (this.j <= 0) {
        throw new zcjp("Unexcepted eof.");
      }
      this.i = 0;
      this.k = 0;
      this.h[this.j] = '\000';
      return;
    }
    if (this.k != 0)
    {
      int i1 = this.j - this.k;
      System.arraycopy(this.h, this.k, this.h, 0, i1);
      i2 = this.s.a(this.h, i1, this.q - i1);
      if (i2 <= 0) {
        throw new zcjp("Unexcepted eof.");
      }
      this.j = (i1 + i2);
      this.i -= this.k;
      this.k = 0;
      this.h[this.j] = '\000';
      return;
    }
    this.q <<= 1;
    char[] arrayOfChar = new char[this.q + 1];
    System.arraycopy(this.h, 0, arrayOfChar, 0, this.i);
    this.h = arrayOfChar;
    int i2 = this.s.a(this.h, this.i, this.q - this.i);
    if (i2 <= 0) {
      throw new zcjp("Unexcepted eof.");
    }
    this.j = (this.i + i2);
    this.h[this.j] = '\000';
  }
  
  public void b(int paramInt)
    throws Exception
  {
    if (this.s == null) {
      return;
    }
    if (this.k >= this.j)
    {
      this.j = this.s.a(this.h, 0, this.q);
      if (this.j <= 0) {
        return;
      }
      this.i = 0;
      this.k = 0;
      this.h[this.j] = '\000';
      return;
    }
    int i1 = this.q - this.j;
    if ((i1 < paramInt) && (this.k != 0))
    {
      int i2 = this.j - this.k;
      System.arraycopy(this.h, this.k, this.h, 0, i2);
      this.i -= this.k;
      this.k = 0;
      this.j = i2;
      this.h[this.j] = '\000';
    }
    if (this.q - this.j < paramInt)
    {
      this.q <<= 1;
      char[] arrayOfChar = new char[this.q + 1];
      System.arraycopy(this.h, 0, arrayOfChar, 0, this.j);
      this.h = arrayOfChar;
    }
    int i3 = this.s.a(this.h, this.j, this.q - this.j);
    if (i3 <= 0) {
      i3 = 0;
    }
    this.j += i3;
    this.h[this.j] = '\000';
  }
  
  public void z()
    throws Exception
  {
    if (this.s == null) {
      throw new zcjp("Unexcepted eof.");
    }
    this.j = this.s.a(this.h, 0, this.q);
    if (this.j <= 0) {
      throw new zcjp("Unexcepted eof.");
    }
    this.i = 0;
    if (this.j < this.q) {
      this.h[this.j] = '\000';
    }
  }
  
  private boolean E()
    throws Exception
  {
    if (this.s == null) {
      return false;
    }
    this.j = this.s.a(this.h, 0, this.q);
    if (this.j <= 0) {
      return false;
    }
    this.i = 0;
    if (this.j < this.q) {
      this.h[this.j] = '\000';
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */