package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

class zbth
  extends CollectionBase
{
  public zbti a(int paramInt)
  {
    return (zbti)this.InnerList.get(paramInt);
  }
  
  public int[] a(WorksheetCollection paramWorksheetCollection)
  {
    int i = -1;
    for (int j = 0; j < getCount(); j++)
    {
      zbti localzbti2 = a(j);
      if (localzbti2.a() == 5)
      {
        i = j;
        break;
      }
    }
    if (i == -1)
    {
      zbti localzbti1 = new zbti(5);
      zf.a(this.InnerList, localzbti1);
      i = this.InnerList.size() - 1;
    }
    int k = paramWorksheetCollection.r().a(i, 65534, 65534);
    return new int[] { k, i, 65534, 65534 };
  }
  
  public int a(zbti paramzbti)
  {
    zf.a(this.InnerList, paramzbti);
    return getCount() - 1;
  }
  
  int a(String paramString1, String paramString2, boolean paramBoolean)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zbti localzbti2 = a(i);
      if ((localzbti2.a() == 4) && (zw.b(localzbti2.l(), paramString2))) {
        return i;
      }
    }
    if (paramBoolean)
    {
      zbti localzbti1 = new zbti(4);
      a(localzbti1);
      localzbti1.a("Paint.Picture", paramString2);
      return getCount() - 1;
    }
    return -1;
  }
  
  int b(zbti paramzbti)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zbti localzbti = a(i);
      if (localzbti.a(paramzbti)) {
        return i;
      }
    }
    return -1;
  }
  
  int a(WorksheetCollection paramWorksheetCollection1, WorksheetCollection paramWorksheetCollection2, zbti paramzbti)
  {
    String[] arrayOfString = null;
    int i = -1;
    zbti localzbti;
    if (paramzbti.e())
    {
      localzbti = new zbti();
      i = this.InnerList.size();
      zf.a(this.InnerList, localzbti);
      String str = paramWorksheetCollection2.p().getFileName();
      if ((str == null) || ("".equals(str))) {
        str = "Book1" + (paramWorksheetCollection2.p().h() ? ".xlsx" : ".xls");
      }
      arrayOfString = new String[paramWorksheetCollection2.getCount()];
      for (int j = 0; j < paramWorksheetCollection2.getCount(); j++) {
        arrayOfString[j] = paramWorksheetCollection2.get(j).getName();
      }
      localzbti.a(str, arrayOfString, 0);
    }
    else
    {
      localzbti = new zbti();
      localzbti.c(paramzbti.i());
      localzbti.a(paramzbti.a());
      i = this.InnerList.size();
      zf.a(this.InnerList, localzbti);
      if (paramzbti.c() != null)
      {
        arrayOfString = new String[paramzbti.c().length];
        System.arraycopy(paramzbti.c(), 0, arrayOfString, 0, arrayOfString.length);
        localzbti.a(arrayOfString);
      }
      localzbti.a(paramzbti.b());
    }
    return i;
  }
  
  static int[] a(WorksheetCollection paramWorksheetCollection, String paramString)
  {
    String[] arrayOfString1 = zw.d(paramString, '!');
    paramString = arrayOfString1[0];
    String str1 = arrayOfString1[1];
    if (str1.charAt(0) == '\'') {
      str1 = str1.substring(1, 1 + (str1.length() - 2));
    }
    int i = -1;
    zbth localzbth = paramWorksheetCollection.w();
    int j = -1;
    zbti localzbti1 = null;
    if ((paramString != null) && (paramString.length() > 2) && (paramString.charAt(0) == '[') && (paramString.charAt(paramString.length() - 1) == ']') && (zarb.b(paramString.substring(1, 1 + (paramString.length() - 2)))))
    {
      paramString = paramString.substring(1, 1 + (paramString.length() - 2));
      i = zp.a(paramString);
      localzbti1 = localzbth.a(i);
      j = paramWorksheetCollection.r().f(i, 65534, 65534);
    }
    else
    {
      localObject1 = zw.d(paramString, '|');
      String str2 = null;
      String str3 = null;
      for (int n = 0; n < localzbth.getCount(); n++)
      {
        zbti localzbti2 = localzbth.a(n);
        if ((localzbti2.a() == 3) || (localzbti2.a() == 4))
        {
          String[] arrayOfString2 = { str2 };
          String[] arrayOfString3 = { str3 };
          localzbti2.a(arrayOfString2, arrayOfString3);
          str2 = arrayOfString2[0];
          str3 = arrayOfString3[0];
          if ((zw.b(str2, localObject1[0])) && (zw.b(str3, localObject1[1])))
          {
            i = n;
            break;
          }
        }
      }
      if (i != -1)
      {
        localzbti1 = localzbth.a(i);
        j = paramWorksheetCollection.r().f(i, 65534, 65534);
      }
      else
      {
        localzbti1 = new zbti(3);
        localzbti1.a(localObject1[0], localObject1[1]);
        localzbth.a(localzbti1);
        i = localzbth.getCount() - 1;
        j = paramWorksheetCollection.r().b(i & 0xFFFF, 65534, 65534);
      }
    }
    Object localObject1 = localzbti1.b();
    int k = -1;
    for (int m = 0; m < ((ArrayList)localObject1).size(); m++)
    {
      zwh localzwh = (zwh)((ArrayList)localObject1).get(m);
      if (zw.b(localzwh.e(), str1))
      {
        k = m;
        break;
      }
    }
    if (k == -1) {
      if (((ArrayList)localObject1).size() == 0)
      {
        k = 0;
        localObject2 = new zwh(localzbti1);
        ((zwh)localObject2).a(str1);
        zf.a((ArrayList)localObject1, localObject2);
        localObject2 = new zwh(localzbti1);
        ((zwh)localObject2).a("StdDocumentName");
        zf.a((ArrayList)localObject1, localObject2);
      }
      else
      {
        localObject2 = new zwh(localzbti1);
        ((zwh)localObject2).a(str1);
        if ("StdDocumentName".equals(((zwh)((ArrayList)localObject1).get(((ArrayList)localObject1).size() - 1)).e()))
        {
          k = ((ArrayList)localObject1).size() - 1;
          ((ArrayList)localObject1).add(k, localObject2);
        }
        else
        {
          zf.a((ArrayList)localObject1, localObject2);
          k = ((ArrayList)localObject1).size() - 1;
        }
      }
    }
    Object localObject2 = new int[2];
    localObject2[0] = j;
    localObject2[1] = (k + 1);
    return (int[])localObject2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */