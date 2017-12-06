package com.aspose.cells;

import com.aspose.cells.a.c.zx;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class ztj
{
  static void a(zm paramzm, zxf paramzxf, zcc paramzcc)
    throws Exception
  {
    byte[] arrayOfByte = new byte[8];
    paramzm.a(arrayOfByte, 0, 8);
    arrayOfByte = paramzcc.c(arrayOfByte, 0L);
    int i = zc.a(arrayOfByte, 0);
    int j = zc.a(arrayOfByte, 4);
    int k = i;
    arrayOfByte = new byte[j];
    paramzm.a(k, 0);
    paramzm.a(arrayOfByte, 0, arrayOfByte.length);
    arrayOfByte = paramzcc.c(arrayOfByte, 0L);
    ztk[] arrayOfztk = null;
    k = 0;
    int m = zc.a(arrayOfByte, k);
    k += 4;
    arrayOfztk = new ztk[m];
    Object localObject;
    for (int n = 0; n < m; n++)
    {
      localObject = new ztk();
      ((ztk)localObject).a = zc.a(arrayOfByte, k);
      ((ztk)localObject).b = zc.a(arrayOfByte, k + 4);
      k += 8;
      ((ztk)localObject).c = zc.b(arrayOfByte, k);
      k += 2;
      int i1 = arrayOfByte[k] & 0xFF;
      k++;
      ((ztk)localObject).d = ((arrayOfByte[k] & 0xFF & 0x1) != 0);
      k++;
      k += 4;
      ((ztk)localObject).e = Encoding.getUnicode().a(arrayOfByte, k, i1 * 2);
      k += i1 * 2 + 2;
      arrayOfztk[n] = localObject;
    }
    if (arrayOfztk != null) {
      for (m = 0; m < arrayOfztk.length; m++)
      {
        ztk localztk = arrayOfztk[m];
        paramzm.a(localztk.a, 0);
        arrayOfByte = new byte[localztk.b];
        paramzm.a(arrayOfByte, 0, arrayOfByte.length);
        arrayOfByte = paramzcc.c(arrayOfByte, localztk.c);
        if (localztk.d)
        {
          paramzxf.a().a(localztk.e, new zh(arrayOfByte));
        }
        else
        {
          localObject = null;
          try
          {
            localObject = new zxf(new zh(arrayOfByte));
          }
          catch (Exception localException) {}
          if (localObject != null) {
            paramzxf.a().b(localztk.e, ((zxf)localObject).a());
          } else {
            paramzxf.a().b(localztk.e, new zh(arrayOfByte));
          }
        }
      }
    }
  }
  
  static void a(zxf paramzxf, zcc paramzcc)
    throws Exception
  {
    zh localzh = new zh();
    byte[] arrayOfByte = new byte[8];
    localzh.b(arrayOfByte, 0, 8);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = paramzxf.a().c().iterator();
    while (localIterator1.hasNext())
    {
      localObject1 = (String)localIterator1.next();
      if ("XML".equals(localObject1)) {
        a(localzh, paramzxf, (String)localObject1, localArrayList, paramzcc);
      } else if ((((String)localObject1).length() == 11) && ((((String)localObject1).startsWith("MBD")) || (((String)localObject1).startsWith("LNK")))) {
        a(localzh, paramzxf, (String)localObject1, localArrayList, paramzcc);
      }
    }
    if (localArrayList.size() == 0) {
      return;
    }
    a(localzh, paramzxf, "\005SummaryInformation", localArrayList, paramzcc);
    int i = (int)localzh.i();
    Object localObject1 = new zh();
    ((zh)localObject1).b(zc.a(localArrayList.size()), 0, 4);
    Iterator localIterator2 = localArrayList.iterator();
    while (localIterator2.hasNext())
    {
      localObject2 = (ztk)localIterator2.next();
      paramzxf.a().g(((ztk)localObject2).e);
      ((zh)localObject1).b(zc.a(((ztk)localObject2).a), 0, 4);
      ((zh)localObject1).b(zc.a(((ztk)localObject2).b), 0, 4);
      ((zh)localObject1).b(zc.a(((ztk)localObject2).c), 0, 2);
      ((zh)localObject1).a((byte)((ztk)localObject2).e.length());
      ((zh)localObject1).a((byte)(((ztk)localObject2).d ? 1 : 0));
      ((zh)localObject1).b(arrayOfByte, 0, 4);
      ((zh)localObject1).b(Encoding.getUnicode().a(((ztk)localObject2).e), 0, ((ztk)localObject2).e.length() * 2);
      ((zh)localObject1).b(arrayOfByte, 0, 2);
    }
    int j = (int)((zh)localObject1).h();
    Object localObject2 = ((zh)localObject1).o();
    localObject2 = paramzcc.c((byte[])localObject2, 0L);
    localzh.b((byte[])localObject2, 0, localObject2.length);
    System.arraycopy(zc.a(i), 0, arrayOfByte, 0, 4);
    System.arraycopy(zc.a(j), 0, arrayOfByte, 4, 4);
    arrayOfByte = paramzcc.c(arrayOfByte, 0L);
    localzh.a(0L, 0);
    localzh.b(arrayOfByte, 0, 8);
    localzh.a(0L, 0);
    paramzxf.a().a("encryption", localzh);
  }
  
  private static void a(zh paramzh, zxf paramzxf, String paramString, ArrayList paramArrayList, zcc paramzcc)
    throws Exception
  {
    ztk localztk = new ztk();
    zf.a(paramArrayList, localztk);
    localztk.e = paramString;
    localztk.c = paramArrayList.size();
    localztk.a = ((int)paramzh.i());
    Object localObject1 = paramzxf.a().d(paramString);
    zh localzh = null;
    if ((localObject1 instanceof zaoz))
    {
      localzh = new zh();
      localObject2 = new zxf((zaoz)localObject1);
      ((zxf)localObject2).a(localzh);
      localzh.a(0L, 0);
      localztk.d = false;
    }
    else
    {
      localzh = (zh)localObject1;
      localztk.d = true;
    }
    Object localObject2 = zx.a(localzh, false);
    localObject2 = paramzcc.c((byte[])localObject2, localztk.c);
    localztk.b = localObject2.length;
    paramzh.b((byte[])localObject2, 0, localObject2.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ztj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */