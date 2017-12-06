package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zqb
{
  String a;
  Font b;
  int c;
  int d = 8;
  
  static ArrayList a(zbdd paramzbdd, Font paramFont, Workbook paramWorkbook)
  {
    String str = paramzbdd.c;
    byte[] arrayOfByte = paramzbdd.h();
    ArrayList localArrayList = new ArrayList();
    int i = -1;
    int j = -1;
    for (int k = 0; k < arrayOfByte.length; k += 4)
    {
      int m = zauj.a(arrayOfByte, k);
      int n = zauj.a(arrayOfByte, k + 2);
      if ((k == 0) && (m != 0))
      {
        if (m > str.length())
        {
          a(localArrayList, str, 0, str.length() - 1, n, paramWorkbook);
          return localArrayList;
        }
        a(localArrayList, str, 0, m, paramFont, paramWorkbook);
      }
      if (i != -1) {
        a(localArrayList, str, i, m, j, paramWorkbook);
      }
      i = m;
      j = n;
    }
    if ((i != -1) && (i < str.length())) {
      a(localArrayList, str, i, str.length(), j, paramWorkbook);
    }
    return localArrayList;
  }
  
  private static void a(ArrayList paramArrayList, String paramString, int paramInt1, int paramInt2, Font paramFont, Workbook paramWorkbook)
  {
    if (paramInt2 < paramInt1) {
      return;
    }
    zqb localzqb = new zqb();
    localzqb.a = paramString.substring(paramInt1, paramInt1 + (paramInt2 - paramInt1));
    localzqb.b = paramFont;
    zf.a(paramArrayList, localzqb);
  }
  
  private static void a(ArrayList paramArrayList, String paramString, int paramInt1, int paramInt2, int paramInt3, Workbook paramWorkbook)
  {
    if (paramInt1 > paramInt2) {
      return;
    }
    if (paramInt1 >= paramString.length()) {
      return;
    }
    if (paramInt2 > paramString.length()) {
      paramInt2 = paramString.length();
    }
    zqb localzqb = new zqb();
    localzqb.a = paramString.substring(paramInt1, paramInt1 + (paramInt2 - paramInt1));
    if (paramInt3 < 0)
    {
      localzqb.b = null;
    }
    else
    {
      if (paramInt3 > 4) {
        paramInt3--;
      }
      if (paramInt3 >= paramWorkbook.getWorksheets().A().size()) {
        localzqb.b = ((Font)paramWorkbook.getWorksheets().A().get(0));
      } else {
        localzqb.b = ((Font)paramWorkbook.getWorksheets().A().get(paramInt3));
      }
    }
    zf.a(paramArrayList, localzqb);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zqb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */