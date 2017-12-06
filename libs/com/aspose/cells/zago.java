package com.aspose.cells;

import com.aspose.cells.b.a.d.zc;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zo;
import java.util.HashMap;

class zago
{
  zo a;
  private Encoding b = Encoding.getUTF8();
  private int c = 12;
  private HashMap d = new HashMap();
  
  public void a(Encoding paramEncoding)
  {
    this.b = paramEncoding;
  }
  
  public int a()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public HashMap b()
  {
    return this.d;
  }
  
  zago(zm paramzm, Encoding paramEncoding)
    throws Exception
  {
    this.b = paramEncoding;
    this.a = a(paramzm, this.b);
    this.a.b(true);
  }
  
  zago(String paramString, Encoding paramEncoding)
    throws Exception
  {
    zc.b(zk.e(paramString));
    ze localze = new ze(paramString, 2);
    this.b = paramEncoding;
    this.a = a(localze, this.b);
    this.a.b(true);
  }
  
  void a(String paramString)
    throws Exception
  {
    this.a.a(paramString);
  }
  
  void a(boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    if (paramBoolean1)
    {
      a("<html xmlns:v=\"urn:schemas-microsoft-com:vml\"");
      b("xmlns:o=\"urn:schemas-microsoft-com:office:office\"");
      b("xmlns:x=\"urn:schemas-microsoft-com:office:excel\"");
      b("xmlns=\"http://www.w3.org/TR/REC-html40\"");
      if (paramBoolean2) {
        this.a.a("dir=\"RTL\"");
      }
      this.a.a(">");
    }
    else
    {
      b("<html");
      if (paramBoolean2) {
        this.a.a("dir=\"RTL\"");
      }
      this.a.a(">");
    }
  }
  
  void c()
    throws Exception
  {
    b("</html>");
  }
  
  void d()
    throws Exception
  {
    b("<head>");
  }
  
  void e()
    throws Exception
  {
    b("</head>");
  }
  
  void f()
    throws Exception
  {
    this.a.b();
  }
  
  void b(String paramString)
    throws Exception
  {
    this.a.a("\n" + paramString);
  }
  
  void g()
    throws Exception
  {
    this.a.a("\n");
  }
  
  void h()
    throws Exception
  {
    this.a.c();
  }
  
  void a(boolean paramBoolean)
    throws Exception
  {
    String str = CellsHelper.getVersion();
    if (paramBoolean) {
      b("<meta name=\"Excel Workbook Frameset\">");
    }
    b("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=" + this.b.b() + "\">");
    b("<meta name=\"ProgId\" content=\"Excel.Sheet\">");
    b("<meta name=\"Generator\" content=\"Aspose.Cell " + str + "\">");
  }
  
  private zo a(zm paramzm, Encoding paramEncoding)
    throws Exception
  {
    return new zo(paramzm, paramEncoding);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zago.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */