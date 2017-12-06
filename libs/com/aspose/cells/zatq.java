package com.aspose.cells;

import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.d.zm;

class zatq
{
  private Workbook a = null;
  private zi b = null;
  private zasg c = null;
  
  zatq(Workbook paramWorkbook)
  {
    this.a = paramWorkbook;
    this.c = new zasg(paramWorkbook);
    paramWorkbook.getWorksheets().clear();
  }
  
  void a(zm paramzm)
    throws Exception
  {
    a(zi.a(paramzm));
  }
  
  /* Error */
  void a(zi paramzi)
    throws Exception
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield 23	com/aspose/cells/zatq:b	Lcom/aspose/cells/a/f/zi;
    //   5: aload_0
    //   6: getfield 24	com/aspose/cells/zatq:c	Lcom/aspose/cells/zasg;
    //   9: aload_1
    //   10: putfield 21	com/aspose/cells/zasg:k	Lcom/aspose/cells/a/f/zi;
    //   13: new 8	com/aspose/cells/zasq
    //   16: dup
    //   17: aload_1
    //   18: aload_0
    //   19: getfield 22	com/aspose/cells/zatq:a	Lcom/aspose/cells/Workbook;
    //   22: invokespecial 33	com/aspose/cells/zasq:<init>	(Lcom/aspose/cells/a/f/zi;Lcom/aspose/cells/Workbook;)V
    //   25: astore_2
    //   26: aload_2
    //   27: invokevirtual 34	com/aspose/cells/zasq:a	()V
    //   30: aload_0
    //   31: invokespecial 46	com/aspose/cells/zatq:d	()V
    //   34: aload_0
    //   35: iconst_0
    //   36: invokespecial 43	com/aspose/cells/zatq:a	(Z)V
    //   39: aload_0
    //   40: invokespecial 45	com/aspose/cells/zatq:c	()V
    //   43: aload_0
    //   44: iconst_1
    //   45: invokespecial 43	com/aspose/cells/zatq:a	(Z)V
    //   48: aload_0
    //   49: invokespecial 44	com/aspose/cells/zatq:b	()V
    //   52: aload_0
    //   53: invokespecial 41	com/aspose/cells/zatq:a	()V
    //   56: aload_0
    //   57: getfield 23	com/aspose/cells/zatq:b	Lcom/aspose/cells/a/f/zi;
    //   60: invokevirtual 31	com/aspose/cells/a/f/zi:b	()V
    //   63: goto +13 -> 76
    //   66: astore_3
    //   67: aload_0
    //   68: getfield 23	com/aspose/cells/zatq:b	Lcom/aspose/cells/a/f/zi;
    //   71: invokevirtual 31	com/aspose/cells/a/f/zi:b	()V
    //   74: aload_3
    //   75: athrow
    //   76: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	zatq
    //   0	77	1	paramzi	zi
    //   25	2	2	localzasq	zasq
    //   66	9	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   13	56	66	finally
  }
  
  private void a()
    throws Exception
  {
    FileFormatInfo localFileFormatInfo = new FileFormatInfo();
    FileFormatUtil.a(localFileFormatInfo, this.b);
    if (localFileFormatInfo.a == 55) {
      this.a.d = 55;
    }
  }
  
  private void b()
    throws Exception
  {
    zasv localzasv = new zasv(this.c);
    if (this.b.a("meta.xml", true) == -1) {
      return;
    }
    zcjy localzcjy = zauy.a(this.b, "meta.xml", false);
    if (localzcjy.o())
    {
      localzcjy.a();
      return;
    }
    localzasv.a(localzcjy);
  }
  
  private void a(boolean paramBoolean)
    throws Exception
  {
    zatu localzatu = new zatu(this.a, this.c, paramBoolean);
    localzatu.a(this.b);
  }
  
  private void c()
    throws Exception
  {
    zate localzate = new zate(this.c);
    localzate.a(this.b);
  }
  
  private void d()
    throws Exception
  {
    zato localzato = new zato(this.c);
    localzato.a(this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zatq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */