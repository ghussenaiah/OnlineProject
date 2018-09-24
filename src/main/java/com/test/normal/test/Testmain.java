package com.test.normal.test;


import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import lombok.extern.slf4j.Slf4j;





public class Testmain {

	
	static int igc=30;
	static int isubgc=30;
	static int isubsubgcounter=30;
	static int itmm=30;
	static boolean flag=true;
	
	public static void main(String args[])
	{
		testing();
	}
	
	
	//@PostConstruct
	public static void testing(){
		File excel = new File("C:\\Users\\husenaiah\\Desktop\\uuu.xls");
		FileInputStream  ex = null;
		Workbook workbook = null;
		try {
			ex = new FileInputStream(excel);
			InputStream inputStream =
				      new FileInputStream("C:\\Users\\husenaiah\\Desktop\\After Tesing.xls");
			workbook = WorkbookFactory.create(inputStream);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Map<String,String> checkdata=new HashMap<String,String>();
		Map<String,String> duplicatedata=new HashMap<String,String>();
		Map<String,String> duplicatedata1=new HashMap<String,String>();
		Map<String,String> second444=new HashMap<String,String>();
		 List<String> myList = new ArrayList<String>();
		 List<String> myList1 = new ArrayList<String>();
		 List<String> myList2 = new ArrayList<String>();
		 List<String> myList3 = new ArrayList<String>();
		 List<String> myList4 = new ArrayList<String>();
		//for(int z=0;z<=25;z++){
			
			
			Sheet sheet1 = workbook.getSheetAt(7);
			String sheetname=	workbook.getSheetName(7);
			
			Sheet sheet2 = workbook.getSheetAt(1);
			String sheetname2=	workbook.getSheetName(1);
			System.out.println("sheet no       "+0);
			System.out.println("sheet name      "+sheetname);
			int lastrownumber=0;
	
		   lastrownumber=sheet1.getLastRowNum();
		   
		   List<String>  avc=new ArrayList<String>();
		   List<String>  def=new ArrayList<String>();
		   List<String>  bedf=new ArrayList<String>();
		
		   for(int i=1;i<=lastrownumber;i++){
			   
			   HSSFRow row = (HSSFRow) sheet1.getRow(i);
				HSSFCell cell0=row.getCell(3);      
				String abc=cell0.getStringCellValue();	
				
				if(!checkdata.containsKey(abc.toLowerCase().trim()))
				   {
					checkdata.put(abc.toLowerCase().trim(), abc);   
					avc.add(abc.toLowerCase().trim());
				  }
			 }
		   int lastm=sheet2.getLastRowNum();
		   
       /*  for(int i=1;i<=lastm;i++){
			   
			   HSSFRow row = (HSSFRow) sheet1.getRow(i);
				HSSFCell cell0=row.getCell(0);      
				String def=cell0.getStringCellValue();	
				
				if(!second.containsKey(def))
				   {
					second.put(def, def);   
					bedf.add(def);
				   }
		 }
		   
         System.out.println("secondlist"+bedf);*/
		 
         int last=sheet2.getLastRowNum();
        
		   for (String temp : avc) {
			   boolean flag=false;
			   
			for(int i=1;i<=last;i++){
			   
			   HSSFRow row = (HSSFRow) sheet2.getRow(i);
			   HSSFCell cell0=row.getCell(0);      
				String abc=cell0.getStringCellValue();	
				
				// ||) abc.toLowerCase().equalsIgnoreCase(temp.toLowerCase()) 
				//abc.toLowerCase().contains(temp.toLowerCase()) && !
				//abc.toLowerCase().equalsIgnoreCase(temp.toLowerCase())
				if(abc.toLowerCase().contains(temp.toLowerCase()))
				//if(abc.toLowerCase().equalsIgnoreCase(temp.toLowerCase()))
				{
					
					flag=true;
					if(!duplicatedata1.containsKey(temp)){
					//if(!abc.toLowerCase().equalsIgnoreCase(temp.toLowerCase())){
					//duplicatedata.put(abc, abc);
					//myList.add(abc);
					myList1.add(temp);
					duplicatedata1.put(temp,temp);
					//Double ss=similarity(abc,temp);
					//int ssm=ss.intValue();
					
					//String s=String.valueOf(ssm);  
					//myList2.add(s);
					}
					//break;
				}
				//180   //63 matching  === exactly 16 and similir 47                //117 not macting
				 
		  }
			if(!flag){
				if(!second444.containsKey(temp))
				{
					myList3.add(temp);
					second444.put(temp,temp);
					flag=false;
				}
			}
			//flag=false;
			//myList4.addAll(myList3);
		   }
		  
		   System.out.println("duplicate data is"+duplicatedata);
		   System.out.println(myList3.size());
		  // int count=0;
		   for(String aa:myList3)
		   {
			   System.out.println(aa);
			   //System.out.println("count"+count++);
		   }
		   System.out.println("----------------------------------------------------------");
		   System.out.println(myList1.size());
		   for(String aa:myList1)
		   {
			   System.out.println(aa);
			   //System.out.println("count"+count++);
		   }
		  /* System.out.println("actual data data is"+duplicatedata);
		   
		   for(String aaa:myList1)
		   {
			   System.out.println(aaa);
		   }
		   for(String aaa:myList2)
		   {
			   System.out.println(aaa);
		   }*/
		 /*  for (Map.Entry<String, String> entry : duplicatedata.entrySet())
		   {
			  
		       System.out.println(entry.getKey());
		   }
		   System.out.println("commercial data"+duplicatedata1);
		   for (Map.Entry<String, String> entrym : duplicatedata1.entrySet())
		   {
			  
		       System.out.println(entrym.getKey());
		   }*/
		   
		 /*  checkdata.clear();
		   avc.clear();
				for(int i=1;i<=last;i++){
				   
				   HSSFRow row = (HSSFRow) sheet2.getRow(i);
					HSSFCell cell0=row.getCell(0);      
					String abc=cell0.getStringCellValue();	
					
					if(!second.containsKey(abc))
					   {
						second.put(abc, abc);   
						avc.add(abc);
					   }
			  
			   }
				
				System.out.println(second.size());
				
				 for (Map.Entry<String, String> entry : duplicatedata.entrySet())
				   {
					 
					 for(int i=1;i<=last;i++){
						   
						   HSSFRow row = (HSSFRow) sheet2.getRow(i);
							HSSFCell cell0=row.getCell(0);      
							String abc=cell0.getStringCellValue();	
							
							
							//if(temp.equalsIgnoreCase(abc))
							if(abc.toLowerCase()!=entry.getKey().toLowerCase())
							{
								another.put(abc, abc);
							}
							
					  }

					  
				      
				   }	
				 
				 		System.out.println("unique elements");
				 for (Map.Entry<String, String> entry : another.entrySet())
				   {
				   System.out.println(entry.getKey());
				   }
				*/
				
				//printing(second);
	}
	 public static double similarity(String s1, String s2) {
		    String longer = s1, shorter = s2;
		    if (s1.length() < s2.length()) { // longer should always have greater length
		      longer = s2; shorter = s1;
		    }
		    int longerLength = longer.length();
		    if (longerLength == 0) { return 1.0; /* both strings are zero length */ }
		    /* // If you have StringUtils, you can use it to calculate the edit distance:
		    return (longerLength - StringUtils.getLevenshteinDistance(longer, shorter)) /
		                               (double) longerLength; */
		    return (longerLength - editDistance(longer, shorter)) / (double) longerLength *100;

		  }

		  // Example implementation of the Levenshtein Edit Distance
		  // See http://rosettacode.org/wiki/Levenshtein_distance#Java
		  public static int editDistance(String s1, String s2) {
		    s1 = s1.toLowerCase();
		    s2 = s2.toLowerCase();

		    int[] costs = new int[s2.length() + 1];
		    for (int i = 0; i <= s1.length(); i++) {
		      int lastValue = i;
		      for (int j = 0; j <= s2.length(); j++) {
		        if (i == 0)
		          costs[j] = j;
		        else {
		          if (j > 0) {
		            int newValue = costs[j - 1];
		            if (s1.charAt(i - 1) != s2.charAt(j - 1))
		              newValue = Math.min(Math.min(newValue, lastValue),
		                  costs[j]) + 1;
		            costs[j - 1] = lastValue;
		            lastValue = newValue;
		          }
		        }
		      }
		      if (i > 0)
		        costs[s2.length()] = lastValue;
		    }
		    return costs[s2.length()];
		  }

    public static void printing(Map<String,String> def) {

    	 String FILE_NAME = "C:\\Users\\husenaiah\\Desktop\\MyFirstExcel.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
       
        int rowNum = 0;
        System.out.println("Creating excel");

        for (Map.Entry<String, String> entry : def.entrySet())
		   {
			  
		       System.out.println(entry.getKey());
		   
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
           
                Cell cell = row.createCell(colNum++);
                cell.setCellValue(entry.getKey());
                
            }
    
        

        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            ((Closeable) workbook).close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
	/*public class ProcessAction extends DispatchAction {

	    String dupValue = null;
	    ArrayList<String> dupList = new ArrayList<String>();

	    private String validateDuplicateRecords(ProcessForm process) {
	        String errorMessage = null;

	        dupValue = process.getId.trim()+"    "+process.getFirstname().trim()+"    "+process.getLastanme().trim();
	        mLogger.debug("order id,ctn,item id: "+dupValue);
	        if (dupList.contains(dupValue)){
	            mLogger.debug("value not added");
	            errorMessage = "Duplicate Record Exists";
	        } else {
	            dupList.add(dupValue);
	        }

	        return errorMessage;
	    }
	}

	public void removeDuplicates() {
		  var sheet = SpreadsheetApp.getActiveSheet();
		  var data = ((Object) sheet).getDataRange().getValues();
		  var newData = new Array();
		  for(i in data){
		    var row = data[i];
		    var duplicate = false;
		    for(j in newData){
		      if(row.join() == newData[j].join()){
		        duplicate = true;
		      }
		    }
		    if(!duplicate){
		      newData.push(row);
		    }
		  }
		  sheet.clearContents();
		  sheet.getRange(1, 1, newData.length, newData[0].length).setValues(newData);
		}
*/
}


