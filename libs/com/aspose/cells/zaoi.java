package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zaoi
{
  private HashMap a = null;
  private Workbook b = null;
  private HTMLLoadOptions c = null;
  private zbsm d;
  
  public zaoi(Workbook paramWorkbook, LoadOptions paramLoadOptions)
  {
    this.b = paramWorkbook;
    this.d = new zbsm();
    if ((paramLoadOptions == null) || (!(paramLoadOptions instanceof HTMLLoadOptions))) {
      this.c = new HTMLLoadOptions();
    } else {
      this.c = ((HTMLLoadOptions)paramLoadOptions);
    }
    this.c.setStreamProvider(this.d);
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
    //   4: invokestatic 45	com/aspose/cells/b/a/d/zd:a	(Ljava/lang/String;III)Lcom/aspose/cells/b/a/d/ze;
    //   7: astore_2
    //   8: aload_0
    //   9: aload_2
    //   10: invokevirtual 61	com/aspose/cells/zaoi:a	(Lcom/aspose/cells/b/a/d/zm;)V
    //   13: aload_2
    //   14: ifnull +21 -> 35
    //   17: aload_2
    //   18: invokevirtual 46	com/aspose/cells/b/a/d/ze:a	()V
    //   21: goto +14 -> 35
    //   24: astore_3
    //   25: aload_2
    //   26: ifnull +7 -> 33
    //   29: aload_2
    //   30: invokevirtual 46	com/aspose/cells/b/a/d/ze:a	()V
    //   33: aload_3
    //   34: athrow
    //   35: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	this	zaoi
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
    zapp localzapp = new zapp();
    this.d.a(localzapp.a(paramzm, Encoding.getUTF8()));
    a();
  }
  
  private void a()
    throws Exception
  {
    ArrayList localArrayList = this.d.a();
    String str1 = "filelist.xml";
    zm localzm1 = a(localArrayList, str1);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    String str2;
    if ((localArrayList.size() > 1) && (localzm1 != null))
    {
      localObject1 = zauz.a(localzm1, null, false);
      localObject2 = ((zcjm)localObject1).c("o:MainFile");
      localObject3 = (zcjn)((zcju)localObject2).a(0);
      localObject4 = zauj.a((zcjs)localObject3, "HRef");
      str2 = ((String)localObject4).substring(((String)localObject4).lastIndexOf("/") + 1);
      zm localzm2 = a(localArrayList, str2);
      b(localzm2);
    }
    else if (localArrayList.size() == 1)
    {
      b(((zapo)localArrayList.get(0)).b);
    }
    else
    {
      localObject1 = localArrayList.iterator();
      this.a = new HashMap();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zapo)((Iterator)localObject1).next();
        if (((zapo)localObject2).c.indexOf("css") != -1)
        {
          localObject3 = new zagk(((zapo)localObject2).b, this.b, this.c);
          ((zagk)localObject3).p().a(((zapo)localObject2).b);
          localObject4 = ((zagk)localObject3).p().m().af().keySet().iterator();
          while (((Iterator)localObject4).hasNext())
          {
            str2 = (String)((Iterator)localObject4).next();
            if (this.a.containsKey(str2)) {
              this.a.put(str2, ((zagk)localObject3).p().m().af().get(str2));
            } else {
              this.a.put(str2, ((zagk)localObject3).p().m().af().get(str2));
            }
          }
        }
      }
      localObject1 = localArrayList.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zapo)((Iterator)localObject1).next();
        if (("text/html".equals(((zapo)localObject2).c)) && (((zapo)localObject2).b.d())) {
          b(((zapo)localObject2).b);
        }
      }
    }
  }
  
  /* Error */
  private void b(zm paramzm)
    throws Exception
  {
    // Byte code:
    //   0: new 17	com/aspose/cells/zagk
    //   3: dup
    //   4: aload_1
    //   5: aload_0
    //   6: getfield 36	com/aspose/cells/zaoi:b	Lcom/aspose/cells/Workbook;
    //   9: aload_0
    //   10: getfield 37	com/aspose/cells/zaoi:c	Lcom/aspose/cells/HTMLLoadOptions;
    //   13: invokespecial 56	com/aspose/cells/zagk:<init>	(Lcom/aspose/cells/b/a/d/zm;Lcom/aspose/cells/Workbook;Lcom/aspose/cells/HTMLLoadOptions;)V
    //   16: astore_2
    //   17: aload_0
    //   18: getfield 35	com/aspose/cells/zaoi:a	Ljava/util/HashMap;
    //   21: ifnull +17 -> 38
    //   24: aload_2
    //   25: invokevirtual 59	com/aspose/cells/zagk:p	()Lcom/aspose/cells/zage;
    //   28: invokevirtual 55	com/aspose/cells/zage:m	()Lcom/aspose/cells/zagd;
    //   31: aload_0
    //   32: getfield 35	com/aspose/cells/zaoi:a	Ljava/util/HashMap;
    //   35: invokevirtual 52	com/aspose/cells/zagd:s	(Ljava/util/HashMap;)V
    //   38: aload_2
    //   39: invokevirtual 58	com/aspose/cells/zagk:l	()V
    //   42: aload_2
    //   43: invokevirtual 59	com/aspose/cells/zagk:p	()Lcom/aspose/cells/zage;
    //   46: invokevirtual 55	com/aspose/cells/zage:m	()Lcom/aspose/cells/zagd;
    //   49: invokevirtual 50	com/aspose/cells/zagd:V	()V
    //   52: aload_0
    //   53: aload_2
    //   54: invokespecial 62	com/aspose/cells/zaoi:a	(Lcom/aspose/cells/zagk;)Z
    //   57: ifeq +18 -> 75
    //   60: aload_2
    //   61: aload_2
    //   62: invokevirtual 59	com/aspose/cells/zagk:p	()Lcom/aspose/cells/zage;
    //   65: aload_0
    //   66: getfield 36	com/aspose/cells/zaoi:b	Lcom/aspose/cells/Workbook;
    //   69: invokestatic 42	com/aspose/cells/Encoding:getUTF8	()Lcom/aspose/cells/Encoding;
    //   72: invokevirtual 57	com/aspose/cells/zagk:a	(Lcom/aspose/cells/zage;Lcom/aspose/cells/Workbook;Lcom/aspose/cells/Encoding;)V
    //   75: aload_1
    //   76: ifnull +21 -> 97
    //   79: aload_1
    //   80: invokevirtual 47	com/aspose/cells/b/a/d/zm:a	()V
    //   83: goto +14 -> 97
    //   86: astore_3
    //   87: aload_1
    //   88: ifnull +7 -> 95
    //   91: aload_1
    //   92: invokevirtual 47	com/aspose/cells/b/a/d/zm:a	()V
    //   95: aload_3
    //   96: athrow
    //   97: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	zaoi
    //   0	98	1	paramzm	zm
    //   16	46	2	localzagk	zagk
    //   86	10	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	75	86	finally
  }
  
  private zm a(ArrayList paramArrayList, String paramString)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zapo localzapo = (zapo)localIterator.next();
      String str = localzapo.a;
      if (str != null)
      {
        String[] arrayOfString = zw.d(str, '/');
        if (arrayOfString[(arrayOfString.length - 1)].equals(paramString)) {
          return localzapo.b;
        }
      }
    }
    return null;
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
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaoi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */