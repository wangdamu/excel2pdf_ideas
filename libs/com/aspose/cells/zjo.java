package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zjo
{
  static boolean a(ArrayList paramArrayList)
  {
    if (paramArrayList != null)
    {
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        if ((localObject != null) && ((localObject instanceof String)))
        {
          String str = (String)localObject;
          if (str.indexOf('\n') != -1) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  static boolean a(zjk paramzjk, zaca paramzaca)
  {
    if (paramzjk.c != null)
    {
      zaag localzaag = new zaag(paramzaca, paramzjk.c, 0, -1);
      zaie localzaie = localzaag.a();
      localzaie = zabt.b(localzaie, paramzaca);
      if (localzaie.b() == 9)
      {
        zbap localzbap = ((zabo)localzaie).o();
        if ((!localzbap.n()) && (!localzbap.o()))
        {
          if ((paramzjk.b != null) && (paramzjk.b.size() > 0))
          {
            Iterator localIterator = paramzjk.b.iterator();
            while (localIterator.hasNext())
            {
              Object localObject = localIterator.next();
              if (localObject != null) {
                if (!(localObject instanceof String)) {
                  return false;
                }
              }
            }
          }
          return true;
        }
      }
      return false;
    }
    return a(paramzjk.b);
  }
  
  static void a(ArrayList paramArrayList1, String paramString, ArrayList paramArrayList2, boolean paramBoolean)
  {
    if (paramArrayList1 != null)
    {
      Iterator localIterator = paramArrayList1.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        zjt localzjt = new zjt(localObject, 0, null);
        localzjt.c = paramString;
        zf.a(paramArrayList2, localzjt);
        if (((localObject instanceof Double)) || ((localObject instanceof Integer)))
        {
          localzjt.g = 4;
        }
        else
        {
          String str = null;
          if ((localObject instanceof DateTime)) {
            str = zs.a((DateTime)localObject);
          } else {
            str = (String)localObject;
          }
          if (str == null)
          {
            localzjt.g = 3;
            localzjt.e = true;
          }
          else if (str.length() == 0)
          {
            localzjt.g = 3;
            localzjt.e = true;
          }
          else if (ztr.d(str))
          {
            localzjt.g = 2;
            if (!paramBoolean) {}
          }
          else if ((paramBoolean) && (zarb.b(str)))
          {
            localzjt.a = Double.valueOf(zp.a(str));
            localzjt.g = 4;
          }
          else
          {
            localzjt.g = 5;
          }
        }
      }
    }
  }
  
  static Style a(Cells paramCells, int paramInt1, int paramInt2)
  {
    int i = paramCells.getRows().d(paramInt1);
    if (i != -1)
    {
      Row localRow = paramCells.getRows().getRowByIndex(i);
      if (localRow.k()) {
        return localRow.j();
      }
    }
    return null;
  }
  
  static String b(ArrayList paramArrayList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('{');
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Object localObject = paramArrayList.get(i);
      if ((localObject instanceof Double))
      {
        double d = ((Double)localObject).doubleValue();
        if (d == (int)d) {
          localStringBuilder.append((int)d);
        } else {
          localStringBuilder.append(zarb.a(d));
        }
      }
      else
      {
        localStringBuilder.append((String)localObject);
      }
      localStringBuilder.append(',');
    }
    return localStringBuilder.substring(0, 0 + (localStringBuilder.length() - 1)) + "}";
  }
  
  static ArrayList a(ArrayList paramArrayList, String paramString, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt)
  {
    paramArrayOfInt[0] = 1;
    String[][] arrayOfString = new String[paramArrayList.size()][];
    for (int i = 0; i < paramArrayList.size(); i++) {
      if (paramArrayList.get(i) != null)
      {
        String str = zs.a(paramArrayList.get(i));
        arrayOfString[i] = zw.d(str, '\n');
        if ((arrayOfString[i] != null) && (paramArrayOfInt[0] < arrayOfString[i].length)) {
          paramArrayOfInt[0] = arrayOfString[i].length;
        }
      }
    }
    if (paramArrayOfInt[0] == 1)
    {
      localArrayList1 = new ArrayList();
      a(paramArrayList, paramString, localArrayList1, true);
      return localArrayList1;
    }
    ArrayList localArrayList1 = new ArrayList();
    for (int j = 0; j < paramArrayOfInt[0]; j++) {
      zf.a(localArrayList1, new ArrayList());
    }
    for (j = 0; j < arrayOfString.length; j++)
    {
      int k;
      if (arrayOfString[j] == null) {
        for (k = 0; k < paramArrayOfInt[0]; k++)
        {
          zjt localzjt1 = new zjt(null, 0, null);
          zf.a((ArrayList)localArrayList1.get(k), localzjt1);
        }
      } else {
        for (k = paramArrayOfInt[0] - 1; k >= 0; k--)
        {
          int m = paramArrayOfInt[0] - 1 - k;
          ArrayList localArrayList2 = (ArrayList)localArrayList1.get(k);
          Object localObject;
          if (m < arrayOfString[j].length)
          {
            localObject = arrayOfString[j][m];
            zjt localzjt2 = new zjt(localObject, 0, null);
            zf.a((ArrayList)localArrayList1.get(k), localzjt2);
            if (localObject != null) {
              if (ztr.d((String)localObject)) {
                localzjt2.g = 2;
              } else {
                localzjt2.g = 5;
              }
            }
          }
          else
          {
            localObject = new zjt(null, 0, null);
            zf.a((ArrayList)localArrayList1.get(k), localObject);
          }
        }
      }
    }
    return localArrayList1;
  }
  
  static ArrayList a(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    for (int j = 0; j < paramString.length(); j++)
    {
      String str;
      if (paramString.charAt(j) == '"')
      {
        j++;
        i = j;
        while (j < paramString.length())
        {
          if (paramString.charAt(j) == '"')
          {
            str = paramString.substring(i, i + (j - i));
            if ("".equals(str)) {
              zf.a(localArrayList, "0");
            } else {
              zf.a(localArrayList, str.trim());
            }
            j++;
            while ((j < paramString.length()) && (paramString.charAt(j) != ',')) {
              j++;
            }
          }
          j++;
        }
      }
      if (paramString.charAt(j) != ' ')
      {
        i = j;
        if (paramString.charAt(j) == ',')
        {
          zf.a(localArrayList, "0");
          if (j == paramString.length() - 1) {
            zf.a(localArrayList, "0");
          }
        }
        else
        {
          j++;
          if (j == paramString.length())
          {
            str = paramString.substring(i, i + (j - i));
            zf.a(localArrayList, str.trim());
            break;
          }
          while (j < paramString.length())
          {
            if (paramString.charAt(j) == ',')
            {
              str = paramString.substring(i, i + (j - i));
              zf.a(localArrayList, str.trim());
              if (j != paramString.length() - 1) {
                break;
              }
              zf.a(localArrayList, "0");
              break;
            }
            if (j == paramString.length() - 1)
            {
              str = paramString.substring(i, i + (j - i + 1));
              zf.a(localArrayList, str.trim());
            }
            j++;
          }
        }
      }
    }
    return localArrayList;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */