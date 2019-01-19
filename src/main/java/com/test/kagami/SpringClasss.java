/*package com.test.kagami;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.bcv.kagami.core.databinder.repository.GenericDao;
import com.bcv.kagami.core.databinder.repository.GenericDaoImpl;

@Service
//this class is for fetching ids from data base for migratation woking code
public class SpringClasss {

	static int igc=40;
	static int isubgc=00;
	static int isubsubgcounter=00;
	static int itmm=00;
	static boolean flag=true;
	
	@Autowired
	GenericDao genericDao;
	
	
	@Autowired
	GenericDaoImpl GenericDaoImpl;
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	// @PostConstruct
	public void testing(){
		File excel = new File("C:\\Users\\hgandh\\Desktop\\newUpdate.xlsx");
		FileInputStream  ex = null;
		Workbook workbook = null;
		try {
			ex = new FileInputStream(excel);
			InputStream inputStream =
				      new FileInputStream("C:\\Users\\hgandh\\Desktop\\newUpdate.xlsx");
			workbook = WorkbookFactory.create(inputStream);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			Sheet sheetwrite = workbook.createSheet("itemconversionids");
			
			Sheet sheet = workbook.getSheetAt(1);
			String sheetname=	workbook.getSheetName(1);
			System.out.println("sheet no       "+0);
			System.out.println("sheet name      "+sheetname);
			int lastrownumber=0;
	
		   lastrownumber=sheet.getLastRowNum();
		 
		   
		   for(int i=1;i<=lastrownumber;i++){
			   
			   System.out.println("row number       "+i);
				System.out.println("sheet no       "+1);
				System.out.println("sheet name      "+sheetname);
				
				Row row = sheet.getRow(i);
				//org.apache.poi.xssf.usermodel.XSSFRow cannot be cast to org.apache.poi.hssf.usermodel.HSSFRow
				
				row.getCell(0).setCellType(CellType.STRING);
				Cell cell0=row.getCell(0);
				//Cell cell0=row.getCell(0);     //itemcode
				Double fconn=cell0.getNumericCellValue();
			
			
				String fcon=String.valueOf(fconn);
				
				String contactinfo[]=fcon.split("\\.");
				Cell cell1=row.getCell(2);      //nos
				System.out.println(cell0.getStringCellValue()+"~~"+cell1.getStringCellValue());
				System.out.println("totalcount"+i);
				//int j=0;
			  	List<Map<String, Object>> allUsers = jdbcTemplate.queryForList("select itemuomconversion_1339.id as id from itemuomconversion_1339 inner join item_416 on itemuomconversion_1339.itemid=item_416.id where uomname='"+cell1.getStringCellValue()+"' and itemcode='"+cell0.getStringCellValue()+"'");
				//List<Map<String, Object>> allUsers = jdbcTemplate.queryForList("select rep_name as id from report_master");
				for (Map<String, Object> row1 : allUsers) {
			        if(row1.get("id")!=null) {
			        	//user.add(row1.get("id").toString());
			        Row roww = sheetwrite.createRow(i);
			      
			        Cell celll =  roww.createCell(0);
				    celll.setCellValue(row1.get("id").toString());
			        }
			        //user.add(row.get("user")!=null?row.get("user").toString():"");
			    }  
				

				
				
			}
				
				FileOutputStream fos;
				try {
					fos = new FileOutputStream(new File("C:\\Users\\hgandh\\Desktop\\newUpdate.xlsx"));
					  workbook.write(fos);
					    fos.close();
					    System.out.println("created");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			
		

	}*/