package com.aspose.cells;

import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

abstract class zf
  implements com.aspose.cells.b.a.zj
{
  Workbook a = null;
  zm b = null;
  com.aspose.cells.a.f.zj c = null;
  zpt d = null;
  boolean e = false;
  zi f = null;
  int g = 6;
  SaveOptions h;
  boolean i;
  
  public void a()
  {
    dispose();
  }
  
  public void dispose()
  {
    if (this.d != null) {
      this.d.dispose();
    }
    this.d = null;
    this.c = null;
    this.h = null;
    this.b = null;
    this.a = null;
    this.f = null;
    zg.a(this);
  }
  
  zf(Workbook paramWorkbook, SaveOptions paramSaveOptions)
  {
    this.a = paramWorkbook;
    this.h = paramSaveOptions;
    this.i = ((this.a.getSettings().d != null) && (this.a.getSettings().d.getOnlyLoadDocumentProperties()));
  }
  
  /* Error */
  void a(zm paramzm)
    throws Exception
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield 51	com/aspose/cells/zf:b	Lcom/aspose/cells/b/a/d/zm;
    //   5: aload_0
    //   6: getfield 58	com/aspose/cells/zf:i	Z
    //   9: ifeq +17 -> 26
    //   12: new 40	com/aspose/cells/zvc
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 125	com/aspose/cells/zvc:<init>	(Lcom/aspose/cells/zf;)V
    //   20: astore_2
    //   21: aload_2
    //   22: invokevirtual 126	com/aspose/cells/zvc:a	()V
    //   25: return
    //   26: aload_0
    //   27: invokevirtual 109	com/aspose/cells/zf:b	()V
    //   30: aload_0
    //   31: invokespecial 112	com/aspose/cells/zf:d	()V
    //   34: aload_0
    //   35: getfield 50	com/aspose/cells/zf:a	Lcom/aspose/cells/Workbook;
    //   38: getfield 48	com/aspose/cells/Workbook:a	Lcom/aspose/cells/zqw;
    //   41: ifnull +29 -> 70
    //   44: aload_0
    //   45: getfield 50	com/aspose/cells/zf:a	Lcom/aspose/cells/Workbook;
    //   48: getfield 48	com/aspose/cells/Workbook:a	Lcom/aspose/cells/zqw;
    //   51: getfield 66	com/aspose/cells/zqw:a	Lcom/aspose/cells/zqr;
    //   54: ifnull +16 -> 70
    //   57: aload_0
    //   58: getfield 50	com/aspose/cells/zf:a	Lcom/aspose/cells/Workbook;
    //   61: getfield 48	com/aspose/cells/Workbook:a	Lcom/aspose/cells/zqw;
    //   64: getfield 66	com/aspose/cells/zqw:a	Lcom/aspose/cells/zqr;
    //   67: invokevirtual 120	com/aspose/cells/zqr:a	()V
    //   70: aload_0
    //   71: getfield 53	com/aspose/cells/zf:d	Lcom/aspose/cells/zpt;
    //   74: getfield 62	com/aspose/cells/zpt:v	Lcom/aspose/cells/zang;
    //   77: ifnull +13 -> 90
    //   80: aload_0
    //   81: getfield 53	com/aspose/cells/zf:d	Lcom/aspose/cells/zpt;
    //   84: getfield 59	com/aspose/cells/zpt:b	Lcom/aspose/cells/zadm;
    //   87: invokevirtual 95	com/aspose/cells/zadm:a	()V
    //   90: aload_0
    //   91: getfield 50	com/aspose/cells/zf:a	Lcom/aspose/cells/Workbook;
    //   94: invokevirtual 73	com/aspose/cells/Workbook:getWorksheets	()Lcom/aspose/cells/WorksheetCollection;
    //   97: invokevirtual 77	com/aspose/cells/WorksheetCollection:d	()Lcom/aspose/cells/zaaf;
    //   100: invokevirtual 94	com/aspose/cells/zaaf:d	()V
    //   103: goto +75 -> 178
    //   106: astore_3
    //   107: aload_0
    //   108: getfield 50	com/aspose/cells/zf:a	Lcom/aspose/cells/Workbook;
    //   111: getfield 48	com/aspose/cells/Workbook:a	Lcom/aspose/cells/zqw;
    //   114: ifnull +29 -> 143
    //   117: aload_0
    //   118: getfield 50	com/aspose/cells/zf:a	Lcom/aspose/cells/Workbook;
    //   121: getfield 48	com/aspose/cells/Workbook:a	Lcom/aspose/cells/zqw;
    //   124: getfield 66	com/aspose/cells/zqw:a	Lcom/aspose/cells/zqr;
    //   127: ifnull +16 -> 143
    //   130: aload_0
    //   131: getfield 50	com/aspose/cells/zf:a	Lcom/aspose/cells/Workbook;
    //   134: getfield 48	com/aspose/cells/Workbook:a	Lcom/aspose/cells/zqw;
    //   137: getfield 66	com/aspose/cells/zqw:a	Lcom/aspose/cells/zqr;
    //   140: invokevirtual 120	com/aspose/cells/zqr:a	()V
    //   143: aload_0
    //   144: getfield 53	com/aspose/cells/zf:d	Lcom/aspose/cells/zpt;
    //   147: getfield 62	com/aspose/cells/zpt:v	Lcom/aspose/cells/zang;
    //   150: ifnull +13 -> 163
    //   153: aload_0
    //   154: getfield 53	com/aspose/cells/zf:d	Lcom/aspose/cells/zpt;
    //   157: getfield 59	com/aspose/cells/zpt:b	Lcom/aspose/cells/zadm;
    //   160: invokevirtual 95	com/aspose/cells/zadm:a	()V
    //   163: aload_0
    //   164: getfield 50	com/aspose/cells/zf:a	Lcom/aspose/cells/Workbook;
    //   167: invokevirtual 73	com/aspose/cells/Workbook:getWorksheets	()Lcom/aspose/cells/WorksheetCollection;
    //   170: invokevirtual 77	com/aspose/cells/WorksheetCollection:d	()Lcom/aspose/cells/zaaf;
    //   173: invokevirtual 94	com/aspose/cells/zaaf:d	()V
    //   176: aload_3
    //   177: athrow
    //   178: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	179	0	this	zf
    //   0	179	1	paramzm	zm
    //   20	2	2	localzvc	zvc
    //   106	71	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   30	34	106	finally
  }
  
  private void d()
    throws Exception
  {
    c();
    e();
    a(this.c, this.d.i);
    this.c.f_();
    this.a.b(this.b);
  }
  
  private void e()
    throws Exception
  {
    zur localzur = new zur(this.a, this.c);
    localzur.a();
  }
  
  static void a(com.aspose.cells.a.f.zj paramzj, ArrayList paramArrayList)
    throws Exception
  {
    a(paramzj, paramArrayList, false);
    a(paramzj, paramArrayList, true);
  }
  
  private static void a(com.aspose.cells.a.f.zj paramzj, ArrayList paramArrayList, boolean paramBoolean)
    throws Exception
  {
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      zp localzp = (zp)paramArrayList.get(j);
      if (localzp.a() == paramBoolean) {
        localzp.a(paramzj);
      }
    }
  }
  
  void b()
    throws Exception
  {
    WorksheetCollection localWorksheetCollection = this.a.getWorksheets();
    localWorksheetCollection.d().c();
    zug.b(this.a.getWorksheets());
    if (this.a.a != null) {
      this.f = this.a.a.a.b;
    }
    this.d = new zpt(this.a, this.f, this.e, this.g, this.h, this.i);
    if (this.d.v != null)
    {
      localWorksheetCollection.a(new zbsz(this.d.v));
      localWorksheetCollection.a(new zbsu(this.d.v));
    }
    if ((!this.i) && (this.d.c.size() == 0)) {
      throw new CellsException(6, "Dot not support export a wbook without normal worksheet to excel 2007 format");
    }
    this.c = new com.aspose.cells.a.f.zj(this.b);
  }
  
  void c()
    throws Exception
  {
    if (this.a.a == null) {
      return;
    }
    a("xl/diagrams/");
    a("userCustomization/");
    a("xl/model/");
    if (this.a.isDigitallySigned()) {
      a("_xmlsignatures/");
    }
    a("vstoDataStore/");
    f();
  }
  
  private void f()
    throws Exception
  {
    if ((this.a.a == null) || (this.a.a.i.size() == 0)) {
      return;
    }
    ArrayList localArrayList = this.a.a.i;
    for (int j = 0; j < localArrayList.size(); j++)
    {
      zqo localzqo = (zqo)localArrayList.get(j);
      if (!localzqo.c.startsWith("customXml"))
      {
        a(localzqo.b, localzqo.c);
        String str1 = zauj.ao(localzqo.b);
        String str2 = zauj.ao(localzqo.c);
        b(str1, str2);
      }
    }
  }
  
  void a(String paramString)
    throws Exception
  {
    a(paramString, paramString, true);
  }
  
  void a(String paramString1, String paramString2)
    throws Exception
  {
    a(paramString1, paramString2, false);
  }
  
  private void a(String paramString1, String paramString2, boolean paramBoolean)
    throws Exception
  {
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      zh localzh1 = (zh)localIterator.next();
      if (((paramBoolean) || (zw.b(localzh1.b(), paramString1))) && ((!paramBoolean) || (localzh1.b().startsWith(paramString1))))
      {
        if (paramBoolean) {
          paramString2 = localzh1.b();
        }
        zh localzh2 = this.c.a(paramString2);
        localzh2.a(DateTime.getNow());
        this.c.a(localzh2);
        byte[] arrayOfByte = new byte['Ѐ'];
        int j = 0;
        zm localzm = this.f.a(localzh1);
        do
        {
          j = localzm.a(arrayOfByte, 0, arrayOfByte.length);
          this.c.b(arrayOfByte, 0, j);
        } while (j > 0);
        localzm.a();
        this.c.b();
      }
    }
  }
  
  static void a(zi paramzi, zh paramzh, com.aspose.cells.a.f.zj paramzj, String paramString)
    throws Exception
  {
    zh localzh = paramzj.a(paramString);
    localzh.a(DateTime.getNow());
    paramzj.a(localzh);
    byte[] arrayOfByte = new byte['Ѐ'];
    int j = 0;
    zm localzm = paramzi.a(paramzh);
    do
    {
      j = localzm.a(arrayOfByte, 0, arrayOfByte.length);
      paramzj.b(arrayOfByte, 0, j);
    } while (j > 0);
    localzm.a();
    paramzj.b();
  }
  
  private void b(String paramString1, String paramString2)
    throws Exception
  {
    if (this.f.a(paramString1, true) != -1)
    {
      zcjy localzcjy = zauy.a(this.f, paramString1, true);
      ArrayList localArrayList = zalb.a(localzcjy);
      localzcjy.c();
      this.a.a.a(localArrayList);
      zcjz localzcjz = zauy.a(paramString2, this.c, true);
      zvh.a(localzcjz, localArrayList);
      localzcjz.e();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */