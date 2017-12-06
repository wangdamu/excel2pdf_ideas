package com.aspose.cells;

class zbdn
  implements zajb
{
  private Cells a;
  private RowCollection b;
  private WorksheetCollection c;
  private zbdq d;
  private zajd e;
  
  zbdn(Cells paramCells, RowCollection paramRowCollection)
  {
    this.c = paramCells.g().c();
    this.a = paramCells;
    this.b = paramRowCollection;
    this.d = new zbdq(1.0D);
    this.e = new zbdr(1.0D);
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if ((this.e instanceof zbdr)) {
        this.e = new zbds(1.0D);
      }
    }
    else if ((this.e instanceof zbds)) {
      this.e = new zbdr(1.0D);
    }
  }
  
  private void a()
  {
    this.d.a(zbxp.a() / 1440.0D);
  }
  
  public int a(int paramInt)
  {
    int i = this.b.e(paramInt);
    if (i > -1)
    {
      a();
      return this.d.a(Row.b(this.b.c, i));
    }
    if (this.a.isDefaultRowHidden()) {
      return 0;
    }
    a();
    return this.d.a(this.a.n());
  }
  
  public double b(int paramInt)
  {
    int i = this.b.e(paramInt);
    if (i > -1) {
      return this.e.d(this.e.a(Row.b(this.b.c, i)));
    }
    if (this.a.isDefaultRowHidden()) {
      return 0.0D;
    }
    return this.e.d(this.e.a(this.a.n()));
  }
  
  public double c(int paramInt)
  {
    int i = this.b.e(paramInt);
    if (i > -1) {
      return this.e.e(this.e.a(Row.b(this.b.c, i)));
    }
    if (this.a.isDefaultRowHidden()) {
      return 0.0D;
    }
    return this.e.e(this.e.a(this.a.n()));
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    a();
    return a(paramInt1, paramInt2, this.d);
  }
  
  public double b(int paramInt1, int paramInt2)
  {
    return this.e.d(a(paramInt1, paramInt2, this.e));
  }
  
  public void a(int[] paramArrayOfInt)
  {
    a();
    a(paramArrayOfInt, this.d);
  }
  
  public void b(int[] paramArrayOfInt)
  {
    paramArrayOfInt[1] = this.e.a(paramArrayOfInt[1]);
    paramArrayOfInt[2] = this.e.a(paramArrayOfInt[2]);
    a(paramArrayOfInt, this.e);
    paramArrayOfInt[1] = this.e.c(paramArrayOfInt[1]);
    paramArrayOfInt[2] = this.e.c(paramArrayOfInt[2]);
  }
  
  private int a(int paramInt1, int paramInt2, zajd paramzajd)
  {
    int i = this.a.isDefaultRowHidden() ? 0 : paramzajd.a(this.a.n());
    int j = 0;
    zv localzv = this.a.e();
    zaiv localzaiv = localzv.b(paramInt1, paramInt2, false);
    if (localzaiv != null) {
      for (;;)
      {
        int k = localzaiv.a();
        if (k < 0) {
          break;
        }
        int m = localzv.a(k);
        if (m > paramInt1) {
          j += (m - paramInt1) * i;
        }
        j += paramzajd.a(Row.b(localzv, k));
        paramInt1 = m + 1;
      }
    }
    if (paramInt1 <= paramInt2) {
      j += (paramInt2 - paramInt1 + 1) * i;
    }
    return j;
  }
  
  private void a(int[] paramArrayOfInt, zajd paramzajd)
  {
    int i = paramArrayOfInt[0];
    int j;
    int m;
    int i3;
    int i4;
    if (paramArrayOfInt[2] < 0)
    {
      j = -paramArrayOfInt[2] - paramArrayOfInt[1];
      if (j <= 0)
      {
        paramArrayOfInt[2] = (-j);
        paramArrayOfInt[1] = 0;
        a(paramArrayOfInt, paramzajd);
        return;
      }
      zv localzv1 = this.a.e();
      i--;
      if (i < 0)
      {
        paramArrayOfInt[1] = 0;
        m = localzv1.b(0);
        paramArrayOfInt[2] = (m < 0 ? paramzajd.a(this.a.n()) : this.a.isDefaultRowHidden() ? 0 : paramzajd.a(Row.b(localzv1, m)));
        return;
      }
      int n = this.a.isDefaultRowHidden() ? 0 : paramzajd.a(this.a.n());
      zaiv localzaiv2 = localzv1.b(i, -1, true);
      if (localzaiv2 != null) {
        for (;;)
        {
          m = localzaiv2.a();
          if (m < 0) {
            break;
          }
          i3 = localzv1.a(m);
          if ((i3 < i) && (n > 0))
          {
            i1 = (j - 1) / n;
            if (i - i1 > i3)
            {
              j -= i1 * n;
              paramArrayOfInt[0] = (i - i1);
              paramArrayOfInt[1] = (n - j);
              paramArrayOfInt[2] = j;
              return;
            }
            j -= (i - i3) * n;
          }
          i4 = paramzajd.a(Row.b(localzv1, m));
          if (i4 >= j)
          {
            paramArrayOfInt[0] = i3;
            paramArrayOfInt[1] = (i4 - j);
            paramArrayOfInt[2] = j;
            return;
          }
          j -= i4;
          i = i3 - 1;
        }
      }
      if (n == 0)
      {
        paramArrayOfInt[0] = (i + 1);
        paramArrayOfInt[1] = 0;
        paramArrayOfInt[2] = n;
        return;
      }
      int i1 = (j - 1) / n;
      if (i < i1)
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 0;
        paramArrayOfInt[2] = n;
        return;
      }
      j -= i1 * n;
      paramArrayOfInt[0] = (i - i1);
      paramArrayOfInt[1] = (n - j);
      paramArrayOfInt[2] = j;
    }
    else
    {
      j = paramArrayOfInt[1] + paramArrayOfInt[2];
      int k = this.a.isDefaultRowHidden() ? 0 : paramzajd.a(this.a.n());
      zv localzv2 = this.a.e();
      zaiv localzaiv1 = localzv2.b(i, -1, false);
      if (localzaiv1 != null) {
        for (;;)
        {
          int i2 = localzaiv1.a();
          if (i2 < 0) {
            break;
          }
          i3 = localzv2.a(i2);
          if ((i3 > i) && (k > 0))
          {
            m = (j - 1) / k;
            if (i + m < i3)
            {
              j -= m * k;
              paramArrayOfInt[0] = (i + m);
              paramArrayOfInt[1] = j;
              paramArrayOfInt[2] = (k - j);
              return;
            }
            j -= (i3 - i) * k;
          }
          i4 = paramzajd.a(Row.b(localzv2, i2));
          if (i4 >= j)
          {
            paramArrayOfInt[0] = i3;
            paramArrayOfInt[1] = j;
            paramArrayOfInt[2] = (i4 - j);
            return;
          }
          j -= i4;
          i = i3 + 1;
        }
      }
      if (k == 0)
      {
        paramArrayOfInt[0] = (i < 1 ? 0 : i - 1);
        paramArrayOfInt[1] = j;
        paramArrayOfInt[2] = (-j);
        return;
      }
      m = (j - 1) / k;
      j -= m * k;
      paramArrayOfInt[0] = (i + m);
      paramArrayOfInt[1] = j;
      paramArrayOfInt[2] = (k - j);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */