package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.d.zh;
import java.util.ArrayList;
import java.util.List;

class zbnh
  implements zbic
{
  private zboo m;
  private int n;
  private float o;
  private float p;
  private float q;
  private float r;
  private int s = 0;
  private zxk t = null;
  private zant u = null;
  private zg v = zbya.a;
  private Color w = Color.getBlack();
  private int x = 7;
  private int y = 9;
  private int z = 0;
  private int A = 2;
  private boolean B = true;
  private float C = 0.0F;
  private float D = 0.0F;
  private float E = 0.0F;
  private float F = 0.0F;
  private zbvw G = null;
  private zbfm H = null;
  private zade I;
  private zaqc J = null;
  private String K = "";
  private ArrayList L = new ArrayList();
  private zo M = zo.a();
  private int N = 0;
  private List O = new ArrayList();
  private List P = new ArrayList();
  private String Q = "";
  private int R = 0;
  private boolean S;
  private boolean T;
  private zq U = new zq(0.0F, 0.0F, 0.0F, 0.0F);
  private int V;
  private int W;
  private int X;
  public int a = 1;
  public ArrayList b = new ArrayList();
  public zbnh c;
  public boolean d = false;
  public boolean e = false;
  public boolean f = false;
  public Chart g = null;
  public Shape h = null;
  public zo i = zo.a();
  public zo j = zo.a();
  zq k = new zq(0.0F, 0.0F, 0.0F, 0.0F);
  private zq Y;
  private boolean Z = false;
  public zadj l = null;
  private int aa;
  private int ab;
  private int ac;
  private int ad;
  private int ae;
  private float af;
  private float ag;
  private zr ah;
  private boolean ai = false;
  private boolean aj = false;
  
  public void a(zr paramzr, boolean paramBoolean)
    throws Exception
  {
    if (!this.Z) {
      V();
    }
    if (paramBoolean) {
      W();
    }
    switch (e())
    {
    case 0: 
      double d1 = this.h.H();
      if ((d1 > 0.0D) || (this.h.isFlippedHorizontally()) || (this.h.isFlippedVertically()))
      {
        zi localzi = zbix.a(this);
        paramzr.a(localzi);
      }
      for (int i1 = 0; i1 < this.b.size(); i1++)
      {
        zf localzf = paramzr.d();
        zbnh localzbnh = (zbnh)this.b.get(i1);
        if (localzbnh.e)
        {
          Chart localChart = localzbnh.g;
          localChart.n = at();
          localChart.o = U();
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
                  zq localzq1 = new zq(0.0F, 0.0F, localzj.i(), localzj.h());
                  zq localzq2 = localzbnh.l();
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
          localzbnh.a(paramzr, false);
        }
        paramzr.a(localzf);
      }
      break;
    case 6: 
      zbix.a(paramzr, this);
      break;
    case 1: 
      zbix.p(paramzr, this);
      break;
    case 2: 
      zbix.ax(paramzr, this);
      break;
    case 3: 
      zbix.c(paramzr, this);
      break;
    case 19: 
      zbix.e(paramzr, this);
      break;
    case 7: 
      zbix.f(paramzr, this);
      break;
    case 11: 
      zbix.g(paramzr, this);
      break;
    case 12: 
      zbix.h(paramzr, this);
      break;
    case 18: 
      zbix.i(paramzr, this);
      break;
    case 20: 
      zbix.j(paramzr, this);
      break;
    case 14: 
      zbix.d(paramzr, this);
      break;
    case 25: 
      zbix.k(paramzr, this);
      break;
    case 17: 
      zbix.l(paramzr, this);
      break;
    case 16: 
      zbix.m(paramzr, this);
      break;
    case 8: 
      zbix.n(paramzr, this);
      break;
    case 24: 
      zbix.o(paramzr, this);
      break;
    case 9: 
      zbix.r(paramzr, this);
      break;
    case 30: 
      switch (I())
      {
      case 20: 
        zbix.p(paramzr, this);
        break;
      case 32: 
        zbix.p(paramzr, this);
        break;
      case 61: 
        zbix.bA(paramzr, this);
        break;
      case 62: 
        zbix.bB(paramzr, this);
        break;
      case 13: 
        zbix.z(paramzr, this);
        break;
      case 66: 
        zbix.A(paramzr, this);
        break;
      case 69: 
        zbix.B(paramzr, this);
        break;
      case 67: 
        zbix.C(paramzr, this);
        break;
      case 68: 
        zbix.D(paramzr, this);
        break;
      case 70: 
        zbix.E(paramzr, this);
        break;
      case 76: 
        zbix.F(paramzr, this);
        break;
      case 109: 
        zbix.V(paramzr, this);
        break;
      case 121: 
        zbix.W(paramzr, this);
        break;
      case 125: 
        zbix.X(paramzr, this);
        break;
      case 111: 
        zbix.Y(paramzr, this);
        break;
      case 135: 
        zbix.Z(paramzr, this);
        break;
      case 133: 
        zbix.aa(paramzr, this);
        break;
      case 134: 
        zbix.ab(paramzr, this);
        break;
      case 114: 
        zbix.ac(paramzr, this);
        break;
      case 113: 
        zbix.ad(paramzr, this);
        break;
      case 132: 
        zbix.ae(paramzr, this);
        break;
      case 118: 
        zbix.af(paramzr, this);
        break;
      case 119: 
        zbix.ag(paramzr, this);
        break;
      case 128: 
        zbix.ah(paramzr, this);
        break;
      case 115: 
        zbix.ai(paramzr, this);
        break;
      case 177: 
        zbix.aj(paramzr, this);
        break;
      case 112: 
        zbix.ak(paramzr, this);
        break;
      case 122: 
        zbix.al(paramzr, this);
        break;
      case 131: 
        zbix.am(paramzr, this);
        break;
      case 126: 
        zbix.an(paramzr, this);
        break;
      case 130: 
        zbix.ao(paramzr, this);
        break;
      case 116: 
        zbix.ap(paramzr, this);
        break;
      case 123: 
        zbix.ar(paramzr, this);
        break;
      case 124: 
        zbix.aq(paramzr, this);
        break;
      case 110: 
        zbix.as(paramzr, this);
        break;
      case 176: 
        zbix.at(paramzr, this);
        break;
      case 127: 
        zbix.au(paramzr, this);
        break;
      case 117: 
        zbix.av(paramzr, this);
        break;
      case 120: 
        zbix.aw(paramzr, this);
        break;
      case 7: 
        zbix.ay(paramzr, this);
        break;
      case 8: 
        zbix.az(paramzr, this);
        break;
      case 4: 
        zbix.aA(paramzr, this);
        break;
      case 2: 
        zbix.aB(paramzr, this);
        break;
      case 10: 
        zbix.aC(paramzr, this);
        break;
      case 5: 
        zbix.aD(paramzr, this);
        break;
      case 6: 
        zbix.aE(paramzr, this);
        break;
      case 3: 
        zbix.aF(paramzr, this);
        break;
      case 9: 
        zbix.aG(paramzr, this);
        break;
      case 11: 
        zbix.aH(paramzr, this);
        break;
      case 56: 
        zbix.aI(paramzr, this);
        break;
      case 22: 
        zbix.aJ(paramzr, this);
        break;
      case 16: 
        zbix.aK(paramzr, this);
        break;
      case 84: 
        zbix.aL(paramzr, this);
        break;
      case 65: 
        zbix.aM(paramzr, this);
        break;
      case 96: 
        zbix.aN(paramzr, this);
        break;
      case 23: 
        zbix.aO(paramzr, this);
        break;
      case 73: 
        zbix.aP(paramzr, this);
        break;
      case 183: 
        zbix.aQ(paramzr, this);
        break;
      case 21: 
        zbix.aR(paramzr, this);
        break;
      case 91: 
        zbix.G(paramzr, this);
        break;
      case 71: 
        zbix.bk(paramzr, this);
        break;
      case 72: 
        zbix.bl(paramzr, this);
        break;
      case 187: 
        zbix.bm(paramzr, this);
        break;
      case 12: 
        zbix.bn(paramzr, this);
        break;
      case 58: 
        zbix.bo(paramzr, this);
        break;
      case 59: 
        zbix.bp(paramzr, this);
        break;
      case 92: 
        zbix.bq(paramzr, this);
        break;
      case 60: 
        zbix.br(paramzr, this);
        break;
      case 87: 
        zbix.aS(paramzr, this);
        break;
      case 88: 
        zbix.aT(paramzr, this);
        break;
      case 186: 
        zbix.aU(paramzr, this);
        break;
      case 19: 
        zbix.aV(paramzr, this);
        break;
      case 185: 
        zbix.aW(paramzr, this);
        break;
      case 54: 
        zbix.aX(paramzr, this);
        break;
      case 53: 
        zbix.aY(paramzr, this);
        break;
      case 89: 
        zbix.H(paramzr, this);
        break;
      case 90: 
        zbix.I(paramzr, this);
        break;
      case 94: 
        zbix.J(paramzr, this);
        break;
      case 15: 
        zbix.K(paramzr, this);
        break;
      case 55: 
        zbix.L(paramzr, this);
        break;
      case 93: 
        zbix.M(paramzr, this);
        break;
      case 202: 
        zbix.a(paramzr, this);
        break;
      case 1: 
        zbix.b(paramzr, this);
        break;
      case 78: 
        zbix.N(paramzr, this);
        break;
      case 77: 
        zbix.O(paramzr, this);
        break;
      case 79: 
        zbix.P(paramzr, this);
        break;
      case 80: 
        zbix.Q(paramzr, this);
        break;
      case 81: 
        zbix.R(paramzr, this);
        break;
      case 82: 
        zbix.S(paramzr, this);
        break;
      case 83: 
        zbix.T(paramzr, this);
        break;
      case 182: 
        zbix.U(paramzr, this);
        break;
      case 97: 
        zbix.bs(paramzr, this);
        break;
      case 98: 
        zbix.bt(paramzr, this);
        break;
      case 64: 
        zbix.bu(paramzr, this);
        break;
      case 188: 
        zbix.bv(paramzr, this);
        break;
      case 101: 
        zbix.bw(paramzr, this);
        break;
      case 33: 
        zbix.u(paramzr, this);
        break;
      case 34: 
        zbix.q(paramzr, this);
        break;
      case 35: 
        zbix.s(paramzr, this);
        break;
      case 36: 
        zbix.t(paramzr, this);
        break;
      case 38: 
        zbix.v(paramzr, this);
        break;
      case 37: 
        zbix.w(paramzr, this);
        break;
      case 39: 
        zbix.x(paramzr, this);
        break;
      case 40: 
        zbix.y(paramzr, this);
        break;
      case 95: 
        zbix.aZ(paramzr, this);
        break;
      case 184: 
        zbix.ba(paramzr, this);
        break;
      case 74: 
        zbix.bb(paramzr, this);
        break;
      case 102: 
        zbix.bc(paramzr, this);
        break;
      case 57: 
        zbix.bh(paramzr, this);
        break;
      case 180: 
        zbix.bz(paramzr, this);
        break;
      case 47: 
        zbix.bE(paramzr, this);
        break;
      case 48: 
        zbix.bF(paramzr, this);
        break;
      case 49: 
        zbix.bG(paramzr, this);
        break;
      case 181: 
        zbix.bH(paramzr, this);
        break;
      case 50: 
        zbix.bI(paramzr, this);
        break;
      case 51: 
        zbix.bJ(paramzr, this);
        break;
      case 52: 
        zbix.bK(paramzr, this);
        break;
      case 179: 
        zbix.bL(paramzr, this);
        break;
      case 44: 
        zbix.bM(paramzr, this);
        break;
      case 45: 
        zbix.bN(paramzr, this);
        break;
      case 46: 
        zbix.bO(paramzr, this);
        break;
      case 178: 
        zbix.bP(paramzr, this);
        break;
      case 41: 
        zbix.bQ(paramzr, this);
        break;
      case 42: 
        zbix.bR(paramzr, this);
        break;
      case 43: 
        zbix.bS(paramzr, this);
        break;
      case 136: 
      case 172: 
        zbix.bT(paramzr, this);
        break;
      case 0: 
        zbix.r(paramzr, this);
        break;
      case 63: 
        zbix.bC(paramzr, this);
        break;
      case 103: 
        zbix.bd(paramzr, this);
        break;
      case 105: 
        zbix.be(paramzr, this);
        break;
      case 104: 
        zbix.bf(paramzr, this);
        break;
      case 99: 
        zbix.bg(paramzr, this);
        break;
      case 85: 
        zbix.bi(paramzr, this);
        break;
      case 86: 
        zbix.bj(paramzr, this);
        break;
      case 107: 
        zbix.bx(paramzr, this);
        break;
      case 108: 
        zbix.by(paramzr, this);
        break;
      case 106: 
        zbix.bD(paramzr, this);
        break;
      case 14: 
      case 17: 
      case 18: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
      case 28: 
      case 29: 
      case 30: 
      case 31: 
      case 75: 
      case 100: 
      case 129: 
      case 137: 
      case 138: 
      case 139: 
      case 140: 
      case 141: 
      case 142: 
      case 143: 
      case 144: 
      case 145: 
      case 146: 
      case 147: 
      case 148: 
      case 149: 
      case 150: 
      case 151: 
      case 152: 
      case 153: 
      case 154: 
      case 155: 
      case 156: 
      case 157: 
      case 158: 
      case 159: 
      case 160: 
      case 161: 
      case 162: 
      case 163: 
      case 164: 
      case 165: 
      case 166: 
      case 167: 
      case 168: 
      case 169: 
      case 170: 
      case 171: 
      case 173: 
      case 174: 
      case 175: 
      case 189: 
      case 190: 
      case 191: 
      case 192: 
      case 193: 
      case 194: 
      case 195: 
      case 196: 
      case 197: 
      case 198: 
      case 199: 
      case 200: 
      case 201: 
      default: 
        if ((c() != null) && (c().a().size() > 0)) {
          zbix.r(paramzr, this);
        }
        break;
      }
      break;
    }
  }
  
  zbvw a()
  {
    return this.G;
  }
  
  void a(zbvw paramzbvw)
  {
    this.G = paramzbvw;
  }
  
  zbfm b()
  {
    return this.H;
  }
  
  void a(zbfm paramzbfm)
  {
    this.H = paramzbfm;
  }
  
  zade c()
  {
    return this.I;
  }
  
  void a(zade paramzade)
  {
    this.I = paramzade;
  }
  
  zaqc d()
  {
    return this.J;
  }
  
  void a(zaqc paramzaqc)
  {
    this.J = paramzaqc;
  }
  
  public zbnh(zboo paramzboo, int paramInt)
  {
    this.m = paramzboo;
    this.n = paramInt;
    this.t = new zxk(this);
    this.u = new zant(this);
  }
  
  public zbnh(int paramInt)
  {
    this(null, paramInt);
  }
  
  public int e()
  {
    return this.n;
  }
  
  public float f()
  {
    return this.o;
  }
  
  public void a(float paramFloat)
  {
    this.o = paramFloat;
  }
  
  public float g()
  {
    return this.p;
  }
  
  public void b(float paramFloat)
  {
    this.p = paramFloat;
  }
  
  public float h()
  {
    return this.q;
  }
  
  public void c(float paramFloat)
  {
    this.q = paramFloat;
  }
  
  public float i()
  {
    return this.r;
  }
  
  public void d(float paramFloat)
  {
    this.r = paramFloat;
  }
  
  public int j()
  {
    return this.s;
  }
  
  public void a(int paramInt)
  {
    if (paramInt < 0) {
      this.s = (360 + paramInt % 360);
    } else if (paramInt > 360) {
      this.s = (paramInt % 360);
    } else {
      this.s = paramInt;
    }
  }
  
  boolean k()
  {
    int i1 = j();
    return ((i1 >= 45) && (i1 < 135)) || ((i1 >= 225) && (i1 < 315));
  }
  
  public zq l()
  {
    return new zq(this.q, this.r, this.o, this.p);
  }
  
  public zxk m()
  {
    return this.t;
  }
  
  public zant n()
  {
    return this.u;
  }
  
  public zg o()
  {
    return this.v;
  }
  
  public void a(zg paramzg)
  {
    this.v = paramzg;
  }
  
  public Color p()
  {
    return this.w;
  }
  
  public void a(Color paramColor)
  {
    this.w = paramColor;
  }
  
  public int q()
  {
    return this.x;
  }
  
  public void b(int paramInt)
  {
    this.x = paramInt;
  }
  
  public int r()
  {
    return this.y;
  }
  
  public void c(int paramInt)
  {
    this.y = paramInt;
  }
  
  public int s()
  {
    return this.z;
  }
  
  public int t()
  {
    return this.A;
  }
  
  public void d(int paramInt)
  {
    this.A = paramInt;
  }
  
  public String u()
  {
    return this.K;
  }
  
  public void a(String paramString)
  {
    this.K = paramString;
  }
  
  public ArrayList v()
  {
    return this.L;
  }
  
  public int w()
  {
    return this.N;
  }
  
  public void e(int paramInt)
  {
    this.N = paramInt;
  }
  
  public List x()
  {
    return this.O;
  }
  
  public int y()
  {
    return this.R;
  }
  
  public List z()
  {
    return this.P;
  }
  
  public void a(List paramList)
  {
    this.P = paramList;
  }
  
  public String A()
  {
    return this.Q;
  }
  
  public void b(String paramString)
  {
    this.Q = paramString;
  }
  
  public int B()
  {
    return this.V;
  }
  
  public void f(int paramInt)
  {
    this.V = paramInt;
  }
  
  public int C()
  {
    return this.W;
  }
  
  public void g(int paramInt)
  {
    this.W = paramInt;
  }
  
  public int D()
  {
    return this.X;
  }
  
  public void h(int paramInt)
  {
    this.X = paramInt;
  }
  
  public boolean E()
  {
    return this.S;
  }
  
  public void a(boolean paramBoolean)
  {
    this.S = paramBoolean;
  }
  
  public boolean F()
  {
    return this.T;
  }
  
  public void b(boolean paramBoolean)
  {
    this.T = paramBoolean;
  }
  
  zq G()
  {
    if (!this.Z) {
      V();
    }
    return this.Y;
  }
  
  private void V()
  {
    this.Y = l();
    switch (e())
    {
    case 2: 
      this.Y = new zq(l().f(), l().g(), l().h(), l().i());
      if ((j() != 0) && (j() != 180) && (!at())) {
        this.Y = zbya.a(l(), j());
      }
      this.Y = a(this.Y);
      break;
    case 3: 
    case 6: 
    case 11: 
    case 12: 
      this.Y = a(this.Y);
      break;
    case 1: 
      this.Y = zbya.a(this);
      break;
    case 19: 
      float f1 = 0.0F;
      if ((u() != null) && (!"".equals(u()))) {
        f1 = 12.0F;
      }
      this.Y = new zq(l().f(), l().g(), l().h() + this.u.f(), l().i() + this.u.f());
      this.Y.a(0.5F, 0.5F);
      this.Y.b(this.Y.g() - f1 / 2.0F);
      this.Y.d(this.Y.i() + f1 / 2.0F);
      break;
    case 7: 
    case 18: 
    case 20: 
      this.Y = new zq(l().f(), l().g(), l().h() + this.u.f(), l().i() + this.u.f());
      this.Y.a(0.5F, 0.5F);
      break;
    case 8: 
    case 24: 
      this.Y = a(this.Y);
      break;
    case 0: 
      this.Y = new zq(l().f(), l().g(), l().h() + this.u.f(), l().i() + this.u.f());
      this.Y = a(this.Y);
      break;
    case 25: 
      this.Y = zbya.b(this, false);
      break;
    case 30: 
      switch (I())
      {
      case 32: 
        this.Y = zbya.a(this);
        break;
      case 33: 
      case 34: 
      case 35: 
      case 36: 
        if ((j() > 0) && (j() != 180)) {
          this.Y = zbya.c(this);
        } else {
          this.Y = zbya.b(this);
        }
        break;
      case 37: 
      case 38: 
      case 39: 
      case 40: 
        if ((j() > 0) && (j() != 180)) {
          this.Y = zbya.c(this);
        } else {
          this.Y = zbya.d(this);
        }
        break;
      case 61: 
      case 62: 
      case 63: 
        this.Y = zbya.a(this, false);
        break;
      case 66: 
      case 67: 
      case 68: 
        this.Y = new zq(l().f(), l().g(), l().h() + this.u.f(), l().i() + this.u.f());
        break;
      case 13: 
        this.Y = new zq(l().f(), l().g(), l().h(), l().i());
        if ((j() > 0) && (j() != 180)) {
          this.Y = zbya.a(l(), this.l, this.a, j());
        }
        this.Y.a(this.u.f() / 2.0F, this.u.f() / 2.0F);
        break;
      case 87: 
        this.Y = new zq(l().f(), l().g(), l().h(), l().i());
        if ((j() > 0) && (j() != 180)) {
          this.Y = zbya.a(l(), j());
        } else {
          this.Y.a(this.u.f(), this.u.f());
        }
        break;
      case 180: 
        this.Y = zbya.e(this);
        break;
      case 136: 
        this.Y = new zq(l().f(), l().g(), l().h(), l().i());
        if ((j() > 0) && (j() != 180)) {
          this.Y = zbya.a(l(), j());
        }
        break;
      default: 
        this.Y = new zq(l().f(), l().g(), l().h() + this.u.f(), l().i() + this.u.f());
        this.Y.a(this.u.f() / 2.0F, this.u.f() / 2.0F);
      }
      break;
    }
    this.Z = true;
  }
  
  private zq a(zq paramzq)
  {
    if (n().a()) {
      return paramzq;
    }
    zq localzq = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    if (this.u.f() <= 1.0F) {
      localzq.a(this.u.f(), this.u.f());
    } else {
      localzq.a(this.u.f() / 2.0F, this.u.f() / 2.0F);
    }
    return localzq;
  }
  
  private void W()
  {
    float f1 = h() - G().f();
    float f2 = i() - G().g();
    c(h() + f1);
    d(i() + f2);
    this.Y.a(this.Y.f() + f1);
    this.Y.b(this.Y.g() + f2);
  }
  
  public void H()
  {
    if (!this.Z) {
      X();
    }
  }
  
  public int I()
  {
    return this.aa;
  }
  
  public void i(int paramInt)
  {
    this.aa = paramInt;
  }
  
  int J()
  {
    return this.ab;
  }
  
  void j(int paramInt)
  {
    this.ab = paramInt;
  }
  
  int K()
  {
    return this.ac;
  }
  
  void k(int paramInt)
  {
    this.ac = paramInt;
  }
  
  int L()
  {
    return this.ad;
  }
  
  void l(int paramInt)
  {
    this.ad = paramInt;
  }
  
  int M()
  {
    return this.ae;
  }
  
  void m(int paramInt)
  {
    this.ae = paramInt;
  }
  
  int N()
  {
    return this.h.getLeft();
  }
  
  int O()
  {
    return this.h.getTop();
  }
  
  int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return this.h.d(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return this.h.c(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  float P()
  {
    return this.af;
  }
  
  void e(float paramFloat)
  {
    this.af = paramFloat;
  }
  
  float Q()
  {
    return this.ag;
  }
  
  void f(float paramFloat)
  {
    this.ag = paramFloat;
  }
  
  public zr R()
  {
    return this.ah;
  }
  
  public void a(zr paramzr)
  {
    this.ah = paramzr;
  }
  
  public void aq()
    throws Exception
  {
    if (!S()) {
      return;
    }
    a(R(), true);
  }
  
  boolean S()
  {
    return (I() == 20) || (I() == 32) || ((G().h() > 0.0F) && (G().i() > 0.0F));
  }
  
  zq T()
  {
    if (!this.Z) {
      X();
    }
    return this.k;
  }
  
  private void X()
  {
    this.k = l();
    switch (e())
    {
    case 2: 
      this.k = a(this.k);
      break;
    case 3: 
    case 6: 
    case 11: 
    case 12: 
      this.k = a(this.k);
      break;
    case 1: 
      this.k = zbya.a(this);
      break;
    case 19: 
      float f1 = 0.0F;
      if ((u() != null) && (!"".equals(u()))) {
        f1 = 12.0F;
      }
      this.k = new zq(l().f(), l().g(), l().h() + this.u.f(), l().i() + this.u.f());
      this.k.a(0.5F, 0.5F);
      this.k.b(this.k.g() - f1 / 2.0F);
      this.k.d(this.k.i() + f1 / 2.0F);
      break;
    case 7: 
    case 18: 
    case 20: 
      this.k = new zq(l().f(), l().g(), l().h() + this.u.f(), l().i() + this.u.f());
      this.k.a(0.5F, 0.5F);
      break;
    case 8: 
    case 24: 
      this.k = a(this.k);
      break;
    case 0: 
      this.k = new zq(l().f(), l().g(), l().h() + this.u.f(), l().i() + this.u.f());
      this.k.a(this.u.f() / 2.0F, this.u.f() / 2.0F);
      break;
    case 25: 
      this.k = zbya.b(this, true);
      break;
    case 30: 
      switch (I())
      {
      case 32: 
        this.k = zbya.a(this);
        break;
      case 33: 
      case 34: 
      case 35: 
      case 36: 
        if ((j() > 0) && (j() != 180)) {
          this.k = zbya.c(this);
        } else {
          this.k = zbya.b(this);
        }
        break;
      case 37: 
      case 38: 
      case 39: 
      case 40: 
        if ((j() > 0) && (j() != 180)) {
          this.k = zbya.c(this);
        } else {
          this.k = zbya.d(this);
        }
        break;
      case 61: 
      case 62: 
      case 63: 
        this.k = zbya.a(this, true);
        break;
      case 66: 
      case 67: 
      case 68: 
        this.k = new zq(l().f(), l().g(), l().h() + this.u.f(), l().i() + this.u.f());
        break;
      case 13: 
        this.k = new zq(l().f(), l().g(), l().h(), l().i());
        if ((j() > 0) && (j() != 180)) {
          this.k = zbya.a(l(), this.l, this.a, j());
        }
        this.k.a(this.u.f() / 2.0F, this.u.f() / 2.0F);
        break;
      case 87: 
        this.k = new zq(l().f(), l().g(), l().h(), l().i());
        if ((j() > 0) && (j() != 180)) {
          this.k = zbya.a(l(), j());
        } else {
          this.k.a(this.u.f(), this.u.f());
        }
        break;
      case 180: 
        this.k = zbya.e(this);
        break;
      case 136: 
        this.k = new zq(l().f(), l().g(), l().h(), l().i());
        if ((j() > 0) && (j() != 180)) {
          this.k = zbya.a(l(), j());
        }
        break;
      default: 
        this.k = new zq(l().f(), l().g(), l().h() + this.u.f(), l().i() + this.u.f());
        this.k = a(this.k);
      }
      break;
    }
    this.Z = true;
  }
  
  public boolean at()
  {
    return this.ai;
  }
  
  public void j(boolean paramBoolean)
  {
    this.ai = paramBoolean;
  }
  
  public boolean U()
  {
    return this.aj;
  }
  
  public void k(boolean paramBoolean)
  {
    this.aj = paramBoolean;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbnh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */