package com.aspose.cells.a.d;

import com.aspose.cells.DateTime;
import com.aspose.cells.PdfBookmarkEntry;
import com.aspose.cells.PdfSecurityOptions;
import java.util.HashMap;

public class zff
{
  private static boolean b = false;
  private String c;
  private String d;
  private String e;
  private String f;
  private int g = 3;
  private int h = 3;
  private int i = 50;
  private boolean j = true;
  private boolean k;
  private PdfBookmarkEntry l = null;
  private static HashMap m = new HashMap();
  private static HashMap n = new HashMap();
  private int o = 0;
  private zfq p;
  private PdfSecurityOptions q = null;
  private static String r;
  private int s = -1;
  private DateTime t;
  private boolean u = false;
  public int a = 0;
  
  public static boolean a()
  {
    return b;
  }
  
  public int b()
  {
    return this.g;
  }
  
  public void a(int paramInt)
  {
    this.g = paramInt;
  }
  
  public int c()
  {
    return this.h;
  }
  
  public void b(int paramInt)
  {
    this.h = paramInt;
  }
  
  public int d()
  {
    return this.i;
  }
  
  public void c(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 100)) {
      throw new IllegalArgumentException("value");
    }
    this.i = paramInt;
  }
  
  public boolean e()
  {
    return this.j;
  }
  
  public void a(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public boolean f()
  {
    switch (this.h)
    {
    case 4: 
    case 5: 
    case 6: 
      return true;
    }
    return false;
  }
  
  public int g()
  {
    return ((Integer)m.get(Integer.valueOf(this.g))).intValue();
  }
  
  public int h()
  {
    return ((Integer)n.get(Integer.valueOf(this.h))).intValue();
  }
  
  public boolean i()
  {
    return this.k;
  }
  
  public PdfBookmarkEntry j()
  {
    return this.l;
  }
  
  public void a(PdfBookmarkEntry paramPdfBookmarkEntry)
  {
    this.l = paramPdfBookmarkEntry;
  }
  
  public String k()
  {
    return this.c;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public String l()
  {
    return this.d;
  }
  
  public void b(String paramString)
  {
    this.d = paramString;
  }
  
  public String m()
  {
    return this.f;
  }
  
  public void c(String paramString)
  {
    this.f = paramString;
  }
  
  public String n()
  {
    return this.e;
  }
  
  public void d(String paramString)
  {
    this.e = paramString;
  }
  
  public void d(int paramInt)
  {
    this.o = paramInt;
  }
  
  public zfq o()
  {
    return this.p;
  }
  
  public void a(zfq paramzfq)
  {
    this.p = paramzfq;
  }
  
  public PdfSecurityOptions p()
  {
    return this.q;
  }
  
  public void a(PdfSecurityOptions paramPdfSecurityOptions)
  {
    this.q = paramPdfSecurityOptions;
    if (paramPdfSecurityOptions != null) {
      d(0);
    }
  }
  
  public static void e(String paramString)
  {
    r = paramString;
  }
  
  public int q()
  {
    return this.s;
  }
  
  public void e(int paramInt)
  {
    this.s = paramInt;
  }
  
  public DateTime r()
  {
    return this.t;
  }
  
  public void a(DateTime paramDateTime)
  {
    this.t = paramDateTime;
  }
  
  public boolean s()
  {
    return this.u;
  }
  
  public void b(boolean paramBoolean)
  {
    this.u = paramBoolean;
  }
  
  public boolean t()
  {
    return this.o == 0;
  }
  
  public boolean u()
  {
    return (this.o == 1) || (this.o == 2);
  }
  
  public boolean v()
  {
    return this.o == 2;
  }
  
  static
  {
    m.put(Integer.valueOf(0), Integer.valueOf(0));
    m.put(Integer.valueOf(1), Integer.valueOf(5));
    m.put(Integer.valueOf(2), Integer.valueOf(3));
    m.put(Integer.valueOf(3), Integer.valueOf(4));
    n.put(Integer.valueOf(0), Integer.valueOf(0));
    n.put(Integer.valueOf(1), Integer.valueOf(5));
    n.put(Integer.valueOf(2), Integer.valueOf(3));
    n.put(Integer.valueOf(3), Integer.valueOf(4));
    n.put(Integer.valueOf(4), Integer.valueOf(8));
    n.put(Integer.valueOf(5), Integer.valueOf(6));
    n.put(Integer.valueOf(6), Integer.valueOf(6));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */