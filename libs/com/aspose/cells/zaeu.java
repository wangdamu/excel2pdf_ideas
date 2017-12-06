package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zbj;
import com.aspose.cells.a.d.zf;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.a.d.zh;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;

class zaeu
  extends zaes
{
  private zqb d;
  private zf e;
  
  public zaeu(zqb paramzqb, zf paramzf)
    throws Exception
  {
    this.e = paramzf;
    this.d = paramzqb;
    zt localzt;
    if ("\n".equals(this.d.a))
    {
      this.d.a = "I";
      localzt = a(this.d);
      this.d.a = "";
      localzt.a(0.0F);
    }
    else
    {
      localzt = a(paramzqb);
    }
    this.a = localzt.c();
    this.b = localzt.b();
  }
  
  public void a(zb[] paramArrayOfzb, zo paramzo)
    throws Exception
  {
    float f1 = paramzo.d();
    float f2 = paramzo.e();
    a(paramArrayOfzb, this.d, new zo(f1, f2));
  }
  
  private zt a(zqb paramzqb)
    throws Exception
  {
    zbj localzbj = b(paramzqb);
    zh localzh = new zh(localzbj, Color.getBlack(), new zo(0.0F, 0.0F), paramzqb.a, paramzqb.b.isSuperscript(), paramzqb.b.isSubscript());
    this.c = localzh.d().h();
    zt localzt = new zt(localzbj.j().c(paramzqb.a, (float)paramzqb.b.getDoubleSize()), zgs.a(localzbj.a(), localzbj.b(), "|", localzbj.c()).c() * 0.75F);
    return localzt;
  }
  
  private void a(zb[] paramArrayOfzb, zqb paramzqb, zo paramzo)
    throws Exception
  {
    zbj localzbj = b(paramzqb);
    if (paramzqb.a.length() > 0)
    {
      Color localColor = Color.fromArgb(255, paramzqb.b.getColor().getR() & 0xFF, paramzqb.b.getColor().getG() & 0xFF, paramzqb.b.getColor().getB() & 0xFF);
      paramzqb.a = paramzqb.a.replace('\r', ' ');
      zh localzh = new zh(localzbj, localColor, new zo(paramzo.d(), paramzo.e()), paramzqb.a, paramzqb.b.isSuperscript(), paramzqb.b.isSubscript());
      localzh.c = paramzqb.b.getUnderline();
      paramArrayOfzb[0].a(localzh);
    }
  }
  
  private zbj b(zqb paramzqb)
    throws Exception
  {
    float f = Math.max(1.0F, (float)paramzqb.b.getDoubleSize());
    Color localColor = Color.a(255, paramzqb.b.getColor());
    int i = (paramzqb.b.isBold() ? 1 : 0) | (paramzqb.b.isItalic() ? 2 : 0) | (paramzqb.b.isStrikeout() ? 8 : 0) | (paramzqb.b.getUnderline() != 0 ? 4 : 0);
    zbj localzbj = zbj.a(paramzqb.b.getName(), f, i);
    return localzbj;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaeu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */