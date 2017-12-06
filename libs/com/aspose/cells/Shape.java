package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zw;
import java.awt.RenderingHints;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Shape
{
  znn g;
  zqu h = null;
  String i = null;
  ShapeCollection j;
  zbqr k;
  zapt l;
  int m;
  Object n;
  String o = null;
  zsw p;
  private String a;
  ShapeFormat q;
  boolean r;
  private MsoFormatPicture b;
  boolean s;
  private zq c;
  boolean t = false;
  boolean u = false;
  boolean v = false;
  protected byte[] m_linkedCell;
  byte[] w;
  FontSettingCollection x;
  byte[] y = null;
  zqn z = null;
  private Geometry d;
  private short e;
  String A;
  boolean B;
  
  public String getMacroName()
  {
    if ((this.i == null) && (S() != null)) {
      return S().a(P());
    }
    return this.i;
  }
  
  public void setMacroName(String value)
  {
    this.i = value;
  }
  
  int v()
  {
    return this.k.j().c();
  }
  
  Shape(ShapeCollection shapes, int type, Object shapeParent)
  {
    this(shapes, type, 4095, shapeParent);
  }
  
  private boolean a(int paramInt)
  {
    return (paramInt == 8) || (paramInt == 24) || (paramInt == 12) || (paramInt == 11);
  }
  
  Shape(ShapeCollection shapes, int msoDrawingType, int type, Object shapeParent)
  {
    this.j = shapes;
    if (((msoDrawingType == 29) || (msoDrawingType == 30)) && (type != 4095)) {
      msoDrawingType = ShapeCollection.a(type);
    }
    this.l = new zapt(msoDrawingType);
    this.k = new zbqr(this, this.j.d());
    this.n = shapeParent;
    this.m = 0;
    b(type);
  }
  
  public void toFrontOrBack(int orders)
  {
    if (orders == 0) {
      return;
    }
    int i1 = w();
    Shape localShape = this.j.get(i1);
    int i2 = i1 + orders;
    if ((i2 < this.j.getCount()) && (i2 > 0))
    {
      for (Object localObject = this.j.get(i2); ((Shape)localObject).W(); localObject = ((Shape)localObject).getGroup()) {}
      i2 = ((Shape)localObject).w();
      if (i1 < i2) {
        i2--;
      }
    }
    this.j.d(i1);
    this.j.a(i2, localShape);
  }
  
  public int getZOrderPosition()
  {
    return w();
  }
  
  public void setZOrderPosition(int value)
  {
    int i1 = w();
    if (i1 == value) {
      return;
    }
    Shape localShape = this.j.get(i1);
    int i2 = value;
    if (i2 < this.j.getCount())
    {
      for (Object localObject = this.j.get(i2); ((Shape)localObject).W(); localObject = ((Shape)localObject).getGroup()) {}
      i2 = ((Shape)localObject).w();
      if (i1 < i2) {
        i2--;
      }
    }
    this.j.d(i1);
    this.j.a(i2, localShape);
  }
  
  int w()
  {
    if (this.j == null) {
      return 0;
    }
    for (int i1 = 0; i1 < this.j.getCount(); i1++) {
      if (this.j.get(i1) == this) {
        return i1;
      }
    }
    return -1;
  }
  
  private void b(int paramInt)
  {
    boolean bool = P().p().h();
    switch (getMsoDrawingType())
    {
    case 5: 
      R().d().a(127, 0, Integer.valueOf(17039620));
      R().d().a(191, 0, Integer.valueOf(524296));
      R().d().a(385, 0, Integer.valueOf(134217806));
      R().d().a(387, 0, Integer.valueOf(134217805));
      R().d().a(447, 0, Integer.valueOf(1048592));
      R().d().a(448, 0, Integer.valueOf(134217805));
      R().d().a(511, 0, Integer.valueOf(524296));
      R().d().a(575, 0, Integer.valueOf(131072));
      R().j().a(201);
      break;
    case 0: 
      R().j().a(0);
      R().j().a(true);
      R().d().a(127, 0, Integer.valueOf(262148));
      break;
    case 25: 
      R().j().a(202);
      R().d().a(128, 0, Integer.valueOf(30347012));
      R().d().a(139, 0, Integer.valueOf(2));
      R().d().a(191, 0, Integer.valueOf(524296));
      R().d().a(344, 0, Integer.valueOf(0));
      if (bool)
      {
        getFill().setFillType(2);
        getFill().getSolidFill().setColor(Color.getWhite());
        B().getLine().setFillType(2);
        B().getLine().setWeight(0.75D);
      }
      else
      {
        R().d().a(385, 0, Integer.valueOf(134217808));
        R().d().a(387, 0, Integer.valueOf(134217808));
        R().d().a(447, 0, Integer.valueOf(1048592));
      }
      R().d().a(513, 0, Integer.valueOf(0));
      R().d().a(575, 0, Integer.valueOf(196611));
      R().d().a(959, 0, Integer.valueOf(131074));
      break;
    case 6: 
      R().j().a(202);
      R().d().a(128, 0, Integer.valueOf(30019360));
      R().d().a(139, 0, Integer.valueOf(2));
      R().d().a(191, 0, Integer.valueOf(524296));
      if (bool)
      {
        getFill().setFillType(2);
        getFill().getSolidFill().setColor(Color.getWhite());
        B().getLine().setFillType(2);
        B().getLine().setWeight(0.75D);
      }
      else
      {
        R().d().a(385, 0, Integer.valueOf(134217793));
      }
      R().d().a(448, 0, Integer.valueOf(134217792));
      break;
    case 11: 
      R().j().a(201);
      R().d().a(127, 0, Integer.valueOf(16777472));
      R().d().a(128, 0, Integer.valueOf(30019320));
      R().d().a(133, 0, Integer.valueOf(1));
      R().d().a(139, 0, Integer.valueOf(2));
      R().d().a(191, 0, Integer.valueOf(1703944));
      R().d().a(383, 0, Integer.valueOf(2687017));
      if (bool)
      {
        getFill().setFillType(1);
      }
      else
      {
        R().d().a(385, 0, Integer.valueOf(134217793));
        R().d().a(447, 0, Integer.valueOf(1048576));
      }
      R().d().a(448, 0, Integer.valueOf(134217792));
      R().d().a(511, 0, Integer.valueOf(524288));
      S().c(false);
      S().d(false);
      break;
    case 8: 
      R().j().a(75);
      R().d().a(511, 0, Integer.valueOf(1572864));
      break;
    case 24: 
      R().d().a(191, 0, Integer.valueOf(524296));
      R().d().a(385, 0, Integer.valueOf(134217793));
      R().d().a(387, 0, Integer.valueOf(134217793));
      R().d().a(447, 0, Integer.valueOf(1048592));
      R().d().a(448, 0, Integer.valueOf(134217792));
      R().d().a(511, 0, Integer.valueOf(524296));
      R().d().a(575, 0, Integer.valueOf(131072));
      this.r = true;
      R().j().c(true);
      R().j().a(75);
      break;
    case 7: 
      R().j().a(201);
      R().d().a(127, 0, Integer.valueOf(16777472));
      R().d().a(128, 0, Integer.valueOf(30019308));
      R().d().a(133, 0, Integer.valueOf(1));
      R().d().a(139, 0, Integer.valueOf(2));
      R().d().a(191, 0, Integer.valueOf(1703944));
      R().d().a(385, 0, Integer.valueOf(134217793));
      R().d().a(447, 0, Integer.valueOf(1048576));
      R().d().a(448, 0, Integer.valueOf(134217792));
      R().d().a(511, 0, Integer.valueOf(524288));
      break;
    case 14: 
      R().j().a(201);
      R().d().a(127, 0, Integer.valueOf(16777472));
      R().d().a(128, 0, Integer.valueOf(30019656));
      R().d().a(133, 0, Integer.valueOf(1));
      R().d().a(139, 0, Integer.valueOf(2));
      R().d().a(191, 0, Integer.valueOf(1703944));
      if (bool)
      {
        getFill().setFillType(1);
      }
      else
      {
        R().d().a(385, 0, Integer.valueOf(134217795));
        R().d().a(387, 0, Integer.valueOf(134217795));
        R().d().a(447, 0, Integer.valueOf(1114129));
      }
      R().d().a(448, 0, Integer.valueOf(134217792));
      S().c(false);
      S().d(false);
      break;
    case 19: 
      R().j().a(201);
      R().d().a(127, 0, Integer.valueOf(16777472));
      R().d().a(128, 0, Integer.valueOf(30019476));
      R().d().a(133, 0, Integer.valueOf(1));
      R().d().a(139, 0, Integer.valueOf(2));
      R().d().a(191, 0, Integer.valueOf(1703944));
      if (bool) {
        getFill().setFillType(1);
      } else {
        R().d().a(447, 0, Integer.valueOf(1048576));
      }
      R().d().a(448, 0, Integer.valueOf(134217792));
      R().d().a(511, 0, Integer.valueOf(524416));
      S().c(false);
      break;
    case 12: 
      R().j().a(201);
      S().c(false);
      S().d(false);
      R().d().a(127, 0, Integer.valueOf(16777472));
      R().d().a(128, 0, Integer.valueOf(30019260));
      R().d().a(133, 0, Integer.valueOf(1));
      R().d().a(139, 0, Integer.valueOf(2));
      R().d().a(191, 0, Integer.valueOf(1703944));
      R().d().a(383, 0, Integer.valueOf(2687017));
      if (bool)
      {
        getFill().setFillType(1);
      }
      else
      {
        R().d().a(385, 0, Integer.valueOf(134217793));
        R().d().a(447, 0, Integer.valueOf(1048576));
      }
      R().d().a(448, 0, Integer.valueOf(134217792));
      R().d().a(511, 0, Integer.valueOf(524416));
      break;
    case 18: 
    case 20: 
      R().j().a(201);
      S().d(false);
      R().d().a(127, 0, Integer.valueOf(17039620));
      R().d().a(191, 0, Integer.valueOf(524296));
      R().d().a(448, 0, Integer.valueOf(134217792));
      R().d().a(511, 0, Integer.valueOf(524416));
      break;
    case 16: 
    case 17: 
      R().j().a(201);
      R().d().a(127, 0, Integer.valueOf(17039620));
      R().d().a(191, 0, Integer.valueOf(524296));
      R().d().a(448, 0, Integer.valueOf(134217792));
      break;
    case 1: 
      R().j().a(20);
      R().d().a(191, 0, Integer.valueOf(524296));
      R().d().a(324, 0, Integer.valueOf(4));
      R().d().a(383, 0, Integer.valueOf(65536));
      R().d().a(447, 0, Integer.valueOf(1048576));
      R().d().a(448, 0, Integer.valueOf(134217792));
      R().d().a(511, 0, Integer.valueOf(1048592));
      break;
    case 2: 
      R().j().a(1);
      R().d().a(191, 0, Integer.valueOf(524296));
      R().d().a(385, 0, Integer.valueOf(134217793));
      R().d().a(448, 0, Integer.valueOf(134217792));
      break;
    case 4: 
      R().j().a(19);
      R().d().a(191, 0, Integer.valueOf(524296));
      R().d().a(385, 0, Integer.valueOf(134217793));
      R().d().a(447, 0, Integer.valueOf(1048576));
      R().d().a(448, 0, Integer.valueOf(134217792));
      break;
    case 3: 
      R().j().a(3);
      R().d().a(191, 0, Integer.valueOf(524296));
      R().d().a(385, 0, Integer.valueOf(134217793));
      R().d().a(448, 0, Integer.valueOf(134217792));
      break;
    case 30: 
      R().j().a((short)paramInt);
      R().d().a(191, 0, Integer.valueOf(524296));
      R().d().a(385, 0, Integer.valueOf(134217793));
      R().d().a(448, 0, Integer.valueOf(134217792));
      switch (paramInt)
      {
      case 32: 
        R().j().d(true);
        R().d().a(771, 0, Integer.valueOf(0));
        break;
      case 33: 
      case 35: 
      case 36: 
        R().d().a(771, 0, Integer.valueOf(1));
        break;
      case 37: 
      case 38: 
      case 39: 
      case 40: 
        R().d().a(771, 0, Integer.valueOf(2));
      }
      break;
    case 9: 
    case 10: 
    case 13: 
    case 15: 
    case 21: 
    case 22: 
    case 23: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    default: 
      R().j().a(201);
    }
    if ((bool) && (!a(getMsoDrawingType()))) {
      this.p = new zsw(this);
    }
  }
  
  zsw x()
  {
    return this.p;
  }
  
  int y()
  {
    if (isGroup())
    {
      int i1 = 1;
      for (Shape localShape : ((GroupShape)this).getGroupedShapes()) {
        i1 += localShape.y();
      }
      return i1;
    }
    return 1;
  }
  
  boolean z()
  {
    String str = R().d().e(50048);
    return (str == null) || ("".equals(str));
  }
  
  public String getName()
  {
    String str = R().d().e(50048);
    if ((str != null) && (!"".equals(str))) {
      return str;
    }
    if (getMsoDrawingType() == 5)
    {
      a();
      return R().d().e(50048);
    }
    int i1 = R().j().c() - N().d().g();
    if (i1 > 0)
    {
      i1 %= 1024;
      switch (getMsoDrawingType())
      {
      case 30: 
        return "AutoShape " + i1;
      case 24: 
        return "Object " + i1;
      }
      return ztt.d(getMsoDrawingType()) + " " + i1;
    }
    return "Shape " + R().j().c();
  }
  
  public void setName(String value)
  {
    R().d().a(50048, 2, value);
    if ((!zw.b(value)) && (this.z != null)) {
      this.z.a = value;
    }
  }
  
  private void a()
  {
    HashMap localHashMap = new HashMap();
    int i1 = 0;
    Object localObject1 = N().iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      Shape localShape1 = (Shape)((Iterator)localObject1).next();
      if (localShape1.getMsoDrawingType() == 5)
      {
        localObject2 = localShape1.R().d().e(50048);
        if ((localObject2 != null) && (!"".equals(localObject2))) {
          localHashMap.put(localObject2, localObject2);
        } else {
          i1 = 1;
        }
      }
    }
    if (i1 != 0)
    {
      int i2 = 0;
      localObject2 = N().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Shape localShape2 = (Shape)((Iterator)localObject2).next();
        if ((localShape2.getMsoDrawingType() == 5) && (localShape2.z()))
        {
          do
          {
            i2++;
            localObject1 = "Chart " + i2;
          } while (localHashMap.get(localObject1) != null);
          localShape2.setName((String)localObject1);
        }
      }
    }
  }
  
  String A()
  {
    int i1 = R().j().c() - N().d().g();
    if (i1 > 0) {
      i1 %= 1024;
    } else {
      i1 = R().j().c();
    }
    String str = "control";
    switch (this.z.l.getType())
    {
    case 7: 
      str = "Label";
      break;
    case 0: 
      str = "CommandButton";
      break;
    case 8: 
      str = "Image";
      break;
    case 5: 
      str = "SpinButton";
      break;
    case 10: 
      str = "ScrollBar";
      break;
    case 1: 
      str = "ComboBox";
      break;
    case 2: 
      str = "CheckBox";
      break;
    case 6: 
      str = "OptionButton";
      break;
    case 9: 
      str = "ToggleButton";
      break;
    case 3: 
      str = "ListBox";
      break;
    case 4: 
      str = "TextBox";
      break;
    }
    return str + i1;
  }
  
  public String getAlternativeText()
  {
    return R().d().e(50049);
  }
  
  public void setAlternativeText(String value)
  {
    R().d().a(50049, 2, value);
  }
  
  public String getTitle()
  {
    return this.a;
  }
  
  public void setTitle(String value)
  {
    this.a = value;
  }
  
  /**
   * @deprecated
   */
  public MsoLineFormat getLineFormat()
  {
    return new MsoLineFormat(B().getLine());
  }
  
  /**
   * @deprecated
   */
  public MsoFillFormat getFillFormat()
  {
    return new MsoFillFormat(getFill());
  }
  
  ShapeFormat B()
  {
    if (this.q == null) {
      this.q = new ShapeFormat(P().p(), this);
    }
    return this.q;
  }
  
  /**
   * @deprecated
   */
  public ShapeFormat getFormat()
  {
    if (this.q == null) {
      this.q = new ShapeFormat(P().p(), this);
    }
    return this.q;
  }
  
  boolean C()
  {
    if (W()) {
      return false;
    }
    if (T()) {
      return false;
    }
    return R().b() != null;
  }
  
  void D()
  {
    if ((this.q == null) && (this.r))
    {
      FillFormat localFillFormat = B().getFill();
      LineFormat localLineFormat = B().getLine();
    }
  }
  
  FillFormat a(int paramInt, boolean paramBoolean)
  {
    FillFormat localFillFormat = this.q == null ? null : this.q.a;
    if (localFillFormat == null) {
      switch (paramInt)
      {
      case 0: 
        return B().getFill();
      case 1: 
        if (paramBoolean)
        {
          if (this.r) {
            return null;
          }
        }
        else if (!this.r) {
          return null;
        }
        return B().getFill();
      case 2: 
        localFillFormat = new FillFormat(B());
        a(this, localFillFormat);
      }
    }
    return localFillFormat;
  }
  
  LineFormat b(int paramInt, boolean paramBoolean)
  {
    LineFormat localLineFormat = this.q == null ? null : this.q.b;
    if (localLineFormat == null) {
      switch (paramInt)
      {
      case 0: 
        return B().getLine();
      case 1: 
        if (paramBoolean)
        {
          if (this.r) {
            return null;
          }
        }
        else if (!this.r) {
          return null;
        }
        return B().getLine();
      case 2: 
        localLineFormat = new LineFormat(B());
        a(this, localLineFormat);
      }
    }
    return localLineFormat;
  }
  
  zrs E()
  {
    zrs localzrs = null;
    if (T())
    {
      Chart localChart = (Chart)N().i();
      localzrs = localChart.O();
    }
    if (localzrs == null) {
      localzrs = P().p().d();
    }
    return localzrs;
  }
  
  static void a(Shape paramShape, LineFormat paramLineFormat)
  {
    Object localObject;
    if (paramShape.r)
    {
      localObject = new MsoLineFormatHelper(paramShape);
      ((MsoLineFormatHelper)localObject).a(paramLineFormat);
    }
    else if ((paramShape.x() != null) && (paramShape.x().a != null) && (paramShape.x().a.a != null) && (paramShape.E().g != null))
    {
      localObject = new CopyOptions(0, paramShape.P().p(), paramShape.P().p());
      ((CopyOptions)localObject).b = true;
      ((CopyOptions)localObject).l = paramShape.x().a.b;
      int i1 = com.aspose.cells.b.a.ze.f(paramShape.x().a.a) - 1;
      if ((i1 < 0) || (i1 >= paramShape.E().g.size())) {
        paramLineFormat.setFillType(1);
      } else {
        paramLineFormat.a((LineFormat)paramShape.E().g.get(i1), (CopyOptions)localObject);
      }
    }
    else
    {
      paramLineFormat.setFillType(1);
    }
  }
  
  static void a(Shape paramShape, FillFormat paramFillFormat)
  {
    if (paramShape.r)
    {
      paramFillFormat.a(new MsoFillFormatHelper(paramShape, paramShape.R().d(), paramShape.P().p()), true);
      if (paramFillFormat.getFillType() == 4) {
        paramFillFormat.getTextureFill().setTiling(paramShape.aq());
      }
    }
    else if ((paramShape.x() != null) && (paramShape.x().d != null) && (paramShape.x().d.a != null) && (paramShape.E().h != null))
    {
      CopyOptions localCopyOptions = new CopyOptions(0, paramShape.P().p(), paramShape.P().p());
      localCopyOptions.l = paramShape.x().d.b;
      int i1 = com.aspose.cells.b.a.ze.f(paramShape.x().d.a) - 1;
      if ((i1 < 0) || (i1 >= paramShape.E().h.size())) {
        paramFillFormat.setFillType(1);
      } else {
        paramFillFormat.a((FillFormat)paramShape.E().h.get(i1), localCopyOptions);
      }
    }
    else
    {
      paramFillFormat.setFillType(1);
    }
  }
  
  public LineFormat getLine()
  {
    return B().getLine();
  }
  
  public FillFormat getFill()
  {
    return B().getFill();
  }
  
  public ShadowEffect getShadowEffect()
    throws Exception
  {
    return B().getShadowEffect();
  }
  
  public ReflectionEffect getReflection()
    throws Exception
  {
    return B().e();
  }
  
  public GlowEffect getGlow()
    throws Exception
  {
    return B().getGlowEffect();
  }
  
  public double getSoftEdges()
    throws Exception
  {
    return B().getSoftEdgeRadius();
  }
  
  public void setSoftEdges(double value)
    throws Exception
  {
    B().setSoftEdgeRadius(value);
  }
  
  public ThreeDFormat getThreeDFormat()
    throws Exception
  {
    return B().d();
  }
  
  /**
   * @deprecated
   */
  public MsoTextFrame getTextFrame()
  {
    return new MsoTextFrame(this);
  }
  
  public MsoFormatPicture getFormatPicture()
  {
    if (this.b == null) {
      this.b = new MsoFormatPicture(this);
    }
    return this.b;
  }
  
  boolean F()
  {
    switch (getMsoDrawingType())
    {
    case 6: 
    case 7: 
    case 11: 
    case 12: 
    case 14: 
    case 19: 
    case 25: 
      return true;
    case 2: 
      return this.x != null;
    case 3: 
      return this.x != null;
    case 4: 
      return this.x != null;
    case 30: 
      return this.x != null;
    }
    return false;
  }
  
  public boolean isHidden()
  {
    return R().d().a(959, 1, false);
  }
  
  public void setHidden(boolean value)
  {
    R().d().b(959, 1, value);
  }
  
  public boolean isLockAspectRatio()
  {
    boolean bool = false;
    switch (getMsoDrawingType())
    {
    case 8: 
    case 24: 
      bool = true;
      break;
    }
    return R().d().a(127, 7, bool);
  }
  
  public void setLockAspectRatio(boolean value)
  {
    R().d().b(127, 7, value);
  }
  
  public boolean getLockedProperty(int type)
  {
    boolean bool = false;
    switch (type)
    {
    case 7: 
      switch (getMsoDrawingType())
      {
      case 8: 
      case 24: 
        bool = true;
      }
      break;
    }
    return R().d().a(127, type, bool);
  }
  
  public void setLockedProperty(int type, boolean value)
  {
    R().d().b(127, type, value);
  }
  
  boolean G()
  {
    switch (getMsoDrawingType())
    {
    case 8: 
    case 24: 
      return true;
    }
    int i1 = R().d().c(127, 0);
    return (i1 & 0xFFFF) != 0;
  }
  
  /**
   * @deprecated
   */
  public int getRotation()
  {
    return (int)getRotationAngle();
  }
  
  /**
   * @deprecated
   */
  public void setRotation(int value)
  {
    setRotationAngle(value);
  }
  
  public double getRotationAngle()
  {
    double d1 = R().d().a(4, 0.0F);
    return d1;
  }
  
  public void setRotationAngle(double value)
  {
    double d1 = getRotationAngle();
    if (d1 == value) {
      return;
    }
    if (!W())
    {
      int i1 = getPlacement();
      setPlacement(0);
      int[] arrayOfInt1 = b(d1);
      a(0, false, arrayOfInt1[0], arrayOfInt1[1], arrayOfInt1[2], arrayOfInt1[3]);
      int[] arrayOfInt2 = c(value);
      a(i1, true, arrayOfInt2[0], arrayOfInt2[1], arrayOfInt2[2], arrayOfInt2[3]);
      setPlacement(i1);
    }
    a(value);
  }
  
  double H()
  {
    double d1 = getRotationAngle();
    d1 %= 360.0D;
    if (d1 < 0.0D) {
      d1 += 360.0D;
    }
    return d1;
  }
  
  boolean I()
  {
    double d1 = H();
    return ((d1 >= 45.0D) && (d1 < 135.0D)) || ((d1 >= 225.0D) && (d1 < 315.0D));
  }
  
  void a(double paramDouble)
  {
    R().d().b(4, (float)paramDouble);
  }
  
  public Hyperlink addHyperlink(String address)
  {
    HyperlinkCollection localHyperlinkCollection = new HyperlinkCollection(null);
    localHyperlinkCollection.a(0, 0, 1, 1, address);
    R().d().a(50050, 3, localHyperlinkCollection.get(0));
    R().d().b(959, 3, true);
    return localHyperlinkCollection.get(0);
  }
  
  public void removeHyperlink()
  {
    R().d().b(50050);
    R().d().b(959, 3, false);
  }
  
  public Hyperlink getHyperlink()
  {
    return R().d().e();
  }
  
  Object J()
  {
    return this.n;
  }
  
  void a(Object paramObject)
  {
    this.n = paramObject;
  }
  
  void a(Shape paramShape, CopyOptions paramCopyOptions)
  {
    if (paramShape.h != null)
    {
      this.h = new zqu();
      if (paramCopyOptions.a())
      {
        this.h.b = paramShape.h.b;
        this.h.c = paramShape.h.c;
        this.h.e = paramShape.h.e;
        this.h.f = paramShape.h.f;
        this.h.h = paramShape.h.h;
        this.o = paramShape.o;
      }
      this.h.a(paramShape.h, paramCopyOptions, P() == paramShape.P());
    }
    this.m_linkedCell = zaam.a(paramShape.m_linkedCell, 0, 0, 0, paramCopyOptions);
    this.y = zaam.a(paramShape.y, 0, 0, 0, paramCopyOptions);
    R().a(paramShape.R(), paramCopyOptions);
    if ((!paramShape.P().p().g()) && (P().p().g())) {
      B().b(paramShape.B(), paramCopyOptions);
    } else if (paramShape.q != null) {
      B().b(paramShape.B(), paramCopyOptions);
    } else {
      this.q = null;
    }
    if (paramShape.S() != null) {
      S().a(paramShape.S());
    } else {
      a(null);
    }
    if (paramShape.z != null) {
      if (paramCopyOptions.a())
      {
        this.z = paramShape.z;
      }
      else if (P() == paramShape.P())
      {
        zqn localzqn1 = paramShape.z;
        zqn localzqn2 = new zqn(localzqn1.f);
        localzqn2.a(this, localzqn1, paramCopyOptions);
        this.z = localzqn2;
        localzqn2.b = zauj.z(R().j().c());
        this.h.c = ("\000s" + localzqn2.b);
      }
    }
    setMacroName(paramShape.getMacroName());
    this.s = paramShape.s;
    this.y = paramShape.y;
    this.s = paramShape.s;
    if (paramShape.x != null)
    {
      this.x = new FontSettingCollection(P(), this);
      this.x.a(paramShape.x, paramCopyOptions);
    }
    if (paramShape.p != null)
    {
      this.p = new zsw(this);
      this.p.a(paramShape.p);
    }
    else
    {
      this.p = null;
    }
    if (paramShape.d != null)
    {
      if (paramShape.d.a()) {
        this.d = new CustomGeometry(this);
      } else {
        this.d = new zaxp();
      }
      this.d.a(paramShape.d);
    }
    if ((paramShape.g != null) && ((paramCopyOptions.a()) || (paramCopyOptions.e == 1)))
    {
      this.g = new znn();
      this.g.a(paramShape.g);
    }
    this.B = paramShape.B;
    this.r = paramShape.r;
  }
  
  public void moveToRange(int upperLeftRow, int upperLeftColumn, int lowerRightRow, int lowerRightColumn)
  {
    int i1 = getPlacement();
    R().i().d(upperLeftColumn);
    R().i().e(0);
    R().i().b(upperLeftRow);
    R().i().c(0);
    R().i().h(lowerRightColumn);
    R().i().i(0);
    R().i().f(lowerRightRow);
    R().i().g(0);
    if (i1 != 2)
    {
      R().i().a(2);
      setPlacement(i1);
    }
  }
  
  public void alignTopRightCorner(int topRow, int rightColumn)
  {
    int i1 = getPlacement();
    setPlacement(1);
    R().i().c(0);
    R().i().b(topRow);
    int i2 = R().i().p();
    int[] arrayOfInt = { rightColumn + 1, 0, -i2 };
    Q().getCells().b.a(arrayOfInt);
    R().i().d(arrayOfInt[0]);
    R().i().e(arrayOfInt[1]);
    setPlacement(i1);
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getPlacement();
    setPlacement(1);
    int i2 = 0;
    if (paramInt2 != 0)
    {
      i2 = Q().getCells().getRowHeightPixel(paramInt1);
      R().i().b(paramInt1);
      R().i().c(paramInt2);
    }
    else
    {
      R().i().b(paramInt1);
      R().i().c(0);
    }
    if (paramInt4 != 0)
    {
      i2 = Q().getCells().d(paramInt3);
      R().i().d(paramInt3);
      R().i().e(paramInt4);
    }
    else
    {
      R().i().d(paramInt3);
      R().i().e(0);
    }
    setPlacement(i1);
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    R().i().a(paramInt1);
    R().i().e(paramInt2);
    R().i().c(paramInt3);
    if (paramInt1 == 2)
    {
      R().i().i(paramInt4 + paramInt2);
      R().i().g(paramInt5 + paramInt3);
    }
    else
    {
      Chart localChart = (Chart)N().i();
      double d1 = localChart.getChartObject().getWidth();
      double d2 = localChart.getChartObject().getHeight();
      int i1 = (int)(paramInt4 * d1 / 4000.0D + 0.5D);
      R().i().i(i1);
      i1 = (int)(paramInt5 * d2 / 4000.0D + 0.5D);
      R().i().g(i1);
    }
  }
  
  void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    h(0);
    R().i().c(paramInt3);
    R().i().e(paramInt2);
    R().i().i(paramInt4);
    R().i().g(paramInt5);
    if ((paramBoolean) && (paramInt1 != 0)) {
      setPlacement(paramInt1);
    }
  }
  
  void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    h(0);
    R().i().e = paramInt2;
    R().i().d = paramInt1;
    R().i().g = paramInt3;
    R().i().f = paramInt4;
  }
  
  int[] K()
  {
    return new int[] { (int)R().i().d, (int)R().i().e, (int)R().i().g, (int)R().i().f };
  }
  
  void a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[] paramArrayOfInt4)
  {
    int i1 = getPlacement();
    if (i1 != 2) {
      setPlacement(2);
    }
    paramArrayOfInt1[0] = R().i().j();
    paramArrayOfInt2[0] = R().i().g();
    paramArrayOfInt3[0] = R().i().p();
    paramArrayOfInt4[0] = R().i().m();
    if (i1 != 2) {
      setPlacement(i1);
    }
  }
  
  int[] c(boolean paramBoolean)
  {
    int i1 = getPlacement();
    if ((paramBoolean) && (i1 != 0)) {
      setPlacement(0);
    }
    int[] arrayOfInt = new int[4];
    arrayOfInt[0] = R().i().j();
    arrayOfInt[1] = R().i().g();
    arrayOfInt[2] = R().i().p();
    arrayOfInt[3] = R().i().m();
    if ((paramBoolean) && (i1 != 0)) {
      setPlacement(i1);
    }
    return arrayOfInt;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    R().i().a(1);
    if (U())
    {
      R().i().e(0);
      R().i().c(0);
      R().i().i(paramInt6);
      R().i().g(paramInt5);
      return;
    }
    if (T())
    {
      ChartShape localChartShape = ((Chart)N().i()).getChartObject();
      int i1 = localChartShape.getLeftToCorner();
      int i2 = localChartShape.getTopToCorner();
      int i3 = localChartShape.getWidth();
      int i4 = localChartShape.getHeight();
      int i5 = d(0, 0, paramInt3, 0) + paramInt4;
      int i6 = c(0, 0, paramInt1, 0) + paramInt2;
      int i7 = i5 - i1;
      paramInt4 = (int)(i7 * 4000.0F / i3 + 0.5D);
      if (paramInt4 < 0) {
        paramInt4 = 0;
      } else if (paramInt4 > 4000.0F) {
        paramInt4 = 4000;
      }
      int i8 = i6 - i2;
      paramInt2 = (int)(i8 * 4000.0F / i3 + 0.5D);
      if (paramInt2 < 0) {
        paramInt2 = 0;
      } else if (paramInt2 > 4000.0F) {
        paramInt2 = 4000;
      }
      R().i().i(paramInt6);
      R().i().g(paramInt5);
      R().i().e(paramInt4);
      R().i().c(paramInt2);
    }
    else
    {
      R().i().i(paramInt6);
      R().i().g(paramInt5);
      R().i().d(paramInt3);
      R().i().e(paramInt4);
      R().i().b(paramInt1);
      R().i().c(paramInt2);
    }
  }
  
  double[] L()
  {
    int i1 = zbxp.a();
    int i3;
    double d2;
    int i2;
    double d1;
    int i5;
    double d4;
    int i4;
    double d3;
    if ((T()) || (W()))
    {
      i3 = getUpperLeftColumn();
      d2 = zbxp.a(getLeft(), i1);
      i2 = getUpperLeftRow();
      d1 = zbxp.a(getTop(), i1);
      i5 = getLowerRightColumn();
      d4 = zbxp.a(getRight(), i1);
      i4 = getLowerRightRow();
      d3 = zbxp.a(getBottom(), i1);
    }
    else
    {
      int i6 = getPlacement();
      setPlacement(2);
      i3 = R().i().i();
      double d5 = R().i().k();
      if (d5 > Q().getCells().getColumnWidthPixel(i3))
      {
        i3++;
        d5 = 0.0D;
        R().i().d(i3);
        R().i().b(d5);
      }
      d2 = zbxp.a(d5, i1);
      i2 = R().i().f();
      double d6 = R().i().h();
      if (i2 < 0)
      {
        i2 = 0;
        d6 = 0.0D;
      }
      if (d6 > Q().getCells().getRowHeightPixel(i2))
      {
        i2++;
        d6 = 0.0D;
        R().i().a(d6);
        R().i().b(i2);
      }
      d1 = zbxp.a(d6, i1);
      i5 = R().i().o();
      double d7 = R().i().q();
      if ((i5 <= 16383) && (d7 > Q().getCells().getColumnWidthPixel(i5)))
      {
        i5++;
        d7 = 0.0D;
        R().i().h(i5);
        R().i().d(d7);
      }
      d4 = zbxp.a(d7, i1);
      i4 = R().i().l();
      double d8 = R().i().n();
      if (d8 > Q().getCells().getRowHeightPixel(i4))
      {
        i4++;
        d8 = 0.0D;
        R().i().f(i4);
        R().i().c(d8);
      }
      d3 = zbxp.a(d8, i1);
      setPlacement(i6);
    }
    return new double[] { i3, d2, i2, d1, i5, d4, i4, d3, getWidthPt(), getHeightPt() };
  }
  
  int[] M()
  {
    int i1 = zbxp.a();
    int i4;
    int i5;
    int i2;
    int i3;
    int i8;
    int i9;
    int i6;
    int i7;
    if ((T()) || (W()))
    {
      i4 = getUpperLeftColumn();
      i5 = zauj.a(getLeft(), i1);
      i2 = getUpperLeftRow();
      i3 = zauj.a(getTop(), i1);
      i8 = getLowerRightColumn();
      i9 = zauj.a(getRight(), i1);
      i6 = getLowerRightRow();
      i7 = zauj.a(getBottom(), i1);
    }
    else
    {
      int i10 = getPlacement();
      setPlacement(2);
      i4 = R().i().i();
      i5 = zauj.a(R().i().k(), i1);
      i2 = R().i().f();
      i3 = zauj.a(R().i().h(), i1);
      i8 = R().i().o();
      i9 = zauj.a(R().i().q(), i1);
      i6 = R().i().l();
      i7 = zauj.a(R().i().n(), i1);
      setPlacement(i10);
    }
    return new int[] { i4, i5, i2, i3, i8, i9, i6, i7 };
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    zky localzky;
    if (R().i().c == null)
    {
      R().i().a(2);
      R().i().d(paramInt4);
      R().i().b(a(paramInt4, paramInt5));
      R().i().b(paramInt2);
      R().i().a(b(paramInt2, paramInt3));
      R().i().h(paramInt8);
      R().i().d(a(paramInt8, paramInt9));
      R().i().f(paramInt6);
      R().i().c(b(paramInt6, paramInt7));
      localzky = new zky();
      localzky.a = paramInt1;
      localzky.f = paramInt4;
      localzky.h = paramInt2;
      localzky.g = paramInt8;
      localzky.i = paramInt6;
      localzky.b = paramInt5;
      localzky.c = paramInt3;
      localzky.d = paramInt7;
      localzky.e = paramInt9;
      R().i().c = localzky;
    }
    else
    {
      localzky = R().i().c;
      R().i().a(2);
      R().i().b(a(localzky.f, localzky.b));
      R().i().a(b(localzky.h, localzky.c));
      R().i().d(a(localzky.g, localzky.e));
      R().i().c(b(localzky.i, localzky.d));
      R().i().c = null;
    }
  }
  
  void a(int paramInt1, int paramInt2, double paramDouble1, int paramInt3, double paramDouble2, int paramInt4, double paramDouble3, int paramInt5, double paramDouble4)
  {
    R().i().d(paramInt3);
    R().i().b(paramDouble2);
    R().i().b(paramInt2);
    R().i().a(paramDouble1);
    if ((paramInt3 > paramInt5) || ((paramInt3 == paramInt5) && (paramDouble2 > paramDouble4)))
    {
      R().i().h(paramInt3);
      R().i().d(paramDouble2);
    }
    else
    {
      R().i().h(paramInt5);
      R().i().d(paramDouble4);
    }
    R().i().f(paramInt4);
    R().i().c(paramDouble3);
    h(2);
    if (paramInt1 != 2) {
      setPlacement(paramInt1);
    }
  }
  
  ShapeCollection N()
  {
    return this.j;
  }
  
  public int getId()
  {
    return this.m;
  }
  
  public String getSpid()
  {
    if (this.h != null) {
      return this.h.c;
    }
    return null;
  }
  
  public int getSpt()
  {
    switch (getMsoDrawingType())
    {
    case 8: 
      if (this.z != null) {
        return 201;
      }
      break;
    case 24: 
      return 75;
    }
    return getAutoShapeType();
  }
  
  int O()
  {
    return this.m;
  }
  
  void g(int paramInt)
  {
    this.m = paramInt;
  }
  
  WorksheetCollection P()
  {
    return this.j.j();
  }
  
  Worksheet Q()
  {
    return this.j.k();
  }
  
  zbqr R()
  {
    return this.k;
  }
  
  zapt S()
  {
    return this.l;
  }
  
  void a(zapt paramzapt)
  {
    this.l = paramzapt;
  }
  
  public boolean isGroup()
  {
    if (S() == null) {
      return false;
    }
    return getMsoDrawingType() == 0;
  }
  
  boolean T()
  {
    return this.j.g();
  }
  
  boolean U()
  {
    return (this.j.g()) && (Q().getType() == 2);
  }
  
  boolean V()
  {
    return this.j.h();
  }
  
  boolean W()
  {
    if ((this.n instanceof Shape)) {
      return ((Shape)this.n).isGroup();
    }
    return false;
  }
  
  int X()
  {
    if (Y()) {
      return 90;
    }
    int i1 = R().k() + 8;
    if (isGroup()) {
      i1 += 8;
    }
    return i1;
  }
  
  boolean Y()
  {
    if ((getMsoDrawingType() == 20) && (R().i().b())) {
      return ((ComboBox)this).a() != null;
    }
    return false;
  }
  
  public boolean isWordArt()
  {
    String str = R().d().e(49344);
    return (str != null) && (!"".equals(str));
  }
  
  public TextEffectFormat getTextEffect()
  {
    return new TextEffectFormat(this);
  }
  
  zaqa Z()
  {
    return new zaqa(this);
  }
  
  public boolean isLocked()
  {
    if (S() == null) {
      return true;
    }
    return S().a();
  }
  
  public void setLocked(boolean value)
  {
    if (S() == null) {
      return;
    }
    S().a(value);
  }
  
  public boolean isPrintable()
  {
    if (S() == null) {
      return true;
    }
    return S().b();
  }
  
  public void setPrintable(boolean value)
  {
    if (S() == null) {
      return;
    }
    S().b(value);
  }
  
  /**
   * @deprecated
   */
  public boolean isPrinted()
  {
    return isPrintable();
  }
  
  /**
   * @deprecated
   */
  public void setPrinted(boolean value)
  {
    setPrintable(true);
  }
  
  public int getMsoDrawingType()
  {
    if (S() == null) {
      return 8;
    }
    return S().f();
  }
  
  public int getAutoShapeType()
  {
    return R().j().a();
  }
  
  public void setAutoShapeType(int value)
  {
    R().j().a((short)value);
  }
  
  void h(int paramInt)
  {
    R().i().a(paramInt);
  }
  
  public int getPlacement()
  {
    return R().i().e();
  }
  
  public void setPlacement(int value)
  {
    if (b()) {
      return;
    }
    if (W()) {
      return;
    }
    if (R().i().e() == value) {
      return;
    }
    double d1 = 0.0D;
    double d2 = 0.0D;
    if (T())
    {
      if (value == 0) {
        return;
      }
      Chart localChart = (Chart)N().i();
      d1 = localChart.getChartObject().getWidth();
      d2 = localChart.getChartObject().getHeight();
      if (R().i().e() == 2)
      {
        int i2 = (int)(d1 * (R().i().p() - R().i().j()) / 4000.0D + 0.5D);
        R().i().i(i2);
        i2 = (int)(d2 * (R().i().m() - R().i().g()) / 4000.0D + 0.5D);
        R().i().g(i2);
      }
      else
      {
        R().i().i((int)(R().i().p() * 4000.0F / d1 + 0.5D) + R().i().j());
        R().i().g((int)(R().i().m() * 4000.0F / d2 + 0.5D) + R().i().g());
      }
      R().i().a(value);
      return;
    }
    int i1 = R().i().f();
    double d3 = R().i().h();
    int i3 = R().i().i();
    double d4 = R().i().k();
    int i4 = R().i().l();
    double d5 = R().i().n();
    int i5 = R().i().o();
    double d6 = R().i().q();
    if (R().i().e() == 2)
    {
      if (value == 0)
      {
        d1 = b(0, 0.0D, i3, d4);
        d2 = a(0, 0.0D, i1, d3);
        R().i().a(d2);
        R().i().b(d1);
      }
      d1 = b(i3, d4, i5, d6);
      d2 = a(i1, d3, i4, d5);
      R().i().d(d1);
      R().i().c(d2);
      R().i().a(value);
      return;
    }
    double[] arrayOfDouble;
    if (R().i().e() == 1)
    {
      if (value == 2)
      {
        d1 = d6;
        d2 = d5;
        arrayOfDouble = b(i3, d4, d1);
        R().i().h((int)arrayOfDouble[0]);
        R().i().d(arrayOfDouble[1]);
        arrayOfDouble = a(i1, d3, d2);
        R().i().f((int)arrayOfDouble[0]);
        R().i().c(arrayOfDouble[1]);
      }
      else if (value == 0)
      {
        d1 = b(0, 0.0D, i3, d4);
        R().i().b(d1);
        d2 = a(0, 0.0D, i1, d3);
        R().i().a(d2);
      }
      R().i().a(value);
      return;
    }
    if (R().i().e() == 0)
    {
      d1 = d4;
      d2 = d3;
      arrayOfDouble = a(0, 0.0D, d2);
      R().i().b((int)arrayOfDouble[0]);
      R().i().a(arrayOfDouble[1]);
      i1 = (int)arrayOfDouble[0];
      d3 = arrayOfDouble[1];
      arrayOfDouble = b(0, 0.0D, d1);
      R().i().d((int)arrayOfDouble[0]);
      R().i().b(arrayOfDouble[1]);
      i3 = (int)arrayOfDouble[0];
      d4 = arrayOfDouble[1];
      if (value == 2)
      {
        d1 = d6;
        d2 = d5;
        arrayOfDouble = a(i1, d3, d2);
        R().i().f((int)arrayOfDouble[0]);
        R().i().c(arrayOfDouble[1]);
        arrayOfDouble = b(i3, d4, d1);
        R().i().h((int)arrayOfDouble[0]);
        R().i().d(arrayOfDouble[1]);
      }
      R().i().a(value);
      return;
    }
  }
  
  int[] aa()
  {
    Object localObject;
    if (b())
    {
      localObject = Q().getCharts().get(0);
      return new int[] { 0, (int)(((Chart)localObject).getChartObject().getHeight() * R().i().g() / 4000.0F + 0.5D) };
    }
    if (W())
    {
      localObject = (GroupShape)this.n;
      int i2 = (int)(R().i().g() * ((GroupShape)localObject).getHeight() / 4000.0F + 0.5D);
      int[] arrayOfInt2 = ((GroupShape)localObject).aa();
      int[] arrayOfInt3 = a(arrayOfInt2[0], arrayOfInt2[1], i2);
      return arrayOfInt3;
    }
    if (T())
    {
      localObject = (Chart)N().i();
      return new int[] { 0, (int)(((Chart)localObject).getChartObject().getHeight() * R().i().g() / 4000.0F + 0.5D) };
    }
    if ((getPlacement() == 1) || (getPlacement() == 2)) {
      return new int[] { R().i().f(), R().i().g() };
    }
    int i1 = R().i().g();
    int[] arrayOfInt1 = a(0, 0, i1);
    return arrayOfInt1;
  }
  
  public int getUpperLeftRow()
  {
    return aa()[0];
  }
  
  public void setUpperLeftRow(int value)
  {
    zamm.a(value);
    if (b()) {
      return;
    }
    if (W()) {
      return;
    }
    if (T()) {
      return;
    }
    int i1 = getPlacement();
    setPlacement(1);
    R().i().b(value);
    setPlacement(i1);
  }
  
  public int getUpperDeltaY()
  {
    if (b()) {
      return 0;
    }
    if (T()) {
      return 0;
    }
    double d1 = getTop();
    return b(getUpperLeftRow(), d1);
  }
  
  public void setUpperDeltaY(int value)
  {
    if ((value < 0) || (value > zkx.b)) {
      return;
    }
    if (b()) {
      return;
    }
    if (W()) {
      return;
    }
    if (T()) {
      return;
    }
    int i1 = getPlacement();
    setPlacement(1);
    R().i().c(value);
    setPlacement(i1);
  }
  
  int[] ab()
  {
    Object localObject;
    if (b())
    {
      localObject = Q().getCharts().get(0);
      return new int[] { 0, (int)(((Chart)localObject).getChartObject().getWidth() * R().i().j() / 4000.0F + 0.5D) };
    }
    if (W())
    {
      localObject = (GroupShape)this.n;
      int i2 = (int)(R().i().j() * ((GroupShape)localObject).getWidth() / 4000.0F + 0.5D);
      int[] arrayOfInt2 = ((GroupShape)localObject).ab();
      int[] arrayOfInt3 = b(arrayOfInt2[0], arrayOfInt2[1], i2);
      return arrayOfInt3;
    }
    if (T())
    {
      localObject = (Chart)N().i();
      return new int[] { 0, (int)(((Chart)localObject).getChartObject().getWidth() * R().i().j() / 4000.0F + 0.5D) };
    }
    if ((getPlacement() == 1) || (getPlacement() == 2)) {
      return new int[] { R().i().i(), R().i().j() };
    }
    int i1 = R().i().j();
    int[] arrayOfInt1 = b(0, 0, i1);
    return arrayOfInt1;
  }
  
  public int getUpperLeftColumn()
  {
    return ab()[0];
  }
  
  public void setUpperLeftColumn(int value)
  {
    zamm.b(value);
    if (b()) {
      return;
    }
    if (W()) {
      return;
    }
    if (T()) {
      return;
    }
    int i1 = getPlacement();
    setPlacement(1);
    R().i().d(value);
    setPlacement(i1);
  }
  
  public int getUpperDeltaX()
  {
    if (b()) {
      return 0;
    }
    if (T()) {
      return 0;
    }
    int i1 = getLeft();
    return a(getUpperLeftColumn(), i1);
  }
  
  public void setUpperDeltaX(int value)
  {
    if (value < 0) {
      return;
    }
    if (b()) {
      return;
    }
    if (W()) {
      return;
    }
    if (T()) {
      return;
    }
    setLeft((int)(a(getUpperLeftColumn(), value) + 0.5D));
  }
  
  public int getLowerRightRow()
  {
    if (b()) {
      return 0;
    }
    if (T()) {
      return 0;
    }
    if (W())
    {
      GroupShape localGroupShape = (GroupShape)this.n;
      i2 = (int)((R().i().g() + R().i().m()) * localGroupShape.getHeight() / 4000.0F + 0.5D);
      int[] arrayOfInt1 = a(localGroupShape.getUpperLeftRow(), localGroupShape.getTop(), i2);
      return arrayOfInt1[0];
    }
    if (getPlacement() == 2) {
      return R().i().l();
    }
    int i1 = getHeight();
    int i2 = 0;
    int i3 = 0;
    if (getPlacement() == 1)
    {
      i2 = getUpperLeftRow();
      i3 = getTop();
    }
    else
    {
      i1 = getTopToCorner() + i1;
    }
    int[] arrayOfInt2 = a(i2, i3, i1);
    return arrayOfInt2[0];
  }
  
  public void setLowerRightRow(int value)
  {
    zamm.a(value);
    if (b()) {
      return;
    }
    if (W()) {
      return;
    }
    if (T()) {
      return;
    }
    int i1 = getBottom();
    int i2 = getPlacement();
    setPlacement(1);
    int[] arrayOfInt;
    if (this.v)
    {
      int i3 = (int)(zbxz.b(getHeight()) * 20.0F);
      arrayOfInt = new int[] { value, (int)(zbxz.b(i1) * 20.0F), -i3 };
      Q().getCells().getRows().b.b(arrayOfInt);
      arrayOfInt[1] = ((int)zbxz.c(arrayOfInt[1] / 20.0F));
      arrayOfInt[2] = ((int)zbxz.c(arrayOfInt[2] / 20.0F));
    }
    else
    {
      arrayOfInt = new int[] { value, i1, -getHeight() };
      Q().getCells().getRows().b.a(arrayOfInt);
    }
    R().i().b(arrayOfInt[0]);
    R().i().c(arrayOfInt[1]);
    setPlacement(i2);
  }
  
  public int getLowerDeltaY()
  {
    if (b()) {
      return 0;
    }
    if (T()) {
      return 0;
    }
    return b(getLowerRightRow(), getBottom());
  }
  
  public void setLowerDeltaY(int value)
  {
    if (value < 0) {
      return;
    }
    if (b()) {
      return;
    }
    if (W()) {
      return;
    }
    if (T()) {
      return;
    }
    setBottom((int)(b(getLowerRightRow(), value) + 0.5D));
  }
  
  public int getLowerRightColumn()
  {
    if (b()) {
      return 0;
    }
    if (W())
    {
      GroupShape localGroupShape = (GroupShape)this.n;
      i2 = (int)((R().i().j() + R().i().p()) * localGroupShape.getWidth() / 4000.0F + 0.5D);
      int[] arrayOfInt1 = b(localGroupShape.getUpperLeftColumn(), localGroupShape.getLeft(), i2);
      return arrayOfInt1[0];
    }
    if (T()) {
      return 0;
    }
    if (getPlacement() == 2) {
      return R().i().o();
    }
    int i1 = 0;
    int i2 = 0;
    int i3 = getWidth();
    if (getPlacement() == 1)
    {
      i1 = getUpperLeftColumn();
      i2 = getLeft();
    }
    else
    {
      i3 += getLeftToCorner();
    }
    int[] arrayOfInt2 = b(i1, i2, i3);
    return arrayOfInt2[0];
  }
  
  public void setLowerRightColumn(int value)
  {
    zamm.b(value);
    if (b()) {
      return;
    }
    if (W()) {
      return;
    }
    if (T()) {
      return;
    }
    int i1 = getRight();
    int i2 = getPlacement();
    setPlacement(1);
    int[] arrayOfInt = { value, i1, -getWidth() };
    Q().getCells().b.a(arrayOfInt);
    R().i().d(arrayOfInt[0]);
    R().i().e(arrayOfInt[1]);
    setPlacement(i2);
  }
  
  public int getLowerDeltaX()
  {
    if (b()) {
      return 0;
    }
    if (T()) {
      return 0;
    }
    return a(getLowerRightColumn(), getRight());
  }
  
  public void setLowerDeltaX(int value)
  {
    if (value < 0) {
      return;
    }
    if (b()) {
      return;
    }
    if (W()) {
      return;
    }
    if (T()) {
      return;
    }
    int i1 = getLowerRightColumn();
    setRight((int)(a(i1, value) + 0.5D));
  }
  
  public int getRight()
  {
    if (b()) {
      return 0;
    }
    if (W())
    {
      GroupShape localGroupShape = (GroupShape)this.n;
      i2 = (int)((R().i().j() + R().i().p()) * localGroupShape.getWidth() / 4000.0F + 0.5D);
      int[] arrayOfInt1 = b(localGroupShape.getUpperLeftColumn(), localGroupShape.getLeft(), i2);
      return arrayOfInt1[1];
    }
    if (T()) {
      return 0;
    }
    if (getPlacement() == 2) {
      return R().i().p();
    }
    int i1 = 0;
    int i2 = 0;
    int i3 = getWidth();
    if (getPlacement() == 1)
    {
      i1 = getUpperLeftColumn();
      i2 = getLeft();
    }
    else
    {
      i3 += getLeftToCorner();
    }
    int[] arrayOfInt2 = b(i1, i2, i3);
    return arrayOfInt2[1];
  }
  
  public void setRight(int value)
  {
    zamm.b(value);
    if (b()) {
      return;
    }
    if (W()) {
      return;
    }
    if (T()) {
      return;
    }
    int i1 = getLowerRightColumn();
    int i2 = getPlacement();
    setPlacement(1);
    int[] arrayOfInt = { i1, value, -getWidth() };
    Q().getCells().b.a(arrayOfInt);
    R().i().d(arrayOfInt[0]);
    R().i().e(arrayOfInt[1]);
    setPlacement(i2);
  }
  
  public int getBottom()
  {
    if (b()) {
      return 0;
    }
    if (T()) {
      return 0;
    }
    if (W())
    {
      GroupShape localGroupShape = (GroupShape)this.n;
      i2 = (int)((R().i().g() + R().i().m()) * localGroupShape.getHeight() / 4000.0F + 0.5D);
      int[] arrayOfInt1 = a(localGroupShape.getUpperLeftRow(), localGroupShape.getTop(), i2);
      return arrayOfInt1[1];
    }
    if (getPlacement() == 2) {
      return R().i().m();
    }
    int i1 = getHeight();
    int i2 = 0;
    int i3 = 0;
    if (getPlacement() == 1)
    {
      i2 = getUpperLeftRow();
      i3 = getTop();
    }
    else
    {
      i1 = getTopToCorner() + i1;
    }
    int[] arrayOfInt2 = a(i2, i3, i1);
    return arrayOfInt2[1];
  }
  
  public void setBottom(int value)
  {
    zamm.a(value);
    if (b()) {
      return;
    }
    if (W()) {
      return;
    }
    if (T()) {
      return;
    }
    int i1 = getLowerRightRow();
    int i2 = getPlacement();
    setPlacement(1);
    int[] arrayOfInt;
    if (this.v)
    {
      int i3 = (int)(zbxz.b(getHeight()) * 20.0F);
      arrayOfInt = new int[] { i1, (int)(zbxz.b(value) * 20.0F), -i3 };
      Q().getCells().getRows().b.b(arrayOfInt);
      arrayOfInt[1] = ((int)zbxz.c(arrayOfInt[1] / 20.0F));
      arrayOfInt[2] = ((int)zbxz.c(arrayOfInt[2] / 20.0F));
    }
    else
    {
      arrayOfInt = new int[] { i1, value, -getHeight() };
      Q().getCells().getRows().b.a(arrayOfInt);
    }
    R().i().b(arrayOfInt[0]);
    R().i().c(arrayOfInt[1]);
    setPlacement(i2);
  }
  
  public int getWidth()
  {
    Object localObject;
    if (W())
    {
      localObject = (GroupShape)this.n;
      if (((GroupShape)localObject).I())
      {
        if ((this instanceof GroupShape))
        {
          if (I()) {
            return (int)(R().i().m() / 4000.0F * ((GroupShape)localObject).getWidth() + 0.5D);
          }
          return (int)(R().i().p() / 4000.0F * ((GroupShape)localObject).getHeight() + 0.5D);
        }
        return (int)(R().i().p() / 4000.0F * ((GroupShape)localObject).getHeight() + 0.5D);
      }
      if ((this instanceof GroupShape))
      {
        if (I()) {
          return (int)(R().i().m() / 4000.0F * ((GroupShape)localObject).getHeight() + 0.5D);
        }
        return (int)(R().i().p() / 4000.0F * ((GroupShape)localObject).getWidth() + 0.5D);
      }
      return (int)(R().i().p() / 4000.0F * ((GroupShape)localObject).getWidth() + 0.5D);
    }
    if (T())
    {
      switch (getPlacement())
      {
      case 2: 
        localObject = (Chart)N().i();
        i2 = ((Chart)localObject).getChartObject().getWidth();
        return (int)(i2 * (R().i().p() - R().i().j()) / 4000.0F + 0.5D);
      case 1: 
        return R().i().p();
      }
      return 0;
    }
    if ((getPlacement() == 1) || (getPlacement() == 0)) {
      return R().i().p();
    }
    int i1 = R().i().i();
    int i2 = R().i().o();
    int i3 = R().i().j();
    int i4 = R().i().p();
    int i5 = d(i1, i3, i2, i4);
    return i5;
  }
  
  public void setWidth(int value)
  {
    if (W()) {
      return;
    }
    if (T())
    {
      switch (getPlacement())
      {
      case 2: 
        Chart localChart = (Chart)N().i();
        i2 = (int)(4000.0F * value / localChart.getChartObject().getWidth() + 0.5D) + R().i().j();
        R().i().i(i2 > 4000 ? 4000 : i2);
        break;
      case 1: 
        R().i().i(value);
        break;
      }
      return;
    }
    if ((getPlacement() == 1) || (getPlacement() == 0))
    {
      R().i().i(value);
      return;
    }
    int i1 = R().i().i();
    int i2 = R().i().j();
    int[] arrayOfInt = b(i1, i2, value);
    R().i().h(arrayOfInt[0]);
    R().i().i(arrayOfInt[1]);
  }
  
  public double getWidthInch()
  {
    return zbxp.b(getWidth());
  }
  
  public void setWidthInch(double value)
  {
    setWidth(zbxp.a(value));
  }
  
  public double getWidthPt()
  {
    return getWidth() * 72.0F / zbxp.a();
  }
  
  public void setWidthPt(double value)
  {
    setWidth((int)(value * zbxp.a() / 72.0D + 0.5D));
  }
  
  public double getWidthCM()
  {
    return zbxp.a(getWidth());
  }
  
  public void setWidthCM(double value)
  {
    setWidth(zbxp.c(value));
  }
  
  public int getHeight()
  {
    Object localObject;
    if (W())
    {
      localObject = (GroupShape)this.n;
      i2 = ((GroupShape)localObject).getHeight();
      if (((GroupShape)localObject).I())
      {
        if ((this instanceof GroupShape))
        {
          if (I()) {
            return (int)(R().i().p() / 4000.0F * i2 + 0.5D);
          }
          return (int)(R().i().m() * ((GroupShape)localObject).getWidth() / 4000.0F + 0.5D);
        }
        return (int)(R().i().m() * ((GroupShape)localObject).getWidth() / 4000.0F + 0.5D);
      }
      if ((this instanceof GroupShape))
      {
        if (I()) {
          return (int)(R().i().p() * ((GroupShape)localObject).getWidth() / 4000.0F + 0.5D);
        }
        return (int)(R().i().m() * i2 / 4000.0F + 0.5D);
      }
      i3 = (int)(R().i().m() * i2 / 4000.0F + 0.5D);
      if (getMsoDrawingType() == 8)
      {
        if ((((GroupShape)localObject).getHeight() == 0) && ((((GroupShape)localObject).n instanceof GroupShape))) {
          i3 = (int)(((GroupShape)((GroupShape)localObject).n).getHeight() + R().i().g() / 4000.0F - ((GroupShape)((GroupShape)localObject).n).B().getLine().getWeight() - 0.5D);
        }
      }
      else if (getAutoShapeType() == 32)
      {
        i4 = Math.max(((GroupShape)localObject).getWidth(), i2);
        if (i3 > i4) {
          i3 = i4;
        }
      }
      return i3;
    }
    if (T())
    {
      switch (getPlacement())
      {
      case 2: 
        localObject = (Chart)N().i();
        i2 = ((Chart)localObject).getChartObject().getHeight();
        return (int)(i2 * (R().i().m() - R().i().g()) / 4000.0F + 0.5D);
      case 1: 
        return R().i().m();
      }
      return 0;
    }
    if ((getPlacement() == 1) || (getPlacement() == 0)) {
      return R().i().m();
    }
    int i1 = R().i().f();
    int i2 = R().i().l();
    int i3 = R().i().g();
    int i4 = R().i().m();
    int i5 = c(i1, i3, i2, i4);
    return i5;
  }
  
  public void setHeight(int value)
  {
    if (W()) {
      return;
    }
    if (T())
    {
      switch (getPlacement())
      {
      case 2: 
        Chart localChart = (Chart)N().i();
        i2 = (int)(4000.0F * value / localChart.getChartObject().getHeight() + 0.5D) + R().i().g();
        R().i().g(i2 > 4000 ? 4000 : i2);
        break;
      case 1: 
        R().i().g(value);
        break;
      }
      return;
    }
    if ((getPlacement() == 1) || (getPlacement() == 0))
    {
      R().i().g(value);
      return;
    }
    int i1 = R().i().f();
    int i2 = R().i().g();
    int[] arrayOfInt = a(i1, i2, value);
    R().i().f(arrayOfInt[0]);
    R().i().g(arrayOfInt[1]);
  }
  
  public double getHeightInch()
  {
    return zbxp.b(getHeight());
  }
  
  public void setHeightInch(double value)
  {
    setHeight(zbxp.a(value));
  }
  
  public double getHeightPt()
  {
    return getHeight() * 72.0F / zbxp.a();
  }
  
  public void setHeightPt(double value)
  {
    setHeight((int)(value * zbxp.a() / 72.0D + 0.5D));
  }
  
  public double getHeightCM()
  {
    return zbxp.a(getHeight());
  }
  
  public void setHeightCM(double value)
  {
    setHeight(zbxp.c(value));
  }
  
  public int getLeft()
  {
    return ab()[1];
  }
  
  public void setLeft(int value)
  {
    if (W()) {
      return;
    }
    if (T())
    {
      Chart localChart = (Chart)N().i();
      int i2 = (int)(value * 4000.0F / localChart.getChartObject().getWidth() + 0.5D);
      i2 = i2 > 4000 ? 4000 : i2;
      R().i().e(i2);
      return;
    }
    int i1 = getPlacement();
    setPlacement(1);
    R().i().e(value);
    setPlacement(i1);
  }
  
  public double getLeftInch()
  {
    return zbxp.b(getLeft());
  }
  
  public void setLeftInch(double value)
  {
    setLeft(zbxp.a(value));
  }
  
  public double getLeftCM()
  {
    return zbxp.a(getLeft());
  }
  
  public void setLeftCM(double value)
  {
    setLeft(zbxp.c(value));
  }
  
  public int getTop()
  {
    return aa()[1];
  }
  
  public void setTop(int value)
  {
    if (W()) {
      return;
    }
    if (T())
    {
      Chart localChart = (Chart)N().i();
      int i2 = (int)(value * 4000.0F / localChart.getChartObject().getHeight() + 0.5D);
      i2 = i2 > 4000 ? 4000 : i2;
      R().i().c(i2);
      return;
    }
    int i1 = getPlacement();
    setPlacement(1);
    R().i().c(value);
    setPlacement(i1);
  }
  
  public double getTopInch()
  {
    return zbxp.b(getTop());
  }
  
  public void setTopInch(double value)
  {
    setTop(zbxp.a(value));
  }
  
  public double getTopCM()
  {
    return zbxp.a(getTop());
  }
  
  public void setTopCM(double value)
  {
    setTop(zbxp.c(value));
  }
  
  public int getTopToCorner()
  {
    if (T()) {
      return 0;
    }
    if (W())
    {
      GroupShape localGroupShape = getGroup();
      return (int)(localGroupShape.getTopToCorner() + getTopInShape() / 4000.0F * localGroupShape.getHeight() + 0.5D);
    }
    if (getPlacement() == 0) {
      return R().i().g();
    }
    return c(0, 0, getUpperLeftRow(), getTop());
  }
  
  public void setTopToCorner(int value)
  {
    if ((T()) || (W())) {
      return;
    }
    int i1 = getPlacement();
    setPlacement(0);
    R().i().c(value);
    setPlacement(i1);
  }
  
  public int getLeftToCorner()
  {
    if (T()) {
      return 0;
    }
    if (W())
    {
      GroupShape localGroupShape = getGroup();
      return (int)(localGroupShape.getLeftToCorner() + getLeftInShape() / 4000.0F * localGroupShape.getWidth() + 0.5D);
    }
    if (getPlacement() == 0) {
      return R().i().j();
    }
    return d(0, 0, getUpperLeftColumn(), getLeft());
  }
  
  public void setLeftToCorner(int value)
  {
    if ((T()) || (W())) {
      return;
    }
    int i1 = getPlacement();
    setPlacement(0);
    R().i().e(value);
    setPlacement(i1);
  }
  
  public int getX()
  {
    return getLeftToCorner();
  }
  
  public void setX(int value)
  {
    setLeftToCorner(value);
  }
  
  public int getY()
  {
    return getTopToCorner();
  }
  
  public void setY(int value)
  {
    setTopToCorner(value);
  }
  
  public int getWidthScale()
  {
    if (getMsoDrawingType() == 8)
    {
      Picture localPicture = (Picture)this;
      zcf localzcf = localPicture.a();
      if (localzcf == null) {
        return 100;
      }
      return (int)(getWidth() * 100 / localzcf.k() + 0.5D);
    }
    return 100;
  }
  
  public void setWidthScale(int value)
  {
    if (W())
    {
      R().i().i((int)(R().i().p() * value / 100.0F + 0.5D));
      return;
    }
    if (getMsoDrawingType() == 8)
    {
      Picture localPicture = (Picture)this;
      zcf localzcf = localPicture.a();
      if (localzcf != null)
      {
        int i2 = (int)(localzcf.k() * value / 100.0F + 0.5D);
        setWidth(i2);
      }
    }
    else
    {
      int i1 = (int)(getWidth() * value / 100.0F + 0.5D);
      setWidth(i1);
    }
  }
  
  public int getHeightScale()
  {
    if (getMsoDrawingType() == 8)
    {
      Picture localPicture = (Picture)this;
      zcf localzcf = localPicture.a();
      if (localzcf == null) {
        return 100;
      }
      return (int)(getHeight() * 100 / localzcf.l() + 0.5D);
    }
    return 100;
  }
  
  public void setHeightScale(int value)
  {
    if (value <= 0) {
      throw new IllegalArgumentException("Invalid width scale: it must be greater than 0.");
    }
    if (W())
    {
      R().i().g(R().i().m() * value / 100);
      return;
    }
    if (getMsoDrawingType() == 8)
    {
      Picture localPicture = (Picture)this;
      zcf localzcf = localPicture.a();
      if (localzcf != null)
      {
        int i2 = (int)(localzcf.l() * value / 100.0F + 0.5D);
        setHeight(i2);
      }
    }
    else
    {
      int i1 = (int)(getHeight() * value / 100.0F + 0.5D);
      setHeight(i1);
    }
  }
  
  public int getTopInShape()
  {
    if ((T()) || (W())) {
      return R().i().g();
    }
    return 0;
  }
  
  public void setTopInShape(int value)
  {
    if ((T()) || (W()))
    {
      if ((value < 0) || (value > 4000)) {
        throw new IllegalArgumentException("Invalid TopInShape value : it must be between 0 and 4000.");
      }
      if (getPlacement() == 2)
      {
        int i1 = R().i().m() - R().i().g();
        R().i().c(value);
        R().i().g(value + i1);
      }
      else
      {
        R().i().c(value);
      }
    }
  }
  
  public int getLeftInShape()
  {
    if ((T()) || (W())) {
      return R().i().j();
    }
    return 0;
  }
  
  public void setLeftInShape(int value)
  {
    if ((T()) || (W()))
    {
      if ((value < 0) || (value > 4000)) {
        throw new IllegalArgumentException("Invalid TopInShape value : it must be between 0 and 4000.");
      }
      if (getPlacement() == 2)
      {
        int i1 = R().i().p() - R().i().j();
        R().i().e(value);
        R().i().i(i1 + value);
      }
      else
      {
        R().i().e(value);
      }
    }
  }
  
  public int getWidthInShape()
  {
    if (W()) {
      return R().i().p();
    }
    if (T())
    {
      if (getPlacement() == 1)
      {
        Chart localChart = (Chart)N().i();
        int i1 = (int)(R().i().p() * 4000.0F / localChart.getChartObject().getWidth() + 0.5D);
        return i1 > 4000 ? 4000 : i1;
      }
      return R().i().p() - R().i().j();
    }
    return 0;
  }
  
  public void setWidthInShape(int value)
  {
    if ((value < 0) || (value > 4000)) {
      throw new IllegalArgumentException("Invalid TopInShape value : it must be between 0 and 4000.");
    }
    if (W()) {
      R().i().i(value);
    }
    if (T()) {
      if (getPlacement() == 1)
      {
        Chart localChart = (Chart)N().i();
        R().i().i((int)(value * localChart.getChartObject().getWidth() / 4000.0F + 0.5D));
      }
      else
      {
        R().i().i(value + R().i().j());
      }
    }
  }
  
  public int getHeightInShape()
  {
    if (W()) {
      return R().i().m();
    }
    if (T())
    {
      if (getPlacement() == 1)
      {
        Chart localChart = (Chart)N().i();
        int i1 = (int)(R().i().m() * 4000.0F / localChart.getChartObject().getHeight() + 0.5D);
        return i1 > 4000 ? 4000 : i1;
      }
      return R().i().m() - R().i().g();
    }
    return 0;
  }
  
  public void setHeightInShape(int value)
  {
    if ((value < 0) || (value > 4000)) {
      throw new IllegalArgumentException("Invalid TopInShape value : it must be between 0 and 4000.");
    }
    if (W()) {
      R().i().g(value);
    }
    if (T()) {
      if (getPlacement() == 1)
      {
        Chart localChart = (Chart)N().i();
        int i1 = (int)(value * 4000.0F / localChart.getChartObject().getHeight() + 0.5D);
        R().i().g(i1);
      }
      else
      {
        R().i().g(value + R().i().g());
      }
    }
  }
  
  /**
   * @deprecated
   */
  public int getHeightInChart()
  {
    return getHeightInShape();
  }
  
  /**
   * @deprecated
   */
  public void setHeightInChart(int value)
  {
    setHeightInShape(value);
  }
  
  /**
   * @deprecated
   */
  public int getLeftInChart()
  {
    return getLeftInShape();
  }
  
  /**
   * @deprecated
   */
  public void setLeftInChart(int value)
  {
    setLeftInShape(value);
  }
  
  /**
   * @deprecated
   */
  public int getTopInChart()
  {
    return getTopInShape();
  }
  
  /**
   * @deprecated
   */
  public void setTopInChart(int value)
  {
    setTopInShape(value);
  }
  
  /**
   * @deprecated
   */
  public int getWidthInChart()
  {
    return getWidthInShape();
  }
  
  /**
   * @deprecated
   */
  public void setWidthInChart(int value)
  {
    setWidthInShape(value);
  }
  
  /**
   * @deprecated
   */
  public int getPositionX()
  {
    return getX();
  }
  
  /**
   * @deprecated
   */
  public void setPositionX(int value)
  {
    setX(value);
  }
  
  /**
   * @deprecated
   */
  public int getPositionY()
  {
    return getY();
  }
  
  /**
   * @deprecated
   */
  public void setPositionY(int value)
  {
    setY(value);
  }
  
  public GroupShape getGroup()
  {
    if (W()) {
      return (GroupShape)this.n;
    }
    return null;
  }
  
  public int getType()
  {
    return getAutoShapeType();
  }
  
  public boolean hasLine()
  {
    return ac();
  }
  
  public void setHasLine(boolean value)
  {
    d(value);
  }
  
  boolean ac()
  {
    if ((this.r) && ((this.q == null) || (this.q.b == null)))
    {
      MsoLineFormatHelper localMsoLineFormatHelper = new MsoLineFormatHelper(this);
      return localMsoLineFormatHelper.isVisible();
    }
    return B().getLine().getFillType() != 1;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (!ac()) {
        B().getLine().setFillType(2);
      }
    }
    else {
      B().getLine().setFillType(1);
    }
  }
  
  public boolean isFilled()
  {
    return getFill().getFillType() != 1;
  }
  
  public void setFilled(boolean value)
  {
    if (value)
    {
      if (getFill().getFillType() == 1) {
        getFill().setFillType(0);
      }
    }
    else {
      getFill().setFillType(1);
    }
  }
  
  public boolean isFlippedHorizontally()
  {
    return R().j().f();
  }
  
  public void setFlippedHorizontally(boolean value)
  {
    R().j().f(value);
  }
  
  public boolean isFlippedVertically()
  {
    return R().j().e();
  }
  
  public void setFlippedVertically(boolean value)
  {
    R().j().e(value);
  }
  
  int[] a(int paramInt1, int paramInt2, int paramInt3)
  {
    zajb localzajb = Q().getCells().getRows().b;
    if (paramInt2 != 0)
    {
      int i1 = localzajb.a(paramInt1);
      if (paramInt3 < 0)
      {
        if (paramInt2 >= i1) {
          paramInt2 = i1;
        }
        paramInt2 += paramInt3;
        if (paramInt2 >= 0) {
          return new int[] { paramInt1, paramInt2 };
        }
        paramInt3 = paramInt2;
        paramInt1--;
        if (paramInt1 < 0) {
          return new int[] { 0, 0 };
        }
      }
      else
      {
        if (paramInt2 < i1)
        {
          i1 -= paramInt2;
          if (i1 > paramInt3) {
            return new int[] { paramInt1, paramInt2 + paramInt3 };
          }
          paramInt3 -= i1;
        }
        paramInt1++;
      }
      paramInt2 = 0;
    }
    if (paramInt3 == 0) {
      return new int[] { paramInt1, paramInt2 };
    }
    int[] arrayOfInt;
    if (this.v)
    {
      arrayOfInt = new int[] { paramInt1, (int)(zbxz.b(paramInt2) * 20.0F), (int)(zbxz.b(paramInt3) * 20.0F) };
      localzajb.b(arrayOfInt);
      arrayOfInt[1] = ((int)zbxz.c(arrayOfInt[1] / 20.0F));
      arrayOfInt[2] = ((int)zbxz.c(arrayOfInt[2] / 20.0F));
    }
    else
    {
      arrayOfInt = new int[] { paramInt1, paramInt2, paramInt3 };
      localzajb.a(arrayOfInt);
      if (arrayOfInt[0] > 1048575) {
        arrayOfInt[0] = 1048575;
      }
    }
    if ((paramInt3 > 0) && (arrayOfInt[2] == 0)) {
      return new int[] { arrayOfInt[0] + 1, 0 };
    }
    return new int[] { arrayOfInt[0], arrayOfInt[1] };
  }
  
  double[] a(int paramInt, double paramDouble1, double paramDouble2)
  {
    zajb localzajb = Q().getCells().getRows().b;
    if (paramDouble1 != 0.0D)
    {
      i1 = localzajb.a(paramInt);
      if (paramDouble2 < 0.0D)
      {
        if (paramDouble1 >= i1) {
          paramDouble1 = i1;
        }
        paramDouble1 += paramDouble2;
        if (paramDouble1 >= 0.0D) {
          return new double[] { paramInt, paramDouble1 };
        }
        paramDouble2 = paramDouble1;
        paramInt--;
        if (paramInt < 0) {
          return new double[] { 0.0D, 0.0D };
        }
      }
      else
      {
        if (paramDouble1 < i1)
        {
          paramDouble1 = i1 - paramDouble1;
          if (paramDouble1 > paramDouble2) {
            return new double[] { paramInt, i1 - paramDouble1 + paramDouble2 };
          }
          paramDouble2 -= paramDouble1;
        }
        paramInt++;
      }
      paramDouble1 = 0.0D;
    }
    if (paramDouble2 == 0.0D) {
      return new double[] { paramInt, paramDouble1 };
    }
    int[] arrayOfInt;
    if (paramDouble2 < 0.0D)
    {
      i1 = -(int)Math.ceil(-paramDouble2);
      if (this.v)
      {
        arrayOfInt = new int[] { paramInt, 0, (int)(zbxz.b(i1) * 20.0F) };
        Q().getCells().getRows().b.b(arrayOfInt);
        arrayOfInt[1] = ((int)zbxz.c(arrayOfInt[1] / 20.0F));
        arrayOfInt[2] = ((int)zbxz.c(arrayOfInt[2] / 20.0F));
      }
      else
      {
        arrayOfInt = new int[] { paramInt, 0, i1 };
        Q().getCells().getRows().b.a(arrayOfInt);
        if (arrayOfInt[0] > 1048575) {
          arrayOfInt[0] = 1048575;
        }
      }
      return new double[] { arrayOfInt[0], arrayOfInt[1] - (i1 - paramDouble2) };
    }
    int i1 = (int)Math.ceil(paramDouble2);
    if (this.v)
    {
      arrayOfInt = new int[] { paramInt, 0, (int)(zbxz.b(i1) * 20.0F) };
      Q().getCells().getRows().b.b(arrayOfInt);
      arrayOfInt[1] = ((int)zbxz.c(arrayOfInt[1] / 20.0F));
      arrayOfInt[2] = ((int)zbxz.c(arrayOfInt[2] / 20.0F));
    }
    else
    {
      arrayOfInt = new int[] { paramInt, 0, i1 };
      Q().getCells().getRows().b.a(arrayOfInt);
      if (arrayOfInt[0] > 1048575) {
        arrayOfInt[0] = 1048575;
      }
    }
    if ((paramDouble2 > 0.0D) && (arrayOfInt[2] == 0)) {
      return new double[] { arrayOfInt[0] + 1, 0.0D };
    }
    return new double[] { arrayOfInt[0], arrayOfInt[1] - (i1 - paramDouble2) };
  }
  
  int c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt1 > paramInt3) {
      return 0;
    }
    zajb localzajb = Q().getCells().getRows().b;
    int i1 = localzajb.a(paramInt1);
    if (paramInt3 == paramInt1)
    {
      if (paramInt2 < i1)
      {
        if (paramInt4 > i1) {
          return i1 - paramInt2;
        }
        if (paramInt4 > paramInt2) {
          return paramInt4 - paramInt2;
        }
      }
      return 0;
    }
    if (paramInt2 >= i1) {
      paramInt2 = 0;
    } else {
      paramInt2 = i1 - paramInt2;
    }
    paramInt1++;
    i1 = localzajb.a(paramInt3);
    if (paramInt4 > i1) {
      paramInt4 = i1;
    }
    if (paramInt1 == paramInt3) {
      return paramInt2 + paramInt4;
    }
    if (this.v) {
      return (int)zbxz.d(localzajb.b(paramInt1, paramInt3 - 1)) + paramInt2 + paramInt4;
    }
    return localzajb.a(paramInt1, paramInt3 - 1) + paramInt2 + paramInt4;
  }
  
  double a(int paramInt1, double paramDouble1, int paramInt2, double paramDouble2)
  {
    if (paramInt1 > paramInt2) {
      return 0.0D;
    }
    zajb localzajb = Q().getCells().getRows().b;
    int i1 = localzajb.a(paramInt1);
    if (paramInt2 == paramInt1)
    {
      if (paramDouble1 < i1)
      {
        if (paramDouble2 > i1) {
          return i1 - paramDouble1;
        }
        if (paramDouble2 > paramDouble1) {
          return paramDouble2 - paramDouble1;
        }
      }
      return 0.0D;
    }
    if (paramDouble1 >= i1) {
      paramDouble1 = 0.0D;
    } else {
      paramDouble1 = i1 - paramDouble1;
    }
    paramInt1++;
    i1 = localzajb.a(paramInt2);
    if (paramDouble2 > i1) {
      paramDouble2 = i1;
    }
    if (paramInt1 == paramInt2) {
      return paramDouble1 + paramDouble2;
    }
    return localzajb.a(paramInt1, paramInt2 - 1) + paramDouble1 + paramDouble2;
  }
  
  int d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt3 < paramInt1) {
      return 0;
    }
    zahq localzahq = Q().getCells().b;
    int i1 = localzahq.a(paramInt1);
    if (paramInt3 == paramInt1)
    {
      if (paramInt2 < i1)
      {
        if (paramInt4 > i1) {
          return i1 - paramInt2;
        }
        if (paramInt4 > paramInt2) {
          return paramInt4 - paramInt2;
        }
      }
      return 0;
    }
    if (paramInt2 >= i1) {
      paramInt2 = 0;
    } else {
      paramInt2 = i1 - paramInt2;
    }
    paramInt1++;
    i1 = localzahq.a(paramInt3);
    if (paramInt4 > i1) {
      paramInt4 = i1;
    }
    if (paramInt1 == paramInt3) {
      return paramInt2 + paramInt4;
    }
    return localzahq.b(paramInt1, paramInt3 - 1) + paramInt2 + paramInt4;
  }
  
  double b(int paramInt1, double paramDouble1, int paramInt2, double paramDouble2)
  {
    if (paramInt2 < paramInt1) {
      return 0.0D;
    }
    zahq localzahq = Q().getCells().b;
    int i1 = localzahq.a(paramInt1);
    if (paramInt2 == paramInt1)
    {
      if (paramDouble1 < i1)
      {
        if (paramDouble2 > i1) {
          return i1 - paramDouble1;
        }
        if (paramDouble2 > paramDouble1) {
          return paramDouble2 - paramDouble1;
        }
      }
      return 0.0D;
    }
    if (paramDouble1 >= i1) {
      paramDouble1 = 0.0D;
    } else {
      paramDouble1 = i1 - paramDouble1;
    }
    paramInt1++;
    i1 = localzahq.a(paramInt2);
    if (paramDouble2 > i1) {
      paramDouble2 = i1;
    }
    if (paramInt1 == paramInt2) {
      return paramDouble1 + paramDouble2;
    }
    return localzahq.b(paramInt1, paramInt2 - 1) + paramDouble1 + paramDouble2;
  }
  
  int[] b(int paramInt1, int paramInt2, int paramInt3)
  {
    zahq localzahq = Q().getCells().b;
    if (paramInt2 != 0)
    {
      int i1 = localzahq.a(paramInt1);
      if (paramInt3 < 0)
      {
        if (paramInt2 >= i1) {
          paramInt2 = i1;
        }
        paramInt2 += paramInt3;
        if (paramInt2 >= 0) {
          return new int[] { paramInt1, paramInt2 };
        }
        paramInt3 = paramInt2;
        paramInt1--;
        if (paramInt1 < 0) {
          return new int[] { 0, 0 };
        }
      }
      else
      {
        if (paramInt2 < i1)
        {
          i1 -= paramInt2;
          if (i1 > paramInt3) {
            return new int[] { paramInt1, paramInt2 + paramInt3 };
          }
          paramInt3 -= i1;
        }
        paramInt1++;
      }
      paramInt2 = 0;
    }
    if (paramInt3 == 0) {
      return new int[] { paramInt1, paramInt2 };
    }
    int[] arrayOfInt = { paramInt1, paramInt2, paramInt3 };
    localzahq.a(arrayOfInt);
    if (arrayOfInt[0] > 16383) {
      arrayOfInt[0] = 16383;
    }
    if ((paramInt3 > 0) && (arrayOfInt[2] == 0)) {
      return new int[] { arrayOfInt[0] + 1, 0 };
    }
    return new int[] { arrayOfInt[0], arrayOfInt[1] };
  }
  
  double[] b(int paramInt, double paramDouble1, double paramDouble2)
  {
    zahq localzahq = Q().getCells().b;
    if (paramDouble1 != 0.0D)
    {
      i1 = localzahq.a(paramInt);
      if (paramDouble2 < 0.0D)
      {
        if (paramDouble1 >= i1) {
          paramDouble1 = i1;
        }
        paramDouble1 += paramDouble2;
        if (paramDouble1 >= 0.0D) {
          return new double[] { paramInt, paramDouble1 };
        }
        paramDouble2 = paramDouble1;
        paramInt--;
        if (paramInt < 0) {
          return new double[] { 0.0D, 0.0D };
        }
      }
      else
      {
        if (paramDouble1 < i1)
        {
          paramDouble1 = i1 - paramDouble1;
          if (paramDouble1 > paramDouble2) {
            return new double[] { paramInt, i1 - paramDouble1 + paramDouble2 };
          }
          paramDouble2 -= paramDouble1;
        }
        paramInt++;
      }
      paramDouble1 = 0.0D;
    }
    if (paramDouble2 == 0.0D) {
      return new double[] { paramInt, paramDouble1 };
    }
    if (paramDouble2 < 0.0D)
    {
      i1 = -(int)Math.ceil(-paramDouble2);
      arrayOfInt = new int[] { paramInt, 0, i1 };
      Q().getCells().b.a(arrayOfInt);
      return new double[] { arrayOfInt[0], arrayOfInt[1] - (i1 - paramDouble2) };
    }
    int i1 = (int)Math.ceil(paramDouble2);
    int[] arrayOfInt = { paramInt, 0, i1 };
    Q().getCells().b.a(arrayOfInt);
    if (arrayOfInt[0] > 16383) {
      arrayOfInt[0] = 16383;
    }
    if ((arrayOfInt[2] == 0) && (paramDouble2 == i1)) {
      return new double[] { arrayOfInt[0] + 1, 0.0D };
    }
    return new double[] { arrayOfInt[0], arrayOfInt[1] - (i1 - paramDouble2) };
  }
  
  int a(int paramInt, double paramDouble)
  {
    double d1 = Q().getCells().d(paramInt);
    d1 = (int)(paramDouble / d1 * zkx.a + 0.5D);
    return (int)(d1 > zkx.a ? zkx.a : d1);
  }
  
  int b(int paramInt, double paramDouble)
  {
    double d1 = Q().getCells().c(paramInt);
    d1 = (int)(paramDouble / d1 * zkx.b + 0.5D);
    return (int)(d1 > zkx.b ? zkx.b : d1);
  }
  
  double a(int paramInt1, int paramInt2)
  {
    double d1 = Q().getCells().d(paramInt1);
    if (paramInt2 >= zkx.a) {
      return d1;
    }
    return paramInt2 * d1 / zkx.a;
  }
  
  double b(int paramInt1, int paramInt2)
  {
    double d1 = Q().getCells().c(paramInt1);
    if (paramInt2 >= zkx.b) {
      return d1;
    }
    return paramInt2 * d1 / zkx.b;
  }
  
  private boolean b()
  {
    return (getMsoDrawingType() == 5) && (this == Q().getCharts().get(0).getChartObject()) && (Q().getType() == 2);
  }
  
  int a(byte[] paramArrayOfByte, int paramInt, zbrf paramzbrf)
  {
    paramArrayOfByte[(paramInt + 2)] = 15;
    paramArrayOfByte[(paramInt + 3)] = -16;
    paramArrayOfByte[(paramInt + 4)] = 16;
    paramInt += 8;
    int i1 = R().i().j();
    int i2 = R().i().g();
    int i3 = R().i().p();
    int i4 = R().i().m();
    if ((C()) && (R().i().c != null))
    {
      i1 = R().i().c.b;
      i2 = R().i().c.c;
      i3 = R().i().c.e + i1;
      i4 = R().i().c.d + i2;
    }
    else
    {
      i1 = paramzbrf.a + (int)(paramzbrf.b * (i1 / 4000.0F) + 0.5D);
      i2 = paramzbrf.c + (int)(paramzbrf.d * (i2 / 4000.0F) + 0.5D);
      i3 = (int)(paramzbrf.b * (i3 / 4000.0F) + 0.5D) + i1;
      i4 = (int)(paramzbrf.d * (i4 / 4000.0F) + 0.5D) + i2;
    }
    System.arraycopy(zc.a(i1), 0, paramArrayOfByte, paramInt, 4);
    paramInt += 4;
    System.arraycopy(zc.a(i2), 0, paramArrayOfByte, paramInt, 4);
    paramInt += 4;
    System.arraycopy(zc.a(i3), 0, paramArrayOfByte, paramInt, 4);
    paramInt += 4;
    System.arraycopy(zc.a(i4), 0, paramArrayOfByte, paramInt, 4);
    paramInt += 4;
    paramArrayOfByte[(paramInt + 2)] = 17;
    paramArrayOfByte[(paramInt + 3)] = -16;
    paramInt += 8;
    return 32;
  }
  
  int a(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte[(paramInt + 2)] = 16;
    paramArrayOfByte[(paramInt + 3)] = -16;
    paramArrayOfByte[(paramInt + 4)] = 18;
    paramInt += 8;
    switch (R().i().e())
    {
    case 0: 
      paramArrayOfByte[paramInt] = 3;
      break;
    case 1: 
      paramArrayOfByte[paramInt] = 2;
      break;
    default: 
      if (R().i().b()) {
        paramArrayOfByte[paramInt] = 1;
      }
      break;
    }
    zkx localzkx = new zkx(R());
    localzkx.a(R().i());
    setPlacement(2);
    paramInt += 2;
    if (T())
    {
      int[] arrayOfInt = c(false);
      System.arraycopy(zc.a(arrayOfInt[0]), 0, paramArrayOfByte, paramInt, 4);
      paramInt += 4;
      System.arraycopy(zc.a(arrayOfInt[1]), 0, paramArrayOfByte, paramInt, 4);
      paramInt += 4;
      System.arraycopy(zc.a(arrayOfInt[2]), 0, paramArrayOfByte, paramInt, 4);
      paramInt += 4;
      System.arraycopy(zc.a(arrayOfInt[3]), 0, paramArrayOfByte, paramInt, 4);
      paramInt += 4;
    }
    else
    {
      paramInt = b(paramArrayOfByte, paramInt);
    }
    R().i().a(localzkx);
    paramArrayOfByte[(paramInt + 2)] = 17;
    paramArrayOfByte[(paramInt + 3)] = -16;
    paramInt += 8;
    return 34;
  }
  
  int b(byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = R().i().i();
    int i2 = getUpperDeltaX();
    if (i1 > 255)
    {
      paramArrayOfByte[paramInt] = -1;
      paramArrayOfByte[(paramInt + 1)] = 0;
      paramArrayOfByte[(paramInt + 2)] = 0;
      paramArrayOfByte[(paramInt + 3)] = 4;
    }
    else
    {
      System.arraycopy(zc.a(i1), 0, paramArrayOfByte, paramInt, 2);
      System.arraycopy(zc.a(i2), 0, paramArrayOfByte, paramInt + 2, 2);
    }
    paramInt += 4;
    int i3 = R().i().f();
    int i4 = getUpperDeltaY();
    if (i3 > 65535)
    {
      paramArrayOfByte[paramInt] = -1;
      paramArrayOfByte[(paramInt + 1)] = -1;
      paramArrayOfByte[(paramInt + 2)] = 0;
      paramArrayOfByte[(paramInt + 3)] = 1;
    }
    else
    {
      System.arraycopy(zc.a(i3), 0, paramArrayOfByte, paramInt, 2);
      System.arraycopy(zc.a(i4), 0, paramArrayOfByte, paramInt + 2, 2);
    }
    paramInt += 4;
    int i5 = R().i().o();
    int i6 = getLowerDeltaX();
    if (i5 > 255)
    {
      paramArrayOfByte[paramInt] = -1;
      paramArrayOfByte[(paramInt + 1)] = 0;
      paramArrayOfByte[(paramInt + 2)] = 0;
      paramArrayOfByte[(paramInt + 3)] = 4;
    }
    else
    {
      System.arraycopy(zc.a(i5), 0, paramArrayOfByte, paramInt, 2);
      System.arraycopy(zc.a(i6), 0, paramArrayOfByte, paramInt + 2, 2);
    }
    paramInt += 4;
    int i7 = R().i().l();
    int i8 = getLowerDeltaY();
    if (i7 > 65535)
    {
      paramArrayOfByte[paramInt] = -1;
      paramArrayOfByte[(paramInt + 1)] = -1;
      paramArrayOfByte[(paramInt + 2)] = 0;
      paramArrayOfByte[(paramInt + 3)] = 1;
    }
    else
    {
      System.arraycopy(zc.a(i7), 0, paramArrayOfByte, paramInt, 2);
      System.arraycopy(zc.a(i8), 0, paramArrayOfByte, paramInt + 2, 2);
    }
    paramInt += 4;
    return paramInt;
  }
  
  GroupBox getGroupBox()
  {
    int i1 = getPlacement();
    setPlacement(2);
    int i2 = getUpperLeftRow();
    int i3 = getTop();
    int i4 = getUpperLeftColumn();
    int i5 = getLeft();
    int i6 = getLowerRightRow();
    int i7 = getBottom();
    int i8 = getLowerRightColumn();
    int i9 = getRight();
    setPlacement(i1);
    int i10 = -1;
    int i11 = -1;
    int i12 = -1;
    int i13 = -1;
    Iterator localIterator = N().iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      if (localShape.getMsoDrawingType() == 19) {
        switch (localShape.getPlacement())
        {
        case 0: 
          if (i10 == -1)
          {
            i10 = getTopToCorner();
            i11 = getLeftToCorner();
            i12 = i11 + getWidth();
            i13 = i10 + getHeight();
          }
          int i14 = localShape.getTopToCorner();
          int i15 = localShape.getLeftToCorner();
          int i16 = i15 + localShape.getWidth();
          int i17 = i14 + localShape.getHeight();
          if ((i10 >= i14) && (i13 <= i17) && (i11 >= i15) && (i12 <= i16)) {
            return (GroupBox)localShape;
          }
          break;
        case 1: 
        case 2: 
          int i18 = localShape.getUpperLeftRow();
          i10 = localShape.getTop();
          int i19 = localShape.getUpperLeftColumn();
          i11 = localShape.getLeft();
          if (((i2 > i18) || ((i2 == i18) && (i3 >= i10))) && ((i4 > i19) || ((i4 == i19) && (i5 >= i11))))
          {
            i1 = localShape.getPlacement();
            localShape.setPlacement(2);
            int i20 = localShape.getLowerRightRow();
            i13 = localShape.getBottom();
            int i21 = localShape.getLowerRightColumn();
            i12 = localShape.getRight();
            localShape.setPlacement(i1);
            if (((i6 < i20) || ((i6 == i20) && (i7 <= i13))) && ((i8 < i21) || ((i8 == i21) && (i9 <= i12)))) {
              return (GroupBox)localShape;
            }
          }
          break;
        }
      }
    }
    return null;
  }
  
  public void toImage(OutputStream stream, ImageFormat imageFormat)
    throws Exception
  {
    ImageOrPrintOptions localImageOrPrintOptions = new ImageOrPrintOptions();
    localImageOrPrintOptions.setImageFormat(imageFormat);
    toImage(stream, localImageOrPrintOptions);
  }
  
  public void toImage(String imageFile, ImageOrPrintOptions options)
    throws Exception
  {
    ImageOrPrintOptions localImageOrPrintOptions = new ImageOrPrintOptions();
    if (options != null) {
      localImageOrPrintOptions.a(options);
    }
    String str = zk.d(imageFile);
    str = str.toLowerCase();
    if (".svg".equals(str)) {
      localImageOrPrintOptions.setSaveFormat(22);
    }
    if (".xps".equals(str))
    {
      localImageOrPrintOptions.setSaveFormat(20);
    }
    else
    {
      localObject1 = zbxz.a(str, localImageOrPrintOptions.getImageFormat());
      localImageOrPrintOptions.setImageFormat((ImageFormat)localObject1);
    }
    Object localObject1 = new com.aspose.cells.b.a.d.ze(imageFile, 2);
    try
    {
      a((zm)localObject1, localImageOrPrintOptions);
    }
    finally
    {
      if (localObject1 != null) {
        ((com.aspose.cells.b.a.d.ze)localObject1).a();
      }
    }
  }
  
  public void toImage(OutputStream stream, ImageOrPrintOptions options)
    throws Exception
  {
    zh localzh = new zh();
    try
    {
      a(localzh, options);
      localzh.a(0L, 0);
      localzh.a(stream);
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  void a(zm paramzm, ImageOrPrintOptions paramImageOrPrintOptions)
    throws Exception
  {
    if (paramImageOrPrintOptions == null) {
      paramImageOrPrintOptions = new ImageOrPrintOptions();
    }
    if ((paramImageOrPrintOptions.getSaveFormat() == 22) || (paramImageOrPrintOptions.getSaveFormat() == 20))
    {
      zb localzb = ad();
      zt localzt = ae().e();
      zbxz.a(paramzm, localzb, paramImageOrPrintOptions, (int)Math.ceil(localzt.b()), (int)Math.ceil(localzt.c()));
    }
    else if ((P().p().g()) || (C()))
    {
      zbor.a(paramzm, paramImageOrPrintOptions, this);
    }
    else
    {
      zboq.a(paramzm, paramImageOrPrintOptions, this);
    }
  }
  
  zb ad()
    throws Exception
  {
    if ((P().p().g()) || (C())) {
      return zbor.b(this);
    }
    return zboq.b(this);
  }
  
  zq ae()
    throws Exception
  {
    if (!this.t)
    {
      if ((P().p().g()) || (C())) {
        this.c = zbor.a(this);
      } else {
        this.c = zboq.a(this);
      }
      this.t = true;
    }
    return this.c;
  }
  
  public boolean getRelativeToOriginalPictureSize()
  {
    return R().d().a(831, 4, true);
  }
  
  public void setRelativeToOriginalPictureSize(boolean value)
  {
    R().d().b(831, 4, value);
  }
  
  byte[] af()
  {
    return this.m_linkedCell;
  }
  
  void c(byte[] paramArrayOfByte)
  {
    this.m_linkedCell = paramArrayOfByte;
  }
  
  Cell e(boolean paramBoolean)
  {
    if (this.m_linkedCell != null)
    {
      Range localRange = d(this.m_linkedCell);
      if (localRange != null)
      {
        if (paramBoolean) {
          return localRange.get(0, 0);
        }
        return localRange.getCellOrNull(0, 0);
      }
    }
    return null;
  }
  
  Range d(byte[] paramArrayOfByte)
  {
    return zabx.b(3, this, true, paramArrayOfByte, 0, paramArrayOfByte.length - 1, 0, 0, P(), Q().getIndex());
  }
  
  public String getLinkedCell()
  {
    if (this.m_linkedCell == null) {
      return null;
    }
    String str = P().d().a(0, this.m_linkedCell.length, this.m_linkedCell, 0, 0, false, false);
    if ((str != null) && (!"".equals(str)) && (str.charAt(0) == '=')) {
      return str.substring(1);
    }
    return str;
  }
  
  public void setLinkedCell(String value)
  {
    this.m_linkedCell = d(value);
    if (getMsoDrawingType() == 20)
    {
      ComboBox localComboBox = (ComboBox)this;
      localComboBox.a = null;
    }
  }
  
  byte[] d(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return null;
    }
    return P().y().a(Q().getIndex(), paramString, 0, 0, 0, 32, false, false, false);
  }
  
  Range ag()
  {
    return d(this.w);
  }
  
  public String getInputRange()
  {
    if (this.w == null) {
      return null;
    }
    String str = P().d().a(0, this.w.length, this.w, 0, 0, false, false);
    if ((str != null) && (!"".equals(str)) && (str.charAt(0) == '=')) {
      return str.substring(1);
    }
    return str;
  }
  
  public void setInputRange(String value)
  {
    this.w = d(value);
    if ((this instanceof ComboBox)) {
      ((ComboBox)this).a = null;
    }
  }
  
  byte[] ah()
  {
    return this.w;
  }
  
  void e(byte[] paramArrayOfByte)
  {
    this.w = paramArrayOfByte;
  }
  
  boolean i(int paramInt)
  {
    if ((this.m_linkedCell != null) && (zaaq.a(this.m_linkedCell, 0, this.m_linkedCell.length - 1, paramInt, P()))) {
      return true;
    }
    if ((this.w != null) && (zaaq.a(this.w, 0, this.w.length - 1, paramInt, P()))) {
      return true;
    }
    return (this.l != null) && (this.l.a(P(), paramInt));
  }
  
  public void updateSelectedValue()
    throws Exception
  {
    int i8;
    Object localObject5;
    if (getMsoDrawingType() == 8)
    {
      Object localObject2;
      Object localObject3;
      if (this.y != null)
      {
        localObject1 = d(this.y);
        if (localObject1 != null)
        {
          localObject2 = (Picture)this;
          localObject3 = ((Picture)localObject2).getImageFormat();
          ((Picture)localObject2).setData(null);
          int i1 = P().getActiveSheetIndex();
          Worksheet localWorksheet = ((Range)localObject1).getWorksheet();
          int i3 = localWorksheet.getVisibilityType();
          localWorksheet.setVisibilityType(0);
          String str = localWorksheet.getPageSetup().getPrintArea();
          localWorksheet.getPageSetup().setPrintArea(((Range)localObject1).c());
          ImageOrPrintOptions localImageOrPrintOptions2 = new ImageOrPrintOptions();
          i8 = zbxp.a();
          localImageOrPrintOptions2.setHorizontalResolution(i8);
          localImageOrPrintOptions2.setVerticalResolution(i8);
          localImageOrPrintOptions2.setOnlyArea(true);
          localImageOrPrintOptions2.setOnePagePerSheet(true);
          localImageOrPrintOptions2.setTransparent(true);
          localImageOrPrintOptions2.setImageFormat((ImageFormat)localObject3);
          localImageOrPrintOptions2.f = true;
          localImageOrPrintOptions2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
          SheetRender localSheetRender = new SheetRender(localWorksheet, localImageOrPrintOptions2);
          zh localzh2 = new zh();
          localSheetRender.a(0, localzh2);
          if (localzh2.h() > 0L)
          {
            ((Picture)localObject2).c = true;
            ((Picture)localObject2).setData(localzh2.o());
          }
          localzh2.a();
          ((Range)localObject1).getWorksheet().getPageSetup().setPrintArea(str);
          localWorksheet.setVisibilityType(i3);
          if (i1 != P().getActiveSheetIndex()) {
            P().setActiveSheetIndex(i1);
          }
        }
      }
      else
      {
        localObject1 = getActiveXControl();
        if (localObject1 != null)
        {
          localObject2 = e(false);
          if (localObject2 == null) {
            return;
          }
          localObject3 = ((Cell)localObject2).k();
          switch (((ActiveXControl)localObject1).getType())
          {
          case 1: 
            ((ComboBoxActiveXControl)localObject1).setValue((String)localObject3);
            break;
          case 3: 
            ((ListBoxActiveXControl)localObject1).setValue((String)localObject3);
            break;
          case 2: 
            localObject4 = (CheckBoxActiveXControl)localObject1;
            switch (((Cell)localObject2).getType())
            {
            case 1: 
            case 4: 
              double d2 = Math.ceil(((Cell)localObject2).getDoubleValue());
              ((CheckBoxActiveXControl)localObject4).setValue(d2 != 0.0D ? 1 : 0);
              break;
            case 0: 
              boolean bool3 = ((Cell)localObject2).getBoolValue();
              ((CheckBoxActiveXControl)localObject4).setValue(bool3 ? 1 : 0);
              break;
            case 2: 
              boolean bool4 = "#N/A".equals(((Cell)localObject2).k());
              if (bool4) {
                ((CheckBoxActiveXControl)localObject4).setValue(2);
              }
              break;
            }
            break;
          case 6: 
            break;
          }
          if (a((ActiveXControl)localObject1))
          {
            localObject4 = (Picture)this;
            localObject5 = ((Picture)localObject4).getImageFormat();
            ImageOrPrintOptions localImageOrPrintOptions1 = new ImageOrPrintOptions();
            localImageOrPrintOptions1.setImageFormat((ImageFormat)localObject5);
            localImageOrPrintOptions1.f = true;
            zh localzh1 = new zh();
            ((Picture)localObject4).a(localzh1, localImageOrPrintOptions1);
            if (localzh1.h() > 0L) {
              ((Picture)localObject4).setData(localzh1.o());
            }
            localzh1.a();
          }
        }
      }
      return;
    }
    Object localObject1 = e(false);
    if (localObject1 == null) {
      return;
    }
    double d1 = 0.0D;
    Object localObject4 = ((Cell)localObject1).k();
    switch (((Cell)localObject1).getType())
    {
    case 1: 
    case 4: 
      d1 = Math.floor(((Cell)localObject1).getDoubleValue());
      if (d1 < 0.0D) {
        d1 = 0.0D;
      }
      break;
    case 0: 
      d1 = ((Cell)localObject1).getBoolValue() ? 1.0D : 0.0D;
    }
    int i6;
    Object localObject6;
    int i5;
    switch (getMsoDrawingType())
    {
    case 30: 
      if (isWordArt()) {
        getTextEffect().setText((String)localObject4);
      }
      getTextBody().setText((String)localObject4);
      break;
    case 2: 
    case 3: 
    case 4: 
    case 6: 
      getTextBody().setText((String)localObject4);
      break;
    case 20: 
      localObject5 = (ComboBox)this;
      int i4 = ((ComboBox)localObject5).b();
      i6 = (int)(d1 - 1.0D);
      if (i6 >= i4) {
        i6 = i4 - 1;
      }
      ((ComboBox)localObject5).a(i6);
      break;
    case 11: 
      switch (((Cell)localObject1).getType())
      {
      case 1: 
      case 4: 
        d1 = Math.ceil(((Cell)localObject1).getDoubleValue());
        ((CheckBox)this).a(d1 != 0.0D ? 1 : 0);
        break;
      case 0: 
        boolean bool1 = ((Cell)localObject1).getBoolValue();
        ((CheckBox)this).a(bool1 ? 1 : 0);
        break;
      case 2: 
        boolean bool2 = "#N/A".equals(((Cell)localObject1).k());
        if (bool2) {
          ((CheckBox)this).a(2);
        }
        break;
      }
      break;
    case 18: 
      localObject6 = (ListBox)this;
      i5 = ((ListBox)localObject6).getItemCount();
      i6 = (int)(d1 - 1.0D);
      if (i6 >= i5) {
        i6 = i5 - 1;
      }
      ((ListBox)this).a(i6);
      break;
    case 17: 
      localObject6 = (ScrollBar)this;
      i5 = (int)d1;
      if (i5 > ((ScrollBar)localObject6).getMax()) {
        i5 = ((ScrollBar)localObject6).getMax();
      } else if (i5 < ((ScrollBar)localObject6).getMin()) {
        i5 = ((ScrollBar)localObject6).getMin();
      }
      ((ScrollBar)this).a(i5);
      break;
    case 16: 
      ((Spinner)this).a((int)d1);
      break;
    case 12: 
      int i2 = (int)(d1 - 1.0D);
      GroupBox localGroupBox = getGroupBox();
      i6 = 0;
      if (localGroupBox != null)
      {
        ArrayList localArrayList = localGroupBox.a();
        for (i8 = 0; i8 < localArrayList.size(); i8++) {
          if (((Shape)localArrayList.get(i8)).getMsoDrawingType() == 12)
          {
            if (i6 == i2) {
              ((RadioButton)localArrayList.get(i8)).a(true);
            } else {
              ((RadioButton)localArrayList.get(i8)).a(false);
            }
            i6++;
          }
        }
      }
      else
      {
        for (int i7 = 0; i7 < this.j.getCount(); i7++) {
          if (this.j.get(i7).getMsoDrawingType() == 12)
          {
            localGroupBox = this.j.get(i7).getGroupBox();
            if (localGroupBox == null)
            {
              if (i6 == i2) {
                ((RadioButton)this.j.get(i7)).a(true);
              } else {
                ((RadioButton)this.j.get(i7)).a(false);
              }
              i6++;
            }
          }
        }
      }
      break;
    }
  }
  
  private boolean a(ActiveXControl paramActiveXControl)
  {
    switch (paramActiveXControl.getType())
    {
    case 1: 
    case 2: 
    case 3: 
    case 6: 
      return true;
    }
    return false;
  }
  
  public int getTextShapeType()
  {
    if ((this.x == null) || (this.x.d == null) || (this.x.d.f == null)) {
      return 202;
    }
    return this.x.d.f.b();
  }
  
  public void setTextShapeType(int value)
    throws Exception
  {
    getTextBody().getTextAlignment().d().a(value);
  }
  
  public FontSettingCollection getTextBody()
  {
    if (this.x == null) {
      this.x = new FontSettingCollection(P(), this);
    }
    return this.x;
  }
  
  public Font getFont()
  {
    return getTextBody().c();
  }
  
  public void setFont(Font value)
  {
    getTextBody().a(value);
  }
  
  public TextOptions getTextOptions()
  {
    return getTextBody().d();
  }
  
  public void setTextOptions(TextOptions value)
  {
    getTextBody().a(value);
  }
  
  public String getText()
  {
    if (this.x == null) {
      return null;
    }
    return getTextBody().getText();
  }
  
  public void setText(String value)
  {
    getTextBody().setText(value);
    switch (getMsoDrawingType())
    {
    case 2: 
    case 6: 
      b(value);
      break;
    }
  }
  
  public boolean isRichText()
  {
    if (this.x == null) {
      return false;
    }
    return getTextBody().j();
  }
  
  public String getHtmlText()
    throws Exception
  {
    if (this.x == null) {
      return null;
    }
    return getTextBody().getHtmlString();
  }
  
  public void setHtmlText(String value)
  {
    getTextBody().setHtmlString(value);
  }
  
  public void formatCharacters(int startIndex, int length, Font font, StyleFlag flag)
  {
    getTextBody().format(startIndex, length, font, flag);
  }
  
  /**
   * @deprecated
   */
  public void formatCharacters(int startIndex, int length, Font font)
  {
    FontSetting localFontSetting = getTextBody().a(startIndex, length);
    localFontSetting.a(font);
  }
  
  public FontSetting characters(int startIndex, int length)
  {
    return getTextBody().a(startIndex, length);
  }
  
  public ArrayList getCharacters()
  {
    return getTextBody().a(false, false);
  }
  
  ShapeTextAlignment ai()
    throws Exception
  {
    return getTextBody().getTextAlignment();
  }
  
  public int getTextVerticalOverflow()
    throws Exception
  {
    return ai().getTextVerticalOverflow();
  }
  
  public void setTextVerticalOverflow(int value)
    throws Exception
  {
    ai().setTextVerticalOverflow(value);
  }
  
  public int getTextHorizontalOverflow()
    throws Exception
  {
    return ai().getTextHorizontalOverflow();
  }
  
  public void setTextHorizontalOverflow(int value)
    throws Exception
  {
    ai().setTextHorizontalOverflow(value);
  }
  
  public boolean isTextWrapped()
    throws Exception
  {
    return ai().isTextWrapped();
  }
  
  public void setTextWrapped(boolean value)
    throws Exception
  {
    ai().setTextWrapped(value);
  }
  
  public int getTextOrientationType()
    throws Exception
  {
    return ai().o();
  }
  
  public void setTextOrientationType(int value)
    throws Exception
  {
    ai().h(value);
  }
  
  public int getTextHorizontalAlignment()
    throws Exception
  {
    return getTextBody().m();
  }
  
  public void setTextHorizontalAlignment(int value)
    throws Exception
  {
    getTextBody().a(value);
    Iterator localIterator = getTextBody().iterator();
    while (localIterator.hasNext())
    {
      FontSetting localFontSetting = (FontSetting)localIterator.next();
      if (localFontSetting.getType() == 1) {
        ((TextParagraph)localFontSetting).e(value);
      }
    }
  }
  
  public int getTextVerticalAlignment()
    throws Exception
  {
    return ai().n();
  }
  
  public void setTextVerticalAlignment(int value)
    throws Exception
  {
    ai().g(value);
  }
  
  public int getTextDirection()
    throws Exception
  {
    return ai().p();
  }
  
  public void setTextDirection(int value)
    throws Exception
  {
    ai().i(value);
  }
  
  String aj()
  {
    if (this.y == null) {
      return null;
    }
    String str = P().d().a(0, this.y.length - 1, this.y, 0, 0, false, false);
    return str;
  }
  
  void e(String paramString)
  {
    this.y = d(paramString);
  }
  
  public byte[] getControlData()
    throws Exception
  {
    if (this.z != null) {
      return this.z.a(this, P().p());
    }
    return null;
  }
  
  public ActiveXControl getActiveXControl()
    throws Exception
  {
    if (this.z != null) {
      return this.z.b(this, P().p());
    }
    return null;
  }
  
  boolean ak()
  {
    return (al()) || (!am());
  }
  
  boolean al()
  {
    switch (getMsoDrawingType())
    {
    case 24: 
      return true;
    case 8: 
      if ((aj() != null) && (aj().length() > 0)) {
        return true;
      }
      break;
    }
    return this.z != null;
  }
  
  boolean am()
  {
    if ((this.h != null) && (this.h.b != null)) {
      return true;
    }
    switch (getMsoDrawingType())
    {
    case 8: 
      if ((aj() != null) && (aj().length() > 0)) {
        return true;
      }
      if (((Picture)this).f != null) {
        return true;
      }
      return this.z != null;
    case 7: 
    case 11: 
    case 12: 
    case 14: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 24: 
    case 25: 
      return true;
    case 20: 
      return true;
    case 0: 
      Iterator localIterator = ((GroupShape)this).d().iterator();
      while (localIterator.hasNext())
      {
        Shape localShape = (Shape)localIterator.next();
        if (localShape.ak()) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public ShapePathCollection getPaths()
  {
    if (!ao()) {
      return null;
    }
    CustomGeometry localCustomGeometry = (CustomGeometry)getGeometry();
    return localCustomGeometry.getPaths();
  }
  
  Geometry an()
  {
    return this.d;
  }
  
  void a(Geometry paramGeometry)
  {
    this.d = paramGeometry;
  }
  
  boolean ao()
  {
    if (this.d != null) {
      return this.d.a();
    }
    return (getAutoShapeType() == 0) || (this.k.l());
  }
  
  public Geometry getGeometry()
  {
    if (this.d == null) {
      if (ao()) {
        this.d = new CustomGeometry(this);
      } else {
        this.d = new zaxp();
      }
    }
    return this.d;
  }
  
  zadi ap()
  {
    return new zadi(this, R().d());
  }
  
  int[] b(double paramDouble)
  {
    int[] arrayOfInt = new int[4];
    paramDouble %= 360.0D;
    if (paramDouble < 0.0D) {
      paramDouble += 360.0D;
    }
    int i1 = 0;
    int i2 = 0;
    int i3 = getWidth();
    int i4 = getHeight();
    if (T()) {
      switch (getPlacement())
      {
      case 2: 
        Chart localChart = (Chart)N().i();
        double d1 = 0.0D;
        if (localChart.getChartArea().getBorder().isVisible())
        {
          d1 = localChart.getChartArea().getBorder().getWeightPt();
          if ((!localChart.getChartArea().getBorder().k()) && (localChart.getChartArea().getBorder().getFormattingType() == 0)) {
            d1 = 0.75D;
          } else if (d1 < 0.25D) {
            d1 = 0.25D;
          }
        }
        int i6 = (int)Math.ceil(localChart.getChartObject().getWidth() + zbxz.d(d1));
        int i7 = (int)Math.ceil(localChart.getChartObject().getHeight() + zbxz.d(d1));
        i3 = (int)(i6 * (R().i().p() - R().i().j()) / 4000.0F + 0.5D);
        i4 = (int)(i7 * (R().i().m() - R().i().g()) / 4000.0F + 0.5D);
        break;
      case 1: 
        i3 = R().i().p();
        i4 = R().i().m();
        break;
      }
    }
    int i5 = Math.abs(i3 - i4);
    if (i3 > i4)
    {
      if (((paramDouble >= 45.0D) && (paramDouble < 135.0D)) || ((paramDouble >= 225.0D) && (paramDouble < 315.0D)))
      {
        arrayOfInt[0] = (getX() + i5 / 2);
        arrayOfInt[1] = (getY() - i5 / 2);
        arrayOfInt[2] = (i4 + i2);
        arrayOfInt[3] = (i3 + i1);
      }
      else
      {
        arrayOfInt[0] = getX();
        arrayOfInt[1] = getY();
        arrayOfInt[2] = (i3 + i1);
        arrayOfInt[3] = (i4 + i2);
      }
    }
    else if (((paramDouble >= 45.0D) && (paramDouble < 135.0D)) || ((paramDouble >= 225.0D) && (paramDouble < 315.0D)))
    {
      arrayOfInt[0] = (getX() - i5 / 2);
      arrayOfInt[1] = (getY() + i5 / 2);
      arrayOfInt[2] = (i4 + i2);
      arrayOfInt[3] = (i3 + i1);
    }
    else
    {
      arrayOfInt[0] = getX();
      arrayOfInt[1] = getY();
      arrayOfInt[2] = (i3 + i1);
      arrayOfInt[3] = (i4 + i2);
    }
    return arrayOfInt;
  }
  
  int[] c(double paramDouble)
  {
    int[] arrayOfInt = new int[4];
    paramDouble %= 360.0D;
    if (paramDouble < 0.0D) {
      paramDouble += 360.0D;
    }
    int i1 = Math.abs(getWidth() - getHeight());
    if (getWidth() < getHeight())
    {
      if (((paramDouble >= 45.0D) && (paramDouble < 135.0D)) || ((paramDouble >= 225.0D) && (paramDouble < 315.0D)))
      {
        arrayOfInt[0] = (getX() - i1 / 2);
        arrayOfInt[1] = (getY() + i1 / 2);
        arrayOfInt[2] = getHeight();
        arrayOfInt[3] = getWidth();
      }
      else
      {
        arrayOfInt[0] = getX();
        arrayOfInt[1] = getY();
        arrayOfInt[2] = getWidth();
        arrayOfInt[3] = getHeight();
      }
    }
    else if (((paramDouble >= 45.0D) && (paramDouble < 135.0D)) || ((paramDouble >= 225.0D) && (paramDouble < 315.0D)))
    {
      arrayOfInt[0] = (getX() + i1 / 2);
      arrayOfInt[0] = (arrayOfInt[0] < 0 ? 0 : arrayOfInt[0]);
      arrayOfInt[1] = (getY() - i1 / 2);
      arrayOfInt[1] = (arrayOfInt[1] < 0 ? 0 : arrayOfInt[1]);
      arrayOfInt[2] = getHeight();
      arrayOfInt[3] = getWidth();
    }
    else
    {
      arrayOfInt[0] = getX();
      arrayOfInt[1] = getY();
      arrayOfInt[2] = getWidth();
      arrayOfInt[3] = getHeight();
    }
    return arrayOfInt;
  }
  
  public int getActualLowerRightRow()
  {
    int i1 = getLowerRightRow();
    if (getPlacement() == 2)
    {
      Cells localCells = Q().getCells();
      if (localCells.isDefaultRowHidden())
      {
        RowCollection localRowCollection = localCells.getRows();
        if (localRowCollection.getCount() == 0) {
          return 0;
        }
        for (int i2 = localRowCollection.getCount() - 1; i2 >= 0; i2--)
        {
          Row localRow = localRowCollection.getRowByIndex(i2);
          if (!localRow.isHidden())
          {
            if (i1 <= localRow.getIndex()) {
              break;
            }
            i1 = localRow.getIndex();
            break;
          }
        }
      }
    }
    return i1;
  }
  
  public int[] calculateTextSize()
    throws Exception
  {
    return zbwi.a(this);
  }
  
  void a(int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    int i1;
    switch (getPlacement())
    {
    case 0: 
      break;
    case 1: 
      i1 = getUpperLeftRow();
      if (paramInt1 <= i1)
      {
        if ((paramInt2 < 0) && (paramInt1 - paramInt2 > i1))
        {
          setLeft(0);
          i1 = paramInt1;
        }
        else
        {
          i1 += paramInt2;
        }
        if (i1 > 1048575) {
          throw new CellsException(13, "Can not shift object off the sheet.");
        }
        setUpperLeftRow(i1);
      }
      break;
    case 2: 
      i1 = getUpperLeftRow();
      int i2 = getTop();
      int i3 = getLowerRightRow();
      int i4 = getBottom();
      if (paramInt2 > 0)
      {
        if (paramInt1 <= i1)
        {
          i1 += paramInt2;
          i3 += paramInt2;
          if ((i1 > 1048575) || (i3 > 1048575)) {
            throw new CellsException(13, "Can not shift object off the sheet.");
          }
          R().i().b(i1);
          R().i().f(i3);
          return;
        }
        if (i4 == 0) {
          i3--;
        }
        if (paramInt1 <= i3)
        {
          i3 += paramInt2;
          if (i4 == 0) {
            i3++;
          }
          R().i().f(i3);
        }
        return;
      }
      int i5 = i4 == 0 ? i3 - 1 : i3;
      int i6 = paramInt1 - paramInt2 - 1;
      if (paramInt1 < i1)
      {
        if (i6 < i1)
        {
          i1 += paramInt2;
          i3 += paramInt2;
          R().i().b(i1);
          R().i().f(i3);
        }
        else if (i6 < i5)
        {
          i1 = paramInt1;
          R().i().c(0);
          i3 += paramInt2;
          R().i().b(i1);
          R().i().f(i3);
        }
        else
        {
          R().i().b(paramInt1);
          R().i().c(0);
          R().i().f(paramInt1);
          R().i().g(0);
        }
      }
      else if (paramInt1 <= i5) {
        if (i6 < i5)
        {
          R().i().f(i3 + paramInt2);
        }
        else
        {
          R().i().f(paramInt1);
          R().i().g(0);
        }
      }
      break;
    }
  }
  
  void b(int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    int i1;
    switch (getPlacement())
    {
    case 0: 
      break;
    case 1: 
      i1 = getUpperLeftColumn();
      if (paramInt1 <= i1)
      {
        if ((paramInt2 < 0) && (paramInt1 - paramInt2 > i1))
        {
          setLeft(0);
          i1 = paramInt1;
        }
        else
        {
          i1 += paramInt2;
        }
        if (i1 > 16383) {
          throw new CellsException(10, "Can not shift object off the sheet.");
        }
        setUpperLeftColumn(i1);
      }
      break;
    case 2: 
      i1 = getUpperLeftColumn();
      int i2 = getLeft();
      int i3 = getLowerRightColumn();
      int i4 = getRight();
      if (paramInt2 > 0)
      {
        if (paramInt1 <= i1)
        {
          i1 += paramInt2;
          i3 += paramInt2;
          if ((i1 > 16383) || (i3 > 16383)) {
            throw new CellsException(10, "Aspose.Cells cannot shift nonblank cell off the worksheet.");
          }
          R().i().d(i1);
          R().i().h(i3);
          return;
        }
        if (i4 == 0) {
          i3--;
        }
        if (paramInt1 <= i3)
        {
          i3 += paramInt2;
          if (i4 == 0) {
            i3++;
          }
          R().i().h(i3);
        }
        return;
      }
      int i5 = i4 == 0 ? i3 - 1 : i3;
      int i6 = paramInt1 - paramInt2 - 1;
      if (paramInt1 < i1)
      {
        if (i6 < i1)
        {
          i1 += paramInt2;
          i3 += paramInt2;
          R().i().d(i1);
          R().i().h(i3);
        }
        else if (i6 < i5)
        {
          i1 = paramInt1;
          R().i().e(0);
          i3 += paramInt2;
          R().i().d(i1);
          R().i().h(i3);
        }
        else
        {
          R().i().d(paramInt1);
          R().i().e(0);
          R().i().h(paramInt1);
          R().i().i(0);
        }
      }
      else if (paramInt1 <= i5) {
        if (i6 < i5)
        {
          R().i().h(i3 + paramInt2);
        }
        else
        {
          R().i().h(paramInt1);
          R().i().i(0);
        }
      }
      break;
    }
  }
  
  void a(CellArea paramCellArea, int paramInt)
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    switch (getPlacement())
    {
    case 0: 
      break;
    case 1: 
      i2 = getUpperLeftColumn();
      i1 = getUpperLeftRow();
      i3 = getLowerRightRow();
      if ((i2 >= paramCellArea.StartColumn) && (paramCellArea.StartRow <= i1) && (paramCellArea.EndRow >= i3)) {
        R().i().d(i2 + paramInt);
      }
      break;
    case 2: 
      i2 = getUpperLeftColumn();
      int i4 = getLowerRightColumn();
      i1 = getUpperLeftRow();
      i3 = getLowerRightRow();
      if ((paramCellArea.StartRow <= i1) && (paramCellArea.EndRow >= i3)) {
        if (i2 >= paramCellArea.StartColumn)
        {
          R().i().d(R().i().i() + paramInt);
          R().i().h(R().i().o() + paramInt);
        }
        else if (i4 >= paramCellArea.StartColumn)
        {
          R().i().h(R().i().o() + paramInt);
        }
      }
      break;
    }
  }
  
  void b(CellArea paramCellArea, int paramInt)
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    switch (getPlacement())
    {
    case 0: 
      break;
    case 1: 
      i2 = getUpperLeftColumn();
      i3 = getLowerRightColumn();
      i1 = getUpperLeftRow();
      if ((paramCellArea.StartColumn <= i2) && (paramCellArea.EndColumn >= i3) && (i1 >= paramCellArea.StartRow)) {
        setUpperLeftRow(i1 + paramInt);
      }
      break;
    case 2: 
      i2 = getUpperLeftColumn();
      i3 = getLowerRightColumn();
      i1 = getUpperLeftRow();
      int i4 = getLowerRightRow();
      if ((paramCellArea.StartColumn <= i2) && (paramCellArea.EndColumn >= i3)) {
        if (i1 >= paramCellArea.StartRow)
        {
          R().i().b(R().i().f() + paramInt);
          R().i().f(R().i().l() + paramInt);
        }
        else if (i4 >= paramCellArea.StartRow)
        {
          R().i().f(R().i().l() + paramInt);
        }
      }
      break;
    }
  }
  
  boolean c(CellArea paramCellArea, int paramInt)
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    switch (getPlacement())
    {
    case 0: 
      break;
    case 1: 
      i2 = getUpperLeftColumn();
      i1 = getUpperLeftRow();
      i3 = getLowerRightRow();
      if ((paramCellArea.StartRow <= i1) && (paramCellArea.EndRow >= i3) && (i2 >= paramCellArea.StartColumn))
      {
        i2 -= paramInt;
        if (i2 < paramCellArea.StartColumn) {
          i2 = paramCellArea.StartColumn;
        }
        R().i().d(i2);
      }
      break;
    case 2: 
      i2 = getUpperLeftColumn();
      int i4 = getLowerRightColumn();
      i1 = getUpperLeftRow();
      i3 = getLowerRightRow();
      if ((paramCellArea.StartRow <= i1) && (paramCellArea.EndRow >= i3))
      {
        CellArea localCellArea = CellArea.createCellArea(i1, i2, i3, i4);
        Object localObject = zban.b(paramCellArea, paramInt, localCellArea);
        if (localObject == null) {
          return true;
        }
        localCellArea = (CellArea)localObject;
        R().i().d(localCellArea.StartColumn);
        R().i().h(localCellArea.EndColumn);
      }
      break;
    }
    return false;
  }
  
  boolean d(CellArea paramCellArea, int paramInt)
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    switch (getPlacement())
    {
    case 0: 
      break;
    case 1: 
      i2 = getUpperLeftColumn();
      i3 = getLowerRightColumn();
      i1 = getUpperLeftRow();
      if ((paramCellArea.StartColumn <= i2) && (paramCellArea.EndColumn >= i3) && (i1 >= paramCellArea.StartRow))
      {
        i1 -= paramInt;
        if (i1 < paramCellArea.StartRow) {
          i1 = paramCellArea.StartRow;
        }
        setUpperLeftRow(i1);
      }
      break;
    case 2: 
      i2 = getUpperLeftColumn();
      i3 = getLowerRightColumn();
      i1 = getUpperLeftRow();
      i4 = getLowerRightRow();
      if ((paramCellArea.StartColumn <= i2) && (paramCellArea.EndColumn >= i3))
      {
        CellArea localCellArea = CellArea.createCellArea(i1, i2, i4, i3);
        Object localObject = zban.a(paramCellArea, paramInt, localCellArea);
        if (localObject == null) {
          return true;
        }
        localCellArea = (CellArea)localObject;
        R().i().b(localCellArea.StartRow);
        R().i().f(localCellArea.EndRow);
      }
      break;
    }
    return false;
  }
  
  void b(Object paramObject)
  {
    if (this.m_linkedCell != null)
    {
      Cell localCell = e(true);
      if ((localCell != null) && (!localCell.isFormula())) {
        localCell.putValue(paramObject);
      }
    }
  }
  
  boolean aq()
  {
    return (this.e & 0x1) != 0;
  }
  
  void f(boolean paramBoolean)
  {
    this.e = ((short)(this.e & 0xFFFFFFFE));
    if (paramBoolean) {
      this.e = ((short)(this.e | 0x1));
    }
  }
  
  boolean ar()
  {
    return (this.e & 0x2) != 0;
  }
  
  void g(boolean paramBoolean)
  {
    this.e = ((short)(this.e & 0xFFFFFFFD));
    if (paramBoolean) {
      this.e = ((short)(this.e | 0x2));
    }
  }
  
  boolean as()
  {
    switch (getAutoShapeType())
    {
    case 32: 
    case 33: 
    case 34: 
    case 35: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 120: 
      return true;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Shape.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */