package com.aspose.cells.a.d;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zs;

public class zgc
  extends zep
{
  private zdx f = new zdx(paramzdz, this);
  private zfu g;
  private zgl h = new zgl();
  private zgl i = new zgl();
  
  public zgc(zdz paramzdz, String paramString, int paramInt)
    throws Exception
  {
    super(paramzdz, paramString, paramInt, true);
    this.g = new zfu(paramzdz, false);
    this.i.a(0, Integer.valueOf(0));
    this.h.a(0, Integer.valueOf(0));
  }
  
  public byte[] a(String paramString)
  {
    zcd[] arrayOfzcd = zce.a().a(paramString);
    byte[] arrayOfByte = new byte[arrayOfzcd.length * 2];
    int j = 0;
    for (int k = 0; k < arrayOfzcd.length; k++)
    {
      int m = arrayOfzcd[k].a;
      if ((m == 8206) || (m == 8207)) {
        m = 8203;
      }
      Object localObject = this.h.e(m);
      int n;
      if (localObject != null)
      {
        n = ((Integer)localObject).intValue();
      }
      else
      {
        int i1 = this.c.q(m);
        localObject = this.i.e(i1);
        if (localObject != null)
        {
          n = ((Integer)localObject).intValue();
          this.h.a(m, Integer.valueOf(n));
        }
        else
        {
          n = this.i.a();
          this.i.a(i1, Integer.valueOf(n));
          this.h.a(m, Integer.valueOf(n));
        }
      }
      arrayOfByte[(j++)] = ((byte)(n >> 8 & 0xFF));
      arrayOfByte[(j++)] = ((byte)(n & 0xFF));
    }
    return arrayOfByte;
  }
  
  public void a(zm paramzm)
    throws Exception
  {
    zgu localzgu = new zgu();
    localzgu.a(this.c, this.i, paramzm, false, false);
  }
  
  public String t()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    for (int j = 0; j < this.h.a(); j++)
    {
      int k = this.h.d(j);
      int m = ((Integer)this.h.c(j)).intValue();
      zgx localzgx = this.c.e().b(k);
      String str = zp.a(m) + "[" + zp.a(a(localzgx.c())) + "]";
      localStringBuilder.append(str);
    }
    localStringBuilder.append("]");
    return zs.a(localStringBuilder);
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    b(paramzez);
    this.f.a = this.h.a();
    this.f.a(paramzez);
    c(paramzez);
  }
  
  public String s()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("F");
    String str = zp.a(super.n(), 5);
    int j = 17;
    for (int k = 0; k < str.length(); k++) {
      localStringBuilder.append((char)(str.charAt(k) + j));
    }
    return zs.a(localStringBuilder);
  }
  
  private void b(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    paramzez.a("/Type", "/Font");
    paramzez.a("/Subtype", "/Type0");
    paramzez.a("/Encoding", "/Identity-H");
    paramzez.a("/BaseFont", "/" + f());
    paramzez.a("/DescendantFonts", "[" + this.f.o() + "]");
    paramzez.a("/ToUnicode", this.g.o());
    paramzez.h();
    paramzez.b();
  }
  
  private void c(zez paramzez)
    throws Exception
  {
    this.g.b("/CIDInit /ProcSet findresource begin");
    this.g.b("11 dict begin");
    this.g.b("begincmap");
    this.g.b("/CIDSystemInfo");
    this.g.b("<< /Registry (Adobe)");
    this.g.b("/Ordering (UCS)");
    this.g.b("/Supplement 0");
    this.g.b(">> def");
    this.g.b("/CMapName /Adobe-Identity-UCS def");
    this.g.b("/CMapType 2 def");
    this.g.b("1 begincodespacerange");
    this.g.b("<0000><FFFF>");
    this.g.b("endcodespacerange");
    u();
    this.g.b("endcmap");
    this.g.b("CMapName currentdict /CMap defineresource pop");
    this.g.b("end");
    this.g.b("end");
    this.g.a(paramzez);
  }
  
  private void u()
    throws Exception
  {
    zgl localzgl = v();
    this.g.b(localzgl.a() + " beginbfchar");
    StringBuilder localStringBuilder = new StringBuilder(16);
    for (int j = 0; j < localzgl.a(); j++)
    {
      int k = localzgl.d(j);
      int m = ((Integer)localzgl.c(j)).intValue();
      localStringBuilder.setLength(0);
      localStringBuilder.append('<');
      localStringBuilder.append(zp.c(k));
      localStringBuilder.append(">");
      char[] arrayOfChar1 = zce.a().a(m);
      localStringBuilder.append('<');
      for (int i2 : arrayOfChar1) {
        localStringBuilder.append(zp.c(i2));
      }
      localStringBuilder.append('>');
      this.g.b(zs.a(localStringBuilder));
    }
    this.g.b("endbfchar");
  }
  
  private zgl v()
  {
    zgl localzgl = new zgl();
    for (int j = 0; j < this.h.a(); j++)
    {
      int k = this.h.d(j);
      int m = ((Integer)this.h.c(j)).intValue();
      localzgl.b(m, Integer.valueOf(k));
    }
    return localzgl;
  }
  
  protected void c()
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(q());
    localStringBuilder.append("+");
    localStringBuilder.append(b());
    if ((e()) && (d())) {
      localStringBuilder.append(",BoldItalic");
    } else if (e()) {
      localStringBuilder.append(",Bold");
    } else if (d()) {
      localStringBuilder.append(",Italic");
    }
    this.d = zs.a(localStringBuilder);
  }
  
  public boolean m()
  {
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */