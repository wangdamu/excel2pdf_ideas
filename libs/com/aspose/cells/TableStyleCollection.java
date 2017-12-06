package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class TableStyleCollection
  extends CollectionBase
{
  WorksheetCollection a;
  private Object b = Integer.valueOf(30);
  private String c = "PivotStyleLight16";
  
  String a()
  {
    if (this.b == null) {
      return null;
    }
    if ((this.b instanceof String)) {
      return (String)this.b;
    }
    return zbvp.a(((Integer)this.b).intValue());
  }
  
  void a(String paramString)
  {
    int i = zbvp.a(paramString);
    if ((i != 61) && (i != 0)) {
      this.b = Integer.valueOf(i);
    } else {
      this.b = paramString;
    }
  }
  
  String b()
  {
    return this.c;
  }
  
  void b(String paramString)
  {
    this.c = paramString;
  }
  
  WorksheetCollection c()
  {
    return this.a;
  }
  
  TableStyleCollection(WorksheetCollection worksheets)
  {
    this.a = worksheets;
  }
  
  public int addTableStyle(String name)
  {
    TableStyle localTableStyle = new TableStyle(this, name);
    localTableStyle.a(false);
    zf.a(this.InnerList, localTableStyle);
    return getCount() - 1;
  }
  
  public int addPivotTableStyle(String name)
  {
    TableStyle localTableStyle = new TableStyle(this, name);
    localTableStyle.b(false);
    zf.a(this.InnerList, localTableStyle);
    return getCount() - 1;
  }
  
  int c(String paramString)
  {
    TableStyle localTableStyle = new TableStyle(this, paramString);
    zf.a(this.InnerList, localTableStyle);
    return getCount() - 1;
  }
  
  public TableStyle get(int index)
  {
    return (TableStyle)this.InnerList.get(index);
  }
  
  public TableStyle get(String name)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      TableStyle localTableStyle = (TableStyle)this.InnerList.get(i);
      if (zy.a(localTableStyle.getName(), name)) {
        return localTableStyle;
      }
    }
    return null;
  }
  
  public TableStyle getBuiltinTableStyle(int type)
  {
    switch (type)
    {
    case 1: 
      return zey.a(this.a);
    case 2: 
      return zey.b(this.a);
    case 3: 
      return zey.c(this.a);
    case 4: 
      return zey.d(this.a);
    case 5: 
      return zey.e(this.a);
    case 6: 
      return zey.f(this.a);
    case 7: 
      return zey.g(this.a);
    case 8: 
      return zey.h(this.a);
    case 9: 
      return zey.i(this.a);
    case 10: 
      return zey.j(this.a);
    case 11: 
      return zey.k(this.a);
    case 12: 
      return zey.l(this.a);
    case 13: 
      return zey.m(this.a);
    case 14: 
      return zey.n(this.a);
    case 15: 
      return zey.o(this.a);
    case 16: 
      return zey.p(this.a);
    case 17: 
      return zey.q(this.a);
    case 18: 
      return zey.r(this.a);
    case 19: 
      return zey.s(this.a);
    case 20: 
      return zey.t(this.a);
    case 21: 
      return zey.u(this.a);
    case 22: 
      return zey.v(this.a);
    case 23: 
      return zey.w(this.a);
    case 24: 
      return zey.x(this.a);
    case 25: 
      return zey.y(this.a);
    case 26: 
      return zey.z(this.a);
    case 27: 
      return zey.A(this.a);
    case 28: 
      return zey.B(this.a);
    case 29: 
      return zey.C(this.a);
    case 30: 
      return zey.D(this.a);
    case 31: 
      return zey.E(this.a);
    case 32: 
      return zey.F(this.a);
    case 33: 
      return zey.G(this.a);
    case 34: 
      return zey.H(this.a);
    case 35: 
      return zey.I(this.a);
    case 36: 
      return zey.J(this.a);
    case 37: 
      return zey.K(this.a);
    case 38: 
      return zey.L(this.a);
    case 39: 
      return zey.M(this.a);
    case 40: 
      return zey.N(this.a);
    case 41: 
      return zey.O(this.a);
    case 42: 
      return zey.Q(this.a);
    case 43: 
      return zey.P(this.a);
    case 44: 
      return zey.R(this.a);
    case 45: 
      return zey.S(this.a);
    case 46: 
      return zey.T(this.a);
    case 47: 
      return zey.U(this.a);
    case 48: 
      return zey.V(this.a);
    case 49: 
      return zey.W(this.a);
    case 50: 
      return zey.X(this.a);
    case 51: 
      return zey.Y(this.a);
    case 52: 
      return zey.Z(this.a);
    case 53: 
      return zey.aa(this.a);
    case 54: 
      return zey.ab(this.a);
    case 55: 
      return zey.ac(this.a);
    case 56: 
      return zey.ad(this.a);
    case 57: 
      return zey.ae(this.a);
    case 58: 
      return zey.af(this.a);
    case 59: 
      return zey.ag(this.a);
    case 60: 
      return zey.ah(this.a);
    }
    return null;
  }
  
  TableStyle a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return zex.D(this.a);
    case 2: 
      return zex.O(this.a);
    case 3: 
      return zex.Y(this.a);
    case 4: 
      return zex.Z(this.a);
    case 5: 
      return zex.aa(this.a);
    case 6: 
      return zex.ab(this.a);
    case 7: 
      return zex.ac(this.a);
    case 8: 
      return zex.ad(this.a);
    case 9: 
      return zex.ae(this.a);
    case 10: 
      return zex.E(this.a);
    case 11: 
      return zex.F(this.a);
    case 12: 
      return zex.G(this.a);
    case 13: 
      return zex.H(this.a);
    case 14: 
      return zex.I(this.a);
    case 15: 
      return zex.J(this.a);
    case 16: 
      return zex.K(this.a);
    case 17: 
      return zex.L(this.a);
    case 18: 
      return zex.M(this.a);
    case 19: 
      return zex.N(this.a);
    case 20: 
      return zex.P(this.a);
    case 21: 
      return zex.Q(this.a);
    case 22: 
      return zex.R(this.a);
    case 23: 
      return zex.S(this.a);
    case 24: 
      return zex.T(this.a);
    case 25: 
      return zex.U(this.a);
    case 26: 
      return zex.V(this.a);
    case 27: 
      return zex.W(this.a);
    case 28: 
      return zex.X(this.a);
    case 29: 
      return zex.af(this.a);
    case 30: 
      return zex.aq(this.a);
    case 31: 
      return zex.aA(this.a);
    case 32: 
      return zex.aB(this.a);
    case 33: 
      return zex.aC(this.a);
    case 34: 
      return zex.aD(this.a);
    case 35: 
      return zex.aE(this.a);
    case 36: 
      return zex.aF(this.a);
    case 37: 
      return zex.aG(this.a);
    case 38: 
      return zex.ag(this.a);
    case 39: 
      return zex.ah(this.a);
    case 40: 
      return zex.ai(this.a);
    case 41: 
      return zex.aj(this.a);
    case 42: 
      return zex.ak(this.a);
    case 43: 
      return zex.al(this.a);
    case 44: 
      return zex.am(this.a);
    case 45: 
      return zex.an(this.a);
    case 46: 
      return zex.ao(this.a);
    case 47: 
      return zex.ap(this.a);
    case 48: 
      return zex.ar(this.a);
    case 49: 
      return zex.as(this.a);
    case 50: 
      return zex.at(this.a);
    case 51: 
      return zex.au(this.a);
    case 52: 
      return zex.av(this.a);
    case 53: 
      return zex.aw(this.a);
    case 54: 
      return zex.ax(this.a);
    case 55: 
      return zex.ay(this.a);
    case 56: 
      return zex.az(this.a);
    case 57: 
      return zex.b(this.a);
    case 58: 
      return zex.m(this.a);
    case 59: 
      return zex.w(this.a);
    case 60: 
      return zex.x(this.a);
    case 61: 
      return zex.y(this.a);
    case 62: 
      return zex.z(this.a);
    case 63: 
      return zex.A(this.a);
    case 64: 
      return zex.B(this.a);
    case 65: 
      return zex.C(this.a);
    case 66: 
      return zex.c(this.a);
    case 67: 
      return zex.d(this.a);
    case 68: 
      return zex.e(this.a);
    case 69: 
      return zex.f(this.a);
    case 70: 
      return zex.g(this.a);
    case 71: 
      return zex.h(this.a);
    case 72: 
      return zex.i(this.a);
    case 73: 
      return zex.j(this.a);
    case 74: 
      return zex.k(this.a);
    case 75: 
      return zex.l(this.a);
    case 76: 
      return zex.n(this.a);
    case 77: 
      return zex.o(this.a);
    case 78: 
      return zex.p(this.a);
    case 79: 
      return zex.q(this.a);
    case 80: 
      return zex.r(this.a);
    case 81: 
      return zex.s(this.a);
    case 82: 
      return zex.t(this.a);
    case 83: 
      return zex.u(this.a);
    case 84: 
      return zex.v(this.a);
    case 0: 
      return zex.a(this.a);
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TableStyleCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */