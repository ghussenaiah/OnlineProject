package com.bcv.kagami;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcv.kagami.core.databinder.repository.GenericDao;
import com.bcv.kagami.core.validations.exception.app.ApplicationSQLException;
import com.bcv.kagami.modules.model.ItemGroup_1;
import com.bcv.kagami.modules.model.ItemGroup_1492004844155;
import com.bcv.kagami.modules.model.ItemSubGroup_2;
import com.bcv.kagami.modules.model.ItemSubSubGroup_4;
import com.bcv.kagami.modules.model.ItemSubSubGrp_185;
import com.bcv.kagami.modules.model.ItemSubgrp_184;
import com.bcv.kagami.modules.model.Item_1491554208887;
import com.bcv.kagami.modules.model.Item_5;
import com.bcv.kagami.runtime.verb.create.repository.CreateDAO;
import com.bcv.kagami.runtime.verb.create.service.CreateService;


import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class Testmain2 {

	
	static int igc=40;
	static int isubgc=40;
	static int isubsubgcounter=40;
	static int itmm=40;
	static boolean flag=true;
	
	@Autowired
	GenericDao genericDao;
	
	//@PostConstruct
	public void testing(){
		File excel = new File("C:\\Users\\husenaiah\\Desktop\\uuu.xls");
		FileInputStream  ex = null;
		Workbook workbook = null;
		try {
			ex = new FileInputStream(excel);
			InputStream inputStream =
				      new FileInputStream("C:\\Users\\husenaiah\\Desktop\\RealTest.xls");
			workbook = WorkbookFactory.create(inputStream);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Map<Double,ItemGroup_1492004844155> itemgropmm=new HashMap<Double,ItemGroup_1492004844155>();
		Map<Double,ItemSubgrp_184> itemsubgroptt=new HashMap<Double,ItemSubgrp_184>();
		Map<Double,ItemSubSubGrp_185> itemsubsubgroptt=new HashMap<Double,ItemSubSubGrp_185>();
		Map<String,Item_1491554208887> itemdetails=new HashMap<String,Item_1491554208887>();
		for(int z=0;z<=25;z++){
			
			
			Sheet sheet = workbook.getSheetAt(z);
			String sheetname=	workbook.getSheetName(z);
			System.out.println("sheet no       "+0);
			System.out.println("sheet name      "+sheetname);
			
			
			int lastrownumber=0;
	
		lastrownumber=sheet.getLastRowNum();
		
		itemgropmm.clear();
		for(int i=1;i<=lastrownumber;i++){
	 
		System.out.println("row number       "+i);
		System.out.println("sheet no       "+z);
		System.out.println("sheet name      "+sheetname);
		HSSFRow row = (HSSFRow) sheet.getRow(i);
		HSSFCell cell=row.getCell(1);
		HSSFCell cell2=row.getCell(2);
	
	
		String itemgroupcode=null;
		try{
			itemgroupcode=cell.getStringCellValue();
		}catch(Exception e){
			itemgroupcode=String.valueOf(cell.getNumericCellValue());
		}
		/*if(itemgroupcode.isEmpty() || itemgroupcode==null ||itemgroupcode=="" )
		{
			break;
		}*/
		Double gnumber = Double.parseDouble(itemgroupcode);
		String itemgroupName=cell2.getStringCellValue();
		int firstcol=cell.getColumnIndex();
		int secondcol=cell2.getColumnIndex();
		System.out.println("first col number       "+firstcol);
		System.out.println("second col number       "+secondcol);
		//--------------------------------------------------------------------------------------------
		//ItemGroup
		if(!itemgropmm.containsKey(gnumber))
		{
			igc++;
			String p=Integer.toString(igc);
			itemgroupcode=Double.toString(gnumber);
			String a[]=itemgroupcode.split("\\.");
			ItemGroup_1492004844155 itemg=new ItemGroup_1492004844155();
			itemg.setId(p);
			itemg.setItemGroupCode(a[0]);
			itemg.setItemGroupName(itemgroupName);
			try {
			Object kk=genericDao.save(itemg);
			} catch (ApplicationSQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			itemgropmm.put(gnumber, itemg);
			itemsubgroptt.clear();
			itemsubsubgroptt.clear();
			itemdetails.clear();
			
			 igc = Integer.parseInt(p);
		}
		//----------------------------------------------------------------------------------------------------
		HSSFCell cell3=row.getCell(3);
		HSSFCell cell4=row.getCell(4);
		String itemsubgroupcode=null;
		try{
		 itemsubgroupcode=cell3.getStringCellValue();
		}catch(Exception e){
			itemsubgroupcode=String.valueOf(cell3.getNumericCellValue());
			
		}
		String itemsubgroupName=cell4.getStringCellValue();
		
		Double ggnumber = Double.parseDouble(itemsubgroupcode);
		
		
		int third=cell3.getColumnIndex();
		int fourcol=cell4.getColumnIndex();
		System.out.println("third col number       "+third);
		System.out.println("four col number       "+fourcol);
		//ItemSubGroup
		if(!itemsubgroptt.containsKey(ggnumber))
		{
			isubgc++;
			itemsubgroupcode=Double.toString(ggnumber);
			String l=Integer.toString(isubgc);
			String igcc=Integer.toString(igc);
			String a[]=itemsubgroupcode.split("\\.");
			ItemSubgrp_184 itemsub=new ItemSubgrp_184();
			itemsub.setId(l);
			itemsub.setItemSubCode(a[0]);
			itemsub.setItemSubName(itemsubgroupName);
			itemsub.setItemGroupId(igcc);
			itemsubgroptt.put(ggnumber, itemsub);
			
		
			
			try {
				genericDao.save(itemsub);
			} catch (ApplicationSQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			isubgc = Integer.parseInt(l);
			itemsubsubgroptt.clear();
			itemdetails.clear();
			
		}
		//-----------------------------------------------------------------------------------------------
		
		HSSFCell cell5=row.getCell(5);
		HSSFCell cell6=row.getCell(6);
		
		String itemsubsubgroupcode=null;
		try{
			itemsubsubgroupcode=cell5.getStringCellValue();
		}catch(Exception e){
			itemsubsubgroupcode=String.valueOf(cell5.getNumericCellValue());
		}
		Double gggnumber = Double.parseDouble(itemsubsubgroupcode);
		
		int fifth=cell5.getColumnIndex();
		int six=cell6.getColumnIndex();
		System.out.println("fifth col number       "+fifth);
		System.out.println("six col number       "+six);
		 //itemsubsubgroupcode=cell5.getStringCellValue();
		String itemsubsubgroupName=cell6.getStringCellValue();
		
		//ItemSubSubGroup
		if(!itemsubsubgroptt.containsKey(gggnumber) )
		{ 
			isubsubgcounter++;
			itemsubsubgroupcode=Double.toString(gggnumber);
			String a[]=itemsubsubgroupcode.split("\\.");
			String m=Integer.toString(isubsubgcounter);
			String ll=Integer.toString(isubgc);
			ItemSubSubGrp_185 itemsubsub=new  ItemSubSubGrp_185();
			itemsubsub.setId(m);
			itemsubsub.setItemSubSubCode(a[0]);
			itemsubsub.setItemSubSubName(itemsubsubgroupName);
			itemsubsub.setItemSubGroupId(ll);
			itemsubsubgroptt.put(gggnumber, itemsubsub);
			isubsubgcounter = Integer.parseInt(m);
			
			try {
				genericDao.save(itemsubsub);
			} catch (ApplicationSQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			itemdetails.clear();
		}
		//-----------------------------------------------------------------------------------------------
		
		HSSFCell cell8=row.getCell(8);
		HSSFCell cell9=row.getCell(9);
		
		String itemcode=null;
		try{
			itemcode=cell8.getStringCellValue();
		}catch(Exception e){
			itemcode=String.valueOf(cell8.getNumericCellValue());
		}
		
		
		String itemcode1=itemcode.trim();
		String itempName=cell9.getStringCellValue();
		int eight=cell8.getColumnIndex();
		int nine=cell9.getColumnIndex();
		System.out.println("eight col number       "+eight);
		System.out.println("nine col number       "+nine);
		//int zzzz = Integer.parseInt(itemcode);
		//Double itemgroupcodecode = (double) Integer.parseInt(itemgroupcode);
		//double itemcodea = (double) zzzz;
       //Item
		if(!itemdetails.containsKey(itemcode1) )
		{
			
			itmm++;
			String igcc=Integer.toString(igc);
			String m=Integer.toString(isubgc);
			String n=Integer.toString(itmm);
			String oo=Integer.toString(isubsubgcounter);
			
			Item_1491554208887 itemk =new Item_1491554208887();
			
			itemk.setId(n);
			itemk.setItemCode(itemcode1);
			itemk.setItemName(itempName);
			itemk.setItemGroupId(igcc);
			itemk.setItemSubGroupId(m);
			itemk.setItemSubSubGroupId(oo);
			itemdetails.put(itemcode1, itemk);
		
			itmm = Integer.parseInt(n);
			
			try {
				genericDao.save(itemk);
			} catch (ApplicationSQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	}
}

