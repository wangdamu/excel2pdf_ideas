package com.aspose.cells;

class zafc
{
  static void a(zago paramzago, int paramInt)
    throws Exception
  {
    paramzago.b(" var c_rgszClr=new Array(8);");
    paramzago.b(" c_rgszClr[0]=\"window\";");
    paramzago.b(" c_rgszClr[1]=\"buttonface\";");
    paramzago.b(" c_rgszClr[2]=\"windowframe\";");
    paramzago.b(" c_rgszClr[3]=\"windowtext\";");
    paramzago.b(" c_rgszClr[4]=\"threedlightshadow\";");
    paramzago.b(" c_rgszClr[5]=\"threedhighlight\";");
    paramzago.b(" c_rgszClr[6]=\"threeddarkshadow\";");
    paramzago.b(" c_rgszClr[7]=\"threedshadow\";");
    paramzago.g();
    paramzago.b(" var g_iShCur;");
    paramzago.b(" var g_rglTabX=new Array(c_lTabs);");
    paramzago.g();
    paramzago.b("function fnGetIEVer()");
    paramzago.b("{");
    paramzago.b(" var ua=window.navigator.userAgent");
    paramzago.b(" var msie=ua.indexOf(\"MSIE\")");
    paramzago.b(" if (msie>0 && window.navigator.platform==\"Win32\")");
    paramzago.b("  return parseInt(ua.substring(msie+5,ua.indexOf(\".\", msie)));");
    paramzago.b(" else");
    paramzago.b("  return 0;");
    paramzago.b("}");
    paramzago.g();
    paramzago.b("function fnBuildFrameset()");
    paramzago.b("{");
    paramzago.b(" var szHTML=\"<frameset rows=\\\"*,18\\\" border=0 width=0 frameborder=no framespacing=0>\"+");
    paramzago.b("  \"<frame src=\\\"\"+document.all.item(\"shLink\")[" + paramInt + "].href+\"\\\" name=\\\"frSheet\\\" noresize>\"+");
    paramzago.b("  \"<frameset cols=\\\"54,*\\\" border=0 width=0 frameborder=no framespacing=0>\"+");
    paramzago.b("  \"<frame src=\\\"\\\" name=\\\"frScroll\\\" marginwidth=0 marginheight=0 scrolling=no>\"+");
    paramzago.b("  \"<frame src=\\\"\\\" name=\\\"frTabs\\\" marginwidth=0 marginheight=0 scrolling=no>\"+");
    paramzago.b("  \"</frameset></frameset><plaintext>\";");
    paramzago.g();
    paramzago.b(" with (document) {");
    paramzago.b("  open(\"text/html\",\"replace\");");
    paramzago.b("  write(szHTML);");
    paramzago.b("  close();");
    paramzago.b(" }");
    paramzago.g();
    paramzago.b(" fnBuildTabStrip();");
    paramzago.b("}");
    paramzago.g();
    paramzago.b("function fnBuildTabStrip()");
    paramzago.b("{");
    paramzago.b(" var szHTML=");
    paramzago.b("  \"<html><head><style>.clScroll {font:8pt Courier New;color:\"+c_rgszClr[6]+\";cursor:default;line-height:10pt;}\"+");
    paramzago.b("  \".clScroll2 {font:10pt Arial;color:\"+c_rgszClr[6]+\";cursor:default;line-height:11pt;}</style></head>\"+");
    paramzago.b("  \"<body onclick=\\\"event.returnValue=false;\\\" ondragstart=\\\"event.returnValue=false;\\\" onselectstart=\\\"event.returnValue=false;\\\" bgcolor=\"+c_rgszClr[4]+\" topmargin=0 leftmargin=0><table cellpadding=0 cellspacing=0 width=100%>\"+");
    paramzago.b("  \"<tr><td colspan=6 height=1 bgcolor=\"+c_rgszClr[2]+\"></td></tr>\"+");
    paramzago.b("  \"<tr><td style=\\\"font:1pt\\\">&nbsp;<td>\"+");
    paramzago.b("  \"<td valign=top id=tdScroll class=\\\"clScroll\\\" onclick=\\\"parent.fnFastScrollTabs(0);\\\" onmouseover=\\\"parent.fnMouseOverScroll(0);\\\" onmouseout=\\\"parent.fnMouseOutScroll(0);\\\"><a>&#171;</a></td>\"+");
    paramzago.b("  \"<td valign=top id=tdScroll class=\\\"clScroll2\\\" onclick=\\\"parent.fnScrollTabs(0);\\\" ondblclick=\\\"parent.fnScrollTabs(0);\\\" onmouseover=\\\"parent.fnMouseOverScroll(1);\\\" onmouseout=\\\"parent.fnMouseOutScroll(1);\\\"><a>&lt</a></td>\"+");
    paramzago.b("  \"<td valign=top id=tdScroll class=\\\"clScroll2\\\" onclick=\\\"parent.fnScrollTabs(1);\\\" ondblclick=\\\"parent.fnScrollTabs(1);\\\" onmouseover=\\\"parent.fnMouseOverScroll(2);\\\" onmouseout=\\\"parent.fnMouseOutScroll(2);\\\"><a>&gt</a></td>\"+");
    paramzago.b("  \"<td valign=top id=tdScroll class=\\\"clScroll\\\" onclick=\\\"parent.fnFastScrollTabs(1);\\\" onmouseover=\\\"parent.fnMouseOverScroll(3);\\\" onmouseout=\\\"parent.fnMouseOutScroll(3);\\\"><a>&#187;</a></td>\"+");
    paramzago.b("  \"<td style=\\\"font:1pt\\\">&nbsp;<td></tr></table></body></html>\";");
    paramzago.g();
    paramzago.b(" with (frames['frScroll'].document) {");
    paramzago.b("  open(\"text/html\",\"replace\");");
    paramzago.b("  write(szHTML);");
    paramzago.b("  close();");
    paramzago.b(" }");
    paramzago.g();
    paramzago.b(" szHTML =");
    paramzago.b("  \"<html><head>\"+");
    paramzago.b("  \"<style>A:link,A:visited,A:active {text-decoration:none;\"+\"color:\"+c_rgszClr[3]+\";}\"+");
    paramzago.b("  \".clTab {cursor:hand;background:\"+c_rgszClr[1]+\";font:9pt Arial;padding-left:3px;padding-right:3px;text-align:center;}\"+");
    paramzago.b("  \".clBorder {background:\"+c_rgszClr[2]+\";font:1pt;}\"+");
    paramzago.b("  \"</style></head><body onload=\\\"parent.fnInit();\\\" onselectstart=\\\"event.returnValue=false;\\\" ondragstart=\\\"event.returnValue=false;\\\" bgcolor=\"+c_rgszClr[4]+");
    paramzago.b("  \" topmargin=0 leftmargin=0><table id=tbTabs cellpadding=0 cellspacing=0>\";");
    paramzago.g();
    paramzago.b(" var iCellCount=(c_lTabs+1)*2;");
    paramzago.g();
    paramzago.b(" var i;");
    paramzago.b(" for (i=0;i<iCellCount;i+=2)");
    paramzago.b("  szHTML+=\"<col width=1><col>\";");
    paramzago.g();
    paramzago.b(" var iRow;");
    paramzago.b(" for (iRow=0;iRow<6;iRow++) {");
    paramzago.g();
    paramzago.b("  szHTML+=\"<tr>\";");
    paramzago.g();
    paramzago.b("  if (iRow==5)");
    paramzago.b("   szHTML+=\"<td colspan=\"+iCellCount+\"></td>\";");
    paramzago.b("  else {");
    paramzago.b("   if (iRow==0) {");
    paramzago.b("    for(i=0;i<iCellCount;i++)");
    paramzago.b("     szHTML+=\"<td height=1 class=\\\"clBorder\\\"></td>\";");
    paramzago.b("   } else if (iRow==1) {");
    paramzago.b("    for(i=0;i<c_lTabs;i++) {");
    paramzago.b("     szHTML+=\"<td height=1 nowrap class=\\\"clBorder\\\">&nbsp;</td>\";");
    paramzago.b("     szHTML+=");
    paramzago.b("      \"<td id=tdTab height=1 nowrap class=\\\"clTab\\\" onmouseover=\\\"parent.fnMouseOverTab(\"+i+\");\\\" onmouseout=\\\"parent.fnMouseOutTab(\"+i+\");\\\">\"+");
    paramzago.b("      \"<a href=\\\"\"+document.all.item(\"shLink\")[i].href+\"\\\" target=\\\"frSheet\\\" id=aTab>&nbsp;\"+c_rgszSh[i]+\"&nbsp;</a></td>\";");
    paramzago.b("    }");
    paramzago.b("    szHTML+=\"<td id=tdTab height=1 nowrap class=\\\"clBorder\\\"><a id=aTab>&nbsp;</a></td><td width=100%></td>\";");
    paramzago.b("   } else if (iRow==2) {");
    paramzago.b("    for (i=0;i<c_lTabs;i++)");
    paramzago.b("     szHTML+=\"<td height=1></td><td height=1 class=\\\"clBorder\\\"></td>\";");
    paramzago.b("    szHTML+=\"<td height=1></td><td height=1></td>\";");
    paramzago.b("   } else if (iRow==3) {");
    paramzago.b("    for (i=0;i<iCellCount;i++)");
    paramzago.b("     szHTML+=\"<td height=1></td>\";");
    paramzago.b("   } else if (iRow==4) {");
    paramzago.b("    for (i=0;i<c_lTabs;i++)");
    paramzago.b("     szHTML+=\"<td height=1 width=1></td><td height=1></td>\";");
    paramzago.b("    szHTML+=\"<td height=1 width=1></td><td></td>\";");
    paramzago.b("   }");
    paramzago.b("  }");
    paramzago.b("  szHTML+=\"</tr>\";");
    paramzago.b(" }");
    paramzago.g();
    paramzago.b(" szHTML+=\"</table></body></html>\";");
    paramzago.b(" with (frames['frTabs'].document) {");
    paramzago.b("  open(\"text/html\",\"replace\");");
    paramzago.b("  charset=document.charset;");
    paramzago.b("  write(szHTML);");
    paramzago.b("  close();");
    paramzago.b(" }");
    paramzago.b("}");
    paramzago.g();
    paramzago.b("function fnInit()");
    paramzago.b("{");
    paramzago.b(" g_rglTabX[0]=0;");
    paramzago.b(" var i;");
    paramzago.b(" for (i=1;i<=c_lTabs;i++)");
    paramzago.b("  with (frames['frTabs'].document.all.tbTabs.rows[1].cells[fnTabToCol(i-1)])");
    paramzago.b("   g_rglTabX[i]=offsetLeft+offsetWidth-6;");
    paramzago.b("}");
    paramzago.g();
    paramzago.b("function fnTabToCol(iTab)");
    paramzago.b("{");
    paramzago.b(" return 2*iTab+1;");
    paramzago.b("}");
    paramzago.g();
    paramzago.b("function fnNextTab(fDir)");
    paramzago.b("{");
    paramzago.b(" var iNextTab=-1;");
    paramzago.b(" var i;");
    paramzago.g();
    paramzago.b(" with (frames['frTabs'].document.body) {");
    paramzago.b("  if (fDir==0) {");
    paramzago.b("   if (scrollLeft>0) {");
    paramzago.b("    for (i=0;i<c_lTabs&&g_rglTabX[i]<scrollLeft;i++);");
    paramzago.b("    if (i<c_lTabs)");
    paramzago.b("     iNextTab=i-1;");
    paramzago.b("   }");
    paramzago.b("  } else {");
    paramzago.b("   if (g_rglTabX[c_lTabs]+6>offsetWidth+scrollLeft) {");
    paramzago.b("    for (i=0;i<c_lTabs&&g_rglTabX[i]<=scrollLeft;i++);");
    paramzago.b("    if (i<c_lTabs)");
    paramzago.b("     iNextTab=i;");
    paramzago.b("   }");
    paramzago.b("  }");
    paramzago.b(" }");
    paramzago.b(" return iNextTab;");
    paramzago.b("}");
    paramzago.g();
    paramzago.b("function fnScrollTabs(fDir)");
    paramzago.b("{");
    paramzago.b(" var iNextTab=fnNextTab(fDir);");
    paramzago.g();
    paramzago.b(" if (iNextTab>=0) {");
    paramzago.b("  frames['frTabs'].scroll(g_rglTabX[iNextTab],0);");
    paramzago.b("  return true;");
    paramzago.b(" } else");
    paramzago.b("  return false;");
    paramzago.b("}");
    paramzago.g();
    paramzago.b("function fnFastScrollTabs(fDir)");
    paramzago.b("{");
    paramzago.b(" if (c_lTabs>16)");
    paramzago.b("  frames['frTabs'].scroll(g_rglTabX[fDir?c_lTabs-1:0],0);");
    paramzago.b(" else");
    paramzago.b("  if (fnScrollTabs(fDir)>0) window.setTimeout(\"fnFastScrollTabs(\"+fDir+\");\",5);");
    paramzago.b("}");
    paramzago.g();
    paramzago.b("function fnSetTabProps(iTab,fActive)");
    paramzago.b("{");
    paramzago.b(" var iCol=fnTabToCol(iTab);");
    paramzago.b(" var i;");
    paramzago.g();
    paramzago.b(" if (iTab>=0) {");
    paramzago.b("  with (frames['frTabs'].document.all) {");
    paramzago.b("   with (tbTabs) {");
    paramzago.b("    for (i=0;i<=4;i++) {");
    paramzago.b("     with (rows[i]) {");
    paramzago.b("      if (i==0)");
    paramzago.b("       cells[iCol].style.background=c_rgszClr[fActive?0:2];");
    paramzago.b("      else if (i>0 && i<4) {");
    paramzago.b("       if (fActive) {");
    paramzago.b("        cells[iCol-1].style.background=c_rgszClr[2];");
    paramzago.b("        cells[iCol].style.background=c_rgszClr[0];");
    paramzago.b("        cells[iCol+1].style.background=c_rgszClr[2];");
    paramzago.b("       } else {");
    paramzago.b("        if (i==1) {");
    paramzago.b("         cells[iCol-1].style.background=c_rgszClr[2];");
    paramzago.b("         cells[iCol].style.background=c_rgszClr[1];");
    paramzago.b("         cells[iCol+1].style.background=c_rgszClr[2];");
    paramzago.b("        } else {");
    paramzago.b("         cells[iCol-1].style.background=c_rgszClr[4];");
    paramzago.b("         cells[iCol].style.background=c_rgszClr[(i==2)?2:4];");
    paramzago.b("         cells[iCol+1].style.background=c_rgszClr[4];");
    paramzago.b("        }");
    paramzago.b("       }");
    paramzago.b("      } else");
    paramzago.b("       cells[iCol].style.background=c_rgszClr[fActive?2:4];");
    paramzago.b("     }");
    paramzago.b("    }");
    paramzago.b("   }");
    paramzago.b("   with (aTab[iTab].style) {");
    paramzago.b("    cursor=(fActive?\"default\":\"hand\");");
    paramzago.b("    color=c_rgszClr[3];");
    paramzago.b("   }");
    paramzago.b("  }");
    paramzago.b(" }");
    paramzago.b("}");
    paramzago.g();
    paramzago.b("function fnMouseOverScroll(iCtl)");
    paramzago.b("{");
    paramzago.b(" frames['frScroll'].document.all.tdScroll[iCtl].style.color=c_rgszClr[7];");
    paramzago.b("}");
    paramzago.b("");
    paramzago.b("function fnMouseOutScroll(iCtl)");
    paramzago.b("{");
    paramzago.b(" frames['frScroll'].document.all.tdScroll[iCtl].style.color=c_rgszClr[6];");
    paramzago.b("}");
    paramzago.g();
    paramzago.b("function fnMouseOverTab(iTab)");
    paramzago.b("{");
    paramzago.b(" if (iTab!=g_iShCur) {");
    paramzago.b("  var iCol=fnTabToCol(iTab);");
    paramzago.b("  with (frames['frTabs'].document.all) {");
    paramzago.b("   tdTab[iTab].style.background=c_rgszClr[5];");
    paramzago.b("  }");
    paramzago.b(" }");
    paramzago.b("}");
    paramzago.g();
    paramzago.b("function fnMouseOutTab(iTab)");
    paramzago.b("{");
    paramzago.b(" if (iTab>=0) {");
    paramzago.b("  var elFrom=frames['frTabs'].event.srcElement;");
    paramzago.b("  var elTo=frames['frTabs'].event.toElement;");
    paramzago.g();
    paramzago.b("  if ((!elTo) ||");
    paramzago.b("   (elFrom.tagName==elTo.tagName) ||");
    paramzago.b("   (elTo.tagName==\"A\" && elTo.parentElement!=elFrom) ||");
    paramzago.b("   (elFrom.tagName==\"A\" && elFrom.parentElement!=elTo)) {");
    paramzago.g();
    paramzago.b("   if (iTab!=g_iShCur) {");
    paramzago.b("    with (frames['frTabs'].document.all) {");
    paramzago.b("     tdTab[iTab].style.background=c_rgszClr[1];");
    paramzago.b("    }");
    paramzago.b("   }");
    paramzago.b("  }");
    paramzago.b(" }");
    paramzago.b("}");
    paramzago.g();
    paramzago.b("function fnSetActiveSheet(iSh)");
    paramzago.b("{");
    paramzago.b(" if (iSh!=g_iShCur) {");
    paramzago.b("  fnSetTabProps(g_iShCur,false);");
    paramzago.b("  fnSetTabProps(iSh,true);");
    paramzago.b("  g_iShCur=iSh;");
    paramzago.b(" }");
    paramzago.b("}");
    paramzago.g();
    paramzago.b(" window.g_iIEVer=fnGetIEVer();");
    paramzago.b(" if (window.g_iIEVer>=4)");
    paramzago.b("  fnBuildFrameset();");
    paramzago.b("//-->");
    paramzago.g();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */