package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class zboq
{
  static zq a(Shape paramShape)
    throws Exception
  {
    if (paramShape.getMsoDrawingType() == 5)
    {
      localObject = ((ChartShape)paramShape).a();
      return new zq(((Chart)localObject).getChartObject().getLeft(), ((Chart)localObject).getChartObject().getTop(), ((Chart)localObject).getChartObject().getWidth(), ((Chart)localObject).getChartObject().getHeight());
    }
    Object localObject = new zbnh(c(paramShape.getMsoDrawingType()));
    a(paramShape, (zbnh)localObject);
    ((zbnh)localObject).H();
    return ((zbnh)localObject).T();
  }
  
  static void a(zm paramzm, ImageOrPrintOptions paramImageOrPrintOptions, Shape paramShape)
    throws Exception
  {
    if (paramShape.getMsoDrawingType() == 5)
    {
      localObject = ((ChartShape)paramShape).a();
      ((Chart)localObject).a(paramzm, paramImageOrPrintOptions);
      return;
    }
    Object localObject = new zbnh(c(paramShape.getMsoDrawingType()));
    a(paramShape, (zbnh)localObject);
    if (!((zbnh)localObject).d)
    {
      ((zbnh)localObject).c(0.0F);
      ((zbnh)localObject).d(0.0F);
    }
    if (!((zbnh)localObject).S()) {
      return;
    }
    ImageFormat localImageFormat = paramImageOrPrintOptions.getImageFormat();
    zr localzr = a(paramShape, (zbnh)localObject, paramzm, localImageFormat, paramImageOrPrintOptions);
    if (localzr != null) {
      localzr.l();
    }
  }
  
  static zb b(Shape paramShape)
    throws Exception
  {
    if (paramShape.getMsoDrawingType() == 5)
    {
      localObject = ((ChartShape)paramShape).a();
      return ((Chart)localObject).F();
    }
    if ((paramShape.o != null) && (!"".equals(paramShape.o)))
    {
      localObject = zalq.a(paramShape);
      if (localObject != null) {
        paramShape = (Shape)localObject;
      }
    }
    Object localObject = new zbnh(c(paramShape.getMsoDrawingType()));
    a(paramShape, (zbnh)localObject);
    if (!((zbnh)localObject).d)
    {
      ((zbnh)localObject).c(0.0F);
      ((zbnh)localObject).d(0.0F);
    }
    if (!((zbnh)localObject).S()) {
      return new zb();
    }
    zt localzt = ((zbnh)localObject).G().e();
    int i = zaed.b;
    zav localzav = (zav)zaed.a(i, (int)Math.ceil(localzt.b()), (int)Math.ceil(localzt.c()), ImageFormat.getBmp(), null, null, (zbic)localObject, new zis());
    return localzav.n();
  }
  
  private static zr a(Shape paramShape, zbnh paramzbnh, zm paramzm, ImageFormat paramImageFormat, ImageOrPrintOptions paramImageOrPrintOptions)
  {
    int i = zaed.b;
    zt localzt = paramzbnh.G().e();
    zr localzr = zaed.a(i, (int)Math.ceil(localzt.b()), (int)Math.ceil(localzt.c()), paramImageFormat, paramImageOrPrintOptions, paramzm, paramzbnh, new zis());
    return localzr;
  }
  
  private static float[] c(Shape paramShape)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    Object localObject2;
    for (Object localObject1 = paramShape; (((Shape)localObject1).W()) || (((Shape)localObject1).T()); localObject1 = localObject2)
    {
      if ((((Shape)localObject1).T()) && (((Shape)localObject1).isGroup()) && ((((Shape)localObject1).J() instanceof ShapeCollection))) {
        localObject2 = ((Chart)((ShapeCollection)((Shape)localObject1).J()).i()).getChartObject();
      } else {
        localObject2 = (Shape)((Shape)localObject1).J();
      }
      if (((Shape)localObject2).I())
      {
        f1 += ((Shape)localObject1).getLeftInShape() * ((Shape)localObject2).getHeight() / 4000.0F;
        f2 += ((Shape)localObject1).getTopInShape() * ((Shape)localObject2).getWidth() / 4000.0F;
      }
      else
      {
        f1 += ((Shape)localObject1).getLeftInShape() * ((Shape)localObject2).getWidth() / 4000.0F;
        f2 += ((Shape)localObject1).getTopInShape() * ((Shape)localObject2).getHeight() / 4000.0F;
      }
    }
    if ((f2 < 0.0F) && (paramShape.W()) && (paramShape.getType() == 32))
    {
      localObject2 = (Shape)paramShape.J();
      float f3 = paramShape.R().i().m() * ((Shape)localObject2).getHeight() / 4000.0F;
      f2 += (f3 - paramShape.getHeight()) / 2.0F;
    }
    return new float[] { f1, f2 };
  }
  
  private static void b(Shape paramShape, zbnh paramzbnh)
  {
    int i = 0;
    if (paramShape.W())
    {
      i = 1;
    }
    else
    {
      if ((paramShape.getType() == 20) || (paramShape.getType() == 32) || (paramShape.getType() == 13) || (paramShape.getType() == 87) || (paramShape.getType() == 136)) {
        i = 1;
      }
      if ((paramShape.T()) && ((paramShape.getType() == 202) || (paramShape.getType() == 1))) {
        i = 1;
      }
    }
    if (i != 0)
    {
      int j = paramShape.getWidth();
      int k = paramShape.getHeight();
      int m = Math.abs(j - k);
      if (j > k)
      {
        if (paramShape.I())
        {
          paramzbnh.c(paramzbnh.h() + m / 2);
          paramzbnh.d(paramzbnh.i() - m / 2);
        }
      }
      else if (paramShape.I())
      {
        paramzbnh.c(paramzbnh.h() - m / 2);
        paramzbnh.d(paramzbnh.i() + m / 2);
      }
    }
  }
  
  static void a(Shape paramShape, zbnh paramzbnh)
    throws Exception
  {
    ShapeTextAlignment localShapeTextAlignment = paramShape.getTextBody().getTextAlignment();
    zaqc localzaqc = new zaqc();
    paramzbnh.h = paramShape;
    if (!localShapeTextAlignment.l())
    {
      localzaqc.a((int)(localShapeTextAlignment.getLeftMarginPt() * zbxp.a() / 72.0D));
      localzaqc.b((int)(localShapeTextAlignment.getTopMarginPt() * zbxp.a() / 72.0D));
      localzaqc.c((int)(localShapeTextAlignment.getRightMarginPt() * zbxp.a() / 72.0D));
      localzaqc.d((int)(localShapeTextAlignment.getBottomMarginPt() * zbxp.a() / 72.0D));
    }
    else
    {
      localzaqc.a(0.0D);
      localzaqc.b(0.0D);
      localzaqc.c(0.0D);
      localzaqc.d(0.0D);
    }
    paramzbnh.a(localzaqc);
    if (paramzbnh.e() == -1) {
      return;
    }
    if (!d(paramShape)) {
      return;
    }
    if (paramShape.isHidden()) {
      return;
    }
    int[] arrayOfInt = paramShape.b(paramShape.getRotationAngle());
    if (!paramShape.W())
    {
      paramzbnh.c(paramShape.getLeft());
      paramzbnh.d(paramShape.getTop());
    }
    else
    {
      localObject1 = c(paramShape);
      paramzbnh.c(localObject1[0]);
      paramzbnh.d(localObject1[1]);
    }
    b(paramShape, paramzbnh);
    paramzbnh.a(arrayOfInt[2]);
    paramzbnh.b(arrayOfInt[3]);
    paramzbnh.f = paramShape.T();
    paramzbnh.i(paramShape.getAutoShapeType());
    Object localObject1 = paramShape.b(2, false);
    Object localObject4;
    Object localObject5;
    Object localObject2;
    Object localObject3;
    Object localObject6;
    Object localObject7;
    Object localObject8;
    switch (paramShape.getMsoDrawingType())
    {
    case 0: 
      GroupShape localGroupShape = (GroupShape)paramShape;
      ArrayList localArrayList = new ArrayList();
      for (localObject4 : localGroupShape.getGroupedShapes()) {
        if (localArrayList.size() == 0)
        {
          zf.a(localArrayList, localObject4);
        }
        else
        {
          int m = 0;
          for (int n = 0; n < localArrayList.size(); n++)
          {
            localObject5 = (Shape)localArrayList.get(n);
            if (((Shape)localObject5).getZOrderPosition() > ((Shape)localObject4).getZOrderPosition())
            {
              localArrayList.add(n, localObject4);
              m = 1;
              break;
            }
          }
          if (m == 0) {
            zf.a(localArrayList, localObject4);
          }
        }
      }
      g(paramShape, paramzbnh);
      for (int i = 0; i < localArrayList.size(); i++)
      {
        localObject2 = (Shape)localArrayList.get(i);
        ((Shape)localObject2).v = paramShape.v;
        localObject3 = new zbnh(c(((Shape)localObject2).getMsoDrawingType()));
        ((zbnh)localObject3).c = paramzbnh;
        ((zbnh)localObject3).d = true;
        if (((Shape)localObject2).getMsoDrawingType() == 5)
        {
          ((zbnh)localObject3).e = true;
          ((zbnh)localObject3).g = ((ChartShape)localArrayList.get(i)).a();
        }
        a((Shape)localObject2, (zbnh)localObject3);
        zf.a(paramzbnh.b, localObject3);
      }
      break;
    case 6: 
      TextBox localTextBox = (TextBox)paramShape;
      a(localTextBox.getTextBody(), paramzbnh);
      g(paramShape, paramzbnh);
      break;
    case 1: 
      localObject2 = (LineShape)paramShape;
      b((LineFormat)localObject1, paramzbnh);
      e(paramShape, paramzbnh);
      g(paramShape, paramzbnh);
      break;
    case 2: 
      localObject3 = (RectangleShape)paramShape;
      a(((RectangleShape)localObject3).getTextBody(), paramzbnh);
      g(paramShape, paramzbnh);
      break;
    case 3: 
      localObject4 = (Oval)paramShape;
      a(((Oval)localObject4).getTextBody(), paramzbnh);
      break;
    case 19: 
      GroupBox localGroupBox = (GroupBox)paramShape;
      a(localGroupBox.getTextBody(), paramzbnh);
      break;
    case 7: 
      Button localButton = (Button)paramShape;
      a(localButton.getTextBody(), paramzbnh);
      break;
    case 11: 
      localObject5 = (CheckBox)paramShape;
      a(((CheckBox)localObject5).getTextBody(), paramzbnh);
      paramzbnh.e(n(((CheckBox)localObject5).getCheckedValue()));
      break;
    case 12: 
      RadioButton localRadioButton = (RadioButton)paramShape;
      a(localRadioButton.getTextBody(), paramzbnh);
      if (localRadioButton.isChecked()) {
        paramzbnh.e(1);
      } else {
        paramzbnh.e(0);
      }
      break;
    case 18: 
      ListBox localListBox = (ListBox)paramShape;
      if ((localListBox.getInputRange() != null) && (!"".equals(localListBox.getInputRange())))
      {
        localObject6 = localListBox.ag();
        if (localObject6 != null) {
          for (int i1 = ((Range)localObject6).a().StartRow; i1 <= ((Range)localObject6).a().EndRow; i1++)
          {
            Cell localCell = ((Range)localObject6).b.checkCell(i1, ((Range)localObject6).a().StartColumn);
            if (localCell == null) {
              paramzbnh.x().add("");
            } else {
              paramzbnh.x().add(localCell.k());
            }
          }
        }
        if (localListBox.a() != null) {
          paramzbnh.a(localListBox.a());
        }
      }
      break;
    case 20: 
      localObject6 = (ComboBox)paramShape;
      if ((((ComboBox)localObject6).getInputRange() != null) && (!"".equals(((ComboBox)localObject6).getInputRange())))
      {
        localObject7 = ((ComboBox)localObject6).ag();
        if (localObject7 != null) {
          for (int i2 = ((Range)localObject7).a().StartRow; i2 <= ((Range)localObject7).a().EndRow; i2++)
          {
            localObject8 = ((Range)localObject7).b.checkCell(i2, ((Range)localObject7).a().StartColumn);
            if (localObject8 == null) {
              paramzbnh.x().add("");
            } else {
              paramzbnh.x().add(((Cell)localObject8).k());
            }
          }
        }
        if (((ComboBox)localObject6).getSelectedValue() != null) {
          paramzbnh.b(((ComboBox)localObject6).getSelectedValue());
        }
      }
      break;
    case 14: 
      localObject7 = (Label)paramShape;
      a(((Label)localObject7).getTextBody(), paramzbnh);
      break;
    case 25: 
      CommentShape localCommentShape = (CommentShape)paramShape;
      a(localCommentShape, paramzbnh);
      a(localCommentShape.a().b(), paramzbnh);
      break;
    case 8: 
    case 24: 
      g(paramShape, paramzbnh);
      break;
    case 9: 
      e(paramShape, paramzbnh);
      b((LineFormat)localObject1, paramzbnh);
      f(paramShape, paramzbnh);
      a(paramShape.getTextBody(), paramzbnh);
      g(paramShape, paramzbnh);
      h(paramShape, paramzbnh);
      i(paramShape, paramzbnh);
      break;
    case 30: 
      e(paramShape, paramzbnh);
      b((LineFormat)localObject1, paramzbnh);
      f(paramShape, paramzbnh);
      a(paramShape.getTextBody(), paramzbnh);
      g(paramShape, paramzbnh);
      h(paramShape, paramzbnh);
      j(paramShape, paramzbnh);
      i(paramShape, paramzbnh);
      break;
    case 4: 
      e(paramShape, paramzbnh);
      a(paramShape.getTextBody(), paramzbnh);
      f(paramShape, paramzbnh);
      g(paramShape, paramzbnh);
      break;
    case 17: 
      localObject8 = (ScrollBar)paramShape;
      paramzbnh.f(((ScrollBar)localObject8).getCurrentValue());
      paramzbnh.g(((ScrollBar)localObject8).getMin());
      paramzbnh.h(((ScrollBar)localObject8).getMax());
      break;
    case 16: 
      Spinner localSpinner = (Spinner)paramShape;
      paramzbnh.f(localSpinner.getCurrentValue());
      paramzbnh.g(localSpinner.getMin());
      paramzbnh.h(localSpinner.getMax());
    }
    d(paramShape, paramzbnh);
    a((LineFormat)localObject1, paramzbnh);
    c(paramShape, paramzbnh);
    paramzbnh.j(paramShape.u);
    paramShape.u = false;
    paramzbnh.k(paramShape.v);
    paramShape.v = false;
  }
  
  private static void c(Shape paramShape, zbnh paramzbnh)
  {
    paramzbnh.b(paramShape.R().j().f());
    paramzbnh.a(paramShape.R().j().e());
  }
  
  private static boolean d(Shape paramShape)
  {
    int i = paramShape.getWidth();
    int j = paramShape.getHeight();
    switch (paramShape.getAutoShapeType())
    {
    case 0: 
    case 20: 
    case 32: 
    case 34: 
      if ((i == 0) && (j == 0)) {
        return false;
      }
      if ((i < 0) || (j < 0)) {
        return false;
      }
      break;
    default: 
      if ((i <= 0) || (j <= 0)) {
        return false;
      }
      break;
    }
    return true;
  }
  
  private static Color a(double paramDouble, Color paramColor)
  {
    return Color.a((int)((1.0D - paramDouble) * 255.0D), paramColor);
  }
  
  private static void d(Shape paramShape, zbnh paramzbnh)
    throws Exception
  {
    if (!paramShape.isFilled()) {
      return;
    }
    FillFormat localFillFormat = paramShape.B().getFill();
    zxi localzxi = paramzbnh.m().c();
    paramzbnh.m().a(localzxi);
    switch (localFillFormat.getFillType())
    {
    case 2: 
      paramzbnh.m().a(false);
      paramzbnh.m().a(a(localFillFormat.getSolidFill().getTransparency(), localFillFormat.getSolidFill().getColor()));
      paramzbnh.m().a(null);
      break;
    case 0: 
      paramzbnh.m().a(false);
      paramzbnh.m().a(a(0.0D, Color.getWhite()));
      paramzbnh.m().a(null);
      break;
    case 3: 
      paramzbnh.m().a(false);
      localzxi.a(0);
      a(paramShape, localzxi.a());
      break;
    case 5: 
      paramzbnh.m().a(false);
      localzxi.a(2);
      PatternFill localPatternFill = localFillFormat.getPatternFill();
      localzxi.a(a(localPatternFill.getForegroundColor()), a(localPatternFill.getBackgroundColor()), o(localFillFormat.getPattern()));
      break;
    case 4: 
      if (localFillFormat.getTextureFill().getImageData() == null) {
        paramzbnh.m().a(true);
      } else {
        try
        {
          paramzbnh.m().a(false);
          localzxi.a(1);
          a(localFillFormat.getTextureFill(), localzxi.b());
          if (localFillFormat.getTextureFill().getImageData() != null)
          {
            byte[] arrayOfByte = localFillFormat.getTextureFill().getImageData();
            zh localzh = new zh(arrayOfByte);
            zj localzj = zj.a(localzh);
            localzxi.b().a(arrayOfByte);
          }
        }
        catch (Exception localException)
        {
          paramzbnh.m().a(true);
        }
      }
      break;
    case 1: 
      paramzbnh.m().a(true);
    }
  }
  
  private static void a(TextureFill paramTextureFill, zbwm paramzbwm)
  {
    if (paramTextureFill == null) {
      return;
    }
    paramzbwm.a(paramTextureFill.isTiling());
    if (paramTextureFill.isTiling())
    {
      paramzbwm.a(paramTextureFill.getTilePicOption().getOffsetX());
      paramzbwm.b(paramTextureFill.getTilePicOption().getOffsetY());
      paramzbwm.c(paramTextureFill.getTilePicOption().getScaleX());
      paramzbwm.d(paramTextureFill.getTilePicOption().getScaleY());
      paramzbwm.a(h(paramTextureFill.getTilePicOption().getAlignmentType()));
      paramzbwm.b(g(paramTextureFill.getTilePicOption().getMirrorType()));
    }
    else
    {
      paramzbwm.c(f(paramTextureFill.getPicFormatOption().getType()));
      paramzbwm.e(paramTextureFill.getPicFormatOption().getLeft());
      paramzbwm.f(paramTextureFill.getPicFormatOption().getRight());
      paramzbwm.g(paramTextureFill.getPicFormatOption().getTop());
      paramzbwm.h(paramTextureFill.getPicFormatOption().getBottom());
      paramzbwm.i(paramTextureFill.getPicFormatOption().getScale());
    }
  }
  
  private static int f(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 2: 
      return 2;
    }
    return 0;
  }
  
  private static int g(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return 3;
    case 1: 
      return 1;
    case 2: 
      return 2;
    }
    return 0;
  }
  
  private static int h(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 1: 
      return 0;
    case 2: 
      return 0;
    case 3: 
      return 2;
    case 4: 
      return 4;
    case 5: 
      return 5;
    case 6: 
      return 6;
    case 8: 
      return 8;
    }
    return 7;
  }
  
  private static void a(Shape paramShape, zadr paramzadr)
  {
    if (paramShape.getFill().getGradientFill() == null) {
      return;
    }
    Workbook localWorkbook = paramShape.P().p();
    GradientFill localGradientFill = paramShape.getFill().getGradientFill();
    paramzadr.a(localGradientFill.getAngle());
    paramzadr.a(a(localGradientFill.getFillType()));
    paramzadr.b(b(localGradientFill.getDirectionType()));
    for (int i = 0; i < localGradientFill.getGradientStops().getCount(); i++)
    {
      GradientStop localGradientStop = localGradientFill.getGradientStops().get(i);
      int j = localGradientStop.getCellsColor().getColor().getR() & 0xFF;
      int k = localGradientStop.getCellsColor().getColor().getG() & 0xFF;
      int m = localGradientStop.getCellsColor().getColor().getB() & 0xFF;
      Color localColor = Color.fromArgb(localGradientStop.a() * 255 / 100, j, k, m);
      paramzadr.c().a(localColor, (float)localGradientStop.getPosition());
    }
  }
  
  static int a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 3: 
      return 3;
    case 1: 
      return 2;
    }
    return 1;
  }
  
  static int b(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
      return 4;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 0: 
      return 0;
    case 1: 
      return 1;
    }
    return 5;
  }
  
  private static void a(LineFormat paramLineFormat, zbnh paramzbnh)
  {
    boolean bool = paramLineFormat.getFillType() == 1;
    paramzbnh.n().a(bool);
    if (!bool)
    {
      paramzbnh.n().b(i(paramLineFormat.getDashStyle()));
      paramzbnh.n().a(j(paramLineFormat.getCompoundType()));
      paramzbnh.n().a((int)(paramLineFormat.getWeight() * zbxp.a() / 72.0D + 0.5D));
      if (paramzbnh.n().f() < 1.0F) {
        paramzbnh.n().a(1.0F);
      }
      paramzbnh.n().a(a(paramLineFormat.getTransparency(), paramLineFormat.b()));
    }
  }
  
  private static void b(LineFormat paramLineFormat, zbnh paramzbnh)
  {
    paramzbnh.n().c(k(paramLineFormat.getBeginArrowheadStyle()));
    paramzbnh.n().e(l(paramLineFormat.getBeginArrowheadLength()));
    paramzbnh.n().d(m(paramLineFormat.getBeginArrowheadWidth()));
    paramzbnh.n().f(k(paramLineFormat.getEndArrowheadStyle()));
    paramzbnh.n().h(l(paramLineFormat.getEndArrowheadLength()));
    paramzbnh.n().g(m(paramLineFormat.getEndArrowheadWidth()));
  }
  
  private static void a(FontSettingCollection paramFontSettingCollection, zbnh paramzbnh)
    throws Exception
  {
    if ((paramFontSettingCollection.getText() == null) || ("".equals(paramFontSettingCollection.getText()))) {
      return;
    }
    String str1 = paramFontSettingCollection.getText();
    paramzbnh.a(str1);
    ShapeTextAlignment localShapeTextAlignment = paramFontSettingCollection.getTextAlignment();
    Font localFont = paramFontSettingCollection.e();
    if (localFont != null)
    {
      paramzbnh.a(zbxz.a("", localFont));
      paramzbnh.a(Color.a(255, localFont.getColor()));
    }
    localFont = paramFontSettingCollection.c();
    paramzbnh.b(d(paramFontSettingCollection.m()));
    paramzbnh.c(d(localShapeTextAlignment.n()));
    paramzbnh.d(e(localShapeTextAlignment.o()));
    if (paramFontSettingCollection.j())
    {
      ArrayList localArrayList = paramFontSettingCollection.a(false, true);
      Object localObject1;
      if (localArrayList.size() == 1)
      {
        FontSetting localFontSetting1 = (FontSetting)localArrayList.get(0);
        localObject1 = str1.substring(localFontSetting1.getStartIndex(), localFontSetting1.getStartIndex() + localFontSetting1.getLength());
        paramzbnh.a(zbxz.a("", localFontSetting1.getFont()));
      }
      else
      {
        int i = 1;
        localObject1 = Color.getEmpty();
        Object localObject2 = null;
        for (int j = 0; j < localArrayList.size(); j++)
        {
          FontSetting localFontSetting2 = (FontSetting)localArrayList.get(j);
          String str2 = str1.substring(localFontSetting2.getStartIndex(), localFontSetting2.getStartIndex() + localFontSetting2.getLength());
          zg localzg = zbxz.a("", localFontSetting2.getFont());
          paramzbnh.a(Color.a(255, localFontSetting2.getFont().getColor()));
          if (j == 0)
          {
            localObject2 = localzg;
            localObject1 = Color.a(255, localFontSetting2.getFont().getColor());
          }
          else if (((i != 0) && ((!a((zg)localObject2, localzg)) || (((Color)localObject1).getR() != localFontSetting2.getFont().getColor().getR()) || (((Color)localObject1).getG() != localFontSetting2.getFont().getColor().getG()) || (((Color)localObject1).getB() != localFontSetting2.getFont().getColor().getB()))) || (a(localFontSetting2.getFont())))
          {
            i = 0;
          }
          zbdb localzbdb = new zbdb(str2, localzg, Color.a(255, localFontSetting2.getFont().getColor()), 2);
          zf.a(paramzbnh.v(), localzbdb);
        }
        if ((i != 0) && (localArrayList.size() > 1))
        {
          paramzbnh.a((zg)localObject2);
          paramzbnh.a((Color)localObject1);
        }
      }
    }
  }
  
  private static boolean a(zg paramzg1, zg paramzg2)
  {
    if (!zw.b(paramzg1.g(), paramzg2.g())) {
      return false;
    }
    if (paramzg1.h() != paramzg2.h()) {
      return false;
    }
    if (paramzg1.c() != paramzg2.c()) {
      return false;
    }
    if (paramzg1.f() != paramzg2.f()) {
      return false;
    }
    if (paramzg1.j() != paramzg2.j()) {
      return false;
    }
    return paramzg1.l() == paramzg2.l();
  }
  
  private static boolean a(Font paramFont)
  {
    if (((paramFont.isSubscript()) || (paramFont.isSuperscript())) && (paramFont.getScriptOffset() != 0.0D)) {
      return true;
    }
    if (paramFont.getCapsType() != 0) {
      return true;
    }
    return paramFont.isNormalizeHeights();
  }
  
  private static void a(CommentShape paramCommentShape, zbnh paramzbnh)
  {
    paramzbnh.l(paramCommentShape.getComment().getColumn());
    paramzbnh.m(paramCommentShape.getComment().getRow());
    paramzbnh.j(paramCommentShape.getUpperLeftColumn());
    paramzbnh.k(paramCommentShape.getUpperLeftRow());
  }
  
  private static void e(Shape paramShape, zbnh paramzbnh)
  {
    if ((!paramShape.R().j().e()) && (!paramShape.R().j().f())) {
      paramzbnh.a = 1;
    } else if ((paramShape.R().j().e()) && (paramShape.R().j().f())) {
      paramzbnh.a = 3;
    } else if ((paramShape.R().j().e()) && (!paramShape.R().j().f())) {
      paramzbnh.a = 2;
    } else {
      paramzbnh.a = 4;
    }
  }
  
  private static Color a(Color paramColor)
  {
    if (paramColor.getA() == 0) {
      return Color.a(255, paramColor);
    }
    return paramColor;
  }
  
  static int c(int paramInt)
  {
    switch (paramInt)
    {
    case 29: 
      return 29;
    case 0: 
      return 0;
    case 6: 
      return 6;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 19: 
      return 19;
    case 7: 
      return 7;
    case 11: 
      return 11;
    case 12: 
      return 12;
    case 18: 
      return 18;
    case 20: 
      return 20;
    case 14: 
      return 14;
    case 5: 
      return 5;
    case 25: 
      return 25;
    case 17: 
      return 17;
    case 16: 
      return 16;
    case 8: 
      return 8;
    case 24: 
      return 24;
    case 9: 
      return 9;
    case 4: 
    case 30: 
      return 30;
    }
    return -1;
  }
  
  private static int i(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 3: 
      return 2;
    case 1: 
      return 1;
    case 4: 
      return 3;
    case 2: 
      return 4;
    case 5: 
      return 5;
    case 7: 
      return 7;
    case 6: 
      return 6;
    }
    return 6;
  }
  
  private static int j(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 3: 
      return 3;
    case 2: 
      return 2;
    case 4: 
      return 4;
    }
    return 0;
  }
  
  private static int k(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 3: 
      return 3;
    case 5: 
      return 5;
    case 4: 
      return 4;
    case 2: 
      return 2;
    }
    return 0;
  }
  
  private static int l(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 0: 
      return 0;
    case 2: 
      return 2;
    }
    return 0;
  }
  
  private static int m(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return 2;
    case 1: 
      return 1;
    case 0: 
      return 0;
    }
    return 0;
  }
  
  private static int n(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 0: 
      return 0;
    }
    return 0;
  }
  
  private static int o(int paramInt)
  {
    switch (paramInt)
    {
    case 16: 
      return 20;
    case 25: 
      return 29;
    case 17: 
      return 21;
    case 24: 
      return 28;
    case 26: 
      return 30;
    case 29: 
      return 32;
    case 27: 
      return 31;
    case 28: 
      return 33;
    case 34: 
      return 38;
    case 38: 
      return 42;
    case 40: 
      return 44;
    case 39: 
      return 43;
    case 35: 
      return 39;
    case 47: 
      return 50;
    case 31: 
      return 35;
    case 45: 
      return 4;
    case 14: 
      return 18;
    case 21: 
      return 25;
    case 15: 
      return 19;
    case 20: 
      return 24;
    case 23: 
      return 27;
    case 22: 
      return 26;
    case 48: 
      return 51;
    case 37: 
      return 41;
    case 41: 
      return 45;
    case 46: 
      return 49;
    case 30: 
      return 34;
    case 44: 
      return 48;
    case 49: 
      return 52;
    case 43: 
      return 47;
    case 42: 
      return 46;
    case 33: 
      return 37;
    case 36: 
      return 40;
    case 18: 
      return 22;
    case 19: 
      return 23;
    case 32: 
      return 36;
    case 2: 
      return 6;
    case 3: 
      return 7;
    case 4: 
      return 8;
    case 13: 
      return 9;
    case 5: 
      return 10;
    case 6: 
      return 11;
    case 7: 
      return 12;
    case 8: 
      return 13;
    case 9: 
      return 14;
    case 10: 
      return 15;
    case 11: 
      return 16;
    case 12: 
      return 17;
    }
    return 4;
  }
  
  static int d(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 4: 
      return 4;
    case 5: 
      return 5;
    case 6: 
      return 6;
    case 7: 
      return 7;
    case 8: 
      return 8;
    case 9: 
      return 9;
    }
    return 1;
  }
  
  static int e(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    }
    return 2;
  }
  
  private static void f(Shape paramShape, zbnh paramzbnh)
  {
    paramzbnh.l = new zadj();
    zadi localzadi = paramShape.ap();
    for (int i = 327; i < 337; i++) {
      if (localzadi.c(i))
      {
        int j = localzadi.b(i);
        zar localzar = new zar();
        localzar.b(i);
        localzar.a(j);
        zf.a(paramzbnh.l.a, localzar);
      }
    }
  }
  
  private static void g(Shape paramShape, zbnh paramzbnh)
  {
    if (paramShape.getRotationAngle() >= 0.0D) {
      paramzbnh.a((int)(paramShape.getRotationAngle() + 0.5D));
    } else {
      paramzbnh.a((int)(paramShape.getRotationAngle() - 0.5D));
    }
  }
  
  private static void h(Shape paramShape, zbnh paramzbnh)
  {
    TextEffectFormat localTextEffectFormat = paramShape.getTextEffect();
    zbvw localzbvw = new zbvw();
    localzbvw.a(localTextEffectFormat.getText());
    localzbvw.b(localTextEffectFormat.getFontName());
    localzbvw.a(localTextEffectFormat.getFontSize());
    localzbvw.b(localTextEffectFormat.getFontItalic());
    localzbvw.a(localTextEffectFormat.getFontBold());
    localzbvw.c(localTextEffectFormat.getRotatedChars());
    localzbvw.b(p(localTextEffectFormat.d()));
    localzbvw.c(q(localTextEffectFormat.getPresetShape()));
    paramzbnh.a(localzbvw);
  }
  
  private static int p(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 1: 
      return 1;
    case 6: 
      return 6;
    case 4: 
      return 4;
    case 0: 
      return 0;
    case 5: 
      return 5;
    }
    return 1;
  }
  
  private static int q(int paramInt)
  {
    switch (paramInt)
    {
    case 145: 
      return 145;
    case 149: 
      return 149;
    case 144: 
      return 144;
    case 148: 
      return 148;
    case 147: 
      return 147;
    case 151: 
      return 151;
    case 175: 
      return 175;
    case 174: 
      return 174;
    case 155: 
      return 155;
    case 154: 
      return 154;
    case 141: 
      return 141;
    case 140: 
      return 140;
    case 146: 
      return 146;
    case 150: 
      return 150;
    case 153: 
      return 153;
    case 152: 
      return 152;
    case 161: 
      return 161;
    case 163: 
      return 163;
    case 166: 
      return 166;
    case 167: 
      return 167;
    case 165: 
      return 165;
    case 158: 
      return 158;
    case 159: 
      return 159;
    case 171: 
      return 171;
    case 169: 
      return 169;
    case 168: 
      return 168;
    case 170: 
      return 170;
    case 160: 
      return 160;
    case 162: 
      return 162;
    case 164: 
      return 164;
    case 255: 
      return 255;
    case 136: 
      return 136;
    case 142: 
      return 142;
    case 143: 
      return 143;
    case 173: 
      return 173;
    case 172: 
      return 172;
    case 137: 
      return 137;
    case 139: 
      return 139;
    case 138: 
      return 138;
    case 156: 
      return 156;
    case 157: 
      return 157;
    }
    return 145;
  }
  
  private static ArrayList a(Shape paramShape, ShapePathPointCollection paramShapePathPointCollection)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramShapePathPointCollection.getCount(); i++)
    {
      ShapePathPoint localShapePathPoint = paramShapePathPointCollection.get(i);
      zn localzn = new zn(localShapePathPoint.getX(), localShapePathPoint.getY());
      zf.a(localArrayList, localzn);
    }
    return localArrayList;
  }
  
  private static void i(Shape paramShape, zbnh paramzbnh)
  {
    if (!paramShape.ao()) {
      return;
    }
    ShapePathCollection localShapePathCollection = ((CustomGeometry)paramShape.getGeometry()).getPaths();
    zade localzade = new zade();
    ShapeSegmentPathCollection localShapeSegmentPathCollection = null;
    ArrayList localArrayList1 = new ArrayList();
    if (localShapePathCollection.getCount() == 0) {
      return;
    }
    Iterator localIterator1 = localShapePathCollection.iterator();
    while (localIterator1.hasNext())
    {
      ShapePath localShapePath = (ShapePath)localIterator1.next();
      ArrayList localArrayList2 = new ArrayList();
      if (localArrayList2.size() > 0) {
        localArrayList2.clear();
      }
      zadc localzadc = new zadc();
      localzadc.a(localShapePath.c);
      localzadc.b(localShapePath.b != 4);
      zapx localzapx = null;
      localShapeSegmentPathCollection = localShapePath.getPathSegementList();
      Iterator localIterator2 = localShapeSegmentPathCollection.iterator();
      while (localIterator2.hasNext())
      {
        ShapeSegmentPath localShapeSegmentPath = (ShapeSegmentPath)localIterator2.next();
        localzapx = new zapx();
        localzapx.a(r(localShapeSegmentPath.getType()));
        localzapx.a(a(paramShape, localShapeSegmentPath.getPoints()));
        zf.a(localArrayList2, localzapx);
      }
      localzadc.a(localArrayList2);
      localzadc.b(localShapePath.e);
      localzadc.a(localShapePath.d);
      zf.a(localArrayList1, localzadc);
    }
    localzade.a(localArrayList1);
    paramzbnh.a(localzade);
  }
  
  private static void j(Shape paramShape, zbnh paramzbnh)
  {
    zaqa localzaqa = paramShape.Z();
    zbfm localzbfm = new zbfm();
    localzbfm.a(s(localzaqa.b()));
    localzbfm.b(localzaqa.d());
    localzbfm.a(localzaqa.c());
    localzbfm.a(localzaqa.s());
    localzbfm.b(localzaqa.t());
    localzbfm.b(localzaqa.f());
    localzbfm.c(localzaqa.g());
    localzbfm.m(localzaqa.q());
    localzbfm.n(localzaqa.r());
    localzbfm.a(localzaqa.e());
    localzbfm.j(localzaqa.n());
    localzbfm.k(localzaqa.o());
    localzbfm.f(localzaqa.j());
    localzbfm.h(localzaqa.l());
    localzbfm.g(localzaqa.k());
    localzbfm.i(localzaqa.m());
    localzbfm.d(localzaqa.h());
    localzbfm.e(localzaqa.i());
    localzbfm.l(localzaqa.p());
    paramzbnh.a(localzbfm);
  }
  
  private static int r(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return 3;
    case 1: 
      return 1;
    case 4: 
      return 4;
    case 0: 
      return 0;
    case 2: 
      return 2;
    }
    return 5;
  }
  
  private static int s(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 4: 
      return 4;
    case 5: 
      return 5;
    case 0: 
      return 0;
    case 2: 
      return 2;
    case 3: 
      return 3;
    }
    return 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zboq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */