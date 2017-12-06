package com.aspose.cells;

import com.aspose.cells.a.c.zx;
import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;

public class WorkbookMetadata
{
  private Workbook a;
  private zm b;
  private MetadataOptions c;
  private int d = 6;
  
  public WorkbookMetadata(String fileName, MetadataOptions options)
    throws Exception
  {
    this.c = options;
    ze localze = zd.b(fileName);
    try
    {
      b(localze);
    }
    finally
    {
      if (localze != null) {
        localze.a();
      }
    }
  }
  
  public MetadataOptions getOptions()
  {
    return this.c;
  }
  
  public BuiltInDocumentPropertyCollection getBuiltInDocumentProperties()
  {
    if (this.a == null) {
      return null;
    }
    return this.a.getWorksheets().getBuiltInDocumentProperties();
  }
  
  public CustomDocumentPropertyCollection getCustomDocumentProperties()
  {
    if (this.a == null) {
      return null;
    }
    return this.a.getWorksheets().getCustomDocumentProperties();
  }
  
  private void b(zm paramzm)
    throws Exception
  {
    LoadOptions localLoadOptions = new LoadOptions();
    localLoadOptions.setOnlyLoadDocumentProperties(true);
    this.c.setPassword(localLoadOptions.getPassword());
    int i = 0;
    if ((this.c.getMetadataType() & 0x4) == 4)
    {
      this.a = new Workbook(paramzm, localLoadOptions);
      i = 1;
      this.d = localLoadOptions.getLoadFormat();
    }
    if (i == 0)
    {
      this.b = new zh();
      zx.a(paramzm, this.b);
      this.b.a(0L, 0);
    }
  }
  
  /* Error */
  public void save(String fileName)
    throws Exception
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 41	com/aspose/cells/b/a/d/zd:a	(Ljava/lang/String;)Lcom/aspose/cells/b/a/d/ze;
    //   4: astore_2
    //   5: aload_0
    //   6: aload_2
    //   7: invokevirtual 35	com/aspose/cells/WorkbookMetadata:a	(Lcom/aspose/cells/b/a/d/zm;)V
    //   10: aload_2
    //   11: ifnull +21 -> 32
    //   14: aload_2
    //   15: invokevirtual 43	com/aspose/cells/b/a/d/ze:a	()V
    //   18: goto +14 -> 32
    //   21: astore_3
    //   22: aload_2
    //   23: ifnull +7 -> 30
    //   26: aload_2
    //   27: invokevirtual 43	com/aspose/cells/b/a/d/ze:a	()V
    //   30: aload_3
    //   31: athrow
    //   32: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	this	WorkbookMetadata
    //   0	33	1	fileName	String
    //   4	23	2	localze	ze
    //   21	10	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   5	10	21	finally
  }
  
  void a(zm paramzm)
    throws Exception
  {
    if (this.a != null) {
      if ((this.c.getMetadataType() & 0x1) == 1) {
        this.a.getSettings().setPassword(this.c.getPassword());
      } else if ((this.c.getMetadataType() & 0x2) == 2) {
        this.a.getSettings().setPassword(null);
      }
    }
    if ((this.c.getMetadataType() & 0x4) == 4)
    {
      this.a.a(paramzm, FileFormatUtil.loadFormatToSaveFormat(this.d));
      return;
    }
    if ((this.c.getMetadataType() & 0x2) == 2)
    {
      zm localzm = zto.a(this.b, this.c.getPassword());
      zx.a(localzm, paramzm);
    }
    else if ((this.c.getMetadataType() & 0x1) == 1)
    {
      zto.a(paramzm, (zh)this.b, this.c.getPassword(), this.c.getKeyLength());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/WorkbookMetadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */