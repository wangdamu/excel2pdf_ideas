package com.aspose.cells;

class zadm
{
  int a;
  short b;
  int c;
  int d;
  int e;
  Workbook f;
  boolean[] g;
  boolean[] h;
  private zbzv i;
  private zbst j;
  
  zadm(Workbook paramWorkbook, int paramInt)
  {
    this.f = paramWorkbook;
    this.e = paramInt;
    WorksheetCollection localWorksheetCollection = paramWorkbook.getWorksheets();
    this.d = localWorksheetCollection.getCount();
    this.j = ((zbst)localWorksheetCollection.g);
    this.i = ((zbzv)localWorksheetCollection.C());
    if (paramInt == 5)
    {
      this.a = 65535;
      this.b = 255;
      this.c = 32767;
    }
    else
    {
      this.a = 1048575;
      this.b = 16383;
      this.c = Integer.MAX_VALUE;
    }
  }
  
  void a()
  {
    boolean bool = false;
    int k = 0;
    WorksheetCollection localWorksheetCollection = this.f.getWorksheets();
    if (localWorksheetCollection.C() != this.i)
    {
      localObject = localWorksheetCollection.C();
      if ((localObject instanceof zbsz))
      {
        int m = ((zbsz)localObject).c();
        if (m > -1) {
          k = this.i.a(m, 2) > 0 ? 1 : 0;
        }
      }
      localWorksheetCollection.a(this.i);
    }
    Object localObject = localWorksheetCollection.g;
    if (localObject != this.j)
    {
      if ((localObject instanceof zbsu)) {
        bool = ((zbsu)localObject).e();
      }
      localWorksheetCollection.a(this.j);
    }
    if ((k == 0) && (!bool)) {
      return;
    }
    int[] arrayOfInt1 = null;
    if (k != 0)
    {
      arrayOfInt1 = this.i.e();
      if (arrayOfInt1 != null) {
        a(arrayOfInt1);
      }
    }
    if (bool)
    {
      int[] arrayOfInt2 = new int[((zajl)localObject).a()];
      b(arrayOfInt2);
      int[] arrayOfInt3 = new int[arrayOfInt2.length];
      int n = this.j.a(arrayOfInt2, arrayOfInt3, (zajl)localObject);
      if (n > 0) {
        c(arrayOfInt3);
      }
    }
  }
  
  private void a(int[] paramArrayOfInt)
  {
    WorksheetCollection localWorksheetCollection = this.f.getWorksheets();
    for (int n = this.d - 1; n > -1; n--)
    {
      Cells localCells = localWorksheetCollection.get(n).getCells();
      zv localzv = localCells.e();
      zaiv localzaiv1 = localzv.b();
      int k;
      zt localzt;
      int m;
      do
      {
        k = localzaiv1.a();
        if (k < 0) {
          break;
        }
        localzt = localzv.f(k);
        m = localzt.j();
        if (m != paramArrayOfInt[m]) {
          localzt.k(paramArrayOfInt[m]);
        }
      } while (localzt.a() <= 0);
      zaiv localzaiv2 = localzt.b();
      for (;;)
      {
        k = localzaiv2.a();
        if (k < 0) {
          break;
        }
        m = localzt.g(k);
        if (m != paramArrayOfInt[m]) {
          localzt.j(k, paramArrayOfInt[m]);
        }
      }
    }
  }
  
  private void b(int[] paramArrayOfInt)
  {
    WorksheetCollection localWorksheetCollection = this.f.getWorksheets();
    zgs localzgs = new zgs();
    for (int m = this.d - 1; m > -1; m--)
    {
      Cells localCells = localWorksheetCollection.get(m).getCells();
      zv localzv = localCells.e();
      zaiv localzaiv1 = localzv.b();
      int k;
      zt localzt;
      do
      {
        k = localzaiv1.a();
        if (k < 0) {
          break;
        }
        localzt = localzv.f(k);
      } while (localzt.a() <= 0);
      zaiv localzaiv2 = localzt.b();
      for (;;)
      {
        k = localzaiv2.a();
        if (k < 0) {
          break;
        }
        if (localzt.h(k) == 4)
        {
          int n = localzt.j(k);
          if (n < 0) {
            localzt.b(k, localzgs);
          } else {
            paramArrayOfInt[n] += 1;
          }
        }
      }
    }
  }
  
  private void c(int[] paramArrayOfInt)
  {
    WorksheetCollection localWorksheetCollection = this.f.getWorksheets();
    for (int m = this.d - 1; m > -1; m--)
    {
      Cells localCells = localWorksheetCollection.get(m).getCells();
      zv localzv = localCells.e();
      zaiv localzaiv1 = localzv.b();
      int k;
      zt localzt;
      do
      {
        k = localzaiv1.a();
        if (k < 0) {
          break;
        }
        localzt = localzv.f(k);
      } while (localzt.a() <= 0);
      zaiv localzaiv2 = localzt.b();
      for (;;)
      {
        k = localzaiv2.a();
        if (k < 0) {
          break;
        }
        if (localzt.h(k) == 4)
        {
          int n = localzt.j(k);
          if (n != paramArrayOfInt[n]) {
            localzt.k(k, paramArrayOfInt[n]);
          }
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zadm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */