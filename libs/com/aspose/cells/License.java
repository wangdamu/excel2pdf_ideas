package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLDecoder;
import java.security.CodeSource;
import java.security.KeyFactory;
import java.security.ProtectionDomain;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.KeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class License
{
  private String[] b;
  private int c;
  private String d;
  private Date e;
  private Date f;
  private String g;
  static License a = null;
  private static final String h = "Cells".equals("GroupDocs") ? "nznezAVF+7ill9X2VPlH6eOPjG15OuVNohmtG0mmqpS5iyj6simOTGY1oN4qekTgbxqtIjFy1V0mtJW7yrhwG0Ho4iUsinaeCOI6DUL4T7fPMWRf1MOlBmi4Y1bdHAG8LpR7lDpG925YCRgynU1zpt6jaK8qDkthh239UN1Rcvc=" : "0nRuwNEddXwLfXB7pw66G71MS93gW8mNzJ7vuh3Sf4VAEOBfpxtHLCotymv1PoeukxYe31K441Ivq0Pkvx1yZZG4O1KCv3Omdbs7uqzUB4xXHlOub4VsTODzDJ5MWHqlRCB1HHcGjlyT2sVGiovLt0Grvqw5+QXBuinoBY0suX0=";
  
  public static boolean isLicenseSet()
  {
    return a != null;
  }
  
  public static Date getSubscriptionExpireDate()
  {
    if (a == null) {
      return null;
    }
    return a.a();
  }
  
  public void setLicense(InputStream stream)
  {
    Document localDocument = null;
    if (stream != null) {
      try
      {
        DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder localDocumentBuilder = localDocumentBuilderFactory.newDocumentBuilder();
        localDocument = localDocumentBuilder.parse(stream);
      }
      catch (Exception localException1)
      {
        throw new CellsException(9, "Error when parse license stream.", localException1);
      }
    }
    a(localDocument);
  }
  
  public void setLicense(String licenseFileName)
  {
    File localFile = a(licenseFileName);
    if (localFile == null) {
      throw new CellsException(9, "Cannot find license file: " + licenseFileName);
    }
    if (zl.a()) {
      zl.a("Using license file: " + localFile.getAbsolutePath());
    }
    Document localDocument = null;
    try
    {
      DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder localDocumentBuilder = localDocumentBuilderFactory.newDocumentBuilder();
      localDocument = localDocumentBuilder.parse(localFile);
    }
    catch (CellsException localCellsException1)
    {
      throw localCellsException1;
    }
    catch (Exception localException1)
    {
      throw new CellsException(9, "Error when parse license file.", localException1);
    }
    a(localDocument);
  }
  
  private File a(String paramString)
  {
    File localFile = new File(paramString);
    if (localFile.isFile()) {
      return localFile;
    }
    if (zl.a()) {
      zl.a("Cannot find license file " + localFile.getAbsolutePath());
    }
    try
    {
      HashMap localHashMap1 = new HashMap();
      localFile = a(License.class, paramString, localHashMap1);
      if (localFile != null) {
        return localFile;
      }
      StackTraceElement[] arrayOfStackTraceElement = new Exception().getStackTrace();
      HashMap localHashMap2 = new HashMap();
      localHashMap2.put(License.class.getName(), Boolean.FALSE);
      for (int i = 2; i < arrayOfStackTraceElement.length; i++)
      {
        String str = arrayOfStackTraceElement[i].getClassName();
        if (!localHashMap2.containsKey(str))
        {
          localFile = a(Class.forName(str), paramString, localHashMap1);
          if (localFile != null) {
            return localFile;
          }
          localHashMap2.put(str, Boolean.FALSE);
        }
      }
    }
    catch (Throwable localThrowable)
    {
      if (zl.a()) {
        zl.a(localThrowable.getClass().getName() + ":" + localThrowable.getMessage());
      }
    }
    return null;
  }
  
  private File a(Class paramClass, String paramString, HashMap<String, Boolean> paramHashMap)
    throws Exception
  {
    ProtectionDomain localProtectionDomain = paramClass.getProtectionDomain();
    if (localProtectionDomain != null)
    {
      CodeSource localCodeSource = localProtectionDomain.getCodeSource();
      if (localCodeSource != null)
      {
        File localFile = new File(URLDecoder.decode(localCodeSource.getLocation().getFile(), "UTF-8"));
        if (localFile.getName().endsWith(".jar")) {
          localFile = localFile.getParentFile();
        }
        String str = localFile.getCanonicalPath();
        if (paramHashMap.containsKey(str)) {
          return null;
        }
        localFile = new File(localFile, paramString);
        if (localFile.isFile()) {
          return localFile;
        }
        paramHashMap.put(str, Boolean.FALSE);
        if (zl.a()) {
          zl.a("Cannot find license file " + localFile.getAbsolutePath());
        }
      }
    }
    return null;
  }
  
  public void setLicense(Reader reader)
  {
    Document localDocument = null;
    if (reader != null) {
      try
      {
        DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder localDocumentBuilder = localDocumentBuilderFactory.newDocumentBuilder();
        localDocument = localDocumentBuilder.parse(new InputSource(reader));
      }
      catch (Exception localException1)
      {
        throw new CellsException(9, "Error when parse license reader.", localException1);
      }
    }
    a(localDocument);
  }
  
  private void a(Document paramDocument)
  {
    if (paramDocument != null)
    {
      zbzr.a(paramDocument);
      paramDocument.getDocumentElement().normalize();
      Element localElement = paramDocument.getDocumentElement();
      Node localNode1 = localElement.getElementsByTagName("Data").item(0);
      Node localNode2 = localElement.getElementsByTagName("Signature").item(0);
      if ((localNode1 != null) && (localNode2 != null) && (a(zbzr.a(localNode1), localNode2.getLastChild().getNodeValue())))
      {
        Object localObject1;
        try
        {
          Node localNode3 = zbzr.a(localNode1.getChildNodes(), "Products");
          localObject1 = localNode1.getChildNodes();
          for (int i = ((NodeList)localObject1).getLength() - 1; i > -1; i--)
          {
            Node localNode4 = ((NodeList)localObject1).item(i);
            String str2 = localNode4.getNodeName();
            Object localObject2;
            if (str2.equals("Products"))
            {
              localObject2 = localNode3.getChildNodes();
              this.b = new String[((NodeList)localObject2).getLength()];
              for (int j = ((NodeList)localObject2).getLength() - 1; j > -1; j--)
              {
                Node localNode5 = ((NodeList)localObject2).item(j).getLastChild();
                this.b[j] = b(localNode5 == null ? "" : localNode5.getNodeValue());
              }
            }
            else if (str2.equals("EditionType"))
            {
              localObject2 = localNode4.getLastChild();
              this.c = k(localObject2 == null ? "" : ((Node)localObject2).getNodeValue());
            }
            else if (str2.equals("SerialNumber"))
            {
              localObject2 = localNode4.getLastChild();
              this.d = (localObject2 == null ? "" : ((Node)localObject2).getNodeValue());
            }
            else if (str2.equals("SubscriptionExpiry"))
            {
              localObject2 = localNode4.getLastChild();
              this.e = j(localObject2 == null ? "" : ((Node)localObject2).getNodeValue());
            }
            else if (str2.equals("LicenseExpiry"))
            {
              localObject2 = localNode4.getLastChild();
              this.f = j(localObject2 == null ? "" : ((Node)localObject2).getNodeValue());
            }
            else if (str2.equals("OemPublicKeyToken"))
            {
              localObject2 = localNode4.getLastChild();
              this.g = (localObject2 == null ? "" : ((Node)localObject2).getNodeValue());
            }
          }
        }
        catch (CellsException localCellsException)
        {
          throw localCellsException;
        }
        catch (Exception localException)
        {
          throw new CellsException(9, "The license is invalid. ", localException);
        }
        if (i(this.d))
        {
          a(this.b);
          String str1 = "2017-10-20";
          if ((str1 != null) && (this.e != null))
          {
            localObject1 = new SimpleDateFormat("yyyy-MM-dd");
            Date localDate = null;
            try
            {
              localDate = ((SimpleDateFormat)localObject1).parse(str1);
            }
            catch (ParseException localParseException)
            {
              throw new CellsException(9, "Invalid release date.");
            }
            if (localDate.after(this.e)) {
              throw new CellsException(9, "The subscription included in this license allows free upgrades until " + ((SimpleDateFormat)localObject1).format(this.e) + ", but this version of the product was released on " + str1 + ". Please renew the subscription or use a previous version of the product.");
            }
          }
          if ((this.f != null) && (new Date().after(this.f))) {
            throw new CellsException(9, "The license has expired.");
          }
          a = this;
          zbat.a();
          return;
        }
      }
    }
    a = null;
    zwy.a();
  }
  
  Date a()
  {
    return this.e;
  }
  
  Date b()
  {
    return this.f;
  }
  
  private static String b(String paramString)
  {
    if ("Cells".equals("Cells")) {
      return f(paramString);
    }
    if ("Cells".equals("Android")) {
      return c(paramString);
    }
    if ("Cells".equals("JavaScript")) {
      return d(paramString);
    }
    if ("Cells".equals("PHP")) {
      return e(paramString);
    }
    if ("Cells".equals("Slides")) {
      return g(paramString);
    }
    if ("Cells".equals("GroupDocs")) {
      return h(paramString);
    }
    return f(paramString);
  }
  
  private static String c(String paramString)
  {
    if ((paramString.equals("Aspose.Cells for Android via Java")) || (paramString.equals("Aspose.Total for Android via Java")) || (paramString.equals("Aspose.Cells for Android")) || (paramString.equals("Aspose.Total for Android"))) {
      return "Aspose.Cells for Java";
    }
    throw new CellsException(9, "The license is not valid for this product.");
  }
  
  private static String d(String paramString)
  {
    if ((paramString.equals("Aspose.Cells for JavaScript via Java")) || (paramString.equals("Aspose.Total for JavaScript via Java"))) {
      return "Aspose.Cells for Java";
    }
    throw new CellsException(9, "The license is not valid for this product.");
  }
  
  private static String e(String paramString)
  {
    if ((paramString.equals("Aspose.Cells for PHP via Java")) || (paramString.equals("Aspose.Total for PHP via Java"))) {
      return "Aspose.Cells for Java";
    }
    throw new CellsException(9, "The license is not valid for this product.");
  }
  
  private static String f(String paramString)
  {
    if (paramString.equals("Aspose.Excel for Java")) {
      return "Aspose.Cells for Java";
    }
    if (paramString.equals("Aspose.Cells for Android")) {
      return "Aspose.Cells for Android via Java";
    }
    if ((paramString.equals("Aspose.Total")) || (paramString.equals("Aspose.Total for Java")) || (paramString.equals("Aspose.Total Product Family")) || (paramString.equals("Aspose.Cells Product Family"))) {
      return "Aspose.Cells for Java";
    }
    return paramString;
  }
  
  private static String g(String paramString)
  {
    if ((paramString.equals("Aspose.Total")) || (paramString.equals("Aspose.Total for Java")) || (paramString.equals("Aspose.Slides for Java")) || (paramString.equals("Aspose.Total Product Family")) || (paramString.equals("Aspose.Slides Product Family"))) {
      return "Aspose.Cells for Java";
    }
    throw new CellsException(9, "The license is not valid for this product.");
  }
  
  private static String h(String paramString)
  {
    if ((paramString.equals("GroupDocs.Annotation for Java")) || (paramString.equals("GroupDocs.Comparison for Java")) || (paramString.equals("GroupDocs.Conversion for Java")) || (paramString.equals("GroupDocs.Editor for Java")) || (paramString.equals("GroupDocs.Signature for Java")) || (paramString.equals("GroupDocs.Search for Java")) || (paramString.equals("GroupDocs.Metadata for Java")) || (paramString.equals("GroupDocs.Viewer for Java")) || (paramString.equals("GroupDocs.Total for Java"))) {
      return "Aspose.Cells for Java";
    }
    throw new CellsException(9, "The license is not valid for this product.");
  }
  
  private static boolean a(String paramString1, String paramString2)
  {
    if (paramString1.equals("<Data />")) {
      paramString1 = "<Data></Data>";
    } else {
      paramString1 = paramString1.replaceAll("&", "&amp;");
    }
    PublicKey localPublicKey = null;
    try
    {
      KeyFactory localKeyFactory = KeyFactory.getInstance("RSA");
      localObject = new RSAPublicKeySpec(new BigInteger(1, zcn.a(h, "UTF-8")), new BigInteger(1, zcn.a("AQAB", "UTF-8")));
      localPublicKey = localKeyFactory.generatePublic((KeySpec)localObject);
    }
    catch (Exception localException1)
    {
      return false;
    }
    Signature localSignature = null;
    Object localObject = null;
    try
    {
      byte[] arrayOfByte = paramString1.getBytes("UTF-16LE");
      localObject = zcn.a(paramString2, "UTF-8");
      localSignature = Signature.getInstance("SHA1withRSA");
      localSignature.initVerify(localPublicKey);
      localSignature.update(arrayOfByte);
      if (!localSignature.verify((byte[])localObject)) {
        return false;
      }
    }
    catch (Exception localException2)
    {
      return false;
    }
    return true;
  }
  
  private static boolean i(String paramString)
  {
    ArrayList localArrayList = c();
    if (localArrayList == null) {
      return false;
    }
    for (int i = 0; i < localArrayList.size(); i++) {
      if (((String)localArrayList.get(i)).equals(paramString)) {
        throw new CellsException(9, "This license is disabled, please contact Aspose to obtain a new license.");
      }
    }
    return true;
  }
  
  private static ArrayList c()
  {
    try
    {
      InputStream localInputStream = License.class.getResourceAsStream("/" + License.class.getPackage().getName().replace('.', '/') + "/resources/Aspose.License.BlackList.xml");
      DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder localDocumentBuilder = localDocumentBuilderFactory.newDocumentBuilder();
      Document localDocument = localDocumentBuilder.parse(localInputStream);
      zbzr.a(localDocument);
      Element localElement = localDocument.getDocumentElement();
      Node localNode1 = localElement.getElementsByTagName("Data").item(0);
      Node localNode2 = localElement.getElementsByTagName("Signature").item(0);
      if ((localNode1 != null) && (localNode2 != null) && (a(zbzr.a(localNode1), localNode2.getLastChild().getNodeValue())))
      {
        ArrayList localArrayList = new ArrayList();
        NodeList localNodeList = localNode1.getChildNodes();
        if (localNodeList != null) {
          for (int i = 0; i < localNodeList.getLength(); i++) {
            if (localNodeList.item(i).getNodeName().equals("SN"))
            {
              Node localNode3 = localNodeList.item(i).getLastChild();
              localArrayList.add(localNode3 == null ? "" : localNode3.getNodeValue());
            }
          }
        }
        return localArrayList;
      }
    }
    catch (CellsException localCellsException)
    {
      throw localCellsException;
    }
    catch (Exception localException)
    {
      throw new CellsException(9, "Cannot find black listed licenses resource or black list is invalid. Please report this error to Aspose.");
    }
    return null;
  }
  
  private static void a(String[] paramArrayOfString)
  {
    String str = "Aspose.Cells for Java";
    if (str != null) {
      for (int i = 0; i < paramArrayOfString.length; i++) {
        if (str.equals(paramArrayOfString[i])) {
          return;
        }
      }
    }
    throw new CellsException(9, "The license is not valid for this product.");
  }
  
  private static Date j(String paramString)
  {
    if (paramString != "")
    {
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd");
      try
      {
        return localSimpleDateFormat.parse(paramString);
      }
      catch (ParseException localParseException)
      {
        throw new IllegalArgumentException("Invalid SubscriptionExpiry date");
      }
    }
    return null;
  }
  
  private static int k(String paramString)
  {
    if (paramString.equals("Professional")) {
      return 1;
    }
    if (paramString.equals("Enterprise")) {
      return 2;
    }
    throw new CellsException(9, "Invalid edition type.");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/License.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */