package com.aspose.cells;

import java.util.ArrayList;

class zno
  extends zawr
{
  boolean a;
  znp[] b;
  String[][] c;
  zawp d;
  
  void a()
  {
    for (int i = 0; i < this.b.length; i++) {
      this.b[i].b.a();
    }
  }
  
  void b()
  {
    for (int i = 0; i < this.b.length; i++) {
      this.b[i].b.b();
    }
  }
  
  void a(zawr paramzawr, CopyOptions paramCopyOptions)
  {
    zno localzno = (zno)paramzawr;
    this.c = localzno.c;
    this.b = new znp[localzno.b.length];
    for (int i = 0; i < localzno.b.length; i++)
    {
      this.b[i].a = localzno.b[i].a;
      this.b[i].b = ((zboy)zawr.a(this.d, (byte)1));
      this.b[i].b.a(localzno.b[i].b, paramCopyOptions);
    }
  }
  
  void a(int paramInt1, int paramInt2, Worksheet paramWorksheet)
  {
    for (int i = 0; i < this.b.length; i++) {
      this.b[i].b.a(paramInt1, paramInt2, paramWorksheet);
    }
  }
  
  void b(int paramInt1, int paramInt2, Worksheet paramWorksheet)
  {
    for (int i = 0; i < this.b.length; i++) {
      this.b[i].b.b(paramInt1, paramInt2, paramWorksheet);
    }
  }
  
  byte c()
  {
    return 4;
  }
  
  zno(zawp paramzawp)
  {
    this.d = paramzawp;
  }
  
  zno(zawp paramzawp, String[] paramArrayOfString, PivotPageFields paramPivotPageFields, boolean paramBoolean)
  {
    this.d = paramzawp;
    this.a = paramBoolean;
    this.b = new znp[paramArrayOfString.length];
    for (int i = 0; i < this.b.length; i++) {
      this.b[i] = new znp(this, 1);
    }
    if (!paramBoolean)
    {
      a(paramPivotPageFields);
    }
    else
    {
      i = this.b.length;
      String[] arrayOfString = new String[i];
      for (int j = 0; j < i; j++)
      {
        arrayOfString[j] = ("item" + (j + 1));
        this.b[j].a = new int[] { j };
      }
      this.c = new String[1][];
      this.c[0] = arrayOfString;
    }
  }
  
  private void a(PivotPageFields paramPivotPageFields)
  {
    if ((paramPivotPageFields == null) || (paramPivotPageFields.a() == null) || (paramPivotPageFields.b() == null)) {
      return;
    }
    this.c = new String[paramPivotPageFields.a().size()][];
    Object localObject;
    int j;
    int k;
    for (int i = 0; i < paramPivotPageFields.a().size(); i++)
    {
      localObject = (String[])paramPivotPageFields.a().get(i);
      j = localObject.length;
      for (k = 0; k < localObject.length; k++) {
        if (localObject[k] == null) {
          j--;
        }
      }
      this.c[i] = new String[j];
      k = 0;
      for (int m = 0; m < localObject.length; m++) {
        if (localObject[m] != null) {
          this.c[i][(k++)] = localObject[m];
        }
      }
    }
    for (i = 0; i < paramPivotPageFields.b().size(); i++)
    {
      localObject = (int[])paramPivotPageFields.b().get(i);
      if (localObject.length != paramPivotPageFields.a().size()) {
        throw new IllegalArgumentException("");
      }
      this.b[i].a = new int[paramPivotPageFields.a().size()];
      j = 0;
      for (k = 0; k < localObject.length; k++)
      {
        j = localObject[k];
        if ((j != -1) && (j >= this.c[k].length)) {
          j = -1;
        }
        this.b[i].a[k] = j;
      }
    }
  }
  
  String[] d()
  {
    String[] arrayOfString = new String[this.b.length];
    for (int i = 0; i < arrayOfString.length; i++) {
      arrayOfString[i] = this.b[i].b.h();
    }
    return arrayOfString;
  }
  
  void a(String[] paramArrayOfString, Worksheet paramWorksheet)
  {
    for (int i = 0; i < this.b.length; i++) {
      if (i < paramArrayOfString.length) {
        this.b[i].b.a(paramArrayOfString[i], paramWorksheet);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zno.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */