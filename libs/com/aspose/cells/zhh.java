package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.HashMap;

class zhh
  implements zaha
{
  private Cells a;
  private RowCollection b;
  private zgs c;
  private FindOptions d;
  private zajj e;
  private boolean f;
  private boolean g;
  private double h;
  private boolean i;
  private HashMap j;
  private zajm k;
  private zgs l;
  private zt m;
  private int n;
  
  zhh(Cells paramCells, Object paramObject, FindOptions paramFindOptions)
  {
    this.a = paramCells;
    this.b = paramCells.getRows();
    this.d = paramFindOptions;
    this.c = new zgs();
    this.l = this.c;
    boolean bool1 = false;
    boolean bool2 = false;
    double d1 = 0.0D;
    if (paramObject != null)
    {
      this.e = new zbso(zs.a(paramObject), paramFindOptions);
      switch (zaoj.a(paramObject.getClass()))
      {
      case 9: 
        bool1 = true;
        d1 = ((Integer)paramObject).intValue();
        break;
      case 14: 
        bool1 = true;
        d1 = ((Double)paramObject).doubleValue();
        break;
      case 16: 
        bool2 = true;
        d1 = CellsHelper.getDoubleFromDateTime((DateTime)paramObject, paramCells.p().p().getSettings().getDate1904());
        break;
      case 18: 
        if (paramFindOptions.getConvertNumericData())
        {
          zavp localzavp = zaac.a((String)paramObject, paramCells.p().p().getSettings().f());
          if (localzavp != null) {
            switch (localzavp.a())
            {
            case 4: 
              bool1 = true;
              d1 = ((Double)localzavp.d()).doubleValue();
              break;
            case 1: 
              bool2 = true;
              d1 = CellsHelper.getDoubleFromDateTime((DateTime)localzavp.d(), paramCells.p().p().getSettings().getDate1904());
            }
          }
        }
        break;
      }
    }
    else
    {
      this.e = null;
    }
    this.f = bool1;
    this.g = bool2;
    this.h = d1;
    this.k = paramCells.p().C();
    this.i = ((paramFindOptions.getLookInType() != 3) && (paramFindOptions.getStyle() != null));
    if (this.i)
    {
      if (paramFindOptions.getStyle().e() == null) {
        paramFindOptions.getStyle().a(paramCells.p());
      }
      this.j = new HashMap();
    }
  }
  
  private Cell a(zt paramzt, int paramInt, zgs paramzgs, boolean paramBoolean)
  {
    return new Cell(new Row(this.a, this.b, paramzt, false), paramInt, paramzgs, paramBoolean);
  }
  
  public boolean a(zt paramzt, int paramInt)
  {
    this.c.b = -1;
    if (this.i)
    {
      this.l = paramzt.a(paramInt, this.c, 3);
      if (!c(paramzt)) {
        return false;
      }
      if (this.e == null) {
        return true;
      }
    }
    Object localObject;
    String str;
    switch (this.d.getLookInType())
    {
    case 3: 
      localObject = this.a.g().getComments().get(paramzt.i(), paramzt.a(paramInt));
      if (localObject == null) {
        return false;
      }
      return this.e.a(((Comment)localObject).getNote());
    case 0: 
      this.l = paramzt.c(paramInt, this.c);
      switch (this.l.c)
      {
      case 0: 
        return false;
      case 5: 
        localObject = (zaai)this.l.d;
        str = ((zaai)localObject).j();
        if (str == null)
        {
          if ((this.l == this.c) && (!this.i)) {
            this.l = paramzt.a(paramInt, this.c, 3);
          }
          str = a(paramzt, paramInt, this.l, this.l == this.c).t();
          if (str == null) {
            return false;
          }
        }
        return this.e.a(str);
      }
      if ((this.l == this.c) && (!this.i)) {
        this.l = paramzt.a(paramInt, this.c, 3);
      }
      return b(paramzt);
    case 1: 
      this.l = paramzt.c(paramInt, this.c);
      if (this.l.c == 0) {
        return false;
      }
      if ((this.l == this.c) && (!this.i)) {
        this.l = paramzt.a(paramInt, this.c, 3);
      }
      return b(paramzt);
    case 2: 
      switch (paramzt.h(paramInt))
      {
      case 0: 
      case 5: 
        return false;
      }
      this.l = paramzt.a(paramInt, this.c, 5);
      return b(paramzt);
    case 5: 
      this.l = paramzt.a(paramInt, this.c, 5);
      return b(paramzt);
    case 4: 
      if (paramzt.h(paramInt) == 5)
      {
        localObject = (zaai)paramzt.i(paramInt);
        str = ((zaai)localObject).j();
        if (str == null)
        {
          if (!this.i) {
            this.l = paramzt.a(paramInt, this.c, 3);
          }
          if (this.l == this.c)
          {
            this.l.c = 5;
            this.l.d = localObject;
          }
          str = a(paramzt, paramInt, this.l, this.l == this.c).t();
          if (str == null) {
            return false;
          }
        }
        return this.e.a(str);
      }
      return false;
    }
    return false;
  }
  
  private void a(zt paramzt)
  {
    if (this.c.b > -1) {
      return;
    }
    if (this.l.b > -1)
    {
      this.c.b = this.l.b;
      return;
    }
    if (paramzt != this.m)
    {
      this.n = Row.e(paramzt);
      this.m = paramzt;
    }
    this.c.b = Cell.a(this.a, this.n, this.l.a);
  }
  
  private boolean b(zt paramzt)
  {
    if ((this.l.c == 1) || (this.l.c == 6))
    {
      double d1;
      if (this.f)
      {
        if (this.d.getLookAtType() == 3)
        {
          d1 = this.l.c == 1 ? ((Double)this.l.d).doubleValue() : zayi.a(((Integer)this.l.d).intValue());
          return Math.abs(d1 - this.h) <= Double.MIN_VALUE;
        }
        return this.e.a(zs.a(this.l.d));
      }
      if (this.g)
      {
        if (this.c.b < 0) {
          a(paramzt);
        }
        if (this.k.a(this.c.b).isDateTime())
        {
          d1 = this.l.c == 1 ? ((Double)this.l.d).doubleValue() : zayi.a(((Integer)this.l.d).intValue());
          return Math.abs(d1 - this.h) <= Double.MIN_VALUE;
        }
        return this.e.a(Cell.a(this.a, this.k.a(this.c.b), this.l));
      }
      if (this.d.a()) {
        return false;
      }
    }
    String str = null;
    if ((this.d.getLookInType() == 0) || (this.d.getLookInType() == 5))
    {
      str = this.l.a(true, this.a.p().p().getSettings());
    }
    else
    {
      if (this.c.b < 0) {
        a(paramzt);
      }
      str = Cell.a(this.a, this.k.a(this.c.b), this.l);
    }
    return this.e.a(str);
  }
  
  private boolean c(zt paramzt)
  {
    if (this.c.b < 0) {
      a(paramzt);
    }
    Object localObject = this.j.get(Integer.valueOf(this.c.b));
    if (localObject != null) {
      return ((Boolean)localObject).booleanValue();
    }
    boolean bool = a(this.k.a(this.c.b), this.d.getStyle());
    this.j.put(Integer.valueOf(this.c.b), Boolean.valueOf(bool));
    return bool;
  }
  
  private boolean a(Style paramStyle1, Style paramStyle2)
  {
    if (paramStyle2.isModified(11))
    {
      if ((paramStyle2.isModified(13)) && (!zw.b(paramStyle1.getFont().getName(), paramStyle2.getFont().getName()))) {
        return false;
      }
      if ((paramStyle2.isModified(12)) && (paramStyle1.getFont().getSize() != paramStyle2.getFont().getSize())) {
        return false;
      }
      if ((paramStyle2.isModified(16)) && (paramStyle1.getFont().b().c(paramStyle2.getFont().b()))) {
        return false;
      }
      if ((paramStyle2.isModified(18)) && (paramStyle1.getFont().isItalic() != paramStyle2.getFont().isItalic())) {
        return false;
      }
      if ((paramStyle2.isModified(17)) && (paramStyle1.getFont().g() != paramStyle2.getFont().g())) {
        return false;
      }
      if ((paramStyle2.isModified(19)) && (paramStyle1.getFont().getUnderline() != paramStyle2.getFont().getUnderline())) {
        return false;
      }
      if ((paramStyle2.isModified(23)) && (paramStyle1.getFont().f() != paramStyle2.getFont().f())) {
        return false;
      }
      if ((paramStyle2.isModified(20)) && (paramStyle1.getFont().isStrikeout() != paramStyle2.getFont().isStrikeout())) {
        return false;
      }
    }
    if (paramStyle2.isModified(1))
    {
      if ((paramStyle2.isModified(2)) && (!paramStyle1.getBorders().getByBorderType(1).equals(paramStyle2.getBorders().getByBorderType(1)))) {
        return false;
      }
      if ((paramStyle2.isModified(3)) && (!paramStyle1.getBorders().getByBorderType(2).equals(paramStyle2.getBorders().getByBorderType(2)))) {
        return false;
      }
      if ((paramStyle2.isModified(4)) && (!paramStyle1.getBorders().getByBorderType(4).equals(paramStyle2.getBorders().getByBorderType(4)))) {
        return false;
      }
      if ((paramStyle2.isModified(5)) && (!paramStyle1.getBorders().getByBorderType(8).equals(paramStyle2.getBorders().getByBorderType(8)))) {
        return false;
      }
      if ((paramStyle2.isModified(10)) && (!paramStyle1.getBorders().getByBorderType(32).equals(paramStyle2.getBorders().getByBorderType(32)))) {
        return false;
      }
      if ((paramStyle2.isModified(9)) && (!paramStyle1.getBorders().getByBorderType(16).equals(paramStyle2.getBorders().getByBorderType(16)))) {
        return false;
      }
    }
    if (paramStyle2.isModified(32))
    {
      if ((paramStyle2.isModified(33)) && (paramStyle1.getPattern() != paramStyle2.getPattern())) {
        return false;
      }
      if ((paramStyle2.isModified(34)) && (paramStyle1.b.c(paramStyle2.b))) {
        return false;
      }
      if ((paramStyle2.isModified(35)) && (paramStyle1.a.c(paramStyle2.a))) {
        return false;
      }
    }
    if ((paramStyle2.isGradient()) && (paramStyle1.b.c(paramStyle2.b))) {
      return false;
    }
    if (paramStyle2.isModified(25))
    {
      if (paramStyle1.d != paramStyle2.d) {
        return false;
      }
      if (paramStyle1.b.c(paramStyle2.b)) {
        return false;
      }
      if (paramStyle1.a.c(paramStyle2.a)) {
        return false;
      }
    }
    if ((paramStyle2.isModified(26)) && (paramStyle1.getVerticalAlignment() != paramStyle2.getVerticalAlignment())) {
      return false;
    }
    if ((paramStyle2.isModified(28)) && (paramStyle1.getRotationAngle() != paramStyle2.getRotationAngle())) {
      return false;
    }
    if ((paramStyle2.isModified(27)) && (paramStyle1.getIndentLevel() != paramStyle2.getIndentLevel())) {
      return false;
    }
    if (paramStyle2.isModified(24))
    {
      if (paramStyle1.getNumber() != paramStyle2.getNumber()) {
        return false;
      }
      if (!zw.b(paramStyle1.s(), paramStyle2.s())) {
        return false;
      }
    }
    return (!paramStyle2.isModified(29)) || (paramStyle1.isTextWrapped() == paramStyle2.isTextWrapped());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */