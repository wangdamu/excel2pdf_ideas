package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zalh
{
  private zqh a = null;
  private zajl b;
  private int c;
  private boolean d = false;
  private static final za e = new za(new String[] { "fontId", "alignment", "type", "left", "center", "distributed", "noControl", "fullwidthKatakana", "halfwidthKatakana", "Hiragana", "noConversion", "sb", "eb" });
  
  zalh(zqh paramzqh)
  {
    this.a = paramzqh;
    this.b = this.a.a.getWorksheets().g;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    d(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    this.d = c(paramzcjy);
    this.c = 0;
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("si".equals(paramzcjy.q()))
      {
        zbbj localzbbj = null;
        if (paramzcjy.o())
        {
          paramzcjy.a();
          localzbbj = new zbbj("", 0);
        }
        else
        {
          localzbbj = a(paramzcjy, this.a.a.getWorksheets(), this.a.c(), this.d);
        }
        localzbbj.e = this.c;
        this.b.b(localzbbj);
        this.c += 1;
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  zbbj b(zcjy paramzcjy)
    throws Exception
  {
    zbbj localzbbj = a(paramzcjy, this.a.a.getWorksheets(), this.a.c(), this.d);
    localzbbj = this.b.c(localzbbj);
    return localzbbj;
  }
  
  static zbbj a(zcjy paramzcjy, WorksheetCollection paramWorksheetCollection, HashMap paramHashMap, boolean paramBoolean)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return new zbbj("", 0);
    }
    String str = null;
    StringBuilder localStringBuilder = null;
    Object localObject1 = null;
    int i = 0;
    zawa localzawa = null;
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if (("t".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        paramzcjy.c((paramBoolean) || (c(paramzcjy)));
        str = paramzcjy.j();
        paramzcjy.c(false);
      }
      else if (("r".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        if (localStringBuilder == null)
        {
          localStringBuilder = new StringBuilder();
          localObject1 = new short[2];
        }
        else if (i * 2 >= localObject1.length)
        {
          localObject2 = new short[i * 2 + 50];
          System.arraycopy(localObject1, 0, localObject2, 0, localObject1.length);
          localObject1 = localObject2;
        }
        a(paramzcjy, localStringBuilder, i, (short[])localObject1, paramWorksheetCollection, paramBoolean);
        i++;
      }
      else if ("phoneticPr".equals(paramzcjy.q()))
      {
        if (localzawa == null) {
          localzawa = new zawa();
        }
        if (paramzcjy.n())
        {
          while (paramzcjy.m()) {
            switch (e.a(paramzcjy.q()))
            {
            case 0: 
              localObject2 = paramHashMap.get(Integer.valueOf(zauj.F(paramzcjy.t())));
              if (localObject2 != null)
              {
                localzawa.b = ((Integer)localObject2).intValue();
                if (localzawa.b > 3) {
                  localzawa.b += 1;
                }
              }
              break;
            case 1: 
              switch (e.a(paramzcjy.t()))
              {
              case 3: 
                localzawa.a(2);
                break;
              case 4: 
                localzawa.a(0);
                break;
              case 5: 
                localzawa.a(1);
                break;
              case 6: 
                localzawa.a(3);
              }
              break;
            case 2: 
              switch (e.a(paramzcjy.t()))
              {
              case 7: 
                localzawa.b(0);
                break;
              case 8: 
                localzawa.b(1);
                break;
              case 9: 
                localzawa.b(2);
                break;
              case 10: 
                localzawa.b(3);
              }
              break;
            }
          }
          paramzcjy.l();
        }
        paramzcjy.a();
      }
      else if (("rPh".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        if (localzawa == null) {
          localzawa = new zawa();
        }
        localObject2 = a(paramzcjy, str == null ? 0 : str.length(), paramBoolean);
        localzawa.c.a((zavy)localObject2);
      }
      else
      {
        paramzcjy.a();
      }
    }
    if ((localzawa != null) && (localzawa.c.getCount() == 0)) {
      localzawa = null;
    }
    Object localObject2 = null;
    if ((i == 0) && (localzawa == null))
    {
      if (str == null) {
        str = "";
      }
      localObject2 = new zbbj(str, 0);
    }
    else
    {
      byte[] arrayOfByte = null;
      if (i != 0)
      {
        int j = 0;
        int k = i;
        if (localObject1[1] == -1)
        {
          k--;
          j = 1;
        }
        arrayOfByte = new byte[k * 4];
        for (int m = 0; m < k; m++)
        {
          short s1 = localObject1[(j * 2)];
          short s2 = localObject1[(j * 2 + 1)];
          j++;
          zauj.a(arrayOfByte, m * 4, s1);
          zauj.a(arrayOfByte, m * 4 + 2, s2);
        }
        str = zs.a(localStringBuilder);
      }
      if (localzawa != null) {
        localObject2 = new zawb(str, arrayOfByte, localzawa);
      } else if (arrayOfByte != null) {
        localObject2 = new zbdd(str, arrayOfByte, 0);
      } else {
        localObject2 = new zbbj(str, 0);
      }
    }
    return (zbbj)localObject2;
  }
  
  private static zavy a(zcjy paramzcjy, int paramInt, boolean paramBoolean)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return null;
    }
    zavy localzavy = new zavy();
    int i = 0;
    int j = paramInt - 1;
    if (paramzcjy.n()) {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 11: 
          i = zauj.F(paramzcjy.t());
          break;
        case 12: 
          j = zauj.F(paramzcjy.t());
        }
      }
    }
    localzavy.a = i;
    localzavy.b = (j - i + 1);
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if (("t".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        paramzcjy.c((paramBoolean) || (c(paramzcjy)));
        String str = paramzcjy.j();
        paramzcjy.c(false);
        localzavy.c = str;
      }
      else
      {
        paramzcjy.a();
      }
    }
    return localzavy;
  }
  
  private static void a(zcjy paramzcjy, StringBuilder paramStringBuilder, int paramInt, short[] paramArrayOfShort, WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
    throws Exception
  {
    if (paramzcjy.o()) {
      throw new CellsException(6, "Invalid r element");
    }
    int i = (short)paramStringBuilder.length();
    zpw localzpw = null;
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      paramzcjy.k();
      if ((paramzcjy.s() == 1) && ("rPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        localzpw = zalk.a(paramzcjy, paramWorksheetCollection, "rFont");
      }
      else if ((paramzcjy.s() == 1) && ("t".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        paramzcjy.c((paramBoolean) || (c(paramzcjy)));
        String str = paramzcjy.j();
        paramzcjy.c(false);
        paramStringBuilder.append(zauj.b(str));
      }
      else
      {
        paramzcjy.a();
      }
    }
    int j = 0;
    if ((paramInt == 0) && (localzpw == null)) {
      j = -1;
    }
    if (localzpw != null) {
      j = zauj.a(localzpw, paramWorksheetCollection);
    }
    paramArrayOfShort[(paramInt * 2)] = i;
    paramArrayOfShort[(paramInt * 2 + 1)] = ((short)j);
  }
  
  static boolean c(zcjy paramzcjy)
  {
    String str = paramzcjy.a("space", null);
    return str != null;
  }
  
  private void d(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"sst".equals(paramzcjy.q()))) {
      throw new CellsException(6, "SharedStringTable root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */