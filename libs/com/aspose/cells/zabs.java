package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zabs
  extends zaaz
{
  public zabs(byte[] paramArrayOfByte, int paramInt)
  {
    super(paramArrayOfByte, paramInt, 14);
  }
  
  public boolean k()
  {
    return true;
  }
  
  public int g()
  {
    switch (this.b[(this.c + 5)] & 0xFF & 0xC)
    {
    case 0: 
      return 32;
    case 4: 
      return 64;
    case 8: 
      return 96;
    }
    return 32;
  }
  
  public zaie e(zaca paramzaca)
  {
    return d(paramzaca).e(paramzaca);
  }
  
  public zaie d(zaca paramzaca)
  {
    if (this.a != null)
    {
      if (this.a.a == null) {
        this.a.a = k(paramzaca);
      }
      return this.a.a;
    }
    return k(paramzaca);
  }
  
  private zaie k(zaca paramzaca)
  {
    WorksheetCollection localWorksheetCollection = paramzaca.p.e;
    int i = zc.e(this.b, this.c + 2) & 0xFFFF;
    int j = localWorksheetCollection.r().d(i, localWorksheetCollection.v());
    if ((j < 0) || (j > localWorksheetCollection.getCount())) {
      return zabc.c;
    }
    int k = zc.e(this.b, this.c + 4);
    int m = zc.a(this.b, this.c + 6);
    ListObject localListObject = localWorksheetCollection.get(j).getListObjects().a(m);
    if ((localListObject == null) || ((this.b[(this.c + 5)] & 0xFF & 0x30) != 0)) {
      return zabc.c;
    }
    int n = zc.e(this.b, this.c + 10) & 0xFFFF;
    int i1 = zc.e(this.b, this.c + 12) & 0xFFFF;
    if (n >= localListObject.getListColumns().getCount()) {
      return zabc.c;
    }
    n = localListObject.getStartColumn() + n;
    i1 = localListObject.getStartColumn() + i1;
    int i2 = localListObject.getStartRow();
    int i3 = localListObject.getEndRow();
    int i4 = k & 0xFFFF & 0x3;
    int i5 = 0;
    switch ((k & 0xFFFF) >> 2 & 0x1F)
    {
    case 1: 
      if (i4 == 0)
      {
        n = localListObject.getStartColumn();
        i1 = localListObject.getEndColumn();
      }
      break;
    case 2: 
      i2 = localListObject.getStartRow();
      i3 = i2;
      if (i4 == 0)
      {
        n = localListObject.getStartColumn();
        i1 = localListObject.getEndColumn();
      }
      break;
    case 16: 
      i5 = 1;
      i2 = paramzaca.d;
      i3 = i2;
      break;
    case 8: 
      if (!localListObject.f()) {
        return zabc.c;
      }
      i2 = localListObject.getEndRow();
      i3 = i2;
      break;
    default: 
      if ((localListObject.getShowHeaderRow()) && (!paramzaca.h())) {
        i2++;
      }
      if (localListObject.getShowTotals()) {
        i3--;
      }
      if (i4 == 0)
      {
        n = localListObject.getStartColumn();
        i1 = localListObject.getEndColumn();
      }
      break;
    }
    zbap localzbap = new zbap(localWorksheetCollection.r().b(i), i2, n, i3, i1);
    if (i5 != 0)
    {
      localzbap.a(false);
      localzbap.c(false);
    }
    return new zabo(32, localzbap);
  }
  
  public int b(zaca paramzaca, boolean paramBoolean)
  {
    a(false);
    return d(paramzaca).b(paramzaca, paramBoolean);
  }
  
  public boolean a(zaca paramzaca, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a(false);
    return d(paramzaca).a(paramzaca, paramInt1, paramInt2, paramBoolean);
  }
  
  public boolean f(zaca paramzaca)
  {
    a(false);
    return d(paramzaca).f(paramzaca);
  }
  
  public boolean g(zaca paramzaca)
  {
    a(false);
    return d(paramzaca).g(paramzaca);
  }
  
  public boolean h(zaca paramzaca)
  {
    a(false);
    return d(paramzaca).h(paramzaca);
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca, boolean paramBoolean)
  {
    a(false);
    return d(paramzaca).a(paramArrayOfInt, paramzaca, paramBoolean);
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca)
  {
    a(false);
    return d(paramzaca).a(paramArrayOfInt, paramzaca);
  }
  
  public zaie b(int[] paramArrayOfInt, zaca paramzaca)
  {
    a(false);
    return d(paramzaca).b(paramArrayOfInt, paramzaca);
  }
  
  public zaiw a(zaca paramzaca, boolean paramBoolean)
  {
    a(false);
    return d(paramzaca).a(paramzaca, paramBoolean);
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    if (paramzaah == null)
    {
      paramzahh.a("[TABLE-NEED-CONTEXT-TO-BUILD-STRING-EXPRESSION]");
      return;
    }
    WorksheetCollection localWorksheetCollection = paramzaah.u;
    int i = zc.e(this.b, this.c + 2) & 0xFFFF;
    int j = localWorksheetCollection.r().d(i, localWorksheetCollection.v());
    if ((j < 0) || (j > localWorksheetCollection.getCount()))
    {
      paramzahh.a("#REF!");
      return;
    }
    int k = zc.e(this.b, this.c + 4);
    int m = zc.a(this.b, this.c + 6);
    ListObject localListObject = localWorksheetCollection.get(j).getListObjects().a(m);
    if ((localListObject == null) || ((this.b[(this.c + 5)] & 0xFF & 0x30) != 0))
    {
      paramzahh.a("#REF!");
      return;
    }
    int n = zc.e(this.b, this.c + 10) & 0xFFFF;
    int i1 = zc.e(this.b, this.c + 12) & 0xFFFF;
    if (n >= localListObject.getListColumns().getCount()) {
      paramzahh.a("#REF!");
    }
    if (i1 >= localListObject.getListColumns().getCount()) {
      i1 = n;
    }
    int i2 = k & 0xFFFF & 0x3;
    switch ((k & 0xFFFF) >> 2 & 0x1F)
    {
    case 16: 
      paramzahh.a(localListObject.o());
      paramzahh.a('[');
      paramzahh.a('[');
      paramzahh.a("#This Row");
      paramzahh.a("],[");
      paramzahh.a(zabq.c(localListObject.getListColumns().get(n).getName()));
      paramzahh.a("]");
      if (i1 != n)
      {
        paramzahh.a(":[");
        paramzahh.a(zabq.c(localListObject.getListColumns().get(i1).getName()));
        paramzahh.a("]");
      }
      paramzahh.a("]");
      return;
    case 8: 
      paramzahh.a(localListObject.o());
      paramzahh.a('[');
      paramzahh.a('[');
      paramzahh.a("#Totals");
      paramzahh.a("],[");
      paramzahh.a(zabq.c(localListObject.getListColumns().get(n).getName()));
      paramzahh.a("]");
      if (i1 != n)
      {
        paramzahh.a(":[");
        paramzahh.a(zabq.c(localListObject.getListColumns().get(i1).getName()));
        paramzahh.a("]");
      }
      paramzahh.a("]");
      return;
    }
    if (i2 == 0)
    {
      paramzahh.a(localListObject.o());
      paramzahh.a("[]");
      return;
    }
    int i3 = (paramzaah.c != null) && (paramzaah.c.getIndex() == j) ? 1 : 0;
    if ((i3 == 0) || (paramzaah.d < localListObject.getStartRow()) || (paramzaah.d > localListObject.getEndRow()) || (paramzaah.e < localListObject.getStartColumn()) || (paramzaah.e > localListObject.getEndColumn())) {
      paramzahh.a(localListObject.o());
    }
    paramzahh.a('[');
    if (n == i1)
    {
      paramzahh.a(zabq.c(localListObject.getListColumns().get(n).getName()));
    }
    else
    {
      paramzahh.a('[');
      paramzahh.a(zabq.c(localListObject.getListColumns().get(n).getName()));
      paramzahh.a("]:[");
      paramzahh.a(zabq.c(localListObject.getListColumns().get(i1).getName()));
      paramzahh.a(']');
    }
    paramzahh.a(']');
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */