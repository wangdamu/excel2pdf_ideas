package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.zh;
import java.util.ArrayList;
import java.util.List;

class zbni
  implements zbic
{
  boolean a = true;
  private zbop s;
  private int t;
  private int u;
  private boolean v;
  private Workbook w;
  private Worksheet x;
  private zadf y;
  private int z;
  private int A;
  private int B;
  private int C;
  private float D;
  private float E;
  private float F;
  private float G;
  private float H;
  private float I;
  private int J = 0;
  private zxl K = null;
  private zanu L = null;
  private zg M = zbyb.a;
  private Color N = Color.getBlack();
  private zzo O = new zzo();
  private int P = 7;
  private int Q = 9;
  private int R = 0;
  private int S = 2;
  private boolean T;
  private boolean U = true;
  private float V = 0.0F;
  private float W = 0.0F;
  private float X = 0.0F;
  private float Y = 0.0F;
  private zaqd Z = null;
  private zq aa = new zq(0.0F, 0.0F, 0.0F, 0.0F);
  private ze ab = null;
  private zbfm ac = null;
  private zbvw ad = null;
  private String ae = "";
  private ArrayList af = new ArrayList();
  private zo ag = zo.a();
  private int ah = 0;
  private List ai = new ArrayList();
  private List aj = new ArrayList();
  private String ak = "";
  private int al = 0;
  private boolean am;
  private boolean an;
  boolean b = false;
  private boolean ao = false;
  private double ap = 0.0D;
  private int aq;
  private int ar;
  private int as;
  public int c = 1;
  public ArrayList d = new ArrayList();
  public zbni e;
  public boolean f = false;
  public boolean g = false;
  boolean h = false;
  public boolean i = false;
  public Chart j = null;
  public Shape k = null;
  public zo l = zo.a();
  public zo m = zo.a();
  private zq at = new zq(0.0F, 0.0F, 0.0F, 0.0F);
  private zq au = new zq(0.0F, 0.0F, 0.0F, 0.0F);
  private boolean av = false;
  public zadk n = null;
  private zr aw;
  private com.aspose.cells.b.a.b.zi ax;
  private boolean ay = false;
  private boolean az = false;
  short o = 0;
  boolean p = true;
  zbvz q = null;
  zaxp r = null;
  
  public void a(zr paramzr, boolean paramBoolean)
    throws Exception
  {
    if (!this.av) {
      af();
    }
    if (paramBoolean) {
      ah();
    }
    if ((Y()) && (this.b)) {
      switch (this.k.getActiveXControl().getType())
      {
      case 1: 
        zbiy.h(paramzr, this);
        return;
      case 2: 
      case 6: 
        zbiy.f(paramzr, this);
        return;
      case 3: 
        zbiy.g(paramzr, this);
        return;
      }
    }
    switch (q())
    {
    case 0: 
      double d1 = this.k.H();
      if ((d1 > 0.0D) || (this.k.isFlippedHorizontally()) || (this.k.isFlippedVertically()))
      {
        com.aspose.cells.b.a.b.a.zi localzi = zbiy.a(this, true);
        paramzr.a(localzi);
      }
      for (int i1 = 0; i1 < this.d.size(); i1++)
      {
        zf localzf = paramzr.d();
        zbni localzbni = (zbni)this.d.get(i1);
        if (localzbni.g)
        {
          Chart localChart = localzbni.j;
          localChart.n = at();
          localChart.o = ad();
          zh localzh = new zh();
          try
          {
            localChart.a(localzh, ImageFormat.getEmf());
            if (localzh.h() > 0L)
            {
              zj localzj = zj.a(localzh);
              try
              {
                if ((localzj.i() > 0) && (localzj.h() > 0))
                {
                  zq localzq1 = new zq(-1.0F, -1.0F, localzj.i() + 1, localzj.h() + 1);
                  zq localzq2 = localzbni.y();
                  if (localzq2.f() <= 2.0F) {
                    localzq2.a(2.0F);
                  }
                  if (localzq2.g() <= 2.0F) {
                    localzq2.b(2.0F);
                  }
                  paramzr.a(localzj, localzq2, localzq1, 2);
                }
              }
              finally {}
            }
          }
          finally
          {
            if (localzh != null) {
              localzh.a();
            }
          }
        }
        else
        {
          localzbni.a(paramzr, false);
        }
        paramzr.a(localzf);
      }
      break;
    case 6: 
      switch (r())
      {
      case 116: 
        zbiy.aC(paramzr, this);
        break;
      case 117: 
        zbiy.z(paramzr, this);
        break;
      case 110: 
        zbiy.x(paramzr, this);
        break;
      case 177: 
        zbiy.aF(paramzr, this);
        break;
      case 111: 
        zbiy.bw(paramzr, this);
        break;
      case 114: 
        zbiy.bu(paramzr, this);
        break;
      case 115: 
        zbiy.bv(paramzr, this);
        break;
      default: 
        zbiy.p(paramzr, this);
      }
      break;
    case 1: 
      zbiy.H(paramzr, this);
      break;
    case 2: 
      zbiy.o(paramzr, this);
      break;
    case 3: 
      zbiy.a(paramzr, this);
      break;
    case 19: 
      zbiy.d(paramzr, this);
      break;
    case 7: 
      zbiy.e(paramzr, this);
      break;
    case 11: 
    case 12: 
      zbiy.f(paramzr, this);
      break;
    case 18: 
      zbiy.g(paramzr, this);
      break;
    case 20: 
      zbiy.h(paramzr, this);
      break;
    case 14: 
      zbiy.c(paramzr, this);
      break;
    case 25: 
      zbiy.i(paramzr, this);
      break;
    case 17: 
      zbiy.k(paramzr, this);
      break;
    case 16: 
      zbiy.l(paramzr, this);
      break;
    case 8: 
      zbiy.j(paramzr, this);
      break;
    case 24: 
      zbiy.m(paramzr, this);
      break;
    case 30: 
      switch (r())
      {
      case 136: 
        zbiy.n(paramzr, this);
        break;
      case 96: 
        zbiy.q(paramzr, this);
        break;
      case 2: 
        zbiy.r(paramzr, this);
        break;
      case 1: 
        zbiy.az(paramzr, this);
        break;
      case 2060: 
        zbiy.s(paramzr, this);
        break;
      case 5: 
        zbiy.t(paramzr, this);
        break;
      case 6: 
        zbiy.u(paramzr, this);
        break;
      case 7: 
        zbiy.v(paramzr, this);
        break;
      case 8: 
        zbiy.w(paramzr, this);
        break;
      case 4: 
        zbiy.x(paramzr, this);
        break;
      case 56: 
        zbiy.y(paramzr, this);
        break;
      case 9: 
        zbiy.z(paramzr, this);
        break;
      case 10: 
        zbiy.A(paramzr, this);
        break;
      case 2061: 
        zbiy.B(paramzr, this);
        break;
      case 2062: 
        zbiy.C(paramzr, this);
        break;
      case 2059: 
        zbiy.D(paramzr, this);
        break;
      case 2056: 
        zbiy.E(paramzr, this);
        break;
      case 2057: 
        zbiy.F(paramzr, this);
        break;
      case 2058: 
        zbiy.G(paramzr, this);
        break;
      case 32: 
        zbiy.H(paramzr, this);
        break;
      case 61: 
        zbiy.I(paramzr, this);
        break;
      case 63: 
        zbiy.J(paramzr, this);
        break;
      case 13: 
        zbiy.K(paramzr, this);
        break;
      case 66: 
        zbiy.L(paramzr, this);
        break;
      case 68: 
        zbiy.M(paramzr, this);
        break;
      case 67: 
        zbiy.N(paramzr, this);
        break;
      case 69: 
        zbiy.O(paramzr, this);
        break;
      case 70: 
        zbiy.P(paramzr, this);
        break;
      case 16: 
        zbiy.Q(paramzr, this);
        break;
      case 22: 
        zbiy.R(paramzr, this);
        break;
      case 124: 
        zbiy.S(paramzr, this);
        break;
      case 11: 
        zbiy.T(paramzr, this);
        break;
      case 2068: 
        zbiy.U(paramzr, this);
        break;
      case 2112: 
        zbiy.V(paramzr, this);
        break;
      case 21: 
        zbiy.W(paramzr, this);
        break;
      case 20: 
        zbiy.H(paramzr, this);
        break;
      case 19: 
        zbiy.X(paramzr, this);
        break;
      case 2067: 
        zbiy.Y(paramzr, this);
        break;
      case 2066: 
        zbiy.Z(paramzr, this);
        break;
      case 33: 
        zbiy.ab(paramzr, this);
        break;
      case 35: 
        zbiy.ac(paramzr, this);
        break;
      case 36: 
        zbiy.ad(paramzr, this);
        break;
      case 34: 
        zbiy.aa(paramzr, this);
        break;
      case 185: 
        zbiy.ae(paramzr, this);
        break;
      case 186: 
        zbiy.af(paramzr, this);
        break;
      case 2071: 
        zbiy.ag(paramzr, this);
        break;
      case 2072: 
        zbiy.ah(paramzr, this);
        break;
      case 2073: 
        zbiy.ai(paramzr, this);
        break;
      case 2075: 
        zbiy.aj(paramzr, this);
        break;
      case 2074: 
        zbiy.ak(paramzr, this);
        break;
      case 87: 
        zbiy.al(paramzr, this);
        break;
      case 88: 
        zbiy.am(paramzr, this);
        break;
      case 2049: 
        zbiy.an(paramzr, this);
        break;
      case 2050: 
        zbiy.ao(paramzr, this);
        break;
      case 2051: 
        zbiy.ap(paramzr, this);
        break;
      case 2064: 
        zbiy.aq(paramzr, this);
        break;
      case 2069: 
        zbiy.ar(paramzr, this);
        break;
      case 2063: 
        zbiy.as(paramzr, this);
        break;
      case 74: 
        zbiy.at(paramzr, this);
        break;
      case 73: 
        zbiy.au(paramzr, this);
        break;
      case 84: 
        zbiy.av(paramzr, this);
        break;
      case 23: 
        zbiy.aw(paramzr, this);
        break;
      case 95: 
        zbiy.ax(paramzr, this);
        break;
      case 65: 
        zbiy.ay(paramzr, this);
        break;
      case 109: 
        zbiy.az(paramzr, this);
        break;
      case 176: 
        zbiy.r(paramzr, this);
        break;
      case 110: 
        zbiy.x(paramzr, this);
        break;
      case 111: 
        zbiy.bw(paramzr, this);
        break;
      case 117: 
        zbiy.z(paramzr, this);
        break;
      case 120: 
        zbiy.a(paramzr, this);
        break;
      case 121: 
        zbiy.aG(paramzr, this);
        break;
      case 127: 
        zbiy.t(paramzr, this);
        break;
      case 112: 
        zbiy.aA(paramzr, this);
        break;
      case 113: 
        zbiy.aB(paramzr, this);
        break;
      case 116: 
        zbiy.aC(paramzr, this);
        break;
      case 118: 
        zbiy.aD(paramzr, this);
        break;
      case 119: 
        zbiy.aE(paramzr, this);
        break;
      case 177: 
        zbiy.aF(paramzr, this);
        break;
      case 122: 
        zbiy.aH(paramzr, this);
        break;
      case 123: 
        zbiy.aI(paramzr, this);
        break;
      case 125: 
        zbiy.aJ(paramzr, this);
        break;
      case 114: 
        zbiy.bu(paramzr, this);
        break;
      case 115: 
        zbiy.bv(paramzr, this);
        break;
      case 126: 
        zbiy.aK(paramzr, this);
        break;
      case 128: 
        zbiy.aL(paramzr, this);
        break;
      case 130: 
        zbiy.aM(paramzr, this);
        break;
      case 135: 
        zbiy.aN(paramzr, this);
        break;
      case 131: 
        zbiy.aO(paramzr, this);
        break;
      case 132: 
        zbiy.aP(paramzr, this);
        break;
      case 133: 
        zbiy.aQ(paramzr, this);
        break;
      case 134: 
        zbiy.aR(paramzr, this);
        break;
      case 71: 
        zbiy.aS(paramzr, this);
        break;
      case 72: 
        zbiy.aT(paramzr, this);
        break;
      case 76: 
        zbiy.aU(paramzr, this);
        break;
      case 2070: 
        zbiy.aV(paramzr, this);
        break;
      case 183: 
        zbiy.aW(paramzr, this);
        break;
      case 182: 
        zbiy.aX(paramzr, this);
        break;
      case 91: 
        zbiy.aY(paramzr, this);
        break;
      case 101: 
        zbiy.aZ(paramzr, this);
        break;
      case 89: 
        zbiy.ba(paramzr, this);
        break;
      case 90: 
        zbiy.bb(paramzr, this);
        break;
      case 102: 
        zbiy.bc(paramzr, this);
        break;
      case 94: 
        zbiy.bd(paramzr, this);
        break;
      case 15: 
        zbiy.be(paramzr, this);
        break;
      case 55: 
        zbiy.bf(paramzr, this);
        break;
      case 78: 
        zbiy.bg(paramzr, this);
        break;
      case 80: 
        zbiy.bh(paramzr, this);
        break;
      case 184: 
        zbiy.bi(paramzr, this);
        break;
      case 187: 
        zbiy.bj(paramzr, this);
        break;
      case 12: 
        zbiy.bk(paramzr, this);
        break;
      case 2052: 
        zbiy.bl(paramzr, this);
        break;
      case 2053: 
        zbiy.bm(paramzr, this);
        break;
      case 58: 
        zbiy.bn(paramzr, this);
        break;
      case 2054: 
        zbiy.bo(paramzr, this);
        break;
      case 2055: 
        zbiy.bp(paramzr, this);
        break;
      case 59: 
        zbiy.bq(paramzr, this);
        break;
      case 92: 
        zbiy.br(paramzr, this);
        break;
      case 60: 
        zbiy.bs(paramzr, this);
        break;
      case 62: 
        zbiy.bt(paramzr, this);
        break;
      case 57: 
        zbiy.bx(paramzr, this);
        break;
      case 2076: 
        zbiy.by(paramzr, this);
        break;
      case 77: 
        zbiy.bz(paramzr, this);
        break;
      case 79: 
        zbiy.bA(paramzr, this);
        break;
      case 81: 
        zbiy.bB(paramzr, this);
        break;
      case 83: 
        zbiy.bC(paramzr, this);
        break;
      case 93: 
        zbiy.bD(paramzr, this);
        break;
      case 180: 
        zbiy.bE(paramzr, this);
        break;
      case 48: 
        zbiy.bG(paramzr, this);
        break;
      case 49: 
        zbiy.bI(paramzr, this);
        break;
      case 178: 
        zbiy.bF(paramzr, this);
        break;
      case 42: 
        zbiy.bH(paramzr, this);
        break;
      case 43: 
        zbiy.bJ(paramzr, this);
        break;
      case 50: 
        zbiy.bK(paramzr, this);
        break;
      case 51: 
        zbiy.bM(paramzr, this);
        break;
      case 52: 
        zbiy.bO(paramzr, this);
        break;
      case 44: 
        zbiy.bL(paramzr, this);
        break;
      case 45: 
        zbiy.bN(paramzr, this);
        break;
      case 46: 
        zbiy.bP(paramzr, this);
        break;
      case 106: 
        zbiy.bQ(paramzr, this);
        break;
      case 97: 
        zbiy.bR(paramzr, this);
        break;
      case 98: 
        zbiy.bS(paramzr, this);
        break;
      case 54: 
        zbiy.bT(paramzr, this);
        break;
      case 53: 
        zbiy.bU(paramzr, this);
        break;
      case 64: 
        zbiy.bV(paramzr, this);
        break;
      case 188: 
        zbiy.bW(paramzr, this);
        break;
      case 38: 
        zbiy.bX(paramzr, this);
        break;
      case 37: 
        zbiy.bY(paramzr, this);
        break;
      case 39: 
        zbiy.cg(paramzr, this);
        break;
      case 40: 
        break;
      case 104: 
        zbiy.bZ(paramzr, this);
        break;
      case 105: 
        zbiy.ca(paramzr, this);
        break;
      case 103: 
        zbiy.cb(paramzr, this);
        break;
      case 0: 
        zbiy.cc(paramzr, this);
        break;
      case 85: 
        zbiy.cd(paramzr, this);
        break;
      case 86: 
        zbiy.ce(paramzr, this);
        break;
      case 99: 
        zbiy.cf(paramzr, this);
        break;
      case 201: 
        if (31 == this.k.getMsoDrawingType()) {
          zbiy.b(paramzr, this);
        }
        break;
      default: 
        if ((c() != null) && (c().a().size() > 0)) {
          zbiy.cc(paramzr, this);
        }
        break;
      }
      break;
    }
  }
  
  private void af()
  {
    zq localzq = y();
    this.au = new zq(localzq.f(), localzq.g(), localzq.h(), localzq.i());
    float f2;
    float f3;
    float f4;
    switch (q())
    {
    case 3: 
    case 6: 
      this.au = a(this.au);
      break;
    case 2: 
      if ((w() != 0) && (w() != 180) && (!ad()))
      {
        this.au = zbya.a(y(), w());
        this.au.a(0.5F, 0.5F);
      }
      else if (!ad())
      {
        this.au = a(this.au);
      }
      break;
    case 11: 
    case 12: 
      float f1 = 0.0F;
      if (!A().a())
      {
        f1 = this.L.h();
        this.au.a(this.L.h(), this.L.h());
      }
      if ((K() != null) && (!"".equals(K())))
      {
        f2 = 5.0F;
        f3 = 10.0F;
        f4 = s() + 1.0F;
        zt localzt1 = ab().a("a", B());
        if (f4 < localzt1.b()) {
          f4 = localzt1.b();
        }
        float f5 = t() - 10.0F;
        if (f5 <= localzt1.c()) {
          f5 = localzt1.c();
        }
        zt localzt2 = new zt(f4, f5);
        zt localzt3 = ab().a(K(), B(), localzt2);
        if (localzt3.b() + f2 + f3 + 1.0F > s() + f1)
        {
          float f6 = localzt3.b() + f2 + f3 + 1.0F - (s() + f1);
          this.au.c(this.au.h() + f6);
        }
      }
      break;
    case 1: 
      this.au = zbyb.a(this);
      break;
    case 19: 
      if ((K() != null) && (!"".equals(K())))
      {
        f2 = 8.0F;
        f3 = ab().a(K(), B()).b();
        if (f3 + f2 > s()) {
          this.au.c(this.au.h() + (f3 + f2 - s()));
        }
        f4 = B().d() * 1;
        this.au.b(this.au.g() - f4 / 2.0F);
        this.au.d(this.au.i() + f4 / 2.0F);
      }
      this.au.a(0.5F, 0.5F);
      break;
    case 7: 
    case 18: 
    case 20: 
      this.au.a(0.5F, 0.5F);
      break;
    case 8: 
      if ((w() != 0) && (w() != 180) && (!ad())) {
        this.au = zbya.a(y(), w());
      }
      if (!A().a()) {
        this.au.a(this.L.h(), this.L.h());
      }
      break;
    case 24: 
      if (!A().a()) {
        this.au.a(this.L.h(), this.L.h());
      }
      break;
    case 0: 
      this.au.c(this.au.h() + this.L.h());
      this.au.d(this.au.i() + this.L.h());
      break;
    case 25: 
      this.au = zbyb.b(this, false);
      break;
    case 30: 
      switch (r())
      {
      case 87: 
        if ((w() != 0) && (w() != 180)) {
          this.au = zbya.a(y(), w());
        }
        break;
      case 20: 
        this.au = zbyb.a(this);
        if ((this.f) && ((w() == 90) || (w() == 270)))
        {
          f2 = this.au.i();
          f3 = this.au.h();
          this.au.c(f2);
          this.au.d(f3);
        }
        break;
      case 32: 
        this.au = zbyb.a(this);
        if ((this.f) && (A().h() <= 1.0F) && ((w() == 90) || (w() == 270)))
        {
          f2 = this.au.i();
          f3 = this.au.h();
          this.au.c(f2);
          this.au.d(f3);
        }
        break;
      case 37: 
      case 38: 
      case 39: 
      case 40: 
        if (s() <= 1.0F)
        {
          this.au.c(this.au.h() + 2.0F);
          this.F += 2.0F;
        }
        if (t() <= 1.0F)
        {
          this.au.d(this.au.i() + 2.0F);
          this.G += 2.0F;
        }
        if ((w() > 0) && (w() != 180)) {
          this.au = zbyb.c(this);
        } else {
          this.au = zbyb.p(this);
        }
        this.aa = zbxz.b(this.au);
        break;
      case 34: 
        if (s() <= 1.0F)
        {
          this.au.c(this.au.h() + 1.0F);
          this.F += 1.0F;
        }
        if (t() <= 1.0F)
        {
          this.au.d(this.au.i() + 1.0F);
          this.G += 1.0F;
        }
        if ((w() > 0) && (w() != 180)) {
          this.au = zbyb.c(this);
        } else {
          this.au = zbyb.o(this);
        }
        this.aa = zbxz.b(this.au);
        break;
      case 35: 
        if (w() > 0) {
          this.au = zbyb.d(this);
        } else {
          this.au = zbyb.q(this);
        }
        this.aa = zbxz.b(this.au);
        break;
      case 33: 
      case 36: 
        if (w() > 0) {
          this.au = zbyb.c(this);
        } else {
          this.au = zbyb.o(this);
        }
        this.aa = zbxz.b(this.au);
        break;
      case 19: 
        if (!A().a()) {
          this.au.a(zbxz.a(this.L.h() / 2.0F), zbxz.a(this.L.h() / 2.0F));
        }
        break;
      case 61: 
      case 62: 
      case 63: 
        this.au = zbyb.a(this, false);
        break;
      case 178: 
      case 180: 
        ArrayList localArrayList1 = zbyb.e(this);
        this.au = ((zq)localArrayList1.get(0));
        break;
      case 42: 
      case 48: 
        ArrayList localArrayList2 = zbyb.f(this);
        this.au = ((zq)localArrayList2.get(0));
        break;
      case 43: 
      case 49: 
        this.au = zbyb.g(this);
        break;
      case 44: 
      case 50: 
        this.au = zbyb.i(this);
        break;
      case 45: 
      case 51: 
        this.au = zbyb.j(this);
        break;
      case 46: 
      case 52: 
        this.au = zbyb.l(this);
        break;
      case 106: 
        this.au = zbyb.n(this);
        break;
      case 13: 
      case 66: 
      case 67: 
      case 68: 
        this.au = zbyb.r(this);
        break;
      case 0: 
        if (s() == 0.0F)
        {
          this.au.c(this.au.h() + 1.0F);
          this.F += 1.0F;
        }
        if (t() == 0.0F)
        {
          this.au.d(this.au.i() + 1.0F);
          this.G += 1.0F;
        }
        this.au.a(this.L.h() / 2.0F, this.L.h() / 2.0F);
        if (this.L.h() <= 1.0F) {
          this.au.b(this.au.g() + this.L.h() / 2.0F);
        }
        break;
      case 2061: 
        if ((w() > 0) && (w() != 180)) {
          this.au = zbya.a(y(), w());
        }
        this.au.a(this.L.h() / 2.0F, this.L.h() / 2.0F);
        break;
      case 2: 
      case 2064: 
        if ((w() > 0) && (w() != 180)) {
          this.au = zbya.a(y(), w());
        }
        this.au.a(this.L.h() / 2.0F, this.L.h() / 2.0F);
        break;
      default: 
        this.au = a(this.au);
      }
      break;
    }
    this.av = true;
  }
  
  private void ag()
  {
    zq localzq = y();
    this.at = new zq(localzq.f(), localzq.g(), localzq.h(), localzq.i());
    float f2;
    float f3;
    float f4;
    switch (q())
    {
    case 3: 
    case 6: 
      this.at = a(this.at);
      break;
    case 11: 
    case 12: 
      float f1 = 0.0F;
      if (!A().a())
      {
        f1 = this.L.h();
        this.at.a(this.L.h(), this.L.h());
      }
      if ((K() != null) && (!"".equals(K())))
      {
        f2 = 5.0F;
        f3 = 10.0F;
        f4 = s() + 1.0F;
        zt localzt1 = ab().a("a", B());
        if (f4 < localzt1.b()) {
          f4 = localzt1.b();
        }
        float f5 = t() - 10.0F;
        if (f5 <= localzt1.c()) {
          f5 = localzt1.c();
        }
        zt localzt2 = new zt(f4, f5);
        zt localzt3 = ab().a(K(), B(), localzt2);
        if (localzt3.b() + f2 + f3 + 1.0F > s() + f1)
        {
          float f6 = localzt3.b() + f2 + f3 + 1.0F - (s() + f1);
          this.at.c(this.at.h() + f6);
        }
      }
      break;
    case 1: 
      this.at = zbyb.a(this);
      break;
    case 19: 
      if ((K() != null) && (!"".equals(K())))
      {
        f2 = 8.0F;
        f3 = ab().a(K(), B()).b();
        if (f3 + f2 > s()) {
          this.at.c(this.at.h() + (f3 + f2 - s()));
        }
        f4 = B().d() * 1;
        this.at.b(this.at.g() - f4 / 2.0F);
        this.at.d(this.at.i() + f4 / 2.0F);
      }
      this.at.a(0.5F, 0.5F);
      break;
    case 7: 
    case 18: 
    case 20: 
      this.at.a(0.5F, 0.5F);
      break;
    case 8: 
    case 24: 
      if ((w() != 0) && (w() != 180) && (!ad())) {
        this.at = zbya.a(y(), w());
      }
      if (!A().a()) {
        this.at.a(this.L.h(), this.L.h());
      }
      break;
    case 0: 
      this.at = new zq(y().f(), y().g(), y().h() + this.L.h(), y().i() + this.L.h());
      break;
    case 25: 
      this.at = zbyb.b(this, true);
      break;
    case 30: 
      switch (r())
      {
      case 87: 
        if ((w() != 0) && (w() != 180)) {
          this.at = zbya.a(y(), w());
        }
        break;
      case 20: 
        this.at = zbyb.a(this);
        if ((this.f) && ((w() == 90) || (w() == 270)))
        {
          f2 = this.at.i();
          f3 = this.at.h();
          this.at.c(f2);
          this.at.d(f3);
        }
        break;
      case 32: 
        this.at = zbyb.a(this);
        if ((this.f) && ((w() == 90) || (w() == 270)))
        {
          f2 = this.at.i();
          f3 = this.at.h();
          this.at.c(f2);
          this.at.d(f3);
        }
        break;
      case 33: 
      case 35: 
      case 36: 
      case 37: 
      case 38: 
      case 39: 
      case 40: 
        this.at = zbyb.b(this);
        break;
      case 34: 
        if ((w() > 0) && (w() != 180)) {
          this.at = zbyb.c(this);
        } else {
          this.at = zbyb.o(this);
        }
        this.aa = zbxz.b(this.at);
        break;
      case 61: 
      case 62: 
      case 63: 
        this.at = zbyb.a(this, true);
        break;
      case 178: 
      case 180: 
        ArrayList localArrayList1 = zbyb.e(this);
        this.at = ((zq)localArrayList1.get(0));
        this.at.a(this.at.f() + ((Float)localArrayList1.get(1)).floatValue());
        this.at.b(this.at.g() + ((Float)localArrayList1.get(2)).floatValue());
        this.at.a(this.L.h() / 2.0F, this.L.h() / 2.0F);
        break;
      case 42: 
      case 48: 
        ArrayList localArrayList2 = zbyb.f(this);
        this.at = ((zq)localArrayList2.get(0));
        this.at.a(this.at.f() + ((Float)localArrayList2.get(1)).floatValue());
        this.at.b(this.at.g() + ((Float)localArrayList2.get(2)).floatValue());
        this.at.a(this.L.h() / 2.0F, this.L.h() / 2.0F);
        break;
      case 43: 
      case 49: 
        this.at = zbyb.h(this);
        break;
      case 44: 
      case 50: 
        this.at = zbyb.i(this);
        f4 = this.at.h() - y().h();
        this.at.a(this.at.f() - f4);
        break;
      case 45: 
      case 51: 
        this.at = zbyb.k(this);
        break;
      case 46: 
      case 52: 
        this.at = zbyb.m(this);
        break;
      case 106: 
        this.at = zbyb.n(this);
        break;
      case 0: 
        if (s() == 0.0F)
        {
          this.at.c(this.at.h() + 1.0F);
          this.F += 1.0F;
        }
        if (t() == 0.0F)
        {
          this.at.d(this.at.i() + 1.0F);
          this.G += 1.0F;
        }
        if ((this.L.h() > 1.0F) || (this.at.h() == 1.0F) || (this.at.i() == 1.0F)) {
          this.at.a(this.L.h() / 2.0F, this.L.h() / 2.0F);
        }
        break;
      case 13: 
      case 66: 
      case 67: 
      case 68: 
        this.at = zbyb.r(this);
        break;
      case 2061: 
        if ((w() > 0) && (w() != 180)) {
          this.at = zbya.a(y(), w());
        }
        this.at.a(this.L.h() / 2.0F, this.L.h() / 2.0F);
        break;
      case 2: 
        if ((w() > 0) && (w() != 180)) {
          this.at = zbya.a(y(), w());
        }
        this.at.a(this.L.h() / 2.0F, this.L.h() / 2.0F);
        break;
      default: 
        this.at = a(this.at);
      }
      break;
    }
    this.av = true;
  }
  
  private zq a(zq paramzq)
  {
    if (A().a()) {
      return paramzq;
    }
    zq localzq = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    if (this.L.h() <= 1.0F) {
      localzq.a(this.L.h(), this.L.h());
    } else {
      localzq.a(this.L.h() / 2.0F, this.L.h() / 2.0F);
    }
    return localzq;
  }
  
  void a(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  Workbook a()
  {
    return this.w;
  }
  
  void a(Workbook paramWorkbook)
  {
    this.w = paramWorkbook;
  }
  
  Worksheet b()
  {
    return this.x;
  }
  
  void a(Worksheet paramWorksheet)
  {
    this.x = paramWorksheet;
  }
  
  zadf c()
  {
    return this.y;
  }
  
  void a(zadf paramzadf)
  {
    this.y = paramzadf;
  }
  
  int d()
  {
    return this.z;
  }
  
  void a(int paramInt)
  {
    this.z = paramInt;
  }
  
  int e()
  {
    return this.A;
  }
  
  void b(int paramInt)
  {
    this.A = paramInt;
  }
  
  int f()
  {
    return this.B;
  }
  
  void c(int paramInt)
  {
    this.B = paramInt;
  }
  
  int g()
  {
    return this.C;
  }
  
  void d(int paramInt)
  {
    this.C = paramInt;
  }
  
  int h()
  {
    return this.k.getLeft();
  }
  
  int i()
  {
    return this.k.getTop();
  }
  
  int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return this.k.d(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return this.k.c(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  float j()
  {
    return this.D;
  }
  
  void a(float paramFloat)
  {
    this.D = paramFloat;
  }
  
  float k()
  {
    return this.E;
  }
  
  void b(float paramFloat)
  {
    this.E = paramFloat;
  }
  
  zaqd l()
  {
    return this.Z;
  }
  
  void a(zaqd paramzaqd)
  {
    this.Z = paramzaqd;
  }
  
  zq m()
  {
    return this.aa;
  }
  
  void a(ze paramze)
  {
    this.ab = paramze;
  }
  
  zbfm n()
  {
    return this.ac;
  }
  
  void a(zbfm paramzbfm)
  {
    this.ac = paramzbfm;
  }
  
  zbvw o()
  {
    return this.ad;
  }
  
  void a(zbvw paramzbvw)
  {
    this.ad = paramzbvw;
  }
  
  boolean p()
  {
    return zbxz.b(K());
  }
  
  public zbni(zbop paramzbop, int paramInt)
  {
    this.s = paramzbop;
    this.t = paramInt;
    this.av = false;
    this.K = new zxl(this);
    this.L = new zanu(this);
  }
  
  public zbni(int paramInt)
  {
    this(null, paramInt);
  }
  
  public int q()
  {
    return this.t;
  }
  
  public int r()
  {
    return this.u;
  }
  
  public void e(int paramInt)
  {
    this.u = paramInt;
  }
  
  public float s()
  {
    return this.F;
  }
  
  public void c(float paramFloat)
  {
    this.F = paramFloat;
  }
  
  public float t()
  {
    return this.G;
  }
  
  public void d(float paramFloat)
  {
    this.G = paramFloat;
  }
  
  public float u()
  {
    return this.H;
  }
  
  public void e(float paramFloat)
  {
    this.H = paramFloat;
  }
  
  public float v()
  {
    return this.I;
  }
  
  public void f(float paramFloat)
  {
    this.I = paramFloat;
  }
  
  public int w()
  {
    return this.J;
  }
  
  public void f(int paramInt)
  {
    if (paramInt < 0) {
      this.J = (360 + paramInt % 360);
    } else if (paramInt > 360) {
      this.J = (paramInt % 360);
    } else {
      this.J = paramInt;
    }
  }
  
  boolean x()
  {
    int i1 = w();
    return ((i1 >= 45) && (i1 < 135)) || ((i1 >= 225) && (i1 < 315));
  }
  
  public zq y()
  {
    return new zq(this.H, this.I, this.F, this.G);
  }
  
  public zxl z()
  {
    return this.K;
  }
  
  public zanu A()
  {
    return this.L;
  }
  
  public zg B()
  {
    return this.M;
  }
  
  public void a(zg paramzg)
  {
    this.M = paramzg;
  }
  
  public Color C()
  {
    return this.N;
  }
  
  public void a(Color paramColor)
  {
    this.N = paramColor;
  }
  
  public zzo D()
  {
    return this.O;
  }
  
  public void a(zzo paramzzo)
  {
    this.O = paramzzo;
  }
  
  public int E()
  {
    return this.P;
  }
  
  public void g(int paramInt)
  {
    this.P = paramInt;
  }
  
  public int F()
  {
    return this.Q;
  }
  
  public void h(int paramInt)
  {
    this.Q = paramInt;
  }
  
  public int G()
  {
    return this.R;
  }
  
  public void i(int paramInt)
  {
    this.R = paramInt;
  }
  
  public int H()
  {
    return this.S;
  }
  
  public void j(int paramInt)
  {
    this.S = paramInt;
  }
  
  double I()
  {
    return this.ap;
  }
  
  void a(double paramDouble)
  {
    this.ap = paramDouble;
  }
  
  public boolean J()
  {
    return this.T;
  }
  
  public void b(boolean paramBoolean)
  {
    this.T = paramBoolean;
  }
  
  public String K()
  {
    return this.ae;
  }
  
  public void a(String paramString)
  {
    this.ae = paramString;
  }
  
  public ArrayList L()
  {
    return this.af;
  }
  
  public int M()
  {
    return this.ah;
  }
  
  public void k(int paramInt)
  {
    this.ah = paramInt;
  }
  
  public List N()
  {
    return this.ai;
  }
  
  public int O()
  {
    return this.al;
  }
  
  public List P()
  {
    return this.aj;
  }
  
  public void a(List paramList)
  {
    this.aj = paramList;
  }
  
  public String Q()
  {
    return this.ak;
  }
  
  public void b(String paramString)
  {
    this.ak = paramString;
  }
  
  public int R()
  {
    return this.aq;
  }
  
  public void l(int paramInt)
  {
    this.aq = paramInt;
  }
  
  public int S()
  {
    return this.ar;
  }
  
  public void m(int paramInt)
  {
    this.ar = paramInt;
  }
  
  public int T()
  {
    return this.as;
  }
  
  public void n(int paramInt)
  {
    this.as = paramInt;
  }
  
  public boolean U()
  {
    return this.am;
  }
  
  public void c(boolean paramBoolean)
  {
    this.am = paramBoolean;
  }
  
  public boolean V()
  {
    return this.an;
  }
  
  public void d(boolean paramBoolean)
  {
    this.an = paramBoolean;
  }
  
  zq W()
  {
    if (!this.av) {
      af();
    }
    return this.au;
  }
  
  zq X()
  {
    if (!this.av) {
      ag();
    }
    return this.at;
  }
  
  boolean Y()
    throws Exception
  {
    return this.k.getActiveXControl() != null;
  }
  
  private void ah()
  {
    float f1 = u() - W().f();
    float f2 = v() - W().g();
    e(u() + f1);
    f(v() + f2);
    this.au.a(this.au.f() + f1);
    this.au.b(this.au.g() + f2);
  }
  
  public void Z()
  {
    if (!this.av) {
      ag();
    }
  }
  
  public zr aa()
  {
    return this.aw;
  }
  
  public void a(zr paramzr)
  {
    this.aw = paramzr;
  }
  
  public com.aspose.cells.b.a.b.zi ab()
  {
    if (this.ax == null)
    {
      za localza = new za(1, 1);
      this.ax = com.aspose.cells.b.a.b.zi.a(localza);
    }
    return this.ax;
  }
  
  public void aq()
    throws Exception
  {
    a(aa(), true);
  }
  
  boolean ac()
  {
    if ((r() != 20) && (r() != 32) && (r() != 34))
    {
      if (r() == 0)
      {
        this.au.c(this.au.h() + 1.0F);
        this.au.d(this.au.i() + 1.0F);
        c(s() + 1.0F);
        d(t() + 1.0F);
      }
      if ((W().h() <= 0.0F) || (W().i() <= 0.0F)) {
        return false;
      }
    }
    return true;
  }
  
  public boolean at()
  {
    return this.ay;
  }
  
  public void j(boolean paramBoolean)
  {
    this.ay = paramBoolean;
  }
  
  public boolean ad()
  {
    return this.az;
  }
  
  public void k(boolean paramBoolean)
  {
    this.az = paramBoolean;
  }
  
  boolean ae()
  {
    return (this.r != null) && ((this.r.b() == 136) || (this.r.b() == 172) || (this.r.b() == 173)) && ((r() == 1) || (r() == 172) || (r() == 173) || (r() == 136));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */