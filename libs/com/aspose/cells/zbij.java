package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zbij
  extends zcp
{
  zbij(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    zo[] arrayOfzo = new zo[28];
    arrayOfzo[0] = new zo(f1 + 0.0557F * f3, f2 + 0.3832F * f4);
    arrayOfzo[1] = new zo(f1 + 0.2516F * f3, f2 + 0.3641F * f4);
    arrayOfzo[2] = new zo(f1 + 0.2103F * f3, f2 + 0.1712F * f4);
    arrayOfzo[3] = new zo(f1 + 0.3979F * f3, f2 + 0.2962F * f4);
    arrayOfzo[4] = new zo(f1 + 0.4516F * f3, f2 + 0.0898F * f4);
    arrayOfzo[5] = new zo(f1 + 0.532F * f3, f2 + 0.2038F * f4);
    arrayOfzo[6] = new zo(f1 + 0.6866F * f3, f2 + 0.0F * f4);
    arrayOfzo[7] = new zo(f1 + 0.6742F * f3, f2 + 0.269F * f4);
    arrayOfzo[8] = new zo(f1 + 0.8351F * f3, f2 + 0.1495F * f4);
    arrayOfzo[9] = new zo(f1 + 0.7588F * f3, f2 + 0.3044F * f4);
    arrayOfzo[10] = new zo(f1 + 1.0F * f3, f2 + 0.3098F * f4);
    arrayOfzo[11] = new zo(f1 + 0.7876F * f3, f2 + 0.4375F * f4);
    arrayOfzo[12] = new zo(f1 + 0.8474F * f3, f2 + 0.5245F * f4);
    arrayOfzo[13] = new zo(f1 + 0.7588F * f3, f2 + 0.5734F * f4);
    arrayOfzo[14] = new zo(f1 + 0.8742F * f3, f2 + 0.7228F * f4);
    arrayOfzo[15] = new zo(f1 + 0.6784F * f3, f2 + 0.6658F * f4);
    arrayOfzo[16] = new zo(f1 + 0.6928F * f3, f2 + 0.8043F * f4);
    arrayOfzo[17] = new zo(f1 + 0.5649F * f3, f2 + 0.7391F * f4);
    arrayOfzo[18] = new zo(f1 + 0.5402F * f3, f2 + 0.875F * f4);
    arrayOfzo[19] = new zo(f1 + 0.4598F * f3, f2 + 0.8043F * f4);
    arrayOfzo[20] = new zo(f1 + 0.4062F * f3, f2 + 0.913F * f4);
    arrayOfzo[21] = new zo(f1 + 0.3505F * f3, f2 + 0.8397F * f4);
    arrayOfzo[22] = new zo(f1 + 0.2287F * f3, f2 + 1.0F * f4);
    arrayOfzo[23] = new zo(f1 + 0.2247F * f3, f2 + 0.8451F * f4);
    arrayOfzo[24] = new zo(f1 + 0.0619F * f3, f2 + 0.8261F * f4);
    arrayOfzo[25] = new zo(f1 + 0.1567F * f3, f2 + 0.712F * f4);
    arrayOfzo[26] = new zo(f1 + 0.0F * f3, f2 + 0.5978F * f4);
    arrayOfzo[27] = new zo(f1 + 0.1835F * f3, f2 + 0.538F * f4);
    ze localze = new ze();
    localze.b(arrayOfzo);
    return localze;
  }
  
  void a()
    throws Exception
  {
    zq localzq = new zq(this.e.W().f() + this.e.W().h() * 0.28F, this.e.W().g() + this.e.W().i() * 0.36F, this.e.W().h() * 0.37F, this.e.W().i() * 0.4F);
    if (!this.e.A().a()) {
      localzq.a(-(this.e.A().h() / 2.0F), -(this.e.A().h() / 2.0F));
    }
    float f = zbyb.a(this.e.B());
    if ((this.e.E() == 7) || (this.e.E() == 9)) {
      localzq.a(localzq.f() + f);
    } else if ((this.e.E() == 0) || (this.e.E() == 8)) {
      localzq.c(localzq.h() - f);
    }
    localzq.a(localzq.f() + (float)this.e.l().a());
    localzq.b(localzq.g() + (float)this.e.l().b());
    if (this.e.K().equals("\n")) {
      return;
    }
    zbyb.b(this.a, this.e, localzq, this.e.K(), this.e.H(), this.e.B(), this.e.C(), this.e.E(), this.e.F(), this.e.G());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbij.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */