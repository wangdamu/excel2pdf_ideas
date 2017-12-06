package com.aspose.cells;

import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

class zbdf
{
  static byte[] a(int paramInt, String paramString, FontSetting[] paramArrayOfFontSetting, WorksheetCollection paramWorksheetCollection)
  {
    zd localzd = new zd();
    int i;
    int m;
    for (int j = 0; j < paramArrayOfFontSetting.length; j++)
    {
      FontSetting localFontSetting = paramArrayOfFontSetting[j];
      if (localFontSetting.h() != null)
      {
        paramWorksheetCollection.a(localFontSetting.h());
        if (localFontSetting.getStartIndex() + localFontSetting.getLength() >= paramString.length())
        {
          localzd.b(Integer.valueOf(localFontSetting.getStartIndex()), Integer.valueOf(localFontSetting.getFont().m()));
          i = localzd.e(Integer.valueOf(localFontSetting.getStartIndex()));
          while (localzd.b() - 1 > i) {
            localzd.d(localzd.b() - 1);
          }
        }
        localzd.b(Integer.valueOf(localFontSetting.getStartIndex()), Integer.valueOf(localFontSetting.getFont().m()));
        i = localzd.e(Integer.valueOf(localFontSetting.getStartIndex()));
        if (i == localzd.b() - 1) {
          localzd.b(Integer.valueOf(localFontSetting.getStartIndex() + localFontSetting.getLength()), Integer.valueOf(paramInt));
        } else {
          for (m = i + 1; m < localzd.b() - 1; m++)
          {
            int n = ((Integer)localzd.c(m)).intValue();
            if (n < localFontSetting.getStartIndex() + localFontSetting.getLength())
            {
              n = ((Integer)localzd.c(m + 1)).intValue();
              if (n <= localFontSetting.getStartIndex() + localFontSetting.getLength())
              {
                localzd.d(m);
                m--;
              }
              else if (n > localFontSetting.getStartIndex() + localFontSetting.getLength())
              {
                localzd.b(Integer.valueOf(localFontSetting.getStartIndex() + localFontSetting.getLength()), Integer.valueOf(localFontSetting.getFont().m()));
                break;
              }
            }
            else
            {
              if (n <= localFontSetting.getStartIndex() + localFontSetting.getLength()) {
                break;
              }
              localzd.b(Integer.valueOf(localFontSetting.getStartIndex() + localFontSetting.getLength()), Integer.valueOf(paramInt));
            }
          }
        }
      }
    }
    byte[] arrayOfByte = new byte[localzd.b() * 4];
    for (int k = 0; k < localzd.b(); k++)
    {
      i = ((Integer)localzd.c(k)).intValue();
      m = ((Integer)localzd.b(k)).intValue();
      System.arraycopy(zc.a(i), 0, arrayOfByte, 4 * k, 2);
      System.arraycopy(zc.a(m), 0, arrayOfByte, 4 * k + 2, 2);
    }
    return arrayOfByte;
  }
  
  static void a(ArrayList paramArrayList, int paramInt, Font paramFont, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    zf.a(localArrayList, Integer.valueOf(0));
    if (paramInt != 0) {
      zf.a(localArrayList, Integer.valueOf(paramInt));
    }
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      localObject = (FontSetting)paramArrayList.get(i);
      if ((!localArrayList.contains(Integer.valueOf(((FontSetting)localObject).getStartIndex()))) && (((FontSetting)localObject).getStartIndex() < paramInt)) {
        zf.a(localArrayList, Integer.valueOf(((FontSetting)localObject).getStartIndex()));
      }
      if ((!localArrayList.contains(Integer.valueOf(((FontSetting)localObject).getStartIndex() + ((FontSetting)localObject).getLength()))) && (((FontSetting)localObject).getStartIndex() + ((FontSetting)localObject).getLength() < paramInt)) {
        zf.a(localArrayList, Integer.valueOf(((FontSetting)localObject).getStartIndex() + ((FontSetting)localObject).getLength()));
      }
    }
    Collections.sort(localArrayList);
    HashMap localHashMap = new HashMap();
    Object localObject = new ArrayList();
    for (int j = 0; j < localArrayList.size() - 1; j++)
    {
      int k = ((Integer)localArrayList.get(j)).intValue();
      int m = ((Integer)localArrayList.get(j + 1)).intValue();
      if (m <= k + paramInt)
      {
        FontSetting localFontSetting1 = null;
        int n = 0;
        for (int i1 = 0; i1 < paramArrayList.size(); i1++)
        {
          localFontSetting1 = (FontSetting)paramArrayList.get(i1);
          if ((k >= localFontSetting1.getStartIndex()) && (m <= localFontSetting1.getStartIndex() + localFontSetting1.getLength()))
          {
            if (localHashMap.containsKey(Integer.valueOf(k)))
            {
              ((FontSetting)localHashMap.get(Integer.valueOf(k))).getFont().f(localFontSetting1.getFont());
            }
            else if ((k == localFontSetting1.getStartIndex()) && (m == localFontSetting1.getStartIndex() + localFontSetting1.getLength()))
            {
              zf.a((ArrayList)localObject, localFontSetting1);
            }
            else
            {
              FontSetting localFontSetting3 = new FontSetting(k, m - k, localFontSetting1.s);
              if (localFontSetting1.q != null) {
                localFontSetting3.getFont().a(localFontSetting1.getFont(), null);
              }
              zf.a((ArrayList)localObject, localFontSetting3);
              localHashMap.put(Integer.valueOf(k), localFontSetting3);
            }
            n = 1;
          }
        }
        if (n == 0)
        {
          FontSetting localFontSetting2 = new FontSetting(k, m - k, paramFont.c);
          localFontSetting2.a(paramFont);
          zf.a((ArrayList)localObject, localFontSetting2);
        }
      }
    }
    paramArrayList.clear();
    zf.a(paramArrayList, (Collection)localObject);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */