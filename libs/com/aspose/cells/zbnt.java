package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zh;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zv;

class zbnt
  extends zco
{
  zbnt(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    zr localzr = this.a;
    zf localzf = localzr.d();
    localzr.a(4, true);
    zbfm localzbfm = this.e.b();
    zbvw localzbvw = this.e.a();
    int i = 0;
    if (localzbvw.c()) {
      i = 2;
    }
    int j = (int)(255.0D * localzbfm.b());
    int k = (int)(localzbfm.c() - localzbfm.e());
    int m = this.e.m().c().c();
    zauo localzauo = new zauo();
    Color localColor = this.e.n().c();
    if (this.e.n().f() == 0.0F) {
      localColor = Color.a(0, localColor);
    }
    localzauo.a(this.e.m().b(), localColor, (int)this.e.n().f());
    if (localzbfm.f())
    {
      localzauo.a(true);
      localzauo.a();
      localzauo.a(Color.fromArgb(j, localzbfm.a().getR() & 0xFF, localzbfm.a().getG() & 0xFF, localzbfm.a().getB() & 0xFF), k, new zn((int)localzbfm.c(), (int)localzbfm.d()));
    }
    else
    {
      localzauo.a(false);
    }
    zg localzg = new zg(localzbvw.b(), localzbvw.d());
    zh localzh = new zh(localzg.g());
    zv localzv = new zv();
    float f1 = 0.0F;
    float f2 = 0.0F;
    float[] arrayOfFloat1 = { f1 };
    float[] arrayOfFloat2 = { f2 };
    boolean bool = localzauo.a(localzr, localzh, i, localzbvw.d() + 12, localzbvw.a(), new zn(0, 0), localzv, arrayOfFloat1, arrayOfFloat2);
    f1 = arrayOfFloat1[0];
    f2 = arrayOfFloat2[0];
    if (bool)
    {
      float f3 = this.e.f() / f1;
      float f4 = this.e.g() / f2;
      zi localzi = new zi();
      localzi.a(f3, f4, 0);
      localzr.a(localzi, 0);
      zq localzq = new zq(0.0F, 0.0F, f1, f2);
      ze localze = new ze();
      localze.b(localzq);
      zc localzc = zbya.a(this.e.m(), localze);
      localzauo.a(localzc, localColor, (int)this.e.n().f());
      localzauo.a(localzr, localzh, i, localzbvw.d() + 12, localzbvw.a(), new zn((int)(this.e.l().f() / f3), (int)(this.e.l().g() / f4)), localzv);
    }
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbnt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */