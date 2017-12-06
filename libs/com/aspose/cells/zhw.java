package com.aspose.cells;

class zhw
{
  public static void a(zgs paramzgs, int paramInt, Object paramObject)
  {
    if (paramzgs.c == 5)
    {
      zaai localzaai = (zaai)paramzgs.d;
      localzaai.c = paramInt;
      localzaai.d = paramObject;
    }
    else
    {
      paramzgs.c = paramInt;
      paramzgs.d = paramObject;
    }
  }
  
  public static void a(zgs paramzgs, String paramString, zajl paramzajl)
  {
    if (paramzgs.c == 5)
    {
      zaai localzaai = (zaai)paramzgs.d;
      localzaai.c = 4;
      localzaai.d = paramString;
    }
    else
    {
      paramzgs.c = 4;
      paramzgs.d = paramzajl.a(paramString);
    }
  }
  
  public static void a(String paramString)
  {
    throw new CellsException(10, "You want to put a string longer than 32K to Cell " + paramString + ". MS Excel only allows to put a string shorter than 32K to a Cell.");
  }
  
  public static int a(Cells paramCells, zv paramzv, int paramInt1, int paramInt2)
  {
    zajl localzajl = paramCells.p().g;
    zabw localzabw = paramCells.a;
    int i = localzajl.c() < 1 ? 1 : 0;
    int j = localzabw.c < 1 ? 1 : 0;
    if ((i != 0) && (j != 0)) {
      return paramzv.h(paramInt1, paramInt2);
    }
    zaiv localzaiv1 = paramzv.b(paramInt1, paramInt2, false);
    if (localzaiv1 == null) {
      return 0;
    }
    int k;
    zt localzt;
    do
    {
      k = localzaiv1.a();
      if (k < 0) {
        break;
      }
      localzt = paramzv.f(k);
    } while (localzt.a() <= 0);
    zaiv localzaiv2 = localzt.b();
    for (;;)
    {
      k = localzaiv2.a();
      if (k < 0) {
        break;
      }
      switch (localzt.h(k))
      {
      case 4: 
        localzajl.b(localzt.j(k));
        i = localzajl.c() < 1 ? 1 : 0;
        if ((i != 0) && (j != 0)) {
          return paramzv.h(paramInt1, paramInt2);
        }
        break;
      case 5: 
        localzabw.b(localzt.j(k));
        j = localzabw.c < 1 ? 1 : 0;
        if ((j != 0) && (i != 0)) {
          return paramzv.h(paramInt1, paramInt2);
        }
        break;
      }
    }
    return paramzv.h(paramInt1, paramInt2);
  }
  
  public static int a(Cells paramCells, zt paramzt, int paramInt1, int paramInt2)
  {
    zajl localzajl = paramCells.p().g;
    zabw localzabw = paramCells.a;
    int i = localzajl.c() < 1 ? 1 : 0;
    int j = localzabw.c < 1 ? 1 : 0;
    if ((i != 0) && (j != 0)) {
      return paramzt.h(paramInt1, paramInt2);
    }
    zaiv localzaiv = paramzt.b(paramInt1, paramInt2, false);
    if (localzaiv == null) {
      return 0;
    }
    for (;;)
    {
      int k = localzaiv.a();
      if (k < 0) {
        break;
      }
      switch (paramzt.h(k))
      {
      case 4: 
        localzajl.b(paramzt.j(k));
        i = localzajl.c() < 1 ? 1 : 0;
        if ((i != 0) && (j != 0)) {
          return paramzt.h(paramInt1, paramInt2);
        }
        break;
      case 5: 
        localzabw.b(paramzt.j(k));
        j = localzabw.c < 1 ? 1 : 0;
        if ((j != 0) && (i != 0)) {
          return paramzt.h(paramInt1, paramInt2);
        }
        break;
      }
    }
    return paramzt.h(paramInt1, paramInt2);
  }
  
  public static int b(Cells paramCells, zt paramzt, int paramInt1, int paramInt2)
  {
    zajl localzajl = paramCells.p().g;
    zabw localzabw = paramCells.a;
    int i = localzajl.c() < 1 ? 1 : 0;
    int j = localzabw.c < 1 ? 1 : 0;
    if ((i != 0) && (j != 0)) {
      return paramzt.d(paramInt1, paramInt2);
    }
    zaiv localzaiv = paramzt.a(paramInt1, paramInt2, false);
    if (localzaiv == null) {
      return 0;
    }
    for (;;)
    {
      int k = localzaiv.a();
      if (k < 0) {
        break;
      }
      switch (paramzt.h(k))
      {
      case 4: 
        localzajl.b(paramzt.j(k));
        i = localzajl.c() < 1 ? 1 : 0;
        if ((i != 0) && (j != 0)) {
          return paramzt.d(paramInt1, paramInt2);
        }
        break;
      case 5: 
        localzabw.b(paramzt.j(k));
        j = localzabw.c < 1 ? 1 : 0;
        if ((j != 0) && (i != 0)) {
          return paramzt.d(paramInt1, paramInt2);
        }
        break;
      }
    }
    return paramzt.d(paramInt1, paramInt2);
  }
  
  public static void a(Cells paramCells, zt paramzt, int paramInt)
  {
    switch (paramzt.h(paramInt))
    {
    case 4: 
      paramCells.p().g.b(paramzt.j(paramInt));
      break;
    case 5: 
      paramCells.a.b(paramzt.j(paramInt));
    }
    paramzt.c(paramInt, 1);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */