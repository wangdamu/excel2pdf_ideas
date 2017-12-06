package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.zas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class zhk
{
  private int a = 1;
  private zdk b;
  private zas c;
  private zhl d;
  private zhh e;
  private ArrayList f = new ArrayList();
  private ArrayList g = new ArrayList();
  private HashMap h = new HashMap();
  private zt i;
  
  public zhk(zdk paramzdk)
    throws Exception
  {
    this.b = paramzdk;
    d();
  }
  
  public void a()
    throws Exception
  {
    zdm localzdm = this.b.b().a("/Documents/1/FixedDocument.fdoc");
    Iterator localIterator = this.e.e().keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      zgs localzgs = ((zgw)this.e.e().get(localObject)).a();
      if (localzgs.v()) {
        localzdm.e().a("http://schemas.microsoft.com/xps/2005/06/restricted-font", (String)localObject, false);
      }
    }
    this.c.b();
    e();
    f();
    this.e.a();
    zdq.a(this.b, false);
    zdi.a(this.b, false);
  }
  
  public void a(float paramFloat1, float paramFloat2)
    throws Exception
  {
    this.c.b("PageContent");
    this.c.c("Source", "Pages/" + this.a + ".fpage");
    this.e.a(this.a);
    this.d = new zhl(this.e, new zas(this.e.c().d(), true), true);
    this.d.a(this.a, paramFloat1, paramFloat2);
  }
  
  public void b()
    throws Exception
  {
    if ((this.f != null) && (this.f.size() > 0))
    {
      this.c.b("PageContent.LinkTargets");
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        this.c.b("LinkTarget");
        this.c.c("Name", str);
        this.c.c();
      }
      this.f.clear();
      this.c.c();
    }
    this.c.c();
    this.d.a();
    this.e.b();
    this.a += 1;
  }
  
  public void a(zt paramzt)
    throws Exception
  {
    if (this.a == 1) {
      this.i = paramzt;
    }
    String str1 = "" + paramzt.b() + paramzt.c();
    String str2 = (String)this.h.get(str1);
    if (str2 == null)
    {
      str2 = "/Documents/1/Metadata/Page" + this.a + "_PT.xml";
      this.h.put(str1, str2);
      zdm localzdm = new zdm(str2, "application/vnd.ms-printing.printticket+xml");
      zhs.a(new zas(localzdm.d(), true), paramzt, true);
      this.b.b().a(localzdm);
    }
    this.e.c().e().a("http://schemas.microsoft.com/xps/2005/06/printticket", str2, false);
  }
  
  private void a(zdm paramzdm)
    throws Exception
  {
    zdm localzdm = new zdm("/Metadata/MXDC_Empty_PT.xml", "application/vnd.ms-printing.printticket+xml");
    zhs.a(new zas(localzdm.d(), true));
    paramzdm.e().a("http://schemas.microsoft.com/xps/2005/06/printticket", localzdm.a(), false);
    this.b.b().a(localzdm);
  }
  
  private void b(zdm paramzdm)
    throws Exception
  {
    zdm localzdm = new zdm("/Metadata/Job_PT.xml", "application/vnd.ms-printing.printticket+xml");
    zhs.a(new zas(localzdm.d(), true), this.i, false);
    paramzdm.e().a("http://schemas.microsoft.com/xps/2005/06/printticket", localzdm.a(), false);
    this.b.b().a(localzdm);
  }
  
  private void d()
    throws Exception
  {
    this.e = new zhh(this.b);
    zdm localzdm = new zdm("/Documents/1/FixedDocument.fdoc", "application/vnd.ms-package.xps-fixeddocument+xml");
    this.c = new zas(localzdm.d(), false);
    this.c.a("FixedDocument");
    this.c.c("xmlns", "http://schemas.microsoft.com/xps/2005/06");
    a(localzdm);
    this.b.b().b(localzdm);
  }
  
  private void e()
    throws Exception
  {
    zdm localzdm = new zdm("/FixedDocumentSequence.fdseq", "application/vnd.ms-package.xps-fixeddocumentsequence+xml");
    zas localzas = new zas(localzdm.d(), false);
    localzas.a("FixedDocumentSequence");
    localzas.c("xmlns", "http://schemas.microsoft.com/xps/2005/06");
    localzas.b("DocumentReference");
    localzas.c("Source", "Documents/1/FixedDocument.fdoc");
    localzas.c();
    localzas.b();
    this.b.c().a("http://schemas.microsoft.com/xps/2005/06/fixedrepresentation", "/FixedDocumentSequence.fdseq", false);
    b(localzdm);
    this.b.b().a(localzdm);
  }
  
  private void f()
    throws Exception
  {
    zdm localzdm = new zdm("/docProps/core.xml", "application/vnd.openxmlformats-package.core-properties+xml");
    zas localzas = new zas(localzdm.d(), false);
    zdj.a(localzas, this.e.d().b(), this.e.d().c(), this.e.d().d(), this.e.d().e(), this.e.d().f(), this.e.d().g(), this.e.d().h(), this.e.d().j(), this.e.d().k(), this.e.d().l(), this.e.d().i());
    this.b.c().a("http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties", "/docProps/core.xml", false);
    this.b.b().a(localzdm);
  }
  
  public zhl c()
  {
    return this.d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zhk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */