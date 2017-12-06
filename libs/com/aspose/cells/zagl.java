package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import java.util.HashMap;
import java.util.Iterator;

class zagl
{
  private Workbook a;
  private HTMLLoadOptions b;
  
  public zagl(Workbook paramWorkbook, LoadOptions paramLoadOptions)
  {
    this.a = paramWorkbook;
    if (paramLoadOptions == null)
    {
      this.b = new HTMLLoadOptions();
    }
    else if (!(paramLoadOptions instanceof HTMLLoadOptions))
    {
      this.b = new HTMLLoadOptions();
      this.b.a(paramLoadOptions);
    }
    else
    {
      this.b = ((HTMLLoadOptions)paramLoadOptions);
    }
    Style localStyle = paramWorkbook.getWorksheets().C().a(15);
    localStyle.setVerticalAlignment(1);
  }
  
  /* Error */
  public void a(String paramString)
    throws Exception
  {
    // Byte code:
    //   0: aload_1
    //   1: iconst_3
    //   2: iconst_1
    //   3: iconst_3
    //   4: invokestatic 43	com/aspose/cells/b/a/d/zd:a	(Ljava/lang/String;III)Lcom/aspose/cells/b/a/d/ze;
    //   7: astore_2
    //   8: aload_0
    //   9: aload_2
    //   10: invokevirtual 55	com/aspose/cells/zagl:a	(Lcom/aspose/cells/b/a/d/zm;)V
    //   13: aload_2
    //   14: ifnull +21 -> 35
    //   17: aload_2
    //   18: invokevirtual 44	com/aspose/cells/b/a/d/ze:a	()V
    //   21: goto +14 -> 35
    //   24: astore_3
    //   25: aload_2
    //   26: ifnull +7 -> 33
    //   29: aload_2
    //   30: invokevirtual 44	com/aspose/cells/b/a/d/ze:a	()V
    //   33: aload_3
    //   34: athrow
    //   35: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	this	zagl
    //   0	36	1	paramString	String
    //   7	23	2	localze	com.aspose.cells.b.a.d.ze
    //   24	10	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	13	24	finally
  }
  
  public void a(zm paramzm)
    throws Exception
  {
    if (this.b.a)
    {
      localObject = b(paramzm);
      if (localObject != null) {
        try
        {
          this.b.setEncoding(Encoding.getEncoding((String)localObject));
        }
        catch (Exception localException)
        {
          this.b.setEncoding(Encoding.getUTF8());
        }
      }
    }
    this.a.getSettings().a(this.b.getEncoding());
    Object localObject = null;
    localObject = new zagk(paramzm, this.a, this.b);
    ((zagk)localObject).l();
    ((zagk)localObject).p().m().V();
    if (a((zagk)localObject)) {
      ((zagk)localObject).a(((zagk)localObject).p(), this.a, this.a.getSettings().g());
    }
    ((zagk)localObject).b.clear();
  }
  
  private boolean a(zagk paramzagk)
  {
    Iterator localIterator = paramzagk.p().l().values().iterator();
    while (localIterator.hasNext())
    {
      zm localzm = (zm)localIterator.next();
      if (localzm != null) {
        return true;
      }
    }
    return false;
  }
  
  private String b(zm paramzm)
    throws Exception
  {
    zn localzn = new zn(paramzm);
    String str1 = null;
    int i = 0;
    String str2 = null;
    while (((str2 = localzn.f()) != null) && (i <= 5))
    {
      int j = str2.indexOf("charset");
      if ((str2.trim().startsWith("<meta")) && (j > -1))
      {
        String str3 = str2.substring(j, j + (str2.length() - j - 1));
        str1 = str3.trim().substring(str3.indexOf("=") + 1);
        i = str1.indexOf('"');
        if (i != -1) {
          str1 = str1.substring(0, 0 + i);
        }
        i = str1.indexOf('/');
        if (i == -1) {
          break;
        }
        str1 = str1.substring(0, 0 + i);
        break;
      }
      i++;
    }
    paramzm.b(0L);
    return str1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zagl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */