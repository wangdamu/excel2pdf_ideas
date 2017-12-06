package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zkw
  extends zcp
{
  zkw(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
    switch (this.e.c)
    {
    case 1: 
      break;
    case 2: 
      zi localzi1 = new zi(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, this.e.W().i());
      this.a.c();
      this.a.a(localzi1);
      break;
    case 3: 
      zi localzi2 = new zi(-1.0F, 0.0F, 0.0F, -1.0F, this.e.W().h(), this.e.W().i());
      this.a.c();
      this.a.a(localzi2);
      break;
    case 4: 
      zi localzi3 = new zi(-1.0F, 0.0F, 0.0F, 1.0F, this.e.W().h(), 0.0F);
      this.a.c();
      this.a.a(localzi3);
    }
  }
  
  void b()
    throws Exception
  {
    long l1 = 0L;
    long l2 = 0L;
    long l3 = 0L;
    long l4 = 0L;
    long l5 = 0L;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        l1 = com.aspose.cells.b.a.ze.c(this.e.n.a.get(0));
        l2 = com.aspose.cells.b.a.ze.c(this.e.n.a.get(1));
        l3 = com.aspose.cells.b.a.ze.c(this.e.n.a.get(2));
        l4 = com.aspose.cells.b.a.ze.c(this.e.n.a.get(3));
        l5 = com.aspose.cells.b.a.ze.c(this.e.n.a.get(4));
      }
      else
      {
        l1 = 12500L;
        l2 = 1142319L;
        l3 = 20457681L;
        l4 = 10800000L;
        l5 = 12500L;
      }
    }
    else
    {
      l1 = 12500L;
      l2 = 1142319L;
      l3 = 20457681L;
      l4 = 10800000L;
      l5 = 12500L;
    }
    zadg localzadg = new zadg(new zam[] { new zam("adj1", l1), new zam("adj2", l2), new zam("adj3", l3), new zam("adj4", l4), new zam("adj5", l5) }, new zadh[] { new zadh("a5", 11, 0L, 27273042316905L, 25000L, false), new zadh("maxAdj1", 0, -27273042329612L, 2L, 1L, false), new zadh("a1", 11, 0L, 27273042316901L, -27273042329613L, false), new zadh("enAng", 11, 1L, 27273042316903L, 21599999L, false), new zadh("stAng", 11, 0L, 27273042316904L, 21599999L, false), new zadh("th", 0, -27273042329604L, -27273042329614L, 100000L, false), new zadh("thh", 0, -27273042329604L, -27273042329612L, 100000L, false), new zadh("th2", 0, -27273042329617L, 1L, 2L, false), new zadh("rw1", 1, -27273042329804L, -27273042329619L, -27273042329618L, false), new zadh("rh1", 1, -27273042329805L, -27273042329619L, -27273042329618L, false), new zadh("rw2", 1, -27273042329620L, 0L, -27273042329617L, false), new zadh("rh2", 1, -27273042329621L, 0L, -27273042329617L, false), new zadh("rw3", 1, -27273042329622L, -27273042329619L, 0L, false), new zadh("rh3", 1, -27273042329623L, -27273042329619L, 0L, false), new zadh("wtH", 13, -27273042329624L, -27273042329615L, 0L, false), new zadh("htH", 7, -27273042329625L, -27273042329615L, 0L, false), new zadh("dxH", 6, -27273042329624L, -27273042329627L, -27273042329626L, false), new zadh("dyH", 12, -27273042329625L, -27273042329627L, -27273042329626L, false), new zadh("xH", 1, -27273042329606L, -27273042329628L, 0L, false), new zadh("yH", 1, -27273042329607L, -27273042329629L, 0L, false), new zadh("rI", 9, -27273042329622L, -27273042329623L, 0L, false), new zadh("u1", 0, -27273042329628L, -27273042329628L, 1L, false), new zadh("u2", 0, -27273042329629L, -27273042329629L, 1L, false), new zadh("u3", 0, -27273042329632L, -27273042329632L, 1L, false), new zadh("u4", 1, -27273042329633L, 0L, -27273042329635L, false), new zadh("u5", 1, -27273042329634L, 0L, -27273042329635L, false), new zadh("u6", 0, -27273042329636L, -27273042329637L, -27273042329633L, false), new zadh("u7", 0, -27273042329638L, 1L, -27273042329634L, false), new zadh("u8", 1, 1L, 0L, -27273042329639L, false), new zadh("u9", 14, -27273042329640L, 0L, 0L, false), new zadh("u10", 0, -27273042329636L, 1L, -27273042329628L, false), new zadh("u11", 0, -27273042329642L, 1L, -27273042329629L, false), new zadh("u12", 2, 1L, -27273042329641L, -27273042329643L, false), new zadh("u13", 5, 1L, -27273042329644L, 0L, false), new zadh("u14", 1, -27273042329645L, 21600000L, 0L, false), new zadh("u15", 3, -27273042329645L, -27273042329645L, -27273042329646L, false), new zadh("u16", 1, -27273042329647L, 0L, -27273042329615L, false), new zadh("u17", 1, -27273042329648L, 21600000L, 0L, false), new zadh("u18", 3, -27273042329648L, -27273042329648L, -27273042329649L, false), new zadh("u19", 1, -27273042329650L, 0L, -27273042329806L, false), new zadh("u20", 1, -27273042329650L, 0L, 21600000L, false), new zadh("u21", 3, -27273042329651L, -27273042329652L, -27273042329650L, false), new zadh("maxAng", 4, -27273042329653L, 0L, 0L, false), new zadh("aAng", 11, 0L, 27273042316902L, -27273042329654L, false), new zadh("ptAng", 1, -27273042329615L, -27273042329655L, 0L, false), new zadh("wtA", 13, -27273042329624L, -27273042329656L, 0L, false), new zadh("htA", 7, -27273042329625L, -27273042329656L, 0L, false), new zadh("dxA", 6, -27273042329624L, -27273042329658L, -27273042329657L, false), new zadh("dyA", 12, -27273042329625L, -27273042329658L, -27273042329657L, false), new zadh("xA", 1, -27273042329606L, -27273042329659L, 0L, false), new zadh("yA", 1, -27273042329607L, -27273042329660L, 0L, false), new zadh("wtE", 13, -27273042329620L, -27273042329616L, 0L, false), new zadh("htE", 7, -27273042329621L, -27273042329616L, 0L, false), new zadh("dxE", 6, -27273042329620L, -27273042329664L, -27273042329663L, false), new zadh("dyE", 12, -27273042329621L, -27273042329664L, -27273042329663L, false), new zadh("xE", 1, -27273042329606L, -27273042329665L, 0L, false), new zadh("yE", 1, -27273042329607L, -27273042329666L, 0L, false), new zadh("dxG", 7, -27273042329618L, -27273042329656L, 0L, false), new zadh("dyG", 13, -27273042329618L, -27273042329656L, 0L, false), new zadh("xG", 1, -27273042329630L, -27273042329669L, 0L, false), new zadh("yG", 1, -27273042329631L, -27273042329670L, 0L, false), new zadh("dxB", 7, -27273042329618L, -27273042329656L, 0L, false), new zadh("dyB", 13, -27273042329618L, -27273042329656L, 0L, false), new zadh("xB", 1, -27273042329630L, 0L, -27273042329673L, false), new zadh("yB", 1, -27273042329631L, 0L, -27273042329674L, false), new zadh("sx1", 1, -27273042329675L, 0L, -27273042329606L, false), new zadh("sy1", 1, -27273042329676L, 0L, -27273042329607L, false), new zadh("sx2", 1, -27273042329671L, 0L, -27273042329606L, false), new zadh("sy2", 1, -27273042329672L, 0L, -27273042329607L, false), new zadh("rO", 9, -27273042329620L, -27273042329621L, 0L, false), new zadh("x1O", 0, -27273042329677L, -27273042329681L, -27273042329620L, false), new zadh("y1O", 0, -27273042329678L, -27273042329681L, -27273042329621L, false), new zadh("x2O", 0, -27273042329679L, -27273042329681L, -27273042329620L, false), new zadh("y2O", 0, -27273042329680L, -27273042329681L, -27273042329621L, false), new zadh("dxO", 1, -27273042329684L, 0L, -27273042329682L, false), new zadh("dyO", 1, -27273042329685L, 0L, -27273042329683L, false), new zadh("dO", 10, -27273042329686L, -27273042329687L, 0L, false), new zadh("q1", 0, -27273042329682L, -27273042329685L, 1L, false), new zadh("q2", 0, -27273042329684L, -27273042329683L, 1L, false), new zadh("DO", 1, -27273042329689L, 0L, -27273042329690L, false), new zadh("q3", 0, -27273042329681L, -27273042329681L, 1L, false), new zadh("q4", 0, -27273042329688L, -27273042329688L, 1L, false), new zadh("q5", 0, -27273042329692L, -27273042329693L, 1L, false), new zadh("q6", 0, -27273042329691L, -27273042329691L, 1L, false), new zadh("q7", 1, -27273042329694L, 0L, -27273042329695L, false), new zadh("q8", 8, -27273042329696L, 0L, 0L, false), new zadh("sdelO", 14, -27273042329697L, 0L, 0L, false), new zadh("ndyO", 0, -27273042329687L, -1L, 1L, false), new zadh("sdyO", 3, -27273042329699L, -1L, 1L, false), new zadh("q9", 0, -27273042329700L, -27273042329686L, 1L, false), new zadh("q10", 0, -27273042329701L, -27273042329698L, 1L, false), new zadh("q11", 0, -27273042329691L, -27273042329687L, 1L, false), new zadh("dxF1", 2, -27273042329703L, -27273042329702L, -27273042329693L, false), new zadh("q12", 1, -27273042329703L, 0L, -27273042329702L, false), new zadh("dxF2", 0, -27273042329705L, 1L, -27273042329693L, false), new zadh("adyO", 4, -27273042329687L, 0L, 0L, false), new zadh("q13", 0, -27273042329707L, -27273042329698L, 1L, false), new zadh("q14", 0, -27273042329691L, -27273042329686L, -1L, false), new zadh("dyF1", 2, -27273042329709L, -27273042329708L, -27273042329693L, false), new zadh("q15", 1, -27273042329709L, 0L, -27273042329708L, false), new zadh("dyF2", 0, -27273042329711L, 1L, -27273042329693L, false), new zadh("q16", 1, -27273042329684L, 0L, -27273042329704L, false), new zadh("q17", 1, -27273042329684L, 0L, -27273042329706L, false), new zadh("q18", 1, -27273042329685L, 0L, -27273042329710L, false), new zadh("q19", 1, -27273042329685L, 0L, -27273042329712L, false), new zadh("q20", 10, -27273042329713L, -27273042329715L, 0L, false), new zadh("q21", 10, -27273042329714L, -27273042329716L, 0L, false), new zadh("q22", 1, -27273042329718L, 0L, -27273042329717L, false), new zadh("dxF", 3, -27273042329719L, -27273042329704L, -27273042329706L, false), new zadh("dyF", 3, -27273042329719L, -27273042329710L, -27273042329712L, false), new zadh("sdxF", 0, -27273042329720L, -27273042329620L, -27273042329681L, false), new zadh("sdyF", 0, -27273042329721L, -27273042329621L, -27273042329681L, false), new zadh("xF", 1, -27273042329606L, -27273042329722L, 0L, false), new zadh("yF", 1, -27273042329607L, -27273042329723L, 0L, false), new zadh("x1I", 0, -27273042329677L, -27273042329632L, -27273042329622L, false), new zadh("y1I", 0, -27273042329678L, -27273042329632L, -27273042329623L, false), new zadh("x2I", 0, -27273042329679L, -27273042329632L, -27273042329622L, false), new zadh("y2I", 0, -27273042329680L, -27273042329632L, -27273042329623L, false), new zadh("dxI", 1, -27273042329728L, 0L, -27273042329726L, false), new zadh("dyI", 1, -27273042329729L, 0L, -27273042329727L, false), new zadh("dI", 10, -27273042329730L, -27273042329731L, 0L, false), new zadh("v1", 0, -27273042329726L, -27273042329729L, 1L, false), new zadh("v2", 0, -27273042329728L, -27273042329727L, 1L, false), new zadh("DI", 1, -27273042329733L, 0L, -27273042329734L, false), new zadh("v3", 0, -27273042329632L, -27273042329632L, 1L, false), new zadh("v4", 0, -27273042329732L, -27273042329732L, 1L, false), new zadh("v5", 0, -27273042329736L, -27273042329737L, 1L, false), new zadh("v6", 0, -27273042329735L, -27273042329735L, 1L, false), new zadh("v7", 1, -27273042329738L, 0L, -27273042329739L, false), new zadh("v8", 8, -27273042329740L, 0L, 0L, false), new zadh("sdelI", 14, -27273042329741L, 0L, 0L, false), new zadh("v9", 0, -27273042329700L, -27273042329730L, 1L, false), new zadh("v10", 0, -27273042329743L, -27273042329742L, 1L, false), new zadh("v11", 0, -27273042329735L, -27273042329731L, 1L, false), new zadh("dxC1", 2, -27273042329745L, -27273042329744L, -27273042329737L, false), new zadh("v12", 1, -27273042329745L, 0L, -27273042329744L, false), new zadh("dxC2", 0, -27273042329747L, 1L, -27273042329737L, false), new zadh("adyI", 4, -27273042329731L, 0L, 0L, false), new zadh("v13", 0, -27273042329749L, -27273042329742L, 1L, false), new zadh("v14", 0, -27273042329735L, -27273042329730L, -1L, false), new zadh("dyC1", 2, -27273042329751L, -27273042329750L, -27273042329737L, false), new zadh("v15", 1, -27273042329751L, 0L, -27273042329750L, false), new zadh("dyC2", 0, -27273042329753L, 1L, -27273042329737L, false), new zadh("v16", 1, -27273042329726L, 0L, -27273042329746L, false), new zadh("v17", 1, -27273042329726L, 0L, -27273042329748L, false), new zadh("v18", 1, -27273042329727L, 0L, -27273042329752L, false), new zadh("v19", 1, -27273042329727L, 0L, -27273042329754L, false), new zadh("v20", 10, -27273042329755L, -27273042329757L, 0L, false), new zadh("v21", 10, -27273042329756L, -27273042329758L, 0L, false), new zadh("v22", 1, -27273042329760L, 0L, -27273042329759L, false), new zadh("dxC", 3, -27273042329761L, -27273042329746L, -27273042329748L, false), new zadh("dyC", 3, -27273042329761L, -27273042329752L, -27273042329754L, false), new zadh("sdxC", 0, -27273042329762L, -27273042329622L, -27273042329632L, false), new zadh("sdyC", 0, -27273042329763L, -27273042329623L, -27273042329632L, false), new zadh("xC", 1, -27273042329606L, -27273042329764L, 0L, false), new zadh("yC", 1, -27273042329607L, -27273042329765L, 0L, false), new zadh("ist0", 5, -27273042329764L, -27273042329765L, 0L, false), new zadh("ist1", 1, -27273042329768L, 21600000L, 0L, false), new zadh("istAng", 3, -27273042329768L, -27273042329768L, -27273042329769L, false), new zadh("isw1", 1, -27273042329616L, 0L, -27273042329770L, false), new zadh("isw2", 1, -27273042329771L, 0L, 21600000L, false), new zadh("iswAng", 3, -27273042329771L, -27273042329772L, -27273042329771L, false), new zadh("p1", 1, -27273042329724L, 0L, -27273042329766L, false), new zadh("p2", 1, -27273042329725L, 0L, -27273042329767L, false), new zadh("p3", 10, -27273042329774L, -27273042329775L, 0L, false), new zadh("p4", 0, -27273042329776L, 1L, 2L, false), new zadh("p5", 1, -27273042329777L, 0L, -27273042329618L, false), new zadh("xGp", 3, -27273042329778L, -27273042329724L, -27273042329671L, false), new zadh("yGp", 3, -27273042329778L, -27273042329725L, -27273042329672L, false), new zadh("xBp", 3, -27273042329778L, -27273042329766L, -27273042329675L, false), new zadh("yBp", 3, -27273042329778L, -27273042329767L, -27273042329676L, false), new zadh("en0", 5, -27273042329722L, -27273042329723L, 0L, false), new zadh("en1", 1, -27273042329783L, 21600000L, 0L, false), new zadh("en2", 3, -27273042329783L, -27273042329783L, -27273042329784L, false), new zadh("sw0", 1, -27273042329785L, 0L, -27273042329616L, false), new zadh("sw1", 1, -27273042329786L, 21600000L, 0L, false), new zadh("swAng", 3, -27273042329786L, -27273042329786L, -27273042329787L, false), new zadh("wtI", 13, -27273042329624L, -27273042329616L, 0L, false), new zadh("htI", 7, -27273042329625L, -27273042329616L, 0L, false), new zadh("dxIdub", 6, -27273042329624L, -27273042329790L, -27273042329789L, false), new zadh("dyIdub", 12, -27273042329625L, -27273042329790L, -27273042329789L, false), new zadh("xI", 1, -27273042329606L, -27273042329730L, 0L, false), new zadh("yI", 1, -27273042329607L, -27273042329731L, 0L, false), new zadh("aI", 1, -27273042329616L, 0L, -27273042329807L, false), new zadh("aA", 1, -27273042329656L, -27273042329807L, 0L, false), new zadh("aB", 1, -27273042329656L, -27273042329806L, 0L, false), new zadh("idx", 7, -27273042329620L, 2700000L, 0L, false), new zadh("idy", 13, -27273042329621L, 2700000L, 0L, false), new zadh("il", 1, -27273042329606L, 0L, -27273042329798L, false), new zadh("ir", 1, -27273042329606L, -27273042329798L, 0L, false), new zadh("it", 1, -27273042329607L, 0L, -27273042329799L, false), new zadh("ib", 1, -27273042329607L, -27273042329799L, 0L, false), new zadh("wd2", 0, -27273042329602L, 1L, 2L, true), new zadh("hd2", 0, -27273042329603L, 1L, 2L, true), new zadh("cd2", 0, -27273042329601L, 1L, 2L, true), new zadh("cd4", 0, -27273042329601L, 1L, 4L, true) }, new znk[] { new znk(-27273042329793L, -27273042329794L, -27273042329795L), new znk(-27273042329779L, -27273042329780L, -27273042329656L), new znk(-27273042329661L, -27273042329662L, -27273042329796L), new znk(-27273042329781L, -27273042329782L, -27273042329797L) }, new zal[] { new zal(true, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, 27273042316902L, 0L, -27273042329654L, -27273042329661L, -27273042329662L), new zal(true, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, 27273042316904L, 0L, 21599999L, -27273042329667L, -27273042329668L), new zal(true, 27273042316901L, 0L, -27273042329613L, 27273042316903L, 0L, 21599999L, -27273042329724L, -27273042329725L), new zal(true, 27273042316905L, 0L, 25000L, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, -27273042329675L, -27273042329676L) }, new zavr[] { new zavr(new byte[] { 1, 3, 2, 2, 2, 2, 3, 0 }, new long[] { -27273042329667L, -27273042329668L, -27273042329620L, -27273042329621L, -27273042329616L, -27273042329788L, -27273042329779L, -27273042329780L, -27273042329661L, -27273042329662L, -27273042329781L, -27273042329782L, -27273042329766L, -27273042329767L, -27273042329622L, -27273042329623L, -27273042329770L, -27273042329773L }, 0L, 0L, 1, true, true) }, new zan(-27273042329800L, -27273042329802L), new zan(-27273042329801L, -27273042329803L));
    localzadg.a(0);
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.y().h();
    float f4 = this.e.y().i();
    zq localzq = new zq(f1, f2, f3, f4);
    zf localzf = this.a.d();
    this.a.a(4, true);
    zs localzs = zbyb.a(this.e.A());
    Object localObject = null;
    com.aspose.cells.b.a.b.a.ze[] arrayOfze = localzadg.a(localzq.f(), localzq.g(), localzq.h(), localzq.i());
    int i = arrayOfze.length;
    if (i == 0) {
      return;
    }
    for (int j = 0; j < i; j++)
    {
      if (!this.e.z().a())
      {
        zc localzc = zbyb.a(this.e.z(), arrayOfze[j]);
        this.a.a(localzc, arrayOfze[j]);
      }
      if (!this.e.A().a()) {
        this.a.a(localzs, arrayOfze[j]);
      }
    }
    super.a();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zkw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */