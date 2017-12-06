package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.zr;

class zaml
{
  private boolean b = false;
  private long c;
  private byte d;
  zlg a;
  
  zaml(boolean paramBoolean)
  {
    c(paramBoolean);
  }
  
  zaml(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    c(paramBoolean);
    a(paramInt1, paramInt2);
  }
  
  int a(WorksheetCollection paramWorksheetCollection, int paramInt, boolean paramBoolean, boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = true;
    switch (c())
    {
    case 1: 
      return e();
    case 0: 
      return paramInt;
    case 3: 
      return e();
    }
    int i = a(paramWorksheetCollection.p());
    zava localzava = paramWorksheetCollection.o();
    int j = 0;
    for (int k = 8; k <= 63; k++)
    {
      j = ((Integer)localzava.b().d(Integer.valueOf(k))).intValue();
      if (i == j) {
        return k;
      }
    }
    for (k = 0; k < 8; k++)
    {
      j = ((Integer)localzava.b().d(Integer.valueOf(k))).intValue();
      if (i == j) {
        return k;
      }
    }
    paramArrayOfBoolean[0] = false;
    if (paramBoolean) {
      return localzava.c(i);
    }
    return paramInt;
  }
  
  boolean a()
  {
    return this.b;
  }
  
  void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  boolean b()
  {
    return (c() == 0) || (c() == 1);
  }
  
  void b(boolean paramBoolean)
  {
    this.d = ((byte)(this.d & 0xF0));
    if (!paramBoolean) {
      this.d = ((byte)(this.d | 0x1));
    }
  }
  
  int c()
  {
    switch (this.d & 0xFF & 0xF)
    {
    case 0: 
      return 0;
    case 1: 
      return 2;
    case 2: 
      return 4;
    case 3: 
      return 3;
    case 4: 
      return 1;
    }
    return 0;
  }
  
  boolean d()
  {
    return (this.d & 0xFF & 0x10) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    this.d = ((byte)(this.d & 0xEF));
    if (paramBoolean) {
      this.d = ((byte)(this.d | 0x10));
    }
  }
  
  int e()
  {
    return (int)(this.c & 0xFFFFFFFF & 0xFFFFFF);
  }
  
  int a(Workbook paramWorkbook)
  {
    int i = (int)(this.c & 0xFFFFFFFF & 0xFFFFFF);
    switch (this.d & 0xFF & 0xF)
    {
    case 0: 
    case 4: 
      return -1;
    }
    i = c(paramWorkbook);
    int j = i & 0xFF;
    int k = (i & 0xFF00) >> 8;
    int m = (i & 0xFF0000) >> 16;
    return (j << 16) + (k << 8) + m;
  }
  
  Color b(Workbook paramWorkbook)
  {
    return a(paramWorkbook, paramWorkbook == null ? null : paramWorkbook.d());
  }
  
  Color a(Workbook paramWorkbook, Chart paramChart)
  {
    if (paramChart != null) {
      return a(paramWorkbook, paramChart.O());
    }
    return b(paramWorkbook);
  }
  
  private Color a(Workbook paramWorkbook, zrs paramzrs)
  {
    switch (c())
    {
    case 0: 
    case 1: 
      return Color.getEmpty();
    }
    Color localColor = Color.getEmpty();
    int i = (int)(this.c & 0xFFFFFFFF & 0xFFFFFF);
    switch (this.d & 0xFF & 0xF)
    {
    case 0: 
    case 4: 
      return Color.getEmpty();
    case 1: 
      localColor = Color.fromArgb(i | 0xFF000000);
      break;
    case 2: 
    case 5: 
      localColor = Color.a(255, paramzrs.a(i));
      break;
    case 3: 
      localColor = paramWorkbook.getWorksheets().o().a(i);
      break;
    }
    if ((this.a == null) || (this.a.getCount() == 0)) {
      return localColor;
    }
    return this.a.a(localColor, d());
  }
  
  int c(Workbook paramWorkbook)
  {
    return b(paramWorkbook).toArgb() & 0xFFFFFF;
  }
  
  void f()
  {
    this.a = null;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    this.d = ((byte)(this.d & 0xF0));
    this.c &= 0xFF000000;
    switch (paramInt1)
    {
    case 0: 
      this.c |= paramInt2;
      break;
    case 2: 
      this.c |= paramInt2;
      this.d = ((byte)(this.d | 0x1));
      break;
    case 4: 
      this.c |= paramInt2;
      this.d = ((byte)(this.d | 0x2));
      break;
    case 3: 
      this.c |= paramInt2;
      this.d = ((byte)(this.d | 0x3));
      break;
    case 1: 
      this.c |= paramInt2;
      this.d = ((byte)(this.d | 0x4));
      break;
    }
  }
  
  boolean a(zaml paramzaml)
  {
    if (a() != paramzaml.a()) {
      return false;
    }
    if (b()) {
      return paramzaml.b();
    }
    if (paramzaml.b()) {
      return false;
    }
    if (c() != paramzaml.c()) {
      return false;
    }
    return ((this.c & 0xFFFFFFFF & 0xFFFFFF) == (paramzaml.c & 0xFFFFFFFF & 0xFFFFFF)) && (b(paramzaml));
  }
  
  boolean a(zaml paramzaml, Workbook paramWorkbook1, Workbook paramWorkbook2)
  {
    if ((paramWorkbook1 == null) || (paramWorkbook2 == null)) {
      return a(paramzaml);
    }
    int i = c();
    int j = paramzaml.c();
    switch (i)
    {
    case 0: 
    case 1: 
      switch (j)
      {
      case 0: 
      case 1: 
        return true;
      }
      return false;
    case 2: 
      switch (j)
      {
      case 0: 
      case 1: 
        return false;
      case 2: 
        return ((this.c & 0xFFFFFFFF & 0xFFFFFF) == (paramzaml.c & 0xFFFFFFFF & 0xFFFFFF)) && (b(paramzaml));
      case 3: 
        return c(paramWorkbook1) == paramzaml.c(paramWorkbook2);
      }
      return false;
    case 3: 
      switch (j)
      {
      case 0: 
      case 1: 
        return false;
      case 2: 
        return c(paramWorkbook1) == paramzaml.c(paramWorkbook2);
      case 3: 
        if (paramWorkbook1 == paramWorkbook2) {
          return (this.c & 0xFFFFFFFF & 0xFFFFFF) == (paramzaml.c & 0xFFFFFFFF & 0xFFFFFF);
        }
        return c(paramWorkbook1) == paramzaml.c(paramWorkbook2);
      }
      return false;
    case 4: 
      switch (j)
      {
      case 0: 
      case 1: 
        return false;
      case 4: 
        return ((this.c & 0xFFFFFFFF & 0xFFFFFF) == (paramzaml.c & 0xFFFFFFFF & 0xFFFFFF)) && (b(paramzaml));
      }
      return false;
    }
    return true;
  }
  
  boolean b(zaml paramzaml)
  {
    if ((this.a == null) || (this.a.getCount() == 0)) {
      return (paramzaml.a == null) || (paramzaml.a.getCount() == 0);
    }
    if ((paramzaml.a == null) || (paramzaml.a.getCount() == 0)) {
      return false;
    }
    return this.a.c(paramzaml.a);
  }
  
  boolean a(Color paramColor1, Color paramColor2, Workbook paramWorkbook)
  {
    if (b()) {
      return (zh.a(paramColor1)) || (paramColor1 == paramColor2);
    }
    Color localColor = b(paramWorkbook);
    if (zh.a(paramColor1)) {
      return (localColor.toArgb() & 0xFFFFFF) == (paramColor2.toArgb() & 0xFFFFFF);
    }
    return (localColor.toArgb() & 0xFFFFFF) == (paramColor1.toArgb() & 0xFFFFFF);
  }
  
  boolean c(zaml paramzaml)
  {
    if (b()) {
      return !paramzaml.b();
    }
    if (paramzaml.b()) {
      return true;
    }
    if (c() != paramzaml.c()) {
      return true;
    }
    return ((this.c & 0xFFFFFFFF & 0xFFFFFF) != (paramzaml.c & 0xFFFFFFFF & 0xFFFFFF)) || (!b(paramzaml));
  }
  
  boolean b(zaml paramzaml, Workbook paramWorkbook1, Workbook paramWorkbook2)
  {
    int i = c();
    int j = paramzaml.c();
    switch (i)
    {
    case 0: 
    case 1: 
      switch (j)
      {
      case 0: 
      case 1: 
        return false;
      }
      return true;
    case 2: 
      switch (j)
      {
      case 0: 
      case 1: 
        return true;
      case 2: 
        return ((this.c & 0xFFFFFFFF & 0xFFFFFF) != (paramzaml.c & 0xFFFFFFFF & 0xFFFFFF)) || (!b(paramzaml));
      case 3: 
        return c(paramWorkbook1) != paramzaml.c(paramWorkbook2);
      }
      return true;
    case 3: 
      switch (j)
      {
      case 0: 
      case 1: 
        return true;
      case 2: 
        return c(paramWorkbook1) != paramzaml.c(paramWorkbook2);
      case 3: 
        if (paramWorkbook1 == paramWorkbook2) {
          return (this.c & 0xFFFFFFFF & 0xFFFFFF) != (paramzaml.c & 0xFFFFFFFF & 0xFFFFFF);
        }
        return c(paramWorkbook1) != paramzaml.c(paramWorkbook2);
      }
      return true;
    case 4: 
      switch (j)
      {
      case 0: 
      case 1: 
        return true;
      case 4: 
        return ((this.c & 0xFFFFFFFF & 0xFFFFFF) != (paramzaml.c & 0xFFFFFFFF & 0xFFFFFF)) || (!b(paramzaml));
      }
      return true;
    }
    return false;
  }
  
  double g()
  {
    if (this.a == null) {
      return 0.0D;
    }
    if (d()) {
      return h();
    }
    return l().c(0, 0) / 100000.0F;
  }
  
  void a(double paramDouble)
  {
    if (d()) {
      b(paramDouble);
    } else {
      l().b(0, (int)(paramDouble * 100000.0D + 0.5D));
    }
  }
  
  double h()
  {
    zlg localzlg = l();
    Object localObject1;
    if (localzlg.getCount() == 1)
    {
      localObject1 = localzlg.a(0);
      if (((zlf)localObject1).a == 21) {
        return (((zlf)localObject1).b - znq.l) * 1.0D / znq.l;
      }
    }
    else if (localzlg.getCount() == 2)
    {
      localObject1 = null;
      Object localObject2 = null;
      for (int i = 0; i < localzlg.getCount(); i++)
      {
        zlf localzlf = localzlg.a(i);
        if (localzlf.a == 21) {
          localObject1 = localzlf;
        } else if (localzlf.a == 22) {
          localObject2 = localzlf;
        }
      }
      if ((localObject1 != null) && (localObject2 != null) && (((zlf)localObject1).b + ((zlf)localObject2).b == znq.l)) {
        return (znq.l - ((zlf)localObject1).b) * 1.0D / znq.l;
      }
    }
    return 0.0D;
  }
  
  void b(double paramDouble)
  {
    c(true);
    zlg localzlg = l();
    for (int i = 0; i < localzlg.getCount(); i++)
    {
      zlf localzlf = localzlg.a(i);
      if ((localzlf.a == 23) || (localzlf.a == 24) || (localzlf.a == 21) || (localzlf.a == 22) || (localzlf.a == 1) || (localzlf.a == 0)) {
        localzlg.removeAt(i--);
      }
    }
    if (paramDouble != 0.0D) {
      if (paramDouble > 0.0D)
      {
        localzlg.a(21, 100000 - (int)(paramDouble * 100000.0D));
        localzlg.a(22, (int)(paramDouble * 100000.0D));
      }
      else
      {
        localzlg.a(21, 100000 - (int)(Math.abs(paramDouble) * 100000.0D));
      }
    }
  }
  
  boolean i()
  {
    return (c() == 4) && (e() == 12);
  }
  
  static double d(zaml paramzaml)
  {
    if (paramzaml == null) {
      return 0.0D;
    }
    double d1 = paramzaml.j();
    return zr.b((znq.l - d1) / znq.l, 2);
  }
  
  static zaml a(zaml paramzaml, double paramDouble)
  {
    zaml localzaml = paramzaml;
    if (localzaml == null) {
      localzaml = new zaml(true);
    }
    if ((paramDouble < 0.0D) || (paramDouble > 1.0D)) {
      throw new CellsException(6, "Transparency must between 0.0 (opaque) and 1.0 (clear)");
    }
    double d1 = 1.0D - paramDouble;
    localzaml.a((int)(d1 * znq.l + 0.5D));
    return localzaml;
  }
  
  static int e(zaml paramzaml)
  {
    if (paramzaml == null) {
      return 100;
    }
    return paramzaml.j() / 1000;
  }
  
  static zaml a(zaml paramzaml, int paramInt)
  {
    zaml localzaml = paramzaml;
    if (localzaml == null) {
      localzaml = new zaml(true);
    }
    localzaml.a(paramInt * 1000);
    return localzaml;
  }
  
  int j()
  {
    if (this.a == null) {
      return znq.l;
    }
    return this.a.c(2, znq.l);
  }
  
  void a(int paramInt)
  {
    l().b(2, paramInt);
  }
  
  boolean b(int paramInt)
  {
    if (l() == null) {
      return false;
    }
    for (int i = 0; i < l().getCount(); i++) {
      if (l().a(i).a == paramInt) {
        return true;
      }
    }
    return false;
  }
  
  zlg k()
  {
    return this.a;
  }
  
  zlg l()
  {
    if (this.a == null) {
      this.a = new zlg();
    }
    return this.a;
  }
  
  void a(zaml paramzaml, WorksheetCollection paramWorksheetCollection1, WorksheetCollection paramWorksheetCollection2)
  {
    int i = paramWorksheetCollection1 == paramWorksheetCollection2 ? 1 : 0;
    if ((paramzaml.c() == 3) && (i == 0))
    {
      a(2, paramzaml.c(paramWorksheetCollection1.p()));
    }
    else
    {
      this.c = paramzaml.c;
      this.d = paramzaml.d;
    }
    if (paramzaml.a != null)
    {
      this.a = new zlg();
      this.a.b(paramzaml.a);
    }
    else
    {
      this.a = null;
    }
    this.b = paramzaml.b;
  }
  
  void a(zaml paramzaml, CopyOptions paramCopyOptions)
  {
    int i = (paramCopyOptions == null) || (paramCopyOptions.b()) ? 1 : 0;
    if (paramzaml.a != null)
    {
      this.a = new zlg();
      this.a.b(paramzaml.a);
    }
    else
    {
      this.a = null;
    }
    if (i != 0)
    {
      if ((paramCopyOptions != null) && (paramCopyOptions.l != null) && (paramzaml.c() == 4) && (paramzaml.e() == 12))
      {
        this.d = paramCopyOptions.l.d;
        this.c = paramCopyOptions.l.c;
        if (paramCopyOptions.l.a != null)
        {
          if (this.a == null) {
            this.a = new zlg();
          }
          this.a.a(paramCopyOptions.l.a);
        }
      }
      else
      {
        this.c = paramzaml.c;
        this.d = paramzaml.d;
      }
    }
    else
    {
      int j = 0;
      if (paramzaml.c() == 3) {
        j = 1;
      } else if ((paramzaml.c() == 4) && (!paramCopyOptions.k())) {
        j = 1;
      }
      if (j != 0)
      {
        a(2, paramzaml.c(paramCopyOptions.j));
      }
      else
      {
        this.c = paramzaml.c;
        this.d = paramzaml.d;
      }
    }
    this.b = paramzaml.b;
  }
  
  void f(zaml paramzaml)
  {
    this.c = paramzaml.c;
    this.d = paramzaml.d;
    if (paramzaml.a != null)
    {
      this.a = new zlg();
      this.a.b(paramzaml.a);
    }
    else
    {
      this.a = null;
    }
    this.b = paramzaml.b;
  }
  
  void b(zaml paramzaml, CopyOptions paramCopyOptions)
  {
    if ((paramCopyOptions != null) && (paramCopyOptions.l != null) && (paramzaml.c() == 4) && (paramzaml.e() == 12)) {
      this.c = paramCopyOptions.l.c;
    } else {
      this.c = paramzaml.c;
    }
    this.d = paramzaml.d;
    if (paramzaml.a != null)
    {
      this.a = new zlg();
      this.a.b(paramzaml.a);
    }
    else
    {
      this.a = null;
    }
    this.b = paramzaml.b;
  }
  
  static boolean a(zaml paramzaml1, zaml paramzaml2, zmz paramzmz)
  {
    if (paramzaml1 != null)
    {
      if (paramzaml2 == null) {
        return false;
      }
      return paramzaml1.g(paramzaml2);
    }
    return paramzaml2 == null;
  }
  
  boolean g(zaml paramzaml)
  {
    if (this.b != paramzaml.b) {
      return false;
    }
    if (this.b) {
      return true;
    }
    if (this.c != paramzaml.c) {
      return false;
    }
    if (this.d != paramzaml.d) {
      return false;
    }
    if ((this.a != null) || (paramzaml.a != null)) {
      if ((this.a != null) && (paramzaml.a != null))
      {
        if (!this.a.c(paramzaml.a)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */