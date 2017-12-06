package com.aspose.cells;

import com.aspose.cells.a.e.zh;
import java.util.ArrayList;

class zby
{
  private zrg b;
  private WorksheetCollection c;
  private Chart d;
  private zkr e;
  boolean a;
  private boolean f = false;
  
  zby(WorksheetCollection paramWorksheetCollection, int paramInt, Chart paramChart, zkr paramzkr, zrg paramzrg)
  {
    this.d = paramChart;
    this.e = paramzkr;
    this.b = paramzrg;
    this.c = paramWorksheetCollection;
  }
  
  void a()
    throws Exception
  {
    d();
    if (c()) {
      e();
    }
  }
  
  private void a(Area paramArea)
    throws Exception
  {
    if (paramArea == null) {
      return;
    }
    zbc localzbc = new zbc(this.c.o());
    localzbc.a(paramArea);
    localzbc.a(this.b);
    a(paramArea, localzbc.b());
  }
  
  private void a(Area paramArea, boolean paramBoolean)
    throws Exception
  {
    if (paramArea == null) {
      return;
    }
    if ((paramArea.b()) || (paramBoolean))
    {
      zadb localzadb = new zadb();
      localzadb.a(paramArea.getFillFormat());
      localzadb.a(this.b);
      PicFormatOption localPicFormatOption = null;
      if (paramArea.getFillFormat().getFillType() == 4) {
        localPicFormatOption = paramArea.getFillFormat().getTextureFill().d();
      }
      if (localPicFormatOption != null)
      {
        this.b.a(4147);
        zaup localzaup = new zaup(localPicFormatOption);
        localzaup.a(this.b);
        this.b.a(4148);
      }
    }
  }
  
  private void d()
    throws Exception
  {
    f();
    b(0);
    this.b.a(4147);
    zaxo localzaxo = new zaxo(false);
    localzaxo.a(this.d.getPlotArea());
    localzaxo.a(this.b);
    int i = this.d.getType();
    if (this.d.i.getCount() != 0) {
      i = this.d.i.a(false).j();
    }
    if (ChartCollection.d(i))
    {
      if (ChartCollection.l(i)) {
        a(this.d.getCategoryAxis(), (byte)0, i, false);
      } else {
        a(this.d.getCategoryAxis(), i, false);
      }
      a(this.d.getValueAxis(), (byte)1, i, false);
      if (ChartCollection.f(i)) {
        c(this.d.s(), i);
      }
    }
    b(this.d.getCategoryAxis());
    b(this.d.getValueAxis());
    if ((ChartCollection.f(i)) && (this.d.s() != null) && (this.d.s().n() != null)) {
      b(this.d.getSeriesAxis());
    }
    if ((this.d.getPlotArea().getArea().getFormatting() != 1) || (this.d.getPlotArea().getBorder().isVisible()))
    {
      this.b.a(4149);
      a(this.d.getPlotArea(), false);
    }
    for (int j = 0; j < this.d.i.getCount(); j++) {
      if (!this.d.i.a(j).m()) {
        a(this.d.i.a(j), (j == 0) && (!g()));
      }
    }
    if (this.a)
    {
      zbax localzbax = new zbax();
      localzbax.a(0, 0, 0, 0);
      localzbax.a(this.b);
      this.a = false;
    }
    this.b.a(4148);
  }
  
  private void e()
    throws Exception
  {
    b(1);
    this.b.a(4147);
    zaxo localzaxo = new zaxo(false);
    localzaxo.a(this.b);
    int i = this.d.getType();
    zka localzka = this.d.i.a(true);
    if (localzka != null) {
      i = localzka.j();
    }
    if (ChartCollection.d(i))
    {
      if (ChartCollection.l(i)) {
        a(this.d.getSecondCategoryAxis(), (byte)0, i, true);
      } else {
        a(this.d.getSecondCategoryAxis(), i, true);
      }
      a(this.d.getSecondValueAxis(), (byte)1, i, true);
    }
    b(this.d.getSecondCategoryAxis());
    b(this.d.getSecondValueAxis());
    for (int j = 0; j < this.d.i.getCount(); j++) {
      if (this.d.i.a(j).m()) {
        a(this.d.i.a(j), (j == 0) && (g()));
      }
    }
    if (this.a)
    {
      zbax localzbax = new zbax();
      localzbax.a(0, 0, 0, 0);
      localzbax.a(this.b);
      this.a = false;
    }
    this.b.a(4148);
  }
  
  void a(Axis paramAxis, int paramInt, boolean paramBoolean)
    throws Exception
  {
    zbx localzbx = new zbx((byte)0);
    localzbx.a(this.b);
    this.b.a(4147);
    a(0, paramAxis, paramInt);
    zbr localzbr = new zbr(paramAxis);
    localzbr.a(this.b);
    localzbr = null;
    h(paramAxis);
    a(paramAxis, paramInt);
    f(paramAxis);
    a(paramAxis);
    c(paramAxis);
    d(paramAxis);
    if (!paramBoolean) {
      a(paramInt);
    }
    a(paramAxis, false);
    if (paramAxis.a != null) {
      for (int i = 0; i < paramAxis.a.size(); i++)
      {
        zof localzof = new zof();
        localzof.a((byte[])paramAxis.a.get(i));
        localzof.a(this.b);
      }
    }
    if (this.f)
    {
      zbax localzbax = new zbax();
      localzbax.a(4, 0, 0, 0);
      localzbax.a(this.b);
      this.f = false;
    }
    this.b.a(4148);
  }
  
  private void a(Axis paramAxis, byte paramByte, int paramInt, boolean paramBoolean)
    throws Exception
  {
    zbx localzbx = new zbx(paramByte);
    localzbx.a(this.b);
    this.b.a(4147);
    zbyj localzbyj = new zbyj();
    localzbyj.a(paramAxis);
    localzbyj.a(this.b);
    e(paramAxis);
    h(paramAxis);
    b(paramAxis, paramInt);
    f(paramAxis);
    a(paramAxis);
    c(paramAxis);
    d(paramAxis);
    if ((!paramBoolean) && (ChartCollection.b(paramInt))) {
      b();
    }
    a(paramAxis, true);
    if (this.f)
    {
      zbax localzbax = new zbax();
      localzbax.a(4, 0, 0, 0);
      localzbax.a(this.b);
      this.f = false;
    }
    this.b.a(4148);
  }
  
  private void a(Axis paramAxis, boolean paramBoolean)
    throws Exception
  {
    if (((paramAxis.b != null) && (paramAxis.b.size() > 0)) || (paramAxis.c != null))
    {
      if (!this.a)
      {
        zbaw localzbaw = new zbaw();
        localzbaw.a(0, 0, 0, 0);
        localzbaw.a(this.b);
        this.a = true;
      }
      int i;
      Object localObject;
      if (!this.f)
      {
        i = paramBoolean ? 1 : 0;
        localObject = new zbaw();
        ((zbaw)localObject).a(4, 0, i, 0);
        ((zbaw)localObject).a(this.b);
        this.f = true;
      }
      if ((paramAxis.b != null) && (paramAxis.b.size() > 0)) {
        for (i = 0; i < paramAxis.b.size(); i++)
        {
          localObject = new zbmf();
          ((zbmf)localObject).a((byte[])paramAxis.b.get(i));
          ((zbmf)localObject).a(this.b);
        }
      }
      if (paramAxis.c != null)
      {
        zbwd localzbwd = new zbwd();
        localzbwd.a(paramAxis.c);
        localzbwd.a(this.b);
      }
    }
  }
  
  private void c(Axis paramAxis, int paramInt)
    throws Exception
  {
    zbx localzbx = new zbx((byte)2);
    localzbx.a(this.b);
    this.b.a(4147);
    a(2, paramAxis, paramInt);
    h(paramAxis);
    zbww localzbww = new zbww();
    if (paramAxis != null) {
      localzbww.a(paramAxis);
    }
    localzbww.a(this.b);
    f(paramAxis);
    a(paramAxis);
    c(paramAxis);
    d(paramAxis);
    this.b.a(4148);
  }
  
  void a(int paramInt)
    throws Exception
  {
    if ((!ChartCollection.b(paramInt)) || (this.d.x() == null)) {
      return;
    }
    Walls localWalls = this.d.getWalls();
    zbw localzbw = new zbw((byte)3);
    localzbw.a(this.b);
    zans localzans = new zans(this.c.o());
    localzans.a(localWalls.getBorder(), false);
    localzans.a(this.b);
    a(localWalls);
  }
  
  void b()
    throws Exception
  {
    if (this.d.w() == null) {
      return;
    }
    Floor localFloor = this.d.getFloor();
    zbw localzbw = new zbw((byte)3);
    localzbw.a(this.b);
    zans localzans = new zans(this.c.o());
    localzans.a(localFloor.getBorder(), false);
    localzans.a(this.b);
    a(localFloor);
  }
  
  void a(Axis paramAxis)
    throws Exception
  {
    if (paramAxis == null) {
      return;
    }
    if (!paramAxis.isVisible())
    {
      localzbw = new zbw((byte)0);
      localzbw.a(this.b);
      localzans = new zans(this.c.o());
      localzans.a();
      localzans.a(this.b);
      return;
    }
    if (paramAxis.i() == null) {
      return;
    }
    zbw localzbw = new zbw((byte)0);
    localzbw.a(this.b);
    zans localzans = new zans(this.c.o());
    localzans.a(paramAxis.getAxisLine(), true);
    localzans.a(this.b);
  }
  
  private void a(Font paramFont, int paramInt1, int paramInt2, ArrayList paramArrayList)
    throws Exception
  {
    if ((paramFont == null) && (paramInt1 == -1)) {
      return;
    }
    if (paramFont != null) {
      paramInt1 = paramFont.m();
    }
    Object localObject;
    if (paramArrayList != null)
    {
      localObject = new zd();
      int i = ((zd)localObject).a(paramInt2, paramInt1, paramArrayList);
      zzs localzzs;
      if (i == -1)
      {
        localzzs = new zzs(paramInt1);
        localzzs.a(this.b);
        ((zd)localObject).a(this.b);
      }
      else
      {
        localzzs = new zzs(i);
        localzzs.a(this.b);
      }
    }
    else
    {
      localObject = new zzs(paramInt1);
      ((zzs)localObject).a(this.b);
    }
  }
  
  void b(Axis paramAxis)
    throws Exception
  {
    Title localTitle = paramAxis.n();
    if (localTitle == null) {
      return;
    }
    int i = (localTitle.getText() != null) && (!"".equals(localTitle.getText())) ? 1 : 0;
    if ((i == 0) && (!localTitle.isAutoText())) {
      return;
    }
    zbwe localzbwe = new zbwe();
    localzbwe.a(localTitle);
    localzbwe.a(this.b);
    this.b.a(4147);
    if ((localTitle.z() != 0) || (localTitle.A() != 0) || (((localTitle.getX() != 0) || (localTitle.getY() != 0)) && ((localTitle.d()) || (localTitle.e())) && (localTitle.k != null) && ((localTitle.k instanceof Axis))))
    {
      localObject1 = new zaxo(false);
      ((zaxo)localObject1).a(localTitle);
      ((zaxo)localObject1).a(this.b);
    }
    a(localTitle.j(), localTitle.l(), i != 0 ? localTitle.getText().length() : 0, localTitle.E());
    Object localObject1 = new zc();
    ((zc)localObject1).a();
    ((zc)localObject1).a(this.b);
    if (i != 0)
    {
      localObject2 = new zbfk(localTitle.getText());
      ((zbfk)localObject2).a(this.b);
    }
    if (localTitle.J()) {
      a(localTitle, true);
    }
    Object localObject2 = new zaud();
    switch (paramAxis.b())
    {
    case 0: 
      ((zaud)localObject2).a((byte)3);
      break;
    case 1: 
      ((zaud)localObject2).a((byte)2);
      break;
    case 2: 
      ((zaud)localObject2).a((byte)7);
    }
    ((zaud)localObject2).a(this.b);
    this.b.a(4148);
  }
  
  private void a(int paramInt1, Axis paramAxis, int paramInt2)
    throws Exception
  {
    zgq localzgq = new zgq();
    switch (paramInt2)
    {
    case 69: 
    case 70: 
    case 71: 
    case 72: 
      localzgq.a(paramInt1);
    }
    if (paramAxis != null) {
      localzgq.a(paramAxis);
    }
    localzgq.a(this.b);
  }
  
  boolean c()
  {
    if (this.d.getNSeries().getCount() <= 1) {
      return false;
    }
    if (this.d.i.b()) {
      return true;
    }
    if (this.d.getSecondValueAxis().isVisible())
    {
      this.d.getNSeries().get(0).setPlotOnSecondAxis(true);
      return true;
    }
    return false;
  }
  
  private void f()
    throws Exception
  {
    this.b.c(4166);
    this.b.c(2);
    if (c()) {
      this.b.c(2);
    } else {
      this.b.c(1);
    }
  }
  
  private void b(int paramInt)
    throws Exception
  {
    this.b.c(4161);
    this.b.c(18);
    this.b.a((short)paramInt);
    if (this.d.getPlotArea().getInnerWidth() + this.d.getPlotArea().getInnerHeight() == 0)
    {
      this.d.a(false, false);
      this.d.getPlotArea().e(false);
      this.d.getPlotArea().f(false);
      this.d.getPlotArea().g(false);
      this.d.getPlotArea().h(false);
      this.d.getPlotArea().setInnerMode(false);
      if (this.d.M() != null)
      {
        long l = this.b.b();
        this.b.b(this.d.M().a);
        this.d.M().a(this.d);
        this.d.M().a(this.b);
        this.b.b(l);
        this.d.a(null);
      }
    }
    this.b.a(this.d.getPlotArea().getInnerX());
    this.b.a(this.d.getPlotArea().getInnerY());
    this.b.a(this.d.getPlotArea().getInnerWidth());
    this.b.a(this.d.getPlotArea().getInnerHeight());
  }
  
  void c(Axis paramAxis)
    throws Exception
  {
    if (paramAxis == null) {
      return;
    }
    if ((paramAxis.o() == null) || (!paramAxis.getMajorGridLines().isVisible())) {
      return;
    }
    zbw localzbw = new zbw((byte)1);
    localzbw.a(this.b);
    zans localzans = new zans(this.c.o());
    localzans.a(paramAxis.getMajorGridLines(), false);
    localzans.a(this.b);
  }
  
  void d(Axis paramAxis)
    throws Exception
  {
    if (paramAxis == null) {
      return;
    }
    if ((paramAxis.p() == null) || (!paramAxis.getMinorGridLines().isVisible())) {
      return;
    }
    zbw localzbw = new zbw((byte)2);
    localzbw.a(this.b);
    zans localzans = new zans(this.c.o());
    localzans.a(paramAxis.getMinorGridLines(), false);
    localzans.a(this.b);
  }
  
  void e(Axis paramAxis)
    throws Exception
  {
    if (paramAxis.getDisplayUnit() == 0) {
      return;
    }
    zbaw localzbaw;
    if (!this.a)
    {
      localzbaw = new zbaw();
      localzbaw.a(0, 0, paramAxis.q() ? 0 : 1, 0);
      localzbaw.a(this.b);
      this.a = true;
    }
    if (!this.f)
    {
      localzbaw = new zbaw();
      localzbaw.a(4, 0, 0, 0);
      localzbaw.a(this.b);
      this.f = true;
    }
    zbtk localzbtk = new zbtk();
    localzbtk.a(paramAxis.isDisplayUnitLabelShown(), paramAxis.getDisplayUnit());
    localzbtk.a(this.b);
    DisplayUnitLabel localDisplayUnitLabel = paramAxis.m();
    if (localDisplayUnitLabel != null)
    {
      zbay localzbay = new zbay();
      localzbay.a(16);
      localzbay.a(this.b);
      zbav localzbav = new zbav();
      localzbav.a(paramAxis, localDisplayUnitLabel);
      localzbav.a(this.b);
      localzbav.a();
      localzbav.a(this.b);
      localzbav.a(localDisplayUnitLabel);
      localzbav.a(this.b);
      if (localzbav.a(localDisplayUnitLabel.j(), localDisplayUnitLabel.l())) {
        localzbav.a(this.b);
      }
      localzbav.a(localDisplayUnitLabel.G());
      localzbav.a(this.b);
      if ((localDisplayUnitLabel.getText() != null) && (localDisplayUnitLabel.getText().length() != 0))
      {
        localzbav.a(localDisplayUnitLabel.getText());
        localzbav.a(this.b);
      }
      if ((!localDisplayUnitLabel.u()) && (localDisplayUnitLabel.K()))
      {
        localzbav.a(localDisplayUnitLabel.p(), localDisplayUnitLabel);
        localzbav.a(this.b);
        localzbav.a();
        localzbav.a(this.b);
        localzbav.a(localDisplayUnitLabel.getBorder(), this.c.o());
        localzbav.a(this.b);
        localzbav.a(localDisplayUnitLabel.getArea(), this.c.o());
        localzbav.a(this.b);
        localzbav.a(localDisplayUnitLabel.getArea(), this.c.o(), this.b);
        localzbav.c();
        localzbav.a(this.b);
      }
      localzbav.b();
      localzbav.a(this.b);
      localzbav.c();
      localzbav.a(this.b);
      zbaz localzbaz = new zbaz();
      localzbaz.a(16);
      localzbaz.a(this.b);
    }
  }
  
  void a(Axis paramAxis, int paramInt)
    throws Exception
  {
    switch (paramInt)
    {
    case 12: 
    case 13: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
    case 69: 
    case 70: 
    case 71: 
    case 72: 
      zbww localzbww = new zbww();
      if (paramAxis.j()) {
        localzbww.a(paramAxis);
      }
      localzbww.a(this.b);
      break;
    default: 
      g(paramAxis);
    }
  }
  
  void b(Axis paramAxis, int paramInt)
    throws Exception
  {
    if (paramAxis.j())
    {
      zbww localzbww = new zbww();
      localzbww.a(paramAxis);
      localzbww.a(this.b);
    }
  }
  
  void f(Axis paramAxis)
    throws Exception
  {
    if ((paramAxis == null) || (paramAxis.k() == null)) {
      return;
    }
    a(paramAxis.k().a(), paramAxis.k().b(), 0, null);
  }
  
  void g(Axis paramAxis)
    throws Exception
  {
    TickLabels localTickLabels = paramAxis.k();
    this.f = false;
    int i = localTickLabels == null ? 100 : localTickLabels.getOffset();
    if ((i != 100) || ((paramAxis.getTickLabelSpacing() == 1) && (!paramAxis.l())))
    {
      this.f = true;
      localObject = new zbaw();
      if (!this.a)
      {
        ((zbaw)localObject).a(0, 0, paramAxis.q() ? 0 : 1, 0);
        ((zbaw)localObject).a(this.b);
        this.a = true;
      }
      ((zbaw)localObject).a(4, 0, 0, 0);
      ((zbaw)localObject).a(this.b);
      zgl localzgl = new zgl();
      localzgl.a(i, paramAxis.l());
      localzgl.a(this.b);
    }
    Object localObject = new zbww();
    ((zbww)localObject).a(paramAxis);
    ((zbww)localObject).a(this.b);
  }
  
  void a(Axis paramAxis1, Axis paramAxis2)
    throws Exception
  {
    int i = (paramAxis1.getDisplayUnit() == 0) || (!paramAxis1.isDisplayUnitLabelShown()) ? 1 : 0;
    int j = (paramAxis2.getDisplayUnit() == 0) || (!paramAxis2.isDisplayUnitLabelShown()) ? 1 : 0;
    if ((i != 0) && (j != 0)) {
      return;
    }
    int k = -1;
    int m = -1;
    if (i == 0) {
      if (paramAxis1.getDisplayUnitLabel().i() != null) {
        k = paramAxis1.getDisplayUnitLabel().getFont().m();
      } else {
        k = paramAxis1.getDisplayUnitLabel().l();
      }
    }
    if (j == 0) {
      if (paramAxis2.getDisplayUnitLabel().i() != null) {
        m = paramAxis2.getDisplayUnitLabel().getFont().m();
      } else {
        m = paramAxis2.getDisplayUnitLabel().l();
      }
    }
    zbbc localzbbc = new zbbc();
    localzbbc.a(k, m);
    localzbbc.a(this.b);
    zbay localzbay = new zbay();
    localzbay.a(17);
    localzbay.a(this.b);
    zbav localzbav = new zbav();
    if (k != -1)
    {
      localzbav.a(paramAxis1.getDisplayUnitLabel().getFont());
      localzbav.a(this.b);
      if (paramAxis1.getDisplayUnitLabel().getAutoScaleFont())
      {
        localzbav.a(paramAxis1.getDisplayUnitLabel().getFont().c());
        localzbav.a(this.b);
      }
    }
    if (m != -1)
    {
      localzbav.a(paramAxis2.getDisplayUnitLabel().getFont());
      localzbav.a(this.b);
      if (paramAxis2.getDisplayUnitLabel().getAutoScaleFont())
      {
        localzbav.a(paramAxis2.getDisplayUnitLabel().getFont().c());
        localzbav.a(this.b);
      }
    }
    zbaz localzbaz = new zbaz();
    localzbaz.a(17);
    localzbaz.a(this.b);
  }
  
  void h(Axis paramAxis)
    throws Exception
  {
    if ((paramAxis == null) || (paramAxis.k() == null)) {
      return;
    }
    TickLabels localTickLabels = paramAxis.k();
    if ((localTickLabels.getNumberFormat() != null) && (!"".equals(localTickLabels.getNumberFormat())))
    {
      int i = localTickLabels.d();
      this.b.c(4174);
      this.b.c(2);
      this.b.b(i);
    }
    else if ((localTickLabels.getNumber() != 0) || (!localTickLabels.a))
    {
      this.b.c(4174);
      this.b.c(2);
      this.b.b(localTickLabels.getNumber());
    }
  }
  
  private boolean g()
  {
    return this.d.i.a(0).m();
  }
  
  private void a(zka paramzka, boolean paramBoolean)
    throws Exception
  {
    int i = paramzka.j();
    zjw localzjw = new zjw();
    localzjw.a(paramzka.k());
    if (paramzka.y()) {
      localzjw.a();
    }
    localzjw.a(this.b);
    this.b.a(4147);
    zcl localzcl;
    zawl localzawl;
    Object localObject1;
    Object localObject2;
    switch (i)
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
      localzcl = new zcl(paramzka.B(), paramzka.z());
      localzcl.a(i, paramzka.L());
      localzcl.a(this.b);
      h();
      break;
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
      zany localzany = new zany();
      localzany.a(paramzka.j());
      localzany.a(this.b);
      h();
      break;
    case 45: 
    case 48: 
      localzawl = new zawl(paramzka);
      localzawl.a(this.b);
      h();
      break;
    case 46: 
    case 49: 
      localObject1 = new zdi(paramzka);
      ((zdi)localObject1).a(this.b);
      if ((paramzka.F() != null) && (paramzka.F().length > 0))
      {
        localObject2 = new zaxn(paramzka);
        ((zaxn)localObject2).a(this.b);
      }
      break;
    case 44: 
    case 47: 
      localzawl = new zawl(paramzka);
      localzawl.a(this.b);
      break;
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      localObject2 = new zbem(paramzka);
      ((zbem)localObject2).a(this.b);
      break;
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      zbe localzbe = new zbe();
      localzbe.a(i);
      localzbe.a(this.b);
      h();
      break;
    case 35: 
    case 36: 
      localzawl = new zawl(paramzka);
      localzawl.a(this.b);
      break;
    case 59: 
      zayj localzayj = new zayj(paramzka);
      localzayj.a(this.b);
      break;
    case 57: 
    case 58: 
      zaym localzaym = new zaym(paramzka);
      localzaym.a(this.b);
      break;
    case 69: 
    case 70: 
    case 71: 
    case 72: 
      zbtm localzbtm = new zbtm();
      localzbtm.a(i, paramzka);
      localzbtm.a(this.b);
      h();
      break;
    case 12: 
    case 13: 
      zbem localzbem = new zbem(paramzka);
      localzbem.a(this.b);
      break;
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
      localzcl = new zcl(paramzka.B(), this.d.getGapWidth());
      localzcl.a(i, paramzka.L());
      localzcl.a(this.b);
      h();
      break;
    case 65: 
    case 66: 
    case 67: 
    case 68: 
    default: 
      throw new CellsException(0, "Invalid chart type.");
    }
    if (this.d.getValueAxis().getDisplayUnit() != 0)
    {
      localObject1 = new zjv();
      ((zjv)localObject1).a();
      ((zjv)localObject1).a(this.b);
    }
    if ((this.d.getShowLegend()) && (paramBoolean)) {
      i();
    }
    if (paramzka.t()) {
      a(paramzka);
    }
    if ((paramzka.N()) && (ChartCollection.c(i))) {
      a((byte)3, paramzka.O());
    }
    if (paramzka.p()) {
      a((byte)2, paramzka.q());
    }
    if (paramzka.r()) {
      a((byte)0, paramzka.s());
    }
    if (paramzka.n()) {
      a((byte)1, paramzka.o());
    }
    switch (i)
    {
    case 13: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 47: 
    case 48: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
    case 57: 
    case 60: 
    case 61: 
    case 62: 
    case 64: 
      b(paramzka);
    }
    this.b.a(4148);
  }
  
  private void a(byte paramByte, Line paramLine)
    throws Exception
  {
    zkc localzkc = new zkc(paramByte);
    localzkc.a(this.b);
    zans localzans = new zans(this.c.o());
    localzans.a(paramLine, false);
    localzans.a(this.b);
  }
  
  private void h()
    throws Exception
  {
    if (!ChartCollection.b(this.d.getType())) {
      return;
    }
    zjc localzjc = new zjc();
    localzjc.a(this.d);
    localzjc.a(this.b);
  }
  
  private void a(zka paramzka)
    throws Exception
  {
    zsx localzsx = new zsx(paramzka.z());
    localzsx.a(this.b);
    this.b.a(4147);
    DropBars localDropBars = paramzka.w();
    zans localzans = new zans(this.c.o());
    if ((localDropBars != null) && (localDropBars.a() != null)) {
      localzans.a(localDropBars.getBorder(), false);
    }
    localzans.a(this.b);
    zbc localzbc = new zbc(this.c.o());
    if (localDropBars != null) {
      localzbc.a(localDropBars.getArea());
    }
    localzbc.a(this.b);
    if (localDropBars != null) {
      a(localDropBars.getArea(), localzbc.b());
    }
    this.b.a(4148);
    localzsx = new zsx(paramzka.z());
    localzsx.a(this.b);
    this.b.a(4147);
    localDropBars = paramzka.x();
    localzans = new zans(this.c.o());
    if (localDropBars != null) {
      localzans.a(localDropBars.getBorder(), false);
    }
    localzans.a(this.b);
    localzbc = new zbc(this.c.o());
    if (localDropBars != null) {
      localzbc.a(localDropBars.getArea());
    }
    localzbc.a(this.b);
    if (localDropBars != null) {
      a(localDropBars.getArea(), localzbc.b());
    }
    this.b.a(4148);
  }
  
  private void c(int paramInt)
    throws Exception
  {
    zcm localzcm = new zcm();
    localzcm.d(paramInt);
    localzcm.a(this.b);
  }
  
  private void b(zka paramzka)
    throws Exception
  {
    zqa localzqa = new zqa();
    localzqa.d(paramzka.j());
    localzqa.a(this.b);
    this.b.a(4147);
    c(paramzka.j());
    zpz localzpz = paramzka.d();
    if (localzpz == null)
    {
      this.b.a(4148);
      return;
    }
    Object localObject;
    if (localzpz.f() != null)
    {
      localObject = new zans(this.c.o());
      ((zans)localObject).a(localzpz.f(), false);
      ((zans)localObject).a(this.b);
    }
    if (localzpz.e() != null)
    {
      localObject = new zbc(this.c.o());
      ((zbc)localObject).a(localzpz.e());
      ((zbc)localObject).a(this.b);
    }
    if (localzpz.l() != null)
    {
      localObject = new zawi();
      ((zawi)localObject).a(localzpz.l());
      ((zawi)localObject).a(this.b);
    }
    if ((localzpz.m()) || (localzpz.o()))
    {
      localObject = new zbfb(localzpz.m(), false, localzpz.o());
      ((zbfb)localObject).a(this.b);
    }
    if (localzpz.j() != null)
    {
      localObject = new zaot(this.c.o());
      ((zaot)localObject).a(localzpz.j(), 0);
      ((zaot)localObject).a(this.b);
    }
    this.b.a(4148);
  }
  
  private boolean i()
    throws Exception
  {
    Legend localLegend = this.d.t();
    if (localLegend == null) {
      localLegend = this.d.getLegend();
    }
    zanc localzanc = new zanc();
    if (localLegend != null) {
      localzanc.a(this.d.t());
    }
    localzanc.a((byte)this.d.getLegend().getPosition());
    localzanc.a(this.b);
    this.b.a(4147);
    int[] arrayOfInt1 = null;
    if ((!this.d.t().m()) || (!this.d.t().p()))
    {
      localzaxo = new zaxo(true);
      arrayOfInt1 = localzaxo.a(this.d.getLegend());
      localzaxo.a(this.b);
    }
    zbwe localzbwe = new zbwe();
    int[] arrayOfInt2 = localzbwe.a(this.d.getLegend());
    localzbwe.a(this.b);
    this.b.a(4147);
    zaxo localzaxo = new zaxo(false);
    localzaxo.a(this.b);
    Font localFont = this.d.getLegend().j();
    a(localFont, this.d.getLegend().l(), 0, null);
    zc localzc = new zc();
    localzc.a();
    localzc.a(this.b);
    this.b.a(4148);
    boolean bool = false;
    int i = 0;
    int j = 0;
    zbaw localzbaw1;
    Object localObject2;
    if (!this.d.t().u())
    {
      zacl localzacl;
      if (localLegend.p()) {
        localzacl = new zacl((byte)3);
      } else {
        localzacl = new zacl((byte)2);
      }
      localzacl.a(localLegend);
      localzacl.a(this.b);
      this.b.a(4147);
      localObject1 = new zans(this.c.o());
      ((zans)localObject1).a(localLegend.getBorder(), false);
      ((zans)localObject1).a(this.b);
      a(localLegend.getArea());
      if (localLegend.b() != null)
      {
        if (!this.a)
        {
          localzbaw1 = new zbaw();
          localzbaw1.a(0, 0, 0, 0);
          localzbaw1.a(this.b);
          this.a = true;
        }
        localzbaw1 = new zbaw();
        localzbaw1.a(5, 0, 0, 0);
        localzbaw1.a(this.b);
        j = 1;
        zbaw localzbaw2 = new zbaw();
        localzbaw2.a(9, 1, 0, 0);
        localzbaw2.a(this.b);
        i = 1;
        localzbaw1 = new zbaw();
        localzbaw1.a(7, 0, 0, 0);
        localzbaw1.a(this.b);
        localObject2 = new zbmf();
        ((zbmf)localObject2).a((byte[])localLegend.b());
        ((zbmf)localObject2).a(this.b);
        zbax localzbax2 = new zbax();
        localzbax2.a(7, 0, 0, 0);
        localzbax2.a(this.b);
        bool = true;
      }
      this.b.a(4148);
    }
    int k = 0;
    Object localObject1 = this.d.getLegend();
    if ((((Legend)localObject1).a != null) || (((Legend)localObject1).c() != null) || (((Legend)localObject1).c != null)) {
      k = 1;
    }
    if (k != 0)
    {
      this.a = true;
      if (i == 0)
      {
        localzbaw1 = new zbaw();
        localzbaw1.a(9, 1, 0, 0);
        localzbaw1.a(this.b);
        i = 1;
        bool = true;
      }
      int i1;
      if (((Legend)localObject1).a != null)
      {
        int m = a((Legend)localObject1, arrayOfInt1);
        System.arraycopy(com.aspose.cells.b.a.zc.a(m), 0, ((Legend)localObject1).a, 12, 4);
        i1 = ((Legend)localObject1).a.length;
        localObject2 = new byte[i1 + 4];
        localObject2[0] = -99;
        localObject2[1] = 8;
        System.arraycopy(com.aspose.cells.b.a.zc.a(i1), 0, localObject2, 2, 2);
        System.arraycopy(((Legend)localObject1).a, 0, localObject2, 4, i1);
        this.b.a((byte[])localObject2);
      }
      if ((((Legend)localObject1).c() != null) && (localFont != null))
      {
        zh localzh = new zh();
        localzh.a(zkr.a(localFont, arrayOfInt2[0], arrayOfInt2[1], arrayOfInt2[2], arrayOfInt2[3], arrayOfInt2[4]));
        i1 = ((Legend)localObject1).c().length;
        localObject2 = new byte[i1 + 4];
        localObject2[0] = -91;
        localObject2[1] = 8;
        System.arraycopy(com.aspose.cells.b.a.zc.a(i1), 0, localObject2, 2, 2);
        System.arraycopy(((Legend)localObject1).c(), 0, localObject2, 4, i1);
        this.b.a((byte[])localObject2);
      }
      if (((Legend)localObject1).c != null)
      {
        int n = ((Legend)localObject1).c.length;
        byte[] arrayOfByte = new byte[n + 4];
        arrayOfByte[0] = -98;
        arrayOfByte[1] = 8;
        System.arraycopy(com.aspose.cells.b.a.zc.a(n), 0, arrayOfByte, 2, 2);
        System.arraycopy(((Legend)localObject1).c, 0, arrayOfByte, 4, n);
        this.b.a(arrayOfByte);
      }
    }
    zbax localzbax1;
    if (i != 0)
    {
      localzbax1 = new zbax();
      localzbax1.a(9, 0, 0, 0);
      localzbax1.a(this.b);
    }
    this.b.a(4148);
    if (j != 0)
    {
      localzbax1 = new zbax();
      localzbax1.a(5, 0, 0, 0);
      localzbax1.a(this.b);
    }
    return bool;
  }
  
  private int a(Legend paramLegend, int[] paramArrayOfInt)
  {
    int i = paramLegend.q() ^ paramLegend.r();
    if (paramArrayOfInt != null)
    {
      i ^= (int)(paramArrayOfInt[0] * zbxp.a() / 72.0F + 0.5D);
      i ^= (int)(paramArrayOfInt[1] * zbxp.a() / 72.0F + 0.5D);
    }
    i ^= (paramLegend.n() ? 0 : 1);
    i ^= (paramLegend.o() ? 0 : 1);
    i ^= (paramLegend.p() ? 0 : 1);
    return i;
  }
  
  void a(ChartFrame paramChartFrame, boolean paramBoolean)
    throws Exception
  {
    zacl localzacl;
    if (paramChartFrame.p()) {
      localzacl = new zacl((byte)3);
    } else {
      localzacl = new zacl((byte)2);
    }
    localzacl.a(paramChartFrame);
    localzacl.a(this.b);
    this.b.a(4147);
    zans localzans = new zans(this.c.o());
    localzans.a(paramChartFrame.getBorder(), paramBoolean);
    localzans.a(this.b);
    a(paramChartFrame.getArea());
    if (paramChartFrame.b() != null)
    {
      zbaw localzbaw = new zbaw();
      localzbaw.a(7, 1, 0, 0);
      localzbaw.a(this.b);
      zbmf localzbmf = new zbmf();
      localzbmf.a(paramChartFrame.b());
      localzbmf.a(this.b);
      zbax localzbax = new zbax();
      localzbax.a(7, 0, 0, 0);
      localzbax.a(this.b);
    }
    this.b.a(4148);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */