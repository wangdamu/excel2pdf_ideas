package com.aspose.cells;

import com.aspose.cells.b.a.zr;

class zauu
{
  static int a = 10;
  
  static int a(double paramDouble1, double paramDouble2)
  {
    if (paramDouble1 < 3.8D) {
      return 38;
    }
    if (paramDouble1 < 3.9D)
    {
      if (paramDouble2 < 8.0D) {
        return 37;
      }
      return 19;
    }
    if (paramDouble1 < 4.0D) {
      return 43;
    }
    if (paramDouble1 < 4.3D) {
      return 20;
    }
    if (paramDouble1 < 4.45D)
    {
      if (paramDouble2 < 8.9D) {
        return 27;
      }
      return 36;
    }
    if (paramDouble1 < 4.49D)
    {
      if (paramDouble2 < 7.5D) {
        return 31;
      }
      return 32;
    }
    if (paramDouble1 < 4.65D) {
      return 21;
    }
    if (paramDouble1 < 4.9D) {
      return 22;
    }
    if (paramDouble1 < 5.25D) {
      return 23;
    }
    if (paramDouble1 < 5.7D) {
      return 6;
    }
    if (paramDouble1 < 6.0D) {
      return 11;
    }
    if (paramDouble1 < 6.8D) {
      return 28;
    }
    if (paramDouble1 < 7.3D) {
      return 13;
    }
    if (paramDouble1 < 7.9D) {
      return 7;
    }
    if (paramDouble1 < 8.36D) {
      return 9;
    }
    if (paramDouble1 < 8.48D) {
      return 15;
    }
    if (paramDouble1 < 8.58D)
    {
      if (paramDouble2 < 11.5D) {
        return 1;
      }
      if (paramDouble2 < 12.5D) {
        return 40;
      }
      if (paramDouble2 < 13.5D) {
        return 14;
      }
      return 5;
    }
    if (paramDouble1 < 8.85D) {
      return 47;
    }
    if (paramDouble1 < 9.01D) {
      return 44;
    }
    if (paramDouble1 < 9.4D) {
      return 30;
    }
    if (paramDouble1 < 9.9D) {
      return 12;
    }
    if (paramDouble1 < 10.5D)
    {
      if (paramDouble2 < 12.5D) {
        return 45;
      }
      return 16;
    }
    if (paramDouble1 < 11.4D) {
      return 17;
    }
    if (paramDouble1 < 12.2D) {
      return 8;
    }
    if (paramDouble1 < 13.7D) {
      return 29;
    }
    if (paramDouble1 < 14.9D) {
      return 39;
    }
    if (paramDouble1 < 16.0D) {
      return 46;
    }
    return 9;
  }
  
  static float a(Worksheet paramWorksheet, boolean paramBoolean)
  {
    int i = paramWorksheet.getViewType() == 2 ? 1 : 0;
    float f = 1.0F;
    if ((paramBoolean) || (i != 0)) {
      f = (float)paramWorksheet.D()[0];
    }
    return f;
  }
  
  static double[] a(Worksheet paramWorksheet)
  {
    Font localFont = paramWorksheet.d().getWorksheets().T();
    double d1 = -1.0D;
    double d2 = -1.0D;
    String str = localFont.getName();
    if ("Times New Roman".equals(str))
    {
      switch (localFont.getSize())
      {
      case 9: 
        d1 = 1.0097402597402598D;
        d2 = 0.9603174603174603D;
        break;
      case 10: 
        d1 = 1.1214285714285714D;
        d2 = 0.9958720330237358D;
        break;
      case 11: 
        d1 = 1.0505836575875487D;
        d2 = 0.940809968847352D;
        break;
      case 12: 
        d1 = 1.0103703703703704D;
        d2 = 0.9439024390243902D;
        break;
      default: 
        d1 = 1.0D;
        d2 = 1.0D;
        break;
      }
    }
    else if ("Calibri".equals(str))
    {
      switch (localFont.getSize())
      {
      case 10: 
        switch (paramWorksheet.getPageSetup().getPrintQuality())
        {
        case 100: 
          d1 = 0.9600591715976331D;
          d2 = 1.0163934426229508D;
          break;
        case 200: 
          d1 = 0.9600591715976331D;
          d2 = 1.0449438202247192D;
          break;
        case 600: 
          d1 = 0.9614814814814815D;
          d2 = 1.0276243093922652D;
          break;
        case 96: 
          d1 = 1.001543209876543D;
          d2 = 0.9422492401215805D;
          break;
        case 120: 
          d1 = 1.0268987341772151D;
          d2 = 1.0356347438752784D;
          break;
        default: 
          d1 = 0.9614814814814815D;
          d2 = 1.0367892976588629D;
        }
        break;
      case 11: 
        switch (paramWorksheet.getPageSetup().getPrintQuality())
        {
        case 100: 
          d1 = 0.9600591715976331D;
          d2 = 0.9126594700686947D;
          break;
        case 200: 
          d1 = 1.0962837837837838D;
          d2 = 0.9607438016528925D;
          break;
        case 600: 
          d1 = 1.0750361445783132D;
          d2 = 0.9647058823529412D;
          break;
        case 96: 
          d1 = 1.001543209876543D;
          d2 = 0.950920245398773D;
          break;
        case 120: 
          d1 = 1.0268987341772151D;
          d2 = 0.9198813056379822D;
          break;
        default: 
          d1 = 1.0518638573743921D;
          d2 = 0.9607438016528925D;
        }
        break;
      case 12: 
        d1 = 1.0190972222222223D;
        d2 = 0.9917184265010351D;
      }
    }
    else if ("ＭＳ Ｐゴシック".equals(str))
    {
      switch (localFont.getSize())
      {
      case 11: 
        switch (paramWorksheet.getPageSetup().getPrintQuality())
        {
        case 1200: 
          d1 = 0.9212962962962963D;
          d2 = 0.9020715630885122D;
          break;
        default: 
          d1 = 0.9212962962962963D;
          d2 = 0.9058380414312618D;
        }
        break;
      case 12: 
        switch (paramWorksheet.getPageSetup().getPrintQuality())
        {
        case 1200: 
          d1 = 0.9212962962962963D;
          d2 = 0.9020715630885122D;
          break;
        default: 
          d1 = 1.001543209876543D;
          d2 = 0.9263157894736842D;
        }
        break;
      default: 
        switch (paramWorksheet.getPageSetup().getPrintQuality())
        {
        case 1200: 
          d1 = 0.9212962962962963D;
          d2 = 0.9020715630885122D;
          break;
        default: 
          d1 = 0.9212962962962963D;
          d2 = 0.9058380414312618D;
        }
        break;
      }
    }
    else if ((("ＭＳ 明朝".equals(str)) || ("MS Mincho".equals(str))) && (localFont.getSize() == 10))
    {
      d1 = 0.959375D;
      d2 = 0.9307692307692308D;
    }
    else if ((("游ゴシック".equals(str)) || ("Yu Gothic".equals(str))) && (localFont.getSize() == 11))
    {
      d1 = 1.0200617283950617D;
      d2 = 0.9866666666666667D;
    }
    else if (str.startsWith("ＭＳ"))
    {
      switch (localFont.getSize())
      {
      case 9: 
        switch (paramWorksheet.getPageSetup().getPrintQuality())
        {
        case 100: 
          d1 = 1.1151202749140894D;
          d2 = 1.024229074889868D;
          break;
        case 200: 
          d1 = 1.0384D;
          d2 = 0.9281437125748503D;
          break;
        case 600: 
          d1 = 1.0156494522691706D;
          d2 = 0.908203125D;
          break;
        case 96: 
          d1 = 1.001543209876543D;
          d2 = 1.0010764262648009D;
          break;
        case 120: 
          d1 = 1.0709570957095709D;
          d2 = 0.9597523219814241D;
          break;
        default: 
          d1 = 1.0140625D;
          d2 = 0.9393939393939394D;
        }
        break;
      case 10: 
        switch (paramWorksheet.getPageSetup().getPrintQuality())
        {
        case 100: 
          d1 = 0.9600591715976331D;
          d2 = 1.0208562019758507D;
          break;
        case 200: 
          d1 = 0.9600591715976331D;
          d2 = 0.9607438016528925D;
          break;
        case 600: 
          d1 = 0.9614814814814815D;
          d2 = 0.9309309309309309D;
          break;
        case 96: 
          d1 = 1.001543209876543D;
          d2 = 1.0010764262648009D;
          break;
        case 120: 
          d1 = 1.0268987341772151D;
          d2 = 1.0D;
          break;
        default: 
          d1 = 0.9614814814814815D;
          d2 = 0.9607438016528925D;
        }
        break;
      case 11: 
        switch (paramWorksheet.getPageSetup().getPrintQuality())
        {
        case 100: 
          d1 = 0.9600591715976331D;
          d2 = 0.9607438016528925D;
          break;
        case 200: 
          d1 = 0.9600591715976331D;
          d2 = 0.9337349397590361D;
          break;
        case 600: 
          d1 = 0.9118942731277533D;
          d2 = 0.90625D;
          break;
        case 96: 
          d1 = 1.001543209876543D;
          d2 = 1.0010764262648009D;
          break;
        case 120: 
          d1 = 0.9001386962552012D;
          d2 = 0.9337349397590361D;
          break;
        default: 
          d1 = 0.921875D;
          d2 = 0.9253731343283582D;
        }
        break;
      case 12: 
        switch (paramWorksheet.getPageSetup().getPrintQuality())
        {
        case 100: 
          d1 = 1.0798668885191347D;
          d2 = 1.0108695652173914D;
          break;
        case 200: 
          d1 = 1.020440251572327D;
          d2 = 0.9346733668341709D;
          break;
        case 600: 
          d1 = 1.001543209876543D;
          d2 = 0.9272183449651047D;
          break;
        case 96: 
          d1 = 1.001543209876543D;
          d2 = 1.0010764262648009D;
          break;
        case 120: 
          d1 = 1.0D;
          d2 = 0.96875D;
          break;
        default: 
          d1 = 1.001543209876543D;
          d2 = 0.9441624365482234D;
        }
        break;
      }
    }
    else if ("Arial".equals(str))
    {
      switch (localFont.getSize())
      {
      case 8: 
        d1 = 0.9853896103896104D;
        d2 = 0.9061032863849765D;
        break;
      case 9: 
        switch (paramWorksheet.getPageSetup().getPrintQuality())
        {
        case 100: 
          d1 = 0.9600591715976331D;
          d2 = 1.0208562019758507D;
          break;
        case 200: 
          d1 = 0.9600591715976331D;
          d2 = 0.93D;
          break;
        case 600: 
          d1 = 0.9481481481481482D;
          d2 = 0.9309309309309309D;
          break;
        case 96: 
          d1 = 1.001543209876543D;
          d2 = 1.0010764262648009D;
          break;
        case 120: 
          d1 = 0.9127988748241913D;
          d2 = 0.9002904162633107D;
          break;
        default: 
          d1 = 0.9614814814814815D;
          d2 = 0.9607438016528925D;
        }
        break;
      case 10: 
        d1 = 1.0521920668058455D;
        d2 = 0.9690927218344965D;
        break;
      case 11: 
        switch (paramWorksheet.getPageSetup().getPrintQuality())
        {
        case 100: 
          d1 = 0.9600591715976331D;
          d2 = 0.9099804305283757D;
          break;
        case 200: 
          d1 = 1.020440251572327D;
          d2 = 0.9607438016528925D;
          break;
        case 600: 
          d1 = 1.020440251572327D;
          d2 = 0.9617373319544984D;
          break;
        case 96: 
          d1 = 1.001543209876543D;
          d2 = 0.9480122324159022D;
          break;
        case 120: 
          d1 = 1.0D;
          d2 = 0.96875D;
          break;
        default: 
          d1 = 1.0417335473515248D;
          d2 = 0.9779179810725552D;
        }
        break;
      }
    }
    else if (("Geneva".equals(str)) && (localFont.getSize() == 9))
    {
      d1 = 1.0807600950118765D;
      d2 = 1.0551470588235294D;
    }
    else if ("Verdana".equals(str))
    {
      if (localFont.getSize() == 10)
      {
        d1 = 1.055363321799308D;
        d2 = 1.013840830449827D;
      }
      else if (localFont.getSize() == 8)
      {
        d1 = 0.9607201309328969D;
        d2 = 0.9396551724137931D;
      }
    }
    else if (("Arial MT".equals(str)) && (localFont.getSize() == 12))
    {
      d1 = 0.995850622406639D;
      d2 = 0.983402489626556D;
    }
    else if (("Tahoma".equals(str)) && (localFont.getSize() == 10))
    {
      d1 = 1.0260416666666667D;
      d2 = 1.0D;
    }
    else if ((("MS Sans Serif".equals(str)) || ("Microsoft Sans Serif".equals(str))) && (localFont.getSize() == 8))
    {
      d1 = 0.9886363636363636D;
      d2 = 0.9603174603174603D;
    }
    else if ("Geneva".equals(str))
    {
      d1 = 1.051948051948052D;
      d2 = 0.9682926829268292D;
    }
    else if ("宋体".equals(str))
    {
      switch (localFont.getSize())
      {
      case 12: 
        d1 = 0.9969135802469136D;
        d2 = 1.0273684210526315D;
        break;
      default: 
        d1 = 0.9212962962962963D;
        d2 = 1.0041152263374487D;
        break;
      }
    }
    else if (("돋움".equals(str)) && (localFont.getSize() == 11))
    {
      d1 = 0.8619102416570771D;
      d2 = 0.9989327641408752D;
    }
    else if (("Microsoft YaHei".equals(str)) && (localFont.getSize() == 9))
    {
      d1 = 1.0058910162002945D;
      d2 = 0.916015625D;
    }
    else if (("Comic Sans MS".equals(str)) && (localFont.getSize() == 10))
    {
      d1 = 1.0208333333333333D;
      d2 = 1.0644444444444445D;
    }
    else if ("Arial Narrow".equals(str))
    {
      if (localFont.getSize() == 11)
      {
        d1 = 0.959375D;
        d2 = 0.8426573426573427D;
      }
      else if (localFont.getSize() == 10)
      {
        d1 = 1.0129870129870129D;
        d2 = 0.9969040247678018D;
      }
    }
    else if (("Arial Cyr".equals(str)) && (localFont.getSize() == 10))
    {
      d1 = 1.0520833333333333D;
      d2 = 0.9690927218344965D;
    }
    else if ("Calisto MT".equals(str))
    {
      d1 = 0.959375D;
      d2 = 0.9776876267748479D;
    }
    else if ("Trebuchet MS".equals(str))
    {
      d1 = 1.0046875D;
      d2 = 0.9037037037037037D;
    }
    else if ("Rockwell".equals(str))
    {
      d1 = 0.9984567901234568D;
      d2 = 0.9339712918660287D;
    }
    else if (("맑은 고딕".equals(str)) || ("Malgun Gothic".equals(str)))
    {
      d1 = 1.0208333333333333D;
      d2 = 1.0126849894291754D;
    }
    else if (("Segoe Condensed".equals(str)) && (localFont.getSize() == 12))
    {
      d1 = 0.9875D;
      d2 = 0.9465500485908649D;
    }
    else if (("Frutiger LT 45 Light".equals(str)) && (localFont.getSize() == 11))
    {
      d1 = 0.9083333333333333D;
      d2 = 0.9288461538461539D;
    }
    else if (("Microsoft JhengHei".equals(str)) && (localFont.getSize() == 10))
    {
      d1 = 0.9583333333333334D;
      d2 = 1.0051440329218106D;
    }
    if ((d1 < 0.0D) || (d2 < 0.0D)) {
      switch (paramWorksheet.getPageSetup().getPrintQuality())
      {
      case 100: 
        d1 = 1.0944350758853287D;
        d2 = 0.9607438016528925D;
        break;
      case 200: 
        d1 = 1.0962837837837838D;
        d2 = 0.9883103081827843D;
        break;
      case 600: 
        d1 = 1.0535714285714286D;
        d2 = 0.9707724425887265D;
        break;
      case 96: 
        d1 = 1.001543209876543D;
        d2 = 1.0010764262648009D;
        break;
      case 120: 
        d1 = 1.0268987341772151D;
        d2 = 0.9883103081827843D;
        break;
      default: 
        d1 = 1.0518638573743921D;
        d2 = 0.9799789251844047D;
      }
    }
    return new double[] { d1, d2 };
  }
  
  static int a(Worksheet paramWorksheet, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    Cells localCells = paramWorksheet.getCells();
    Object localObject = { 1.0D, 1.0D };
    PageSetup localPageSetup = paramWorksheet.getPageSetup();
    double[] arrayOfDouble = a(paramWorksheet);
    double d1 = 0.0D;
    double d2 = 0.0D;
    if ((localPageSetup.isPercentScale()) || ((localPageSetup.getFitToPagesTall() == 0) && (localPageSetup.getFitToPagesWide() == 0))) {
      return localPageSetup.getZoom();
    }
    localObject[0] = arrayOfDouble[0];
    localObject[1] = arrayOfDouble[1];
    if (localPageSetup.getFitToPagesWide() != 0)
    {
      if ((paramInt7 >= 0) && (paramInt8 >= paramInt7)) {
        d1 += localCells.b.c(paramInt7, paramInt8) * 72.0D;
      }
      localObject[0] = a(paramWorksheet, paramDouble1, paramInt1, paramInt2, d1);
      if (localObject[0] > arrayOfDouble[0]) {
        localObject[0] = arrayOfDouble[0];
      }
    }
    if (localPageSetup.getFitToPagesTall() != 0)
    {
      if ((paramInt5 >= 0) && (paramInt6 >= paramInt5)) {
        d2 += localCells.getRows().b.b(paramInt5, paramInt6);
      }
      localObject[1] = b(paramWorksheet, paramDouble2, paramInt3, paramInt4, d2);
      if (localObject[1] > arrayOfDouble[1]) {
        localObject[1] = arrayOfDouble[1];
      }
    }
    double d3 = Math.min(localObject[0], localObject[1]);
    if (d3 > Math.min(arrayOfDouble[0], arrayOfDouble[1]))
    {
      localObject[0] = arrayOfDouble[0];
      localObject[1] = arrayOfDouble[1];
    }
    else if (d3 > 1.0D)
    {
      localObject = arrayOfDouble;
    }
    else
    {
      d4 = arrayOfDouble[0] / arrayOfDouble[1] * localObject[1];
      if (d4 > localObject[0]) {
        localObject[1] = (arrayOfDouble[1] / arrayOfDouble[0] * localObject[0]);
      } else {
        localObject[0] = d4;
      }
    }
    double d4 = Math.min(localObject[0] / arrayOfDouble[0], localObject[1] / arrayOfDouble[1]);
    int i = (int)(d4 * 100.0D);
    return Math.max(i, a);
  }
  
  static double a(Worksheet paramWorksheet, double paramDouble1, int paramInt1, int paramInt2, double paramDouble2)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    PageSetup localPageSetup = paramWorksheet.getPageSetup();
    if (!localPageSetup.isPercentScale())
    {
      d2 += paramWorksheet.getCells().b.c(paramInt1, paramInt2) * 72.0D;
      d2 += paramDouble2 * (localPageSetup.getFitToPagesWide() - 1);
      if (d2 != 0.0D) {
        d1 = localPageSetup.getFitToPagesWide() * paramDouble1 / d2;
      }
    }
    return d1;
  }
  
  static double b(Worksheet paramWorksheet, double paramDouble1, int paramInt1, int paramInt2, double paramDouble2)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    PageSetup localPageSetup = paramWorksheet.getPageSetup();
    if (!localPageSetup.isPercentScale())
    {
      d2 += paramWorksheet.getCells().getRows().b.b(paramInt1, paramInt2);
      d2 += paramDouble2 * (localPageSetup.getFitToPagesTall() - 1);
      if (d2 != 0.0D) {
        d1 = localPageSetup.getFitToPagesTall() * paramDouble1 / d2;
      }
    }
    return d1;
  }
  
  static void a(PageSetup paramPageSetup, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    paramArrayOfDouble1[0] = zr.b(8.267716535433072D, 2);
    paramArrayOfDouble2[0] = zr.b(16.535433070866144D, 2);
    int i = paramPageSetup.getPaperSize();
    double d1;
    switch (i)
    {
    case 0: 
      paramArrayOfDouble2[0] = paramPageSetup.h;
      paramArrayOfDouble1[0] = paramPageSetup.g;
      break;
    case 16: 
      paramArrayOfDouble1[0] = 10.0D;
      paramArrayOfDouble2[0] = 14.0D;
      break;
    case 17: 
      paramArrayOfDouble1[0] = 11.0D;
      paramArrayOfDouble2[0] = 17.0D;
      break;
    case 66: 
      paramArrayOfDouble1[0] = zr.b(16.535433070866144D, 2);
      paramArrayOfDouble2[0] = zr.b(23.385826771653544D, 2);
      break;
    case 8: 
      paramArrayOfDouble1[0] = zr.b(11.692913385826772D, 2);
      paramArrayOfDouble2[0] = zr.b(16.535433070866144D, 2);
      break;
    case 9: 
      paramArrayOfDouble1[0] = zr.b(8.267716535433072D, 2);
      paramArrayOfDouble2[0] = zr.b(11.692913385826772D, 2);
      break;
    case 10: 
      paramArrayOfDouble1[0] = zr.b(8.267716535433072D, 2);
      paramArrayOfDouble2[0] = zr.b(11.692913385826772D, 2);
      break;
    case 11: 
      paramArrayOfDouble1[0] = zr.b(5.826771653543307D, 2);
      paramArrayOfDouble2[0] = zr.b(8.267716535433072D, 2);
      break;
    case 70: 
      paramArrayOfDouble1[0] = zr.b(4.133858267716536D, 2);
      paramArrayOfDouble2[0] = zr.b(5.826771653543307D, 2);
      break;
    case 12: 
      paramArrayOfDouble1[0] = zr.b(10.118110236220472D, 2);
      paramArrayOfDouble2[0] = zr.b(14.330708661417324D, 2);
      break;
    case 13: 
      paramArrayOfDouble1[0] = zr.b(7.165354330708662D, 2);
      paramArrayOfDouble2[0] = zr.b(10.118110236220472D, 2);
      break;
    case 24: 
      paramArrayOfDouble1[0] = zr.b(17.0D, 2);
      paramArrayOfDouble2[0] = zr.b(22.0D, 2);
      break;
    case 25: 
      paramArrayOfDouble1[0] = zr.b(22.0D, 2);
      paramArrayOfDouble2[0] = zr.b(34.0D, 2);
      break;
    case 20: 
      d1 = 4.125D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      d1 = 9.5D;
      paramArrayOfDouble2[0] = zr.b(d1, 2);
      break;
    case 21: 
      d1 = 4.5D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      d1 = 10.375D;
      paramArrayOfDouble2[0] = zr.b(d1, 2);
      break;
    case 22: 
      d1 = 4.75D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      paramArrayOfDouble2[0] = 11.0D;
      break;
    case 23: 
      paramArrayOfDouble1[0] = 5.0D;
      d1 = 11.5D;
      paramArrayOfDouble2[0] = zr.b(d1, 2);
      break;
    case 19: 
      d1 = 3.875D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      d1 = 8.875D;
      paramArrayOfDouble2[0] = zr.b(d1, 2);
      break;
    case 33: 
      paramArrayOfDouble1[0] = zr.b(9.84251968503937D, 2);
      paramArrayOfDouble2[0] = zr.b(13.89763779527559D, 2);
      break;
    case 34: 
      paramArrayOfDouble1[0] = zr.b(6.929133858267717D, 2);
      paramArrayOfDouble2[0] = zr.b(9.84251968503937D, 2);
      break;
    case 35: 
      paramArrayOfDouble1[0] = zr.b(6.929133858267717D, 2);
      paramArrayOfDouble2[0] = zr.b(4.921259842519685D, 2);
      break;
    case 29: 
      paramArrayOfDouble1[0] = zr.b(12.755905511811024D, 2);
      paramArrayOfDouble2[0] = zr.b(18.031496062992126D, 2);
      break;
    case 30: 
      paramArrayOfDouble1[0] = zr.b(9.015748031496063D, 2);
      paramArrayOfDouble2[0] = zr.b(12.755905511811024D, 2);
      break;
    case 28: 
      paramArrayOfDouble1[0] = zr.b(6.377952755905512D, 2);
      paramArrayOfDouble2[0] = zr.b(9.015748031496063D, 2);
      break;
    case 31: 
      paramArrayOfDouble1[0] = zr.b(4.488188976377953D, 2);
      paramArrayOfDouble2[0] = zr.b(6.377952755905512D, 2);
      break;
    case 32: 
      paramArrayOfDouble1[0] = zr.b(4.488188976377953D, 2);
      paramArrayOfDouble2[0] = zr.b(9.015748031496063D, 2);
      break;
    case 27: 
      paramArrayOfDouble1[0] = zr.b(4.330708661417323D, 2);
      paramArrayOfDouble2[0] = zr.b(8.661417322834646D, 2);
      break;
    case 36: 
      paramArrayOfDouble1[0] = zr.b(4.330708661417323D, 2);
      paramArrayOfDouble2[0] = zr.b(9.05511811023622D, 2);
      break;
    case 37: 
      d1 = 3.875D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      d1 = 7.5D;
      paramArrayOfDouble2[0] = zr.b(d1, 2);
      break;
    case 38: 
      d1 = 3.625D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      d1 = 6.5D;
      paramArrayOfDouble2[0] = zr.b(d1, 2);
      break;
    case 26: 
      paramArrayOfDouble1[0] = zr.b(34.0D, 2);
      paramArrayOfDouble2[0] = zr.b(44.0D, 2);
      break;
    case 7: 
      d1 = 7.25D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      d1 = 10.5D;
      paramArrayOfDouble2[0] = zr.b(d1, 2);
      break;
    case 41: 
      d1 = 8.5D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      paramArrayOfDouble2[0] = 13.0D;
      break;
    case 40: 
      d1 = 8.5D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      paramArrayOfDouble2[0] = 12.0D;
      break;
    case 39: 
      d1 = 14.875D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      paramArrayOfDouble2[0] = 11.0D;
      break;
    case 14: 
      d1 = 8.5D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      paramArrayOfDouble2[0] = 13.0D;
      break;
    case 4: 
      paramArrayOfDouble1[0] = 17.0D;
      paramArrayOfDouble2[0] = 11.0D;
      break;
    case 5: 
      d1 = 8.5D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      paramArrayOfDouble2[0] = 14.0D;
      break;
    case 1: 
      d1 = 8.5D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      paramArrayOfDouble2[0] = 11.0D;
      break;
    case 75: 
      d1 = 8.5D;
      paramArrayOfDouble1[0] = 11.0D;
      paramArrayOfDouble2[0] = zr.b(d1, 2);
      break;
    case 2: 
      d1 = 8.5D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      paramArrayOfDouble2[0] = 11.0D;
      break;
    case 18: 
      d1 = 8.5D;
      paramArrayOfDouble1[0] = zr.b(d1, 2);
      paramArrayOfDouble2[0] = 11.0D;
      break;
    case 15: 
      paramArrayOfDouble1[0] = zr.b(8.46456692913386D, 2);
      paramArrayOfDouble2[0] = zr.b(10.826771653543307D, 2);
      break;
    case 6: 
      paramArrayOfDouble1[0] = 5.5D;
      paramArrayOfDouble2[0] = 8.5D;
      break;
    case 3: 
      paramArrayOfDouble1[0] = 11.0D;
      paramArrayOfDouble2[0] = 17.0D;
      break;
    case 300: 
      paramArrayOfDouble1[0] = 13.9D;
      paramArrayOfDouble2[0] = 19.7D;
      break;
    case 301: 
      paramArrayOfDouble1[0] = zr.b(3.5433070866141736D, 2);
      paramArrayOfDouble2[0] = zr.b(2.1653543307086616D, 2);
      break;
    case 302: 
      paramArrayOfDouble1[0] = 3.0D;
      paramArrayOfDouble2[0] = 11.0D;
      break;
    default: 
      paramArrayOfDouble1[0] = zr.b(8.267716535433072D, 2);
      paramArrayOfDouble2[0] = zr.b(11.692913385826772D, 2);
    }
    if (paramPageSetup.getOrientation() == 0)
    {
      double d2 = paramArrayOfDouble1[0];
      paramArrayOfDouble1[0] = paramArrayOfDouble2[0];
      paramArrayOfDouble2[0] = d2;
    }
  }
  
  static void a(Worksheet paramWorksheet, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double paramDouble1, double paramDouble2)
  {
    PageSetup localPageSetup = paramWorksheet.getPageSetup();
    paramArrayOfDouble1[0] = ((paramDouble1 - (localPageSetup.getLeftMarginInch() + localPageSetup.getRightMarginInch())) * 72.0D);
    paramArrayOfDouble2[0] = ((paramDouble2 - (localPageSetup.getTopMarginInch() + localPageSetup.getBottomMarginInch())) * 72.0D);
  }
  
  static float a(double paramDouble, float paramFloat)
  {
    int i = (int)(paramDouble * paramFloat * 100.0D);
    int j = i % 12;
    if (j < 6) {
      return (i - j) / 100.0F;
    }
    return (i + 12 - j) / 100.0F;
  }
  
  static float b(double paramDouble, float paramFloat)
  {
    return (float)(paramDouble * paramFloat);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zauu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */